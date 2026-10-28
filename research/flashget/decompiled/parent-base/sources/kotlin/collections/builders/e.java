package kotlin.collections.builders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.l0;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ)\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J)\u0010\u001d\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J)\u0010\u001e\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$¨\u0006&"}, d2 = {"Lkotlin/collections/builders/e;", "K", "V", "Lkotlin/collections/builders/a;", "", "Lkotlin/collections/builders/d;", "backing", "<init>", "(Lkotlin/collections/builders/d;)V", "", "isEmpty", "()Z", "", "element", "f", "(Ljava/util/Map$Entry;)Z", "Lkotlin/k2;", "clear", "()V", "i", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "h", "", "iterator", "()Ljava/util/Iterator;", "containsAll", "removeAll", "retainAll", "b", "Lkotlin/collections/builders/d;", "j", "()Lkotlin/collections/builders/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d<K, V> backing;

    public e(@l d<K, V> dVar) {
        l0.p(dVar, ProtectedSandApp.s("惲\u0001"));
        this.backing = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends Map.Entry<K, V>> elements) {
        l0.p(elements, ProtectedSandApp.s("想\u0001"));
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.h
    public int b() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("想\u0001"));
        return this.backing.r(elements);
    }

    @Override // kotlin.collections.builders.a
    public boolean f(@l Map.Entry<? extends K, ? extends V> element) {
        l0.p(element, ProtectedSandApp.s("惴\u0001"));
        return this.backing.t(element);
    }

    @Override // kotlin.collections.builders.a
    public boolean h(@l Map.Entry element) {
        l0.p(element, ProtectedSandApp.s("惴\u0001"));
        return this.backing.Q(element);
    }

    @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(@l Map.Entry<K, V> element) {
        l0.p(element, ProtectedSandApp.s("惴\u0001"));
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<Map.Entry<K, V>> iterator() {
        d<K, V> dVar = this.backing;
        dVar.getClass();
        return new d.b(dVar);
    }

    @l
    public final d<K, V> j() {
        return this.backing;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("想\u0001"));
        this.backing.p();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("想\u0001"));
        this.backing.p();
        return super.retainAll(elements);
    }
}
