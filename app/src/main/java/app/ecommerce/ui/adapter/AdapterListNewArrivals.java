package app.ecommerce.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.ecommerce.ui.R;
import app.ecommerce.ui.model.ExampleProduct;
import app.ecommerce.ui.utils.Tools;

public class AdapterListNewArrivals extends RecyclerView.Adapter<AdapterListNewArrivals.ViewHolder> {

    private Context mContext;
    private final List<ExampleProduct> mValues;

    public AdapterListNewArrivals(List<ExampleProduct> items, Context context) {
        mContext= context;
        mValues = items;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_new_arrivals, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.t_title.setText(""+mValues.get(position).title);
        holder.t_category.setText("Google");
        holder.t_price.setText(""+mValues.get(position).price);

        Tools.displayImageOriginal(mContext, holder.i_image, mValues.get(position).image);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView t_title;
        private TextView t_category;
        private TextView t_price;
        private ImageView i_image;

        public ViewHolder(View view) {
            super(view);
            t_title = view.findViewById(R.id.title);
            t_category = view.findViewById(R.id.category);
            t_price = view.findViewById(R.id.price);

            i_image = view.findViewById(R.id.image);
        }
    }
}
