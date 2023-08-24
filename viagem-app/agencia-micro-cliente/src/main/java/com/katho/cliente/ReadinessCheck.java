package com.katho.cliente;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        if (Cliente.findAll() == null) {
            return HealthCheckResponse.down("I'm not a ready - Cliente...");
        } else {
            return HealthCheckResponse.up("I'm Ready - Cliente...");
        }
    }

}