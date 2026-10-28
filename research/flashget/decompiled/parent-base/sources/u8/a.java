package u8;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.f;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.x;
import androidx.core.graphics.z;
import com.google.android.material.resources.b;

/* compiled from: MaterialColors.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f92741a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f92742b = 0.54f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f92743c = 0.38f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f92744d = 0.32f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f92745e = 0.12f;

    private a() {
    }

    @l
    public static int a(@l int i4, @g0(from = 0, to = 255) int i5) {
        return z.D(i4, (Color.alpha(i4) * i5) / 255);
    }

    @l
    public static int b(@o0 Context context, @f int i4, @l int i5) {
        TypedValue a5 = b.a(context, i4);
        return a5 != null ? a5.data : i5;
    }

    @l
    public static int c(Context context, @f int i4, String str) {
        return b.g(context, i4, str);
    }

    @l
    public static int d(@o0 View view, @f int i4) {
        return b.h(view, i4);
    }

    @l
    public static int e(@o0 View view, @f int i4, @l int i5) {
        return b(view.getContext(), i4, i5);
    }

    public static boolean f(@l int i4) {
        return i4 != 0 && z.n(i4) > 0.5d;
    }

    @l
    public static int g(@l int i4, @l int i5) {
        return z.v(i5, i4);
    }

    @l
    public static int h(@l int i4, @l int i5, @x(from = 0.0d, to = 1.0d) float f4) {
        return z.v(z.D(i5, Math.round(Color.alpha(i5) * f4)), i4);
    }

    @l
    public static int i(@o0 View view, @f int i4, @f int i5) {
        return j(view, i4, i5, 1.0f);
    }

    @l
    public static int j(@o0 View view, @f int i4, @f int i5, @x(from = 0.0d, to = 1.0d) float f4) {
        return h(b.h(view, i4), b.h(view, i5), f4);
    }
}
