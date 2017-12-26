package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class  BitcoinDataModel{

    private String mPrice;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){

        try {
            BitcoinDataModel BitcoinData = new BitcoinDataModel();

            BitcoinData.mPrice = jsonObject.getString("last");

            return BitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }
}

