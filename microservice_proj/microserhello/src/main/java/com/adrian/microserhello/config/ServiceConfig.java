package com.adrian.microserhello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${tracer.property}")
    private String tracer;

    public String getTracer() {
        return tracer;
    }
}
