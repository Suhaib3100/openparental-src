package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class j3 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f4760b = "TypefaceCompatBaseImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final int f4761c = 0;

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, f.d> f4762a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes3.dex */
    class a implements c<h.c> {
        a() {
        }

        @Override // androidx.core.graphics.j3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(h.c cVar) {
            return cVar.e();
        }

        @Override // androidx.core.graphics.j3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(h.c cVar) {
            return cVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes3.dex */
    class b implements c<f.e> {
        b() {
        }

        @Override // androidx.core.graphics.j3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.j3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    private interface c<T> {
        int a(T t5);

        boolean b(T t5);
    }

    j3() {
    }

    private void a(Typeface typeface, f.d dVar) {
        long j5 = j(typeface);
        if (j5 != 0) {
            this.f4762a.put(Long.valueOf(j5), dVar);
        }
    }

    private f.e f(f.d dVar, int i5) {
        return (f.e) g(dVar.a(), i5, new b());
    }

    private static <T> T g(T[] tArr, int i5, c<T> cVar) {
        int i6 = (i5 & 1) == 0 ? 400 : 700;
        boolean z5 = (i5 & 2) != 0;
        T t5 = null;
        int i7 = Integer.MAX_VALUE;
        for (T t6 : tArr) {
            int abs = (Math.abs(cVar.a(t6) - i6) * 2) + (cVar.b(t6) == z5 ? 0 : 1);
            if (t5 == null || i7 > abs) {
                t5 = t6;
                i7 = abs;
            }
        }
        return t5;
    }

    private static long j(@androidx.annotation.q0 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    @androidx.annotation.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i5) {
        f.e f6 = f(dVar, i5);
        if (f6 == null) {
            return null;
        }
        Typeface g5 = l2.g(context, resources, f6.b(), f6.a(), 0, i5);
        a(g5, dVar);
        return g5;
    }

    @androidx.annotation.q0
    public Typeface c(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 h.c[] cVarArr, int i5) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(cVarArr, i5).d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface d6 = d(context, inputStream);
            k3.a(inputStream);
            return d6;
        } catch (IOException unused2) {
            k3.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            k3.a(inputStream2);
            throw th;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File e6 = k3.e(context);
        if (e6 == null) {
            return null;
        }
        try {
            if (k3.d(e6, inputStream)) {
                return Typeface.createFromFile(e6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e6.delete();
        }
    }

    @androidx.annotation.q0
    public Typeface e(Context context, Resources resources, int i5, String str, int i6) {
        File e6 = k3.e(context);
        if (e6 == null) {
            return null;
        }
        try {
            if (k3.c(e6, resources, i5)) {
                return Typeface.createFromFile(e6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e6.delete();
        }
    }

    protected h.c h(h.c[] cVarArr, int i5) {
        return (h.c) g(cVarArr, i5, new a());
    }

    @androidx.annotation.q0
    f.d i(Typeface typeface) {
        long j5 = j(typeface);
        if (j5 == 0) {
            return null;
        }
        return this.f4762a.get(Long.valueOf(j5));
    }
}
