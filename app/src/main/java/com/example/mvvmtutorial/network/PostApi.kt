package com.example.mvvmtutorial.network

import com.example.mvvmtutorial.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>

}