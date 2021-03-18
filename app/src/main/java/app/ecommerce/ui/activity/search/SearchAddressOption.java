package app.ecommerce.ui.activity.search;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;

import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.logging.Handler;

import app.ecommerce.ui.R;

public class SearchAddressOption extends AppCompatActivity {

    private HorizontalScrollView horizontalScrollView;
    private EditText name;
    private EditText address;
    private EditText city;
    private EditText zip;
    private EditText state;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_address_option);

        initComponent();

    }

    private void initComponent(){

        name = findViewById(R.id.edt_name);
        address = findViewById(R.id.edt_address);
        city = findViewById(R.id.edt_city);
        zip = findViewById(R.id.edt_zip);
        state = findViewById(R.id.edt_state);
        horizontalScrollView = findViewById(R.id.scv_horizontal);


        //Auto scroll to center
        horizontalScrollView.post(new Runnable() {
            @Override
            public void run() {
                int centerX = (horizontalScrollView.getChildAt(0).getWidth()/3) - horizontalScrollView.getChildAt(0).getWidth()/24;
                horizontalScrollView.scrollTo(centerX , 0);
                horizontalScrollView.isSmoothScrollingEnabled();
            }
        });

        name.setText("Home #1");
        address.setText("438 Dark Spurt Avenue");
        city.setText("San Francisco");
        zip.setText("94528");
        state.setText("California");

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
