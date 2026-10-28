package de.greenrobot.dao.identityscope;

/* loaded from: classes7.dex */
public interface IdentityScope<K, T> {
    void clear();

    boolean detach(K k4, T t4);

    T get(K k4);

    T getNoLock(K k4);

    void lock();

    void put(K k4, T t4);

    void putNoLock(K k4, T t4);

    void remove(Iterable<K> iterable);

    void remove(K k4);

    void reserveRoom(int i4);

    void unlock();
}
