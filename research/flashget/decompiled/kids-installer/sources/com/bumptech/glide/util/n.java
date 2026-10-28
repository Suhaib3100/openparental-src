package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12170a = 31;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12171b = 17;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f12172c = ProtectedSandApp.s("Ȱ").toCharArray();

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f12173d = new char[64];

    /* renamed from: e, reason: collision with root package name */
    @q0
    private static volatile Handler f12174e;

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12175a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f12175a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12175a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12175a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f12175a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12175a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private n() {
    }

    public static void a() {
        if (!t()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ȱ"));
        }
    }

    public static void b() {
        if (!u()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ȳ"));
        }
    }

    public static boolean c(@q0 Object obj, @q0 Object obj2) {
        return obj == null ? obj2 == null : obj instanceof com.bumptech.glide.load.model.l ? ((com.bumptech.glide.load.model.l) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(@q0 Object obj, @q0 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @o0
    private static String e(@o0 byte[] bArr, @o0 char[] cArr) {
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & UByte.f27220r;
            int i7 = i5 * 2;
            char[] cArr2 = f12172c;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    @o0
    public static <T> Queue<T> f(int i5) {
        return new ArrayDeque(i5);
    }

    public static int g(int i5, int i6, @q0 Bitmap.Config config) {
        return i5 * i6 * i(config);
    }

    @TargetApi(19)
    public static int h(@o0 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("ȳ") + bitmap + ProtectedSandApp.s("ȴ") + bitmap.getWidth() + ProtectedSandApp.s("ȵ") + bitmap.getHeight() + ProtectedSandApp.s("ȶ") + bitmap.getConfig());
    }

    private static int i(@q0 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i5 = a.f12175a[config.ordinal()];
        if (i5 == 1) {
            return 1;
        }
        if (i5 == 2 || i5 == 3) {
            return 2;
        }
        return i5 != 4 ? 4 : 8;
    }

    @Deprecated
    public static int j(@o0 Bitmap bitmap) {
        return h(bitmap);
    }

    @o0
    public static <T> List<T> k(@o0 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t5 : collection) {
            if (t5 != null) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (f12174e == null) {
            synchronized (n.class) {
                if (f12174e == null) {
                    f12174e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f12174e;
    }

    public static int m(float f6) {
        return n(f6, 17);
    }

    public static int n(float f6, int i5) {
        return (i5 * 31) + Float.floatToIntBits(f6);
    }

    public static int o(int i5) {
        return 527 + i5;
    }

    public static int p(int i5, int i6) {
        return (i6 * 31) + i5;
    }

    public static int q(@q0 Object obj, int i5) {
        return (i5 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static int r(boolean z5) {
        return 527 + (z5 ? 1 : 0);
    }

    public static int s(boolean z5, int i5) {
        return (i5 * 31) + (z5 ? 1 : 0);
    }

    public static boolean t() {
        return !u();
    }

    public static boolean u() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean v(int i5) {
        return i5 > 0 || i5 == Integer.MIN_VALUE;
    }

    public static boolean w(int i5, int i6) {
        return v(i5) && v(i6);
    }

    public static void x(Runnable runnable) {
        l().post(runnable);
    }

    public static void y(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @o0
    public static String z(@o0 byte[] bArr) {
        String e6;
        char[] cArr = f12173d;
        synchronized (cArr) {
            e6 = e(bArr, cArr);
        }
        return e6;
    }
}
