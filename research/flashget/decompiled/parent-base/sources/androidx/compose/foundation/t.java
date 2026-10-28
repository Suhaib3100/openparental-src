package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/c2;", "mutatorMutex", "Landroidx/compose/foundation/u;", "c", "(ZZLandroidx/compose/foundation/c2;Landroidx/compose/runtime/t;II)Landroidx/compose/foundation/u;", "a", "(ZZLandroidx/compose/foundation/c2;)Landroidx/compose/foundation/u;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,246:1\n50#2:247\n49#2:248\n1116#3,6:249\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:247\n83#1:248\n83#1:249,6\n*E\n"})
/* loaded from: classes.dex */
public final class t {
    @x4
    @fg.l
    @z0
    public static final u a(boolean z4, boolean z5, @fg.l c2 c2Var) {
        return new v(z4, z5, c2Var);
    }

    public static u b(boolean z4, boolean z5, c2 c2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            c2Var = s.f6998a.a();
        }
        return new v(z4, z5, c2Var);
    }

    @fg.l
    @z0
    @androidx.compose.runtime.i
    public static final u c(boolean z4, boolean z5, @fg.m c2 c2Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1123859613);
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            c2Var = s.f6998a.a();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1123859613, i4, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:82)");
        }
        Boolean valueOf = Boolean.valueOf(z5);
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(c2Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new v(z4, z5, c2Var);
            tVar.E(Q);
        }
        tVar.p0();
        v vVar = (v) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return vVar;
    }
}
