package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterOrderTrackList;
import app.ecommerce.ui.model.ItemOrderTrackList;
import app.ecommerce.ui.utils.Tools;

public class ProcessOrderTrackList extends AppCompatActivity {
    List<ItemOrderTrackList> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_order_track_list);
        initComponent();
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        items.add(new ItemOrderTrackList("#4466772", "9 April 2020", "Shipped"));
        items.add(new ItemOrderTrackList("#4432232", "20 April 2020", "Shipped"));
        items.add(new ItemOrderTrackList("#1243772", "11 June 2020", "Delivered"));
        items.add(new ItemOrderTrackList("#4462372", "13 June 2020", "Delivered"));
        items.add(new ItemOrderTrackList("#5366772", "20 June 2020", "Delivered"));
        items.add(new ItemOrderTrackList("#4523372", "30 June 2020", "Cancel"));
        items.add(new ItemOrderTrackList("#3436772", "12 July 2020", "Shipped"));
        items.add(new ItemOrderTrackList("#4462274", "3 August 2020", "Delivered"));

        AdapterOrderTrackList adapterOrderTrackList = new AdapterOrderTrackList(this, items);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterOrderTrackList);
    }
}
