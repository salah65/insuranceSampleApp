package com.example.sampleinsuranceapp.data.gateway
//
//import android.content.Context
//import android.content.SharedPreferences
//
//
//val preferencesGateway by lazy { PreferencesGateway() }
//
//const val PREFERENCES_NAME = "PREFERENCES_NAME"
//
//class PreferencesGateway {
//
//    inline fun <reified T : Any> save(key: String, value: T) {
//        DomainIntegration.getApplication()
//            .getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
//            .edit()
//            .apply { putValue(key, value) }
//            .apply()
//
//
//    }
//
//    inline fun <reified T : Any> SharedPreferences.Editor.putValue(
//        key: String,
//        value: T
//    ) {
//        when (T::class) {
//            Boolean::class -> putBoolean(key, value as Boolean)
//            Int::class -> putInt(key, value as Int)
//            Long::class -> putLong(key, value as Long)
//            Float::class -> putFloat(key, value as Float)
//            String::class -> putString(key, value as String)
//            else -> throw UnsupportedOperationException("not supported preferences type")
//        }
//    }
//
//    inline fun <reified T : Any> load(key: String, defaultValue: T): T? {
//        return DomainIntegration.getApplication()
//            .getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
//            .run { getValue(key, defaultValue) }
//
//    }
//
//    inline fun <reified T : Any> SharedPreferences.getValue(
//        key: String,
//        defaultValue: T
//    ): T {
//        return when (T::class) {
//            Boolean::class -> getBoolean(key, defaultValue as Boolean) as T
//            Int::class -> getInt(key, defaultValue as Int) as T
//            Long::class -> getLong(key, defaultValue as Long) as T
//            Float::class -> getFloat(key, defaultValue as Float) as T
//            String::class -> getString(key, defaultValue as String) as T
//            else -> throw UnsupportedOperationException("not supported preferences type")
//        }
//    }
//
//    fun isSaved(key: String): Boolean {
//        return DomainIntegration.getApplication()
//            .getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
//            .contains(key)
//    }
//
//    fun remove(key: String) {
//        DomainIntegration.getApplication()
//            .getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
//            .edit()
//            .remove(key)
//            .apply()
//
//    }
//}
//
//
//
//
