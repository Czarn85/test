package com.adrian.microserhello.services;

import com.adrian.microserhello.config.ServiceConfig;
import com.adrian.microserhello.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    ServiceConfig serviceConfig;

    public License getLicense(String organizationId, String licenseId) {
        License license = new License();
        license.withLicenseId(licenseId)
                .withOrganizationId(organizationId)
                .withComment(serviceConfig.getTracer());

        return license;
    }
}
