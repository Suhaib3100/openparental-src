package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Shapes.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/shape/e;", "g", "(Landroidx/compose/foundation/shape/e;)Landroidx/compose/foundation/shape/e;", "a", "f", "b", "Landroidx/compose/material3/w8;", "Lc0/a1;", "value", "Landroidx/compose/ui/graphics/e6;", "c", "(Landroidx/compose/material3/w8;Lc0/a1;)Landroidx/compose/ui/graphics/e6;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "d", "()Landroidx/compose/runtime/a3;", "LocalShapes", "e", "(Lc0/a1;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,197:1\n164#2:198\n164#2:199\n164#2:200\n164#2:201\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n*L\n145#1:198\n152#1:199\n157#1:200\n162#1:201\n*E\n"})
/* loaded from: classes.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<w8> f15619a = androidx.compose.runtime.f0.f(a.f15620b);

    /* compiled from: Shapes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/w8;", "a", "()Landroidx/compose/material3/w8;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<w8> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15620b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w8 invoke() {
            return new w8(null, null, null, null, null, 31, null);
        }
    }

    /* compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15621a;

        static {
            int[] iArr = new int[c0.a1.values().length];
            try {
                iArr[c0.a1.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.a1.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.a1.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.a1.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.a1.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.a1.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c0.a1.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c0.a1.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c0.a1.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c0.a1.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c0.a1.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f15621a = iArr;
        }
    }

    @fg.l
    public static final androidx.compose.foundation.shape.e a(@fg.l androidx.compose.foundation.shape.e eVar) {
        float f4 = (float) com.google.firebase.remoteconfig.p.f60679p;
        return androidx.compose.foundation.shape.e.d(eVar, androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.g(f4)), androidx.compose.foundation.shape.g.c(f4), null, null, 12, null);
    }

    @fg.l
    public static final androidx.compose.foundation.shape.e b(@fg.l androidx.compose.foundation.shape.e eVar) {
        float f4 = (float) com.google.firebase.remoteconfig.p.f60679p;
        return androidx.compose.foundation.shape.e.d(eVar, androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.g(f4)), null, null, androidx.compose.foundation.shape.g.c(f4), 6, null);
    }

    @fg.l
    public static final androidx.compose.ui.graphics.e6 c(@fg.l w8 w8Var, @fg.l c0.a1 a1Var) {
        switch (b.f15621a[a1Var.ordinal()]) {
            case 1:
                return w8Var.getExtraLarge();
            case 2:
                return g(w8Var.getExtraLarge());
            case 3:
                return w8Var.getExtraSmall();
            case 4:
                return g(w8Var.getExtraSmall());
            case 5:
                return androidx.compose.foundation.shape.p.k();
            case 6:
                return w8Var.getLarge();
            case 7:
                return b(w8Var.getLarge());
            case 8:
                return g(w8Var.getLarge());
            case 9:
                return w8Var.getMedium();
            case 10:
                return androidx.compose.ui.graphics.r5.a();
            case 11:
                return w8Var.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<w8> d() {
        return f15619a;
    }

    @androidx.compose.runtime.d3
    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getValue")
    public static final androidx.compose.ui.graphics.e6 e(@fg.l c0.a1 a1Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1629172543, i4, -1, "androidx.compose.material3.<get-value> (Shapes.kt:192)");
        }
        androidx.compose.ui.graphics.e6 c5 = c(p6.f13227a.b(tVar, 6), a1Var);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return c5;
    }

    @fg.l
    public static final androidx.compose.foundation.shape.e f(@fg.l androidx.compose.foundation.shape.e eVar) {
        float f4 = (float) com.google.firebase.remoteconfig.p.f60679p;
        return androidx.compose.foundation.shape.e.d(eVar, null, androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.g(f4)), androidx.compose.foundation.shape.g.c(f4), null, 9, null);
    }

    @fg.l
    public static final androidx.compose.foundation.shape.e g(@fg.l androidx.compose.foundation.shape.e eVar) {
        float f4 = (float) com.google.firebase.remoteconfig.p.f60679p;
        return androidx.compose.foundation.shape.e.d(eVar, null, null, androidx.compose.foundation.shape.g.c(f4), androidx.compose.foundation.shape.g.c(androidx.compose.ui.unit.h.g(f4)), 3, null);
    }
}
