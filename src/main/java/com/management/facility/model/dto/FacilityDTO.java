package com.management.facility.model.dto;

public class FacilityDTO {

    private int facilityCode;
    private String facilityKind;
    private String facilityInfo;
    private String facilityGuide;
    private int facilityPrice;

    public FacilityDTO() {
    }

    public FacilityDTO(int facilityCode, String facilityKind, String facilityInfo, String facilityGuide, int facilityPrice) {
        this.facilityCode = facilityCode;
        this.facilityKind = facilityKind;
        this.facilityInfo = facilityInfo;
        this.facilityGuide = facilityGuide;
        this.facilityPrice = facilityPrice;
    }

    public int getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(int facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getFacilityKind() {
        return facilityKind;
    }

    public void setFacilityKind(String facilityKind) {
        this.facilityKind = facilityKind;
    }

    public String getFacilityInfo() {
        return facilityInfo;
    }

    public void setFacilityInfo(String facilityInfo) {
        this.facilityInfo = facilityInfo;
    }

    public String getFacilityGuide() {
        return facilityGuide;
    }

    public void setFacilityGuide(String facilityGuide) {
        this.facilityGuide = facilityGuide;
    }

    public int getFacilityPrice() {
        return facilityPrice;
    }

    public void setFacilityPrice(int facilityPrice) {
        this.facilityPrice = facilityPrice;
    }

    @Override
    public String toString() {
        return "FacilityDTO{" +
                "facilityCode=" + facilityCode +
                ", facilityKind='" + facilityKind + '\'' +
                ", facilityInfo='" + facilityInfo + '\'' +
                ", facilityGuide='" + facilityGuide + '\'' +
                ", facilityPrice=" + facilityPrice +
                '}';
    }

}
