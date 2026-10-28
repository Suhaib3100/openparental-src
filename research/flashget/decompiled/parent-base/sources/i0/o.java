package i0;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0016\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u001f\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001f\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\"\u001e\u0010(\u001a\u00020$*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "width", "height", "Li0/n;", "a", "(FF)J", "Lkotlin/Function0;", "block", "i", "(JLld/a;)J", "start", "stop", "fraction", "h", "(JJF)J", "", "size", "l", "(IJ)J", "", "j", "(DJ)J", "Li0/i;", "m", "(J)Li0/i;", "k", "(FJ)J", "", "d", "(J)Z", "e", "(J)V", "isSpecified", "f", "g", "isUnspecified", "Li0/f;", "b", "(J)J", "c", "center", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,226:1\n152#1:230\n25#2,3:227\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:230\n33#1:227,3\n*E\n"})
/* loaded from: classes.dex */
public final class o {
    @x4
    public static final long a(float f4, float f5) {
        return n.f((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    public static final long b(long j4) {
        return g.a(n.t(j4) / 2.0f, n.m(j4) / 2.0f);
    }

    @x4
    public static /* synthetic */ void c(long j4) {
    }

    public static final boolean d(long j4) {
        n.INSTANCE.getClass();
        return j4 != n.f74172d;
    }

    @x4
    public static /* synthetic */ void e(long j4) {
    }

    public static final boolean f(long j4) {
        n.INSTANCE.getClass();
        return j4 == n.f74172d;
    }

    @x4
    public static /* synthetic */ void g(long j4) {
    }

    @x4
    public static final long h(long j4, long j5, float f4) {
        return a(androidx.compose.ui.util.d.a(n.t(j4), n.t(j5), f4), androidx.compose.ui.util.d.a(n.m(j4), n.m(j5), f4));
    }

    public static final long i(long j4, @fg.l ld.a<n> aVar) {
        n.INSTANCE.getClass();
        return j4 != n.f74172d ? j4 : aVar.invoke().getPackedValue();
    }

    @x4
    public static final long j(double d5, long j4) {
        return n.w(j4, (float) d5);
    }

    @x4
    public static final long k(float f4, long j4) {
        return n.w(j4, f4);
    }

    @x4
    public static final long l(int i4, long j4) {
        return n.w(j4, i4);
    }

    @x4
    @fg.l
    public static final i m(long j4) {
        f.INSTANCE.getClass();
        return j.c(f.f74147c, j4);
    }
}
