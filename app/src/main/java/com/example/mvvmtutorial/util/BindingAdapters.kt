package com.example.mvvmtutorial.util

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
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

@BindingAdapter("mutableText")
fun setMutableText(view: TextView, text: MutableLiveData<String>?) {
    view.getParentActivity()?.let { parentActivity ->
        text?.let { txt ->
            txt.observe(parentActivity, Observer { value -> view.text = value?: "" })
        }
    }
}

@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    view.adapter = adapter
}