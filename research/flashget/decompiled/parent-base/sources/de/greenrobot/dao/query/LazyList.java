package de.greenrobot.dao.query;

import android.database.Cursor;
import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.InternalQueryDaoAccess;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class LazyList<E> implements List<E>, Closeable {
    private final Cursor cursor;
    private final InternalQueryDaoAccess<E> daoAccess;
    private final List<E> entities;
    private volatile int loadedCount;
    private final ReentrantLock lock;
    private final int size;

    protected class LazyIterator implements CloseableListIterator<E> {
        private final boolean closeWhenDone;
        private int index;

        public LazyIterator(int i4, boolean z4) {
            this.index = i4;
            this.closeWhenDone = z4;
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            LazyList.this.close();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < LazyList.this.size;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.index >= LazyList.this.size) {
                throw new NoSuchElementException();
            }
            E e4 = (E) LazyList.this.get(this.index);
            int i4 = this.index + 1;
            this.index = i4;
            if (i4 == LazyList.this.size && this.closeWhenDone) {
                close();
            }
            return e4;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i4 = this.index;
            if (i4 <= 0) {
                throw new NoSuchElementException();
            }
            int i5 = i4 - 1;
            this.index = i5;
            return (E) LazyList.this.get(i5);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            throw new UnsupportedOperationException();
        }
    }

    LazyList(InternalQueryDaoAccess<E> internalQueryDaoAccess, Cursor cursor, boolean z4) {
        this.cursor = cursor;
        this.daoAccess = internalQueryDaoAccess;
        int count = cursor.getCount();
        this.size = count;
        if (z4) {
            this.entities = new ArrayList(count);
            for (int i4 = 0; i4 < this.size; i4++) {
                this.entities.add(null);
            }
        } else {
            this.entities = null;
        }
        if (this.size == 0) {
            cursor.close();
        }
        this.lock = new ReentrantLock();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    protected void checkCached() {
        if (this.entities == null) {
            throw new DaoException(ProtectedSandApp.s("忻\u0001"));
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        loadRemaining();
        return this.entities.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        loadRemaining();
        return this.entities.containsAll(collection);
    }

    @Override // java.util.List
    public E get(int i4) {
        List<E> list = this.entities;
        if (list == null) {
            return loadEntity(i4);
        }
        E e4 = list.get(i4);
        if (e4 == null) {
            this.lock.lock();
            try {
                e4 = this.entities.get(i4);
                if (e4 == null) {
                    e4 = loadEntity(i4);
                    this.entities.set(i4, e4);
                    this.loadedCount++;
                    if (this.loadedCount == this.size) {
                        this.cursor.close();
                    }
                }
            } finally {
                this.lock.unlock();
            }
        }
        return e4;
    }

    public int getLoadedCount() {
        return this.loadedCount;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        loadRemaining();
        return this.entities.indexOf(obj);
    }

    public boolean isClosed() {
        return this.cursor.isClosed();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isLoadedCompletely() {
        return this.loadedCount == this.size;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new LazyIterator(0, false);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        loadRemaining();
        return this.entities.lastIndexOf(obj);
    }

    public CloseableListIterator<E> listIteratorAutoClose() {
        return new LazyIterator(0, true);
    }

    protected E loadEntity(int i4) {
        this.cursor.moveToPosition(i4);
        E loadCurrent = this.daoAccess.loadCurrent(this.cursor, 0, true);
        if (loadCurrent != null) {
            return loadCurrent;
        }
        throw new DaoException(a.a(ProtectedSandApp.s("忼\u0001"), i4));
    }

    public void loadRemaining() {
        checkCached();
        int size = this.entities.size();
        for (int i4 = 0; i4 < size; i4++) {
            get(i4);
        }
    }

    public E peak(int i4) {
        List<E> list = this.entities;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    @Override // java.util.List
    public E remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public E set(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.List
    public List<E> subList(int i4, int i5) {
        checkCached();
        for (int i6 = i4; i6 < i5; i6++) {
            this.entities.get(i6);
        }
        return this.entities.subList(i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        loadRemaining();
        return this.entities.toArray();
    }

    @Override // java.util.List
    public void add(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public CloseableListIterator<E> listIterator() {
        return new LazyIterator(0, false);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i4) {
        return new LazyIterator(i4, false);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        loadRemaining();
        return (T[]) this.entities.toArray(tArr);
    }
}
