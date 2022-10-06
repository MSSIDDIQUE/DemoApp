package com.baymax.demoapp.utils

import com.baymax.demoapp.data.Result

object MappersUtils {

    // Non-nullable to Non-nullable
    inline fun <I, O> mapList(input: List<I>, mapSingle: (I) -> O): List<O> {
        return input.map { mapSingle(it) }
    }

    // Nullable to Non-nullable
    inline fun <I, O> mapNullInputList(input: List<I>?, mapSingle: (I) -> O): List<O> {
        return input?.map { mapSingle(it) } ?: emptyList()
    }

    // Non-nullable to Nullable
    inline fun <I, O> mapNullOutputList(input: List<I>, mapSingle: (I) -> O): List<O>? {
        return if (input.isEmpty()) null else input.map { mapSingle(it) }
    }

    inline fun <reified T, reified R> Result<T>.map(transform: (T) -> R): Result<R> {
        return when (this) {
            is Result.Success -> Result.Success(transform(data))
            is Result.Failure -> Result.Failure(msg)
        }
    }
}