package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import androidx.core.provider.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
class w0 extends b1 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26288d = "TypefaceCompatApi21Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f26289e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f26290f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f26291g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static Class<?> f26292h;

    /* renamed from: i, reason: collision with root package name */
    private static Constructor<?> f26293i;

    /* renamed from: j, reason: collision with root package name */
    private static Method f26294j;

    /* renamed from: k, reason: collision with root package name */
    private static Method f26295k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f26296l;

    w0() {
    }

    private static boolean p(Object obj, String str, int i4, boolean z4) {
        s();
        try {
            return ((Boolean) f26294j.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface q(Object obj) {
        s();
        try {
            Object newInstance = Array.newInstance(f26292h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f26295k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private File r(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void s() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f26296l) {
            return;
        }
        f26296l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f26293i = constructor;
        f26292h = cls;
        f26294j = method2;
        f26295k = method;
    }

    private static Object t() {
        s();
        try {
            return f26293i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // androidx.core.graphics.b1
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        Object t4 = t();
        for (f.e eVar : dVar.a()) {
            File e4 = c1.e(context);
            if (e4 == null) {
                return null;
            }
            try {
                if (!c1.c(e4, resources, eVar.b())) {
                    return null;
                }
                if (!p(t4, e4.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e4.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e4.delete();
            }
        }
        return q(t4);
    }

    @Override // androidx.core.graphics.b1
    public Typeface d(Context context, CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File r4 = r(openFileDescriptor);
                if (r4 != null && r4.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(r4);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface f4 = super.f(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return f4;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
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
