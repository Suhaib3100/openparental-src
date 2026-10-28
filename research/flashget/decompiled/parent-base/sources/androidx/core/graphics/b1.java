package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.content.res.f;
import androidx.core.provider.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
class b1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26170b = "TypefaceCompatBaseImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final int f26171c = 0;

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, f.d> f26172a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    class a implements d<q.c> {
        a() {
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(q.c cVar) {
            return cVar.e();
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(q.c cVar) {
            return cVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    class b implements d<f.e> {
        b() {
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(f.e eVar) {
            return eVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    class c implements d<f.e> {
        c() {
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(f.e eVar) {
            return eVar.e();
        }

        @Override // androidx.core.graphics.b1.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(f.e eVar) {
            return eVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    private interface d<T> {
        boolean a(T t4);

        int b(T t4);
    }

    b1() {
    }

    private void a(Typeface typeface, f.d dVar) {
        long o4 = o(typeface);
        if (o4 != 0) {
            this.f26172a.put(Long.valueOf(o4), dVar);
        }
    }

    private f.e i(f.d dVar, int i4) {
        return (f.e) k(dVar.a(), i4, new b());
    }

    private f.e j(f.d dVar, int i4, boolean z4) {
        return (f.e) l(dVar.a(), i4, z4, new c());
    }

    private static <T> T k(T[] tArr, int i4, d<T> dVar) {
        return (T) l(tArr, (i4 & 1) == 0 ? 400 : w.h.f22554j, (i4 & 2) != 0, dVar);
    }

    private static <T> T l(T[] tArr, int i4, boolean z4, d<T> dVar) {
        T t4 = null;
        int i5 = Integer.MAX_VALUE;
        for (T t5 : tArr) {
            int abs = (Math.abs(dVar.b(t5) - i4) * 2) + (dVar.a(t5) == z4 ? 0 : 1);
            if (t4 == null || i5 > abs) {
                t4 = t5;
                i5 = abs;
            }
        }
        return t4;
    }

    private static long o(@androidx.annotation.q0 Typeface typeface) {
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
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        f.e i5 = i(dVar, i4);
        if (i5 == null) {
            return null;
        }
        Typeface i6 = v0.i(context, resources, i5.b(), i5.a(), 0, i4);
        a(i6, dVar);
        return i6;
    }

    @androidx.annotation.q0
    Typeface c(Context context, f.d dVar, Resources resources, int i4, boolean z4) {
        f.e j4 = j(dVar, i4, z4);
        if (j4 == null) {
            return null;
        }
        Typeface i5 = v0.i(context, resources, j4.b(), j4.a(), 0, 0);
        a(i5, dVar);
        return i5;
    }

    @androidx.annotation.q0
    public Typeface d(Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m(cVarArr, i4).d());
            try {
                Typeface f4 = f(context, inputStream);
                c1.a(inputStream);
                return f4;
            } catch (IOException unused) {
                c1.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                c1.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(29)
    public Typeface e(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 List<q.c[]> list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface f(Context context, InputStream inputStream) {
        File e4 = c1.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (c1.d(e4, inputStream)) {
                return Typeface.createFromFile(e4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    @androidx.annotation.q0
    public Typeface g(Context context, Resources resources, int i4, String str, int i5) {
        File e4 = c1.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (c1.c(e4, resources, i4)) {
                return Typeface.createFromFile(e4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    @androidx.annotation.o0
    Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        Typeface typeface2;
        try {
            typeface2 = d1.a(this, context, typeface, i4, z4);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? typeface : typeface2;
    }

    protected q.c m(q.c[] cVarArr, int i4) {
        return (q.c) k(cVarArr, i4, new a());
    }

    @androidx.annotation.q0
    f.d n(Typeface typeface) {
        long o4 = o(typeface);
        if (o4 == 0) {
            return null;
        }
        return this.f26172a.get(Long.valueOf(o4));
    }
}
