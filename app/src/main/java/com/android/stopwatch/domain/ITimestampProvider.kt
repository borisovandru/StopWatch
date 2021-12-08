package com.android.stopwatch.domain

interface ITimestampProvider {
    fun getMilliseconds(): Long
}