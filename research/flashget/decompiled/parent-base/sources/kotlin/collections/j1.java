package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\t\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/collections/j1;", "T", "Lkotlin/collections/c;", "", "delegate", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "d", "Ljava/util/List;", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
class j1<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<T> delegate;

    /* compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"kotlin/collections/j1$a", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "b", "Ljava/util/ListIterator;", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListIterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ListIterator<T> delegateIterator;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j1<T> f74923c;

        /* JADX WARN: Multi-variable type inference failed */
        a(j1<? extends T> j1Var, int i4) {
            int e12;
            this.f74923c = j1Var;
            List list = ((j1) j1Var).delegate;
            e12 = e0.e1(j1Var, i4);
            this.delegateIterator = list.listIterator(e12);
        }

        @Override // java.util.ListIterator
        public void add(T t4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("憆\u0001"));
        }

        @fg.l
        public final ListIterator<T> b() {
            return this.delegateIterator;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            j1<T> j1Var = this.f74923c;
            return y.J(j1Var) - this.delegateIterator.previousIndex();
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            j1<T> j1Var = this.f74923c;
            return y.J(j1Var) - this.delegateIterator.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("憆\u0001"));
        }

        @Override // java.util.ListIterator
        public void set(T t4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("憆\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1(@fg.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("憇\u0001"));
        this.delegate = list;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b */
    public int get_size() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.c, java.util.List
    public T get(int index) {
        int c12;
        List<T> list = this.delegate;
        c12 = e0.c1(this, index);
        return list.get(c12);
    }

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.l
    public ListIterator<T> listIterator(int index) {
        return new a(this, index);
    }
}
