package com.example.mvp;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface LoginService {
    @POST("/byc_app_api_v1/login_byc.php")
    Call<LoginResponse> userLogin(@Header("App-Authorization") String AppAuth, @Body RequestBody requestBody);
}
