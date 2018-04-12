package net.radai.jaxrsdemo.rest.impl;

import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.plugins.stats.RegistryStatsResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class JaxrsDemoApplication extends Application {
    private final static Logger logger = LogManager.getLogger(JaxrsDemoApplication.class);

    @Override
    public Set<Class<?>> getClasses() {
        //this needs to exist because we annotate the interfaces only, which would usually result in 
        //"RESTEASY003190: Could not find constructor for class".
        HashSet<Class<?>> classes = new HashSet<>(Arrays.asList(
                GreetServiceImpl.class,
                //swagger support, under /api/openapi[.json|.yaml]
                OpenApiResource.class,
                AcceptHeaderOpenApiResource.class,
                //handy for debugging, under /api/resteasy/registry
                RegistryStatsResource.class  
        ));
        logger.info("instantiated");
        return classes;
    }
}
