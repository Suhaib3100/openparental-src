package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.runtime.b5;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.d2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material/ripple/s;", "", "", "bounded", "Landroidx/compose/runtime/b5;", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/b5;)V", "Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/interaction/h;Lkotlinx/coroutines/r0;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/d2;", "color", "b", "(Landroidx/compose/ui/graphics/drawscope/f;FJ)V", "a", "Z", "Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/b;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Landroidx/compose/foundation/interaction/h;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,364:1\n137#2:365\n215#3,8:366\n262#3,11:374\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n313#1:365\n325#1:366,8\n325#1:374,11\n*E\n"})
/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<h> rippleAlpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> animatedAlpha = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<androidx.compose.foundation.interaction.h> interactions = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.h currentInteraction;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9389b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9391d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f9392e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9391d = f4;
            this.f9392e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return s.this.new a(this.f9391d, this.f9392e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9389b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = s.this.animatedAlpha;
                Float f4 = new Float(this.f9391d);
                androidx.compose.animation.core.k<Float> kVar = this.f9392e;
                this.f9389b = 1;
                if (androidx.compose.animation.core.b.i(bVar, f4, kVar, null, null, this, 12, null) == aVar) {
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

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9393b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f9395d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f9395d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return s.this.new b(this.f9395d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9393b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = s.this.animatedAlpha;
                Float f4 = new Float(0.0f);
                androidx.compose.animation.core.k<Float> kVar = this.f9395d;
                this.f9393b = 1;
                if (androidx.compose.animation.core.b.i(bVar, f4, kVar, null, null, this, 12, null) == aVar) {
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
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public s(boolean z4, @fg.l b5<h> b5Var) {
        this.bounded = z4;
        this.rippleAlpha = b5Var;
    }

    public final void b(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, float f4, long j4) {
        float a5 = Float.isNaN(f4) ? j.a(fVar, this.bounded, fVar.e()) : fVar.v5(f4);
        float floatValue = this.animatedAlpha.v().floatValue();
        if (floatValue > 0.0f) {
            long w4 = d2.w(j4, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                androidx.compose.ui.graphics.drawscope.f.u6(fVar, w4, a5, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float t4 = i0.n.t(fVar.e());
            float m4 = i0.n.m(fVar.e());
            c2.INSTANCE.getClass();
            int i4 = c2.f17637d;
            androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().b(0.0f, 0.0f, t4, m4, i4);
            androidx.compose.ui.graphics.drawscope.f.u6(fVar, w4, a5, 0L, 0.0f, null, null, 0, 124, null);
            drawContext.i().o();
            drawContext.j(e4);
        }
    }

    public final void c(@fg.l androidx.compose.foundation.interaction.h interaction, @fg.l r0 scope) {
        androidx.compose.animation.core.k d5;
        androidx.compose.animation.core.k c5;
        boolean z4 = interaction instanceof f.a;
        if (z4) {
            this.interactions.add(interaction);
        } else if (interaction instanceof f.b) {
            this.interactions.remove(((f.b) interaction).getEnter());
        } else if (interaction instanceof d.a) {
            this.interactions.add(interaction);
        } else if (interaction instanceof d.b) {
            this.interactions.remove(((d.b) interaction).getFocus());
        } else if (interaction instanceof a.b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof a.c) {
            this.interactions.remove(((a.c) interaction).getStart());
        } else if (!(interaction instanceof a.C0082a)) {
            return;
        } else {
            this.interactions.remove(((a.C0082a) interaction).getStart());
        }
        androidx.compose.foundation.interaction.h hVar = (androidx.compose.foundation.interaction.h) w.v3(this.interactions);
        if (l0.g(this.currentInteraction, hVar)) {
            return;
        }
        if (hVar != null) {
            float hoveredAlpha = z4 ? this.rippleAlpha.getValue().getHoveredAlpha() : interaction instanceof d.a ? this.rippleAlpha.getValue().getFocusedAlpha() : interaction instanceof a.b ? this.rippleAlpha.getValue().getDraggedAlpha() : 0.0f;
            c5 = p.c(hVar);
            kotlinx.coroutines.k.f(scope, null, null, new a(hoveredAlpha, c5, null), 3, null);
        } else {
            d5 = p.d(this.currentInteraction);
            kotlinx.coroutines.k.f(scope, null, null, new b(d5, null), 3, null);
        }
        this.currentInteraction = hVar;
    }
}
