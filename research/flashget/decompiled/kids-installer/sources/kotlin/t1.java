package kotlin;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t1 {
    public static /* synthetic */ long a(long j5, long j6) {
        if (j6 < 0) {
            return (j5 ^ Long.MIN_VALUE) < (j6 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j5 >= 0) {
            return j5 / j6;
        }
        long j7 = ((j5 >>> 1) / j6) << 1;
        return j7 + (((j5 - (j7 * j6)) ^ Long.MIN_VALUE) < (j6 ^ Long.MIN_VALUE) ? 0 : 1);
    }
}
