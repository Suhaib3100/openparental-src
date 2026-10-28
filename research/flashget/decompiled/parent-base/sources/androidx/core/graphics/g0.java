package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.graphics.f;

/* compiled from: PaintCompat.java */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26268a = "\udfffd";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26269b = "m";

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.s<Rect, Rect>> f26270c = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* compiled from: PaintCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private g0() {
    }

    public static boolean a(@androidx.annotation.o0 Paint paint, @androidx.annotation.o0 String str) {
        return paint.hasGlyph(str);
    }

    private static androidx.core.util.s<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.s<Rect, Rect>> threadLocal = f26270c;
        androidx.core.util.s<Rect, Rect> sVar = threadLocal.get();
        if (sVar == null) {
            androidx.core.util.s<Rect, Rect> sVar2 = new androidx.core.util.s<>(new Rect(), new Rect());
            threadLocal.set(sVar2);
            return sVar2;
        }
        sVar.f26881a.setEmpty();
        sVar.f26882b.setEmpty();
        return sVar;
    }

    public static boolean c(@androidx.annotation.o0 Paint paint, @androidx.annotation.q0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, eVar != null ? f.b.a(eVar) : null);
            return true;
        }
        if (eVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode a5 = f.a(eVar);
        paint.setXfermode(a5 != null ? new PorterDuffXfermode(a5) : null);
        return a5 != null;
    }
}
