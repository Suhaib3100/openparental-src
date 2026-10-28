package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.c1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WeightTypefaceApi26.java */
@androidx.annotation.c1({c1.a.LIBRARY})
@SuppressLint({"SoonBlockedPrivateApi"})
@androidx.annotation.x0(26)
/* loaded from: classes3.dex */
final class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26260a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26261b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26262c = "nativeCreateFromTypefaceWithExactStyle";

    /* renamed from: d, reason: collision with root package name */
    private static final Field f26263d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f26264e;

    /* renamed from: f, reason: collision with root package name */
    private static final Constructor<Typeface> f26265f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.e1<SparseArray<Typeface>> f26266g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f26267h;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            constructor = null;
            method = null;
        }
        f26263d = field;
        f26264e = method;
        f26265f = constructor;
        f26266g = new androidx.collection.e1<>(3);
        f26267h = new Object();
    }

    private f1() {
    }

    @androidx.annotation.q0
    private static Typeface a(long j4) {
        try {
            return f26265f.newInstance(Long.valueOf(j4));
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
        synchronized (f26267h) {
            try {
                long c5 = c(typeface);
                androidx.collection.e1<SparseArray<Typeface>> e1Var = f26266g;
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
                Typeface a5 = a(e(c5, i4, z4));
                i6.put(i5, a5);
                return a5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(@androidx.annotation.o0 Typeface typeface) {
        try {
            return f26263d.getLong(typeface);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        return f26263d != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j4, int i4, boolean z4) {
        try {
            return ((Long) f26264e.invoke(null, Long.valueOf(j4), Integer.valueOf(i4), Boolean.valueOf(z4))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }
}
