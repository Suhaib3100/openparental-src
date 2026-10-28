package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: EdgeEffectCompat.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final EdgeEffect f27587a;

    /* compiled from: EdgeEffectCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static void a(EdgeEffect edgeEffect, float f4, float f5) {
            edgeEffect.onPull(f4, f5);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    @x0(31)
    private static class b {
        private b() {
        }

        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f4, float f5) {
            try {
                return edgeEffect.onPullDistance(f4, f5);
            } catch (Throwable unused) {
                edgeEffect.onPull(f4, f5);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public i(Context context) {
        this.f27587a = new EdgeEffect(context);
    }

    @o0
    public static EdgeEffect a(@o0 Context context, @q0 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float d(@o0 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@o0 EdgeEffect edgeEffect, float f4, float f5) {
        a.a(edgeEffect, f4, f5);
    }

    public static float j(@o0 EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f4, f5);
        }
        a.a(edgeEffect, f4, f5);
        return f4;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f27587a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f27587a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f27587a.isFinished();
    }

    @Deprecated
    public boolean f(int i4) {
        this.f27587a.onAbsorb(i4);
        return true;
    }

    @Deprecated
    public boolean h(float f4) {
        this.f27587a.onPull(f4);
        return true;
    }

    @Deprecated
    public boolean i(float f4, float f5) {
        a.a(this.f27587a, f4, f5);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f27587a.onRelease();
        return this.f27587a.isFinished();
    }

    @Deprecated
    public void l(int i4, int i5) {
        this.f27587a.setSize(i4, i5);
    }
}
