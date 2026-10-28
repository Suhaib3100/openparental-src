package androidx.paging;

import androidx.paging.w1;
import kotlin.Metadata;

/* compiled from: HintHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/w1;", "previous", "Landroidx/paging/g0;", "loadType", "", "a", "(Landroidx/paging/w1;Landroidx/paging/w1;Landroidx/paging/g0;)Z", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v {
    public static final boolean a(@fg.l w1 w1Var, @fg.m w1 w1Var2, @fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(w1Var, "<this>");
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        if (w1Var2 == null) {
            return true;
        }
        if ((w1Var2 instanceof w1.b) && (w1Var instanceof w1.a)) {
            return true;
        }
        return (((w1Var instanceof w1.b) && (w1Var2 instanceof w1.a)) || (w1Var.getOriginalPageOffsetFirst() == w1Var2.getOriginalPageOffsetFirst() && w1Var.getOriginalPageOffsetLast() == w1Var2.getOriginalPageOffsetLast() && w1Var2.e(loadType) <= w1Var.e(loadType))) ? false : true;
    }
}
