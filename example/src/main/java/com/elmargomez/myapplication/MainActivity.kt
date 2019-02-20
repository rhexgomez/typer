/*
 * Copyright 2015 Elmar Rhex Gomez
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

package com.elmargomez.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView

import com.elmargomez.typer.Typer

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AppCompatTextView

        val regularTextView = findViewById<TextView>(R.id.regular_textview)
        regularTextView.typeface = Typer.ROBOTO_REGULAR

        val italicTextView = findViewById<TextView>(R.id.italic_textview)
        italicTextView.typeface = Typer.ROBOTO_ITALIC

        val boldTextView = findViewById<TextView>(R.id.bold_textview)
        boldTextView.typeface = Typer.ROBOTO_BOLD

        val thinTextView = findViewById<TextView>(R.id.thin_textview)
        thinTextView.typeface = Typer.ROBOTO_THIN

        // AppCompatEditText

        val regularEditText = findViewById<EditText>(R.id.regular_edittext)
        regularEditText.typeface = Typer.ROBOTO_REGULAR

        val italicEditText = findViewById<EditText>(R.id.italic_edittext)
        italicEditText.typeface = Typer.ROBOTO_ITALIC

        val boldEditText = findViewById<EditText>(R.id.bold_edittext)
        boldEditText.typeface = Typer.ROBOTO_BOLD

        val thinEditText = findViewById<EditText>(R.id.thin_edittext)
        thinTextView.typeface = Typer.ROBOTO_THIN
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }
}
