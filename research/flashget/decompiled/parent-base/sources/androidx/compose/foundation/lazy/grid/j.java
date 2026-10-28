package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridIntervalContent.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001eB \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\\\u0010\u0012\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jµ\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019¢\u0006\u0002\b\u00062#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000421\u0010\u001a\u001a-\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j;", "Landroidx/compose/foundation/lazy/grid/c0;", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/lazy/grid/i;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "content", "<init>", "(Lld/l;)V", "", "key", "Landroidx/compose/foundation/lazy/grid/s;", "Landroidx/compose/foundation/lazy/grid/b;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/q;", "Landroidx/compose/runtime/i;", "t", "(Ljava/lang/Object;Lld/l;Ljava/lang/Object;Lld/q;)V", "", "count", "Lkotlin/r0;", "name", "index", "Lkotlin/Function2;", "itemContent", "m", "(ILld/l;Lld/p;Lld/l;Lld/r;)V", "Landroidx/compose/foundation/lazy/grid/j0;", "b", "Landroidx/compose/foundation/lazy/grid/j0;", "E", "()Landroidx/compose/foundation/lazy/grid/j0;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/layout/l0;", "c", "Landroidx/compose/foundation/lazy/layout/l0;", "D", "()Landroidx/compose/foundation/lazy/layout/l0;", "intervals", "", "d", "Z", "C", "()Z", "F", "(Z)V", "hasCustomSpans", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes.dex */
public final class j extends androidx.compose.foundation.lazy.layout.p<i> implements c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f5688f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 spanLayoutProvider = new j0(this);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.l0<i> intervals = new androidx.compose.foundation.lazy.layout.l0<>();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasCustomSpans;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final b f5687e = new b();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final ld.p<s, Integer, androidx.compose.foundation.lazy.grid.b> f5689g = a.f5693b;

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5693b = new a(2);

        a() {
            super(2);
        }

        public final long a(@fg.l s sVar, int i4) {
            return i0.a(1);
        }

        @Override // ld.p
        public androidx.compose.foundation.lazy.grid.b invoke(s sVar, Integer num) {
            num.intValue();
            return androidx.compose.foundation.lazy.grid.b.a(i0.a(1));
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j$b;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/s;", "", "Landroidx/compose/foundation/lazy/grid/b;", "Lkotlin/u;", "DefaultSpan", "Lld/p;", "a", "()Lld/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        private b() {
        }

        @fg.l
        public final ld.p<s, Integer, androidx.compose.foundation.lazy.grid.b> a() {
            return j.f5689g;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f5694b = obj;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5694b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f5694b;
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/s;", "", "it", "Landroidx/compose/foundation/lazy/grid/b;", "a", "(Landroidx/compose/foundation/lazy/grid/s;I)J"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.p<s, Integer, androidx.compose.foundation.lazy.grid.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<s, androidx.compose.foundation.lazy.grid.b> f5695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super s, androidx.compose.foundation.lazy.grid.b> lVar) {
            super(2);
            this.f5695b = lVar;
        }

        public final long a(@fg.l s sVar, int i4) {
            return this.f5695b.invoke(sVar).getPackedValue();
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.b invoke(s sVar, Integer num) {
            return androidx.compose.foundation.lazy.grid.b.a(a(sVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.f5696b = obj;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5696b;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return this.f5696b;
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.r<q, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<q, androidx.compose.runtime.t, Integer, k2> f5697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            super(4);
            this.f5697b = qVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            if ((i5 & 14) == 0) {
                i5 |= tVar.q0(qVar) ? 4 : 2;
            }
            if ((i5 & 651) == 130 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-34608120, i5, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
            }
            this.f5697b.R(qVar, tVar, Integer.valueOf(i5 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(qVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    public j(@fg.l ld.l<? super c0, k2> lVar) {
        lVar.invoke(this);
    }

    /* renamed from: C, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @fg.l
    public androidx.compose.foundation.lazy.layout.l0<i> D() {
        return this.intervals;
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final j0 getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }

    public final void F(boolean z4) {
        this.hasCustomSpans = z4;
    }

    @Override // androidx.compose.foundation.lazy.grid.c0
    public void m(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.m ld.p<? super s, ? super Integer, androidx.compose.foundation.lazy.grid.b> span, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.l ld.r<? super q, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent) {
        this.intervals.c(count, new i(key, span == null ? f5689g : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.c0
    public void t(@fg.m Object key, @fg.m ld.l<? super s, androidx.compose.foundation.lazy.grid.b> span, @fg.m Object contentType, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        this.intervals.c(1, new i(key != null ? new c(key) : null, span != null ? new d(span) : f5689g, new e(contentType), new androidx.compose.runtime.internal.b(-34608120, true, new f(content))));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public androidx.compose.foundation.lazy.layout.c<i> x() {
        return this.intervals;
    }
}
