package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "isError", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/material3/pa;", "colors", "Landroidx/compose/ui/unit/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/b5;", "Landroidx/compose/foundation/c0;", "b", "(ZZLandroidx/compose/foundation/interaction/i;Landroidx/compose/material3/pa;FFLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "focused", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2400:1\n81#2:2401\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaultsKt\n*L\n2388#1:2401\n*E\n"})
/* loaded from: classes.dex */
public final class ra {
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final androidx.compose.runtime.b5<androidx.compose.foundation.c0> b(boolean z4, boolean z5, androidx.compose.foundation.interaction.i iVar, pa paVar, float f4, float f5, androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.b5<androidx.compose.ui.unit.h> u4;
        tVar.P(-1633063017);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1633063017, i4, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:2386)");
        }
        androidx.compose.runtime.b5<Boolean> a5 = androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14);
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> Y = paVar.Y(z4, z5, iVar, tVar, i4 & 8190);
        float f6 = c(a5) ? f4 : f5;
        if (z4) {
            tVar.P(-1927721478);
            u4 = androidx.compose.animation.core.d.c(f6, androidx.compose.animation.core.l.r(150, 0, null, 6, null), null, null, tVar, 48, 12);
            tVar.p0();
        } else {
            tVar.P(-1927721380);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.unit.h.d(f5), tVar, (i4 >> 15) & 14);
            tVar.p0();
        }
        androidx.compose.runtime.b5<androidx.compose.foundation.c0> u5 = androidx.compose.runtime.o4.u(new androidx.compose.foundation.c0(u4.getValue().u(), new androidx.compose.ui.graphics.g6(Y.getValue().M(), null), null), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u5;
    }

    private static final boolean c(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }
}
