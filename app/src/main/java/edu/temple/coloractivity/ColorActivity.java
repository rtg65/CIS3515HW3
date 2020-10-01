package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        String[] colors = {"red", "blue", "green","fuchsia", "yellow", "purple", "gray", "cyan", "olive", "silver","magenta"};

        spinner.setAdapter(new ColorAdapter(this, colors.length,colors));
        ((Spinner) findViewById(R.id.spinner)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView  text = (TextView) view;
                text.setBackgroundColor(Color.parseColor("white"));
                View layout = findViewById(R.id.layout);
                layout.setBackgroundColor(Color.parseColor(text.getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?>  parent) {
                TextView text = (TextView) parent.getAdapter().getItem(parent.getLastVisiblePosition());
                text.setBackgroundColor(Color.parseColor(text.getText().toString()));
            }


        });
    }

}