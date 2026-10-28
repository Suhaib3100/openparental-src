package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\rJ$\u0010\u0015\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\u00020\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R0\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u0006/"}, d2 = {"Landroidx/compose/runtime/snapshots/m0;", "K", "V", "", "Landroidx/compose/runtime/snapshots/d0;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/d0;Ljava/util/Iterator;)V", "Lkotlin/k2;", "remove", "()V", "", "hasNext", "()Z", "d", "T", "Lkotlin/Function0;", "block", "l", "(Lld/a;)Ljava/lang/Object;", "b", "Landroidx/compose/runtime/snapshots/d0;", "h", "()Landroidx/compose/runtime/snapshots/d0;", "c", "Ljava/util/Iterator;", "f", "()Ljava/util/Iterator;", "", "I", "i", "()I", "o", "(I)V", "modification", "e", "Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry;", "m", "(Ljava/util/Map$Entry;)V", "current", "j", "p", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
/* loaded from: classes.dex */
abstract class m0<K, V> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterator<Map.Entry<K, V>> iterator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Map.Entry<? extends K, ? extends V> current;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@fg.l d0<K, V> d0Var, @fg.l Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = d0Var;
        this.iterator = it;
        this.modification = d0Var.i();
        d();
    }

    protected final void d() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    @fg.m
    protected final Map.Entry<K, V> e() {
        return this.current;
    }

    @fg.l
    public final Iterator<Map.Entry<K, V>> f() {
        return this.iterator;
    }

    @fg.l
    public final d0<K, V> h() {
        return this.map;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    /* renamed from: i, reason: from getter */
    protected final int getModification() {
        return this.modification;
    }

    @fg.m
    protected final Map.Entry<K, V> j() {
        return this.next;
    }

    protected final <T> T l(@fg.l ld.a<? extends T> block) {
        if (this.map.i() != this.modification) {
            throw new ConcurrentModificationException();
        }
        T invoke = block.invoke();
        this.modification = this.map.i();
        return invoke;
    }

    protected final void m(@fg.m Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final void o(int i4) {
        this.modification = i4;
    }

    protected final void p(@fg.m Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }

    public final void remove() {
        if (this.map.i() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.map.remove(entry.getKey());
        this.current = null;
        k2 k2Var = k2.f75408a;
        this.modification = this.map.i();
    }
}
