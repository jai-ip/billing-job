package com.example.billing_job.dto;


public class BillingData {

    private int dataYear;
    private int dataMonth;
    private int accountId;
    private String phoneNumber;
    private float dataUsage;
    private int callDuration;
    private int smsCount;

    public BillingData() {
    }

    public BillingData(int dataYear, int dataMonth, int accountId, String phoneNumber, float dataUsage, int callDuration, int smsCount) {
        this.dataYear = dataYear;
        this.dataMonth = dataMonth;
        this.accountId = accountId;
        this.phoneNumber = phoneNumber;
        this.dataUsage = dataUsage;
        this.callDuration = callDuration;
        this.smsCount = smsCount;
    }

    public int getDataYear() {
        return dataYear;
    }

    public void setDataYear(int dataYear) {
        this.dataYear = dataYear;
    }

    public int getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(int dataMonth) {
        this.dataMonth = dataMonth;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(float dataUsage) {
        this.dataUsage = dataUsage;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }
}
