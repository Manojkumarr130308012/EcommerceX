package app.ecommerce.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import app.ecommerce.ui.R;
import app.ecommerce.ui.activity.home.HomeMedical;
import app.ecommerce.ui.utils.CarouselLinearLayout;

public class FragmentHomeMedical extends Fragment {

    private static final String POSITON = "position";
    private static final String SCALE = "scale";

    private int screenWidth;
    private int screenHeight;

    private int[] imageArray = new int[]{R.drawable.doctor1, R.drawable.doctor2,
            R.drawable.doctor3};

    private String[] nameArray = new String[]{
            "Dr. Saina Zaman",
            "Dr. Seuza Lorena",
            "Dr. Angela Angel"
    };

    public static Fragment newInstance(HomeMedical context, int pos, float scale) {
        Bundle b = new Bundle();
        b.putInt(POSITON, pos);
        b.putFloat(SCALE, scale);

        return Fragment.instantiate(context, FragmentHomeMedical.class.getName(), b);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWidthAndHeight();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        final int postion = this.getArguments().getInt(POSITON);
        float scale = this.getArguments().getFloat(SCALE);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int)(screenWidth / 1.1), (int)(screenHeight / 2));
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_home_medical, container, false);

        LinearLayout layoutContent = (LinearLayout) linearLayout.findViewById(R.id.layout_content);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.images);
        TextView name = (TextView) linearLayout.findViewById(R.id.name);
        CarouselLinearLayout root = (CarouselLinearLayout) linearLayout.findViewById(R.id.root_container);

        layoutContent.setLayoutParams(layoutParams);
        imageView.setImageResource(imageArray[postion]);
        name.setText(nameArray[postion]);

        root.setScaleBoth(scale);

        return linearLayout;
    }

    private void getWidthAndHeight() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        screenHeight = displaymetrics.heightPixels;
        screenWidth = displaymetrics.widthPixels;
    }
}
