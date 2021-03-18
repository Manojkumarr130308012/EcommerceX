package app.ecommerce.ui.activity.register;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.regex.Pattern;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class RegisterRoundBlue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_round_blue);
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.blue_800);
    }

    private void initComponent() {
        (findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        EditText name = findViewById(R.id.et_name);
        EditText email = findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);

        final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        final Pattern VALID_PASSWORD_REGEX =
                Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");


        final RelativeLayout layout_validation_name = findViewById(R.id.lyt_validation_name);
        final RelativeLayout layout_validation_email = findViewById(R.id.lyt_validation_email);
        final RelativeLayout layout_validation_password = findViewById(R.id.lyt_validation_password);

        final RelativeLayout layout_validation_name_true = findViewById(R.id.lyt_validation_name_true);
        final RelativeLayout layout_validation_name_false = findViewById(R.id.lyt_validation_name_false);

        final RelativeLayout layout_validation_email_true = findViewById(R.id.lyt_validation_email_true);
        final RelativeLayout layout_validation_email_false = findViewById(R.id.lyt_validation_email_false);

        final RelativeLayout layout_validation_password_true = findViewById(R.id.lyt_validation_password_true);
        final RelativeLayout layout_validation_password_false = findViewById(R.id.lyt_validation_password_false);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                layout_validation_name.setVisibility(View.VISIBLE);
                if (charSequence.length() > 20) {
                    layout_validation_name_false.setVisibility(View.VISIBLE);
                    layout_validation_name_true.setVisibility(View.INVISIBLE);
                } else {
                    layout_validation_name_false.setVisibility(View.INVISIBLE);
                    layout_validation_name_true.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                layout_validation_email.setVisibility(View.VISIBLE);
                if (!VALID_EMAIL_ADDRESS_REGEX.matcher(charSequence).find()) {
                    layout_validation_email_false.setVisibility(View.VISIBLE);
                    layout_validation_email_true.setVisibility(View.INVISIBLE);
                } else {
                    layout_validation_email_false.setVisibility(View.INVISIBLE);
                    layout_validation_email_true.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                layout_validation_password.setVisibility(View.VISIBLE);
                if (!VALID_PASSWORD_REGEX.matcher(charSequence).find()) {
                    layout_validation_password_false.setVisibility(View.VISIBLE);
                    layout_validation_password_true.setVisibility(View.INVISIBLE);
                } else {
                    layout_validation_password_false.setVisibility(View.INVISIBLE);
                    layout_validation_password_true.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
