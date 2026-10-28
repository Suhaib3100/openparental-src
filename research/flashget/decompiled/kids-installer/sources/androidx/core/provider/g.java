package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.l2;
import androidx.core.provider.h;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    static final androidx.collection.g<String, Typeface> f5019a = new androidx.collection.g<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f5020b = i.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f5021c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @b0("LOCK")
    static final androidx.collection.i<String, ArrayList<androidx.core.util.c<e>>> f5022d = new androidx.collection.i<>();

    /* compiled from: FontRequestWorker.java */
    class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f5024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f5025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5026d;

        a(String str, Context context, f fVar, int i5) {
            this.f5023a = str;
            this.f5024b = context;
            this.f5025c = fVar;
            this.f5026d = i5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return g.c(this.f5023a, this.f5024b, this.f5025c, this.f5026d);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes3.dex */
    class b implements androidx.core.util.c<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f5027a;

        b(androidx.core.provider.a aVar) {
            this.f5027a = aVar;
        }

        @Override // androidx.core.util.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f5027a.b(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f5029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f5030c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5031d;

        c(String str, Context context, f fVar, int i5) {
            this.f5028a = str;
            this.f5029b = context;
            this.f5030c = fVar;
            this.f5031d = i5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g.c(this.f5028a, this.f5029b, this.f5030c, this.f5031d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes3.dex */
    class d implements androidx.core.util.c<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5032a;

        d(String str) {
            this.f5032a = str;
        }

        @Override // androidx.core.util.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g.f5021c) {
                androidx.collection.i<String, ArrayList<androidx.core.util.c<e>>> iVar = g.f5022d;
                ArrayList<androidx.core.util.c<e>> arrayList = iVar.get(this.f5032a);
                if (arrayList == null) {
                    return;
                }
                iVar.remove(this.f5032a);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    arrayList.get(i5).accept(eVar);
                }
            }
        }
    }

    private g() {
    }

    private static String a(@o0 f fVar, int i5) {
        return fVar.d() + "-" + i5;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@o0 h.b bVar) {
        int i5 = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        h.c[] b6 = bVar.b();
        if (b6 != null && b6.length != 0) {
            i5 = 0;
            for (h.c cVar : b6) {
                int b7 = cVar.b();
                if (b7 != 0) {
                    if (b7 < 0) {
                        return -3;
                    }
                    return b7;
                }
            }
        }
        return i5;
    }

    @o0
    static e c(@o0 String str, @o0 Context context, @o0 f fVar, int i5) {
        androidx.collection.g<String, Typeface> gVar = f5019a;
        Typeface typeface = gVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            h.b e6 = androidx.core.provider.e.e(context, fVar, null);
            int b6 = b(e6);
            if (b6 != 0) {
                return new e(b6);
            }
            Typeface c6 = l2.c(context, null, e6.b(), i5);
            if (c6 == null) {
                return new e(-3);
            }
            gVar.put(str, c6);
            return new e(c6);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(@o0 Context context, @o0 f fVar, int i5, @q0 Executor executor, @o0 androidx.core.provider.a aVar) {
        String a6 = a(fVar, i5);
        Typeface typeface = f5019a.get(a6);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f5021c) {
            androidx.collection.i<String, ArrayList<androidx.core.util.c<e>>> iVar = f5022d;
            ArrayList<androidx.core.util.c<e>> arrayList = iVar.get(a6);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.c<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            iVar.put(a6, arrayList2);
            c cVar = new c(a6, context, fVar, i5);
            if (executor == null) {
                executor = f5020b;
            }
            i.c(executor, cVar, new d(a6));
            return null;
        }
    }

    static Typeface e(@o0 Context context, @o0 f fVar, @o0 androidx.core.provider.a aVar, int i5, int i6) {
        String a6 = a(fVar, i5);
        Typeface typeface = f5019a.get(a6);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i6 == -1) {
            e c6 = c(a6, context, fVar, i5);
            aVar.b(c6);
            return c6.f5033a;
        }
        try {
            e eVar = (e) i.d(f5020b, new a(a6, context, fVar, i5), i6);
            aVar.b(eVar);
            return eVar.f5033a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static void f() {
        f5019a.evictAll();
    }

    /* compiled from: FontRequestWorker.java */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f5033a;

        /* renamed from: b, reason: collision with root package name */
        final int f5034b;

        e(int i5) {
            this.f5033a = null;
            this.f5034b = i5;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f5034b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(@o0 Typeface typeface) {
            this.f5033a = typeface;
            this.f5034b = 0;
        }
    }
}
