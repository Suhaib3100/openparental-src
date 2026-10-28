package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019\u001a8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "insets", "k", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/foundation/layout/n2;)Landroidx/compose/foundation/layout/n2;", "i", "e", "Landroidx/compose/foundation/layout/g3;", "sides", "j", "(Landroidx/compose/foundation/layout/n2;I)Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/foundation/layout/l1;", "g", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/ui/unit/d;", "density", "h", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/d;)Landroidx/compose/foundation/layout/l1;", "f", "(Landroidx/compose/foundation/layout/l1;)Landroidx/compose/foundation/layout/n2;", "", "left", "top", "right", "bottom", "a", "(IIII)Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/h;", "c", "(FFFF)Landroidx/compose/foundation/layout/n2;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,748:1\n74#2:749\n154#3:750\n154#3:751\n154#3:752\n154#3:753\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n245#1:749\n278#1:750\n279#1:751\n280#1:752\n281#1:753\n*E\n"})
/* loaded from: classes.dex */
public final class r2 {
    @fg.l
    public static final n2 a(int i4, int i5, int i6, int i7) {
        return new g0(i4, i5, i6, i7);
    }

    public static n2 b(int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        return new g0(i4, i5, i6, i7);
    }

    @fg.l
    public static final n2 c(float f4, float f5, float f6, float f7) {
        return new f0(f4, f5, f6, f7, null);
    }

    public static /* synthetic */ n2 d(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return c(f4, f5, f6, f7);
    }

    @fg.l
    public static final n2 e(@fg.l n2 n2Var, @fg.l n2 n2Var2) {
        return new a(n2Var, n2Var2);
    }

    @fg.l
    public static final n2 f(@fg.l l1 l1Var) {
        return new o1(l1Var);
    }

    @fg.l
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final l1 g(@fg.l n2 n2Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1485016250, i4, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        s0 s0Var = new s0(n2Var, (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i()));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return s0Var;
    }

    @fg.l
    public static final l1 h(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.d dVar) {
        return new s0(n2Var, dVar);
    }

    @fg.l
    public static final n2 i(@fg.l n2 n2Var, @fg.l n2 n2Var2) {
        return new c0(n2Var, n2Var2);
    }

    @fg.l
    public static final n2 j(@fg.l n2 n2Var, int i4) {
        return new d1(n2Var, i4, null);
    }

    @fg.l
    public static final n2 k(@fg.l n2 n2Var, @fg.l n2 n2Var2) {
        return new i2(n2Var, n2Var2);
    }
}
