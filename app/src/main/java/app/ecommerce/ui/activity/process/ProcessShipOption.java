package app.ecommerce.ui.activity.process;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProcessShipOption extends AppCompatActivity {

    //Free
    private LinearLayout free;
    private ImageView imgfree;
    private TextView txtfree;
    private TextView subfree;
    private CardView cardfree;

    //Standard
    private LinearLayout standard;
    private ImageView imgstandard;
    private TextView txtstandard;
    private TextView substandard;
    private CardView cardstandard;

    //Express
    private LinearLayout express;
    private ImageView imgexpress;
    private TextView txtexpress;
    private TextView subexpress;
    private CardView cardexpress;

    int check = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_ship_option);

        initComponent();
        checkCondition();

        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);

    }

    private void initComponent() {

        free = findViewById(R.id.linear_free);
        imgfree = findViewById(R.id.imgv_free);
        txtfree = findViewById(R.id.txt_free);
        subfree = findViewById(R.id.txt_subfree);
        cardfree = findViewById(R.id.card_free);

        standard = findViewById(R.id.linear_standard);
        imgstandard = findViewById(R.id.imgv_standard);
        txtstandard = findViewById(R.id.txt_standard);
        substandard = findViewById(R.id.txt_substrandard);
        cardstandard = findViewById(R.id.card_standard);

        express = findViewById(R.id.linear_express);
        imgexpress = findViewById(R.id.imgv_express);
        txtexpress = findViewById(R.id.txt_express);
        subexpress = findViewById(R.id.txt_subexpress);
        cardexpress = findViewById(R.id.card_express);


        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 1;
                checkCondition();
            }
        });

        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 2;
                checkCondition();
            }
        });


        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 3;
                checkCondition();
            }
        });

    }

    private void checkCondition() {
        if (check == 1) {
            free.setBackgroundResource(R.drawable.rectangle_transparent);
            imgfree.setImageResource(R.drawable.ic_check);
            imgfree.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_500));
            txtfree.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtfree.setTypeface(Typeface.DEFAULT_BOLD);
            subfree.setTextColor(getResources().getColor(R.color.overlay_dark_50));
            cardfree.setCardElevation(5f);

            standard.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgstandard.setImageResource(R.drawable.ic_add);
            imgstandard.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtstandard.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtstandard.setTypeface(Typeface.DEFAULT);
            substandard.setTextColor(getResources().getColor(R.color.purple_200));
            cardstandard.setCardElevation(0f);

            express.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgexpress.setImageResource(R.drawable.ic_add);
            imgexpress.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtexpress.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtexpress.setTypeface(Typeface.DEFAULT);
            subexpress.setTextColor(getResources().getColor(R.color.purple_200));
            cardexpress.setCardElevation(0f);
        } else if (check == 2) {

            standard.setBackgroundResource(R.drawable.rectangle_transparent);
            imgstandard.setImageResource(R.drawable.ic_check);
            imgstandard.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_500));
            txtstandard.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtstandard.setTypeface(Typeface.DEFAULT_BOLD);
            substandard.setTextColor(getResources().getColor(R.color.overlay_dark_50));
            cardstandard.setCardElevation(5f);

            free.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgfree.setImageResource(R.drawable.ic_add);
            imgfree.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtfree.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtfree.setTypeface(Typeface.DEFAULT);
            subfree.setTextColor(getResources().getColor(R.color.purple_200));
            cardfree.setCardElevation(0f);

            express.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgexpress.setImageResource(R.drawable.ic_add);
            imgexpress.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtexpress.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtexpress.setTypeface(Typeface.DEFAULT);
            subexpress.setTextColor(getResources().getColor(R.color.purple_200));
            cardexpress.setCardElevation(0f);

        } else if (check == 3) {

            express.setBackgroundResource(R.drawable.rectangle_transparent);
            imgexpress.setImageResource(R.drawable.ic_check);
            imgexpress.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_500));
            txtexpress.setTextColor(getResources().getColor(R.color.overlay_dark_80));
            txtexpress.setTypeface(Typeface.DEFAULT_BOLD);
            subexpress.setTextColor(getResources().getColor(R.color.overlay_dark_50));
            cardexpress.setCardElevation(5f);

            free.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgfree.setImageResource(R.drawable.ic_add);
            imgfree.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtfree.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtfree.setTypeface(Typeface.DEFAULT);
            subfree.setTextColor(getResources().getColor(R.color.purple_200));
            cardfree.setCardElevation(0f);

            standard.setBackgroundResource(R.drawable.rectangle_stroke_purple);
            imgstandard.setImageResource(R.drawable.ic_add);
            imgstandard.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_200));
            txtstandard.setTextColor(getResources().getColor(R.color.purple_500));
            ;
            txtstandard.setTypeface(Typeface.DEFAULT);
            substandard.setTextColor(getResources().getColor(R.color.purple_200));
            cardstandard.setCardElevation(0f);


        }

    }
}
