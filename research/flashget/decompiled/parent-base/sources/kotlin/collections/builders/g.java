package kotlin.collections.builders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.l0;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0012R!\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Lkotlin/collections/builders/g;", "V", "", "Lkotlin/collections/e;", "Lkotlin/collections/builders/d;", "backing", "<init>", "(Lkotlin/collections/builders/d;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlin/k2;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "b", "Lkotlin/collections/builders/d;", "c", "()Lkotlin/collections/builders/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g<V> extends kotlin.collections.e<V> implements Collection<V>, md.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d<?, V> backing;

    public g(@l d<?, V> dVar) {
        l0.p(dVar, ProtectedSandApp.s("惷\u0001"));
        this.backing = dVar;
    }

    @Override // kotlin.collections.e, java.util.AbstractCollection, java.util.Collection
    public boolean add(V element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@l Collection<? extends V> elements) {
        l0.p(elements, ProtectedSandApp.s("惸\u0001"));
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.e
    public int b() {
        return this.backing.size();
    }

    @l
    public final d<?, V> c() {
        return this.backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object element) {
        return this.backing.containsValue(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<V> iterator() {
        d<?, V> dVar = this.backing;
        dVar.getClass();
        return new d.f(dVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object element) {
        return this.backing.U(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("惸\u0001"));
        this.backing.p();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("惸\u0001"));
        this.backing.p();
        return super.retainAll(elements);
    }
}
