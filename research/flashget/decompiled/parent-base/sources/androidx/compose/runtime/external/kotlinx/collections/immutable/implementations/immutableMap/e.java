package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentIterators.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010#\u0012\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "path", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;)V", "", "pathIndex", "i", "(I)I", "Lkotlin/k2;", "d", "()V", "b", "c", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "f", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "I", "h", "()I", "j", "(I)V", "pathLastIndex", "Z", "e", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, md.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16236e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v<K, V, T>[] path;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext = true;

    public e(@fg.l u<K, V> uVar, @fg.l v<K, V, T>[] vVarArr) {
        this.path = vVarArr;
        vVarArr[0].m(uVar.getBuffer(), uVar.p() * 2, 0);
        this.pathLastIndex = 0;
        d();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.path[this.pathLastIndex].f()) {
            return;
        }
        for (int i4 = this.pathLastIndex; -1 < i4; i4--) {
            int i5 = i(i4);
            if (i5 == -1 && this.path[i4].h()) {
                this.path[i4].j();
                i5 = i(i4);
            }
            if (i5 != -1) {
                this.pathLastIndex = i5;
                return;
            }
            if (i4 > 0) {
                this.path[i4 - 1].j();
            }
            v<K, V, T> vVar = this.path[i4];
            u.INSTANCE.getClass();
            vVar.m(u.f16274g.getBuffer(), 0, 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void e() {
    }

    private final int i(int pathIndex) {
        if (this.path[pathIndex].f()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].h()) {
            return -1;
        }
        u<? extends K, ? extends V> c5 = this.path[pathIndex].c();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].m(c5.getBuffer(), c5.getBuffer().length, 0);
        } else {
            this.path[pathIndex + 1].m(c5.getBuffer(), c5.p() * 2, 0);
        }
        return i(pathIndex + 1);
    }

    protected final K c() {
        b();
        return this.path[this.pathLastIndex].b();
    }

    @fg.l
    protected final v<K, V, T>[] f() {
        return this.path;
    }

    /* renamed from: h, reason: from getter */
    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    protected final void j(int i4) {
        this.pathLastIndex = i4;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.path[this.pathLastIndex].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
