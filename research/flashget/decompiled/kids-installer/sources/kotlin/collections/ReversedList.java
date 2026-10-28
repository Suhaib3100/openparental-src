package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.l1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final List<T> f23164o;

    /* compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.l1$a */
    public static final class a implements ListIterator<T>, r3.f {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final ListIterator<T> f23165o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ReversedList<T> f23166p;

        a(ReversedList<T> reversedList, int i5) {
            int e12;
            this.f23166p = reversedList;
            List list = ((ReversedList) reversedList).f23164o;
            e12 = g0.e1(reversedList, i5);
            this.f23165o = list.listIterator(e12);
        }

        @d5.d
        public final ListIterator<T> a() {
            return this.f23165o;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.f23165o.add(element);
            this.f23165o.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23165o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23165o.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f23165o.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            ReversedList<T> reversedList = this.f23166p;
            return a0.J(reversedList) - this.f23165o.previousIndex();
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f23165o.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            ReversedList<T> reversedList = this.f23166p;
            return a0.J(reversedList) - this.f23165o.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f23165o.remove();
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.f23165o.set(element);
        }
    }

    public ReversedList(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("漂"));
        this.f23164o = list;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        int e12;
        List<T> list = this.f23164o;
        e12 = g0.e1(this, index);
        list.add(e12, element);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b */
    public int getF23160q() {
        return this.f23164o.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f23164o.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T f(int i5) {
        int c12;
        List<T> list = this.f23164o;
        c12 = g0.c1(this, i5);
        return list.remove(c12);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        int c12;
        List<T> list = this.f23164o;
        c12 = g0.c1(this, index);
        return list.get(c12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @d5.d
    public Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @d5.d
    public ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        int c12;
        List<T> list = this.f23164o;
        c12 = g0.c1(this, index);
        return list.set(c12, element);
    }

    @Override // java.util.AbstractList, java.util.List
    @d5.d
    public ListIterator<T> listIterator(int index) {
        return new a(this, index);
    }
}
