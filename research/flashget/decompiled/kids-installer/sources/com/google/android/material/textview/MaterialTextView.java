package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@o0 Context context) {
        this(context, null);
    }

    private void u(@o0 Resources.Theme theme, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i5, a.o.uk);
        int x5 = x(getContext(), obtainStyledAttributes, a.o.wk, a.o.xk);
        obtainStyledAttributes.recycle();
        if (x5 >= 0) {
            setLineHeight(x5);
        }
    }

    private static boolean v(Context context) {
        return b.b(context, a.c.se, true);
    }

    private static int w(@o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i5, int i6) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.yk, i5, i6);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.zk, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int x(@o0 Context context, @o0 TypedArray typedArray, @o0 @i1 int... iArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < iArr.length && i5 < 0; i6++) {
            i5 = c.c(context, typedArray, iArr[i6], -1);
        }
        return i5;
    }

    private static boolean y(@o0 Context context, @o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i5, int i6) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.yk, i5, i6);
        int x5 = x(context, obtainStyledAttributes, a.o.Ak, a.o.Bk);
        obtainStyledAttributes.recycle();
        return x5 != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@o0 Context context, int i5) {
        super.setTextAppearance(context, i5);
        if (v(context)) {
            u(context.getTheme(), i5);
        }
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, 0);
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
        super(v1.a.c(context, attributeSet, i5, i6), attributeSet, i5);
        int w5;
        Context context2 = getContext();
        if (v(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (y(context2, theme, attributeSet, i5, i6) || (w5 = w(theme, attributeSet, i5, i6)) == -1) {
                return;
            }
            u(theme, w5);
        }
    }
}
