package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(26)
/* loaded from: classes3.dex */
public class s2 extends m2 {
    private static final int A = -1;

    /* renamed from: t, reason: collision with root package name */
    private static final String f4796t = "TypefaceCompatApi26Impl";

    /* renamed from: u, reason: collision with root package name */
    private static final String f4797u = "android.graphics.FontFamily";

    /* renamed from: v, reason: collision with root package name */
    private static final String f4798v = "addFontFromAssetManager";

    /* renamed from: w, reason: collision with root package name */
    private static final String f4799w = "addFontFromBuffer";

    /* renamed from: x, reason: collision with root package name */
    private static final String f4800x = "createFromFamiliesWithDefault";

    /* renamed from: y, reason: collision with root package name */
    private static final String f4801y = "freeze";

    /* renamed from: z, reason: collision with root package name */
    private static final String f4802z = "abortCreation";

    /* renamed from: m, reason: collision with root package name */
    protected final Class<?> f4803m;

    /* renamed from: n, reason: collision with root package name */
    protected final Constructor<?> f4804n;

    /* renamed from: o, reason: collision with root package name */
    protected final Method f4805o;

    /* renamed from: p, reason: collision with root package name */
    protected final Method f4806p;

    /* renamed from: q, reason: collision with root package name */
    protected final Method f4807q;

    /* renamed from: r, reason: collision with root package name */
    protected final Method f4808r;

    /* renamed from: s, reason: collision with root package name */
    protected final Method f4809s;

    public s2() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = y();
            constructor = z(cls);
            method = v(cls);
            method2 = w(cls);
            method3 = A(cls);
            method4 = u(cls);
            method5 = x(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f4803m = cls;
        this.f4804n = constructor;
        this.f4805o = method;
        this.f4806p = method2;
        this.f4807q = method3;
        this.f4808r = method4;
        this.f4809s = method5;
    }

    @androidx.annotation.q0
    private Object o() {
        try {
            return this.f4804n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.f4808r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i5, int i6, int i7, @androidx.annotation.q0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4805o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i5, int i6, int i7) {
        try {
            return ((Boolean) this.f4806p.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Integer.valueOf(i7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f4807q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        return this.f4805o != null;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // androidx.core.graphics.m2, androidx.core.graphics.j3
    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i5) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!t()) {
            return super.b(context, dVar, resources, i5);
        }
        Object o5 = o();
        if (o5 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            String a6 = eVar.a();
            int c6 = eVar.c();
            int e6 = eVar.e();
            boolean f6 = eVar.f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(eVar.d());
            if (!q(context, o5, a6, c6, e6, f6 ? 1 : 0, fromFontVariationSettings)) {
                p(o5);
                return null;
            }
        }
        if (s(o5)) {
            return l(o5);
        }
        return null;
    }

    @Override // androidx.core.graphics.m2, androidx.core.graphics.j3
    @androidx.annotation.q0
    public Typeface c(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 h.c[] cVarArr, int i5) {
        Typeface l5;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            h.c h5 = h(cVarArr, i5);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h5.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h5.e()).setItalic(h5.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h6 = k3.h(context, cVarArr, cancellationSignal);
        Object o5 = o();
        if (o5 == null) {
            return null;
        }
        boolean z5 = false;
        for (h.c cVar : cVarArr) {
            ByteBuffer byteBuffer = h6.get(cVar.d());
            if (byteBuffer != null) {
                if (!r(o5, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    p(o5);
                    return null;
                }
                z5 = true;
            }
        }
        if (!z5) {
            p(o5);
            return null;
        }
        if (s(o5) && (l5 = l(o5)) != null) {
            return Typeface.create(l5, i5);
        }
        return null;
    }

    @Override // androidx.core.graphics.j3
    @androidx.annotation.q0
    public Typeface e(Context context, Resources resources, int i5, String str, int i6) {
        if (!t()) {
            return super.e(context, resources, i5, str, i6);
        }
        Object o5 = o();
        if (o5 == null) {
            return null;
        }
        if (!q(context, o5, str, 0, -1, -1, null)) {
            p(o5);
            return null;
        }
        if (s(o5)) {
            return l(o5);
        }
        return null;
    }

    @androidx.annotation.q0
    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4803m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4809s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
