package com.example.bonnie.mystreamer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

private ImageView mimageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;
        mimageView = (ImageView) findViewById(R.id.image_view);
        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(mimageView);
    }

}
