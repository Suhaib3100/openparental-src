package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import androidx.collection.g1;
import androidx.core.graphics.u0;
import androidx.core.graphics.v0;
import androidx.core.provider.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes3.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    static final g1<String, Typeface> f26582a = new g1<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f26583b = r.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f26584c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @b0("LOCK")
    static final a3<String, ArrayList<androidx.core.util.e<e>>> f26585d = new a3<>();

    /* compiled from: FontRequestWorker.java */
    class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f26588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26589d;

        a(String str, Context context, g gVar, int i4) {
            this.f26586a = str;
            this.f26587b = context;
            this.f26588c = gVar;
            this.f26589d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            List a5;
            String str = this.f26586a;
            Context context = this.f26587b;
            a5 = u0.a(new Object[]{this.f26588c});
            return k.c(str, context, a5, this.f26589d);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class b implements androidx.core.util.e<e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f26590b;

        b(androidx.core.provider.a aVar) {
            this.f26590b = aVar;
        }

        @Override // androidx.core.util.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f26590b.b(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26593c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26594d;

        c(String str, Context context, List list, int i4) {
            this.f26591a = str;
            this.f26592b = context;
            this.f26593c = list;
            this.f26594d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return k.c(this.f26591a, this.f26592b, this.f26593c, this.f26594d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: FontRequestWorker.java */
    class d implements androidx.core.util.e<e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26595b;

        d(String str) {
            this.f26595b = str;
        }

        @Override // androidx.core.util.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (k.f26584c) {
                try {
                    a3<String, ArrayList<androidx.core.util.e<e>>> a3Var = k.f26585d;
                    ArrayList<androidx.core.util.e<e>> arrayList = a3Var.get(this.f26595b);
                    if (arrayList == null) {
                        return;
                    }
                    a3Var.remove(this.f26595b);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        arrayList.get(i4).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private k() {
    }

    private static String a(@o0 List<g> list, int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(list.get(i5).d());
            sb.append("-");
            sb.append(i4);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@o0 q.b bVar) {
        int i4 = 1;
        if (bVar.e() != 0) {
            return bVar.e() != 1 ? -3 : -2;
        }
        q.c[] c5 = bVar.c();
        if (c5 != null && c5.length != 0) {
            i4 = 0;
            for (q.c cVar : c5) {
                int b5 = cVar.b();
                if (b5 != 0) {
                    if (b5 < 0) {
                        return -3;
                    }
                    return b5;
                }
            }
        }
        return i4;
    }

    @o0
    static e c(@o0 String str, @o0 Context context, @o0 List<g> list, int i4) {
        androidx.tracing.b.c("getFontSync");
        try {
            g1<String, Typeface> g1Var = f26582a;
            Typeface typeface = g1Var.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            q.b f4 = androidx.core.provider.e.f(context, list, null);
            int b5 = b(f4);
            if (b5 != 0) {
                return new e(b5);
            }
            Typeface d5 = (!f4.f() || Build.VERSION.SDK_INT < 29) ? v0.d(context, null, f4.c(), i4) : v0.e(context, null, f4.d(), i4);
            if (d5 == null) {
                return new e(-3);
            }
            g1Var.put(str, d5);
            return new e(d5);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            Trace.endSection();
        }
    }

    static Typeface d(@o0 Context context, @o0 List<g> list, int i4, @q0 Executor executor, @o0 androidx.core.provider.a aVar) {
        String a5 = a(list, i4);
        Typeface typeface = f26582a.get(a5);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f26584c) {
            try {
                a3<String, ArrayList<androidx.core.util.e<e>>> a3Var = f26585d;
                ArrayList<androidx.core.util.e<e>> arrayList = a3Var.get(a5);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<androidx.core.util.e<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                a3Var.put(a5, arrayList2);
                c cVar = new c(a5, context, list, i4);
                if (executor == null) {
                    executor = f26583b;
                }
                r.c(executor, cVar, new d(a5));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(@o0 Context context, @o0 g gVar, @o0 androidx.core.provider.a aVar, int i4, int i5) {
        List a5;
        List a6;
        a5 = u0.a(new Object[]{gVar});
        String a7 = a(a5, i4);
        Typeface typeface = f26582a.get(a7);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i5 == -1) {
            a6 = u0.a(new Object[]{gVar});
            e c5 = c(a7, context, a6, i4);
            aVar.b(c5);
            return c5.f26596a;
        }
        try {
            e eVar = (e) r.d(f26583b, new a(a7, context, gVar, i4), i5);
            aVar.b(eVar);
            return eVar.f26596a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static void f() {
        f26582a.evictAll();
    }

    /* compiled from: FontRequestWorker.java */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f26596a;

        /* renamed from: b, reason: collision with root package name */
        final int f26597b;

        e(int i4) {
            this.f26596a = null;
            this.f26597b = i4;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f26597b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(@o0 Typeface typeface) {
            this.f26596a = typeface;
            this.f26597b = 0;
        }
    }
}
