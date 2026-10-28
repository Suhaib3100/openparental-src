package i0;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u001e\u0010\u0017\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011\"\u001e\u0010\u001a\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "x", "y", "Li0/f;", "a", "(FF)J", "start", "stop", "fraction", "h", "(JJF)J", "Lkotlin/Function0;", "block", "i", "(JLld/a;)J", "", "b", "(J)Z", "c", "(J)V", "isFinite", "d", "e", "isSpecified", "f", "g", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    @x4
    public static final long a(float f4, float f5) {
        return f.g((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    public static final boolean b(long j4) {
        float p4 = f.p(j4);
        if (!Float.isInfinite(p4) && !Float.isNaN(p4)) {
            float r4 = f.r(j4);
            if (!Float.isInfinite(r4) && !Float.isNaN(r4)) {
                return true;
            }
        }
        return false;
    }

    @x4
    public static /* synthetic */ void c(long j4) {
    }

    public static final boolean d(long j4) {
        f.INSTANCE.getClass();
        return j4 != f.f74149e;
    }

    @x4
    public static /* synthetic */ void e(long j4) {
    }

    public static final boolean f(long j4) {
        f.INSTANCE.getClass();
        return j4 == f.f74149e;
    }

    @x4
    public static /* synthetic */ void g(long j4) {
    }

    @x4
    public static final long h(long j4, long j5, float f4) {
        return a(androidx.compose.ui.util.d.a(f.p(j4), f.p(j5), f4), androidx.compose.ui.util.d.a(f.r(j4), f.r(j5), f4));
    }

    public static final long i(long j4, @fg.l ld.a<f> aVar) {
        return d(j4) ? j4 : aVar.invoke().getPackedValue();
    }
}
