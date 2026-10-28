package androidx.compose.ui.unit;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u001c\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u0004*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a*\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010#\"\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010#\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010#\"\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010#\"\u001f\u0010,\u001a\u00020(*\u00020\u00048Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0019\u001a\u0004\b)\u0010*\"\u001e\u0010/\u001a\u00020(*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0019\u001a\u0004\b-\u0010*\"\u001e\u00104\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101\"\u001e\u00107\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00103\u001a\u0004\b5\u00101\"\u001e\u00104\u001a\u00020\u0004*\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109\"\u001e\u00107\u001a\u00020\u0004*\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010;\u001a\u0004\b<\u00109\"\u001e\u00104\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?\"\u001e\u00107\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"", "value", "Landroidx/compose/ui/unit/b0;", "type", "Landroidx/compose/ui/unit/z;", "a", "(FJ)J", "Lkotlin/Function0;", "block", "w", "(JLld/a;)J", "other", "y", "", "x", "(DJ)J", "", "z", "(IJ)J", "", "unitType", "v", "(JF)J", "Lkotlin/k2;", "b", "(J)V", "c", "(JJ)V", "d", "(JJJ)V", "start", "stop", "fraction", "u", "(JJF)J", "J", "UNIT_MASK", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "q", "(J)Z", "r", "isSpecified", "s", "t", "isUnspecified", "l", "(F)J", "o", "(F)V", "sp", "f", "i", "em", "k", "(D)J", "n", "(D)V", "e", "h", "m", "(I)J", "p", "(I)V", "g", "j", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f21462a = 1095216660480L;

    /* renamed from: b, reason: collision with root package name */
    private static final long f21463b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final long f21464c = 4294967296L;

    /* renamed from: d, reason: collision with root package name */
    private static final long f21465d = 8589934592L;

    public static final long a(float f4, long j4) {
        return v(j4, f4);
    }

    @w0
    public static final void b(long j4) {
        if (s(j4)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @w0
    public static final void c(long j4, long j5) {
        if (s(j4) || s(j5)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (b0.g(z.m(j4), z.m(j5))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) b0.i(z.m(j4))) + " and " + ((Object) b0.i(z.m(j5)))).toString());
    }

    @w0
    public static final void d(long j4, long j5, long j6) {
        if (s(j4) || s(j5) || s(j6)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (b0.g(z.m(j4), z.m(j5)) && b0.g(z.m(j5), z.m(j6))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) b0.i(z.m(j4))) + " and " + ((Object) b0.i(z.m(j5)))).toString());
    }

    public static final long e(double d5) {
        return v(f21465d, (float) d5);
    }

    public static final long f(float f4) {
        return v(f21465d, f4);
    }

    public static final long g(int i4) {
        return v(f21465d, i4);
    }

    @x4
    public static /* synthetic */ void h(double d5) {
    }

    @x4
    public static /* synthetic */ void i(float f4) {
    }

    @x4
    public static /* synthetic */ void j(int i4) {
    }

    public static final long k(double d5) {
        return v(f21464c, (float) d5);
    }

    public static final long l(float f4) {
        return v(f21464c, f4);
    }

    public static final long m(int i4) {
        return v(f21464c, i4);
    }

    @x4
    public static /* synthetic */ void n(double d5) {
    }

    @x4
    public static /* synthetic */ void o(float f4) {
    }

    @x4
    public static /* synthetic */ void p(int i4) {
    }

    public static final boolean q(long j4) {
        return !s(j4);
    }

    @x4
    public static /* synthetic */ void r(long j4) {
    }

    public static final boolean s(long j4) {
        return z.l(j4) == 0;
    }

    @x4
    public static /* synthetic */ void t(long j4) {
    }

    @x4
    public static final long u(long j4, long j5, float f4) {
        c(j4, j5);
        return v(z.l(j4), androidx.compose.ui.util.d.a(z.n(j4), z.n(j5), f4));
    }

    @w0
    public static final long v(long j4, float f4) {
        return z.e(j4 | (Float.floatToIntBits(f4) & 4294967295L));
    }

    public static final long w(long j4, @fg.l ld.a<z> aVar) {
        return !s(j4) ? j4 : aVar.invoke().getPackedValue();
    }

    @x4
    public static final long x(double d5, long j4) {
        b(j4);
        return v(z.l(j4), z.n(j4) * ((float) d5));
    }

    @x4
    public static final long y(float f4, long j4) {
        b(j4);
        return v(z.l(j4), z.n(j4) * f4);
    }

    @x4
    public static final long z(int i4, long j4) {
        b(j4);
        return v(z.l(j4), z.n(j4) * i4);
    }
}
