package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.w;

/* compiled from: PersistentHashSetIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b \u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/c;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;)V", "", "pathIndex", "h", "(I)I", "Lkotlin/k2;", "c", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "b", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/f;", "Ljava/util/List;", "e", "()Ljava/util/List;", "path", "I", "f", "()I", "i", "(I)V", "pathLastIndex", "d", "Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class c<E> implements Iterator<E>, md.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16306e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<f<E>> path;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    public c(@l e<E> eVar) {
        List<f<E>> S = w.S(new f());
        this.path = S;
        this.hasNext = true;
        f.i(S.get(0), eVar.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        c();
    }

    private final void c() {
        if (this.path.get(this.pathLastIndex).d()) {
            return;
        }
        for (int i4 = this.pathLastIndex; -1 < i4; i4--) {
            int h4 = h(i4);
            if (h4 == -1 && this.path.get(i4).c()) {
                this.path.get(i4).f();
                h4 = h(i4);
            }
            if (h4 != -1) {
                this.pathLastIndex = h4;
                return;
            }
            if (i4 > 0) {
                this.path.get(i4 - 1).f();
            }
            f<E> fVar = this.path.get(i4);
            e.INSTANCE.getClass();
            fVar.h(e.f16317f.getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void d() {
    }

    private final int h(int pathIndex) {
        if (this.path.get(pathIndex).d()) {
            return pathIndex;
        }
        if (!this.path.get(pathIndex).e()) {
            return -1;
        }
        e<? extends E> b5 = this.path.get(pathIndex).b();
        int i4 = pathIndex + 1;
        if (i4 == this.path.size()) {
            this.path.add(new f<>());
        }
        f.i(this.path.get(i4), b5.getBuffer(), 0, 2, null);
        return h(i4);
    }

    protected final E b() {
        hasNext();
        return this.path.get(this.pathLastIndex).a();
    }

    @l
    protected final List<f<E>> e() {
        return this.path;
    }

    /* renamed from: f, reason: from getter */
    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    protected final void i(int i4) {
        this.pathLastIndex = i4;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E g4 = this.path.get(this.pathLastIndex).g();
        c();
        return g4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
