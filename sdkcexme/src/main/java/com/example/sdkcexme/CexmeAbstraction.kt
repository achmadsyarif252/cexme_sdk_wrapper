package com.example.sdkcexme

import com.yucheng.ycbtsdk.Constants
import com.yucheng.ycbtsdk.YCBTClient

class CexmeAbstraction : ICexmeInterfaceSDK {
    override fun connect(mac: String) {
        YCBTClient.connectBle(mac) { code ->

            when (code) {
                Constants.CODE.Code_OK -> {

                }

                Constants.CODE.Code_TimeOut -> {

                }

                Constants.CODE.Code_Failed -> {

                }

                else -> {}
            }
        }
    }

}