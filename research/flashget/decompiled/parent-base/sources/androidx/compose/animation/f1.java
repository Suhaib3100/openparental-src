package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.f2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.b5;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0084\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012*\b\n\u0010\b\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2&\u0010\u000e\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aD\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"S", "Landroidx/compose/animation/core/e2;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/graphics/d2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "transitionSpec", "", "label", "Lkotlin/r0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/b5;", "a", "(Landroidx/compose/animation/core/e2;Lld/q;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/y0;", "initialValue", "targetValue", "Landroidx/compose/animation/core/x0;", "animationSpec", "b", "(Landroidx/compose/animation/core/y0;JJLandroidx/compose/animation/core/x0;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "c", "(Landroidx/compose/animation/core/y0;JJLandroidx/compose/animation/core/x0;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n36#2:125\n25#2:137\n1116#3,6:126\n1116#3,6:138\n1083#4,5:132\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125\n103#1:137\n70#1:126,6\n103#1:138,6\n74#1:132,5\n*E\n"})
/* loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
    public static final class a<S> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<S>, androidx.compose.runtime.t, Integer, y1<d2>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3171b = new a(3);

        public a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ y1<d2> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
            return a((e2.b) obj, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final y1<d2> a(@fg.l e2.b<S> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1457805428);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1457805428, i4, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
            }
            y1<d2> p4 = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return p4;
        }
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    public static final <S> b5<d2> a(@fg.l e2<S> e2Var, @fg.m ld.q<? super e2.b<S>, ? super androidx.compose.runtime.t, ? super Integer, ? extends androidx.compose.animation.core.p0<d2>> qVar, @fg.m String str, @fg.l ld.q<? super S, ? super androidx.compose.runtime.t, ? super Integer, d2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1939694975);
        if ((i5 & 1) != 0) {
            qVar = a.f3171b;
        }
        if ((i5 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        androidx.compose.ui.graphics.colorspace.c E = d2.E(qVar2.R(e2Var.o(), tVar, Integer.valueOf((i4 >> 6) & 112)).M());
        tVar.P(1157296644);
        boolean q02 = tVar.q0(E);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = (i2) w.a(d2.INSTANCE).invoke(E);
            tVar.E(Q);
        }
        tVar.p0();
        int i6 = (i4 & 14) | 64;
        int i7 = i4 << 3;
        int i10 = i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344);
        tVar.P(-142660079);
        int i11 = (i10 >> 9) & 112;
        b5<d2> m4 = f2.m(e2Var, qVar2.R(e2Var.h(), tVar, Integer.valueOf(i11)), qVar2.R(e2Var.o(), tVar, Integer.valueOf(i11)), qVar.R(e2Var.m(), tVar, Integer.valueOf((i10 >> 3) & 112)), (i2) Q, str2, tVar, (i10 & 14) | 32768 | ((i10 << 6) & 458752));
        tVar.p0();
        tVar.p0();
        return m4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<d2> b(@fg.l androidx.compose.animation.core.y0 y0Var, long j4, long j5, @fg.l androidx.compose.animation.core.x0<d2> x0Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1901963533);
        String str2 = (i5 & 8) != 0 ? "ColorAnimation" : str;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1901963533, i4, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = (i2) w.a(d2.INSTANCE).invoke(d2.E(j5));
            tVar.E(Q);
        }
        tVar.p0();
        int i6 = i4 << 3;
        b5<d2> d5 = androidx.compose.animation.core.z0.d(y0Var, d2.n(j4), d2.n(j5), (i2) Q, x0Var, str2, tVar, androidx.compose.animation.core.y0.f2998f | 4096 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (androidx.compose.animation.core.x0.f2978d << 12) | (57344 & i6) | (i6 & 458752), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 c(androidx.compose.animation.core.y0 y0Var, long j4, long j5, androidx.compose.animation.core.x0 x0Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1400583834);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1400583834, i4, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        b5<d2> b5 = b(y0Var, j4, j5, x0Var, "ColorAnimation", tVar, androidx.compose.animation.core.y0.f2998f | 24576 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (androidx.compose.animation.core.x0.f2978d << 9) | (i4 & 7168), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }
}
