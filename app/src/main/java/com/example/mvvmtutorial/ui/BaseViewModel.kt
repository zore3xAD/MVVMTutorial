package com.example.mvvmtutorial.ui

import androidx.lifecycle.ViewModel
import com.example.mvvmtutorial.injection.component.DaggerViewModuleInjector
import com.example.mvvmtutorial.injection.module.NetworkModule

abstract class BaseViewModel: ViewModel() {

    private val injector = DaggerViewModuleInjector.builder()
        .networkModule(NetworkModule)
        .build()


    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}
