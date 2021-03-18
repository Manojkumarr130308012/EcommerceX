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

public class AdapterOrderTrackList extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemOrderTrackList> items;

    private Context ctx;

    public AdapterOrderTrackList(Context context, List<ItemOrderTrackList> items) {
        this.items = items;
        ctx = context;
    }

    public class OriginalViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView orderId;
        public TextView date;
        public TextView status;
        public LinearLayout layoutIcon;
        public LinearLayout layoutStatus;

        public OriginalViewHolder(View v) {
            super(v);
            icon = v.findViewById(R.id.icon);
            orderId = v.findViewById(R.id.order_id);
            date = v.findViewById(R.id.date);
            layoutIcon = v.findViewById(R.id.layout_icon);
            status = v.findViewById(R.id.status);
            layoutStatus = v.findViewById(R.id.layout_status);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_oder_track, parent, false);
        vh = new OriginalViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof OriginalViewHolder) {
            OriginalViewHolder view = (OriginalViewHolder) holder;

            ItemOrderTrackList p = items.get(position);

            view.orderId.setText(p.orderId);
            view.date.setText(p.date);
            view.status.setText(p.status);

            if(p.status=="Shipped"){
                view.icon.setImageResource(R.drawable.ic_giftcard);
                view.icon.setColorFilter(ctx.getResources().getColor(R.color.yellow_700));
                view.layoutIcon.setBackgroundColor(ctx.getResources().getColor(R.color.yellow_100));
                view.layoutStatus.setBackgroundColor(ctx.getResources().getColor(R.color.yellow_700));
            }else if(p.status == "Delivered"){
                view.icon.setImageResource(R.drawable.ic_check);
                view.icon.setColorFilter(ctx.getResources().getColor(R.color.green_700));
                view.layoutIcon.setBackgroundColor(ctx.getResources().getColor(R.color.green_100));
                view.layoutStatus.setBackgroundColor(ctx.getResources().getColor(R.color.green_700));
            }else if(p.status == "Cancel"){
                view.icon.setImageResource(R.drawable.ic_close);
                view.icon.setColorFilter(ctx.getResources().getColor(R.color.red_700));
                view.layoutIcon.setBackgroundColor(ctx.getResources().getColor(R.color.red_100));
                view.layoutStatus.setBackgroundColor(ctx.getResources().getColor(R.color.red_700));
            }

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}