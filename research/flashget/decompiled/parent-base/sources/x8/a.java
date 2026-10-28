package x8;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.core.graphics.z;
import com.google.android.material.internal.v;
import com.google.android.material.resources.b;
import s8.a;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final float f92939e = 4.5f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f92940f = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f92941a;

    /* renamed from: b, reason: collision with root package name */
    private final int f92942b;

    /* renamed from: c, reason: collision with root package name */
    private final int f92943c;

    /* renamed from: d, reason: collision with root package name */
    private final float f92944d;

    public a(@o0 Context context) {
        this.f92941a = b.b(context, a.c.H4, false);
        this.f92942b = u8.a.b(context, a.c.G4, 0);
        this.f92943c = u8.a.b(context, a.c.P2, 0);
        this.f92944d = context.getResources().getDisplayMetrics().density;
    }

    private boolean m(@l int i4) {
        return z.D(i4, 255) == this.f92943c;
    }

    public int a(float f4) {
        return Math.round(b(f4) * 255.0f);
    }

    public float b(float f4) {
        if (this.f92944d <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f4 / r0)) * f92939e) + 2.0f) / 100.0f, 1.0f);
    }

    @l
    public int c(@l int i4, float f4) {
        float b5 = b(f4);
        return z.D(u8.a.h(z.D(i4, 255), this.f92942b, b5), Color.alpha(i4));
    }

    @l
    public int d(@l int i4, float f4, @o0 View view) {
        return c(i4, i(view) + f4);
    }

    @l
    public int e(@l int i4, float f4) {
        return (this.f92941a && m(i4)) ? c(i4, f4) : i4;
    }

    @l
    public int f(@l int i4, float f4, @o0 View view) {
        return e(i4, i(view) + f4);
    }

    @l
    public int g(float f4) {
        return e(this.f92943c, f4);
    }

    @l
    public int h(float f4, @o0 View view) {
        return g(i(view) + f4);
    }

    public float i(@o0 View view) {
        return v.i(view);
    }

    @l
    public int j() {
        return this.f92942b;
    }

    @l
    public int k() {
        return this.f92943c;
    }

    public boolean l() {
        return this.f92941a;
    }
}
