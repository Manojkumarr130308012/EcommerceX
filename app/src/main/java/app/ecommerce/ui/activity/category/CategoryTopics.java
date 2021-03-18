package app.ecommerce.ui.activity.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.GravityCompat;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class CategoryTopics extends AppCompatActivity {

    //Handmade
    private LinearLayout handmade;
    private ImageView imghandmade;
    private TextView txthandmade;
    private CardView cardhandmade;
    int handcheck = 2;

    //Weather
    private LinearLayout weather;
    private ImageView imgweather;
    private TextView txtweather;
    private CardView cardweather;
    int weathercheck = 1;

    //Fashion
    private LinearLayout fashion;
    private ImageView imgfashion;
    private TextView txtfashion;
    private CardView cardfashion;
    int fashioncheck = 1;

    //Technology
    private LinearLayout technology;
    private ImageView imgtechnology;
    private TextView txttechnology;
    private CardView cardtechnology;
    int technologycheck = 2;

    //trending
    private LinearLayout trending;
    private ImageView imgtrending;
    private TextView txttrending;
    private CardView cardtrending;
    int trendingcheck = 1;

    //Politics
    private LinearLayout politics;
    private ImageView imgpolitics;
    private TextView txtpolitics;
    private CardView cardpolitics;
    int politicscheck = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_topics);

        initComponent();
        handCheck();
        weatherCheck();
        fashionCheck();
        technologyCheck();
        trendingCheck();
        politicsCheck();

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        //change menu button color
        Tools.changeNavigationIconColor(toolbar, getResources().getColor(R.color.grey_60));
        //change overflow menu button color
        Tools.changeOverflowMenuIconColor(toolbar, getResources().getColor(R.color.grey_60));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);

        handmade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handcheck += 1;
                handCheck();
            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weathercheck+=1;
                weatherCheck();
            }
        });

        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fashioncheck+=1;
                fashionCheck();
            }
        });

        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                technologycheck+=1;
                technologyCheck();
            }
        });

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trendingcheck +=1;
                trendingCheck();

            }
        });

        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                politicscheck += 1;
                politicsCheck();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
           finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    private void initComponent(){

        handmade = findViewById(R.id.linear_handmade);
        imghandmade = findViewById(R.id.imgv_handmade);
        txthandmade = findViewById(R.id.txt_handmade);
        cardhandmade = findViewById(R.id.card_handmade);

        weather = findViewById(R.id.linear_weather);
        imgweather = findViewById(R.id.imgv_weather);
        txtweather = findViewById(R.id.txt_weather);
        cardweather = findViewById(R.id.card_weather);

        fashion = findViewById(R.id.linear_fashion);
        imgfashion = findViewById(R.id.imgv_fashion);
        txtfashion = findViewById(R.id.txt_fashion);
        cardfashion = findViewById(R.id.card_fashione);

        technology = findViewById(R.id.linear_technology);
        imgtechnology = findViewById(R.id.imgv_technologi);
        txttechnology = findViewById(R.id.txt_technology);
        cardtechnology = findViewById(R.id.card_technology);

        trending = findViewById(R.id.linear_trending);
        imgtrending = findViewById(R.id.imgv_trending);
        txttrending = findViewById(R.id.txt_trending);
        cardtrending = findViewById(R.id.card_trending);

        politics = findViewById(R.id.linear_politics);
        imgpolitics = findViewById(R.id.imgv_politics);
        txtpolitics = findViewById(R.id.txt_politics);
        cardpolitics = findViewById(R.id.card_politics);

    }

    private void handCheck(){
        if(handcheck % 2 == 0){
            handmade.setBackgroundResource(R.drawable.rectangle_transparent);
            imghandmade.setImageResource(R.drawable.ic_check);
            imghandmade.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txthandmade.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txthandmade.setTypeface(Typeface.DEFAULT_BOLD);
            cardhandmade.setCardElevation(2f);
        }
        else{
            handmade.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imghandmade.setImageResource(R.drawable.ic_add);
            imghandmade.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txthandmade.setTextColor(getResources().getColor(R.color.purple_200));;
            txthandmade.setTypeface(Typeface.DEFAULT);
            cardhandmade.setCardElevation(0f);
        }
    }

    private void weatherCheck(){
        if(weathercheck % 2 == 0){
            weather.setBackgroundResource(R.drawable.rectangle_transparent);
            imgweather.setImageResource(R.drawable.ic_check);
            imgweather.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txtweather.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtweather.setTypeface(Typeface.DEFAULT_BOLD);
            cardweather.setCardElevation(2f);
        }
        else{
            weather.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgweather.setImageResource(R.drawable.ic_add);
            imgweather.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txtweather.setTextColor(getResources().getColor(R.color.purple_200));;
            txtweather.setTypeface(Typeface.DEFAULT);
            cardweather.setCardElevation(0f);
        }
    }

    private void fashionCheck(){
        if(fashioncheck % 2 == 0){
            fashion.setBackgroundResource(R.drawable.rectangle_transparent);
            imgfashion.setImageResource(R.drawable.ic_check);
            imgfashion.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txtfashion.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtfashion.setTypeface(Typeface.DEFAULT_BOLD);
            cardfashion.setCardElevation(2f);
        }
        else{
            fashion.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgfashion.setImageResource(R.drawable.ic_add);
            imgfashion.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txtfashion.setTextColor(getResources().getColor(R.color.purple_200));;
            txtfashion.setTypeface(Typeface.DEFAULT);
            cardfashion.setCardElevation(0f);
        }
    }


    private void technologyCheck(){
        if(technologycheck % 2 == 0){
            technology.setBackgroundResource(R.drawable.rectangle_transparent);
            imgtechnology.setImageResource(R.drawable.ic_check);
            imgtechnology.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txttechnology.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txttechnology.setTypeface(Typeface.DEFAULT_BOLD);
            cardtechnology.setCardElevation(2f);
        }
        else{
            technology.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgtechnology.setImageResource(R.drawable.ic_add);
            imgtechnology.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txttechnology.setTextColor(getResources().getColor(R.color.purple_200));;
            txttechnology.setTypeface(Typeface.DEFAULT);
            cardtechnology.setCardElevation(0f);
        }
    }

    private void trendingCheck(){
        if(trendingcheck % 2 == 0){
            trending.setBackgroundResource(R.drawable.rectangle_transparent);
            imgtrending.setImageResource(R.drawable.ic_check);
            imgtrending.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txttrending.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txttrending.setTypeface(Typeface.DEFAULT_BOLD);
            cardtrending.setCardElevation(2f);
        }
        else{
            trending.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgtrending.setImageResource(R.drawable.ic_add);
            imgtrending.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txttrending.setTextColor(getResources().getColor(R.color.purple_200));;
            txttrending.setTypeface(Typeface.DEFAULT);
            cardtrending.setCardElevation(0f);
        }
    }

    private void politicsCheck(){
        if(politicscheck % 2 == 0){
            politics.setBackgroundResource(R.drawable.rectangle_transparent);
            imgpolitics.setImageResource(R.drawable.ic_check);
            imgpolitics.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.green_500));
            txtpolitics.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtpolitics.setTypeface(Typeface.DEFAULT_BOLD);
            cardpolitics.setCardElevation(2f);
        }
        else{
            politics.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgpolitics.setImageResource(R.drawable.ic_add);
            imgpolitics.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.purple_200));
            txtpolitics.setTextColor(getResources().getColor(R.color.purple_200));;
            txtpolitics.setTypeface(Typeface.DEFAULT);
            cardpolitics.setCardElevation(0f);
        }
    }



}
