package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f9164h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final v f9165a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f9166b;

    /* renamed from: c, reason: collision with root package name */
    Executor f9167c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f9168d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private List<T> f9169e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private List<T> f9170f;

    /* renamed from: g, reason: collision with root package name */
    int f9171g;

    /* compiled from: AsyncListDiffer.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f9172o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List f9173p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f9174q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Runnable f9175r;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0110a extends k.b {
            C0110a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean a(int i5, int i6) {
                Object obj = a.this.f9172o.get(i5);
                Object obj2 = a.this.f9173p.get(i6);
                if (obj != null && obj2 != null) {
                    return d.this.f9166b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean b(int i5, int i6) {
                Object obj = a.this.f9172o.get(i5);
                Object obj2 = a.this.f9173p.get(i6);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f9166b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            @q0
            public Object c(int i5, int i6) {
                Object obj = a.this.f9172o.get(i5);
                Object obj2 = a.this.f9173p.get(i6);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f9166b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.k.b
            public int d() {
                return a.this.f9173p.size();
            }

            @Override // androidx.recyclerview.widget.k.b
            public int e() {
                return a.this.f9172o.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        class b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ k.e f9178o;

            b(k.e eVar) {
                this.f9178o = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f9171g == aVar.f9174q) {
                    dVar.c(aVar.f9173p, this.f9178o, aVar.f9175r);
                }
            }
        }

        a(List list, List list2, int i5, Runnable runnable) {
            this.f9172o = list;
            this.f9173p = list2;
            this.f9174q = i5;
            this.f9175r = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f9167c.execute(new b(k.b(new C0110a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    public interface b<T> {
        void a(@o0 List<T> list, @o0 List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    private static class c implements Executor {

        /* renamed from: o, reason: collision with root package name */
        final Handler f9180o = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            this.f9180o.post(runnable);
        }
    }

    public d(@o0 RecyclerView.h hVar, @o0 k.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new c.a(fVar).a());
    }

    private void d(@o0 List<T> list, @q0 Runnable runnable) {
        Iterator<b<T>> it = this.f9168d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f9170f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@o0 b<T> bVar) {
        this.f9168d.add(bVar);
    }

    @o0
    public List<T> b() {
        return this.f9170f;
    }

    void c(@o0 List<T> list, @o0 k.e eVar, @q0 Runnable runnable) {
        List<T> list2 = this.f9170f;
        this.f9169e = list;
        this.f9170f = Collections.unmodifiableList(list);
        eVar.d(this.f9165a);
        d(list2, runnable);
    }

    public void e(@o0 b<T> bVar) {
        this.f9168d.remove(bVar);
    }

    public void f(@q0 List<T> list) {
        g(list, null);
    }

    public void g(@q0 List<T> list, @q0 Runnable runnable) {
        int i5 = this.f9171g + 1;
        this.f9171g = i5;
        List<T> list2 = this.f9169e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f9170f;
        if (list == null) {
            int size = list2.size();
            this.f9169e = null;
            this.f9170f = Collections.emptyList();
            this.f9165a.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f9166b.a().execute(new a(list2, list, i5, runnable));
            return;
        }
        this.f9169e = list;
        this.f9170f = Collections.unmodifiableList(list);
        this.f9165a.b(0, list.size());
        d(list3, runnable);
    }

    public d(@o0 v vVar, @o0 androidx.recyclerview.widget.c<T> cVar) {
        this.f9168d = new CopyOnWriteArrayList();
        this.f9170f = Collections.emptyList();
        this.f9165a = vVar;
        this.f9166b = cVar;
        if (cVar.c() != null) {
            this.f9167c = cVar.c();
        } else {
            this.f9167c = f9164h;
        }
    }
}
