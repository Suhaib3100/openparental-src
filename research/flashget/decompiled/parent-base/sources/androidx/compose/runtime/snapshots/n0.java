package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/n0;", "K", "V", "Landroidx/compose/runtime/snapshots/m0;", "", "Landroidx/compose/runtime/snapshots/d0;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/d0;Ljava/util/Iterator;)V", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n0<K, V> extends m0<K, V> implements Iterator<K>, md.d {
    public n0(@fg.l d0<K, V> d0Var, @fg.l Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(d0Var, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> j4 = j();
        if (j4 == null) {
            throw new IllegalStateException();
        }
        d();
        return j4.getKey();
    }
}
