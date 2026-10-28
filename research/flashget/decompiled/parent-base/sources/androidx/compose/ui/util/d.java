package androidx.compose.ui.util;

import kotlin.Metadata;

/* compiled from: MathHelpers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "stop", "fraction", "a", "(FFF)F", "", "b", "(IIF)I", "", "c", "(JJF)J", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final float a(float f4, float f5, float f6) {
        return (f6 * f5) + ((1 - f6) * f4);
    }

    public static final int b(int i4, int i5, float f4) {
        return kotlin.math.b.K0((i5 - i4) * f4) + i4;
    }

    public static final long c(long j4, long j5, float f4) {
        return kotlin.math.b.M0((j5 - j4) * f4) + j4;
    }
}
