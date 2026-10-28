package androidx.compose.material3;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.t;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.Metadata;

/* compiled from: Card.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/m2;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "", "enabled", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/runtime/b5;", "e", "(ZLandroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "g", "(Z)F", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,850:1\n1116#2,6:851\n1116#2,6:857\n1116#2,6:863\n1116#2,6:869\n1116#2,6:875\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n654#1:851,6\n664#1:857,6\n665#1:863,6\n726#1:869,6\n728#1:875,6\n*E\n"})
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f12520g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

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

    /* compiled from: Card.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", i = {}, l = {666}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f12528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f12529d;

        /* compiled from: Card.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.m2$a$a, reason: collision with other inner class name */
        static final class C0273a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f12530b;

            C0273a(androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var) {
                this.f12530b = b0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof f.a) {
                    this.f12530b.add(hVar);
                } else if (hVar instanceof f.b) {
                    this.f12530b.remove(((f.b) hVar).getEnter());
                } else if (hVar instanceof d.a) {
                    this.f12530b.add(hVar);
                } else if (hVar instanceof d.b) {
                    this.f12530b.remove(((d.b) hVar).getFocus());
                } else if (hVar instanceof m.b) {
                    this.f12530b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f12530b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f12530b.remove(((m.a) hVar).getPress());
                } else if (hVar instanceof a.b) {
                    this.f12530b.add(hVar);
                } else if (hVar instanceof a.c) {
                    this.f12530b.remove(((a.c) hVar).getStart());
                } else if (hVar instanceof a.C0082a) {
                    this.f12530b.remove(((a.C0082a) hVar).getStart());
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12528c = iVar;
            this.f12529d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f12528c, this.f12529d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12527b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f12528c.c();
                C0273a c0273a = new C0273a(this.f12529d);
                this.f12527b = 1;
                if (c5.a(c0273a, this) == aVar) {
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

    /* compiled from: Card.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", i = {}, l = {732, 741}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12531b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f12532c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12533d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12534e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m2 f12535f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f12536g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar, float f4, boolean z4, m2 m2Var, androidx.compose.foundation.interaction.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f12532c = bVar;
            this.f12533d = f4;
            this.f12534e = z4;
            this.f12535f = m2Var;
            this.f12536g = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f12532c, this.f12533d, this.f12534e, this.f12535f, this.f12536g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12531b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (!androidx.compose.ui.unit.h.l(this.f12532c.s().u(), this.f12533d)) {
                    if (this.f12534e) {
                        float u4 = this.f12532c.s().u();
                        androidx.compose.foundation.interaction.h hVar = null;
                        if (androidx.compose.ui.unit.h.l(u4, this.f12535f.pressedElevation)) {
                            i0.f.INSTANCE.getClass();
                            hVar = new m.b(i0.f.f74147c, null);
                        } else if (androidx.compose.ui.unit.h.l(u4, this.f12535f.hoveredElevation)) {
                            hVar = new f.a();
                        } else if (androidx.compose.ui.unit.h.l(u4, this.f12535f.focusedElevation)) {
                            hVar = new d.a();
                        } else if (androidx.compose.ui.unit.h.l(u4, this.f12535f.draggedElevation)) {
                            hVar = new a.b();
                        }
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.f12532c;
                        float f4 = this.f12533d;
                        androidx.compose.foundation.interaction.h hVar2 = this.f12536g;
                        this.f12531b = 2;
                        if (b5.d(bVar, f4, hVar, hVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar2 = this.f12532c;
                        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(this.f12533d);
                        this.f12531b = 1;
                        if (bVar2.C(d5, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public /* synthetic */ m2(float f4, float f5, float f6, float f7, float f10, float f11, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, f10, f11);
    }

    @androidx.compose.runtime.i
    private final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> e(boolean z4, androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1421890746);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1421890746, i4, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:662)");
        }
        tVar.P(-748208142);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = new androidx.compose.runtime.snapshots.b0();
            tVar.E(Q);
        }
        androidx.compose.runtime.snapshots.b0 b0Var = (androidx.compose.runtime.snapshots.b0) Q;
        tVar.p0();
        tVar.P(-748208053);
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
        float f4 = !z4 ? this.disabledElevation : hVar instanceof m.b ? this.pressedElevation : hVar instanceof f.a ? this.hoveredElevation : hVar instanceof d.a ? this.focusedElevation : hVar instanceof a.b ? this.draggedElevation : this.defaultElevation;
        tVar.P(-748206009);
        Object Q3 = tVar.Q();
        if (Q3 == companion.a()) {
            Q3 = new androidx.compose.animation.core.b(androidx.compose.ui.unit.h.d(f4), androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
            tVar.E(Q3);
        }
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q3;
        tVar.p0();
        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(f4);
        tVar.P(-748205925);
        boolean S = tVar.S(bVar) | tVar.d(f4) | ((((i4 & 14) ^ 6) > 4 && tVar.b(z4)) || (i4 & 6) == 4);
        if ((((i4 & 896) ^ 384) <= 256 || !tVar.q0(this)) && (i4 & 384) != 256) {
            z5 = false;
        }
        boolean S2 = S | z5 | tVar.S(hVar);
        Object Q4 = tVar.Q();
        if (S2 || Q4 == companion.a()) {
            Object bVar2 = new b(bVar, f4, z4, this, hVar, null);
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

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) other;
        return androidx.compose.ui.unit.h.l(this.defaultElevation, m2Var.defaultElevation) && androidx.compose.ui.unit.h.l(this.pressedElevation, m2Var.pressedElevation) && androidx.compose.ui.unit.h.l(this.focusedElevation, m2Var.focusedElevation) && androidx.compose.ui.unit.h.l(this.hoveredElevation, m2Var.hoveredElevation) && androidx.compose.ui.unit.h.l(this.disabledElevation, m2Var.disabledElevation);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f(boolean z4, @fg.m androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1763481333);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1763481333, i4, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:651)");
        }
        tVar.P(-1409178619);
        if (iVar != null) {
            tVar.p0();
            androidx.compose.runtime.b5<androidx.compose.ui.unit.h> e4 = e(z4, iVar, tVar, i4 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return e4;
        }
        tVar.P(-1409178567);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = androidx.compose.runtime.t4.g(androidx.compose.ui.unit.h.d(this.defaultElevation), null, 2, null);
            tVar.E(Q);
        }
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        tVar.p0();
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    public final float g(boolean enabled) {
        return enabled ? this.defaultElevation : this.disabledElevation;
    }

    public int hashCode() {
        return Float.hashCode(this.disabledElevation) + androidx.compose.animation.l0.a(this.hoveredElevation, androidx.compose.animation.l0.a(this.focusedElevation, androidx.compose.animation.l0.a(this.pressedElevation, androidx.compose.ui.unit.h.n(this.defaultElevation) * 31, 31), 31), 31);
    }

    private m2(float f4, float f5, float f6, float f7, float f10, float f11) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.focusedElevation = f6;
        this.hoveredElevation = f7;
        this.draggedElevation = f10;
        this.disabledElevation = f11;
    }
}
