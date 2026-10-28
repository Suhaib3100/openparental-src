package org.apache.http.pool;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@NotThreadSafe
/* loaded from: classes3.dex */
abstract class RouteSpecificPool<T, C, E extends PoolEntry<T, C>> {
    private final T route;
    private final Set<E> leased = new HashSet();
    private final LinkedList<E> available = new LinkedList<>();
    private final LinkedList<PoolEntryFuture<E>> pending = new LinkedList<>();

    RouteSpecificPool(T t4) {
        this.route = t4;
    }

    public E add(C c5) {
        E createEntry = createEntry(c5);
        this.leased.add(createEntry);
        return createEntry;
    }

    protected abstract E createEntry(C c5);

    public void free(E e4, boolean z4) {
        Args.notNull(e4, "Pool entry");
        Asserts.check(this.leased.remove(e4), "Entry %s has not been leased from this pool", e4);
        if (z4) {
            this.available.addFirst(e4);
        }
    }

    public int getAllocatedCount() {
        return this.leased.size() + this.available.size();
    }

    public int getAvailableCount() {
        return this.available.size();
    }

    public E getFree(Object obj) {
        if (this.available.isEmpty()) {
            return null;
        }
        if (obj != null) {
            Iterator<E> it = this.available.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (obj.equals(next.getState())) {
                    it.remove();
                    this.leased.add(next);
                    return next;
                }
            }
        }
        Iterator<E> it2 = this.available.iterator();
        while (it2.hasNext()) {
            E next2 = it2.next();
            if (next2.getState() == null) {
                it2.remove();
                this.leased.add(next2);
                return next2;
            }
        }
        return null;
    }

    public E getLastUsed() {
        if (this.available.isEmpty()) {
            return null;
        }
        return this.available.getLast();
    }

    public int getLeasedCount() {
        return this.leased.size();
    }

    public int getPendingCount() {
        return this.pending.size();
    }

    public final T getRoute() {
        return this.route;
    }

    public PoolEntryFuture<E> nextPending() {
        return this.pending.poll();
    }

    public void queue(PoolEntryFuture<E> poolEntryFuture) {
        if (poolEntryFuture == null) {
            return;
        }
        this.pending.add(poolEntryFuture);
    }

    public boolean remove(E e4) {
        Args.notNull(e4, "Pool entry");
        return this.available.remove(e4) || this.leased.remove(e4);
    }

    public void shutdown() {
        Iterator<PoolEntryFuture<E>> it = this.pending.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.pending.clear();
        Iterator<E> it2 = this.available.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
        this.available.clear();
        Iterator<E> it3 = this.leased.iterator();
        while (it3.hasNext()) {
            it3.next().close();
        }
        this.leased.clear();
    }

    public String toString() {
        return "[route: " + this.route + "][leased: " + this.leased.size() + "][available: " + this.available.size() + "][pending: " + this.pending.size() + "]";
    }

    public void unqueue(PoolEntryFuture<E> poolEntryFuture) {
        if (poolEntryFuture == null) {
            return;
        }
        this.pending.remove(poolEntryFuture);
    }
}
