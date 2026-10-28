package androidx.compose.runtime.tooling;

import androidx.compose.runtime.d1;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.y;
import fg.l;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CompositionObserver.kt */
@d1
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00060\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/c;", "", "Landroidx/compose/runtime/y;", "composition", "", "Landroidx/compose/runtime/e3;", "", "invalidationMap", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/y;Ljava/util/Map;)V", "b", "(Landroidx/compose/runtime/y;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {
    void a(@l y composition, @l Map<e3, ? extends Set<? extends Object>> invalidationMap);

    void b(@l y composition);
}
