package com.example.latihanapi_10119217;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
// Nama     : Tiyo Haryo Subaktiono
// Kelas    : IF 6
// Tanggal pengerjaan : 8 Juli 2022
public interface JSONPlaceholder {
    @GET("/api/games/pc?page=2")
    Call<List<Post>> getPost();
}
