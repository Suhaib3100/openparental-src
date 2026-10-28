package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.internal.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: AbstractPersistentList.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001a2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Lkotlin/collections/c;", "<init>", "()V", "", "fromIndex", "toIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "element", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "removeAll", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 2)
@r1({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class b<E> extends kotlin.collections.c<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16180d = 0;

    /* compiled from: AbstractPersistentList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<E, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<E> f16181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f16181b = collection;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e4) {
            return Boolean.valueOf(this.f16181b.contains(e4));
        }
    }

    /* compiled from: AbstractPersistentList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b$b, reason: collision with other inner class name */
    static final class C0313b extends n0 implements ld.l<E, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<E> f16182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0313b(Collection<? extends E> collection) {
            super(1);
            this.f16182b = collection;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e4) {
            return Boolean.valueOf(!this.f16182b.contains(e4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
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

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.l
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.f remove(Object obj) {
        return remove((b<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@fg.l Collection<? extends E> elements) {
        g.a<E> g4 = g();
        g4.addAll(elements);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> clear() {
        return l.b();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> remove(E element) {
        int indexOf = indexOf(element);
        return indexOf != -1 ? B0(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> removeAll(@fg.l Collection<? extends E> elements) {
        return n((ld.l) new a(elements));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> retainAll(@fg.l Collection<? extends E> elements) {
        return n((ld.l) new C0313b(elements));
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(int index, @fg.l Collection<? extends E> c5) {
        g.a<E> g4 = g();
        g4.addAll(index, c5);
        return g4.a();
    }
}
