package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlin/collections/j;", "T", "", "", "values", "", "isVarargs", "<init>", "([Ljava/lang/Object;Z)V", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "toArray", "()[Ljava/lang/Object;", "b", "[Ljava/lang/Object;", "c", "Z", "f", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,522:1\n1726#2,3:523\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:523,3\n*E\n"})
/* loaded from: classes7.dex */
final class j<T> implements Collection<T>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T[] values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVarargs;

    public j(@fg.l T[] tArr, boolean z4) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憈\u0001"));
        this.values = tArr;
        this.isVarargs = z4;
    }

    @Override // java.util.Collection
    public boolean add(T t4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    public int b() {
        return this.values.length;
    }

    @fg.l
    public final T[] c() {
        return this.values;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return r.s8(this.values, element);
    }

    @Override // java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("憊\u0001"));
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!r.s8(this.values, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsVarargs() {
        return this.isVarargs;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.values.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<T> iterator() {
        return kotlin.jvm.internal.i.a(this.values);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("憉\u0001"));
    }

    @Override // java.util.Collection
    public final int size() {
        return this.values.length;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憋\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    @Override // java.util.Collection
    @fg.l
    public final Object[] toArray() {
        return x.h(this.values, this.isVarargs);
    }
}
