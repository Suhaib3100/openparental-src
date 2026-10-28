package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.u;
import fg.m;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentVectorMutableIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "builder", "", "index", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;I)V", "Lkotlin/k2;", "l", "()V", "m", "i", "j", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "f", "I", "expectedModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "g", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "trieIterator", "h", "lastIteratedIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<T> extends a<T> implements ListIterator<T>, md.f {

    /* renamed from: i, reason: collision with root package name */
    public static final int f16205i = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f<T> builder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private k<? extends T> trieIterator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    public h(@fg.l f<T> fVar, int i4) {
        super(i4, fVar.getSize());
        this.builder = fVar;
        this.expectedModCount = fVar.i();
        this.lastIteratedIndex = -1;
        m();
    }

    private final void i() {
        if (this.expectedModCount != this.builder.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void l() {
        h(this.builder.getSize());
        this.expectedModCount = this.builder.i();
        this.lastIteratedIndex = -1;
        m();
    }

    private final void m() {
        Object[] root = this.builder.getRoot();
        if (root == null) {
            this.trieIterator = null;
            return;
        }
        int d5 = l.d(this.builder.getSize());
        int index = getIndex();
        if (index > d5) {
            index = d5;
        }
        int rootShift = (this.builder.getRootShift() / 5) + 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            this.trieIterator = new k<>(root, index, d5, rootShift);
        } else {
            l0.m(kVar);
            kVar.m(root, index, d5, rootShift);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void add(T element) {
        i();
        this.builder.add(getIndex(), element);
        f(getIndex() + 1);
        l();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        i();
        b();
        this.lastIteratedIndex = getIndex();
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] tail = this.builder.getTail();
            int index = getIndex();
            f(index + 1);
            return (T) tail[index];
        }
        if (kVar.hasNext()) {
            f(getIndex() + 1);
            return kVar.next();
        }
        Object[] tail2 = this.builder.getTail();
        int index2 = getIndex();
        f(index2 + 1);
        return (T) tail2[index2 - kVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        i();
        c();
        this.lastIteratedIndex = getIndex() - 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] tail = this.builder.getTail();
            f(getIndex() - 1);
            return (T) tail[getIndex()];
        }
        if (getIndex() <= kVar.getSize()) {
            f(getIndex() - 1);
            return kVar.previous();
        }
        Object[] tail2 = this.builder.getTail();
        f(getIndex() - 1);
        return (T) tail2[getIndex() - kVar.getSize()];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        i();
        j();
        this.builder.c(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            f(this.lastIteratedIndex);
        }
        l();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void set(T element) {
        i();
        j();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.i();
        m();
    }
}
