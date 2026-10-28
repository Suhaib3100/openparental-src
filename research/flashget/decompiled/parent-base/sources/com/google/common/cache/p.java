package com.google.common.cache;

import com.google.common.cache.k;

/* compiled from: ReferenceEntry.java */
@d9.c
@g
/* loaded from: classes6.dex */
interface p<K, V> {
    long getAccessTime();

    int getHash();

    @zc.a
    K getKey();

    @zc.a
    p<K, V> getNext();

    p<K, V> getNextInAccessQueue();

    p<K, V> getNextInWriteQueue();

    p<K, V> getPreviousInAccessQueue();

    p<K, V> getPreviousInWriteQueue();

    @zc.a
    k.a0<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j4);

    void setNextInAccessQueue(p<K, V> pVar);

    void setNextInWriteQueue(p<K, V> pVar);

    void setPreviousInAccessQueue(p<K, V> pVar);

    void setPreviousInWriteQueue(p<K, V> pVar);

    void setValueReference(k.a0<K, V> a0Var);

    void setWriteTime(long j4);
}
