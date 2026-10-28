package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001!BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010&\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010,\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0011\u0010.\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010(¨\u0006/"}, d2 = {"Landroidx/compose/material3/ba;", "", "Landroidx/compose/material3/ca;", "initialValue", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/r0;", "name", "totalDistance", "positionalThreshold", "<init>", "(Landroidx/compose/material3/ca;Landroidx/compose/ui/unit/d;Lld/l;Lld/l;)V", "j", "()F", "Landroidx/compose/material3/n4;", "direction", "i", "(Landroidx/compose/material3/n4;)Z", "targetValue", "Lkotlin/k2;", "l", "(Landroidx/compose/material3/ca;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/unit/d;", "d", "()Landroidx/compose/ui/unit/d;", "Landroidx/compose/material3/k;", "b", "Landroidx/compose/material3/k;", "()Landroidx/compose/material3/k;", "anchoredDraggableState", "f", "offset", "c", "()Landroidx/compose/material3/ca;", "currentValue", "h", "g", "progress", "e", "dismissDirection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ba {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    public static final int f9985d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k<ca> anchoredDraggableState;

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/ca;", "it", "", "a", "(Landroidx/compose/material3/ca;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<ca, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9988b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l ca caVar) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(ca caVar) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/ba$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material3/ca;", "", "confirmValueChange", "", "Lkotlin/r0;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/ba;", "a", "(Lld/l;Lld/l;Landroidx/compose/ui/unit/d;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ba$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: SwipeToDismissBox.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/ba;", "it", "Landroidx/compose/material3/ca;", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/ba;)Landroidx/compose/material3/ca;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.ba$b$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, ba, ca> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9989b = new a(2);

            a() {
                super(2);
            }

            @fg.m
            public final ca a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l ba baVar) {
                return baVar.c();
            }

            @Override // ld.p
            public ca invoke(androidx.compose.runtime.saveable.n nVar, ba baVar) {
                return baVar.c();
            }
        }

        /* compiled from: SwipeToDismissBox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/ca;", "it", "Landroidx/compose/material3/ba;", "a", "(Landroidx/compose/material3/ca;)Landroidx/compose/material3/ba;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.ba$b$b, reason: collision with other inner class name */
        static final class C0219b extends kotlin.jvm.internal.n0 implements ld.l<ca, ba> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.unit.d f9990b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<ca, Boolean> f9991c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, Float> f9992d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0219b(androidx.compose.ui.unit.d dVar, ld.l<? super ca, Boolean> lVar, ld.l<? super Float, Float> lVar2) {
                super(1);
                this.f9990b = dVar;
                this.f9991c = lVar;
                this.f9992d = lVar2;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ba invoke(@fg.l ca caVar) {
                return new ba(caVar, this.f9990b, this.f9991c, this.f9992d);
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<ba, ca> a(@fg.l ld.l<? super ca, Boolean> confirmValueChange, @fg.l ld.l<? super Float, Float> positionalThreshold, @fg.l androidx.compose.ui.unit.d density) {
            return androidx.compose.runtime.saveable.m.a(a.f9989b, new C0219b(density, confirmValueChange, positionalThreshold));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Float> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f4;
            androidx.compose.ui.unit.d density = ba.this.getDensity();
            f4 = aa.f9801a;
            return Float.valueOf(density.v5(f4));
        }
    }

    public ba(@fg.l ca caVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l ld.l<? super ca, Boolean> lVar, @fg.l ld.l<? super Float, Float> lVar2) {
        this.density = dVar;
        this.anchoredDraggableState = new k<>(caVar, lVar2, new c(), i.f11382a.a(), lVar);
    }

    @fg.m
    public final Object a(@fg.l ca caVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = j.g(this.anchoredDraggableState, caVar, 0.0f, dVar, 2, null);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @fg.l
    public final k<ca> b() {
        return this.anchoredDraggableState;
    }

    @fg.l
    public final ca c() {
        return this.anchoredDraggableState.t();
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    public final ca e() {
        return (this.anchoredDraggableState.x() == 0.0f || Float.isNaN(this.anchoredDraggableState.x())) ? ca.Settled : this.anchoredDraggableState.x() > 0.0f ? ca.StartToEnd : ca.EndToStart;
    }

    public final float f() {
        return this.anchoredDraggableState.x();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public final float g() {
        return this.anchoredDraggableState.z();
    }

    @fg.l
    public final ca h() {
        return this.anchoredDraggableState.A();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "DismissDirection is no longer used by SwipeToDismissBoxState. Please compare currentValue against SwipeToDismissValue instead.")
    public final /* synthetic */ boolean i(n4 direction) {
        return c() == (direction == n4.StartToEnd ? ca.StartToEnd : ca.EndToStart);
    }

    public final float j() {
        return this.anchoredDraggableState.E();
    }

    @fg.m
    public final Object k(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = j.g(this.anchoredDraggableState, ca.Settled, 0.0f, dVar, 2, null);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object l(@fg.l ca caVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object j4 = j.j(this.anchoredDraggableState, caVar, dVar);
        return j4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? j4 : kotlin.k2.f75408a;
    }

    public /* synthetic */ ba(ca caVar, androidx.compose.ui.unit.d dVar, ld.l lVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(caVar, dVar, (i4 & 4) != 0 ? a.f9988b : lVar, lVar2);
    }
}
