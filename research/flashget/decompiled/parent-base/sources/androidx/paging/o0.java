package androidx.paging;

import kotlin.Metadata;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/t;", "previous", "Landroidx/paging/g0;", "loadType", "", "a", "(Landroidx/paging/t;Landroidx/paging/t;Landroidx/paging/g0;)Z", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class o0 {
    public static final boolean a(@fg.l t tVar, @fg.l t previous, @fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(tVar, "<this>");
        kotlin.jvm.internal.l0.p(previous, "previous");
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        if (tVar.e() > previous.e()) {
            return true;
        }
        if (tVar.e() < previous.e()) {
            return false;
        }
        return v.a(tVar.f(), previous.f(), loadType);
    }
}
