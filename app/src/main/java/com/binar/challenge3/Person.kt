package com.binar.challenge3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name : String="",
    val age : Int=0,
    val address : String="",
    val job : String=""
):Parcelable
