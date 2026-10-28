package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8gX§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/s;", "", "Landroidx/compose/ui/q;", "Landroidx/compose/animation/f0;", "enter", "Landroidx/compose/animation/h0;", "exit", "", "label", "d", "(Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;)Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "b", "()Landroidx/compose/animation/core/e2;", "getTransition$annotations", "()V", "transition", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,919:1\n135#2:920\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n672#1:920\n*E\n"})
/* loaded from: classes.dex */
public interface s {

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @j0
        @Deprecated
        public static androidx.compose.ui.q a(@fg.l s sVar, @fg.l androidx.compose.ui.q qVar, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l String str) {
            return s.super.d(qVar, f0Var, h0Var, str);
        }

        @j0
        public static /* synthetic */ void c() {
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,170:1\n673#2,5:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f3351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f3352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0 f0Var, h0 h0Var, String str) {
            super(1);
            this.f3351b = f0Var;
            this.f3352c = h0Var;
            this.f3353d = str;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("animateEnterExit");
            a2Var.getProperties().c("enter", this.f3351b);
            a2Var.getProperties().c("exit", this.f3352c);
            a2Var.getProperties().c("label", this.f3353d);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f3355c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f3356d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3357e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var, h0 h0Var, String str) {
            super(3);
            this.f3355c = f0Var;
            this.f3356d = h0Var;
            this.f3357e = str;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1840112047);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1840112047, i4, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:678)");
            }
            androidx.compose.ui.q w32 = qVar.w3(d0.i(s.this.b(), this.f3355c, this.f3356d, this.f3357e, tVar, 0));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return w32;
        }
    }

    static /* synthetic */ androidx.compose.ui.q c(s sVar, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i4 & 1) != 0) {
            f0Var = d0.q(null, 0.0f, 3, null).c(d0.m(null, null, false, null, 15, null));
        }
        if ((i4 & 2) != 0) {
            h0Var = d0.s(null, 0.0f, 3, null).d(d0.C(null, null, false, null, 15, null));
        }
        if ((i4 & 4) != 0) {
            str = "animateEnterExit";
        }
        return sVar.d(qVar, f0Var, h0Var, str);
    }

    @fg.l
    @j0
    e2<b0> b();

    @fg.l
    @j0
    default androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l String str) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new b(f0Var, h0Var, str) : y1.b(), new c(f0Var, h0Var, str));
    }
}
