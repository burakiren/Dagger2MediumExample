package com.example.dagger2onandroidmedium;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  Picture picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PictureComponent pictureComponent = DaggerPictureComponent.create();
        picture = pictureComponent.getPicture();
        picture.paint();
    }


}
