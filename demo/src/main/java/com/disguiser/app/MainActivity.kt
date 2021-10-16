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
        // 直接打印字符串
        Degod.eM("start record")
        // 打印字符串与参数格式化后的结果
        Degod.eM("start record %s", hello, world)
        Degod.eM("start record %s %s", hello, world)
        // 设置自定义tag（仅被使用一次）
        Degod.tag(testTag).e("start record with testTag")
        // 打印传入的可变参数的字符串形式
        Degod.e(testString, testString2, testString3)
        // 设置是否能被打印
        Degod.setLoggable(false)
        Degod.e("start record after unLoggable")
    }
}