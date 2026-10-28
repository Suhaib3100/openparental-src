package kotlin.reflect.jvm.internal.impl.utils;

import androidx.collection.s;
import androidx.content.preferences.protobuf.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList.java */
/* loaded from: classes7.dex */
public class f<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private int f78681b;

    /* renamed from: c, reason: collision with root package name */
    private Object f78682c;

    /* compiled from: SmartList.java */
    private static class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        private static final b f78683b = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f78683b;
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

        /* renamed from: c, reason: collision with root package name */
        private final int f78684c;

        public c() {
            this.f78684c = ((AbstractList) f.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.f.d
        protected void a() {
            if (((AbstractList) f.this).modCount == this.f78684c) {
                return;
            }
            throw new ConcurrentModificationException(ProtectedSandApp.s("腑\u0001") + ((AbstractList) f.this).modCount + ProtectedSandApp.s("腒\u0001") + this.f78684c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.f.d
        protected E b() {
            return (E) f.this.f78682c;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            f.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        private boolean f78686b;

        private d() {
        }

        protected abstract void a();

        protected abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f78686b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f78686b) {
                throw new NoSuchElementException();
            }
            this.f78686b = true;
            a();
            return b();
        }

        d(a aVar) {
        }
    }

    private static /* synthetic */ void b(int i4) {
        String s4 = (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 7) ? ProtectedSandApp.s("腔\u0001") : ProtectedSandApp.s("腓\u0001");
        Object[] objArr = new Object[(i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : 3];
        String s5 = ProtectedSandApp.s("腕\u0001");
        switch (i4) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = s5;
                break;
            case 4:
                objArr[0] = ProtectedSandApp.s("腗\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("腖\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("腘\u0001");
        if (i4 == 2 || i4 == 3) {
            objArr[1] = ProtectedSandApp.s("腙\u0001");
        } else if (i4 == 5 || i4 == 6 || i4 == 7) {
            objArr[1] = s6;
        } else {
            objArr[1] = s5;
        }
        switch (i4) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = s6;
                break;
            default:
                objArr[2] = ProtectedSandApp.s("腚\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        int i4 = this.f78681b;
        if (i4 == 0) {
            this.f78682c = e4;
        } else if (i4 == 1) {
            this.f78682c = new Object[]{this.f78682c, e4};
        } else {
            Object[] objArr = (Object[]) this.f78682c;
            int length = objArr.length;
            if (i4 >= length) {
                int a5 = r.a(length, 3, 2, 1);
                int i5 = i4 + 1;
                if (a5 < i5) {
                    a5 = i5;
                }
                Object[] objArr2 = new Object[a5];
                this.f78682c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f78681b] = e4;
        }
        this.f78681b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f78682c = null;
        this.f78681b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        int i5;
        if (i4 >= 0 && i4 < (i5 = this.f78681b)) {
            return i5 == 1 ? (E) this.f78682c : (E) ((Object[]) this.f78682c)[i4];
        }
        StringBuilder a5 = s.a(ProtectedSandApp.s("腛\u0001"), i4, ProtectedSandApp.s("腜\u0001"));
        a5.append(this.f78681b);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        int i4 = this.f78681b;
        if (i4 == 0) {
            b a5 = b.a();
            if (a5 == null) {
                b(2);
            }
            return a5;
        }
        if (i4 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            b(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i4) {
        int i5;
        E e4;
        if (i4 < 0 || i4 >= (i5 = this.f78681b)) {
            StringBuilder a5 = s.a(ProtectedSandApp.s("腛\u0001"), i4, ProtectedSandApp.s("腜\u0001"));
            a5.append(this.f78681b);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i5 == 1) {
            e4 = (E) this.f78682c;
            this.f78682c = null;
        } else {
            Object[] objArr = (Object[]) this.f78682c;
            Object obj = objArr[i4];
            if (i5 == 2) {
                this.f78682c = objArr[1 - i4];
            } else {
                int i6 = (i5 - i4) - 1;
                if (i6 > 0) {
                    System.arraycopy(objArr, i4 + 1, objArr, i4, i6);
                }
                objArr[this.f78681b - 1] = null;
            }
            e4 = (E) obj;
        }
        this.f78681b--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i4, E e4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f78681b)) {
            StringBuilder a5 = s.a(ProtectedSandApp.s("腛\u0001"), i4, ProtectedSandApp.s("腜\u0001"));
            a5.append(this.f78681b);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i5 == 1) {
            E e5 = (E) this.f78682c;
            this.f78682c = e4;
            return e5;
        }
        Object[] objArr = (Object[]) this.f78682c;
        E e6 = (E) objArr[i4];
        objArr[i4] = e4;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f78681b;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i4 = this.f78681b;
        if (i4 >= 2) {
            Arrays.sort((Object[]) this.f78682c, 0, i4, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public <T> T[] toArray(@l T[] tArr) {
        if (tArr == 0) {
            b(4);
        }
        int length = tArr.length;
        int i4 = this.f78681b;
        if (i4 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f78682c;
                return tArr2;
            }
            tArr[0] = this.f78682c;
        } else {
            if (length < i4) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f78682c, i4, tArr.getClass());
                if (tArr3 == null) {
                    b(6);
                }
                return tArr3;
            }
            if (i4 != 0) {
                System.arraycopy(this.f78682c, 0, tArr, 0, i4);
            }
        }
        int i5 = this.f78681b;
        if (length > i5) {
            tArr[i5] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, E e4) {
        int i5;
        if (i4 >= 0 && i4 <= (i5 = this.f78681b)) {
            if (i5 == 0) {
                this.f78682c = e4;
            } else if (i5 == 1 && i4 == 0) {
                this.f78682c = new Object[]{e4, this.f78682c};
            } else {
                Object[] objArr = new Object[i5 + 1];
                if (i5 == 1) {
                    objArr[0] = this.f78682c;
                } else {
                    Object[] objArr2 = (Object[]) this.f78682c;
                    System.arraycopy(objArr2, 0, objArr, 0, i4);
                    System.arraycopy(objArr2, i4, objArr, i4 + 1, this.f78681b - i4);
                }
                objArr[i4] = e4;
                this.f78682c = objArr;
            }
            this.f78681b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder a5 = s.a(ProtectedSandApp.s("腛\u0001"), i4, ProtectedSandApp.s("腜\u0001"));
        a5.append(this.f78681b);
        throw new IndexOutOfBoundsException(a5.toString());
    }
}
