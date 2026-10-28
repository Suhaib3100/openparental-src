package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "", "key", "", "lastKnownIndex", "a", "(Landroidx/compose/foundation/lazy/layout/s;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    @z0
    public static final int a(@fg.l s sVar, @fg.m Object obj, int i4) {
        if (obj != null && sVar.b() != 0) {
            if (i4 < sVar.b() && kotlin.jvm.internal.l0.g(obj, sVar.d(i4))) {
                return i4;
            }
            int c5 = sVar.c(obj);
            if (c5 != -1) {
                return c5;
            }
        }
        return i4;
    }
}
