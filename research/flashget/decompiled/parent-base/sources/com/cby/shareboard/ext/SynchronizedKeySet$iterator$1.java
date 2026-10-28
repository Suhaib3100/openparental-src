package com.cby.shareboard.ext;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import md.d;

/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: SynchronizedKeySet.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/cby/shareboard/ext/SynchronizedKeySet$iterator$1", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "iterator", "Ljava/util/Iterator;", "current", "Ljava/lang/Object;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SynchronizedKeySet$iterator$1<K> implements Iterator<K>, d {

    @m
    private K current;

    @l
    private final Iterator<K> iterator;
    final /* synthetic */ SynchronizedKeySet<K> this$0;

    SynchronizedKeySet$iterator$1(SynchronizedKeySet<K> synchronizedKeySet) {
        HashSet hashSet;
        this.this$0 = synchronizedKeySet;
        hashSet = ((SynchronizedKeySet) synchronizedKeySet).internalSet;
        Iterator<K> it = hashSet.iterator();
        l0.o(it, ProtectedSandApp.s("ౖ"));
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        ReentrantLock reentrantLock;
        reentrantLock = ((SynchronizedKeySet) this.this$0).lock;
        reentrantLock.lock();
        try {
            K next = this.iterator.next();
            this.current = next;
            l0.m(next);
            return next;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        ReentrantLock reentrantLock;
        ConcurrentHashMap concurrentHashMap;
        reentrantLock = ((SynchronizedKeySet) this.this$0).lock;
        SynchronizedKeySet<K> synchronizedKeySet = this.this$0;
        reentrantLock.lock();
        try {
            this.iterator.remove();
            concurrentHashMap = ((SynchronizedKeySet) synchronizedKeySet).map;
            K k4 = this.current;
            l0.m(k4);
        } finally {
            reentrantLock.unlock();
        }
    }
}
