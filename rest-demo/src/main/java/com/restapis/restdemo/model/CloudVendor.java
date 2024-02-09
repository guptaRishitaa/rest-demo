package com.restapis.restdemo.model;

public class CloudVendor {


    private  String cloudVendorId;
    private String cloudVendorName;
    private  String cloudVendorAddress;
    private String cloudVendorNumber;


    public CloudVendor(String cloudVendorId, String cloudVendorName, String cloudVendorAddress, String cloudVendorNumber) {
        this.cloudVendorId = cloudVendorId;
        this.cloudVendorName = cloudVendorName;
        this.cloudVendorAddress = cloudVendorAddress;
        this.cloudVendorNumber = cloudVendorNumber;
    }

    public CloudVendor() {
    }

    public String getCloudVendorId() {
        return cloudVendorId;
    }

    public void setCloudVendorId(String cloudVendorId) {
        this.cloudVendorId = cloudVendorId;
    }

    public String getCloudVendorName() {
        return cloudVendorName;
    }

    public void setCloudVendorName(String cloudVendorName) {
        this.cloudVendorName = cloudVendorName;
    }

    public String getCloudVendorAddress() {
        return cloudVendorAddress;
    }

    public void setCloudVendorAddress(String cloudVendorAddress) {
        this.cloudVendorAddress = cloudVendorAddress;
    }

    public String getCloudVendorNumber() {
        return cloudVendorNumber;
    }

    public void setCloudVendorNumber(String cloudVendorNumber) {
        this.cloudVendorNumber = cloudVendorNumber;
    }


}
