package com.luck.picture.lib.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.q0;

/* loaded from: classes6.dex */
public class MarqueeTextView extends MediumBoldTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z4, int i4, Rect rect) {
        if (z4) {
            super.onFocusChanged(true, i4, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z4) {
        if (z4) {
            super.onWindowFocusChanged(true);
        }
    }

    public MarqueeTextView(Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
