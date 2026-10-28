package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "bits", "", "c", "(J)I", "", "value", "b", "([II)I", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {
    public static final int b(@fg.l int[] iArr, int i4) {
        int length = iArr.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            int i7 = iArr[i6];
            if (i4 > i7) {
                i5 = i6 + 1;
            } else {
                if (i4 >= i7) {
                    return i6;
                }
                length = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j4) {
        int i4;
        if ((4294967295L & j4) == 0) {
            i4 = 32;
            j4 >>= 32;
        } else {
            i4 = 0;
        }
        if ((okhttp3.internal.ws.g.f84969s & j4) == 0) {
            i4 += 16;
            j4 >>= 16;
        }
        if ((255 & j4) == 0) {
            i4 += 8;
            j4 >>= 8;
        }
        if ((15 & j4) == 0) {
            i4 += 4;
            j4 >>= 4;
        }
        if ((1 & j4) != 0) {
            return i4;
        }
        if ((2 & j4) != 0) {
            return i4 + 1;
        }
        if ((4 & j4) != 0) {
            return i4 + 2;
        }
        if ((j4 & 8) != 0) {
            return i4 + 3;
        }
        return -1;
    }
}
