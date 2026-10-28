package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@kd.g
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"R\u0012\u0010\u0003\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0012\u0010\u0004\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0012\u0010\u0005\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010\u001cR\u0012\u0010\u0006\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u001c\u0088\u0001\u000f\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/i1;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "b", "(IIII)J", "Landroidx/compose/ui/unit/b;", "c", "Landroidx/compose/foundation/layout/a1;", "orientation", "d", "(JLandroidx/compose/foundation/layout/a1;)J", "value", "(J)J", "p", "q", "o", "(JLandroidx/compose/foundation/layout/a1;)I", "n", "e", "(JIIII)J", "", "r", "(J)Ljava/lang/String;", "m", "(J)I", "other", "", "g", "(JLjava/lang/Object;)Z", "a", "J", "l", "k", "j", "i", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,871:1\n321#1:872\n322#1:873\n324#1:874\n323#1:875\n324#1:876\n321#1,4:877\n323#1,2:881\n321#1,2:883\n322#1:885\n324#1:886\n324#1:887\n322#1:888\n321#1:889\n322#1:890\n323#1:891\n324#1:892\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n349#1:872\n350#1:873\n351#1:874\n351#1:875\n352#1:876\n358#1:877,4\n360#1:881,2\n360#1:883,2\n366#1:885\n368#1:886\n374#1:887\n376#1:888\n380#1:889\n381#1:890\n382#1:891\n383#1:892\n*E\n"})
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    private /* synthetic */ i1(long j4) {
        this.value = j4;
    }

    public static final /* synthetic */ i1 a(long j4) {
        return new i1(j4);
    }

    public static long b(int i4, int i5, int i6, int i7) {
        return androidx.compose.ui.unit.c.a(i4, i5, i6, i7);
    }

    private static long c(long j4) {
        return j4;
    }

    public static long d(long j4, @fg.l a1 a1Var) {
        a1 a1Var2 = a1.Horizontal;
        return androidx.compose.ui.unit.c.a(a1Var == a1Var2 ? androidx.compose.ui.unit.b.r(j4) : androidx.compose.ui.unit.b.q(j4), a1Var == a1Var2 ? androidx.compose.ui.unit.b.p(j4) : androidx.compose.ui.unit.b.o(j4), a1Var == a1Var2 ? androidx.compose.ui.unit.b.q(j4) : androidx.compose.ui.unit.b.r(j4), a1Var == a1Var2 ? androidx.compose.ui.unit.b.o(j4) : androidx.compose.ui.unit.b.p(j4));
    }

    public static final long e(long j4, int i4, int i5, int i6, int i7) {
        return androidx.compose.ui.unit.c.a(i4, i5, i6, i7);
    }

    public static long f(long j4, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = androidx.compose.ui.unit.b.r(j4);
        }
        if ((i10 & 2) != 0) {
            i5 = androidx.compose.ui.unit.b.p(j4);
        }
        if ((i10 & 4) != 0) {
            i6 = androidx.compose.ui.unit.b.q(j4);
        }
        if ((i10 & 8) != 0) {
            i7 = androidx.compose.ui.unit.b.o(j4);
        }
        return androidx.compose.ui.unit.c.a(i4, i5, i6, i7);
    }

    public static boolean g(long j4, Object obj) {
        return (obj instanceof i1) && androidx.compose.ui.unit.b.g(j4, ((i1) obj).value);
    }

    public static final boolean h(long j4, long j5) {
        return androidx.compose.ui.unit.b.g(j4, j5);
    }

    public static final int i(long j4) {
        return androidx.compose.ui.unit.b.o(j4);
    }

    public static final int j(long j4) {
        return androidx.compose.ui.unit.b.q(j4);
    }

    public static final int k(long j4) {
        return androidx.compose.ui.unit.b.p(j4);
    }

    public static final int l(long j4) {
        return androidx.compose.ui.unit.b.r(j4);
    }

    public static int m(long j4) {
        return androidx.compose.ui.unit.b.t(j4);
    }

    public static final int n(long j4, @fg.l a1 a1Var) {
        return a1Var == a1.Horizontal ? androidx.compose.ui.unit.b.o(j4) : androidx.compose.ui.unit.b.p(j4);
    }

    public static final int o(long j4, @fg.l a1 a1Var) {
        return a1Var == a1.Horizontal ? androidx.compose.ui.unit.b.p(j4) : androidx.compose.ui.unit.b.o(j4);
    }

    public static final long p(long j4) {
        return androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4) != Integer.MAX_VALUE ? androidx.compose.ui.unit.b.o(j4) : androidx.compose.ui.unit.b.q(j4), androidx.compose.ui.unit.b.o(j4));
    }

    public static final long q(long j4, @fg.l a1 a1Var) {
        return a1Var == a1.Horizontal ? androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.q(j4), androidx.compose.ui.unit.b.o(j4)) : androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.q(j4), androidx.compose.ui.unit.b.o(j4), androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.p(j4));
    }

    public static String r(long j4) {
        return "OrientationIndependentConstraints(value=" + ((Object) androidx.compose.ui.unit.b.w(j4)) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.b.t(this.value);
    }

    /* renamed from: s, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return r(this.value);
    }
}
