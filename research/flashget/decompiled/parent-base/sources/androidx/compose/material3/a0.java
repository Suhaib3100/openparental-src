package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/c2;", "mutatorMutex", "Landroidx/compose/material3/b0;", "c", "(ZZLandroidx/compose/foundation/c2;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/b0;", "a", "(ZZLandroidx/compose/foundation/c2;)Landroidx/compose/material3/b0;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,248:1\n1116#2,6:249\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipKt\n*L\n88#1:249,6\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {
    @androidx.compose.runtime.x4
    @fg.l
    public static final b0 a(boolean z4, boolean z5, @fg.l androidx.compose.foundation.c2 c2Var) {
        return new c0(z4, z5, c2Var);
    }

    public static b0 b(boolean z4, boolean z5, androidx.compose.foundation.c2 c2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            c2Var = z.f15837a.a();
        }
        return new c0(z4, z5, c2Var);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b0 c(boolean z4, boolean z5, @fg.m androidx.compose.foundation.c2 c2Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1386430812);
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            c2Var = z.f15837a.a();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1386430812, i4, -1, "androidx.compose.material3.rememberBasicTooltipState (BasicTooltip.kt:87)");
        }
        tVar.P(-459690368);
        boolean z6 = ((((i4 & 112) ^ 48) > 32 && tVar.b(z5)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && tVar.q0(c2Var)) || (i4 & 384) == 256);
        Object Q = tVar.Q();
        if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c0(z4, z5, c2Var);
            tVar.E(Q);
        }
        c0 c0Var = (c0) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c0Var;
    }
}
