package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import androidx.core.provider.h;
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
class n2 extends j3 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4779d = "TypefaceCompatApi24Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4780e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f4781f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f4782g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static final Class<?> f4783h;

    /* renamed from: i, reason: collision with root package name */
    private static final Constructor<?> f4784i;

    /* renamed from: j, reason: collision with root package name */
    private static final Method f4785j;

    /* renamed from: k, reason: collision with root package name */
    private static final Method f4786k;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f4784i = constructor;
        f4783h = cls;
        f4785j = method2;
        f4786k = method;
    }

    n2() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i5, int i6, boolean z5) {
        try {
            return ((Boolean) f4785j.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4783h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4786k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        return f4785j != null;
    }

    private static Object n() {
        try {
            return f4784i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.j3
    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i5) {
        Object n5 = n();
        if (n5 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            ByteBuffer b6 = k3.b(context, resources, eVar.b());
            if (b6 == null || !k(n5, b6, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return l(n5);
    }

    @Override // androidx.core.graphics.j3
    @androidx.annotation.q0
    public Typeface c(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 h.c[] cVarArr, int i5) {
        Object n5 = n();
        if (n5 == null) {
            return null;
        }
        androidx.collection.i iVar = new androidx.collection.i();
        for (h.c cVar : cVarArr) {
            Uri d6 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(d6, null);
            if (byteBuffer == null) {
                byteBuffer = k3.f(context, cancellationSignal, d6);
                iVar.put(d6, byteBuffer);
            }
            if (byteBuffer == null || !k(n5, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface l5 = l(n5);
        if (l5 == null) {
            return null;
        }
        return Typeface.create(l5, i5);
    }
}
