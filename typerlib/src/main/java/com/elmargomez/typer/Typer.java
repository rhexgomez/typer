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

package com.elmargomez.typer;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class Typer {

    private static Typer typer = null;

    private HashMap<String, Typeface> fonts = null;
    private Context context = null;

    /**
     * Initialize font storage and connect the context.
     *
     * @param context the context of the activity.
     */
    private Typer(Context context) {
        this.fonts = new HashMap<>();
        this.context = context;
    }

    /**
     * Get the singleton base method.
     *
     * @param context the context of the activity.
     * @return the Typer class for the singleton.
     */
    public static Typer set(Context context) {
        if (typer == null)
            typer = new Typer(context);
        return typer;
    }

    /**
     * Get the proper Typeface depending on the parameter
     *
     * @param font the font name
     * @return the Typeface that corresponds to the name
     */
    public Typeface getFont(String font) {
        Typeface myFont = fonts.get(font);
        if (myFont == null) {
            myFont = Typeface.createFromAsset(context.getAssets(), "fonts/" + font);
            fonts.put(font, myFont);
        }
        return myFont;
    }

}
