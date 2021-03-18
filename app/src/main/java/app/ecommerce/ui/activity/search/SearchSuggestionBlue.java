package app.ecommerce.ui.activity.search;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class SearchSuggestionBlue extends AppCompatActivity {

    private LinearLayout lr_suggestion, lr_suggestion1, lr_suggestion2, lr_suggestion3, lr_suggestion4;
    private ImageView bt_clear;
    private EditText et_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_suggestion_blue);

        initToolbar();
        initComponent();
    }

    private void initComponent() {
        lr_suggestion = (LinearLayout) findViewById(R.id.lr_suggestion);
        lr_suggestion1 = (LinearLayout) findViewById(R.id.lr_suggestion1);
        lr_suggestion2 = (LinearLayout) findViewById(R.id.lr_suggestion2);
        lr_suggestion3 = (LinearLayout) findViewById(R.id.lr_suggestion3);
        lr_suggestion4 = (LinearLayout) findViewById(R.id.lr_suggestion4);
        et_search = (EditText) findViewById(R.id.et_search);
        bt_clear = (ImageView) findViewById(R.id.bt_clear);
        et_search.addTextChangedListener(textWatcher);

        lr_suggestion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("design system kit");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("design faster");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("design everything");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });
        lr_suggestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("design material design");
                hideKeyboard();
                lr_suggestion.setVisibility(View.INVISIBLE);
            }
        });

        et_search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    hideKeyboard();
                    return true;
                }
                return false;
            }
        });

        et_search.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                lr_suggestion.setVisibility(View.VISIBLE);
                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
                return false;
            }
        });

        bt_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_search.setText("");
            }
        });

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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


    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence c, int i, int i1, int i2) {
            if (c.toString().trim().length() == 0) {
                bt_clear.setVisibility(View.GONE);
            } else {
                bt_clear.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void beforeTextChanged(CharSequence c, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }
    };

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.blue_sugges);
    }


}