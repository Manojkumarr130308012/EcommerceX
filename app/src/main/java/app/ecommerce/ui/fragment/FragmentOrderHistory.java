package app.ecommerce.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;


public class FragmentOrderHistory extends Fragment {

    public FragmentOrderHistory() {
    }

    public static FragmentOrderHistory newInstance() {
        FragmentOrderHistory fragment = new FragmentOrderHistory();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_order_history, container, false);
        return root;
    }
}