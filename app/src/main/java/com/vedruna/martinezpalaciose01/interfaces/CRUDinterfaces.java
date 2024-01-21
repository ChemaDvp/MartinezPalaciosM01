package com.vedruna.martinezpalaciose01.interfaces;

import com.vedruna.martinezpalaciose01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDinterfaces {

    @GET("product")
    Call<List<Product>> getALL();
}
