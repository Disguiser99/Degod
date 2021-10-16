package com.disguiser.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.disguiser.degod.Degod

class MainActivity : AppCompatActivity() {

    private val TAG = "rawTAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testLog()
    }

    private fun testLog() {
        Log.e(TAG, "start record raw")
        val testTag = "testTag"
        val hello = "hello"
        val world = "world"
        val testString = "testStringEntry"
        val testString2 = "testStringEntry2"
        val testString3 = "testStringEntry3, %s"
        Degod.eM("start record")
        Degod.tag(testTag).e("start record with testTag")
        Degod.e(testString, testString2, testString3)
        Degod.eM("start record %s", hello, world)
        Degod.eM("start record %s %s", hello, world)
        Degod.setLoggable(false)
        Degod.e("start record after unLoggable")
    }
}