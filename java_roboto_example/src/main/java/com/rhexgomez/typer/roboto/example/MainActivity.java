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

package com.rhexgomez.typer.roboto.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.rhexgomez.typer.roboto.TyperRoboto;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AppCompatTextView

        TextView regularTextView = findViewById(R.id.regular_textview);
        regularTextView.setTypeface(TyperRoboto.ROBOTO_REGULAR());

        TextView italicTextView = findViewById(R.id.italic_textview);
        italicTextView.setTypeface(TyperRoboto.ROBOTO_ITALIC());

        TextView boldTextView = findViewById(R.id.bold_textview);
        boldTextView.setTypeface(TyperRoboto.ROBOTO_BOLD());

        TextView thinTextView = findViewById(R.id.thin_textview);
        thinTextView.setTypeface(TyperRoboto.ROBOTO_THIN());

        // AppCompatEditText

        TextView regularEditText = findViewById(R.id.regular_edittext);
        regularEditText.setTypeface(TyperRoboto.ROBOTO_REGULAR());

        TextView italicEditText = findViewById(R.id.italic_edittext);
        italicEditText.setTypeface(TyperRoboto.ROBOTO_ITALIC());

        TextView boldEditText = findViewById(R.id.bold_edittext);
        boldEditText.setTypeface(TyperRoboto.ROBOTO_BOLD());

        TextView thinEditText = findViewById(R.id.thin_edittext);
        thinEditText.setTypeface(TyperRoboto.ROBOTO_THIN());
    }

}
