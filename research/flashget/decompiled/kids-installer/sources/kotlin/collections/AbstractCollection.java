package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AbstractCollection.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¦\u0002J\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0015¢\u0006\u0002\u0010\u0014J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012H\u0014¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1747#2,3:51\n1726#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
/* renamed from: kotlin.collections.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class AbstractCollection<E> implements Collection<E>, r3.a {

    /* compiled from: AbstractCollection.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.a$a */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<E, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractCollection<E> f23072p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractCollection<? extends E> abstractCollection) {
            super(1);
            this.f23072p = abstractCollection;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(E e6) {
            return e6 == this.f23072p ? ProtectedSandApp.s("殄") : String.valueOf(e6);
        }
    }

    protected AbstractCollection() {
    }

    @Override // java.util.Collection
    public boolean add(E e6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝨"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝩"));
    }

    /* renamed from: b */
    public abstract int getF23147s();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝪"));
    }

    @Override // java.util.Collection
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
    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("㝫"));
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝬"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝭"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㝮"));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getF23147s();
    }

    @Override // java.util.Collection
    @d5.d
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @d5.d
    public String toString() {
        return j0.m3(this, ProtectedSandApp.s("㝰"), ProtectedSandApp.s("㝱"), ProtectedSandApp.s("㝲"), 0, null, new a(this), 24, null);
    }

    @Override // java.util.Collection
    @d5.d
    public <T> T[] toArray(@d5.d T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("㝯"));
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
