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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/z;", "K", "V", "Landroidx/compose/runtime/snapshots/y;", "Landroidx/compose/runtime/snapshots/d0;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/d0;)V", "element", "", "f", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "h", "(Ljava/util/Collection;)Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/o0;", "i", "()Landroidx/compose/runtime/snapshots/o0;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n128#2,5:363\n133#2:369\n121#2:370\n134#2,5:372\n86#2,7:377\n139#2,2:384\n125#2:386\n141#2,6:392\n149#2,3:401\n93#2:404\n84#2,2:405\n128#2,5:407\n133#2:413\n121#2:414\n134#2,5:416\n86#2,7:421\n139#2,2:428\n125#2:430\n141#2,6:436\n149#2,3:445\n93#2:448\n82#3:368\n82#3:412\n2283#4:371\n2176#4,2:387\n1714#4:389\n2178#4,2:390\n2180#4,3:398\n2283#4:415\n2176#4,2:431\n1714#4:433\n2178#4,2:434\n2180#4,3:442\n1726#5,3:449\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,5\n250#1:369\n250#1:370\n250#1:372,5\n250#1:377,7\n250#1:384,2\n250#1:386\n250#1:392,6\n250#1:401,3\n250#1:404\n254#1:405,2\n254#1:407,5\n254#1:413\n254#1:414\n254#1:416,5\n254#1:421,7\n254#1:428,2\n254#1:430\n254#1:436,6\n254#1:445,3\n254#1:448\n250#1:368\n254#1:412\n250#1:371\n250#1:387,2\n250#1:389\n250#1:390,2\n250#1:398,3\n254#1:415\n254#1:431,2\n254#1:433\n254#1:434,2\n254#1:442,3\n258#1:449,3\n*E\n"})
/* loaded from: classes.dex */
final class z<K, V> extends y<K, V, V> {
    public z(@fg.l d0<K, V> d0Var) {
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
        return b().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!b().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public Void f(V element) {
        throw b.a();
    }

    @fg.l
    public Void h(@fg.l Collection<? extends V> elements) {
        throw b.a();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o0<K, V> iterator() {
        return new o0<>(b(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) b().j().i().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return b().r(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
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
                if (a6.contains(next.getValue())) {
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
                if (!a6.contains(next.getValue())) {
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
