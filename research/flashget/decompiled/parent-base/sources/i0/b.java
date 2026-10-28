package i0;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: CornerRadius.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "x", "y", "Li0/a;", "a", "(FF)J", "start", "stop", "fraction", "c", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
/* loaded from: classes.dex */
public final class b {
    @x4
    public static final long a(float f4, float f5) {
        return a.e((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
    }

    public static /* synthetic */ long b(float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = f4;
        }
        return a(f4, f5);
    }

    @x4
    public static final long c(long j4, long j5, float f4) {
        return a(androidx.compose.ui.util.d.a(a.m(j4), a.m(j5), f4), androidx.compose.ui.util.d.a(a.o(j4), a.o(j5), f4));
    }
}
