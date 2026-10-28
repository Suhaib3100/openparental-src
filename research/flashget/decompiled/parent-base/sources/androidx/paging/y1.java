package androidx.paging;

import androidx.paging.a0;
import androidx.paging.m;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: WrapperItemKeyedDataSource.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R,\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010,¨\u0006."}, d2 = {"Landroidx/paging/y1;", "", "K", "A", "B", "Landroidx/paging/a0;", "source", "Li/a;", "", "listFunction", "<init>", "(Landroidx/paging/a0;Li/a;)V", "Landroidx/paging/m$d;", "onInvalidatedCallback", "Lkotlin/k2;", "a", "(Landroidx/paging/m$d;)V", "n", "f", "()V", "D", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/paging/a0$c;", "params", "Landroidx/paging/a0$b;", "callback", "x", "(Landroidx/paging/a0$c;Landroidx/paging/a0$b;)V", "Landroidx/paging/a0$d;", "Landroidx/paging/a0$a;", "t", "(Landroidx/paging/a0$d;Landroidx/paging/a0$a;)V", "v", "item", "q", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/paging/a0;", "g", "Li/a;", "Ljava/util/IdentityHashMap;", "h", "Ljava/util/IdentityHashMap;", "keyMap", "", "()Z", "isInvalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class y1<K, A, B> extends a0<K, B> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0<K, A> source;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i.a<List<A>, List<B>> listFunction;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final IdentityHashMap<B, K> keyMap;

    /* compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/y1$a", "Landroidx/paging/a0$a;", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends a0.a<A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0.a<B> f32462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1<K, A, B> f32463b;

        a(a0.a<B> aVar, y1<K, A, B> y1Var) {
            this.f32462a = aVar;
            this.f32463b = y1Var;
        }

        @Override // androidx.paging.a0.a
        public void a(@fg.l List<? extends A> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32462a.a(this.f32463b.D(data));
        }
    }

    /* compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/y1$b", "Landroidx/paging/a0$a;", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends a0.a<A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0.a<B> f32464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1<K, A, B> f32465b;

        b(a0.a<B> aVar, y1<K, A, B> y1Var) {
            this.f32464a = aVar;
            this.f32465b = y1Var;
        }

        @Override // androidx.paging.a0.a
        public void a(@fg.l List<? extends A> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32464a.a(this.f32465b.D(data));
        }
    }

    /* compiled from: WrapperItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J-\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/paging/y1$c", "Landroidx/paging/a0$b;", "", "data", "", "position", "totalCount", "Lkotlin/k2;", "b", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends a0.b<A> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0.b<B> f32466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1<K, A, B> f32467b;

        c(a0.b<B> bVar, y1<K, A, B> y1Var) {
            this.f32466a = bVar;
            this.f32467b = y1Var;
        }

        @Override // androidx.paging.a0.a
        public void a(@fg.l List<? extends A> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32466a.a(this.f32467b.D(data));
        }

        @Override // androidx.paging.a0.b
        public void b(@fg.l List<? extends A> data, int position, int totalCount) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.f32466a.b(this.f32467b.D(data), position, totalCount);
        }
    }

    public y1(@fg.l a0<K, A> source, @fg.l i.a<List<A>, List<B>> listFunction) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = new IdentityHashMap<>();
    }

    @fg.l
    public final List<B> D(@fg.l List<? extends A> source) {
        kotlin.jvm.internal.l0.p(source, "source");
        List<B> a5 = m.INSTANCE.a(this.listFunction, source);
        synchronized (this.keyMap) {
            try {
                int size = a5.size() - 1;
                if (size >= 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        this.keyMap.put(a5.get(i4), this.source.q(source.get(i4)));
                        if (i5 > size) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a5;
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

    @Override // androidx.paging.a0
    @fg.l
    public K q(@fg.l B item) {
        K k4;
        kotlin.jvm.internal.l0.p(item, "item");
        synchronized (this.keyMap) {
            k4 = this.keyMap.get(item);
            kotlin.jvm.internal.l0.m(k4);
            kotlin.jvm.internal.l0.o(k4, "keyMap[item]!!");
        }
        return k4;
    }

    @Override // androidx.paging.a0
    public void t(@fg.l a0.d<K> params, @fg.l a0.a<B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.t(params, new a(callback, this));
    }

    @Override // androidx.paging.a0
    public void v(@fg.l a0.d<K> params, @fg.l a0.a<B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.v(params, new b(callback, this));
    }

    @Override // androidx.paging.a0
    public void x(@fg.l a0.c<K> params, @fg.l a0.b<B> callback) {
        kotlin.jvm.internal.l0.p(params, "params");
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.source.x(params, new c(callback, this));
    }
}
