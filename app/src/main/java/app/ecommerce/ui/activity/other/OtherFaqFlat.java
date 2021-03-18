package app.ecommerce.ui.activity.other;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class OtherFaqFlat extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_faq_flat);
        initComponent();
    }

    private void initComponent() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.grey_60), PorterDuff.Mode.SRC_ATOP);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.white);
        Tools.setSystemBarLight(this);


        text1 = findViewById(R.id.textfaq1);
        text2 = findViewById(R.id.textfaq2);
        text3 = findViewById(R.id.textfaq3);
        text4 = findViewById(R.id.textfaq4);
        text5 = findViewById(R.id.textfaq5);
        text6 = findViewById(R.id.textfaq6);
        text7 = findViewById(R.id.textfaq7);

        text1.setVisibility(View.GONE);
        text2.setVisibility(View.GONE);
        text3.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        text5.setVisibility(View.GONE);
        text6.setVisibility(View.GONE);
        text7.setVisibility(View.GONE);

        btToggleClick(findViewById(R.id.dropdown1));

    }

    public void btToggleClick(View view) {
        if (view instanceof ImageView) {
            ImageView img = (ImageView) view;

            if (img.getId() == R.id.dropdown1) {
                if (view.isSelected()) {
                    text1.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop);

                } else {
                    text1.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown2) {
                if (img.isSelected()) {
                    text2.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text2.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown3) {
                if (img.isSelected()) {
                    text3.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text3.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown4) {
                if (img.isSelected()) {
                    text4.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text4.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown5) {
                if (img.isSelected()) {
                    text5.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text5.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown6) {
                if (img.isSelected()) {
                    text6.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text6.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());

                ////
            } else if (img.getId() == R.id.dropdown7) {
                if (img.isSelected()) {
                    text7.setVisibility(View.GONE);
                    img.setImageResource(R.drawable.ic_arrow_drop_down);
                } else {
                    text7.setVisibility(View.VISIBLE);
                    img.setImageResource(R.drawable.ic_arrow_drop_up);
                }
                img.setSelected(!img.isSelected());
            }

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_shopping, menu);
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