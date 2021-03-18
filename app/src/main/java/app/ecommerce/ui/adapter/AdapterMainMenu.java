package app.ecommerce.ui.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.model.ItemMenu;
import app.ecommerce.ui.utils.Tools;

public class AdapterMainMenu extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemMenu> items;

    private Context ctx;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, ItemMenu obj, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mOnItemClickListener = mItemClickListener;
    }

    public AdapterMainMenu(Context context, List<ItemMenu> items) {
        this.items = items;
        ctx = context;
    }

    public class OriginalViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public ImageView dropdown;
        public TextView title;
        public View lyt_parent;
        public LinearLayout lyt_content;

        public OriginalViewHolder(View v) {
            super(v);
            icon = v.findViewById(R.id.icon);
            dropdown = v.findViewById(R.id.dropdown);
            title = v.findViewById(R.id.title);
            lyt_parent = v.findViewById(R.id.lyt_parent);
            lyt_content = v.findViewById(R.id.lyt_content);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        vh = new OriginalViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof OriginalViewHolder) {
            OriginalViewHolder view = (OriginalViewHolder) holder;

            final ItemMenu p = items.get(position);
            view.title.setText(p.title);
            if (p.type.equals("PARENT")) {
                view.icon.setImageResource(p.icon);
                view.icon.setVisibility(View.VISIBLE);
                view.dropdown.setVisibility(View.VISIBLE);
                view.lyt_content.setMinimumHeight(Tools.dpToPx(ctx, 50));
            } else if (p.type.equals("SUB")) {
                view.icon.setVisibility(View.INVISIBLE);
                view.dropdown.setVisibility(View.INVISIBLE);
                view.lyt_content.setMinimumHeight(Tools.dpToPx(ctx, 40));
            }
            view.dropdown.setRotation(p.expand ? 180 : 0);
            view.lyt_parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (p.type.equals("SUB") && mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(view, items.get(position), position);
                        return;
                    }
                    if (p.subs.size() <= 0) return;
                    if (p.expand) {
                        removeSubs(position, p.subs);
                    } else {
                        insertSubs(position, p.subs);
                    }
                    items.get(position).expand = !items.get(position).expand;
                    //p.expand = !p.expand;
                }
            });
        }
    }

    private void insertSubs(int pos, List<ItemMenu> subs) {
        int index = pos + 1;
        items.addAll(index, subs);
        notifyItemRangeInserted(index, subs.size());
        refreshList();
    }

    private void removeSubs(int pos, List<ItemMenu> subs) {
        items.removeAll(subs);
        notifyItemRangeRemoved(pos + 1, subs.size());
        refreshList();
    }

    private void refreshList(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                notifyDataSetChanged();
            }
        }, 100);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}