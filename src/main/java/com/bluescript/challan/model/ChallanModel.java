package com.bluescript.challan.model;

public class ChallanModel {

    private String challanId;
    private long subChallanNumber;
    private String projectId;
    private String purchaseOrderId;
    private  String inventoryId;
    private String receiverId;
    private String transportationId;

    public ChallanModel() {
    }

    public ChallanModel(String challanId, long subChallanNumber, String projectId, String purchaseOrderId, String inventoryId, String receiverId, String transportationId) {
        this.challanId = challanId;
        this.subChallanNumber = subChallanNumber;
        this.projectId = projectId;
        this.purchaseOrderId = purchaseOrderId;
        this.inventoryId = inventoryId;
        this.receiverId = receiverId;
        this.transportationId = transportationId;
    }

    public String getChallanId() {
        return challanId;
    }

    public void setChallanId(String challanId) {
        this.challanId = challanId;
    }

    public long getSubChallanNumber() {
        return subChallanNumber;
    }

    public void setSubChallanNumber(long subChallanNumber) {
        this.subChallanNumber = subChallanNumber;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }
}
