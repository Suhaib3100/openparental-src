package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentHashSetBuilder.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R0\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u00100\u001a\u00020+2\u0006\u0010 \u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R*\u00104\u001a\u00020+2\u0006\u00101\u001a\u00020+8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b\u001d\u0010/\"\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "E", "Lkotlin/collections/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "set", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;)V", "c", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "retainAll", "removeAll", "containsAll", "remove", "Lkotlin/k2;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "Lf0/f;", "<set-?>", "Lf0/f;", "i", "()Lf0/f;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "h", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "", "e", "I", "f", "()I", "modCount", "value", "j", "(I)V", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<E> extends h<E> implements i.a<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16300g = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private a<E> set;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private f0.f ownership = new f0.f();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private e<E> node;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int size;

    public b(@l a<E> aVar) {
        this.set = aVar;
        this.node = this.set.f();
        this.size = this.set.getSize();
    }

    @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        int size = getSize();
        this.node = this.node.u(element != null ? element.hashCode() : 0, element, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends E> elements) {
        a<E> aVar = elements instanceof a ? (a) elements : null;
        if (aVar == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVar = bVar != null ? bVar.a() : null;
        }
        if (aVar == null) {
            return super.addAll(elements);
        }
        f0.b bVar2 = new f0.b(0, 1, null);
        int size = getSize();
        e<E> v4 = this.node.v(aVar.f(), 0, bVar2, this);
        int size2 = (elements.size() + size) - bVar2.d();
        if (size != size2) {
            this.node = v4;
            j(size2);
        }
        return size != getSize();
    }

    @Override // kotlin.collections.h
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i.a, androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a<E> a() {
        a<E> aVar;
        if (this.node == this.set.f()) {
            aVar = this.set;
        } else {
            this.ownership = new f0.f();
            aVar = new a<>(this.node, getSize());
        }
        this.set = aVar;
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        e.INSTANCE.getClass();
        e<E> eVar = e.f16317f;
        l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eVar;
        j(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.node.i(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@l Collection<? extends Object> elements) {
        return elements instanceof a ? this.node.j(((a) elements).f(), 0) : elements instanceof b ? this.node.j(((b) elements).node, 0) : super.containsAll(elements);
    }

    /* renamed from: f, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    @l
    public final e<E> h() {
        return this.node;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final f0.f getOwnership() {
        return this.ownership;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<E> iterator() {
        return new d(this);
    }

    public void j(int i4) {
        this.size = i4;
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int size = getSize();
        this.node = this.node.E(element != null ? element.hashCode() : 0, element, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<? extends Object> elements) {
        a<E> aVar = elements instanceof a ? (a) elements : null;
        if (aVar == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVar = bVar != null ? bVar.a() : null;
        }
        if (aVar == null) {
            return super.removeAll(elements);
        }
        f0.b bVar2 = new f0.b(0, 1, null);
        int size = getSize();
        Object F = this.node.F(aVar.f(), 0, bVar2, this);
        int d5 = size - bVar2.d();
        if (d5 == 0) {
            clear();
        } else if (d5 != size) {
            l0.n(F, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (e) F;
            j(d5);
        }
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<? extends Object> elements) {
        a<E> aVar = elements instanceof a ? (a) elements : null;
        if (aVar == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVar = bVar != null ? bVar.a() : null;
        }
        if (aVar == null) {
            return super.retainAll(elements);
        }
        f0.b bVar2 = new f0.b(0, 1, null);
        int size = getSize();
        Object H = this.node.H(aVar.f(), 0, bVar2, this);
        int d5 = bVar2.d();
        if (d5 == 0) {
            clear();
        } else if (d5 != size) {
            l0.n(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (e) H;
            j(d5);
        }
        return size != getSize();
    }
}
