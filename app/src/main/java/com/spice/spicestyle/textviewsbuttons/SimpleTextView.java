package com.spice.spicestyle.textviewsbuttons;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Yaashvi Software on 3/29/2017.
 */

public class SimpleTextView extends AppCompatTextView {
    private Context context;

    public SimpleTextView(Context context) {
        super(context);
        this.context = context;
        customize();
    }

    public SimpleTextView(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        this.context = context;
        customize();
    }

    public SimpleTextView(Context context, AttributeSet attr) {
        super(context, attr);
        this.context = context;
        customize();
    }

    private void customize() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "roboto_regular.ttf");
        setTypeface(font);
        //setTextColor(SplashActivity.res.getColor(R.color.selection_tv_textcolor));
        /*LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        llp.setMargins(0, SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_margint_top), 0, 0);
        setLayoutParams(llp);*/

        //setBackgroundResource(R.drawable.selection_text_bg);
        //left, top ,right , bottom
        /*setPadding(SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_padding_left),
                SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_padding_top),
                SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_padding_left),
                SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_padding_bottom));*/

        /*ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) getLayoutParams();
        mlp.setMargins(0, SplashActivity.res.getDimensionPixelSize(R.dimen.selection_tv_margint_top), 0, 0);*/
    }
}
