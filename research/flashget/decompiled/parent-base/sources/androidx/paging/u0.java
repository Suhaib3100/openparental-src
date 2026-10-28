package androidx.paging;

import androidx.paging.s0;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: PagedList.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001as\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "Key", "Value", "Landroidx/paging/m;", "dataSource", "Landroidx/paging/s0$e;", "config", "Ljava/util/concurrent/Executor;", "notifyExecutor", "fetchExecutor", "Landroidx/paging/s0$a;", "boundaryCallback", "initialKey", "Landroidx/paging/s0;", "a", "(Landroidx/paging/m;Landroidx/paging/s0$e;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/paging/s0$a;Ljava/lang/Object;)Landroidx/paging/s0;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class u0 {
    @kotlin.k(message = "DataSource is deprecated and has been replaced by PagingSource")
    public static final /* synthetic */ s0 a(m dataSource, s0.e config, Executor notifyExecutor, Executor fetchExecutor, s0.a aVar, Object obj) {
        kotlin.jvm.internal.l0.p(dataSource, "dataSource");
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(notifyExecutor, "notifyExecutor");
        kotlin.jvm.internal.l0.p(fetchExecutor, "fetchExecutor");
        return new s0.b(dataSource, config).i(notifyExecutor).f(fetchExecutor).c(aVar).g(obj).a();
    }
}
