package androidx.paging;

import androidx.paging.s0;
import kotlin.Metadata;

/* compiled from: PagedListConfig.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSizeHint", "maxSize", "Landroidx/paging/s0$e;", "a", "(IIZII)Landroidx/paging/s0$e;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class t0 {
    public static final /* synthetic */ s0.e a(int i4, int i5, boolean z4, int i6, int i7) {
        return new s0.e.a().e(i4).f(i5).b(z4).c(i6).d(i7).a();
    }

    public static /* synthetic */ s0.e b(int i4, int i5, boolean z4, int i6, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i5 = i4;
        }
        if ((i10 & 4) != 0) {
            z4 = true;
        }
        if ((i10 & 8) != 0) {
            i6 = i4 * 3;
        }
        if ((i10 & 16) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return a(i4, i5, z4, i6, i7);
    }
}
