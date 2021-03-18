package app.ecommerce.ui.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

import androidx.fragment.app.Fragment;
import app.ecommerce.ui.R;

public class FragmentFormPaypal extends Fragment {

    DatePickerDialog datePickerDialog;
    EditText date;

    public FragmentFormPaypal() {
    }

    public static FragmentFormPaypal newInstance() {
        FragmentFormPaypal fragment = new FragmentFormPaypal();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form_paypal, container, false);

        initComponent(view);

        return view;
    }

    private void initComponent(View view) {
        date = view.findViewById(R.id.date);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(view.getContext(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        date.setText(day + "/" + (month + 1) + "/" + year);
                    }
                }, year, month, dayOfMonth);

        date.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    datePickerDialog.show();
                    return true;
                }
                return false;
            }
        });

    }

}
