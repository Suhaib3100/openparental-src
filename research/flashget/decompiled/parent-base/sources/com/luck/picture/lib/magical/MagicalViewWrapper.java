package com.luck.picture.lib.magical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.f0;

/* loaded from: classes6.dex */
public class MagicalViewWrapper {
    private final ViewGroup.MarginLayoutParams params;
    private final View viewWrapper;

    public MagicalViewWrapper(View view) {
        this.viewWrapper = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.params = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = f0.f27129b;
        }
    }

    public int getHeight() {
        return this.params.height;
    }

    public int getMarginBottom() {
        return this.params.bottomMargin;
    }

    public int getMarginLeft() {
        return this.params.leftMargin;
    }

    public int getMarginRight() {
        return this.params.rightMargin;
    }

    public int getMarginTop() {
        return this.params.topMargin;
    }

    public int getWidth() {
        return this.params.width;
    }

    public void setHeight(float f4) {
        this.params.height = Math.round(f4);
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginBottom(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.params;
        marginLayoutParams.bottomMargin = i4;
        this.viewWrapper.setLayoutParams(marginLayoutParams);
    }

    public void setMarginLeft(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.params;
        marginLayoutParams.leftMargin = i4;
        this.viewWrapper.setLayoutParams(marginLayoutParams);
    }

    public void setMarginRight(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.params;
        marginLayoutParams.rightMargin = i4;
        this.viewWrapper.setLayoutParams(marginLayoutParams);
    }

    public void setMarginTop(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.params;
        marginLayoutParams.topMargin = i4;
        this.viewWrapper.setLayoutParams(marginLayoutParams);
    }

    public void setWidth(float f4) {
        this.params.width = Math.round(f4);
        this.viewWrapper.setLayoutParams(this.params);
    }
}
