package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR!\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u001ej\b\u0012\u0004\u0012\u00028\u0000`\u001f0\u001d8\u0002X\u0082\u0004¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/z;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "Lkotlin/k2;", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "h", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "g", "(Lld/l;)Ljava/util/List;", "d", "()Z", "e", "isEmpty", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class z<E> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80841a = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, ProtectedSandApp.s("蠞\u0001"));

    @fg.m
    @kd.x
    private volatile Object _cur;

    public z(boolean z4) {
        this._cur = new a0(8, z4);
    }

    private final void f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean a(@fg.l E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80841a;
        while (true) {
            a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
            int a5 = a0Var.a(element);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                androidx.concurrent.futures.c.a(f80841a, this, a0Var, a0Var.m());
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80841a;
        while (true) {
            a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
            if (a0Var.d()) {
                return;
            } else {
                androidx.concurrent.futures.c.a(f80841a, this, a0Var, a0Var.m());
            }
        }
    }

    public final int c() {
        return ((a0) f80841a.get(this)).f();
    }

    public final boolean d() {
        return ((a0) f80841a.get(this)).g();
    }

    public final boolean e() {
        return ((a0) f80841a.get(this)).h();
    }

    @fg.l
    public final <R> List<R> g(@fg.l ld.l<? super E, ? extends R> transform) {
        return ((a0) f80841a.get(this)).k(transform);
    }

    @fg.m
    public final E h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80841a;
        while (true) {
            a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
            E e4 = (E) a0Var.n();
            if (e4 != a0.f80740t) {
                return e4;
            }
            androidx.concurrent.futures.c.a(f80841a, this, a0Var, a0Var.m());
        }
    }
}
