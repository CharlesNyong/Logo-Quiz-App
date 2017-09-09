package com.example.hsport.quiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private HashMap<String, String> answers = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        answers.put("france", "img1");
        answers.put("germany", "img2");
        answers.put("italy", "img3");
        answers.put("poland", "img4");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        final Button btn1 = (Button) findViewById(R.id.OptA);
        final Button btn2 = (Button) findViewById(R.id.OptB);
        final Button btn3 = (Button) findViewById(R.id.OptC);
        final Button btn4 = (Button) findViewById(R.id.OptD);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageBox = (ImageView) findViewById(R.id.imageView);
                String ImageTag = (String) imageBox.getTag();

                Log.d("Image name: ", String.valueOf(ImageTag));
                if(ImageTag.equals(answers.get("france"))){
                    imageBox.setImageResource(R.drawable.germany);
                    imageBox.setTag("img2");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageBox = (ImageView) findViewById(R.id.imageView);
                String ImageTag = (String) imageBox.getTag();
                Log.d("Image name: ", String.valueOf(ImageTag));
                if(ImageTag.equals(answers.get("germany"))){
                    imageBox.setImageResource(R.drawable.poland);
                    imageBox.setTag("img4");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageBox = (ImageView) findViewById(R.id.imageView);
                String ImageTag = (String) imageBox.getTag();

                Log.d("Image name: ", String.valueOf(ImageTag));
                if(ImageTag.equals(answers.get("italy"))){
                    imageBox.setImageResource(R.drawable.france);
                    imageBox.setTag("img1");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageBox = (ImageView) findViewById(R.id.imageView);
                String ImageTag = (String) imageBox.getTag();
                Log.d("Image name: ", String.valueOf(ImageTag));
                if(ImageTag.equals(answers.get("poland"))){
                    imageBox.setImageResource(R.drawable.italy);
                    imageBox.setTag("img3");
                }
            }
        });
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
