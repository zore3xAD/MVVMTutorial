package com.example.mvvmtutorial.util

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.mvvmtutorial.util.entension.getParentActivity


@BindingAdapter("mutableVisibility")
fun setMutableVisibility(view: View, visibility: MutableLiveData<Int>?) {
    view.getParentActivity()?.let { parentActivity ->
        visibility?.let { visiblility ->
            visiblility.observe(parentActivity, Observer { value ->
                view.visibility = value ?: View.VISIBLE
            })
        }
    }
}