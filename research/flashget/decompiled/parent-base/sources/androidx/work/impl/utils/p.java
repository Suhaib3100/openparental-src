package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.h0;
import androidx.work.impl.model.r;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: StatusRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class p<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<T> f36507b = androidx.work.impl.utils.futures.c.u();

    /* compiled from: StatusRunnable.java */
    class a extends p<List<f0>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36508c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f36509d;

        a(final androidx.work.impl.j val$workManager, final List val$ids) {
            this.f36508c = val$workManager;
            this.f36509d = val$ids;
        }

        @Override // androidx.work.impl.utils.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<f0> g() {
            return androidx.work.impl.model.r.f36345u.apply(this.f36508c.M().k().G(this.f36509d));
        }
    }

    /* compiled from: StatusRunnable.java */
    class b extends p<f0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UUID f36511d;

        b(final androidx.work.impl.j val$workManager, final UUID val$id) {
            this.f36510c = val$workManager;
            this.f36511d = val$id;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public f0 g() {
            r.c i4 = this.f36510c.M().k().i(this.f36511d.toString());
            if (i4 != null) {
                return i4.a();
            }
            return null;
        }
    }

    /* compiled from: StatusRunnable.java */
    class c extends p<List<f0>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36513d;

        c(final androidx.work.impl.j val$workManager, final String val$tag) {
            this.f36512c = val$workManager;
            this.f36513d = val$tag;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<f0> g() {
            return androidx.work.impl.model.r.f36345u.apply(this.f36512c.M().k().C(this.f36513d));
        }
    }

    /* compiled from: StatusRunnable.java */
    class d extends p<List<f0>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36515d;

        d(final androidx.work.impl.j val$workManager, final String val$name) {
            this.f36514c = val$workManager;
            this.f36515d = val$name;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<f0> g() {
            return androidx.work.impl.model.r.f36345u.apply(this.f36514c.M().k().o(this.f36515d));
        }
    }

    /* compiled from: StatusRunnable.java */
    class e extends p<List<f0>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f36517d;

        e(final androidx.work.impl.j val$workManager, final h0 val$querySpec) {
            this.f36516c = val$workManager;
            this.f36517d = val$querySpec;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<f0> g() {
            return androidx.work.impl.model.r.f36345u.apply(this.f36516c.M().g().b(m.b(this.f36517d)));
        }
    }

    @o0
    public static p<List<f0>> a(@o0 final androidx.work.impl.j workManager, @o0 final List<String> ids) {
        return new a(workManager, ids);
    }

    @o0
    public static p<List<f0>> b(@o0 final androidx.work.impl.j workManager, @o0 final String tag) {
        return new c(workManager, tag);
    }

    @o0
    public static p<f0> c(@o0 final androidx.work.impl.j workManager, @o0 final UUID id2) {
        return new b(workManager, id2);
    }

    @o0
    public static p<List<f0>> d(@o0 final androidx.work.impl.j workManager, @o0 final String name) {
        return new d(workManager, name);
    }

    @o0
    public static p<List<f0>> e(@o0 final androidx.work.impl.j workManager, @o0 final h0 querySpec) {
        return new e(workManager, querySpec);
    }

    @o0
    public ListenableFuture<T> f() {
        return this.f36507b;
    }

    @n1
    abstract T g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f36507b.p(g());
        } catch (Throwable th) {
            this.f36507b.q(th);
        }
    }
}
