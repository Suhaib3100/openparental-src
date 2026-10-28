package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "start", "end", "Lkotlin/k2;", "a", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f {
    public static final <T extends Comparable<? super T>> void a(@l T t4, @l T t5) {
        l0.p(t4, ProtectedSandApp.s("㜟\u0001"));
        l0.p(t5, ProtectedSandApp.s("㜠\u0001"));
        if (t5.compareTo(t4) >= 0) {
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("㜡\u0001") + t4 + ProtectedSandApp.s("㜢\u0001") + t5).toString());
    }
}
