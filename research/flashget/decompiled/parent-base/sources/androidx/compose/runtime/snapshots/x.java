package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.snapshots.d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/x;", "K", "V", "Landroidx/compose/runtime/snapshots/y;", "Landroidx/compose/runtime/snapshots/d0;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/d0;)V", "element", "", "f", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "h", "(Ljava/util/Collection;)Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/n0;", "i", "()Landroidx/compose/runtime/snapshots/n0;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:407\n84#3,2:363\n128#3,5:365\n133#3:371\n121#3:372\n134#3,5:374\n86#3,7:379\n139#3,2:386\n125#3:388\n141#3,6:394\n149#3,3:403\n93#3:406\n82#4:370\n2283#5:373\n2176#5,2:389\n1714#5:391\n2178#5,2:392\n2180#5,3:400\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:407,3\n234#1:363,2\n234#1:365,5\n234#1:371\n234#1:372\n234#1:374,5\n234#1:379,7\n234#1:386,2\n234#1:388\n234#1:394,6\n234#1:403,3\n234#1:406\n234#1:370\n234#1:373\n234#1:389,2\n234#1:391\n234#1:392,2\n234#1:400,3\n*E\n"})
/* loaded from: classes.dex */
final class x<K, V> extends y<K, V, K> {
    public x(@fg.l d0<K, V> d0Var) {
        super(d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return b().containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!b().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public Void f(K element) {
        throw b.a();
    }

    @fg.l
    public Void h(@fg.l Collection<? extends K> elements) {
        throw b.a();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public n0<K, V> iterator() {
        return new n0<>(b(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) b().j().i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return b().remove(element) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (b().remove(it.next()) != null || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        boolean z4;
        m I;
        Object obj2;
        Set a6 = kotlin.collections.w.a6(elements);
        d0<K, V> b5 = b();
        boolean z5 = false;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 firstStateRecord = b5.getFirstStateRecord();
                kotlin.jvm.internal.l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                d0.a aVar = (d0.a) v.G((d0.a) firstStateRecord);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            Iterator<Map.Entry<K, V>> it = b5.entrySet().iterator();
            while (true) {
                z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!a6.contains(next.getKey())) {
                    g4.remove(next.getKey());
                    z5 = true;
                }
            }
            k2 k2Var2 = k2.f75408a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a22 = g4.a2();
            if (kotlin.jvm.internal.l0.g(a22, i4)) {
                break;
            }
            r0 firstStateRecord2 = b5.getFirstStateRecord();
            kotlin.jvm.internal.l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            d0.a aVar2 = (d0.a) firstStateRecord2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                d0.a aVar3 = (d0.a) v.r0(aVar2, b5, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a22);
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, b5);
        } while (!z4);
        return z5;
    }
}
