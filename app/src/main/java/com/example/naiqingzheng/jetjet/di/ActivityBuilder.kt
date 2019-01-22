package com.example.naiqingzheng.jetjet.di

import com.example.naiqingzheng.jetjet.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

}