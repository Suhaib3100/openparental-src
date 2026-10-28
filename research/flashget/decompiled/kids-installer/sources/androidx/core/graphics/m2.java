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
import androidx.core.provider.h;
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
class m2 extends j3 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4770d = "TypefaceCompatApi21Impl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4771e = "android.graphics.FontFamily";

    /* renamed from: f, reason: collision with root package name */
    private static final String f4772f = "addFontWeightStyle";

    /* renamed from: g, reason: collision with root package name */
    private static final String f4773g = "createFromFamiliesWithDefault";

    /* renamed from: h, reason: collision with root package name */
    private static Class<?> f4774h;

    /* renamed from: i, reason: collision with root package name */
    private static Constructor<?> f4775i;

    /* renamed from: j, reason: collision with root package name */
    private static Method f4776j;

    /* renamed from: k, reason: collision with root package name */
    private static Method f4777k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f4778l;

    m2() {
    }

    private static boolean k(Object obj, String str, int i5, boolean z5) {
        n();
        try {
            return ((Boolean) f4776j.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(f4774h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4777k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private File m(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f4778l) {
            return;
        }
        f4778l = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f4775i = constructor;
        f4774h = cls;
        f4776j = method2;
        f4777k = method;
    }

    private static Object o() {
        n();
        try {
            return f4775i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // androidx.core.graphics.j3
    public Typeface b(Context context, f.d dVar, Resources resources, int i5) {
        Object o5 = o();
        for (f.e eVar : dVar.a()) {
            File e6 = k3.e(context);
            if (e6 == null) {
                return null;
            }
            try {
                if (!k3.c(e6, resources, eVar.b())) {
                    return null;
                }
                if (!k(o5, e6.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e6.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e6.delete();
            }
        }
        return l(o5);
    }

    @Override // androidx.core.graphics.j3
    public Typeface c(Context context, CancellationSignal cancellationSignal, @androidx.annotation.o0 h.c[] cVarArr, int i5) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File m5 = m(openFileDescriptor);
                if (m5 != null && m5.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m5);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface d6 = super.d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return d6;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
