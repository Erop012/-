package com.example.l42

import android.app.Application
import android.util.Log
import com.example.data.db.AppDatabase
import com.example.data.db.preferences.ProductSharedPreferences

class ProductApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("MyLog", "Инициализация базы данных")
        AppDatabase.initDb(applicationContext)
        ProductSharedPreferences.init(applicationContext)
        Log.d("MyLog", "База данных инициализирована")
    }
}