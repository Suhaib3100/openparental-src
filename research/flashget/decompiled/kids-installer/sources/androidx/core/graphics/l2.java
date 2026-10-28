package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.c1;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.provider.h;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final j3 f4767a;

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.collection.g<String, Typeface> f4768b;

    /* compiled from: TypefaceCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    /* loaded from: classes3.dex */
    public static class a extends h.d {

        /* renamed from: j, reason: collision with root package name */
        @androidx.annotation.q0
        private i.g f4769j;

        public a(@androidx.annotation.q0 i.g gVar) {
            this.f4769j = gVar;
        }

        @Override // androidx.core.provider.h.d
        public void a(int i5) {
            i.g gVar = this.f4769j;
            if (gVar != null) {
                gVar.f(i5);
            }
        }

        @Override // androidx.core.provider.h.d
        public void b(@androidx.annotation.o0 Typeface typeface) {
            i.g gVar = this.f4769j;
            if (gVar != null) {
                gVar.g(typeface);
            }
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            f4767a = new i3();
        } else if (i5 >= 28) {
            f4767a = new t2();
        } else if (i5 >= 26) {
            f4767a = new s2();
        } else if (n2.m()) {
            f4767a = new n2();
        } else {
            f4767a = new m2();
        }
        f4768b = new androidx.collection.g<>(16);
    }

    private l2() {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.m1
    public static void a() {
        f4768b.evictAll();
    }

    @androidx.annotation.o0
    public static Typeface b(@androidx.annotation.o0 Context context, @androidx.annotation.q0 Typeface typeface, int i5) {
        if (context != null) {
            return Typeface.create(typeface, i5);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static Typeface c(@androidx.annotation.o0 Context context, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 h.c[] cVarArr, int i5) {
        return f4767a.c(context, cancellationSignal, cVarArr, i5);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f.b bVar, @androidx.annotation.o0 Resources resources, int i5, int i6, @androidx.annotation.q0 i.g gVar, @androidx.annotation.q0 Handler handler, boolean z5) {
        return e(context, bVar, resources, i5, null, 0, i6, gVar, handler, z5);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f.b bVar, @androidx.annotation.o0 Resources resources, int i5, @androidx.annotation.q0 String str, int i6, int i7, @androidx.annotation.q0 i.g gVar, @androidx.annotation.q0 Handler handler, boolean z5) {
        Typeface b6;
        if (bVar instanceof f.C0035f) {
            f.C0035f c0035f = (f.C0035f) bVar;
            Typeface l5 = l(c0035f.c());
            if (l5 != null) {
                if (gVar != null) {
                    gVar.d(l5, handler);
                }
                return l5;
            }
            boolean z6 = !z5 ? gVar != null : c0035f.a() != 0;
            int d6 = z5 ? c0035f.d() : -1;
            b6 = androidx.core.provider.h.f(context, c0035f.b(), i7, z6, d6, i.g.e(handler), new a(gVar));
        } else {
            b6 = f4767a.b(context, (f.d) bVar, resources, i7);
            if (gVar != null) {
                if (b6 != null) {
                    gVar.d(b6, handler);
                } else {
                    gVar.c(-3, handler);
                }
            }
        }
        if (b6 != null) {
            f4768b.put(h(resources, i5, str, i6, i7), b6);
        }
        return b6;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface f(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i5, String str, int i6) {
        return g(context, resources, i5, str, 0, i6);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources, int i5, String str, int i6, int i7) {
        Typeface e6 = f4767a.e(context, resources, i5, str, i7);
        if (e6 != null) {
            f4768b.put(h(resources, i5, str, i6, i7), e6);
        }
        return e6;
    }

    private static String h(Resources resources, int i5, String str, int i6, int i7) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i6 + '-' + i5 + '-' + i7;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface i(@androidx.annotation.o0 Resources resources, int i5, int i6) {
        return j(resources, i5, null, 0, i6);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static Typeface j(@androidx.annotation.o0 Resources resources, int i5, @androidx.annotation.q0 String str, int i6, int i7) {
        return f4768b.get(h(resources, i5, str, i6, i7));
    }

    @androidx.annotation.q0
    private static Typeface k(Context context, Typeface typeface, int i5) {
        j3 j3Var = f4767a;
        f.d i6 = j3Var.i(typeface);
        if (i6 == null) {
            return null;
        }
        return j3Var.b(context, i6, context.getResources(), i5);
    }

    private static Typeface l(@androidx.annotation.q0 String str) {
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
