package e0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentOrderedSetBuilder.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR&\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010*¨\u0006,"}, d2 = {"Le0/c;", "E", "Lkotlin/collections/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "Le0/b;", "set", "<init>", "(Le0/b;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "Lkotlin/k2;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "b", "Le0/b;", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "firstElement", "d", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Le0/a;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "f", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "hashMapBuilder", "", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<E> extends h<E> implements i.a<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f73745f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private b<E> set;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Object firstElement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Object lastElement;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final f<E, a> hashMapBuilder;

    public c(@l b<E> bVar) {
        this.set = bVar;
        this.firstElement = bVar.getFirstElement();
        this.lastElement = this.set.getLastElement();
        this.hashMapBuilder = this.set.h().g();
    }

    @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        if (this.hashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.lastElement = element;
            this.hashMapBuilder.put(element, new a());
            return true;
        }
        a aVar = this.hashMapBuilder.get(this.lastElement);
        l0.m(aVar);
        this.hashMapBuilder.put(this.lastElement, aVar.e(element));
        this.hashMapBuilder.put(element, new a(this.lastElement));
        this.lastElement = element;
        return true;
    }

    @Override // kotlin.collections.h
    /* renamed from: b */
    public int getSize() {
        return this.hashMapBuilder.getSize();
    }

    @m
    /* renamed from: c, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        f0.c cVar = f0.c.f73848a;
        this.firstElement = cVar;
        this.lastElement = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    @l
    public final f<E, a> f() {
        return this.hashMapBuilder;
    }

    public final void h(@m Object obj) {
        this.firstElement = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<E> iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        a remove = this.hashMapBuilder.remove(element);
        if (remove == null) {
            return false;
        }
        if (remove.b()) {
            a aVar = this.hashMapBuilder.get(remove.getPrevious());
            l0.m(aVar);
            this.hashMapBuilder.put(remove.getPrevious(), aVar.e(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (!remove.a()) {
            this.lastElement = remove.getPrevious();
            return true;
        }
        a aVar2 = this.hashMapBuilder.get(remove.getNext());
        l0.m(aVar2);
        this.hashMapBuilder.put(remove.getNext(), aVar2.f(remove.getPrevious()));
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @l
    public i<E> a() {
        b<E> bVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> a22 = this.hashMapBuilder.a2();
        if (a22 == this.set.h()) {
            this.set.getFirstElement();
            this.set.getLastElement();
            bVar = this.set;
        } else {
            bVar = new b<>(this.firstElement, this.lastElement, a22);
        }
        this.set = bVar;
        return bVar;
    }
}
