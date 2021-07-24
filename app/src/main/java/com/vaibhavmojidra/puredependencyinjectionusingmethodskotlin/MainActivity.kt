package com.vaibhavmojidra.puredependencyinjectionusingmethodskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val simCard=SimCard()
        simCard.setServiceProvider(ServiceProvider())
        val smartPhone=SmartPhone()
        smartPhone.setBattery(Battery()) //Dependency Injection via methods
        smartPhone.setMemoryCard(MemoryCard())
        smartPhone.setSimCard(simCard)
        smartPhone.startCallRecording()
    }
}