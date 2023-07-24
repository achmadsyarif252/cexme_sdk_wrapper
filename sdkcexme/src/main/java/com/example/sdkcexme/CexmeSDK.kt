package com.example.sdkcexme

class CexmeSDK {
    private val cexmeSDK: CexmeAbstraction = CexmeAbstraction()

    fun connect(mac: String) {
        cexmeSDK.connect(mac)
    }
}

