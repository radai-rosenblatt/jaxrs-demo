package net.radai.jaxrsdemo.rest.impl;

import net.radai.jaxrsdemo.rest.api.GreetService;

public class GreetServiceImpl implements GreetService {
    
    @Override
    public String sayHi(String name) {
        if (name == null || name.isEmpty()) {
            return "Hi there";
        }
        return "Hello, " + name;
    }
}
