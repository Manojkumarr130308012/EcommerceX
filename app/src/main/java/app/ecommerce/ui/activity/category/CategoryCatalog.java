package app.ecommerce.ui.activity.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class CategoryCatalog extends AppCompatActivity {

    //Men
    private LinearLayout men;
    private TextView txtmen;
    private CardView cardmen;

    //Woman
    private LinearLayout woman;
    private TextView txtwoman;
    private CardView cardwoman;

    //Kids
    private LinearLayout kids;
    private TextView txtkids;
    private CardView cardkids;

    int check = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_catalog);

        initComponent();
        checkCondition();
        initToolbar();

        (findViewById(R.id.btn_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {

        men = findViewById(R.id.linear_men);
        txtmen = findViewById(R.id.txt_men);
        cardmen = findViewById(R.id.card_men);

        woman = findViewById(R.id.linear_woman);
        txtwoman = findViewById(R.id.txt_woman);
        cardwoman = findViewById(R.id.card_woman);

        kids = findViewById(R.id.linear_kids);
        txtkids = findViewById(R.id.txt_kids);
        cardkids = findViewById(R.id.card_kids);

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 1;
                checkCondition();
            }
        });

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 2;
                checkCondition();
            }
        });

        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 3;
                checkCondition();
            }
        });

    }


    private void checkCondition(){
        if(check == 1) {
            men.setBackgroundResource(R.color.overlay_light_90);
            txtmen.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtmen.setTypeface(Typeface.DEFAULT_BOLD);
            cardmen.setCardElevation(5f);

            woman.setBackgroundResource(R.drawable.rectangle_transparent);
            txtwoman.setTextColor(getResources().getColor(R.color.grey_600));;
            txtwoman.setTypeface(Typeface.DEFAULT);
            cardwoman.setCardElevation(0f);

            kids.setBackgroundResource(R.drawable.rectangle_transparent);
            txtkids.setTextColor(getResources().getColor(R.color.grey_600));;
            txtkids.setTypeface(Typeface.DEFAULT);
            cardkids.setCardElevation(0f);
        }

        else if(check == 2){
            woman.setBackgroundResource(R.color.overlay_light_90);
            txtwoman.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtwoman.setTypeface(Typeface.DEFAULT_BOLD);
            cardwoman.setCardElevation(5f);

            men.setBackgroundResource(R.drawable.rectangle_transparent);
            txtmen.setTextColor(getResources().getColor(R.color.grey_600));;
            txtmen.setTypeface(Typeface.DEFAULT);
            cardmen.setCardElevation(0f);

            kids.setBackgroundResource(R.drawable.rectangle_transparent);
            txtkids.setTextColor(getResources().getColor(R.color.grey_600));;
            txtkids.setTypeface(Typeface.DEFAULT);
            cardkids.setCardElevation(0f);
        }

        else if(check == 3){
            kids.setBackgroundResource(R.color.overlay_light_90);
            txtkids.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtkids.setTypeface(Typeface.DEFAULT_BOLD);
            cardkids.setCardElevation(5f);

            woman.setBackgroundResource(R.drawable.rectangle_transparent);
            txtwoman.setTextColor(getResources().getColor(R.color.grey_600));;
            txtwoman.setTypeface(Typeface.DEFAULT);
            cardwoman.setCardElevation(0f);

            men.setBackgroundResource(R.drawable.rectangle_transparent);
            txtmen.setTextColor(getResources().getColor(R.color.grey_600));;
            txtmen.setTypeface(Typeface.DEFAULT);
            cardmen.setCardElevation(0f);

        }

    }
}
