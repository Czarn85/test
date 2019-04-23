package com.adrian.microserhello.model;

public class License {
    private String licenseId;
    private String organizationId;
    private String productName;
    private String licenseType;
    private String comment;

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public License withLicenseId(String licenseId) {
        setLicenseId(licenseId);
        return this;
    }

    public License withOrganizationId(String organizationId) {
        setProductName(organizationId);
        return this;
    }

    public License withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    public License withComment(String comment) {
        setComment(comment);
        return this;
    }
}
