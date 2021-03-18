package app.ecommerce.ui.activity.category;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class CategoryGridOption extends AppCompatActivity {
    private LinearLayout layoutLocation;
    private TextView location;
    private String single_choice_selected;
    private static final String[] LOCATIONS = new String[]{
            "Mumbai, Bandra", "Jakarta, Indonesia", "Sidney, Australia", "Tokyo, Japan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid_option);
        initToolbar();
        initComponent();
    }

    private void initToolbar(){
        Tools.setSystemBarColor(this, R.color.blue_dark);
    }

    private void initComponent() {
        layoutLocation = findViewById(R.id.layout_location);
        location = findViewById(R.id.tv_location);
        layoutLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSingleChoiceDialog();
            }
        });
    }


    private void showSingleChoiceDialog() {
        single_choice_selected = LOCATIONS[0];
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Location");
        builder.setSingleChoiceItems(LOCATIONS, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                single_choice_selected = LOCATIONS[i];
            }
        });
        builder.setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                location.setText(single_choice_selected);
            }
        });
        builder.setNegativeButton(R.string.CANCEL, null);
        builder.show();
    }

}
