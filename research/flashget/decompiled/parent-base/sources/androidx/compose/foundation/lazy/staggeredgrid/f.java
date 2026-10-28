package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* compiled from: LazyStaggeredGridCells.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "gridSize", "slotCount", "spacing", "", "b", "(III)[I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] b(int i4, int i5, int i6) {
        int i7 = i4 - ((i5 - 1) * i6);
        int i10 = i7 / i5;
        int i11 = i7 % i5;
        int[] iArr = new int[i5];
        int i12 = 0;
        while (i12 < i5) {
            iArr[i12] = (i12 < i11 ? 1 : 0) + i10;
            i12++;
        }
        return iArr;
    }
}
