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
import androidx.core.provider.q;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(26)
/* loaded from: classes3.dex */
public class y0 extends w0 {
    private static final int A = -1;

    /* renamed from: t, reason: collision with root package name */
    private static final String f26305t = "TypefaceCompatApi26Impl";

    /* renamed from: u, reason: collision with root package name */
    private static final String f26306u = "android.graphics.FontFamily";

    /* renamed from: v, reason: collision with root package name */
    private static final String f26307v = "addFontFromAssetManager";

    /* renamed from: w, reason: collision with root package name */
    private static final String f26308w = "addFontFromBuffer";

    /* renamed from: x, reason: collision with root package name */
    private static final String f26309x = "createFromFamiliesWithDefault";

    /* renamed from: y, reason: collision with root package name */
    private static final String f26310y = "freeze";

    /* renamed from: z, reason: collision with root package name */
    private static final String f26311z = "abortCreation";

    /* renamed from: m, reason: collision with root package name */
    protected final Class<?> f26312m;

    /* renamed from: n, reason: collision with root package name */
    protected final Constructor<?> f26313n;

    /* renamed from: o, reason: collision with root package name */
    protected final Method f26314o;

    /* renamed from: p, reason: collision with root package name */
    protected final Method f26315p;

    /* renamed from: q, reason: collision with root package name */
    protected final Method f26316q;

    /* renamed from: r, reason: collision with root package name */
    protected final Method f26317r;

    /* renamed from: s, reason: collision with root package name */
    protected final Method f26318s;

    public y0() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = D();
            constructor = E(cls);
            method = A(cls);
            method2 = B(cls);
            method3 = F(cls);
            method4 = z(cls);
            method5 = C(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f26312m = cls;
        this.f26313n = constructor;
        this.f26314o = method;
        this.f26315p = method2;
        this.f26316q = method3;
        this.f26317r = method4;
        this.f26318s = method5;
    }

    @androidx.annotation.q0
    private Object t() {
        try {
            return this.f26313n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void u(Object obj) {
        try {
            this.f26317r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean v(Context context, Object obj, String str, int i4, int i5, int i6, @androidx.annotation.q0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f26314o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean w(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f26315p.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean x(Object obj) {
        try {
            return ((Boolean) this.f26316q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean y() {
        return this.f26314o != null;
    }

    protected Method A(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> D() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> E(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    protected Method F(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }

    @Override // androidx.core.graphics.w0, androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        if (!y()) {
            return super.b(context, dVar, resources, i4);
        }
        Object t4 = t();
        if (t4 == null) {
            return null;
        }
        for (f.e eVar : dVar.a()) {
            if (!v(context, t4, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                u(t4);
                return null;
            }
        }
        if (x(t4)) {
            return q(t4);
        }
        return null;
    }

    @Override // androidx.core.graphics.w0, androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface d(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        Typeface q4;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!y()) {
            q.c m4 = m(cVarArr, i4);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m4.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m4.e()).setItalic(m4.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h4 = c1.h(context, cVarArr, cancellationSignal);
        Object t4 = t();
        if (t4 == null) {
            return null;
        }
        boolean z4 = false;
        for (q.c cVar : cVarArr) {
            ByteBuffer byteBuffer = h4.get(cVar.d());
            if (byteBuffer != null) {
                if (!w(t4, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    u(t4);
                    return null;
                }
                z4 = true;
            }
        }
        if (!z4) {
            u(t4);
            return null;
        }
        if (x(t4) && (q4 = q(t4)) != null) {
            return Typeface.create(q4, i4);
        }
        return null;
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    @androidx.annotation.x0(29)
    public /* bridge */ /* synthetic */ Typeface e(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 List list, int i4) {
        return super.e(context, cancellationSignal, list, i4);
    }

    @Override // androidx.core.graphics.b1
    @androidx.annotation.q0
    public Typeface g(Context context, Resources resources, int i4, String str, int i5) {
        if (!y()) {
            return super.g(context, resources, i4, str, i5);
        }
        Object t4 = t();
        if (t4 == null) {
            return null;
        }
        if (!v(context, t4, str, 0, -1, -1, null)) {
            u(t4);
            return null;
        }
        if (x(t4)) {
            return q(t4);
        }
        return null;
    }

    @Override // androidx.core.graphics.w0, androidx.core.graphics.b1
    @androidx.annotation.o0
    Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        Typeface typeface2;
        try {
            typeface2 = f1.b(typeface, i4, z4);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? super.h(context, typeface, i4, z4) : typeface2;
    }

    @androidx.annotation.q0
    protected Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f26312m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f26318s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method z(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }
}
