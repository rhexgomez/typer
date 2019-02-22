/*
 * Copyright 2015 Rhex Gomez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rhexgomez.typer.roboto.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elmargomez.myapplication.R
import com.rhexgomez.typer.roboto.TyperRoboto
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AppCompatTextView
        regular_textview.apply { typeface = TyperRoboto.ROBOTO_REGULAR }
        italic_textview.apply { typeface = TyperRoboto.ROBOTO_ITALIC }
        bold_textview.apply { typeface = TyperRoboto.ROBOTO_BOLD }
        thin_textview.apply { typeface = TyperRoboto.ROBOTO_THIN }

        // AppCompatEditText
        regular_edittext.apply { typeface = TyperRoboto.ROBOTO_REGULAR }
        italic_edittext.apply { typeface = TyperRoboto.ROBOTO_ITALIC }
        bold_edittext.apply { typeface = TyperRoboto.ROBOTO_BOLD }
        thin_edittext.apply { typeface = TyperRoboto.ROBOTO_THIN }
    }
}
