package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@z0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/u;", "Landroidx/compose/ui/layout/t1;", "Landroidx/compose/foundation/lazy/layout/q;", "factory", "<init>", "(Landroidx/compose/foundation/lazy/layout/q;)V", "Landroidx/compose/ui/layout/t1$a;", "slotIds", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/t1$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Landroidx/compose/foundation/lazy/layout/q;", "", "", "Ljava/util/Map;", "countPerType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u implements t1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q factory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, Integer> countPerType = new LinkedHashMap();

    public u(@fg.l q qVar) {
        this.factory = qVar;
    }

    @Override // androidx.compose.ui.layout.t1
    public void a(@fg.l t1.a slotIds) {
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object c5 = this.factory.c(it.next());
            Integer num = this.countPerType.get(c5);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.countPerType.put(c5, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.t1
    public boolean b(@fg.m Object slotId, @fg.m Object reusableSlotId) {
        return kotlin.jvm.internal.l0.g(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }
}
