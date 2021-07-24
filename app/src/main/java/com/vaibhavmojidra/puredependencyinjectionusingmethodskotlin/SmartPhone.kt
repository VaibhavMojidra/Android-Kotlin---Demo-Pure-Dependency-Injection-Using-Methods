package com.vaibhavmojidra.puredependencyinjectionusingmethodskotlin

import android.util.Log

class SmartPhone {
    private lateinit var battery:Battery
    private lateinit var memoryCard:MemoryCard
    private lateinit var simCard:SimCard

    fun setBattery(battery: Battery){
        this.battery=battery
        Log.i("MyInfo","Battery initialize via method Injection")
    }

    fun setMemoryCard(memoryCard: MemoryCard){
        this.memoryCard=memoryCard
        Log.i("MyInfo","MemoryCard initialize via method Injection")
    }

    fun setSimCard(simCard: SimCard){
        this.simCard=simCard
        Log.i("MyInfo","SIM Card initialize via method Injection")
    }

    fun startCallRecording(){
        battery.getPower()
        simCard.getConnected()
        memoryCard.getSpaceAvailability()
        Log.i("MyInfo","Recording Call....")
    }
}