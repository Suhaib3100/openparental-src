package androidx.compose.ui.unit;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001a#\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a'\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a\u001f\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\b\u001a*\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016\u001a\"\u0010\u000f\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010 \u001a%\u0010!\u001a\u00020\u001f*\u00020\u001f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a*\u0010#\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010\u0010\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010 \u001a%\u0010(\u001a\u00020'*\u00020'2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020'0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\"\u001a\u001f\u0010*\u001a\u00020'*\u00020\f2\u0006\u0010)\u001a\u00020'H\u0087\nø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020'*\u00020\u00052\u0006\u0010)\u001a\u00020'H\u0087\nø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a*\u0010.\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010$\"\u001f\u00104\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101\"\u001f\u00107\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00103\u001a\u0004\b5\u00101\"\u001f\u0010<\u001a\u00020\u0000*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109\"\u001f\u0010<\u001a\u00020\u0000*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>\"\u001f\u0010<\u001a\u00020\u0000*\u00020\u00058Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010B\"\u001f\u0010F\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bE\u00103\u001a\u0004\bD\u00101\"\u001f\u00104\u001a\u00020/*\u00020\u001f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010H\"\u001f\u00107\u001a\u00020/*\u00020\u001f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010J\u001a\u0004\bK\u0010H\"\u001f\u00104\u001a\u00020/*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010J\u001a\u0004\b\u001d\u0010H\"\u001f\u00107\u001a\u00020/*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010J\u001a\u0004\bM\u0010H\"\u001e\u0010R\u001a\u00020\u001f*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010J\u001a\u0004\bO\u0010P\"\u001f\u0010%\u001a\u00020\u0000*\u00020S8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010U\"\u001f\u0010&\u001a\u00020\u0000*\u00020S8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010W\u001a\u0004\bX\u0010U\"\u001f\u0010)\u001a\u00020'*\u00020S8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010W\u001a\u0004\bZ\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Landroidx/compose/ui/unit/h;", "Lkotlin/Function0;", "block", "M", "(FLld/a;)F", "", "other", "Q", "(FF)F", "", "P", "(DF)F", "", "R", "(IF)F", "a", "b", "L", "K", "minimumValue", "maximumValue", "e", "(FFF)F", "c", "d", "start", "stop", "fraction", "I", "x", "y", "Landroidx/compose/ui/unit/j;", "(FF)J", "N", "(JLld/a;)J", "J", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/l;", "O", "size", "T", "(IJ)J", "S", "(FJ)J", "H", "", "v", "(F)Z", "w", "(F)V", "isSpecified", "B", "C", "isUnspecified", "j", "(I)F", "m", "(I)V", "dp", "h", "(D)F", "k", "(D)V", "i", "(F)F", "l", "t", "u", "isFinite", "z", "(J)Z", "A", "(J)V", "F", "G", "D", "E", "f", "(J)J", "g", "center", "Landroidx/compose/ui/unit/k;", "r", "(Landroidx/compose/ui/unit/k;)F", "s", "(Landroidx/compose/ui/unit/k;)V", "n", "o", "p", "(Landroidx/compose/ui/unit/k;)J", "q", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* loaded from: classes.dex */
public final class i {
    @x4
    public static /* synthetic */ void A(long j4) {
    }

    public static final boolean B(float f4) {
        return Float.isNaN(f4);
    }

    @x4
    public static /* synthetic */ void C(float f4) {
    }

    public static final boolean D(long j4) {
        l.INSTANCE.getClass();
        return j4 == l.f21515d;
    }

    @x4
    public static /* synthetic */ void E(long j4) {
    }

    public static final boolean F(long j4) {
        j.INSTANCE.getClass();
        return j4 == j.f21505d;
    }

    @x4
    public static /* synthetic */ void G(long j4) {
    }

    @x4
    public static final long H(long j4, long j5, float f4) {
        return b(I(l.p(j4), l.p(j5), f4), I(l.m(j4), l.m(j5), f4));
    }

