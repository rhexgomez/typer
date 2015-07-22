/*
* Copyright 2015 Elmar Rhex Gomez.
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

package io.github.typer;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class Typer {

    private HashMap<String, Typeface> fonts = null;
    private static Typer typer = null;

    private Typer() {
        fonts = new HashMap<>();
    }

    public static Typer f() {
        if (typer == null)
            typer = new Typer();
        return typer;
    }

    public Typeface getFont(Context context, String font) {
        Typeface myFont = fonts.get(font);
        if (myFont == null) {
            myFont = Typeface.createFromAsset(context.getAssets(), "fonts/" + font);
            fonts.put(font, myFont);
        }
        return myFont;
    }

}
