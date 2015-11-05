package com.elmargomez.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.elmargomez.typer.Font;
import com.elmargomez.typer.Typer;


public class MainActivity extends Activity {

    TextView txt;
    TextView txt2;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView1);
        txt3 = (TextView) findViewById(R.id.textView2);

        txt.setTypeface(Typer.set(this).getFont(Font.ROBOTO_THIN));
        txt2.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK));
        txt3.setTypeface(Typer.set(this).getFont(Font.ROBOTO_CONDENSED_ITALIC));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
