package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;

/* compiled from: LegacyPagingSource.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001dB#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/paging/d0;", "", "Key", "Value", "Landroidx/paging/b1;", "Lkotlinx/coroutines/m0;", "fetchDispatcher", "Landroidx/paging/m;", "dataSource", "<init>", "(Lkotlinx/coroutines/m0;Landroidx/paging/m;)V", "Landroidx/paging/b1$a;", "params", "", "k", "(Landroidx/paging/b1$a;)I", "pageSize", "Lkotlin/k2;", "l", "(I)V", "Landroidx/paging/b1$b;", "g", "(Landroidx/paging/b1$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/d1;", "state", "e", "(Landroidx/paging/d1;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/m0;", "c", "Landroidx/paging/m;", "j", "()Landroidx/paging/m;", "d", "I", "", "()Z", "jumpingSupported", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d0<Key, Value> extends b1<Key, Value> {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final c f31624e = new c();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    private static final int f31625f = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 fetchDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<Key, Value> dataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pageSize;

    /* compiled from: LegacyPagingSource.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class a implements m.d, kotlin.jvm.internal.d0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<Key, Value> f31629b;

        a(d0<Key, Value> d0Var) {
            this.f31629b = d0Var;
        }

        @Override // androidx.paging.m.d
        public final void a() {
            this.f31629b.f();
        }

        @Override // kotlin.jvm.internal.d0
        @fg.l
        public final kotlin.v<?> d() {
            return new kotlin.jvm.internal.h0(0, this.f31629b, d0.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(@fg.m Object obj) {
            if ((obj instanceof m.d) && (obj instanceof kotlin.jvm.internal.d0)) {
                return kotlin.jvm.internal.l0.g(d(), ((kotlin.jvm.internal.d0) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<Key, Value> f31630b;

        /* compiled from: LegacyPagingSource.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* synthetic */ class a implements m.d, kotlin.jvm.internal.d0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0<Key, Value> f31631b;

            a(d0<Key, Value> d0Var) {
                this.f31631b = d0Var;
            }

            @Override // androidx.paging.m.d
            public final void a() {
                this.f31631b.f();
            }

            @Override // kotlin.jvm.internal.d0
            @fg.l
            public final kotlin.v<?> d() {
                return new kotlin.jvm.internal.h0(0, this.f31631b, d0.class, "invalidate", "invalidate()V", 0);
            }

            public final boolean equals(@fg.m Object obj) {
                if ((obj instanceof m.d) && (obj instanceof kotlin.jvm.internal.d0)) {
                    return kotlin.jvm.internal.l0.g(d(), ((kotlin.jvm.internal.d0) obj).d());
                }
                return false;
            }

            public final int hashCode() {
                return d().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0<Key, Value> d0Var) {
            super(0);
            this.f31630b = d0Var;
        }

        public final void a() {
            this.f31630b.j().n(new a(this.f31630b));
            this.f31630b.j().f();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/d0$c;", "", "<init>", "()V", "", "PAGE_SIZE_NOT_SET", "I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class c {
        private c() {
        }

        public c(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31632a;

        static {
            int[] iArr = new int[m.e.values().length];
            iArr[m.e.POSITIONAL.ordinal()] = 1;
            iArr[m.e.PAGE_KEYED.ordinal()] = 2;
            iArr[m.e.ITEM_KEYED.ordinal()] = 3;
            f31632a = iArr;
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Landroidx/paging/b1$b$c;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/b1$b$c;"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super b1.b.c<Key, Value>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0<Key, Value> f31634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m.f<Key> f31635d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b1.a<Key> f31636e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d0<Key, Value> d0Var, m.f<Key> fVar, b1.a<Key> aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f31634c = d0Var;
            this.f31635d = fVar;
            this.f31636e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new e(this.f31634c, this.f31635d, this.f31636e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31633b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                m<Key, Value> j4 = this.f31634c.j();
                m.f<Key> fVar = this.f31635d;
                this.f31633b = 1;
                obj = j4.i(fVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            b1.a<Key> aVar2 = this.f31636e;
            m.a aVar3 = (m.a) obj;
            List<Value> list = aVar3.data;
            return new b1.b.c(list, (list.isEmpty() && (aVar2 instanceof b1.a.c)) ? null : aVar3.getPrevKey(), (aVar3.data.isEmpty() && (aVar2 instanceof b1.a.C0527a)) ? null : aVar3.getNextKey(), aVar3.getItemsBefore(), aVar3.getItemsAfter());
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super b1.b.c<Key, Value>> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public d0(@fg.l kotlinx.coroutines.m0 fetchDispatcher, @fg.l m<Key, Value> dataSource) {
        kotlin.jvm.internal.l0.p(fetchDispatcher, "fetchDispatcher");
        kotlin.jvm.internal.l0.p(dataSource, "dataSource");
        this.fetchDispatcher = fetchDispatcher;
        this.dataSource = dataSource;
        this.pageSize = Integer.MIN_VALUE;
        dataSource.a(new a(this));
        h(new b(this));
    }

    private final int k(b1.a<Key> params) {
        return ((params instanceof b1.a.d) && params.getLoadSize() % 3 == 0) ? params.getLoadSize() / 3 : params.getLoadSize();
    }

    @Override // androidx.paging.b1
    public boolean c() {
        return this.dataSource.getType() == m.e.POSITIONAL;
    }

    @Override // androidx.paging.b1
    @fg.m
    public Key e(@fg.l d1<Key, Value> state) {
        int i4;
        Key m4;
        Value c5;
        kotlin.jvm.internal.l0.p(state, "state");
        int i5 = d.f31632a[this.dataSource.getType().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return null;
            }
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (c5 = state.c(anchorPosition.intValue())) == null) {
                return null;
            }
            return this.dataSource.c(c5);
        }
        Integer anchorPosition2 = state.getAnchorPosition();
        if (anchorPosition2 == null) {
            return null;
        }
        int intValue = anchorPosition2.intValue();
        i4 = ((d1) state).leadingPlaceholderCount;
        int i6 = intValue - i4;
        for (int i7 = 0; i7 < kotlin.collections.w.J(state.h()) && i6 > kotlin.collections.w.J(state.h().get(i7).i()); i7++) {
            i6 -= state.h().get(i7).i().size();
        }
        b1.b.c<Key, Value> d5 = state.d(intValue);
        if (d5 == null || (m4 = d5.m()) == null) {
            m4 = (Key) 0;
        }
        return (Key) Integer.valueOf(m4.intValue() + i6);
    }

    @Override // androidx.paging.b1
    @fg.m
    public Object g(@fg.l b1.a<Key> aVar, @fg.l kotlin.coroutines.d<? super b1.b<Key, Value>> dVar) {
        g0 g0Var;
        if (aVar instanceof b1.a.d) {
            g0Var = g0.REFRESH;
        } else if (aVar instanceof b1.a.C0527a) {
            g0Var = g0.APPEND;
        } else {
            if (!(aVar instanceof b1.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g0Var = g0.PREPEND;
        }
        g0 g0Var2 = g0Var;
        if (this.pageSize == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.pageSize = k(aVar);
        }
        return kotlinx.coroutines.i.h(this.fetchDispatcher, new e(this, new m.f(g0Var2, aVar.a(), aVar.getLoadSize(), aVar.getPlaceholdersEnabled(), this.pageSize), aVar, null), dVar);
    }

    @fg.l
    public final m<Key, Value> j() {
        return this.dataSource;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final void l(int pageSize) {
        int i4 = this.pageSize;
        if (!(i4 == Integer.MIN_VALUE || pageSize == i4)) {
            throw new IllegalStateException(androidx.view.e.a(new StringBuilder("Page size is already set to "), this.pageSize, '.').toString());
        }
        this.pageSize = pageSize;
    }
}
