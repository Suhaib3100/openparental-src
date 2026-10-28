package com.nostra13.universalimageloader.core.assist.deque;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: LinkedBlockingDeque.java */
/* loaded from: classes6.dex */
public class d<E> extends AbstractQueue<E> implements com.nostra13.universalimageloader.core.assist.deque.a<E>, Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long f70263i = -387911632671998426L;

    /* renamed from: b, reason: collision with root package name */
    transient e<E> f70264b;

    /* renamed from: c, reason: collision with root package name */
    transient e<E> f70265c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f70266d;

    /* renamed from: e, reason: collision with root package name */
    private final int f70267e;

    /* renamed from: f, reason: collision with root package name */
    final ReentrantLock f70268f;

    /* renamed from: g, reason: collision with root package name */
    private final Condition f70269g;

    /* renamed from: h, reason: collision with root package name */
    private final Condition f70270h;

    /* compiled from: LinkedBlockingDeque.java */
    private abstract class b implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        e<E> f70271b;

        /* renamed from: c, reason: collision with root package name */
        E f70272c;

        /* renamed from: d, reason: collision with root package name */
        private e<E> f70273d;

        b() {
            ReentrantLock reentrantLock = d.this.f70268f;
            reentrantLock.lock();
            try {
                e<E> b5 = b();
                this.f70271b = b5;
                this.f70272c = b5 == null ? null : b5.f70277a;
            } finally {
                reentrantLock.unlock();
            }
        }

        private e<E> d(e<E> eVar) {
            while (true) {
                e<E> c5 = c(eVar);
                if (c5 == null) {
                    return null;
                }
                if (c5.f70277a != null) {
                    return c5;
                }
                if (c5 == eVar) {
                    return b();
                }
                eVar = c5;
            }
        }

        void a() {
            ReentrantLock reentrantLock = d.this.f70268f;
            reentrantLock.lock();
            try {
                e<E> d5 = d(this.f70271b);
                this.f70271b = d5;
                this.f70272c = d5 == null ? null : d5.f70277a;
            } finally {
                reentrantLock.unlock();
            }
        }

        abstract e<E> b();

        abstract e<E> c(e<E> eVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f70271b != null;
        }

        @Override // java.util.Iterator
        public E next() {
            e<E> eVar = this.f70271b;
            if (eVar == null) {
                throw new NoSuchElementException();
            }
            this.f70273d = eVar;
            E e4 = this.f70272c;
            a();
            return e4;
        }

        @Override // java.util.Iterator
        public void remove() {
            e<E> eVar = this.f70273d;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            this.f70273d = null;
            ReentrantLock reentrantLock = d.this.f70268f;
            reentrantLock.lock();
            try {
                if (eVar.f70277a != null) {
                    d.this.h(eVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: LinkedBlockingDeque.java */
    private class c extends d<E>.b {
        private c() {
            super();
        }

        @Override // com.nostra13.universalimageloader.core.assist.deque.d.b
        e<E> b() {
            return d.this.f70265c;
        }

        @Override // com.nostra13.universalimageloader.core.assist.deque.d.b
        e<E> c(e<E> eVar) {
            return eVar.f70278b;
        }
    }

    /* compiled from: LinkedBlockingDeque.java */
    /* renamed from: com.nostra13.universalimageloader.core.assist.deque.d$d, reason: collision with other inner class name */
    private class C0987d extends d<E>.b {
        private C0987d() {
            super();
        }

        @Override // com.nostra13.universalimageloader.core.assist.deque.d.b
        e<E> b() {
            return d.this.f70264b;
        }

        @Override // com.nostra13.universalimageloader.core.assist.deque.d.b
        e<E> c(e<E> eVar) {
            return eVar.f70279c;
        }
    }

    /* compiled from: LinkedBlockingDeque.java */
    static final class e<E> {

        /* renamed from: a, reason: collision with root package name */
        E f70277a;

        /* renamed from: b, reason: collision with root package name */
        e<E> f70278b;

        /* renamed from: c, reason: collision with root package name */
        e<E> f70279c;

        e(E e4) {
            this.f70277a = e4;
        }
    }

    public d() {
        this(Integer.MAX_VALUE);
    }

    private boolean b(e<E> eVar) {
        int i4 = this.f70266d;
        if (i4 >= this.f70267e) {
            return false;
        }
        e<E> eVar2 = this.f70264b;
        eVar.f70279c = eVar2;
        this.f70264b = eVar;
        if (this.f70265c == null) {
            this.f70265c = eVar;
        } else {
            eVar2.f70278b = eVar;
        }
        this.f70266d = i4 + 1;
        this.f70269g.signal();
        return true;
    }

    private boolean c(e<E> eVar) {
        int i4 = this.f70266d;
        if (i4 >= this.f70267e) {
            return false;
        }
        e<E> eVar2 = this.f70265c;
        eVar.f70278b = eVar2;
        this.f70265c = eVar;
        if (this.f70264b == null) {
            this.f70264b = eVar;
        } else {
            eVar2.f70279c = eVar;
        }
        this.f70266d = i4 + 1;
        this.f70269g.signal();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f70266d = 0;
        this.f70264b = null;
        this.f70265c = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            } else {
                add(readObject);
            }
        }
    }

    private E i() {
        e<E> eVar = this.f70264b;
        if (eVar == null) {
            return null;
        }
        e<E> eVar2 = eVar.f70279c;
        E e4 = eVar.f70277a;
        eVar.f70277a = null;
        eVar.f70279c = eVar;
        this.f70264b = eVar2;
        if (eVar2 == null) {
            this.f70265c = null;
        } else {
            eVar2.f70278b = null;
        }
        this.f70266d--;
        this.f70270h.signal();
        return e4;
    }

    private E j() {
        e<E> eVar = this.f70265c;
        if (eVar == null) {
            return null;
        }
        e<E> eVar2 = eVar.f70278b;
        E e4 = eVar.f70277a;
        eVar.f70277a = null;
        eVar.f70278b = eVar;
        this.f70265c = eVar2;
        if (eVar2 == null) {
            this.f70264b = null;
        } else {
            eVar2.f70279c = null;
        }
        this.f70266d--;
        this.f70270h.signal();
        return e4;
    }

    private void l(ObjectOutputStream objectOutputStream) throws IOException {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (e<E> eVar = this.f70264b; eVar != null; eVar = eVar.f70279c) {
                objectOutputStream.writeObject(eVar.f70277a);
            }
            objectOutputStream.writeObject(null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean add(E e4) {
        addLast(e4);
        return true;
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public void addFirst(E e4) {
        if (!offerFirst(e4)) {
            throw new IllegalStateException(ProtectedSandApp.s("ᩌ\u0001"));
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public void addLast(E e4) {
        if (!offerLast(e4)) {
            throw new IllegalStateException(ProtectedSandApp.s("ᩌ\u0001"));
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            e<E> eVar = this.f70264b;
            while (eVar != null) {
                eVar.f70277a = null;
                e<E> eVar2 = eVar.f70279c;
                eVar.f70278b = null;
                eVar.f70279c = null;
                eVar = eVar2;
            }
            this.f70265c = null;
            this.f70264b = null;
            this.f70266d = 0;
            this.f70270h.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            for (e<E> eVar = this.f70264b; eVar != null; eVar = eVar.f70279c) {
                if (obj.equals(eVar.f70277a)) {
                    reentrantLock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public Iterator<E> descendingIterator() {
        return new c();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    @Override // java.util.AbstractQueue, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public E element() {
        return getFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E getFirst() {
        E peekFirst = peekFirst();
        if (peekFirst != null) {
            return peekFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E getLast() {
        E peekLast = peekLast();
        if (peekLast != null) {
            return peekLast;
        }
        throw new NoSuchElementException();
    }

    void h(e<E> eVar) {
        e<E> eVar2 = eVar.f70278b;
        e<E> eVar3 = eVar.f70279c;
        if (eVar2 == null) {
            i();
            return;
        }
        if (eVar3 == null) {
            j();
            return;
        }
        eVar2.f70279c = eVar3;
        eVar3.f70278b = eVar2;
        eVar.f70277a = null;
        this.f70266d--;
        this.f70270h.signal();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public Iterator<E> iterator() {
        return new C0987d();
    }

    public boolean offer(E e4) {
        return offerLast(e4);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean offerFirst(E e4) {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return b(eVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean offerLast(E e4) {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return c(eVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public E peek() {
        return peekFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E peekFirst() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            e<E> eVar = this.f70264b;
            return eVar == null ? null : eVar.f70277a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E peekLast() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            e<E> eVar = this.f70265c;
            return eVar == null ? null : eVar.f70277a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public E poll() {
        return pollFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E pollFirst() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return i();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E pollLast() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E pop() {
        return removeFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public void push(E e4) {
        addFirst(e4);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue
    public void put(E e4) throws InterruptedException {
        putLast(e4);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public void putFirst(E e4) throws InterruptedException {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        while (!b(eVar)) {
            try {
                this.f70270h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public void putLast(E e4) throws InterruptedException {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        while (!c(eVar)) {
            try {
                this.f70270h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return this.f70267e - this.f70266d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public E remove() {
        return removeFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E removeFirst() {
        E pollFirst = pollFirst();
        if (pollFirst != null) {
            return pollFirst;
        }
        throw new NoSuchElementException();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            for (e<E> eVar = this.f70264b; eVar != null; eVar = eVar.f70279c) {
                if (obj.equals(eVar.f70277a)) {
                    h(eVar);
                    reentrantLock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.b
    public E removeLast() {
        E pollLast = pollLast();
        if (pollLast != null) {
            return pollLast;
        }
        throw new NoSuchElementException();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            for (e<E> eVar = this.f70265c; eVar != null; eVar = eVar.f70278b) {
                if (obj.equals(eVar.f70277a)) {
                    h(eVar);
                    reentrantLock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.a, com.nostra13.universalimageloader.core.assist.deque.b
    public int size() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            return this.f70266d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return takeFirst();
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public E takeFirst() throws InterruptedException {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        while (true) {
            try {
                E i4 = i();
                if (i4 != null) {
                    return i4;
                }
                this.f70269g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public E takeLast() throws InterruptedException {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        while (true) {
            try {
                E j4 = j();
                if (j4 != null) {
                    return j4;
                }
                this.f70269g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.f70266d];
            e<E> eVar = this.f70264b;
            int i4 = 0;
            while (eVar != null) {
                int i5 = i4 + 1;
                objArr[i4] = eVar.f70277a;
                eVar = eVar.f70279c;
                i4 = i5;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            e<E> eVar = this.f70264b;
            if (eVar == null) {
                return ProtectedSandApp.s("ᩍ\u0001");
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while (true) {
                Object obj = eVar.f70277a;
                if (obj == this) {
                    obj = ProtectedSandApp.s("ᩎ\u0001");
                }
                sb.append(obj);
                eVar = eVar.f70279c;
                if (eVar == null) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public d(int i4) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f70268f = reentrantLock;
        this.f70269g = reentrantLock.newCondition();
        this.f70270h = reentrantLock.newCondition();
        if (i4 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f70267e = i4;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i4) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            int min = Math.min(i4, this.f70266d);
            for (int i5 = 0; i5 < min; i5++) {
                collection.add(this.f70264b.f70277a);
                i();
            }
            return min;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue
    public boolean offer(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        return offerLast(e4, j4, timeUnit);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue
    public E poll(long j4, TimeUnit timeUnit) throws InterruptedException {
        return pollFirst(j4, timeUnit);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.nostra13.universalimageloader.core.assist.deque.a, java.util.concurrent.BlockingQueue, com.nostra13.universalimageloader.core.assist.deque.b
    public boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public E pollFirst(long j4, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E i4 = i();
                if (i4 != null) {
                    return i4;
                }
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.f70269g.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public E pollLast(long j4, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E j5 = j();
                if (j5 != null) {
                    return j5;
                }
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.f70269g.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public d(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            for (E e4 : collection) {
                if (e4 != null) {
                    if (!c(new e<>(e4))) {
                        throw new IllegalStateException(ProtectedSandApp.s("ᩌ\u0001"));
                    }
                } else {
                    throw new NullPointerException();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public boolean offerFirst(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        long nanos = timeUnit.toNanos(j4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lockInterruptibly();
        while (!b(eVar)) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f70270h.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
        return true;
    }

    @Override // com.nostra13.universalimageloader.core.assist.deque.a
    public boolean offerLast(E e4, long j4, TimeUnit timeUnit) throws InterruptedException {
        e4.getClass();
        e<E> eVar = new e<>(e4);
        long nanos = timeUnit.toNanos(j4);
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lockInterruptibly();
        while (!c(eVar)) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.f70270h.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f70268f;
        reentrantLock.lock();
        try {
            if (tArr.length < this.f70266d) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f70266d));
            }
            e<E> eVar = this.f70264b;
            int i4 = 0;
            while (eVar != null) {
                tArr[i4] = eVar.f70277a;
                eVar = eVar.f70279c;
                i4++;
            }
            if (tArr.length > i4) {
                tArr[i4] = null;
            }
            reentrantLock.unlock();
            return tArr;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
