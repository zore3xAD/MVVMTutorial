package com.example.mvvmtutorial.ui

import androidx.lifecycle.MutableLiveData
import com.example.mvvmtutorial.model.Post

class PostViewModel {

    private val postTitle: MutableLiveData<String> = MutableLiveData()
    private val postBody: MutableLiveData<String> = MutableLiveData()

    fun bind(post: Post) {
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle() = postTitle

    fun getPostBody() = postBody

}