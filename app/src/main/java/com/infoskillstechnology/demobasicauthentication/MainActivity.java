/*
 * Copyright (c) 2017.  Info Skills Technology Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.infoskillstechnology.demobasicauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.infoskillstechnology.demobasicauthentication.model.Enquiry;
import com.infoskillstechnology.demobasicauthentication.model.TradeXLModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Retrofit retrofit = BasicAuthApp.getRetrofit("admin", "admin123");

        ApiService service = retrofit.create(ApiService.class);
        Call<TradeXLModel> tradeXLModelCall = service.getData();
        tradeXLModelCall.enqueue(new Callback<TradeXLModel>() {
            @Override
            public void onResponse(Call<TradeXLModel> call, Response<TradeXLModel> response) {
                if (response.body() != null) {
                    TradeXLModel tradeXLModel = response.body();
                    assert tradeXLModel != null;
                    List<Enquiry> enquiryList = tradeXLModel.getEnquiries();
                    for (Enquiry enquiry : enquiryList) {
                        Log.d("TAG", enquiry.getCity());
                    }
                }
            }

            @Override
            public void onFailure(Call<TradeXLModel> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
