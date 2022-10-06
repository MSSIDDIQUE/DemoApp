package com.baymax.demoapp.api

import retrofit2.Response
import com.baymax.demoapp.data.Result

abstract class BaseDataSource {
    suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return Result.Success(body)
            }
            return Result.Failure(response.code().toString())
        } catch (e: Exception) {
            return Result.Failure("Something went wrong")
        }
    }
}