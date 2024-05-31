package com.example.assignment_12messenger_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> mName1 = new ArrayList<>();
    private ArrayList<String> mImageurl1 = new ArrayList<>();

    private ArrayList<String> mName2 = new ArrayList<>();
    private ArrayList<String> mImageurl2 = new ArrayList<>();
    private ArrayList<String> mdescrip = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView1();
        initRecyclerView2();

    }

    private void initRecyclerView1(){

        RecyclerView re_view = findViewById(R.id.recycleView);
        re_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)); // horizontal r jonno
        CustomAdapter adapter = new CustomAdapter(this,mName1,mImageurl1);
        re_view.setAdapter(adapter);

        mImageurl1.add("https://preview.redd.it/who-has-the-best-hairstyle-in-bleach-v0-o9w5hamf6vqc1.jpeg?auto=webp&s=ec3800d0be478886121934a2b17745794844f6ea");
        mName1.add("Zaraki Kenpachi");


        mImageurl1.add("https://static1.cbrimages.com/wordpress/wp-content/uploads/2020/07/ichigo-Cropped.jpg");
        mName1.add("Ichigo Kurusaki\nPierce through the heaven and hell, Zangetsu ");


        mImageurl1.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7ZtWXZhUdFRI69SLakgv8RlB-XraK7VYOQw&usqp=CAU");
        mName1.add("Kisuke Urahara");



        mImageurl1.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc2fkIGhnmjYkYX9hC62qz-IscZDk6GQbneA&usqp=CAU");
        mName1.add("Shinji Hirako");
        //mdescrip.add("1061.12:67pm");

        mImageurl1.add("https://avatarfiles.alphacoders.com/360/360210.jpg");
        mName1.add("Aizen Sosuke");


        mImageurl1.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTiROH1W0VtqYdTwOn2udvBXOr6piDAIjzL0tPNRfUvphZT3WSObIL8ZYKyv0xjH9cL-A&usqp=CAU");
        mName1.add("Byakuya Kuchiki");
        //mdescrip.add("1061.12:67pm");
        mImageurl1.add("https://media.istockphoto.com/id/1368424593/photo/cheerful-woman-on-her-birthday.jpg?s=1024x1024&w=is&k=20&c=jtJlEl5nB56Ukj2SkZBaCl4vtztVCgHWvadxl6ZFQpU=");
        mName1.add("Azalea]\nI am doing well");

        mImageurl1.add("https://cdn.pixabay.com/photo/2020/10/11/19/51/cat-5646889_1280.jpg");
        mName1.add("Pinkie paw");

    }

     private void initRecyclerView2(){
        RecyclerView recy_view = findViewById(R.id.recyclerview2);
        recy_view.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter2 adapter = new CustomAdapter2(this,mName2,mImageurl2,mdescrip);
        recy_view.setAdapter(adapter);


        mImageurl2.add("https://preview.redd.it/who-has-the-best-hairstyle-in-bleach-v0-o9w5hamf6vqc1.jpeg?auto=webp&s=ec3800d0be478886121934a2b17745794844f6ea");
        mName2.add("Zaraki Kenpachi");
        mdescrip.add("I am on my way. 2:03 PM");

         mImageurl2.add("https://static1.cbrimages.com/wordpress/wp-content/uploads/2020/07/ichigo-Cropped.jpg");
        mName2.add("Ichigo Kurusaki");
         mdescrip.add("Pierce through, Zangetsu. 1:20 PM");



         mImageurl2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7ZtWXZhUdFRI69SLakgv8RlB-XraK7VYOQw&usqp=CAU");
        mName2.add("Kisuke Urahara");
         mdescrip.add("You: Why Ichigo taking so long. 12:20 PM");


         mImageurl2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc2fkIGhnmjYkYX9hC62qz-IscZDk6GQbneA&usqp=CAU");
        mName2.add("Shinji Hirako");
        mdescrip.add("Waiting for Ichigo. 11:00 AM");

        mImageurl2.add("https://avatarfiles.alphacoders.com/360/360210.jpg");
        mName2.add("Aizen Sosuke");
         mdescrip.add("Pierce through the heaven.... Thu");

         mImageurl2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTiROH1W0VtqYdTwOn2udvBXOr6piDAIjzL0tPNRfUvphZT3WSObIL8ZYKyv0xjH9cL-A&usqp=CAU");
        mName2.add("Byakuya Kuchiki");
        mdescrip.add("1061.Thu");


         mImageurl2 .add("https://media.istockphoto.com/id/1368424593/photo/cheerful-woman-on-her-birthday.jpg?s=1024x1024&w=is&k=20&c=jtJlEl5nB56Ukj2SkZBaCl4vtztVCgHWvadxl6ZFQpU=");
         mName2.add("Azalea");
         mdescrip.add("You: how you doing!!  Thu");


         mImageurl2.add("https://cdn.pixabay.com/photo/2020/10/11/19/51/cat-5646889_1280.jpg");
         mName2.add("Pinkie paw");
         mdescrip.add("I need food. Wed");

    }



}