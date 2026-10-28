package i0;

import kotlin.Metadata;

/* compiled from: GeometryUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "digits", "", "a", "(FI)Ljava/lang/String;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @fg.l
    public static final String a(float f4, int i4) {
        int max = Math.max(i4, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f5 = f4 * pow;
        int i5 = (int) f5;
        if (f5 - i5 >= 0.5f) {
            i5++;
        }
        float f6 = i5 / pow;
        return max > 0 ? String.valueOf(f6) : String.valueOf((int) f6);
    }
}
