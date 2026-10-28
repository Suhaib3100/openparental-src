package v8;

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
import s8.a;

/* compiled from: MaterialDialogs.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class c {
    private c() {
    }

    @o0
    public static Rect a(@o0 Context context, @f int i4, int i5) {
        TypedArray j4 = n.j(context, null, a.o.ik, i4, i5, new int[0]);
        int dimensionPixelSize = j4.getDimensionPixelSize(a.o.lk, context.getResources().getDimensionPixelSize(a.f.J2));
        int dimensionPixelSize2 = j4.getDimensionPixelSize(a.o.mk, context.getResources().getDimensionPixelSize(a.f.K2));
        int dimensionPixelSize3 = j4.getDimensionPixelSize(a.o.kk, context.getResources().getDimensionPixelSize(a.f.I2));
        int dimensionPixelSize4 = j4.getDimensionPixelSize(a.o.jk, context.getResources().getDimensionPixelSize(a.f.H2));
        j4.recycle();
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
