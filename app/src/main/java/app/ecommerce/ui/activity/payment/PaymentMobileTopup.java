package app.ecommerce.ui.activity.payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class PaymentMobileTopup extends AppCompatActivity {

    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;

    private TextView text1_2;
    private TextView text2_2;
    private TextView text3_2;
    private TextView text4_2;
    private TextView text5_2;
    private TextView text6_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_mobile_topup);
        initToolbar();
        initComponent();
        setColor(linear1,text1,text1_2);
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }

    private void initComponent(){
        linear1 = findViewById(R.id.topup1);
        linear2 = findViewById(R.id.topup2);
        linear3 = findViewById(R.id.topup3);
        linear4 = findViewById(R.id.topup4);
        linear5 = findViewById(R.id.topup5);
        linear6 = findViewById(R.id.topup6);

        text1 = findViewById(R.id.text1_1);
        text2 = findViewById(R.id.text2_1);
        text3 = findViewById(R.id.text3_1);
        text4 = findViewById(R.id.text4_1);
        text5 = findViewById(R.id.text5_1);
        text6 = findViewById(R.id.text6_1);

        text1_2 = findViewById(R.id.text1_2);
        text2_2 = findViewById(R.id.text2_2);
        text3_2 = findViewById(R.id.text3_2);
        text4_2 = findViewById(R.id.text4_2);
        text5_2 = findViewById(R.id.text5_2);
        text6_2 = findViewById(R.id.text6_2);


        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear1,text1,text1_2);

                setWhite(linear2,text2,text2_2);
                setWhite(linear3,text3,text3_2);
                setWhite(linear4,text4,text4_2);
                setWhite(linear5,text5,text5_2);
                setWhite(linear6,text6,text6_2);
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear2,text2,text2_2);

                setWhite(linear1,text1,text1_2);
                setWhite(linear3,text3,text3_2);
                setWhite(linear4,text4,text4_2);
                setWhite(linear5,text5,text5_2);
                setWhite(linear6,text6,text6_2);
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear3,text3,text3_2);

                setWhite(linear1,text1,text1_2);
                setWhite(linear2,text2,text2_2);
                setWhite(linear4,text4,text4_2);
                setWhite(linear5,text5,text5_2);
                setWhite(linear6,text6,text6_2);
            }
        });

        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear4,text4,text4_2);

                setWhite(linear1,text1,text1_2);
                setWhite(linear2,text2,text2_2);
                setWhite(linear3,text3,text3_2);
                setWhite(linear5,text5,text5_2);
                setWhite(linear6,text6,text6_2);
            }
        });

        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear5,text5,text5_2);

                setWhite(linear1,text1,text1_2);
                setWhite(linear2,text2,text2_2);
                setWhite(linear3,text3,text3_2);
                setWhite(linear4,text4,text4_2);
                setWhite(linear6,text6,text6_2);
            }
        });

        linear6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear6,text6,text6_2);

                setWhite(linear1,text1,text1_2);
                setWhite(linear2,text2,text2_2);
                setWhite(linear3,text3,text3_2);
                setWhite(linear4,text4,text4_2);
                setWhite(linear5,text5,text5_2);
            }
        });

    }

    private void setColor(LinearLayout view, TextView view2, TextView view3){
        view.setBackgroundColor(ContextCompat.getColor(getBaseContext(),R.color.blue_500));
        view2.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.white));
        view3.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.white));
    }

    private void setWhite(LinearLayout view, TextView view2, TextView view3){
        view.setBackgroundColor(ContextCompat.getColor(getBaseContext(),R.color.grey_5));
        view2.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.grey_60));
        view3.setTextColor(ContextCompat.getColor(getBaseContext(),R.color.grey_40));
    }


}