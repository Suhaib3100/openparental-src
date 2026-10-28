package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/p5;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/runtime/b5;", "e", "(Landroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "f", "g", "()F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n499#1:672,6\n508#1:678,6\n517#1:684,6\n*E\n"})
/* loaded from: classes.dex */
public class p5 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f13209e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q5 f13215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p5 f13216d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q5 q5Var, p5 p5Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13215c = q5Var;
            this.f13216d = p5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f13215c, this.f13216d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13214b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                q5 q5Var = this.f13215c;
                float f4 = this.f13216d.defaultElevation;
                float f5 = this.f13216d.pressedElevation;
                float f6 = this.f13216d.hoveredElevation;
                float f7 = this.f13216d.focusedElevation;
                this.f13214b = 1;
                if (q5Var.f(f4, f5, f6, f7, this) == aVar) {
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

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13217b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13219d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q5 f13220e;

        /* compiled from: FloatingActionButton.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.foundation.interaction.h> f13221b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f13222c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q5 f13223d;

            /* compiled from: FloatingActionButton.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.p5$b$a$a, reason: collision with other inner class name */
            static final class C0285a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f13224b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ q5 f13225c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.h f13226d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0285a(q5 q5Var, androidx.compose.foundation.interaction.h hVar, kotlin.coroutines.d<? super C0285a> dVar) {
                    super(2, dVar);
                    this.f13225c = q5Var;
                    this.f13226d = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0285a(this.f13225c, this.f13226d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f13224b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        q5 q5Var = this.f13225c;
                        androidx.compose.foundation.interaction.h hVar = this.f13226d;
                        this.f13224b = 1;
                        if (q5Var.b(hVar, this) == aVar) {
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
                    return ((C0285a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            a(List<androidx.compose.foundation.interaction.h> list, kotlinx.coroutines.r0 r0Var, q5 q5Var) {
                this.f13221b = list;
                this.f13222c = r0Var;
                this.f13223d = q5Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof f.a) {
                    this.f13221b.add(hVar);
                } else if (hVar instanceof f.b) {
                    this.f13221b.remove(((f.b) hVar).getEnter());
                } else if (hVar instanceof d.a) {
                    this.f13221b.add(hVar);
                } else if (hVar instanceof d.b) {
                    this.f13221b.remove(((d.b) hVar).getFocus());
                } else if (hVar instanceof m.b) {
                    this.f13221b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f13221b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f13221b.remove(((m.a) hVar).getPress());
                }
                kotlinx.coroutines.k.f(this.f13222c, null, null, new C0285a(this.f13223d, (androidx.compose.foundation.interaction.h) kotlin.collections.w.v3(this.f13221b), null), 3, null);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.i iVar, q5 q5Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f13219d = iVar;
            this.f13220e = q5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f13219d, this.f13220e, dVar);
            bVar.f13218c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13217b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f13218c;
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f13219d.c();
                a aVar2 = new a(arrayList, r0Var, this.f13220e);
                this.f13217b = 1;
                if (c5.a(aVar2, this) == aVar) {
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
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public /* synthetic */ p5(float f4, float f5, float f6, float f7, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7);
    }

    @androidx.compose.runtime.i
    private final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> e(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1845106002);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1845106002, i4, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:497)");
        }
        tVar.P(1849274698);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z4 = (i6 > 4 && tVar.q0(iVar)) || (i4 & 6) == 4;
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new q5(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            tVar.E(Q);
        }
        q5 q5Var = (q5) Q;
        tVar.p0();
        tVar.P(1849275046);
        boolean S = tVar.S(q5Var) | ((((i4 & 112) ^ 48) > 32 && tVar.q0(this)) || (i4 & 48) == 32);
        Object Q2 = tVar.Q();
        if (S || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new a(q5Var, this, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(this, (ld.p) Q2, tVar, (i4 >> 3) & 14);
        tVar.P(1849275366);
        boolean S2 = tVar.S(q5Var) | ((i6 > 4 && tVar.q0(iVar)) || (i4 & 6) == 4);
        Object Q3 = tVar.Q();
        if (S2 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q3 = new b(iVar, q5Var, null);
            tVar.E(Q3);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(iVar, (ld.p) Q3, tVar, i5);
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c5 = q5Var.c();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) other;
        if (androidx.compose.ui.unit.h.l(this.defaultElevation, p5Var.defaultElevation) && androidx.compose.ui.unit.h.l(this.pressedElevation, p5Var.pressedElevation) && androidx.compose.ui.unit.h.l(this.focusedElevation, p5Var.focusedElevation)) {
            return androidx.compose.ui.unit.h.l(this.hoveredElevation, p5Var.hoveredElevation);
        }
        return false;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> f(@fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-424810125);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-424810125, i4, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:488)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> e4 = e(iVar, tVar, i4 & 126);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    /* renamed from: g, reason: from getter */
    public final float getDefaultElevation() {
        return this.defaultElevation;
    }

    public int hashCode() {
        return Float.hashCode(this.hoveredElevation) + androidx.compose.animation.l0.a(this.focusedElevation, androidx.compose.animation.l0.a(this.pressedElevation, androidx.compose.ui.unit.h.n(this.defaultElevation) * 31, 31), 31);
    }

    private p5(float f4, float f5, float f6, float f7) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.focusedElevation = f6;
        this.hoveredElevation = f7;
    }
}
