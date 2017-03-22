package com.example.manavimishra.myapplication_imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView img_view;
    private static Button button_sbm;

    private int current_img_index;
     int[] images = {R.mipmap.and_img1,R.mipmap.and_img2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClick();
    }
    public void onButtonClick(){
        img_view = (ImageView)findViewById(R.id.imageView);
        button_sbm = (Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_img_index++;
                        current_img_index = current_img_index % images.length;
                        img_view.setImageResource(images[current_img_index]);

                    }
                }
        );
    }
}
