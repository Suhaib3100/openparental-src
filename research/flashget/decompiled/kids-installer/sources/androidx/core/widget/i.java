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
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final EdgeEffect f5895a;

    /* compiled from: EdgeEffectCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(EdgeEffect edgeEffect, float f6, float f7) {
            edgeEffect.onPull(f6, f7);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    @x0(31)
    private static class b {
        private b() {
        }

        @androidx.annotation.u
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @androidx.annotation.u
        public static float b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @androidx.annotation.u
        public static float c(EdgeEffect edgeEffect, float f6, float f7) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f6, f7);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f6, f7);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public i(Context context) {
        this.f5895a = new EdgeEffect(context);
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

    public static void g(@o0 EdgeEffect edgeEffect, float f6, float f7) {
        a.a(edgeEffect, f6, f7);
    }

    public static float j(@o0 EdgeEffect edgeEffect, float f6, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f6, f7);
        }
        a.a(edgeEffect, f6, f7);
        return f6;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f5895a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f5895a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f5895a.isFinished();
    }

    @Deprecated
    public boolean f(int i5) {
        this.f5895a.onAbsorb(i5);
        return true;
    }

    @Deprecated
    public boolean h(float f6) {
        this.f5895a.onPull(f6);
        return true;
    }

    @Deprecated
    public boolean i(float f6, float f7) {
        a.a(this.f5895a, f6, f7);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f5895a.onRelease();
        return this.f5895a.isFinished();
    }

    @Deprecated
    public void l(int i5, int i6) {
        this.f5895a.setSize(i5, i6);
    }
}
