package app.ecommerce.ui.activity.product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProductPhoneDetail extends AppCompatActivity {
    private ImageView[] check = new ImageView[5];
    private LinearLayout[] storage = new LinearLayout[4];
    private LinearLayout[] color = new LinearLayout[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_phone_detail);
        initComponent();
        initToolbar();
    }

    private void initToolbar(){
        Tools.setSystemBarColor(this,R.color.red_400);
    }

    private void initComponent(){

        (findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //init for color
        for(int i=0; i<5; i++){
            int colorId = getResources().getIdentifier("color_" + (i+1),"id",getPackageName());
            int checkId = getResources().getIdentifier("check_" + (i+1),"id",getPackageName());
            color[i] = findViewById(colorId);
            check[i] = findViewById(checkId);
        }

        //init for storage
        for(int i=0; i<4; i++){
            int sizeId = getResources().getIdentifier("storage_" + (i+1),"id",getPackageName());
            storage[i] = findViewById(sizeId);
        }

        storage[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(storage[0],true);
                setBackgroundSizeDrawable(storage[1],false);
                setBackgroundSizeDrawable(storage[2],false);
                setBackgroundSizeDrawable(storage[3],false);
            }
        });

        storage[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(storage[0],false);
                setBackgroundSizeDrawable(storage[1],true);
                setBackgroundSizeDrawable(storage[2],false);
                setBackgroundSizeDrawable(storage[3],false);
            }
        });

        storage[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(storage[0],false);
                setBackgroundSizeDrawable(storage[1],false);
                setBackgroundSizeDrawable(storage[2],true);
                setBackgroundSizeDrawable(storage[3],false);
            }
        });

        storage[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(storage[0],false);
                setBackgroundSizeDrawable(storage[1],false);
                setBackgroundSizeDrawable(storage[2],false);
                setBackgroundSizeDrawable(storage[3],true);
            }
        });

        color[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[0],true);
                setCheckColor(check[1],false);
                setCheckColor(check[2],false);
                setCheckColor(check[3],false);
                setCheckColor(check[4],false);
            }
        });

        color[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[1],true);
                setCheckColor(check[0],false);
                setCheckColor(check[2],false);
                setCheckColor(check[3],false);
                setCheckColor(check[4],false);
            }
        });

        color[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[2],true);
                setCheckColor(check[0],false);
                setCheckColor(check[1],false);
                setCheckColor(check[3],false);
                setCheckColor(check[4],false);
            }
        });

        color[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[3],true);
                setCheckColor(check[0],false);
                setCheckColor(check[1],false);
                setCheckColor(check[2],false);
                setCheckColor(check[4],false);
            }
        });

        color[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[4],true);
                setCheckColor(check[0],false);
                setCheckColor(check[1],false);
                setCheckColor(check[2],false);
                setCheckColor(check[3],false);
            }
        });
    }

    private void setBackgroundSizeDrawable(View view, boolean selected){
        final int sdk = android.os.Build.VERSION.SDK_INT;

        if (selected){
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_selected_red) );
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_selected_red));
            }
        }else{
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline) );
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline));
            }
        }
    }

    private void setCheckColor(View view, boolean selected){
        if(selected)    view.setVisibility(View.VISIBLE);
        else            view.setVisibility(View.INVISIBLE);
    }
}