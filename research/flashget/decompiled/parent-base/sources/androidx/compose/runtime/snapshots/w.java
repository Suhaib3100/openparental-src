package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.snapshots.d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/w;", "K", "V", "Landroidx/compose/runtime/snapshots/y;", "", "Landroidx/compose/runtime/snapshots/d0;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/d0;)V", "element", "", "f", "(Ljava/util/Map$Entry;)Ljava/lang/Void;", "", "elements", "h", "(Ljava/util/Collection;)Ljava/lang/Void;", "", "iterator", "()Ljava/util/Iterator;", "", "j", "(Ljava/util/Map$Entry;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "i", "containsAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:411\n84#3,2:367\n128#3,5:369\n133#3:375\n121#3:376\n134#3,5:378\n86#3,7:383\n139#3,2:390\n125#3:392\n141#3,6:398\n149#3,3:407\n93#3:410\n82#4:374\n2283#5:377\n2176#5,2:393\n1714#5:395\n2178#5,2:396\n2180#5,3:404\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:411,3\n210#1:367,2\n210#1:369,5\n210#1:375\n210#1:376\n210#1:378,5\n210#1:383,7\n210#1:390,2\n210#1:392\n210#1:398,6\n210#1:407,3\n210#1:410\n210#1:374\n210#1:377\n210#1:393,2\n210#1:395\n210#1:396,2\n210#1:404,3\n*E\n"})
/* loaded from: classes.dex */
final class w<K, V> extends y<K, V, Map.Entry<K, V>> {
    public w(@fg.l d0<K, V> d0Var) {
        super(d0Var);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (u1.I(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public Void f(@fg.l Map.Entry<K, V> element) {
        throw b.a();
    }

    @fg.l
    public Void h(@fg.l Collection<? extends Map.Entry<K, V>> elements) {
        throw b.a();
    }

    public boolean i(@fg.l Map.Entry<K, V> element) {
        return kotlin.jvm.internal.l0.g(b().get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<Map.Entry<K, V>> iterator() {
        return new l0(b(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) b().j().i().entrySet()).iterator());
    }

    public boolean j(@fg.l Map.Entry<K, V> element) {
        return b().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (u1.I(obj)) {
            return j((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (b().remove(((Map.Entry) it.next()).getKey()) != null || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        boolean z4;
        m I;
        Object obj2;
        Collection<? extends Object> collection = elements;
        int j4 = z0.j(kotlin.collections.w.b0(collection, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.q0 q0Var = new kotlin.q0(entry.getKey(), entry.getValue());
            linkedHashMap.put(q0Var.e(), q0Var.f());
        }
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
            Iterator<Map.Entry<K, V>> it2 = b5.entrySet().iterator();
            while (true) {
                z4 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (!linkedHashMap.containsKey(next.getKey()) || !kotlin.jvm.internal.l0.g(linkedHashMap.get(next.getKey()), next.getValue())) {
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
