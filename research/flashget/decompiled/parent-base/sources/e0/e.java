package e0;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u1;

/* compiled from: PersistentOrderedSetMutableIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Le0/e;", "E", "Le0/d;", "", "Le0/c;", "builder", "<init>", "(Le0/c;)V", "Lkotlin/k2;", "h", "()V", "f", "next", "()Ljava/lang/Object;", "remove", "Le0/c;", "g", "Ljava/lang/Object;", "lastIteratedElement", "", "Z", "nextWasInvoked", "", "i", "I", "expectedModCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e<E> extends d<E> implements Iterator<E>, md.d {

    /* renamed from: j, reason: collision with root package name */
    public static final int f73754j = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final c<E> builder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private E lastIteratedElement;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    public e(@l c<E> cVar) {
        super(cVar.getFirstElement(), cVar.f());
        this.builder = cVar;
        this.expectedModCount = cVar.f().getModCount();
    }

    private final void f() {
        if (this.builder.f().getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void h() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    @Override // e0.d, java.util.Iterator
    public E next() {
        f();
        E e4 = (E) super.next();
        this.lastIteratedElement = e4;
        this.nextWasInvoked = true;
        return e4;
    }

    @Override // e0.d, java.util.Iterator
    public void remove() {
        h();
        u1.a(this.builder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.f().getModCount();
        e(getIndex() - 1);
    }
}
