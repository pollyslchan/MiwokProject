/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;
// Package name

//Import statement
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//Class declaration
public class MainActivity extends AppCompatActivity {

    //Method override
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // pass the TextViews numbers, family, colors, phrases to here
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        TextView familyTextView = (TextView) findViewById(R.id.family);
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        // set a clicklistener on numbersTextView
        // on click send intent to start new NumbersActivity
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent (MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // set a clicklistener on familyTextView
        // on click send intent to start new FamilyActivity
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent (MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // set a clicklistener on colorsTextView
        // on click send intent to start new ColorsActivity
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent (MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // set a clicklistener on phrasesTextView
        // on click send intent to start new PhrasesActivity
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent (MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}
