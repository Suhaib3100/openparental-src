package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: AbstractCollection.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlin/collections/a;", "E", "", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.c1(version = "1.1")
@kotlin.jvm.internal.r1({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1747#2,3:51\n1726#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a<E> implements Collection<E>, md.a {

    /* compiled from: AbstractCollection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00012\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    static final class C1046a extends kotlin.jvm.internal.n0 implements ld.l<E, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<E> f74828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1046a(a<? extends E> aVar) {
            super(1);
            this.f74828b = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e4) {
            return e4 == this.f74828b ? ProtectedSandApp.s("悕\u0001") : String.valueOf(e4);
        }
    }

    protected a() {
    }

    @Override // java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    /* renamed from: b */
    public abstract int get_size();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E element) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(it.next(), element)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("悽\u0001"));
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return get_size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("悼\u0001"));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection
    @fg.l
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @fg.l
    public String toString() {
        return g0.m3(this, ProtectedSandApp.s("悿\u0001"), ProtectedSandApp.s("惀\u0001"), ProtectedSandApp.s("惁\u0001"), 0, null, new C1046a(this), 24, null);
    }

    @Override // java.util.Collection
    @fg.l
    public <T> T[] toArray(@fg.l T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("悾\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
