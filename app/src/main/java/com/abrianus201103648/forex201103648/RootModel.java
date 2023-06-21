package com.abrianus201103648.forex201103648;

import com.google.gson.annotations.SerializedName;

public class RootModel
{
    @SerializedName("rates")
    private RatesModel ratesModel;
    public RootModel() {}
    public RatesModel getRatesModel() { return ratesModel; }
    public void setRatesModel (RatesModel ratesModel) { this.ratesModel = ratesModel; }
}
