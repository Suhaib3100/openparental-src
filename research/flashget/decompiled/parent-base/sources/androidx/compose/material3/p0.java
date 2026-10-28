package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.t;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.Metadata;

/* compiled from: Button.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/p0;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/w;)V", "", "enabled", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/runtime/b5;", "d", "(ZLandroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "f", "(Z)F", "e", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1068:1\n1116#2,6:1069\n1116#2,6:1075\n1116#2,6:1081\n1116#2,6:1087\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n*L\n897#1:1069,6\n898#1:1075,6\n946#1:1081,6\n948#1:1087,6\n*E\n"})
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f13187f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* compiled from: Button.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {899}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f13195d;

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.p0$a$a, reason: collision with other inner class name */
        static final class C0284a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> f13196b;

            C0284a(androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var) {
                this.f13196b = b0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof f.a) {
                    this.f13196b.add(hVar);
                } else if (hVar instanceof f.b) {
                    this.f13196b.remove(((f.b) hVar).getEnter());
                } else if (hVar instanceof d.a) {
                    this.f13196b.add(hVar);
                } else if (hVar instanceof d.b) {
                    this.f13196b.remove(((d.b) hVar).getFocus());
                } else if (hVar instanceof m.b) {
                    this.f13196b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f13196b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f13196b.remove(((m.a) hVar).getPress());
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.snapshots.b0<androidx.compose.foundation.interaction.h> b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13194c = iVar;
            this.f13195d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f13194c, this.f13195d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13193b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f13194c.c();
                C0284a c0284a = new C0284a(this.f13195d);
                this.f13193b = 1;
                if (c5.a(c0284a, this) == aVar) {
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

    /* compiled from: Button.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {952, 960}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13197b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f13198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p0 f13201f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f13202g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar, float f4, boolean z4, p0 p0Var, androidx.compose.foundation.interaction.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f13198c = bVar;
            this.f13199d = f4;
            this.f13200e = z4;
            this.f13201f = p0Var;
            this.f13202g = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f13198c, this.f13199d, this.f13200e, this.f13201f, this.f13202g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13197b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (!androidx.compose.ui.unit.h.l(this.f13198c.s().u(), this.f13199d)) {
                    if (this.f13200e) {
                        float u4 = this.f13198c.s().u();
                        androidx.compose.foundation.interaction.h hVar = null;
                        if (androidx.compose.ui.unit.h.l(u4, this.f13201f.pressedElevation)) {
                            i0.f.INSTANCE.getClass();
                            hVar = new m.b(i0.f.f74147c, null);
                        } else if (androidx.compose.ui.unit.h.l(u4, this.f13201f.hoveredElevation)) {
                            hVar = new f.a();
                        } else if (androidx.compose.ui.unit.h.l(u4, this.f13201f.focusedElevation)) {
                            hVar = new d.a();
                        }
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.f13198c;
                        float f4 = this.f13199d;
                        androidx.compose.foundation.interaction.h hVar2 = this.f13202g;
                        this.f13197b = 2;
                        if (b5.d(bVar, f4, hVar, hVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar2 = this.f13198c;
                        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(this.f13199d);
                        this.f13197b = 1;
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

    public /* synthetic */ p0(float f4, float f5, float f6, float f7, float f10, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, f10);
    }

    @androidx.compose.runtime.i
    private final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> d(boolean z4, androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1312510462);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1312510462, i4, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:895)");
        }
        tVar.P(-719928578);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = new androidx.compose.runtime.snapshots.b0();
            tVar.E(Q);
        }
        androidx.compose.runtime.snapshots.b0 b0Var = (androidx.compose.runtime.snapshots.b0) Q;
        tVar.p0();
        tVar.P(-719928489);
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
        float f4 = !z4 ? this.disabledElevation : hVar instanceof m.b ? this.pressedElevation : hVar instanceof f.a ? this.hoveredElevation : hVar instanceof d.a ? this.focusedElevation : this.defaultElevation;
        tVar.P(-719926909);
        Object Q3 = tVar.Q();
        if (Q3 == companion.a()) {
            Q3 = new androidx.compose.animation.core.b(androidx.compose.ui.unit.h.d(f4), androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
            tVar.E(Q3);
        }
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q3;
        tVar.p0();
        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(f4);
        tVar.P(-719926825);
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

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> e(boolean z4, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2045116089);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2045116089, i4, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:887)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> d5 = d(z4, iVar, tVar, i4 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) other;
        return androidx.compose.ui.unit.h.l(this.defaultElevation, p0Var.defaultElevation) && androidx.compose.ui.unit.h.l(this.pressedElevation, p0Var.pressedElevation) && androidx.compose.ui.unit.h.l(this.focusedElevation, p0Var.focusedElevation) && androidx.compose.ui.unit.h.l(this.hoveredElevation, p0Var.hoveredElevation) && androidx.compose.ui.unit.h.l(this.disabledElevation, p0Var.disabledElevation);
    }

    public final float f(boolean enabled) {
        return enabled ? this.defaultElevation : this.disabledElevation;
    }

    public int hashCode() {
        return Float.hashCode(this.disabledElevation) + androidx.compose.animation.l0.a(this.hoveredElevation, androidx.compose.animation.l0.a(this.focusedElevation, androidx.compose.animation.l0.a(this.pressedElevation, androidx.compose.ui.unit.h.n(this.defaultElevation) * 31, 31), 31), 31);
    }

    private p0(float f4, float f5, float f6, float f7, float f10) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.focusedElevation = f6;
        this.hoveredElevation = f7;
        this.disabledElevation = f10;
    }
}
