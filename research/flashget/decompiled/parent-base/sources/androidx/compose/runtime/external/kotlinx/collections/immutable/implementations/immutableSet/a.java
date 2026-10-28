package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: PersistentHashSet.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001.B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "E", "Lkotlin/collections/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;I)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "retainAll", "containsAll", "(Ljava/util/Collection;)Z", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "f", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "d", "I", "b", "()I", "e", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/* loaded from: classes.dex */
public final class a<E> extends i<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f16296f = 8;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final a f16297g;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final e<E> node;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* compiled from: PersistentHashSet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a$a;", "", "<init>", "()V", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> a() {
            return a.f16297g;
        }

        public Companion(w wVar) {
        }
    }

    static {
        e.INSTANCE.getClass();
        f16297g = new a(e.f16317f, 0);
    }

    public a(@l e<E> eVar, int i4) {
        this.node = eVar;
        this.size = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.f add(Object obj) {
        return add((a<E>) obj);
    }

    @Override // kotlin.collections.a
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.node.i(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean containsAll(@l Collection<? extends Object> elements) {
        return elements instanceof a ? this.node.j(((a) elements).node, 0) : elements instanceof b ? this.node.j(((b) elements).h(), 0) : super.containsAll(elements);
    }

    @l
    public final e<E> f() {
        return this.node;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public f.a g() {
        return new b(this);
    }

    @Override // kotlin.collections.i, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return new c(this.node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.f remove(Object obj) {
        return remove((a<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> add(E element) {
        e<E> b5 = this.node.b(element != null ? element.hashCode() : 0, element, 0);
        return this.node == b5 ? this : new a(b5, getSize() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> addAll(@l Collection<? extends E> elements) {
        i.a<E> g4 = g();
        g4.addAll(elements);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> clear() {
        INSTANCE.getClass();
        return f16297g;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public i.a<E> g() {
        return new b(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> n(@l ld.l<? super E, Boolean> predicate) {
        i.a<E> g4 = g();
        kotlin.collections.w.G0(g4, predicate);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> remove(E element) {
        e<E> K = this.node.K(element != null ? element.hashCode() : 0, element, 0);
        return this.node == K ? this : new a(K, getSize() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> removeAll(@l Collection<? extends E> elements) {
        i.a<E> g4 = g();
        g4.removeAll(elements);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> retainAll(@l Collection<? extends E> elements) {
        i.a<E> g4 = g();
        g4.retainAll(elements);
        return g4.a();
    }
}
