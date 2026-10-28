package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ObserverModifierNode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/k1;", "T", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "a", "(Landroidx/compose/ui/q$d;Lld/a;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class l1 {
    public static final <T extends q.d & k1> void a(@fg.l T t4, @fg.l ld.a<k2> aVar) {
        m1 ownerScope = t4.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new m1(t4);
            t4.t7(ownerScope);
        }
        r1 snapshotObserver = k.q(t4).getSnapshotObserver();
        m1.INSTANCE.getClass();
        snapshotObserver.i(ownerScope, m1.f19436e, aVar);
    }
}
