package me.pranay.kotlinmvvm.repository.firstFragmentRepository

import me.pranay.kotlinmvvm.helper.AppExecutors
import javax.inject.Inject

class FirstFragmentRepositoryImpl @Inject constructor(var appExecutors: AppExecutors):FirstFragmentRepository{

    override fun getToastString()="This is second fragment"

}