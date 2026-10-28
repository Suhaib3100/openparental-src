package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", "T", "Lkotlin/collections/AbstractList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.m1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
class ReversedListReadOnly<T> extends AbstractList<T> {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final List<T> f23169q;

    /* compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\r\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.m1$a */
    /* loaded from: classes5.dex */
    public static final class a implements ListIterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final ListIterator<T> f23170o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ReversedListReadOnly<T> f23171p;

        /* JADX WARN: Multi-variable type inference failed */
        a(ReversedListReadOnly<? extends T> reversedListReadOnly, int i5) {
            int e12;
            this.f23171p = reversedListReadOnly;
            List list = ((ReversedListReadOnly) reversedListReadOnly).f23169q;
            e12 = g0.e1(reversedListReadOnly, i5);
            this.f23170o = list.listIterator(e12);
        }

        @d5.d
        public final ListIterator<T> a() {
            return this.f23170o;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㟮"));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23170o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23170o.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f23170o.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            ReversedListReadOnly<T> reversedListReadOnly = this.f23171p;
            return a0.J(reversedListReadOnly) - this.f23170o.previousIndex();
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f23170o.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            ReversedListReadOnly<T> reversedListReadOnly = this.f23171p;
            return a0.J(reversedListReadOnly) - this.f23170o.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㟯"));
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㟰"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(@d5.d List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("綁"));
        this.f23169q = list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF23147s() {
        return this.f23169q.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        int c12;
        List<T> list = this.f23169q;
        c12 = g0.c1(this, index);
        return list.get(c12);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @d5.d
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @d5.d
    public ListIterator<T> listIterator(int index) {
        return new a(this, index);
    }
}
