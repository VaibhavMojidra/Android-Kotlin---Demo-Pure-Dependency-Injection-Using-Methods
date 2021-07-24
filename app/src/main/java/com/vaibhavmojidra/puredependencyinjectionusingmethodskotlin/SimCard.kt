package com.vaibhavmojidra.puredependencyinjectionusingmethodskotlin

import android.util.Log

class SimCard {
    private lateinit var serviceProvider:ServiceProvider

    fun setServiceProvider(serviceProvider: ServiceProvider) {
        this.serviceProvider = serviceProvider
        Log.i("MyInfo","Service Provider initialize via method Injection")
    }

    fun getConnected(){
        serviceProvider.getServiceProvider()
    }
}
