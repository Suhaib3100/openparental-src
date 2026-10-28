package de.greenrobot.dao.identityscope;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class IdentityScopeObject<K, T> implements IdentityScope<K, T> {
    private final HashMap<K, Reference<T>> map = new HashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void clear() {
        this.lock.lock();
        try {
            this.map.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public boolean detach(K k4, T t4) {
        this.lock.lock();
        try {
            if (get(k4) != t4 || t4 == null) {
                this.lock.unlock();
                return false;
            }
            remove((IdentityScopeObject<K, T>) k4);
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public T get(K k4) {
        this.lock.lock();
        try {
            Reference<T> reference = this.map.get(k4);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public T getNoLock(K k4) {
        Reference<T> reference = this.map.get(k4);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void lock() {
        this.lock.lock();
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void put(K k4, T t4) {
        this.lock.lock();
        try {
            this.map.put(k4, new WeakReference(t4));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void putNoLock(K k4, T t4) {
        this.map.put(k4, new WeakReference(t4));
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void remove(K k4) {
        this.lock.lock();
        try {
            this.map.remove(k4);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void reserveRoom(int i4) {
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void unlock() {
        this.lock.unlock();
    }

    @Override // de.greenrobot.dao.identityscope.IdentityScope
    public void remove(Iterable<K> iterable) {
        this.lock.lock();
        try {
            Iterator<K> it = iterable.iterator();
            while (it.hasNext()) {
                this.map.remove(it.next());
            }
        } finally {
            this.lock.unlock();
        }
    }
}
