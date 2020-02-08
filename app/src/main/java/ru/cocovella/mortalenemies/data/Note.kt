package ru.cocovella.mortalenemies.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
data class Note(
        val id: String = "",
        val title: String = "",
        val body: String = "",
        val color: Color = Color.PINK,
        val lastChanged: Date = Date()
    ) : Parcelable
    {
        override fun equals(other: Any?): Boolean {
            if(this === other) return true
            if(javaClass != other?.javaClass) return false
            other as Note
            if(id != other.id) return false
            return true
        }

        override fun hashCode(): Int = id.hashCode()


        enum class Color {
            WHITE,
            YELLOW,
            GREEN,
            BLUE,
            RED,
            VIOLET,
            PINK,
            ORANGE
        }

    }