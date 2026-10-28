package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
final class ChainBuilder<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private final Map<Class<?>, E> uniqueClasses = new HashMap();

    private void ensureUnique(E e4) {
        E remove = this.uniqueClasses.remove(e4.getClass());
        if (remove != null) {
            this.list.remove(remove);
        }
        this.uniqueClasses.put(e4.getClass(), e4);
    }

    public ChainBuilder<E> addAllFirst(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addFirst(it.next());
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addLast(it.next());
        }
        return this;
    }

    public ChainBuilder<E> addFirst(E e4) {
        if (e4 == null) {
            return this;
        }
        ensureUnique(e4);
        this.list.addFirst(e4);
        return this;
    }

    public ChainBuilder<E> addLast(E e4) {
        if (e4 == null) {
            return this;
        }
        ensureUnique(e4);
        this.list.addLast(e4);
        return this;
    }

    public LinkedList<E> build() {
        return new LinkedList<>(this.list);
    }

    public ChainBuilder<E> addAllFirst(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e4 : eArr) {
            addFirst(e4);
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e4 : eArr) {
            addLast(e4);
        }
        return this;
    }
}
