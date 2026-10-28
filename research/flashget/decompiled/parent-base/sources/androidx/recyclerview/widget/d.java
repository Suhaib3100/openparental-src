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
/* loaded from: classes3.dex */
public class d<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f33065h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final v f33066a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f33067b;

    /* renamed from: c, reason: collision with root package name */
    Executor f33068c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f33069d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private List<T> f33070e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private List<T> f33071f;

    /* renamed from: g, reason: collision with root package name */
    int f33072g;

    /* compiled from: AsyncListDiffer.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f33073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f33074c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33075d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f33076e;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0593a extends k.b {
            C0593a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean areContentsTheSame(int i4, int i5) {
                Object obj = a.this.f33073b.get(i4);
                Object obj2 = a.this.f33074c.get(i5);
                if (obj != null && obj2 != null) {
                    return d.this.f33067b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            public boolean areItemsTheSame(int i4, int i5) {
                Object obj = a.this.f33073b.get(i4);
                Object obj2 = a.this.f33074c.get(i5);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f33067b.b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.k.b
            @q0
            public Object getChangePayload(int i4, int i5) {
                Object obj = a.this.f33073b.get(i4);
                Object obj2 = a.this.f33074c.get(i5);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f33067b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.k.b
            public int getNewListSize() {
                return a.this.f33074c.size();
            }

            @Override // androidx.recyclerview.widget.k.b
            public int getOldListSize() {
                return a.this.f33073b.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k.e f33079b;

            b(k.e eVar) {
                this.f33079b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f33072g == aVar.f33075d) {
                    dVar.c(aVar.f33074c, this.f33079b, aVar.f33076e);
                }
            }
        }

        a(List list, List list2, int i4, Runnable runnable) {
            this.f33073b = list;
            this.f33074c = list2;
            this.f33075d = i4;
            this.f33076e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f33068c.execute(new b(k.b(new C0593a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    public interface b<T> {
        void onCurrentListChanged(@o0 List<T> list, @o0 List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    private static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        final Handler f33081b = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            this.f33081b.post(runnable);
        }
    }

    public d(@o0 RecyclerView.h hVar, @o0 k.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new c.a(fVar).a());
    }

    private void d(@o0 List<T> list, @q0 Runnable runnable) {
        Iterator<b<T>> it = this.f33069d.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.f33071f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@o0 b<T> bVar) {
        this.f33069d.add(bVar);
    }

    @o0
    public List<T> b() {
        return this.f33071f;
    }

    void c(@o0 List<T> list, @o0 k.e eVar, @q0 Runnable runnable) {
        List<T> list2 = this.f33071f;
        this.f33070e = list;
        this.f33071f = Collections.unmodifiableList(list);
        eVar.d(this.f33066a);
        d(list2, runnable);
    }

    public void e(@o0 b<T> bVar) {
        this.f33069d.remove(bVar);
    }

    public void f(@q0 List<T> list) {
        g(list, null);
    }

    public void g(@q0 List<T> list, @q0 Runnable runnable) {
        int i4 = this.f33072g + 1;
        this.f33072g = i4;
        List<T> list2 = this.f33070e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f33071f;
        if (list == null) {
            int size = list2.size();
            this.f33070e = null;
            this.f33071f = Collections.emptyList();
            this.f33066a.onRemoved(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f33067b.a().execute(new a(list2, list, i4, runnable));
            return;
        }
        this.f33070e = list;
        this.f33071f = Collections.unmodifiableList(list);
        this.f33066a.onInserted(0, list.size());
        d(list3, runnable);
    }

    public d(@o0 v vVar, @o0 androidx.recyclerview.widget.c<T> cVar) {
        this.f33069d = new CopyOnWriteArrayList();
        this.f33071f = Collections.emptyList();
        this.f33066a = vVar;
        this.f33067b = cVar;
        if (cVar.c() != null) {
            this.f33068c = cVar.c();
        } else {
            this.f33068c = f33065h;
        }
    }
}
