package com.sematech.android.basic.farvardin98;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class VazirTextView extends AppCompatTextView {
    public VazirTextView(Context context) {
        super(context);
    }

    public VazirTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.VazirTextView);
        String fontName = a.getString(R.styleable.VazirTextView_fontName);


        String font = "";
        if (fontName != null)
            font = fontName;
        else
            font = "vazir.ttf";


        Typeface typeface = Typeface.createFromAsset(context.getAssets(), font);

        this.setTypeface(typeface);
    }
}
