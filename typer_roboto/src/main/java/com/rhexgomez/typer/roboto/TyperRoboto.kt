/*
 * Copyright 2015 Elmar Rhex Gomez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rhexgomez.typer.roboto

import android.support.v4.content.res.ResourcesCompat
import com.rhexgomez.typer.common.TyperProvider

/**
 * A collection of lazy loaded Roboto fonts.
 */
object TyperRoboto {

    @JvmStatic
    @get:JvmName("ROBOTO_BOLD")
    val ROBOTO_BOLD by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_bold)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_BOLD_ITALIC")
    val ROBOTO_BOLD_ITALIC by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_bold_italic)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_ITALIC")
    val ROBOTO_ITALIC by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_italic)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_LIGHT")
    val ROBOTO_LIGHT by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_light)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_LIGHT_ITALIC")
    val ROBOTO_LIGHT_ITALIC by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_light_italic)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_REGULAR")
    val ROBOTO_REGULAR by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_regular)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_THIN")
    val ROBOTO_THIN by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_thin)!!
    }

    @JvmStatic
    @get:JvmName("ROBOTO_THIN_ITALIC")
    val ROBOTO_THIN_ITALIC by lazy {
        ResourcesCompat.getFont(TyperProvider.globalContext, R.font.typer_roboto_thin_italic)!!
    }

}

