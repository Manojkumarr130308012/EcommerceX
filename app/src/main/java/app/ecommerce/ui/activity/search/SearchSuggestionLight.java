package app.ecommerce.ui.activity.search;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class SearchSuggestionLight extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;
    private EditText et_search;
    private LinearLayout lr_suggestion, lr_suggestion1, lr_suggestion2, lr_suggestion3, lr_suggestion4, lr_suggestion5, lr_suggestion6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_suggestion_light);

        setupToolbar();
        initComponent();
    }

    private void initComponent() {
        lr_suggestion = (LinearLayout) findViewById(R.id.lr_suggestion);
        et_search = (EditText) findViewById(R.id.et_search);
        lr_suggestion1 = (LinearLayout) findViewById(R.id.lr_suggestion1);
        lr_suggestion2 = (LinearLayout) findViewById(R.id.lr_suggestion2);
        lr_suggestion3 = (LinearLayout) findViewById(R.id.lr_suggestion3);
        lr_suggestion4 = (LinearLayout) findViewById(R.id.lr_suggestion4);
        lr_suggestion5 = (LinearLayout) findViewById(R.id.lr_suggestion5);
        lr_suggestion6 = (LinearLayout) findViewById(R.id.lr_suggestion6);


        et_search.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                lr_suggestion.setVisibility(View.VISIBLE);
                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
                return false;
            }
        });

        lr_suggestion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("ecommerce design system");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("android application template");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("shopping mobile and desktop app");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("stay tuned for updates");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("more articles");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("more announces");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });

        lr_suggestion.setVisibility(View.VISIBLE);
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }


    private void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}