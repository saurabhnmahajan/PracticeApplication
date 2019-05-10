package com.saurabh.latestapplication.di

import com.saurabh.latestapplication.model.CountriesService
import com.saurabh.latestapplication.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}