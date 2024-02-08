package com.management.payment.model.dto;


import java.time.LocalDateTime;

public class PaymentDTO {
    private int payCode;
    private String payKind;
    private LocalDateTime payDate;
    private int membCode;

    public PaymentDTO() {
    }

    public PaymentDTO(int payCode, String payKind, LocalDateTime payDate, int membCode) {
        this.payCode = payCode;
        this.payKind = payKind;
        this.payDate = payDate;
        this.membCode = membCode;
    }

    public int getPayCode() {
        return payCode;
    }

    public void setPayCode(int payCode) {
        this.payCode = payCode;
    }

    public String getPayKind() {
        return payKind;
    }

    public void setPayKind(String payKind) {
        this.payKind = payKind;
    }

    public LocalDateTime getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }

    public int getMembCode() {
        return membCode;
    }

    public void setMembCode(int membCode) {
        this.membCode = membCode;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "payCode=" + payCode +
                ", payKind='" + payKind + '\'' +
                ", payDate=" + payDate +
                ", membCode=" + membCode +
                '}';
    }
}
