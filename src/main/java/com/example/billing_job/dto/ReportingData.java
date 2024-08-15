package com.example.billing_job.dto;

public class ReportingData {

    private BillingData billingData;
    private double billingTotal;

    public ReportingData() {
    }

    public ReportingData(BillingData billingData, double billingTotal) {
        this.billingData = billingData;
        this.billingTotal = billingTotal;
    }

    public BillingData getBillingData() {
        return billingData;
    }

    public void setBillingData(BillingData billingData) {
        this.billingData = billingData;
    }

    public double getBillingTotal() {
        return billingTotal;
    }

    public void setBillingTotal(double billingTotal) {
        this.billingTotal = billingTotal;
    }
}