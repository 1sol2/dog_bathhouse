package com.management.use.model.dto;


import java.time.LocalDateTime;

public class UseDTO {

    private int useCode;
    private LocalDateTime useDate;
    private int payCode;
    private int facilityCode;

    public UseDTO() {
    }

    public UseDTO(int useCode, LocalDateTime useDate, int payCode, int facilityCode) {
        this.useCode = useCode;
        this.useDate = useDate;
        this.payCode = payCode;
        this.facilityCode = facilityCode;
    }

    public int getUseCode() {
        return useCode;
    }

    public void setUseCode(int useCode) {
        this.useCode = useCode;
    }

    public LocalDateTime getUseDate() {
        return useDate;
    }

    public void setUseDate(LocalDateTime useDate) {
        this.useDate = useDate;
    }

    public int getPayCode() {
        return payCode;
    }

    public void setPayCode(int payCode) {
        this.payCode = payCode;
    }

    public int getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(int facilityCode) {
        this.facilityCode = facilityCode;
    }

    @Override
    public String toString() {
        return "UseDTO{" +
                "useCode=" + useCode +
                ", useDate=" + useDate +
                ", payCode=" + payCode +
                ", facilityCode=" + facilityCode +
                '}';
    }
}
