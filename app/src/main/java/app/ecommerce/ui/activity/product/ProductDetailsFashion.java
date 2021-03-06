package app.ecommerce.ui.activity.product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProductDetailsFashion extends AppCompatActivity {

    private ImageView check1;
    private ImageView check2;
    private ImageView check3;
    int check = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details_fashion);
        initComponent();
        checkCondition();
    }

    private void initComponent() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_4);
        Tools.setSystemBarLight(this);

        check1 = findViewById(R.id.color1);
        check2 = findViewById(R.id.color2);
        check3 = findViewById(R.id.color3);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 1;
                checkCondition();
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 2;
                checkCondition();
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 3;
                checkCondition();
            }
        });

    }

    private void checkCondition(){

        if(check == 1){
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.overlay_light_90));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.brown_600));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.grey_90));
        }

        else if(check == 2){
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.grey_40));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.overlay_light_90));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.grey_90));
        }

        else if(check == 3){
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.grey_40));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.brown_600));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(),R.color.overlay_light_90));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_product_details_fashion, menu);
        Tools.changeMenuIconColor(menu, getResources().getColor(R.color.grey_60));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle() + " clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
