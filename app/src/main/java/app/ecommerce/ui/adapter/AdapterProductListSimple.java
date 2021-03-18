package app.ecommerce.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import app.ecommerce.ui.R;
import app.ecommerce.ui.model.ItemOrderTrackList;
import app.ecommerce.ui.model.ItemProductListSimple;

public class AdapterProductListSimple extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemProductListSimple> items;

    private Context ctx;

    public AdapterProductListSimple(Context context, List<ItemProductListSimple> items) {
        this.items = items;
        ctx = context;
    }

    public class OriginalViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name;
        public TextView description;
        public TextView price;

        public OriginalViewHolder(View v) {
            super(v);
            image = v.findViewById(R.id.image);
            name = v.findViewById(R.id.name);
            description = v.findViewById(R.id.description);
            price = v.findViewById(R.id.price);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_list_simple, parent, false);
        vh = new OriginalViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof OriginalViewHolder) {
            OriginalViewHolder view = (OriginalViewHolder) holder;

            ItemProductListSimple p = items.get(position);

            view.image.setImageResource(p.image);
            view.name.setText(p.name);
            view.description.setText(p.description);
            view.price.setText(p.price);

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}