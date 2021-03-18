package app.ecommerce.ui.activity.register;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;

public class LoginBigImageFashion extends AppCompatActivity {

    LinearLayout layout_title, layout_signup;
    ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_big_image_fashion);

        layout_signup = (LinearLayout) findViewById(R.id.layout_signup);
        layout_title = (LinearLayout) findViewById(R.id.layout_title);

        btn_back = (ImageView) findViewById(R.id.btn_back);
    }

    public void btnSignUpWithEmail(View view) {

        layout_signup.setVisibility(View.VISIBLE);
        btn_back.setVisibility(View.VISIBLE);
        layout_title.setVisibility(View.INVISIBLE);
    }

    public void btnBack(View view) {
        layout_signup.setVisibility(View.INVISIBLE);
        btn_back.setVisibility(View.INVISIBLE);
        layout_title.setVisibility(View.VISIBLE);
    }
}