    @x4
    public static final float I(float f4, float f5, float f6) {
        return h.g(androidx.compose.ui.util.d.a(f4, f5, f6));
    }

    @x4
    public static final long J(long j4, long j5, float f4) {
        return a(I(j.j(j4), j.j(j5), f4), I(j.l(j4), j.l(j5), f4));
    }

    @x4
    public static final float K(float f4, float f5) {
        return h.g(Math.max(f4, f5));
    }

    @x4
    public static final float L(float f4, float f5) {
        return h.g(Math.min(f4, f5));
    }

    public static final float M(float f4, @fg.l ld.a<h> aVar) {
        return !Float.isNaN(f4) ? f4 : aVar.invoke().u();
    }

    public static final long N(long j4, @fg.l ld.a<j> aVar) {
        j.INSTANCE.getClass();
        return j4 != j.f21505d ? j4 : aVar.invoke().getPackedValue();
    }

    public static final long O(long j4, @fg.l ld.a<l> aVar) {
        l.INSTANCE.getClass();
        return j4 != l.f21515d ? j4 : aVar.invoke().getPackedValue();
    }

    @x4
    public static final float P(double d5, float f4) {
        return h.g(((float) d5) * f4);
    }

    @x4
    public static final float Q(float f4, float f5) {
        return h.g(f4 * f5);
    }

    @x4
    public static final float R(int i4, float f4) {
        return h.g(i4 * f4);
    }

    @x4
    public static final long S(float f4, long j4) {
        return l.u(j4, f4);
    }

    @x4
    public static final long T(int i4, long j4) {
        return l.v(j4, i4);
    }

    @x4
    public static final long a(float f4, float f5) {
        return j.d((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    @x4
    public static final long b(float f4, float f5) {
        return l.f((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    @x4
    public static final float c(float f4, float f5) {
        return h.g(kotlin.ranges.s.t(f4, f5));
    }

    @x4
    public static final float d(float f4, float f5) {
        return h.g(kotlin.ranges.s.A(f4, f5));
    }

    @x4
    public static final float e(float f4, float f5, float f6) {
        return h.g(kotlin.ranges.s.H(f4, f5, f6));
    }

    public static final long f(long j4) {
        return a(h.g(l.p(j4) / 2.0f), l.m(j4) / 2.0f);
    }

    @x4
    public static /* synthetic */ void g(long j4) {
    }

    public static final float h(double d5) {
        return h.g((float) d5);
    }

    public static final float i(float f4) {
        return h.g(f4);
    }

    public static final float j(int i4) {
        return h.g(i4);
    }

    @x4
    public static /* synthetic */ void k(double d5) {
    }

    @x4
    public static /* synthetic */ void l(float f4) {
    }

    @x4
    public static /* synthetic */ void m(int i4) {
    }

    public static final float n(@fg.l k kVar) {
        return h.g(kVar.g() - kVar.m());
    }

    @x4
    public static /* synthetic */ void o(k kVar) {
    }

    public static final long p(@fg.l k kVar) {
        return b(h.g(kVar.k() - kVar.i()), kVar.g() - kVar.m());
    }

    @x4
    public static /* synthetic */ void q(k kVar) {
    }

    public static final float r(@fg.l k kVar) {
        return h.g(kVar.k() - kVar.i());
    }

    @x4
    public static /* synthetic */ void s(k kVar) {
    }

    public static final boolean t(float f4) {
        return !(f4 == Float.POSITIVE_INFINITY);
    }

    @x4
    public static /* synthetic */ void u(float f4) {
    }

    public static final boolean v(float f4) {
        return !Float.isNaN(f4);
    }

    @x4
    public static /* synthetic */ void w(float f4) {
    }

    public static final boolean x(long j4) {
        l.INSTANCE.getClass();
        return j4 != l.f21515d;
    }

    @x4
    public static /* synthetic */ void y(long j4) {
    }

    public static final boolean z(long j4) {
        j.INSTANCE.getClass();
        return j4 != j.f21505d;
    }
}
