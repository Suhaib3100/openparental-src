package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, v0<k>> f39437a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f39438b = {80, 75, 3, 4};

    private w() {
    }

    @n1
    public static t0<k> A(String str, @androidx.annotation.q0 String str2) {
        return y(com.airbnb.lottie.parser.moshi.c.m(okio.a0.d(okio.a0.m(new ByteArrayInputStream(str.getBytes())))), str2, true);
    }

    @n1
    @Deprecated
    public static t0<k> B(JSONObject jSONObject, @androidx.annotation.q0 String str) {
        return A(jSONObject.toString(), str);
    }

    public static v0<k> C(Context context, @androidx.annotation.v0 int i4) {
        return D(context, i4, a0(context, i4));
    }

    public static v0<k> D(Context context, @androidx.annotation.v0 final int i4, @androidx.annotation.q0 final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: com.airbnb.lottie.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 X;
                X = w.X(weakReference, applicationContext, i4, str);
                return X;
            }
        });
    }

    @n1
    public static t0<k> E(Context context, @androidx.annotation.v0 int i4) {
        return F(context, i4, a0(context, i4));
    }

    @n1
    public static t0<k> F(Context context, @androidx.annotation.v0 int i4, @androidx.annotation.q0 String str) {
        try {
            okio.o d5 = okio.a0.d(okio.a0.m(context.getResources().openRawResource(i4)));
            return O(d5).booleanValue() ? L(new ZipInputStream(d5.J3()), str) : v(d5.J3(), str, true);
        } catch (Resources.NotFoundException e4) {
            return new t0<>((Throwable) e4);
        }
    }

    public static v0<k> G(Context context, String str) {
        return H(context, str, ProtectedSandApp.s("́") + str);
    }

    public static v0<k> H(final Context context, final String str, @androidx.annotation.q0 final String str2) {
        return l(str2, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 Y;
                Y = w.Y(context, str, str2);
                return Y;
            }
        });
    }

    @n1
    public static t0<k> I(Context context, String str) {
        return J(context, str, str);
    }

    @n1
    public static t0<k> J(Context context, String str, @androidx.annotation.q0 String str2) {
        t0<k> c5 = e.d(context).c(str, str2);
        if (str2 != null && c5.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c5.b());
        }
        return c5;
    }

    public static v0<k> K(final ZipInputStream zipInputStream, @androidx.annotation.q0 final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 L;
                L = w.L(zipInputStream, str);
                return L;
            }
        });
    }

    @n1
    public static t0<k> L(ZipInputStream zipInputStream, @androidx.annotation.q0 String str) {
        try {
            return M(zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.j.c(zipInputStream);
        }
    }

    @n1
    private static t0<k> M(ZipInputStream zipInputStream, @androidx.annotation.q0 String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            k kVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains(ProtectedSandApp.s("̂"))) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(ProtectedSandApp.s("̃"))) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(ProtectedSandApp.s("̄"))) {
                    kVar = y(com.airbnb.lottie.parser.moshi.c.m(okio.a0.d(okio.a0.m(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(ProtectedSandApp.s("̅")) && !name.contains(ProtectedSandApp.s("̆")) && !name.contains(ProtectedSandApp.s("̇")) && !name.contains(ProtectedSandApp.s("̈"))) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split(ProtectedSandApp.s("̉"))[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (kVar == null) {
                return new t0<>((Throwable) new IllegalArgumentException(ProtectedSandApp.s("̊")));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                o0 n4 = n(kVar, (String) entry.getKey());
                if (n4 != null) {
                    n4.h(com.airbnb.lottie.utils.j.m((Bitmap) entry.getValue(), n4.f(), n4.d()));
                }
            }
            for (Map.Entry<String, o0> entry2 : kVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new t0<>((Throwable) new IllegalStateException(ProtectedSandApp.s("̋") + entry2.getValue().c()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.g.c().d(str, kVar);
            }
            return new t0<>(kVar);
        } catch (IOException e4) {
            return new t0<>((Throwable) e4);
        }
    }

    private static boolean N(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean O(okio.o oVar) {
        try {
            okio.o peek = oVar.peek();
            for (byte b5 : f39438b) {
                if (peek.readByte() != b5) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e4) {
            com.airbnb.lottie.utils.f.c(ProtectedSandApp.s("̌"), e4);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f39437a.remove(str);
        atomicBoolean.set(true);
    }

    private static /* synthetic */ t0 Q(k kVar) throws Exception {
        return new t0(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(String str, AtomicBoolean atomicBoolean, k kVar) {
        f39437a.remove(str);
        atomicBoolean.set(true);
    }

    private static t0 U(InputStream inputStream, String str) throws Exception {
        return v(inputStream, str, true);
    }

    private static t0 V(com.airbnb.lottie.parser.moshi.c cVar, String str) throws Exception {
        return y(cVar, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t0 X(WeakReference weakReference, Context context, int i4, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return F(context, i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t0 Y(Context context, String str, String str2) throws Exception {
        t0<k> c5 = e.d(context).c(str, str2);
        if (str2 != null && c5.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c5.b());
        }
        return c5;
    }

    private static String a0(Context context, @androidx.annotation.v0 int i4) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("̍"));
        sb.append(N(context) ? ProtectedSandApp.s("̎") : ProtectedSandApp.s("̏"));
        sb.append(i4);
        return sb.toString();
    }

    public static void b0(int i4) {
        com.airbnb.lottie.model.g.c().e(i4);
    }

    public static t0 e(InputStream inputStream, String str) {
        return v(inputStream, str, true);
    }

    public static t0 g(com.airbnb.lottie.parser.moshi.c cVar, String str) {
        return y(cVar, str, true);
    }

    public static /* synthetic */ t0 j(k kVar) {
        return new t0(kVar);
    }

    private static v0<k> l(@androidx.annotation.q0 final String str, Callable<t0<k>> callable) {
        final k b5 = str == null ? null : com.airbnb.lottie.model.g.c().b(str);
        if (b5 != null) {
            return new v0<>(new Callable() { // from class: com.airbnb.lottie.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return w.j(k.this);
                }
            }, false);
        }
        if (str != null) {
            Map<String, v0<k>> map = f39437a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        v0<k> v0Var = new v0<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            v0Var.d(new p0() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.p0
                public final void onResult(Object obj) {
                    w.R(str, atomicBoolean, (k) obj);
                }
            });
            v0Var.c(new p0() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.p0
                public final void onResult(Object obj) {
                    w.P(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f39437a.put(str, v0Var);
            }
        }
        return v0Var;
    }

    public static void m(Context context) {
        f39437a.clear();
        com.airbnb.lottie.model.g.c().a();
        e.c(context).a();
    }

    @androidx.annotation.q0
    private static o0 n(k kVar, String str) {
        for (o0 o0Var : kVar.j().values()) {
            if (o0Var.c().equals(str)) {
                return o0Var;
            }
        }
        return null;
    }

    public static v0<k> o(Context context, String str) {
        return p(context, str, ProtectedSandApp.s("̐") + str);
    }

    public static v0<k> p(Context context, final String str, @androidx.annotation.q0 final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 r4;
                r4 = w.r(applicationContext, str, str2);
                return r4;
            }
        });
    }

    @n1
    public static t0<k> q(Context context, String str) {
        return r(context, str, ProtectedSandApp.s("̐") + str);
    }

    @n1
    public static t0<k> r(Context context, String str, @androidx.annotation.q0 String str2) {
        try {
            if (!str.endsWith(ProtectedSandApp.s("̑")) && !str.endsWith(ProtectedSandApp.s("̒"))) {
                return v(context.getAssets().open(str), str2, true);
            }
            return L(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e4) {
            return new t0<>((Throwable) e4);
        }
    }

    @Deprecated
    public static v0<k> s(final JSONObject jSONObject, @androidx.annotation.q0 final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 B;
                B = w.B(jSONObject, str);
                return B;
            }
        });
    }

    public static v0<k> t(final InputStream inputStream, @androidx.annotation.q0 final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w.e(inputStream, str);
            }
        });
    }

    @n1
    public static t0<k> u(InputStream inputStream, @androidx.annotation.q0 String str) {
        return v(inputStream, str, true);
    }

    @n1
    private static t0<k> v(InputStream inputStream, @androidx.annotation.q0 String str, boolean z4) {
        try {
            return y(com.airbnb.lottie.parser.moshi.c.m(okio.a0.d(okio.a0.m(inputStream))), str, true);
        } finally {
            if (z4) {
                com.airbnb.lottie.utils.j.c(inputStream);
            }
        }
    }

    public static v0<k> w(final com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.q0 final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w.g(com.airbnb.lottie.parser.moshi.c.this, str);
            }
        });
    }

    @n1
    public static t0<k> x(com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.q0 String str) {
        return y(cVar, str, true);
    }

    private static t0<k> y(com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.q0 String str, boolean z4) {
        try {
            try {
                k a5 = com.airbnb.lottie.parser.w.a(cVar);
                if (str != null) {
                    com.airbnb.lottie.model.g.c().d(str, a5);
                }
                t0<k> t0Var = new t0<>(a5);
                if (z4) {
                    com.airbnb.lottie.utils.j.c(cVar);
                }
                return t0Var;
            } catch (Exception e4) {
                t0<k> t0Var2 = new t0<>(e4);
                if (z4) {
                    com.airbnb.lottie.utils.j.c(cVar);
                }
                return t0Var2;
            }
        } catch (Throwable th) {
            if (z4) {
                com.airbnb.lottie.utils.j.c(cVar);
            }
            throw th;
        }
    }

    public static v0<k> z(final String str, @androidx.annotation.q0 final String str2) {
        return l(str2, new Callable() { // from class: com.airbnb.lottie.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t0 A;
                A = w.A(str, str2);
                return A;
            }
        });
    }
}
