package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.graphics.q;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4817a = "\udfffd";

    /* renamed from: b, reason: collision with root package name */
    private static final String f4818b = "m";

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.m<Rect, Rect>> f4819c = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* compiled from: PaintCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private y1() {
    }

    public static boolean a(@androidx.annotation.o0 Paint paint, @androidx.annotation.o0 String str) {
        return a.a(paint, str);
    }

    private static androidx.core.util.m<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.m<Rect, Rect>> threadLocal = f4819c;
        androidx.core.util.m<Rect, Rect> mVar = threadLocal.get();
        if (mVar == null) {
            androidx.core.util.m<Rect, Rect> mVar2 = new androidx.core.util.m<>(new Rect(), new Rect());
            threadLocal.set(mVar2);
            return mVar2;
        }
        mVar.f5251a.setEmpty();
        mVar.f5252b.setEmpty();
        return mVar;
    }

    public static boolean c(@androidx.annotation.o0 Paint paint, @androidx.annotation.q0 p pVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, pVar != null ? q.b.a(pVar) : null);
            return true;
        }
        if (pVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode a6 = q.a(pVar);
        paint.setXfermode(a6 != null ? new PorterDuffXfermode(a6) : null);
        return a6 != null;
    }
}
