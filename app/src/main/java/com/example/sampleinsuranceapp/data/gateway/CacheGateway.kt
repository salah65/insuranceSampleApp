package com.example.sampleinsuranceapp.data.gateway


//---------- cache values and objects in a HashMap instead of passing them form screen to another

val cacheGateway by lazy { CacheGateway() }

class CacheGateway {

    private val data = HashMap<Any, Any>()

    fun <T : Any> save(key: Any, value: T) {
        data[key] = value
    }


    fun <T : Any> load(key: Any): T? {
        return data[key] as T?
    }

    fun <T : Any> remove(key: Any, value: T) {
        data.remove(key)
    }


}