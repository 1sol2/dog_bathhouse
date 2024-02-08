package com.management.member.model.dto;

public class MemberDTO {

    private int membCode;
    private String membName;
    private String membPhone;
    private String membId;
    private String membPass;

    public MemberDTO() {
    }

    public MemberDTO(int membCode, String membName, String membPhone, String membId, String membPass) {
        this.membCode = membCode;
        this.membName = membName;
        this.membPhone = membPhone;
        this.membId = membId;
        this.membPass = membPass;
    }

    public int getMembCode() {
        return membCode;
    }

    public void setMembCode(int membCode) {
        this.membCode = membCode;
    }

    public String getMembName() {
        return membName;
    }

    public void setMembName(String membName) {
        this.membName = membName;
    }

    public String getMembPhone() {
        return membPhone;
    }

    public void setMembPhone(String membPhone) {
        this.membPhone = membPhone;
    }

    public String getMembId() {
        return membId;
    }

    public void setMembId(String membId) {
        this.membId = membId;
    }

    public String getMembPass() {
        return membPass;
    }

    public void setMembPass(String membPass) {
        this.membPass = membPass;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "membCode=" + membCode +
                ", membName='" + membName + '\'' +
                ", membPhone='" + membPhone + '\'' +
                ", membId='" + membId + '\'' +
                ", membPass='" + membPass + '\'' +
                '}';
    }

}
