package app.ecommerce.ui.activity.register;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;

public class RegisterFoodImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_food_image);
        (findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
