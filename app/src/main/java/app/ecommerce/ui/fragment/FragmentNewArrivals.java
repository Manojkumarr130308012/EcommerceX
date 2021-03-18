package app.ecommerce.ui.fragment;

import android.os.Bundle;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import java.util.List;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterListNewArrivals;
import app.ecommerce.ui.data.DataGenerator;
import app.ecommerce.ui.model.ExampleProduct;
import app.ecommerce.ui.utils.GridSpacingItemDecoration;

public class FragmentNewArrivals extends Fragment {

    private RecyclerView recyclerView;
    private NestedScrollView scrollView;

    public FragmentNewArrivals() {
    }

    public static FragmentNewArrivals newInstance() {
        FragmentNewArrivals fragment = new FragmentNewArrivals();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_arrivals, container, false);

        initComponent(view);

        return view;
    }

    private void initComponent(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
        scrollView = view.findViewById(R.id.scroll);

        //set recycleview
        recyclerView.setNestedScrollingEnabled(false);
        int spanCount = 3; // 3 columns
        int spacing = 10; // 15px
        boolean includeEdge = false;
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));

        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));

        List<ExampleProduct> items = DataGenerator.getProducts(view.getContext());
        items.addAll(DataGenerator.getProducts(view.getContext()));

        recyclerView.setAdapter(new AdapterListNewArrivals(items, view.getContext()));
        recyclerView.setFocusable(false);

        //set scrollview
        scrollView.requestFocus();
    }
}
