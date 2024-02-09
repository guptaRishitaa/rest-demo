package com.restapis.restdemo.controller;

import com.restapis.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//                        ("C1", "Vendor 1",
//                        "Address 1", "xxxx");

    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Successfully created";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Successfully updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){

        this.cloudVendor=null;
        return "Cloud Vendor Successfully deleted";
    }
}
