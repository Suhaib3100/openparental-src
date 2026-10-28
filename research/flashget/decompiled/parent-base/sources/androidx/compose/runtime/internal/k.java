package androidx.compose.runtime.internal;

import kotlin.Metadata;

/* compiled from: FloatingPointEquality.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00020\u0002*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u00020\u0002*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "other", "", "b", "(FF)Z", "", "a", "(DD)Z", "d", "(F)Z", "isNan", "c", "(D)Z", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {
    public static final boolean a(double d5, double d6) {
        return d5 == d6;
    }

    public static final boolean b(float f4, float f5) {
        return f4 == f5;
    }

    public static final boolean c(double d5) {
        return (Double.doubleToRawLongBits(d5) & Long.MAX_VALUE) > 9218868437227405312L;
    }

    public static final boolean d(float f4) {
        return (Float.floatToRawIntBits(f4) & Integer.MAX_VALUE) > 2139095040;
    }
}
