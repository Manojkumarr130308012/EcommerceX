package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;

public class ProcessFoodOrder extends AppCompatActivity {
    private int counter = 1;
    private TextView countValue;
    private ImageView btnPlus;
    private ImageView btnMinus;
    private TextView count;
    private TextView price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_food_order);
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponent() {
        btnMinus = findViewById(R.id.btn_minus);
        btnPlus = findViewById(R.id.btn_plus);
        countValue = findViewById(R.id.count_value);
        count = findViewById(R.id.count);
        price = findViewById(R.id.price);

        countValue.setText(counter + "");

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                if (counter < 1) counter = 1;
                countValue.setText(counter + "");
                count.setText(counter + "");
                price.setText("$" + counter * 8.99);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                countValue.setText(counter + "");
                count.setText(counter + "");
                price.setText("$" + counter * 8.99);
            }
        });

    }
}
