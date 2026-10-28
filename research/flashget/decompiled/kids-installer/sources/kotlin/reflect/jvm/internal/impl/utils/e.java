package kotlin.reflect.jvm.internal.impl.utils;

import android.content.preferences.protobuf.q;
import androidx.core.app.x;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList.java */
/* loaded from: classes5.dex */
public class e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    private int f26673o;

    /* renamed from: p, reason: collision with root package name */
    private Object f26674p;

    /* compiled from: SmartList.java */
    private static class b<T> implements Iterator<T> {

        /* renamed from: o, reason: collision with root package name */
        private static final b f26675o = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f26675o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    private class c extends d<E> {

        /* renamed from: p, reason: collision with root package name */
        private final int f26676p;

        public c() {
            super(null);
            this.f26676p = ((AbstractList) e.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        protected void a() {
            if (((AbstractList) e.this).modCount == this.f26676p) {
                return;
            }
            throw new ConcurrentModificationException(ProtectedSandApp.s("夙") + ((AbstractList) e.this).modCount + ProtectedSandApp.s("多") + this.f26676p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        protected E c() {
            return (E) e.this.f26674p;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            e.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: o, reason: collision with root package name */
        private boolean f26678o;

        private d() {
        }

        protected abstract void a();

        protected abstract T c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f26678o;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f26678o) {
                throw new NoSuchElementException();
            }
            this.f26678o = true;
            a();
            return c();
        }

        d(a aVar) {
        }
    }

    private static /* synthetic */ void b(int i5) {
        String s5 = (i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6 || i5 == 7) ? ProtectedSandApp.s("夜") : ProtectedSandApp.s("夛");
        Object[] objArr = new Object[(i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : 3];
        String s6 = ProtectedSandApp.s("夝");
        switch (i5) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = s6;
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("够");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("夞");
                break;
        }
        String s7 = ProtectedSandApp.s("夠");
        if (i5 == 2 || i5 == 3) {
            objArr[1] = ProtectedSandApp.s("夡");
        } else if (i5 == 5 || i5 == 6 || i5 == 7) {
            objArr[1] = s7;
        } else {
            objArr[1] = s6;
        }
        switch (i5) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("夢");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 2 && i5 != 3 && i5 != 5 && i5 != 6 && i5 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e6) {
        int i5 = this.f26673o;
        if (i5 == 0) {
            this.f26674p = e6;
        } else if (i5 == 1) {
            this.f26674p = new Object[]{this.f26674p, e6};
        } else {
            Object[] objArr = (Object[]) this.f26674p;
            int length = objArr.length;
            if (i5 >= length) {
                int a6 = q.a(length, 3, 2, 1);
                int i6 = i5 + 1;
                if (a6 < i6) {
                    a6 = i6;
                }
                Object[] objArr2 = new Object[a6];
                this.f26674p = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f26673o] = e6;
        }
        this.f26673o++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26674p = null;
        this.f26673o = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        int i6;
        if (i5 >= 0 && i5 < (i6 = this.f26673o)) {
            return i6 == 1 ? (E) this.f26674p : (E) ((Object[]) this.f26674p)[i5];
        }
        StringBuilder a6 = x.a(ProtectedSandApp.s("夥"), i5, ProtectedSandApp.s("夦"));
        a6.append(this.f26673o);
        throw new IndexOutOfBoundsException(a6.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @d5.d
    public Iterator<E> iterator() {
        int i5 = this.f26673o;
        if (i5 == 0) {
            b a6 = b.a();
            if (a6 == null) {
                b(2);
            }
            return a6;
        }
        if (i5 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            b(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i5) {
        int i6;
        E e6;
        if (i5 < 0 || i5 >= (i6 = this.f26673o)) {
            StringBuilder a6 = x.a(ProtectedSandApp.s("大"), i5, ProtectedSandApp.s("夨"));
            a6.append(this.f26673o);
            throw new IndexOutOfBoundsException(a6.toString());
        }
        if (i6 == 1) {
            e6 = (E) this.f26674p;
            this.f26674p = null;
        } else {
            Object[] objArr = (Object[]) this.f26674p;
            Object obj = objArr[i5];
            if (i6 == 2) {
                this.f26674p = objArr[1 - i5];
            } else {
                int i7 = (i6 - i5) - 1;
                if (i7 > 0) {
                    System.arraycopy(objArr, i5 + 1, objArr, i5, i7);
                }
                objArr[this.f26673o - 1] = null;
            }
            e6 = (E) obj;
        }
        this.f26673o--;
        ((AbstractList) this).modCount++;
        return e6;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i5, E e6) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f26673o)) {
            StringBuilder a6 = x.a(ProtectedSandApp.s("天"), i5, ProtectedSandApp.s("太"));
            a6.append(this.f26673o);
            throw new IndexOutOfBoundsException(a6.toString());
        }
        if (i6 == 1) {
            E e7 = (E) this.f26674p;
            this.f26674p = e6;
            return e7;
        }
        Object[] objArr = (Object[]) this.f26674p;
        E e8 = (E) objArr[i5];
        objArr[i5] = e6;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26673o;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i5 = this.f26673o;
        if (i5 >= 2) {
            Arrays.sort((Object[]) this.f26674p, 0, i5, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @d5.d
    public <T> T[] toArray(@d5.d T[] tArr) {
        if (tArr == 0) {
            b(4);
        }
        int length = tArr.length;
        int i5 = this.f26673o;
        if (i5 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f26674p;
                return tArr2;
            }
            tArr[0] = this.f26674p;
        } else {
            if (length < i5) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f26674p, i5, tArr.getClass());
                if (tArr3 == null) {
                    b(6);
                }
                return tArr3;
            }
            if (i5 != 0) {
                System.arraycopy(this.f26674p, 0, tArr, 0, i5);
            }
        }
        int i6 = this.f26673o;
        if (length > i6) {
            tArr[i6] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i5, E e6) {
        int i6;
        if (i5 >= 0 && i5 <= (i6 = this.f26673o)) {
            if (i6 == 0) {
                this.f26674p = e6;
            } else if (i6 == 1 && i5 == 0) {
                this.f26674p = new Object[]{e6, this.f26674p};
            } else {
                Object[] objArr = new Object[i6 + 1];
                if (i6 == 1) {
                    objArr[0] = this.f26674p;
                } else {
                    Object[] objArr2 = (Object[]) this.f26674p;
                    System.arraycopy(objArr2, 0, objArr, 0, i5);
                    System.arraycopy(objArr2, i5, objArr, i5 + 1, this.f26673o - i5);
                }
                objArr[i5] = e6;
                this.f26674p = objArr;
            }
            this.f26673o++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder a6 = x.a(ProtectedSandApp.s("夣"), i5, ProtectedSandApp.s("夤"));
        a6.append(this.f26673o);
        throw new IndexOutOfBoundsException(a6.toString());
    }
}
