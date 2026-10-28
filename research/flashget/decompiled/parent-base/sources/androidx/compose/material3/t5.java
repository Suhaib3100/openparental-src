package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: IconButton.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJN\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJN\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J:\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJN\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J:\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\rJN\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0012J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0018\u0010*\u001a\u00020\u0004*\u00020'8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material3/t5;", "", "<init>", "()V", "Landroidx/compose/material3/s5;", "h", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/s5;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "i", "(JJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/s5;", "checkedContainerColor", "checkedContentColor", "Landroidx/compose/material3/w5;", "j", "(JJJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/w5;", "a", "b", "c", "d", "l", "n", "", "enabled", "checked", "Landroidx/compose/foundation/c0;", "m", "(ZZLandroidx/compose/runtime/t;I)Landroidx/compose/foundation/c0;", "k", "(ZLandroidx/compose/runtime/t;I)Landroidx/compose/foundation/c0;", "Landroidx/compose/ui/graphics/e6;", "f", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "filledShape", "g", "outlinedShape", "Landroidx/compose/material3/a3;", "e", "(Landroidx/compose/material3/a3;Landroidx/compose/runtime/t;I)Landroidx/compose/material3/s5;", "defaultIconButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1001:1\n74#2:1002\n74#2:1003\n74#2:1004\n74#2:1005\n74#2:1006\n74#2:1007\n74#2:1008\n74#2:1009\n1116#3,6:1010\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n554#1:1002\n577#1:1003\n592#1:1004\n619#1:1005\n761#1:1006\n787#1:1007\n827#1:1008\n829#1:1009\n832#1:1010,6\n*E\n"})
/* loaded from: classes.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final t5 f14573a = new t5();

    /* renamed from: b, reason: collision with root package name */
    public static final int f14574b = 0;

    private t5() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s5 a(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-669858473);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.x.f38299a.b(), tVar, 6) : j4;
        long c5 = (i5 & 2) != 0 ? b3.c(k4, tVar, i4 & 14) : j5;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.x.f38299a.f(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long w5 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.x.f38299a.e(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-669858473, i4, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:651)");
        }
        s5 s5Var = new s5(k4, c5, w4, w5, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s5Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w5 b(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1887173701);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.x.f38299a.t(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.x.f38299a.p(), tVar, 6) : j5;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.x.f38299a.f(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long w5 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.x.f38299a.e(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long k6 = (i5 & 16) != 0 ? b3.k(c0.x.f38299a.j(), tVar, 6) : j10;
        long c5 = (i5 & 32) != 0 ? b3.c(k6, tVar, (i4 >> 12) & 14) : j11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1887173701, i4, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:682)");
        }
        w5 w5Var = new w5(k4, k5, w4, w5, k6, c5, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w5Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s5 c(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-18532843);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.a0.f36970a.b(), tVar, 6) : j4;
        long c5 = (i5 & 2) != 0 ? b3.c(k4, tVar, i4 & 14) : j5;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a0.f36970a.f(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long w5 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a0.f36970a.e(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-18532843, i4, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:709)");
        }
        s5 s5Var = new s5(k4, c5, w4, w5, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s5Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w5 d(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-19426557);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.a0.f36970a.t(), tVar, 6) : j4;
        long c5 = (i5 & 2) != 0 ? b3.c(k4, tVar, i4 & 14) : j5;
        long w4 = (i5 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a0.f36970a.f(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long w5 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.a0.f36970a.e(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long k5 = (i5 & 16) != 0 ? b3.k(c0.a0.f36970a.j(), tVar, 6) : j10;
        long k6 = (i5 & 32) != 0 ? b3.k(c0.a0.f36970a.l(), tVar, 6) : j11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-19426557, i4, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:739)");
        }
        w5 w5Var = new w5(k4, c5, w4, w5, k5, k6, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w5Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getDefaultIconButtonColors")
    public final s5 e(@fg.l a3 a3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1437915677);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1437915677, i4, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        s5 defaultIconButtonColorsCached = a3Var.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached == null) {
            long M = ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M();
            d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
            companion.getClass();
            long j4 = androidx.compose.ui.graphics.d2.f17777n;
            companion.getClass();
            defaultIconButtonColorsCached = new s5(j4, M, androidx.compose.ui.graphics.d2.f17777n, androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            a3Var.Q0(defaultIconButtonColorsCached);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return defaultIconButtonColorsCached;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getFilledShape")
    public final androidx.compose.ui.graphics.e6 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1265841879);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1265841879, i4, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:540)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.x.f38299a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getOutlinedShape")
    public final androidx.compose.ui.graphics.e6 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1327125527);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1327125527, i4, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:545)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.o0.f37812a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s5 h(@fg.m androidx.compose.runtime.t tVar, int i4) {
        s5 c5;
        tVar.P(-1519621781);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1519621781, i4, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        s5 e4 = e(p6.f13227a.a(tVar, 6), tVar, (i4 << 3) & 112);
        long M = ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M();
        if (kotlin.a2.o(e4.getContentColor(), M)) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return e4;
        }
        c5 = e4.c((r18 & 1) != 0 ? e4.containerColor : 0L, (r18 & 2) != 0 ? e4.contentColor : M, (r18 & 4) != 0 ? e4.disabledContainerColor : 0L, (r18 & 8) != 0 ? e4.disabledContentColor : androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s5 i(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        tVar.P(999008085);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j10 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j10 = j4;
        }
        long M = (i5 & 2) != 0 ? ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M() : j5;
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j6;
        }
        long w4 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(999008085, i4, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:580)");
        }
        s5 c5 = e(p6.f13227a.a(tVar, 6), tVar, (i4 >> 9) & 112).c(j10, M, j11, w4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w5 j(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        long j14;
        tVar.P(-2020719549);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j12 = j4;
        }
        long M = (i5 & 2) != 0 ? ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M() : j5;
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j13 = j6;
        }
        long w4 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j14 = j10;
        }
        long k4 = (i5 & 32) != 0 ? b3.k(c0.c0.f37067a.e(), tVar, 6) : j11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2020719549, i4, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:625)");
        }
        w5 w5Var = new w5(j12, M, j13, w4, j14, k4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w5Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.c0 k(boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        long w4;
        tVar.P(-511461558);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-511461558, i4, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:824)");
        }
        if (z4) {
            tVar.P(1252616568);
            w4 = ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M();
            tVar.p0();
        } else {
            tVar.P(1252616623);
            w4 = androidx.compose.ui.graphics.d2.w(((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            tVar.p0();
        }
        tVar.P(1252616777);
        boolean g4 = tVar.g(w4);
        Object Q = tVar.Q();
        if (g4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = androidx.compose.foundation.d0.a(c0.o0.f37812a.p(), w4);
            tVar.E(Q);
        }
        androidx.compose.foundation.c0 c0Var = (androidx.compose.foundation.c0) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c0Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final s5 l(long j4, long j5, long j6, long j7, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j10;
        long j11;
        tVar.P(-1030517545);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j10 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j10 = j4;
        }
        long M = (i5 & 2) != 0 ? ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M() : j5;
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j11 = j6;
        }
        long w4 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1030517545, i4, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:765)");
        }
        s5 s5Var = new s5(j10, M, j11, w4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return s5Var;
    }

    @fg.m
    @androidx.compose.runtime.i
    public final androidx.compose.foundation.c0 m(boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1244729690);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1244729690, i4, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:811)");
        }
        if (z5) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return null;
        }
        androidx.compose.foundation.c0 k4 = k(z4, tVar, (i4 & 14) | ((i4 >> 3) & 112));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final w5 n(long j4, long j5, long j6, long j7, long j10, long j11, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j12;
        long j13;
        tVar.P(2130592709);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j12 = j4;
        }
        long M = (i5 & 2) != 0 ? ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M() : j5;
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j13 = j6;
        }
        long w4 = (i5 & 8) != 0 ? androidx.compose.ui.graphics.d2.w(M, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long k4 = (i5 & 16) != 0 ? b3.k(c0.o0.f37812a.g(), tVar, 6) : j10;
        long c5 = (i5 & 32) != 0 ? b3.c(k4, tVar, (i4 >> 12) & 14) : j11;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2130592709, i4, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:794)");
        }
        w5 w5Var = new w5(j12, M, j13, w4, k4, c5, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w5Var;
    }
}
