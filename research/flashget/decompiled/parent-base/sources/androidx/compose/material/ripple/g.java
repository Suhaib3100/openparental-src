package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.n1;
import androidx.compose.foundation.o1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.x;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.r0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Ripple.kt */
@x4
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H'ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/g;", "Landroidx/compose/foundation/n1;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/graphics/d2;", "color", "<init>", "(ZFLandroidx/compose/runtime/b5;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/foundation/o1;", "a", "(Landroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/o1;", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "Landroidx/compose/material/ripple/o;", "b", "(Landroidx/compose/foundation/interaction/i;ZFLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Landroidx/compose/runtime/t;I)Landroidx/compose/material/ripple/o;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "F", "c", "Landroidx/compose/runtime/b5;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,364:1\n74#2:365\n646#3:366\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:365\n119#1:366\n*E\n"})
/* loaded from: classes.dex */
public abstract class g implements n1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9304d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<d2> color;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {SyslogAppender.LOG_LOCAL1}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9308b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9309c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f9310d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f9311e;

        /* compiled from: Ripple.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.ripple.g$a$a, reason: collision with other inner class name */
        static final class C0203a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f9312b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f9313c;

            C0203a(o oVar, r0 r0Var) {
                this.f9312b = oVar;
                this.f9313c = r0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                if (hVar instanceof m.b) {
                    this.f9312b.e((m.b) hVar, this.f9313c);
                } else if (hVar instanceof m.c) {
                    this.f9312b.g(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f9312b.g(((m.a) hVar).getPress());
                } else {
                    this.f9312b.h(hVar, this.f9313c);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.i iVar, o oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9310d = iVar;
            this.f9311e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f9310d, this.f9311e, dVar);
            aVar.f9309c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9308b;
            if (i4 == 0) {
                a1.n(obj);
                r0 r0Var = (r0) this.f9309c;
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f9310d.c();
                C0203a c0203a = new C0203a(this.f9311e, r0Var);
                this.f9308b = 1;
                if (c5.a(c0203a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public /* synthetic */ g(boolean z4, float f4, b5 b5Var, w wVar) {
        this(z4, f4, b5Var);
    }

    @Override // androidx.compose.foundation.n1
    @fg.l
    @androidx.compose.runtime.i
    public final o1 a(@fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(988743187);
        if (x.b0()) {
            x.r0(988743187, i4, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:115)");
        }
        q qVar = (q) tVar.x(r.d());
        tVar.P(-1524341038);
        long M = this.color.getValue().M();
        d2.INSTANCE.getClass();
        long M2 = M != d2.f17778o ? this.color.getValue().M() : qVar.a(tVar, 0);
        tVar.p0();
        o b5 = b(iVar, this.bounded, this.radius, o4.u(d2.n(M2), tVar, 0), o4.u(qVar.b(tVar, 0), tVar, 0), tVar, (i4 & 14) | ((i4 << 12) & 458752));
        androidx.compose.runtime.a1.g(b5, iVar, new a(iVar, b5, null), tVar, ((i4 << 3) & 112) | 520);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public abstract o b(@fg.l androidx.compose.foundation.interaction.i iVar, boolean z4, float f4, @fg.l b5<d2> b5Var, @fg.l b5<h> b5Var2, @fg.m androidx.compose.runtime.t tVar, int i4);

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.bounded == gVar.bounded && androidx.compose.ui.unit.h.l(this.radius, gVar.radius) && l0.g(this.color, gVar.color);
    }

    public int hashCode() {
        return this.color.hashCode() + ((androidx.compose.ui.unit.h.n(this.radius) + (Boolean.hashCode(this.bounded) * 31)) * 31);
    }

    private g(boolean z4, float f4, b5<d2> b5Var) {
        this.bounded = z4;
        this.radius = f4;
        this.color = b5Var;
    }
}
