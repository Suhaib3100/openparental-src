package androidx.compose.material3;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.t;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u0010\u0010(\u001a\u0004\u0018\u00010'8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/r8;", "", "Landroidx/compose/ui/unit/h;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "", "enabled", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/runtime/b5;", "c", "(ZLandroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "m", "(Z)F", "l", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "h", "()F", "b", "k", "i", "d", "j", "e", "g", "f", "Landroidx/compose/foundation/interaction/h;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2741:1\n1116#2,6:2742\n1116#2,6:2748\n1116#2,6:2754\n1116#2,6:2760\n1116#2,6:2766\n81#3:2772\n107#3,2:2773\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n*L\n2261#1:2742,6\n2262#1:2748,6\n2263#1:2754,6\n2323#1:2760,6\n2325#1:2766,6\n2262#1:2772\n2262#1:2773,2\n*E\n"})
/* loaded from: classes.dex */
public final class r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f14285g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float draggedElevation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* compiled from: Chip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$1$1", f = "Chip.kt", i = {}, l = {2264}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f14292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f14293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f14294d;

        /* compiled from: Chip.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.r8$a$a, reason: collision with other inner class name */
        static final class C0292a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f14295b;

            C0292a(androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var) {
                this.f14295b = b0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof f.a) {
                    this.f14295b.add(hVar);
                } else if (hVar instanceof f.b) {
                    this.f14295b.remove(((f.b) hVar).getEnter());
                } else if (hVar instanceof d.a) {
                    this.f14295b.add(hVar);
                } else if (hVar instanceof d.b) {
                    this.f14295b.remove(((d.b) hVar).getFocus());
                } else if (hVar instanceof m.b) {
                    this.f14295b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f14295b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f14295b.remove(((m.a) hVar).getPress());
                } else if (hVar instanceof a.b) {
                    this.f14295b.add(hVar);
                } else if (hVar instanceof a.c) {
                    this.f14295b.remove(((a.c) hVar).getStart());
                } else if (hVar instanceof a.C0082a) {
                    this.f14295b.remove(((a.C0082a) hVar).getStart());
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f14293c = iVar;
            this.f14294d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f14293c, this.f14294d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f14292b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f14293c.c();
                C0292a c0292a = new C0292a(this.f14294d);
                this.f14292b = 1;
                if (c5.a(c0292a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Chip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2329, 2331}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f14296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f14297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14298d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14299e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f14300f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.foundation.interaction.h> f14301g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar, float f4, boolean z4, androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.k2<androidx.compose.foundation.interaction.h> k2Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14297c = bVar;
            this.f14298d = f4;
            this.f14299e = z4;
            this.f14300f = hVar;
            this.f14301g = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f14297c, this.f14298d, this.f14299e, this.f14300f, this.f14301g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f14296b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (!androidx.compose.ui.unit.h.l(this.f14297c.s().u(), this.f14298d)) {
                    if (this.f14299e) {
                        androidx.compose.foundation.interaction.h a5 = r8.a(this.f14301g);
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.f14297c;
                        float f4 = this.f14298d;
                        androidx.compose.foundation.interaction.h hVar = this.f14300f;
                        this.f14296b = 2;
                        if (b5.d(bVar, f4, a5, hVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar2 = this.f14297c;
                        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(this.f14298d);
                        this.f14296b = 1;
                        if (bVar2.C(d5, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return kotlin.k2.f75408a;
            }
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            r8.b(this.f14301g, this.f14300f);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public /* synthetic */ r8(float f4, float f5, float f6, float f7, float f10, float f11, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, f10, f11);
    }

    public static final androidx.compose.foundation.interaction.h a(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.foundation.interaction.h) k2Var.getValue();
    }

    public static final void b(androidx.compose.runtime.k2 k2Var, androidx.compose.foundation.interaction.h hVar) {
        k2Var.setValue(hVar);
    }

    @androidx.compose.runtime.i
    private final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c(boolean z4, androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(664514136);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(664514136, i4, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2259)");
        }
        tVar.P(-699454716);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = new androidx.compose.runtime.snapshots.b0();
            tVar.E(Q);
        }
        androidx.compose.runtime.snapshots.b0 b0Var = (androidx.compose.runtime.snapshots.b0) Q;
        Object a5 = w.a(tVar, -699454638);
        if (a5 == companion.a()) {
            a5 = androidx.compose.runtime.t4.g(null, null, 2, null);
            tVar.E(a5);
        }
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) a5;
        tVar.p0();
        tVar.P(-699454548);
        boolean z5 = true;
        boolean z6 = (((i4 & 112) ^ 48) > 32 && tVar.q0(iVar)) || (i4 & 48) == 32;
        Object Q2 = tVar.Q();
        if (z6 || Q2 == companion.a()) {
            Q2 = new a(iVar, b0Var, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(iVar, (ld.p) Q2, tVar, (i4 >> 3) & 14);
        androidx.compose.foundation.interaction.h hVar = (androidx.compose.foundation.interaction.h) kotlin.collections.w.v3(b0Var);
        float f4 = !z4 ? this.disabledElevation : hVar instanceof m.b ? this.pressedElevation : hVar instanceof f.a ? this.hoveredElevation : hVar instanceof d.a ? this.focusedElevation : hVar instanceof a.b ? this.draggedElevation : this.elevation;
        tVar.P(-699452563);
        Object Q3 = tVar.Q();
        if (Q3 == companion.a()) {
            Q3 = new androidx.compose.animation.core.b(androidx.compose.ui.unit.h.d(f4), androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
            tVar.E(Q3);
        }
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q3;
        tVar.p0();
        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(f4);
        tVar.P(-699452479);
        boolean S = tVar.S(bVar) | tVar.d(f4);
        if ((((i4 & 14) ^ 6) <= 4 || !tVar.b(z4)) && (i4 & 6) != 4) {
            z5 = false;
        }
        boolean S2 = S | z5 | tVar.S(hVar);
        Object Q4 = tVar.Q();
        if (S2 || Q4 == companion.a()) {
            Object bVar2 = new b(bVar, f4, z4, hVar, k2Var, null);
            tVar.E(bVar2);
            Q4 = bVar2;
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(d5, (ld.p) Q4, tVar, 0);
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> j4 = bVar.j();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    private static final androidx.compose.foundation.interaction.h d(androidx.compose.runtime.k2<androidx.compose.foundation.interaction.h> k2Var) {
        return k2Var.getValue();
    }

    private static final void e(androidx.compose.runtime.k2<androidx.compose.foundation.interaction.h> k2Var, androidx.compose.foundation.interaction.h hVar) {
        k2Var.setValue(hVar);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) other;
        return androidx.compose.ui.unit.h.l(this.elevation, r8Var.elevation) && androidx.compose.ui.unit.h.l(this.pressedElevation, r8Var.pressedElevation) && androidx.compose.ui.unit.h.l(this.focusedElevation, r8Var.focusedElevation) && androidx.compose.ui.unit.h.l(this.hoveredElevation, r8Var.hoveredElevation) && androidx.compose.ui.unit.h.l(this.disabledElevation, r8Var.disabledElevation);
    }

    /* renamed from: f, reason: from getter */
    public final float getDisabledElevation() {
        return this.disabledElevation;
    }

    /* renamed from: g, reason: from getter */
    public final float getDraggedElevation() {
        return this.draggedElevation;
    }

    /* renamed from: h, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public int hashCode() {
        return Float.hashCode(this.disabledElevation) + androidx.compose.animation.l0.a(this.hoveredElevation, androidx.compose.animation.l0.a(this.focusedElevation, androidx.compose.animation.l0.a(this.pressedElevation, androidx.compose.ui.unit.h.n(this.elevation) * 31, 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final float getFocusedElevation() {
        return this.focusedElevation;
    }

    /* renamed from: j, reason: from getter */
    public final float getHoveredElevation() {
        return this.hoveredElevation;
    }

    /* renamed from: k, reason: from getter */
    public final float getPressedElevation() {
        return this.pressedElevation;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> l(boolean z4, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1888175651);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1888175651, i4, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2251)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c5 = c(z4, iVar, tVar, i4 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    public final float m(boolean enabled) {
        return enabled ? this.elevation : this.disabledElevation;
    }

    private r8(float f4, float f5, float f6, float f7, float f10, float f11) {
        this.elevation = f4;
        this.pressedElevation = f5;
        this.focusedElevation = f6;
        this.hoveredElevation = f7;
        this.draggedElevation = f10;
        this.disabledElevation = f11;
    }
}
