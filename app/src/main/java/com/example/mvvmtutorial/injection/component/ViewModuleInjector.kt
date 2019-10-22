package com.example.mvvmtutorial.injection.component

import com.example.mvvmtutorial.injection.module.NetworkModule
import com.example.mvvmtutorial.ui.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModuleInjector {
    
    fun inject(postListViewModel: PostListViewModel)
    
    
    @Component.Builder
    interface Builder {
        fun build(): ViewModuleInjector
        
        fun networkModule(networkModule: NetworkModule): Builder
    }
}