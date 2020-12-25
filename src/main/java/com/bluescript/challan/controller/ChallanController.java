package com.bluescript.challan.controller;

import com.bluescript.challan.entity.ChallanEntity;
import com.bluescript.challan.request.ChallanRequest;
import com.bluescript.challan.response.ChallanDeleteResponse;
import com.bluescript.challan.service.ChallanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;

@RestController
@RequestMapping("/Challan")
public class ChallanController {

    @Autowired
    ChallanService challanService;

    @PostMapping
    public ChallanEntity createChallan(@RequestBody ChallanRequest challanRequest){
        return challanService.createChallan(challanRequest);
    }

    @GetMapping("/{challanId}")
    public ChallanEntity getChallan(@PathVariable ("challanId") String challanId){
        return challanService.getChallan(challanId);
    }

    @DeleteMapping("/{challanId}")
    public ChallanDeleteResponse deleteChallan(@PathVariable ("challanId") String challanId){
        return challanService.deleteChallan(challanId);
    }

    @PutMapping("/{challanId}")
    public ChallanEntity updateChallan(@PathVariable ("challanId") String challanId, @RequestBody ChallanRequest challanRequest){
        return challanService.updateChallan(challanId,challanRequest);
    }
}
