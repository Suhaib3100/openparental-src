package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Trace;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.collection.g1;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.provider.q;
import java.util.List;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes3.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final boolean f26283a = false;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final boolean f26284b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final b1 f26285c;

    /* renamed from: d, reason: collision with root package name */
    private static final g1<String, Typeface> f26286d;

    /* compiled from: TypefaceCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static class a extends q.d {

        /* renamed from: j, reason: collision with root package name */
        @androidx.annotation.q0
        private i.f f26287j;

        public a(@androidx.annotation.q0 i.f fVar) {
            this.f26287j = fVar;
        }

        @Override // androidx.core.provider.q.d
        public void a(int i4) {
            i.f fVar = this.f26287j;
            if (fVar != null) {
                fVar.f(i4);
            }
        }

        @Override // androidx.core.provider.q.d
        public void b(@androidx.annotation.o0 Typeface typeface) {
            i.f fVar = this.f26287j;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        androidx.tracing.b.c("TypefaceCompat static init");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f26285c = new a1();
        } else if (i4 >= 28) {
            f26285c = new z0();
        } else if (i4 >= 26) {
            f26285c = new y0();
        } else if (x0.r()) {
            f26285c = new x0();
        } else {
            f26285c = new w0();
        }
        f26286d = new g1<>(16);
        Trace.endSection();
    }

    private v0() {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @m1
    public static void a() {
        f26286d.evictAll();
    }

    @androidx.annotation.o0
    public static Typeface b(@androidx.annotation.o0 Context context, @androidx.annotation.q0 Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @androidx.annotation.o0
    public static Typeface c(@androidx.annotation.o0 Context context, @androidx.annotation.q0 Typeface typeface, @androidx.annotation.g0(from = 1, to = 1000) int i4, boolean z4) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        androidx.core.util.w.g(i4, 1, 1000, "weight");
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f26285c.h(context, typeface, i4, z4);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Typeface d(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 q.c[] cVarArr, int i4) {
        androidx.tracing.b.c("TypefaceCompat.createFromFontInfo");
        try {
            return f26285c.d(context, cancellationSignal, cVarArr, i4);
        } finally {
            Trace.endSection();
        }
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(29)
    public static Typeface e(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 List<q.c[]> list, int i4) {
        androidx.tracing.b.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f26285c.e(context, cancellationSignal, list, i4);
        } finally {
            Trace.endSection();
        }
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface f(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f.b bVar, @androidx.annotation.o0 Resources resources, int i4, int i5, @androidx.annotation.q0 i.f fVar, @androidx.annotation.q0 Handler handler, boolean z4) {
        return g(context, bVar, resources, i4, null, 0, i5, fVar, handler, z4);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f.b bVar, @androidx.annotation.o0 Resources resources, int i4, @androidx.annotation.q0 String str, int i5, int i6, @androidx.annotation.q0 i.f fVar, @androidx.annotation.q0 Handler handler, boolean z4) {
        Typeface b5;
        if (bVar instanceof f.C0412f) {
            f.C0412f c0412f = (f.C0412f) bVar;
            Typeface n4 = n(c0412f.d());
            if (n4 != null) {
                if (fVar != null) {
                    fVar.d(n4, handler);
                }
                return n4;
            }
            b5 = androidx.core.provider.q.g(context, c0412f.a() != null ? u0.a(new Object[]{c0412f.c(), c0412f.a()}) : u0.a(new Object[]{c0412f.c()}), i6, !z4 ? fVar != null : c0412f.b() != 0, z4 ? c0412f.e() : -1, i.f.e(handler), new a(fVar));
        } else {
            b5 = f26285c.b(context, (f.d) bVar, resources, i6);
            if (fVar != null) {
                if (b5 != null) {
                    fVar.d(b5, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (b5 != null) {
            f26286d.put(j(resources, i4, str, i5, i6), b5);
        }
        return b5;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i4, String str, int i5) {
        return i(context, resources, i4, str, 0, i5);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface i(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i4, String str, int i5, int i6) {
        Typeface g4 = f26285c.g(context, resources, i4, str, i6);
        if (g4 != null) {
            f26286d.put(j(resources, i4, str, i5, i6), g4);
        }
        return g4;
    }

    private static String j(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface k(@androidx.annotation.o0 Resources resources, int i4, int i5) {
        return l(resources, i4, null, 0, i5);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface l(@androidx.annotation.o0 Resources resources, int i4, @androidx.annotation.q0 String str, int i5, int i6) {
        return f26286d.get(j(resources, i4, str, i5, i6));
    }

    @androidx.annotation.q0
    private static Typeface m(Context context, Typeface typeface, int i4) {
        b1 b1Var = f26285c;
        f.d n4 = b1Var.n(typeface);
        if (n4 == null) {
            return null;
        }
        return b1Var.b(context, n4, context.getResources(), i4);
    }

    private static Typeface n(@androidx.annotation.q0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
