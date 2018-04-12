package net.radai.metrics;

import io.prometheus.client.hotspot.DefaultExports;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PrometheusInitListener implements ServletContextListener {
    private final static Logger logger = LogManager.getLogger(PrometheusInitListener.class);
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DefaultExports.initialize();
        logger.info("default prometheus exports initialized");
    }
}
