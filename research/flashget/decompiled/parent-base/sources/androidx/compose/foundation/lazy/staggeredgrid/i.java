package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyStaggeredGridIntervalContent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J¹\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u000421\u0010\u0019\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/i;", "Landroidx/compose/foundation/lazy/staggeredgrid/b0;", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/lazy/staggeredgrid/h;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "content", "<init>", "(Lld/l;)V", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "Landroidx/compose/runtime/i;", "r", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/n0;Lld/q;)V", "", "count", "Lkotlin/r0;", "name", "index", "Lkotlin/Function2;", "itemContent", "o", "(ILld/l;Lld/l;Lld/l;Lld/r;)V", "Landroidx/compose/foundation/lazy/layout/l0;", "b", "Landroidx/compose/foundation/lazy/layout/l0;", "B", "()Landroidx/compose/foundation/lazy/layout/l0;", "intervals", "Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "C", "()Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "spanProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes.dex */
public final class i extends androidx.compose.foundation.lazy.layout.p<h> implements b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6348d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.l0<h> intervals;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 spanProvider;

    /* compiled from: LazyStaggeredGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f6351b = obj;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f6351b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f6351b;
        }
    }

    /* compiled from: LazyStaggeredGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f6352b = obj;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f6352b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f6352b;
        }
    }

    /* compiled from: LazyStaggeredGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "a", "(I)Landroidx/compose/foundation/lazy/staggeredgrid/n0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Integer, n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f6353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n0 n0Var) {
            super(1);
            this.f6353b = n0Var;
        }

        @fg.l
        public final n0 a(int i4) {
            return this.f6353b;
        }

        @Override // ld.l
        public n0 invoke(Integer num) {
            num.intValue();
            return this.f6353b;
        }
    }

    /* compiled from: LazyStaggeredGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/p;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/p;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.r<p, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<p, androidx.compose.runtime.t, Integer, k2> f6354b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.q<? super p, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            super(4);
            this.f6354b = qVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l p pVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            if ((i5 & 14) == 0) {
                i5 |= tVar.q0(pVar) ? 4 : 2;
            }
            if ((i5 & 651) == 130 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(657818596, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)");
            }
            this.f6354b.R(pVar, tVar, Integer.valueOf(i5 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(p pVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(pVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    public i(@fg.l ld.l<? super b0, k2> lVar) {
        androidx.compose.foundation.lazy.layout.l0<h> l0Var = new androidx.compose.foundation.lazy.layout.l0<>();
        this.intervals = l0Var;
        this.spanProvider = new i0(l0Var);
        lVar.invoke(this);
    }

    @fg.l
    public androidx.compose.foundation.lazy.layout.l0<h> B() {
        return this.intervals;
    }

    @fg.l
    /* renamed from: C, reason: from getter */
    public final i0 getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.b0
    public void o(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.m ld.l<? super Integer, n0> span, @fg.l ld.r<? super p, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent) {
        this.intervals.c(count, new h(key, contentType, span, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.b0
    public void r(@fg.m Object key, @fg.m Object contentType, @fg.m n0 span, @fg.l ld.q<? super p, ? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        o(1, key != null ? new a(key) : null, new b(contentType), span != null ? new c(span) : null, new androidx.compose.runtime.internal.b(657818596, true, new d(content)));
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public androidx.compose.foundation.lazy.layout.c<h> x() {
        return this.intervals;
    }
}
