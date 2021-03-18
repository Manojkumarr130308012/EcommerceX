package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProcessPromoCode extends AppCompatActivity {

    private Button gifts, onsale, discounts, save;

    private LinearLayout linear1, linear2, linear3;

    int check = 1;

    int check_lr = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_promo_code);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.black_promo);
    }

    private void initComponent() {

        gifts = (Button) findViewById(R.id.gifts);
        onsale = (Button) findViewById(R.id.onsale);
        discounts = (Button) findViewById(R.id.discount);
        save = (Button) findViewById(R.id.save);

        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);


        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_lr = 3;
                checkConditionLayout();
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check_lr = 2;
                checkConditionLayout();
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_lr = 1;
                checkConditionLayout();
            }
        });

        gifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 1;
                checkCondition();
            }
        });

        onsale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 2;
                checkCondition();
            }
        });

        discounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 3;
                checkCondition();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 4;
                checkCondition();
            }
        });

    }

    private void checkCondition() {
        if (check == 1) {
            gifts.setBackgroundResource(R.drawable.tab_rounded_promo_selected);


            onsale.setBackgroundResource(R.drawable.tab_rounded_promo);
            discounts.setBackgroundResource(R.drawable.tab_rounded_promo);
            save.setBackgroundResource(R.drawable.tab_rounded_promo);

        } else if (check == 2) {

            onsale.setBackgroundResource(R.drawable.tab_rounded_promo_selected);

            gifts.setBackgroundResource(R.drawable.tab_rounded_promo);
            discounts.setBackgroundResource(R.drawable.tab_rounded_promo);
            save.setBackgroundResource(R.drawable.tab_rounded_promo);

        } else if (check == 3) {

            discounts.setBackgroundResource(R.drawable.tab_rounded_promo_selected);

            onsale.setBackgroundResource(R.drawable.tab_rounded_promo);
            gifts.setBackgroundResource(R.drawable.tab_rounded_promo);
            save.setBackgroundResource(R.drawable.tab_rounded_promo);

        } else if (check == 4) {

            save.setBackgroundResource(R.drawable.tab_rounded_promo_selected);

            discounts.setBackgroundResource(R.drawable.tab_rounded_promo);
            onsale.setBackgroundResource(R.drawable.tab_rounded_promo);
            gifts.setBackgroundResource(R.drawable.tab_rounded_promo);

        }

    }

    private void checkConditionLayout() {
        if (check_lr == 1) {
            linear3.setBackgroundResource(R.drawable.background_lr_rounded);

            linear1.setBackgroundResource(R.drawable.background_lr);
            linear2.setBackgroundResource(R.drawable.background_lr);

        } else if (check_lr == 2) {


            linear2.setBackgroundResource(R.drawable.background_lr_rounded);

            linear1.setBackgroundResource(R.drawable.background_lr);
            linear3.setBackgroundResource(R.drawable.background_lr);

        } else if (check_lr == 3) {

            linear1.setBackgroundResource(R.drawable.background_lr_rounded);

            linear2.setBackgroundResource(R.drawable.background_lr);
            linear3.setBackgroundResource(R.drawable.background_lr);

        }


    }
}
