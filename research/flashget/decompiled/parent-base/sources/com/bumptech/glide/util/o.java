package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: Util.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f44979a = 31;

    /* renamed from: b, reason: collision with root package name */
    private static final int f44980b = 17;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f44981c = ProtectedSandApp.s("ણ").toCharArray();

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f44982d = new char[64];

    /* renamed from: e, reason: collision with root package name */
    @q0
    private static volatile Handler f44983e;

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44984a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f44984a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44984a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44984a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f44984a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44984a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private o() {
    }

    @o0
    public static String A(@o0 byte[] bArr) {
        String f4;
        char[] cArr = f44982d;
        synchronized (cArr) {
            f4 = f(bArr, cArr);
        }
        return f4;
    }

    public static void a() {
        if (!u()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ત"));
        }
    }

    public static void b() {
        if (!v()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("થ"));
        }
    }

    public static boolean c(@q0 com.bumptech.glide.request.a<?> aVar, @q0 com.bumptech.glide.request.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.f0(aVar2);
    }

    public static boolean d(@q0 Object obj, @q0 Object obj2) {
        return obj == null ? obj2 == null : obj instanceof com.bumptech.glide.load.model.m ? ((com.bumptech.glide.load.model.m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@q0 Object obj, @q0 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @o0
    private static String f(@o0 byte[] bArr, @o0 char[] cArr) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f44981c;
            cArr[i5] = cArr2[(b5 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr);
    }

    @o0
    public static <T> Queue<T> g(int i4) {
        return new ArrayDeque(i4);
    }

    public static int h(int i4, int i5, @q0 Bitmap.Config config) {
        return j(config) * i4 * i5;
    }

    @TargetApi(19)
    public static int i(@o0 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("દ") + bitmap + ProtectedSandApp.s("ધ") + bitmap.getWidth() + ProtectedSandApp.s("ન") + bitmap.getHeight() + ProtectedSandApp.s("\u0aa9") + bitmap.getConfig());
    }

    public static int j(@q0 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = a.f44984a[config.ordinal()];
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2 || i4 == 3) {
            return 2;
        }
        return i4 != 4 ? 4 : 8;
    }

    @Deprecated
    public static int k(@o0 Bitmap bitmap) {
        return i(bitmap);
    }

    @o0
    public static <T> List<T> l(@o0 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t4 : collection) {
            if (t4 != null) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    private static Handler m() {
        if (f44983e == null) {
            synchronized (o.class) {
                try {
                    if (f44983e == null) {
                        f44983e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f44983e;
    }

    public static int n(float f4) {
        return o(f4, 17);
    }

    public static int o(float f4, int i4) {
        return q(Float.floatToIntBits(f4), i4);
    }

    public static int p(int i4) {
        return q(i4, 17);
    }

    public static int q(int i4, int i5) {
        return (i5 * 31) + i4;
    }

    public static int r(@q0 Object obj, int i4) {
        return q(obj == null ? 0 : obj.hashCode(), i4);
    }

    public static int s(boolean z4) {
        return q(z4 ? 1 : 0, 17);
    }

    public static int t(boolean z4, int i4) {
        return q(z4 ? 1 : 0, i4);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int i4) {
        return i4 > 0 || i4 == Integer.MIN_VALUE;
    }

    public static boolean x(int i4, int i5) {
        return w(i4) && w(i5);
    }

    public static void y(Runnable runnable) {
        m().post(runnable);
    }

    public static void z(Runnable runnable) {
        m().removeCallbacks(runnable);
    }
}
