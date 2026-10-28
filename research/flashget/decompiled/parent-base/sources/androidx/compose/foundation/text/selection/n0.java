package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.t4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SelectionRegistrarImpl.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!JB\u0010%\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010\u0005R\"\u0010.\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R\u001a\u00108\u001a\u000605j\u0002`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00107R0\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>RB\u0010F\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER6\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LRN\u0010T\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR*\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R0\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R0\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010:\u001a\u0004\bb\u0010<\"\u0004\bc\u0010>RC\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020f0e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020f0e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"Landroidx/compose/foundation/text/selection/n0;", "Landroidx/compose/foundation/text/selection/l0;", "", "initialIncrementId", "<init>", "(J)V", "()V", "Landroidx/compose/foundation/text/selection/o;", "selectable", "h", "(Landroidx/compose/foundation/text/selection/o;)Landroidx/compose/foundation/text/selection/o;", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/text/selection/o;)V", "a", "()J", "Landroidx/compose/ui/layout/u;", "containerLayoutCoordinates", "", "G", "(Landroidx/compose/ui/layout/u;)Ljava/util/List;", "selectableId", "c", "layoutCoordinates", "Li0/f;", "startPosition", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "", "isInTouchMode", "i", "(Landroidx/compose/ui/layout/u;JLandroidx/compose/foundation/text/selection/w;Z)V", "j", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "f", "(Landroidx/compose/ui/layout/u;JJZLandroidx/compose/foundation/text/selection/w;Z)Z", "g", "e", "Z", "w", "()Z", "E", "(Z)V", "sorted", "", "Ljava/util/List;", "_selectables", "", "Ljava/util/Map;", "_selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "incrementId", "Lkotlin/Function1;", "Lld/l;", "o", "()Lld/l;", "y", "(Lld/l;)V", "onPositionChangeCallback", "Lkotlin/Function4;", "Lld/r;", "t", "()Lld/r;", "D", "(Lld/r;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function2;", "Lld/p;", "s", "()Lld/p;", "C", "(Lld/p;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function6;", "Lld/t;", "q", "()Lld/t;", "A", "(Lld/t;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "k", "Lld/a;", "r", "()Lld/a;", "B", "(Lld/a;)V", "onSelectionUpdateEndCallback", "l", "p", "z", "onSelectableChangeCallback", "m", "n", "x", "afterSelectableUnsubscribe", "", "Landroidx/compose/foundation/text/selection/q;", "<set-?>", "Landroidx/compose/runtime/k2;", "b", "()Ljava/util/Map;", "F", "(Ljava/util/Map;)V", "subselections", "v", "()Ljava/util/List;", "selectables", "u", "selectableMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n81#2:228\n107#2,2:229\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n112#1:228\n112#1:229,2\n*E\n"})
/* loaded from: classes.dex */
public final class n0 implements l0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f8062p = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sorted;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<o> _selectables;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Long, o> _selectableMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private AtomicLong incrementId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Long, k2> onPositionChangeCallback;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.r<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super w, k2> onSelectionUpdateStartCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super Boolean, ? super Long, k2> onSelectionUpdateSelectAll;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.t<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super i0.f, ? super Boolean, ? super w, Boolean> onSelectionUpdateCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<k2> onSelectionUpdateEndCallback;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Long, k2> onSelectableChangeCallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Long, k2> afterSelectableUnsubscribe;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 subselections;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<n0, Long> f8063q = androidx.compose.runtime.saveable.m.a(a.f8076b, b.f8077b);

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/text/selection/n0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/text/selection/n0;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, n0, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8076b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l n0 n0Var) {
            return Long.valueOf(n0Var.incrementId.get());
        }
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/text/selection/n0;", "a", "(J)Landroidx/compose/foundation/text/selection/n0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Long, n0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8077b = new b(1);

        b() {
            super(1);
        }

        @fg.m
        public final n0 a(long j4) {
            return new n0(j4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ n0 invoke(Long l4) {
            return a(l4.longValue());
        }
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/n0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text/selection/n0;", "", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.n0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<n0, Long> a() {
            return n0.f8063q;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/o;", "a", "b", "", "(Landroidx/compose/foundation/text/selection/o;Landroidx/compose/foundation/text/selection/o;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<o, o, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.u f8078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.layout.u uVar) {
            super(2);
            this.f8078b = uVar;
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l o oVar, @fg.l o oVar2) {
            long j4;
            long j5;
            androidx.compose.ui.layout.u f4 = oVar.f();
            androidx.compose.ui.layout.u f5 = oVar2.f();
            if (f4 != null) {
                androidx.compose.ui.layout.u uVar = this.f8078b;
                i0.f.INSTANCE.getClass();
                j4 = uVar.E(f4, i0.f.f74147c);
            } else {
                i0.f.INSTANCE.getClass();
                j4 = i0.f.f74147c;
            }
            if (f5 != null) {
                androidx.compose.ui.layout.u uVar2 = this.f8078b;
                i0.f.INSTANCE.getClass();
                j5 = uVar2.E(f5, i0.f.f74147c);
            } else {
                i0.f.INSTANCE.getClass();
                j5 = i0.f.f74147c;
            }
            return Integer.valueOf(i0.f.r(j4) == i0.f.r(j5) ? kotlin.comparisons.a.l(Float.valueOf(i0.f.p(j4)), Float.valueOf(i0.f.p(j5))) : kotlin.comparisons.a.l(Float.valueOf(i0.f.r(j4)), Float.valueOf(i0.f.r(j5))));
        }
    }

    public /* synthetic */ n0(long j4, kotlin.jvm.internal.w wVar) {
        this(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(ld.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public final void A(@fg.m ld.t<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super i0.f, ? super Boolean, ? super w, Boolean> tVar) {
        this.onSelectionUpdateCallback = tVar;
    }

    public final void B(@fg.m ld.a<k2> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void C(@fg.m ld.p<? super Boolean, ? super Long, k2> pVar) {
        this.onSelectionUpdateSelectAll = pVar;
    }

    public final void D(@fg.m ld.r<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super w, k2> rVar) {
        this.onSelectionUpdateStartCallback = rVar;
    }

    public final void E(boolean z4) {
        this.sorted = z4;
    }

    public void F(@fg.l Map<Long, q> map) {
        this.subselections.setValue(map);
    }

    @fg.l
    public final List<o> G(@fg.l androidx.compose.ui.layout.u containerLayoutCoordinates) {
        if (!this.sorted) {
            List<o> list = this._selectables;
            final d dVar = new d(containerLayoutCoordinates);
            kotlin.collections.w.p0(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.m0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int H;
                    H = n0.H(ld.p.this, obj, obj2);
                    return H;
                }
            });
            this.sorted = true;
        }
        return this._selectables;
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public long a() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.l0
    @fg.l
    public Map<Long, q> b() {
        return (Map) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void c(long selectableId) {
        this.sorted = false;
        ld.l<? super Long, k2> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void d(@fg.l o selectable) {
        if (this._selectableMap.containsKey(Long.valueOf(selectable.j()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.j()));
            ld.l<? super Long, k2> lVar = this.afterSelectableUnsubscribe;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.j()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void e(long selectableId) {
        ld.l<? super Long, k2> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public boolean f(@fg.l androidx.compose.ui.layout.u layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @fg.l w adjustment, boolean isInTouchMode) {
        ld.t<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super i0.f, ? super Boolean, ? super w, Boolean> tVar = this.onSelectionUpdateCallback;
        if (tVar != null) {
            return tVar.H(Boolean.valueOf(isInTouchMode), layoutCoordinates, i0.f.d(newPosition), i0.f.d(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void g() {
        ld.a<k2> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.l0
    @fg.l
    public o h(@fg.l o selectable) {
        if (selectable.j() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.j()).toString());
        }
        if (this._selectableMap.containsKey(Long.valueOf(selectable.j()))) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        this._selectableMap.put(Long.valueOf(selectable.j()), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void i(@fg.l androidx.compose.ui.layout.u layoutCoordinates, long startPosition, @fg.l w adjustment, boolean isInTouchMode) {
        ld.r<? super Boolean, ? super androidx.compose.ui.layout.u, ? super i0.f, ? super w, k2> rVar = this.onSelectionUpdateStartCallback;
        if (rVar != null) {
            rVar.i(Boolean.valueOf(isInTouchMode), layoutCoordinates, i0.f.d(startPosition), adjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.l0
    public void j(long selectableId, boolean isInTouchMode) {
        ld.p<? super Boolean, ? super Long, k2> pVar = this.onSelectionUpdateSelectAll;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(isInTouchMode), Long.valueOf(selectableId));
        }
    }

    @fg.m
    public final ld.l<Long, k2> n() {
        return this.afterSelectableUnsubscribe;
    }

    @fg.m
    public final ld.l<Long, k2> o() {
        return this.onPositionChangeCallback;
    }

    @fg.m
    public final ld.l<Long, k2> p() {
        return this.onSelectableChangeCallback;
    }

    @fg.m
    public final ld.t<Boolean, androidx.compose.ui.layout.u, i0.f, i0.f, Boolean, w, Boolean> q() {
        return this.onSelectionUpdateCallback;
    }

    @fg.m
    public final ld.a<k2> r() {
        return this.onSelectionUpdateEndCallback;
    }

    @fg.m
    public final ld.p<Boolean, Long, k2> s() {
        return this.onSelectionUpdateSelectAll;
    }

    @fg.m
    public final ld.r<Boolean, androidx.compose.ui.layout.u, i0.f, w, k2> t() {
        return this.onSelectionUpdateStartCallback;
    }

    @fg.l
    public final Map<Long, o> u() {
        return this._selectableMap;
    }

    @fg.l
    public final List<o> v() {
        return this._selectables;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    public final void x(@fg.m ld.l<? super Long, k2> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void y(@fg.m ld.l<? super Long, k2> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void z(@fg.m ld.l<? super Long, k2> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    private n0(long j4) {
        androidx.compose.runtime.k2 g4;
        this._selectables = new ArrayList();
        this._selectableMap = new LinkedHashMap();
        this.incrementId = new AtomicLong(j4);
        g4 = t4.g(kotlin.collections.z0.z(), null, 2, null);
        this.subselections = g4;
    }

    public n0() {
        this(1L);
    }
}
