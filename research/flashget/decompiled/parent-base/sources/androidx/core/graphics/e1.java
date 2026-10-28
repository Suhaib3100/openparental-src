package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.c1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WeightTypefaceApi21.java */
@androidx.annotation.c1({c1.a.LIBRARY})
@SuppressLint({"SoonBlockedPrivateApi"})
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
final class e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26249a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26250b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26251c = "nativeCreateFromTypeface";

    /* renamed from: d, reason: collision with root package name */
    private static final String f26252d = "nativeCreateWeightAlias";

    /* renamed from: e, reason: collision with root package name */
    private static final Field f26253e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f26254f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f26255g;

    /* renamed from: h, reason: collision with root package name */
    private static final Constructor<Typeface> f26256h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.e1<SparseArray<Typeface>> f26257i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f26258j;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f26253e = field;
        f26254f = method;
        f26255g = method2;
        f26256h = constructor;
        f26257i = new androidx.collection.e1<>(3);
        f26258j = new Object();
    }

    private e1() {
    }

    @androidx.annotation.q0
    private static Typeface a(long j4) {
        try {
            return f26256h.newInstance(Long.valueOf(j4));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    static Typeface b(@androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        if (!d()) {
            return null;
        }
        int i5 = (i4 << 1) | (z4 ? 1 : 0);
        synchronized (f26258j) {
            try {
                long c5 = c(typeface);
                androidx.collection.e1<SparseArray<Typeface>> e1Var = f26257i;
                SparseArray<Typeface> i6 = e1Var.i(c5);
                if (i6 == null) {
                    i6 = new SparseArray<>(4);
                    e1Var.p(c5, i6);
                } else {
                    Typeface typeface2 = i6.get(i5);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface a5 = z4 == typeface.isItalic() ? a(f(c5, i4)) : a(e(c5, i4, z4));
                i6.put(i5, a5);
                return a5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(@androidx.annotation.o0 Typeface typeface) {
        try {
            return f26253e.getLong(typeface);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        return f26253e != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j4, int i4, boolean z4) {
        try {
            Long l4 = (Long) f26254f.invoke(null, Long.valueOf(j4), Integer.valueOf(z4 ? 2 : 0));
            l4.longValue();
            return ((Long) f26255g.invoke(null, l4, Integer.valueOf(i4))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long f(long j4, int i4) {
        try {
            return ((Long) f26255g.invoke(null, Long.valueOf(j4), Integer.valueOf(i4))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }
}
