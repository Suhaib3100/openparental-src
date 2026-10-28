package androidx.paging;

import androidx.paging.e1;
import androidx.paging.m;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WrapperPositionalDataSource.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR/\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0003\u0010!R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Landroidx/paging/a2;", "", "A", "B", "Landroidx/paging/e1;", "source", "Li/a;", "", "listFunction", "<init>", "(Landroidx/paging/e1;Li/a;)V", "Landroidx/paging/m$d;", "onInvalidatedCallback", "Lkotlin/k2;", "a", "(Landroidx/paging/m$d;)V", "n", "f", "()V", "Landroidx/paging/e1$c;", "params", "Landroidx/paging/e1$b;", "callback", "t", "(Landroidx/paging/e1$c;Landroidx/paging/e1$b;)V", "Landroidx/paging/e1$e;", "Landroidx/paging/e1$d;", "w", "(Landroidx/paging/e1$e;Landroidx/paging/e1$d;)V", "h", "Landroidx/paging/e1;", "i", "Li/a;", "()Li/a;", "", "()Z", "isInvalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a2<A, B> extends e1<B> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1<A> source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i.a<List<A>, List<B>> listFunction;

    /* compiled from: WrapperPositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J-\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/paging/a2$a", "Landroidx/paging/e1$b;", "", "data", "", "position", "totalCount", "Lkotlin/k2;", "b", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;I)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends e1.b<A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1.b<B> f31545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2<A, B> f31546b;

        a(e1.b<B> bVar, a2<A, B> a2Var) {
            this.f31545a = bVar;
            this.f31546b = a2Var;
        }

        @Override // androidx.paging.e1.b
        public void a(@fg.l List<? extends A> data, int position) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f31545a.a(m.INSTANCE.a(this.f31546b.B(), data), position);
        }

        @Override // androidx.paging.e1.b
        public void b(@fg.l List<? extends A> data, int position, int totalCount) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f31545a.b(m.INSTANCE.a(this.f31546b.B(), data), position, totalCount);
        }
    }

    /* compiled from: WrapperPositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/a2$b", "Landroidx/paging/e1$d;", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends e1.d<A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1.d<B> f31547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2<A, B> f31548b;

        b(e1.d<B> dVar, a2<A, B> a2Var) {
            this.f31547a = dVar;
            this.f31548b = a2Var;
        }

        @Override // androidx.paging.e1.d
        public void a(@fg.l List<? extends A> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f31547a.a(m.INSTANCE.a(this.f31548b.B(), data));
        }
    }

    public a2(@fg.l e1<A> source, @fg.l i.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
    }

    @fg.l
    public final i.a<List<A>, List<B>> B() {
        return this.listFunction;
    }

    @Override // androidx.paging.m
    public void a(@fg.l m.d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.a(onInvalidatedCallback);
    }

    @Override // androidx.paging.m
    public void f() {
        this.source.f();
    }

    @Override // androidx.paging.m
    public boolean h() {
        return this.source.h();
    }

    @Override // androidx.paging.m
    public void n(@fg.l m.d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.n(onInvalidatedCallback);
    }

    @Override // androidx.paging.e1
    public void t(@fg.l e1.c params, @fg.l e1.b<B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.t(params, new a(callback, this));
    }

    @Override // androidx.paging.e1
    public void w(@fg.l e1.e params, @fg.l e1.d<B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.w(params, new b(callback, this));
    }
}
