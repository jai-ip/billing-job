package com.example.billing_job.processor;

import com.example.billing_job.dto.BillingData;
import com.example.billing_job.dto.ReportingData;
import com.example.billing_job.service.PricingService;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;

public class BillingDataProcessor implements ItemProcessor<BillingData, ReportingData> {

    @Value("${spring.cellular.pricing.data:0.01}")
    private float dataPricing;

    @Value("${spring.cellular.pricing.call:0.5}")
    private float callPricing;

    @Value("${spring.cellular.pricing.sms:0.1}")
    private float smsPricing;

    @Value("${spring.cellular.spending.threshold:150}")
    private float spendingThreshold;

    private final PricingService pricingService;

    public BillingDataProcessor(PricingService pricingService) {
        this.pricingService = pricingService;
    }

//    @Override
//    public ReportingData process(BillingData item) {
//        double billingTotal = item.getDataUsage() * dataPricing + item.getCallDuration() * callPricing + item.getSmsCount() * smsPricing;
//        if (billingTotal < spendingThreshold) {
//            return null;
//        }
//        return new ReportingData(item, billingTotal);
//    }


    @Override
    public ReportingData process(BillingData item) {
        double billingTotal =
                item.getDataUsage() * pricingService.getDataPricing() +
                        item.getCallDuration() * pricingService.getCallPricing() +
                        item.getSmsCount() * pricingService.getSmsPricing();
        if (billingTotal < spendingThreshold) {
            return null;
        }
        return new ReportingData(item, billingTotal);
    }
}
