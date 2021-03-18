package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;

public class ProcessAddressing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_addressing);
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
