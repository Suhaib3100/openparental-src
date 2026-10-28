package s1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.core.graphics.r1;
import com.google.android.material.internal.v;
import com.google.android.material.resources.b;
import n1.a;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final float f33430e = 4.5f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f33431f = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33432a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33433b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33434c;

    /* renamed from: d, reason: collision with root package name */
    private final float f33435d;

    public a(@o0 Context context) {
        this.f33432a = b.b(context, a.c.I4, false);
        this.f33433b = p1.a.b(context, a.c.H4, 0);
        this.f33434c = p1.a.b(context, a.c.Q2, 0);
        this.f33435d = context.getResources().getDisplayMetrics().density;
    }

    private boolean m(@l int i5) {
        return r1.B(i5, 255) == this.f33434c;
    }

    public int a(float f6) {
        return Math.round(b(f6) * 255.0f);
    }

    public float b(float f6) {
        if (this.f33435d <= 0.0f || f6 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f6 / r0)) * f33430e) + f33431f) / 100.0f, 1.0f);
    }

    @l
    public int c(@l int i5, float f6) {
        float b6 = b(f6);
        return r1.B(p1.a.h(r1.B(i5, 255), this.f33433b, b6), Color.alpha(i5));
    }

    @l
    public int d(@l int i5, float f6, @o0 View view) {
        return c(i5, i(view) + f6);
    }

    @l
    public int e(@l int i5, float f6) {
        return (this.f33432a && m(i5)) ? c(i5, f6) : i5;
    }

    @l
    public int f(@l int i5, float f6, @o0 View view) {
        return e(i5, i(view) + f6);
    }

    @l
    public int g(float f6) {
        return e(this.f33434c, f6);
    }

    @l
    public int h(float f6, @o0 View view) {
        return g(i(view) + f6);
    }

    public float i(@o0 View view) {
        return v.i(view);
    }

    @l
    public int j() {
        return this.f33433b;
    }

    @l
    public int k() {
        return this.f33434c;
    }

    public boolean l() {
        return this.f33432a;
    }
}
