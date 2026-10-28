package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0018\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0087@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R/\u00101\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u00100R\u0011\u00104\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b:\u00103R\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u00108R\u0011\u0010>\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010\u001d¨\u0006?"}, d2 = {"Landroidx/compose/material3/w4;", "", "Landroidx/compose/material3/x4;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material3/x4;Lld/l;)V", "Landroidx/compose/ui/unit/d;", "r", "()Landroidx/compose/ui/unit/d;", "targetValue", "Landroidx/compose/animation/core/k;", "", "animationSpec", "velocity", "Lkotlin/k2;", "c", "(Landroidx/compose/material3/x4;Landroidx/compose/animation/core/k;FLkotlin/coroutines/d;)Ljava/lang/Object;", "q", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "anim", "d", "(Landroidx/compose/material3/x4;Landroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "u", "(Landroidx/compose/material3/x4;Lkotlin/coroutines/d;)Ljava/lang/Object;", "s", "()F", "Landroidx/compose/material3/k;", "a", "Landroidx/compose/material3/k;", "g", "()Landroidx/compose/material3/k;", "anchoredDraggableState", "Landroidx/compose/runtime/b5;", "b", "Landroidx/compose/runtime/b5;", "k", "()Landroidx/compose/runtime/b5;", "l", "()V", "offset", "<set-?>", "Landroidx/compose/runtime/k2;", "j", "t", "(Landroidx/compose/ui/unit/d;)V", "density", "p", "()Z", "isOpen", "o", "isClosed", "i", "()Landroidx/compose/material3/x4;", "currentValue", "n", "isAnimationRunning", "m", "h", "currentOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,948:1\n81#2:949\n107#2,2:950\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n228#1:949\n228#1:950,2\n*E\n"})
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    public static final int f15261e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k<x4> anchoredDraggableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5<Float> offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 density;

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/x4;", "it", "", "a", "(Landroidx/compose/material3/x4;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<x4, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15265b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l x4 x4Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(x4 x4Var) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/w4$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material3/x4;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/w4;", "a", "(Lld/l;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.w4$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/w4;", "it", "Landroidx/compose/material3/x4;", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/w4;)Landroidx/compose/material3/x4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.w4$b$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, w4, x4> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f15266b = new a(2);

            a() {
                super(2);
            }

            @fg.m
            public final x4 a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l w4 w4Var) {
                return w4Var.i();
            }

            @Override // ld.p
            public x4 invoke(androidx.compose.runtime.saveable.n nVar, w4 w4Var) {
                return w4Var.i();
            }
        }

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/x4;", "it", "Landroidx/compose/material3/w4;", "a", "(Landroidx/compose/material3/x4;)Landroidx/compose/material3/w4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.w4$b$b, reason: collision with other inner class name */
        static final class C0298b extends kotlin.jvm.internal.n0 implements ld.l<x4, w4> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<x4, Boolean> f15267b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0298b(ld.l<? super x4, Boolean> lVar) {
                super(1);
                this.f15267b = lVar;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w4 invoke(@fg.l x4 x4Var) {
                return new w4(x4Var, this.f15267b);
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<w4, x4> a(@fg.l ld.l<? super x4, Boolean> confirmStateChange) {
            return androidx.compose.runtime.saveable.m.a(a.f15266b, new C0298b(confirmStateChange));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "distance", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15268b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            float f5;
            f5 = l7.f12190a;
            return Float.valueOf(f5 * f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,948:1\n1#2:949\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<Float> {
        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f4;
            androidx.compose.ui.unit.d r4 = w4.this.r();
            f4 = l7.f12191b;
            return Float.valueOf(r4.v5(f4));
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/h;", "Landroidx/compose/material3/t4;", "Landroidx/compose/material3/x4;", "anchors", "latestTarget", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/material3/h;Landroidx/compose/material3/t4;Landroidx/compose/material3/x4;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.r<h, t4<x4>, x4, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f15270b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15271c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15272d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f15273e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f15275g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f15276h;

        /* compiled from: NavigationDrawer.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "velocity", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f15277b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.e f15278c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, k1.e eVar) {
                super(2);
                this.f15277b = hVar;
                this.f15278c = eVar;
            }

            public final void a(float f4, float f5) {
                this.f15277b.a(f4, f5);
                this.f15278c.f75326b = f4;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4, Float f5) {
                a(f4.floatValue(), f5.floatValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f4, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
            this.f15275g = f4;
            this.f15276h = kVar;
        }

        @Override // ld.r
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(@fg.l h hVar, @fg.l t4<x4> t4Var, @fg.l x4 x4Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            e eVar = w4.this.new e(this.f15275g, this.f15276h, dVar);
            eVar.f15271c = hVar;
            eVar.f15272d = t4Var;
            eVar.f15273e = x4Var;
            return eVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f15270b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                h hVar = (h) this.f15271c;
                float e4 = ((t4) this.f15272d).e((x4) this.f15273e);
                if (!Float.isNaN(e4)) {
                    k1.e eVar = new k1.e();
                    float h4 = Float.isNaN(w4.this.h()) ? 0.0f : w4.this.h();
                    eVar.f75326b = h4;
                    float f4 = this.f15275g;
                    androidx.compose.animation.core.k<Float> kVar = this.f15276h;
                    a aVar2 = new a(hVar, eVar);
                    this.f15271c = null;
                    this.f15272d = null;
                    this.f15270b = 1;
                    if (androidx.compose.animation.core.c2.c(h4, e4, f4, kVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/material3/w4$f", "Landroidx/compose/runtime/b5;", "", "getValue", "()Ljava/lang/Float;", "value", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements androidx.compose.runtime.b5<Float> {
        f() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.b5
        @fg.l
        public Float getValue() {
            return Float.valueOf(w4.this.g().x());
        }
    }

    public w4(@fg.l x4 x4Var, @fg.l ld.l<? super x4, Boolean> lVar) {
        androidx.compose.animation.core.h2 h2Var;
        androidx.compose.runtime.k2 g4;
        h2Var = l7.f12193d;
        this.anchoredDraggableState = new k<>(x4Var, c.f15268b, new d(), h2Var, lVar);
        this.offset = new f();
        g4 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this.density = g4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(x4 x4Var, androidx.compose.animation.core.k<Float> kVar, float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object l4 = k.l(this.anchoredDraggableState, x4Var, null, new e(f4, kVar, null), dVar, 2, null);
        return l4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? l4 : kotlin.k2.f75408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object e(w4 w4Var, x4 x4Var, androidx.compose.animation.core.k kVar, float f4, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = l7.f12193d;
        }
        if ((i4 & 4) != 0) {
            f4 = w4Var.anchoredDraggableState.w();
        }
        return w4Var.c(x4Var, kVar, f4, dVar);
    }

    @kotlin.k(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @kotlin.x0(expression = "currentOffset", imports = {}))
    public static /* synthetic */ void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.unit.d r() {
        androidx.compose.ui.unit.d j4 = j();
        if (j4 != null) {
            return j4;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    @fg.m
    @kotlin.k(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    public final Object d(@fg.l x4 x4Var, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = e(this, x4Var, kVar, 0.0f, dVar, 4, null);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object f(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = e(this, x4.Closed, null, 0.0f, dVar, 6, null);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    @fg.l
    public final k<x4> g() {
        return this.anchoredDraggableState;
    }

    public final float h() {
        return this.anchoredDraggableState.x();
    }

    @fg.l
    public final x4 i() {
        return this.anchoredDraggableState.t();
    }

    @fg.m
    public final androidx.compose.ui.unit.d j() {
        return (androidx.compose.ui.unit.d) this.density.getValue();
    }

    @fg.l
    public final androidx.compose.runtime.b5<Float> k() {
        return this.offset;
    }

    @fg.l
    public final x4 m() {
        return this.anchoredDraggableState.A();
    }

    public final boolean n() {
        return this.anchoredDraggableState.C();
    }

    public final boolean o() {
        return i() == x4.Closed;
    }

    public final boolean p() {
        return i() == x4.Open;
    }

    @fg.m
    public final Object q(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = e(this, x4.Open, null, 0.0f, dVar, 6, null);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    public final float s() {
        return this.anchoredDraggableState.E();
    }

    public final void t(@fg.m androidx.compose.ui.unit.d dVar) {
        this.density.setValue(dVar);
    }

    @fg.m
    public final Object u(@fg.l x4 x4Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object j4 = j.j(this.anchoredDraggableState, x4Var, dVar);
        return j4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? j4 : kotlin.k2.f75408a;
    }

    public /* synthetic */ w4(x4 x4Var, ld.l lVar, int i4, kotlin.jvm.internal.w wVar) {
        this(x4Var, (i4 & 2) != 0 ? a.f15265b : lVar);
    }
}
