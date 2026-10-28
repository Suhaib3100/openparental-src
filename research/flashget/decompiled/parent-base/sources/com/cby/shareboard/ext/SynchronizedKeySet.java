package com.cby.shareboard.ext;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import md.h;

/* compiled from: SynchronizedKeySet.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/cby/shareboard/ext/SynchronizedKeySet;", "K", "Ljava/util/AbstractSet;", "", "<init>", "()V", "element", "", "add", "(Ljava/lang/Object;)Z", "remove", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "retainAll", "removeAll", "Lkotlin/k2;", "clear", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/HashSet;", "internalSet", "Ljava/util/HashSet;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "getSize", "()I", "size", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSynchronizedKeySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedKeySet.kt\ncom/cby/shareboard/ext/SynchronizedKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n766#2:148\n857#2,2:149\n1726#2,3:151\n1855#2,2:154\n819#2:156\n847#2,2:157\n2624#2,3:159\n1855#2,2:162\n1855#2,2:164\n1#3:166\n*S KotlinDebug\n*F\n+ 1 SynchronizedKeySet.kt\ncom/cby/shareboard/ext/SynchronizedKeySet\n*L\n69#1:148\n69#1:149,2\n70#1:151,3\n73#1:154,2\n87#1:156\n87#1:157,2\n88#1:159,3\n103#1:162,2\n107#1:164,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SynchronizedKeySet<K> extends AbstractSet<K> implements Set<K>, h {

    @l
    private final ConcurrentHashMap<K, Byte> map = new ConcurrentHashMap<>();

    @l
    private final HashSet<K> internalSet = new HashSet<>();

    @l
    private final ReentrantLock lock = new ReentrantLock();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K element) {
        boolean z4;
        Exception e4;
        this.lock.lock();
        try {
            try {
                z4 = this.internalSet.add(element);
                if (z4) {
                    try {
                        this.map.put(element, (byte) 0);
                    } catch (Exception e5) {
                        e4 = e5;
                        if (z4) {
                            this.internalSet.remove(element);
                        }
                        throw e4;
                    }
                }
                return z4;
            } finally {
                this.lock.unlock();
            }
        } catch (Exception e6) {
            z4 = false;
            e4 = e6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends K> elements) {
        l0.p(elements, ProtectedSandApp.s("\u0c57"));
        this.lock.lock();
        try {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (!this.internalSet.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                boolean z4 = true;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!add(it.next())) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (!z4) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.internalSet.remove(it2.next());
                    }
                }
                this.lock.unlock();
                return z4;
            } catch (Exception e4) {
                throw e4;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.internalSet.clear();
            this.map.clear();
            k2 k2Var = k2.f75408a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getSize() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.internalSet.size();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<K> iterator() {
        return new SynchronizedKeySet$iterator$1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        this.lock.lock();
        boolean z4 = false;
        try {
            try {
                z4 = this.internalSet.remove(element);
                if (z4) {
                    u1.k(this.map).remove(element);
                }
                return z4;
            } catch (Exception e4) {
                if (z4) {
                    this.internalSet.add(element);
                }
                throw e4;
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("\u0c57"));
        this.lock.lock();
        List list = null;
        try {
            try {
                list = w.Y5(w.i3(this.internalSet, w.a6(elements)));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                boolean z4 = !list.isEmpty();
                this.lock.unlock();
                return z4;
            } catch (Exception e4) {
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        this.internalSet.add(it2.next());
                    }
                }
                throw e4;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<? extends Object> elements) {
        boolean z4;
        l0.p(elements, ProtectedSandApp.s("\u0c57"));
        this.lock.lock();
        try {
            try {
                HashSet<K> hashSet = this.internalSet;
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    if (!elements.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (remove(it.next())) {
                            z4 = false;
                            break;
                        }
                    }
                }
                z4 = true;
                boolean z5 = !z4;
                this.lock.unlock();
                return z5;
            } catch (Exception e4) {
                throw e4;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
