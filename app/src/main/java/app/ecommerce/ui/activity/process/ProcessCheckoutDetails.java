package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProcessCheckoutDetails extends AppCompatActivity {

    int mQuantity1 = 1;
    int mPrice1 = 283;

    int mQuantity2 = 1;
    int mPrice2 = 483;

    RadioButton radioBtnExpress, radioBtnNormal, creditCard, cod, paytm, gwallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_checkout_details);

        radioBtnExpress = (RadioButton) findViewById(R.id.radioBtnExpress);
        radioBtnNormal = (RadioButton) findViewById(R.id.radioBtnNormal);

        creditCard = (RadioButton) findViewById(R.id.creditCard);
        cod = (RadioButton) findViewById(R.id.cod);
        paytm = (RadioButton) findViewById(R.id.paytm);
        gwallet = (RadioButton) findViewById(R.id.gwallet);

        initToolbar();

    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_arrow_left);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.red_toolbar);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioBtnExpress:
                // set inch button to unchecked
                radioBtnNormal.setChecked(!checked);
                break;
            case R.id.radioBtnNormal:
                // set MM button to unchecked
                radioBtnExpress.setChecked(!checked);
                break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.creditCard:
                // set inch button to unchecked
                cod.setChecked(!checked);
                paytm.setChecked(!checked);
                gwallet.setChecked(!checked);
                break;
            case R.id.cod:
                // set MM button to unchecked
                creditCard.setChecked(!checked);
                paytm.setChecked(!checked);
                gwallet.setChecked(!checked);
                break;

            case R.id.paytm:
                // set MM button to unchecked
                creditCard.setChecked(!checked);
                cod.setChecked(!checked);
                gwallet.setChecked(!checked);
                break;
            case R.id.gwallet:
                // set MM button to unchecked
                creditCard.setChecked(!checked);
                paytm.setChecked(!checked);
                cod.setChecked(!checked);
                break;
        }
    }

    public void increaseInteger1(View view) {
        mQuantity1 = mQuantity1 + 1;
        displayQuantity1(mQuantity1);

        if (mQuantity1 == 1) {

            mPrice1 = 283;
            displayPrice1(mPrice1);
        } else {
            if (mQuantity1 == 11) {
                Toast.makeText(this, "Maximal Order 10 Product", Toast.LENGTH_SHORT).show();

                mQuantity1 = 10;
                displayQuantity1(mQuantity1);
            } else {
                mPrice1 = mPrice1 + 283;
                displayPrice1(mPrice1);
            }
        }

    }

    public void decreaseInteger1(View view) {
        mQuantity1 = mQuantity1 - 1;
        displayQuantity1(mQuantity1);

        if (mQuantity1 == -1) {
            mQuantity1 = 0;
            displayQuantity1(mQuantity1);
        } else {

            if (mQuantity1 == 0) {
                mPrice1 = 0;
                displayPrice1(mPrice1);

            } else {
                mPrice1 = mPrice1 - 283;
                displayPrice1(mPrice1);
            }

        }


    }

    public void increaseInteger2(View view) {
        mQuantity2 = mQuantity2 + 1;
        displayQuantity2(mQuantity2);

        if (mQuantity2 == 1) {

            mPrice2 = 483;
            displayPrice2(mPrice2);
        } else {
            if (mQuantity2 == 11) {
                Toast.makeText(this, "Maximum Order 10 Product", Toast.LENGTH_SHORT).show();

                mQuantity2 = 10;
                displayQuantity2(mQuantity2);
            } else {
                mPrice2 = mPrice2 + 483;
                displayPrice2(mPrice2);
            }
        }

    }

    public void decreaseInteger2(View view) {
        mQuantity2 = mQuantity2 - 1;
        displayQuantity2(mQuantity2);

        if (mQuantity2 == -1) {
            mQuantity2 = 0;
            displayQuantity2(mQuantity2);
        } else {

            if (mQuantity2 == 0) {
                mPrice2 = 0;
                displayPrice2(mPrice2);

            } else {
                mPrice2 = mPrice2 - 483;
                displayPrice2(mPrice2);
            }

        }
    }

    private void displayQuantity1(int number) {
        TextView displayQuantity = (TextView) findViewById(R.id.quantity_1);
        displayQuantity.setText("" + number);

    }

    private void displayPrice1(int number) {
        TextView displayPrice = (TextView) findViewById(R.id.price_1);
        displayPrice.setText("$" + number);
    }

    private void displayQuantity2(int number) {
        TextView displayQuantity = (TextView) findViewById(R.id.quantity_2);
        displayQuantity.setText("" + number);

    }

    private void displayPrice2(int number) {
        TextView displayPrice = (TextView) findViewById(R.id.price_2);
        displayPrice.setText("$" + number);
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
