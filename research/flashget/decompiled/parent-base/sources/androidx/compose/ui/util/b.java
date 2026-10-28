package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.jvm.internal.a0;

/* compiled from: InlineClassHelper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "val1", "val2", "", "a", "(FF)J", "value", "c", "(J)F", "d", "", "b", "(II)J", "e", "(J)I", "f", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final long a(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final long b(int i4, int i5) {
        return (i5 & 4294967295L) | (i4 << 32);
    }

    public static final float c(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float d(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final int e(long j4) {
        return (int) (j4 >> 32);
    }

    public static final int f(long j4) {
        return (int) (j4 & 4294967295L);
    }
}
