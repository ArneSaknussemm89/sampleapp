package com.example.sampleapp

import io.flutter.app.FlutterApplication

class CustomFlutterApplication : FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
        val invocationEvents: ArrayList<String> = ArrayList()
        invocationEvents.add(InstabugFlutterPlugin.INVOCATION_EVENT_SHAKE)
        InstabugFlutterPlugin().start(this@CustomFlutterApplication, "APP_TOKEN", invocationEvents)
    }
}