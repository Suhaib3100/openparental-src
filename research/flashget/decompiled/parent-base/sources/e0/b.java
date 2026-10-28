package e0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00013B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Le0/b;", "E", "Lkotlin/collections/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "firstElement", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Le0/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "c", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "d", "i", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "h", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "b", "()I", "size", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class b<E> extends i<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    public static final int f73740g = 8;

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final b f73741h;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final Object firstElement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Object lastElement;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> hashMap;

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le0/b$a;", "", "<init>", "()V", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Le0/b;", "", "EMPTY", "Le0/b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> a() {
            return b.f73741h;
        }

        public Companion(w wVar) {
        }
    }

    static {
        f0.c cVar = f0.c.f73848a;
        f73741h = new b(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a());
    }

    public b(@m Object obj, @m Object obj2, @l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> dVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ f add(Object obj) {
        return add((b<E>) obj);
    }

    @Override // kotlin.collections.a
    /* renamed from: b */
    public int getSize() {
        return this.hashMap.getSize();
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @m
    /* renamed from: f, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public f.a g() {
        return new c(this);
    }

    @l
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> h() {
        return this.hashMap;
    }

    @m
    /* renamed from: i, reason: from getter */
    public final Object getLastElement() {
        return this.lastElement;
    }

    @Override // kotlin.collections.i, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return new d(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ f remove(Object obj) {
        return remove((b<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.hashMap.put(element, new a()));
        }
        Object obj = this.lastElement;
        Object obj2 = this.hashMap.get(obj);
        l0.m(obj2);
        return new b(this.firstElement, element, this.hashMap.put(obj, ((a) obj2).e(element)).put(element, new a(obj)));
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
        return f73741h;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public i.a<E> g() {
        return new c(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> n(@l ld.l<? super E, Boolean> predicate) {
        i.a<E> g4 = g();
        kotlin.collections.w.G0(g4, predicate);
        return g4.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.i<E> remove(E element) {
        a aVar = this.hashMap.get(element);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d remove = this.hashMap.remove(element);
        if (aVar.b()) {
            V v4 = remove.get(aVar.getPrevious());
            l0.m(v4);
            remove = remove.put(aVar.getPrevious(), ((a) v4).e(aVar.getNext()));
        }
        if (aVar.a()) {
            V v5 = remove.get(aVar.getNext());
            l0.m(v5);
            remove = remove.put(aVar.getNext(), ((a) v5).f(aVar.getPrevious()));
        }
        return new b(!aVar.b() ? aVar.getNext() : this.firstElement, !aVar.a() ? aVar.getPrevious() : this.lastElement, remove);
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
