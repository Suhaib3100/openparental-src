package androidx.compose.ui.layout;

import androidx.compose.ui.layout.t1;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/i;", "Landroidx/compose/ui/layout/t1;", "", "maxSlotsToRetainForReuse", "<init>", "(I)V", "Landroidx/compose/ui/layout/t1$a;", "slotIds", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/t1$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i implements t1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSlotsToRetainForReuse;

    public i(int i4) {
        this.maxSlotsToRetainForReuse = i4;
    }

    @Override // androidx.compose.ui.layout.t1
    public void a(@fg.l t1.a slotIds) {
        if (slotIds.size() > this.maxSlotsToRetainForReuse) {
            Iterator<Object> it = slotIds.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                it.next();
                i4++;
                if (i4 > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.t1
    public boolean b(@fg.m Object slotId, @fg.m Object reusableSlotId) {
        return true;
    }
}
