package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import md.g;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/snapshots/l0;", "K", "V", "Landroidx/compose/runtime/snapshots/m0;", "", "", "Landroidx/compose/runtime/snapshots/d0;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/d0;Ljava/util/Iterator;)V", "r", "()Ljava/util/Map$Entry;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l0<K, V> extends m0<K, V> implements Iterator<Map.Entry<K, V>>, md.d {

    /* compiled from: SnapshotStateMap.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/runtime/snapshots/l0$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "c", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#2,4:361\n1#3:365\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n322#1:361,4\n322#1:365\n*E\n"})
    public static final class a implements Map.Entry<K, V>, g.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private V value;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0<K, V> f17107d;

        a(l0<K, V> l0Var) {
            this.f17107d = l0Var;
            Map.Entry<K, V> e4 = l0Var.e();
            kotlin.jvm.internal.l0.m(e4);
            this.key = e4.getKey();
            Map.Entry<K, V> e5 = l0Var.e();
            kotlin.jvm.internal.l0.m(e5);
            this.value = e5.getValue();
        }

        public void b(V v4) {
            this.value = v4;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            int i4;
            l0<K, V> l0Var = this.f17107d;
            int i5 = l0Var.h().i();
            i4 = ((m0) l0Var).modification;
            if (i5 != i4) {
                throw new ConcurrentModificationException();
            }
            V v4 = this.value;
            l0Var.h().put(this.key, newValue);
            this.value = newValue;
            return v4;
        }
    }

    public l0(@fg.l d0<K, V> d0Var, @fg.l Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(d0Var, it);
    }

    @Override // java.util.Iterator
    @fg.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        d();
        if (e() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
