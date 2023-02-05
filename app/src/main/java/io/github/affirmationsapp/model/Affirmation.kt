package io.github.affirmationsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val resourceId: Int, @DrawableRes val imageId: Int)
