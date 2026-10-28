package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.collection.a3;
import androidx.core.content.res.f;
import androidx.core.provider.q;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(24)
/* loaded from: classes3.dex */
class x0 extends b1 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26297d = "TypefaceCompatApi24Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f26298e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f26299f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f26300g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static final Class<?> f26301h;

    /* renamed from: i, reason: collision with root package name */
    private static final Constructor<?> f26302i;

    /* renamed from: j, reason: collision with root package name */
    private static final Method f26303j;

    /* renamed from: k, reason: collision with root package name */
    private static final Method f26304k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f26302i = constructor;
        f26301h = cls;
        f26303j = method2;
        f26304k = method;
    }

    x0() {
    }

    private static boolean p(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z4) {
        try {
            return ((Boolean) f26303j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(f26301h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f26304k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean r() {
        return f26303j != null;
    }

    private static Object s() {
        try {
            return f26302i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        Object s4 = s();
        if (s4 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            ByteBuffer b5 = c1.b(context, resources, eVar.b());
            if (b5 == null || !p(s4, b5, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return q(s4);
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface d(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        Object s4 = s();
        if (s4 == null) {
            return null;
        }
        a3 a3Var = new a3();
        for (q.c cVar : cVarArr) {
            Uri d5 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) a3Var.get(d5);
            if (byteBuffer == null) {
                byteBuffer = c1.f(context, cancellationSignal, d5);
                a3Var.put(d5, byteBuffer);
            }
            if (byteBuffer == null || !p(s4, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface q4 = q(s4);
        if (q4 == null) {
            return null;
        }
        return Typeface.create(q4, i4);
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.o0
    Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        Typeface typeface2;
        try {
            typeface2 = e1.b(typeface, i4, z4);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.h(context, typeface, i4, z4) : typeface2;
    }
}
