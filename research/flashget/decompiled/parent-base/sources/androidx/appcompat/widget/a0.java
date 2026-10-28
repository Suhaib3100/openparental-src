package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.c1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1708a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1709b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f1710c = new Rect();

    /* compiled from: DrawableUtils.java */
    @androidx.annotation.x0(18)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f1711a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f1712b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f1713c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f1714d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f1715e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f1716f;

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                androidx.appcompat.widget.a0.a.f1712b = r4
                androidx.appcompat.widget.a0.a.f1713c = r5
                androidx.appcompat.widget.a0.a.f1714d = r6
                androidx.appcompat.widget.a0.a.f1715e = r7
                androidx.appcompat.widget.a0.a.f1716f = r3
                androidx.appcompat.widget.a0.a.f1711a = r0
                goto L63
            L57:
                androidx.appcompat.widget.a0.a.f1712b = r1
                androidx.appcompat.widget.a0.a.f1713c = r1
                androidx.appcompat.widget.a0.a.f1714d = r1
                androidx.appcompat.widget.a0.a.f1715e = r1
                androidx.appcompat.widget.a0.a.f1716f = r1
                androidx.appcompat.widget.a0.a.f1711a = r2
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.a.<clinit>():void");
        }

        private a() {
        }

        @androidx.annotation.o0
        static Rect a(@androidx.annotation.o0 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1711a) {
                try {
                    Object invoke = f1712b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f1713c.getInt(invoke), f1714d.getInt(invoke), f1715e.getInt(invoke), f1716f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return a0.f1710c;
        }
    }

    /* compiled from: DrawableUtils.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private a0() {
    }

    public static boolean a(@androidx.annotation.o0 Drawable drawable) {
        return true;
    }

    static void b(@androidx.annotation.o0 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || i4 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1708a);
        } else {
            drawable.setState(f1709b);
        }
        drawable.setState(state);
    }

    @androidx.annotation.o0
    public static Rect d(@androidx.annotation.o0 Drawable drawable) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.d.q(drawable));
        }
        Insets a5 = b.a(drawable);
        i4 = a5.left;
        i5 = a5.top;
        i6 = a5.right;
        i7 = a5.bottom;
        return new Rect(i4, i5, i6, i7);
    }

    public static PorterDuff.Mode e(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
