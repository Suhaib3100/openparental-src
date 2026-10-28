package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u1;

/* compiled from: PersistentHashSetMutableIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/d;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/c;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)V", "", "hashCode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "element", "pathIndex", "Lkotlin/k2;", "o", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;Ljava/lang/Object;I)V", "", "m", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;)Z", "l", "()V", "j", "next", "()Ljava/lang/Object;", "remove", "f", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "g", "Ljava/lang/Object;", "lastIteratedElement", "h", "Z", "nextWasInvoked", "i", "I", "expectedModCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<E> extends c<E> implements Iterator<E>, md.d {

    /* renamed from: j, reason: collision with root package name */
    public static final int f16310j = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final b<E> builder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private E lastIteratedElement;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    public d(@l b<E> bVar) {
        super(bVar.h());
        this.builder = bVar;
        this.expectedModCount = bVar.getModCount();
    }

    private final void j() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final boolean m(e<?> node) {
        return node.getBitmap() == 0;
    }

    private final void o(int hashCode, e<?> node, E element, int pathIndex) {
        if (m(node)) {
            e().get(pathIndex).h(node.getBuffer(), kotlin.collections.l.If(node.getBuffer(), element));
            i(pathIndex);
            return;
        }
        int q4 = node.q(1 << g.f(hashCode, pathIndex * 5));
        e().get(pathIndex).h(node.getBuffer(), q4);
        Object obj = node.getBuffer()[q4];
        if (obj instanceof e) {
            o(hashCode, (e) obj, element, pathIndex + 1);
        } else {
            i(pathIndex);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public E next() {
        j();
        E e4 = (E) super.next();
        this.lastIteratedElement = e4;
        this.nextWasInvoked = true;
        return e4;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public void remove() {
        l();
        if (getHasNext()) {
            E b5 = b();
            u1.a(this.builder).remove(this.lastIteratedElement);
            o(b5 != null ? b5.hashCode() : 0, this.builder.h(), b5, 0);
        } else {
            u1.a(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
