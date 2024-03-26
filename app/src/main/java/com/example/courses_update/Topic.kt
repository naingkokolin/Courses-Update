package com.example.courses_update

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val availableCourse: Int,
    @DrawableRes val imageResource: Int
)
