package q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.c1;
import androidx.annotation.f;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.internal.n;
import n1.a;

/* compiled from: MaterialDialogs.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class c {
    private c() {
    }

    @o0
    public static Rect a(@o0 Context context, @f int i5, int i6) {
        TypedArray j5 = n.j(context, null, a.o.Pi, i5, i6, new int[0]);
        int dimensionPixelSize = j5.getDimensionPixelSize(a.o.Si, context.getResources().getDimensionPixelSize(a.f.J2));
        int dimensionPixelSize2 = j5.getDimensionPixelSize(a.o.Ti, context.getResources().getDimensionPixelSize(a.f.K2));
        int dimensionPixelSize3 = j5.getDimensionPixelSize(a.o.Ri, context.getResources().getDimensionPixelSize(a.f.I2));
        int dimensionPixelSize4 = j5.getDimensionPixelSize(a.o.Qi, context.getResources().getDimensionPixelSize(a.f.H2));
        j5.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @o0
    public static InsetDrawable b(@q0 Drawable drawable, @o0 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
