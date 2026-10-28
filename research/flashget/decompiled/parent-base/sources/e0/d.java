package e0;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentOrderedSetIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Le0/d;", "E", "", "", "nextElement", "", "Le0/a;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "Lkotlin/k2;", "b", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/lang/Object;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "", "I", "()I", "e", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class d<E> implements Iterator<E>, md.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f73750e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private Object nextElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<E, a> map;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int index;

    public d(@m Object obj, @l Map<E, a> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @l
    public final Map<E, a> d() {
        return this.map;
    }

    public final void e(int i4) {
        this.index = i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e4 = (E) this.nextElement;
        this.index++;
        a aVar = this.map.get(e4);
        if (aVar != null) {
            this.nextElement = aVar.getNext();
            return e4;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e4 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
