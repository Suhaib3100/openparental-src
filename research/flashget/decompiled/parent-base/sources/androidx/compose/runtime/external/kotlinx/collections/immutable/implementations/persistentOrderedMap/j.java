package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.u;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.u1;

/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/j;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "", "nextKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;", "builder", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;)V", "Lkotlin/k2;", "c", "()V", "d", "b", "", "hasNext", "()Z", "i", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "remove", "Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;", "e", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;", "h", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "lastIteratedKey", "Z", "nextWasInvoked", "", "f", "I", "expectedModCount", "g", "()I", "j", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class j<K, V> implements Iterator<a<V>>, md.d {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16354h = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object nextKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d<K, V> builder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastIteratedKey = f0.c.f73848a;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int index;

    public j(@fg.m Object obj, @fg.l d<K, V> dVar) {
        this.nextKey = obj;
        this.builder = dVar;
        this.expectedModCount = dVar.h().getModCount();
    }

    private final void b() {
        if (this.builder.h().getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    @fg.l
    public final d<K, V> e() {
        return this.builder;
    }

    /* renamed from: f, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final Object getLastIteratedKey() {
        return this.lastIteratedKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.getSize();
    }

    @Override // java.util.Iterator
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        b();
        c();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        a<V> aVar = this.builder.h().get(this.nextKey);
        if (aVar == null) {
            throw new ConcurrentModificationException(i.a(new StringBuilder("Hash code of a key ("), this.nextKey, ") has changed after it was added to the persistent map."));
        }
        a<V> aVar2 = aVar;
        this.nextKey = aVar2.getNext();
        return aVar2;
    }

    public final void j(int i4) {
        this.index = i4;
    }

    public final void l(@fg.m Object obj) {
        this.lastIteratedKey = obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        d();
        u1.k(this.builder).remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.h().getModCount();
        this.index--;
    }
}
