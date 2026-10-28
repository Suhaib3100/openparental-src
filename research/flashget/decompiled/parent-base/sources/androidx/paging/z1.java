package androidx.paging;

import androidx.paging.m;
import androidx.paging.q0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WrapperPageKeyedDataSource.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001e\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010$¨\u0006&"}, d2 = {"Landroidx/paging/z1;", "", "K", "A", "B", "Landroidx/paging/q0;", "source", "Li/a;", "", "listFunction", "<init>", "(Landroidx/paging/q0;Li/a;)V", "Landroidx/paging/m$d;", "onInvalidatedCallback", "Lkotlin/k2;", "a", "(Landroidx/paging/m$d;)V", "n", "f", "()V", "Landroidx/paging/q0$c;", "params", "Landroidx/paging/q0$b;", "callback", "z", "(Landroidx/paging/q0$c;Landroidx/paging/q0$b;)V", "Landroidx/paging/q0$d;", "Landroidx/paging/q0$a;", "x", "(Landroidx/paging/q0$d;Landroidx/paging/q0$a;)V", "v", "g", "Landroidx/paging/q0;", "h", "Li/a;", "", "()Z", "isInvalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class z1<K, A, B> extends q0<K, B> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q0<K, A> source;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i.a<List<A>, List<B>> listFunction;

    /* compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/z1$a", "Landroidx/paging/q0$a;", "", "data", "adjacentPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends q0.a<K, A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.a<K, B> f32499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<K, A, B> f32500b;

        a(q0.a<K, B> aVar, z1<K, A, B> z1Var) {
            this.f32499a = aVar;
            this.f32500b = z1Var;
        }

        @Override // androidx.paging.q0.a
        public void a(@fg.l List<? extends A> data, @fg.m K adjacentPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32499a.a(m.INSTANCE.a(((z1) this.f32500b).listFunction, data), adjacentPageKey);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/z1$b", "Landroidx/paging/q0$a;", "", "data", "adjacentPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends q0.a<K, A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.a<K, B> f32501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<K, A, B> f32502b;

        b(q0.a<K, B> aVar, z1<K, A, B> z1Var) {
            this.f32501a = aVar;
            this.f32502b = z1Var;
        }

        @Override // androidx.paging.q0.a
        public void a(@fg.l List<? extends A> data, @fg.m K adjacentPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32501a.a(m.INSTANCE.a(((z1) this.f32502b).listFunction, data), adjacentPageKey);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/paging/z1$c", "Landroidx/paging/q0$b;", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends q0.b<K, A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1<K, A, B> f32503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0.b<K, B> f32504b;

        c(z1<K, A, B> z1Var, q0.b<K, B> bVar) {
            this.f32503a = z1Var;
            this.f32504b = bVar;
        }

        @Override // androidx.paging.q0.b
        public void a(@fg.l List<? extends A> data, int position, int totalCount, @fg.m K previousPageKey, @fg.m K nextPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32504b.a(m.INSTANCE.a(((z1) this.f32503a).listFunction, data), position, totalCount, previousPageKey, nextPageKey);
        }

        @Override // androidx.paging.q0.b
        public void b(@fg.l List<? extends A> data, @fg.m K previousPageKey, @fg.m K nextPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32504b.b(m.INSTANCE.a(((z1) this.f32503a).listFunction, data), previousPageKey, nextPageKey);
        }
    }

    public z1(@fg.l q0<K, A> source, @fg.l i.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
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

    @Override // androidx.paging.q0
    public void v(@fg.l q0.d<K> params, @fg.l q0.a<K, B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.v(params, new a(callback, this));
    }

    @Override // androidx.paging.q0
    public void x(@fg.l q0.d<K> params, @fg.l q0.a<K, B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.x(params, new b(callback, this));
    }

    @Override // androidx.paging.q0
    public void z(@fg.l q0.c<K> params, @fg.l q0.b<K, B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.z(params, new c(this, callback));
    }
}
