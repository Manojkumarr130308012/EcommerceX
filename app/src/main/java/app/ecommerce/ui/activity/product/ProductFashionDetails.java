package app.ecommerce.ui.activity.product;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import app.ecommerce.ui.R;
import app.ecommerce.ui.model.Image;
import app.ecommerce.ui.utils.Tools;

public class ProductFashionDetails extends AppCompatActivity {

    private View parent_view;
    private ViewPager viewPager;
    private LinearLayout layout_dots;
    private AdapterImageSlider adapterImageSlider;

    private static int[] array_image_product = {
            R.drawable.bg_fashion,
            R.drawable.bg_fashion,
            R.drawable.bg_fashion,
            R.drawable.bg_fashion
    };

    private LinearLayout[] color = new LinearLayout[4];
    private ImageView[] check = new ImageView[4];
    private TextView text1, text2, text3, text4;

    private LinearLayout[] size = new LinearLayout[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_fashion_details);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Tools.setSystemBarColor(this, R.color.brown_toolbar);
    }


    private void initComponent() {
        (findViewById(R.id.btn_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        layout_dots = (LinearLayout) findViewById(R.id.layout_dots);
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapterImageSlider = new AdapterImageSlider(this, new ArrayList<Image>());

        text1 = (TextView) findViewById(R.id.text_1);
        text2 = (TextView) findViewById(R.id.text_2);
        text3 = (TextView) findViewById(R.id.text_3);
        text4 = (TextView) findViewById(R.id.text_4);

        List<Image> items = new ArrayList<>();
        for (int i : array_image_product) {
            Image obj = new Image();
            obj.image = i;
            obj.imageDrw = getResources().getDrawable(obj.image);
            items.add(obj);
        }

        adapterImageSlider.setItems(items);
        viewPager.setAdapter(adapterImageSlider);

        // displaying selected image first
        viewPager.setCurrentItem(0);
        addBottomDots(layout_dots, adapterImageSlider.getCount(), 0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int pos) {
                addBottomDots(layout_dots, adapterImageSlider.getCount(), pos);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


        //init for size
        for (int i = 0; i < 4; i++) {
            int sizeId = getResources().getIdentifier("size_" + (i + 1), "id", getPackageName());
            size[i] = findViewById(sizeId);
        }

        size[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setTextColor(getResources().getColor(R.color.white));

                text2.setTextColor(getResources().getColor(R.color.grey_60));
                text3.setTextColor(getResources().getColor(R.color.grey_60));
                text4.setTextColor(getResources().getColor(R.color.grey_60));

                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[2], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setTextColor(getResources().getColor(R.color.white));

                text1.setTextColor(getResources().getColor(R.color.grey_60));
                text3.setTextColor(getResources().getColor(R.color.grey_60));
                text4.setTextColor(getResources().getColor(R.color.grey_60));
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[2], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text3.setTextColor(getResources().getColor(R.color.white));

                text1.setTextColor(getResources().getColor(R.color.grey_60));
                text2.setTextColor(getResources().getColor(R.color.grey_60));
                text4.setTextColor(getResources().getColor(R.color.grey_60));
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text4.setTextColor(getResources().getColor(R.color.white));

                text1.setTextColor(getResources().getColor(R.color.grey_60));
                text2.setTextColor(getResources().getColor(R.color.grey_60));
                text3.setTextColor(getResources().getColor(R.color.grey_60));
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[2], false);
            }
        });

        for (int i = 0; i < 4; i++) {
            int colorId = getResources().getIdentifier("color_" + (i + 1), "id", getPackageName());
            int checkId = getResources().getIdentifier("check_" + (i + 1), "id", getPackageName());
            color[i] = findViewById(colorId);
            check[i] = findViewById(checkId);
        }

        color[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[0], true);
                setCheckColor(check[1], false);
                setCheckColor(check[2], false);
                setCheckColor(check[3], false);
            }
        });

        color[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[1], true);
                setCheckColor(check[0], false);
                setCheckColor(check[2], false);
                setCheckColor(check[3], false);
            }
        });

        color[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[2], true);
                setCheckColor(check[0], false);
                setCheckColor(check[1], false);
                setCheckColor(check[3], false);
            }
        });

        color[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[3], true);
                setCheckColor(check[0], false);
                setCheckColor(check[1], false);
                setCheckColor(check[2], false);
            }
        });


    }

    private void setBackgroundSizeDrawable(View view, boolean selected) {
        final int sdk = android.os.Build.VERSION.SDK_INT;

        if (selected) {
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_round_grey));
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_round_grey));
            }
        } else {
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline));
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline));
            }
        }
    }


    private void setCheckColor(View view, boolean selected) {
        if (selected) view.setVisibility(View.VISIBLE);
        else view.setVisibility(View.INVISIBLE);
    }

    private void addBottomDots(LinearLayout layout_dots, int size, int current) {
        ImageView[] dots = new ImageView[size];

        layout_dots.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new ImageView(this);
            int width_height = 15;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_height, width_height));
            params.setMargins(5, 10, 5, 10);
            dots[i].setLayoutParams(params);
            dots[i].setImageResource(R.drawable.shape_circle);
            dots[i].setColorFilter(ContextCompat.getColor(this, R.color.grey_20), PorterDuff.Mode.SRC_ATOP);
            layout_dots.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[current].setColorFilter(ContextCompat.getColor(this, R.color.grey_100_), PorterDuff.Mode.SRC_ATOP);
        }
    }

    private static class AdapterImageSlider extends PagerAdapter {

        private Activity act;
        private List<Image> items;

        private AdapterImageSlider.OnItemClickListener onItemClickListener;

        private interface OnItemClickListener {
            void onItemClick(View view, Image obj);
        }

        public void setOnItemClickListener(AdapterImageSlider.OnItemClickListener onItemClickListener) {
            this.onItemClickListener = onItemClickListener;
        }

        // constructor
        private AdapterImageSlider(Activity activity, List<Image> items) {
            this.act = activity;
            this.items = items;
        }

        @Override
        public int getCount() {
            return this.items.size();
        }

        public Image getItem(int pos) {
            return items.get(pos);
        }

        public void setItems(List<Image> items) {
            this.items = items;
            notifyDataSetChanged();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((RelativeLayout) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            final Image o = items.get(position);
            LayoutInflater inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = inflater.inflate(R.layout.item_slider_image, container, false);

            ImageView image = (ImageView) v.findViewById(R.id.image);
            MaterialRippleLayout lyt_parent = (MaterialRippleLayout) v.findViewById(R.id.lyt_parent);
            Tools.displayImageOriginal(act, image, o.image);
            lyt_parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(v, o);
                    }
                }
            });

            ((ViewPager) container).addView(v);

            return v;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((RelativeLayout) object);

        }

    }
}