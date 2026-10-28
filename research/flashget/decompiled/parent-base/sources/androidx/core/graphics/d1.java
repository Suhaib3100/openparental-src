package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import java.lang.reflect.Field;

/* compiled from: WeightTypefaceApi14.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
final class d1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26180a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26181b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final Field f26182c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("sWeightCacheLock")
    private static final androidx.collection.e1<SparseArray<Typeface>> f26183d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f26184e;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        f26182c = field;
        f26183d = new androidx.collection.e1<>(3);
        f26184e = new Object();
    }

    private d1() {
    }

    @androidx.annotation.q0
    static Typeface a(@androidx.annotation.o0 b1 b1Var, @androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        if (!d()) {
            return null;
        }
        int i5 = (i4 << 1) | (z4 ? 1 : 0);
        synchronized (f26184e) {
            try {
                long c5 = c(typeface);
                androidx.collection.e1<SparseArray<Typeface>> e1Var = f26183d;
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
                Typeface b5 = b(b1Var, context, typeface, i4, z4);
                if (b5 == null) {
                    b5 = e(typeface, i4, z4);
                }
                i6.put(i5, b5);
                return b5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.q0
    private static Typeface b(@androidx.annotation.o0 b1 b1Var, @androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        f.d n4 = b1Var.n(typeface);
        if (n4 == null) {
            return null;
        }
        return b1Var.c(context, n4, context.getResources(), i4, z4);
    }

    private static long c(@androidx.annotation.o0 Typeface typeface) {
        try {
            return ((Number) f26182c.get(typeface)).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        return f26182c != null;
    }

    private static Typeface e(Typeface typeface, int i4, boolean z4) {
        boolean z5 = i4 >= 600;
        return Typeface.create(typeface, (z5 || z4) ? !z5 ? 2 : !z4 ? 1 : 3 : 0);
    }
}
