package app.ecommerce.ui.activity.payment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class PaymentAddCard extends AppCompatActivity {

    private EditText cardNumber;
    private Button btnCreditCard;
    private Button btnPayPal;
    private ImageView card;
    private EditText edtVaild;
    private TextView txtSaveCard;
    private SwitchCompat switchSave;
    String a;
    int keyDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_add_card);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        btnCreditCard = findViewById(R.id.btn_creditcard);
        btnPayPal = findViewById(R.id.btn_paypal);
        cardNumber = findViewById(R.id.edt_cardnumber);
        card = findViewById(R.id.imgv_card);
        edtVaild = findViewById(R.id.edt_valid);
        txtSaveCard = findViewById(R.id.txt_save_card);
        switchSave = findViewById(R.id.switch_save);

        cardNumber.setTransformationMethod(new MyPasswordTransformationMethod());
        cardNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                cardNumberFormatter();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

        });


        btnPayPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnPayPal.setBackgroundResource(R.drawable.rectangle_solid_white);
                btnCreditCard.setBackgroundResource(R.drawable.rectangle_transparent);
                card.setImageResource(R.drawable.ic_paypal);
            }
        });

        ((ImageButton) findViewById(R.id.imgv_left_arrow)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCreditCard.setBackgroundResource(R.drawable.rectangle_solid_white);
                btnPayPal.setBackgroundResource(R.drawable.rectangle_transparent);
                card.setImageResource(R.drawable.ic_mastercard);
            }
        });

        edtVaild.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                validTillFormatter(editable);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

        });

    }

    private void cardNumberFormatter() {
        boolean flag = true;
        String eachBlock[] = cardNumber.getText().toString().split("-");
        for (int i = 0; i < eachBlock.length; i++) {
            if (eachBlock[i].length() > 4) {
                flag = false;
            }
        }
        if (flag) {
            cardNumber.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (keyCode == KeyEvent.KEYCODE_DEL)
                        keyDel = 1;
                    return false;
                }
            });
            if (keyDel == 0) {
                if (((cardNumber.getText().length() + 1) % 5) == 0) {
                    if (cardNumber.getText().toString().split("-").length <= 3) {
                        cardNumber.setText(cardNumber.getText() + "-");
                        cardNumber.setSelection(cardNumber.getText().length());
                    }
                }
                a = cardNumber.getText().toString();
            } else {
                a = cardNumber.getText().toString();
                keyDel = 0;
            }

        } else {
            cardNumber.setText(a);
        }
    }

    private void validTillFormatter(Editable editable) {
        if (editable.length() > 0 && (editable.length() % 3) == 0) {
            final char c = editable.charAt(editable.length() - 1);
            if ('/' == c) {
                editable.delete(editable.length() - 1, editable.length());
            }
        }
        if (editable.length() > 0 && (editable.length() % 3) == 0) {
            char c = editable.charAt(editable.length() - 1);
            if (Character.isDigit(c) && TextUtils.split(editable.toString(), String.valueOf("/")).length <= 2) {
                editable.insert(editable.length() - 1, String.valueOf("/"));
            }
        }
    }


    public static class MyPasswordTransformationMethod extends PasswordTransformationMethod {
        @Override
        public CharSequence getTransformation(CharSequence source, View view) {
            return new PasswordCharSequence(source);
        }

        private class PasswordCharSequence implements CharSequence {
            private CharSequence mSource;

            public PasswordCharSequence(CharSequence source) {
                mSource = source;
            }

            public char charAt(int index) {
                char caracter;
                switch (index) {
                    case 4:
                        caracter = ' ';
                        break;
                    case 9:
                        caracter = ' ';
                        break;
                    case 14:
                        caracter = ' ';
                        break;
                    default:
                        if (index < 15)
                            return '*';
                        else
                            caracter = mSource.charAt(index);
                        break;


                }


                return caracter;
            }

            public int length() {
                return mSource.length();
            }

            public CharSequence subSequence(int start, int end) {
                return mSource.subSequence(start, end);
            }
        }
    }

    ;

}
