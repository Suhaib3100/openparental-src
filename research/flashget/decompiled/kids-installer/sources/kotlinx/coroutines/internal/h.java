package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.internal.h;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001b\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/h;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lq3/a;)Lkotlinx/coroutines/internal/h;", "value", "", "m", "(Lkotlinx/coroutines/internal/h;)Z", "Lkotlin/m2;", "b", "()V", "j", "()Z", "l", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "()Lkotlinx/coroutines/internal/h;", "leftmostAliveNode", "h", "rightmostAliveNode", "d", "next", "i", "isTail", "f", "prev", "g", "removed", "<init>", "(Lkotlinx/coroutines/internal/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class h<N extends h<N>> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28711a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, ProtectedSandApp.s("巗"));

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28712b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, ProtectedSandApp.s("巘"));

    @d5.d
    private volatile /* synthetic */ Object _next = null;

    @d5.d
    private volatile /* synthetic */ Object _prev;

    public h(@d5.e N n5) {
        this._prev = n5;
    }

    public static final Object a(h hVar) {
        return hVar._next;
    }

    private final N c() {
        N f6 = f();
        while (f6 != null && f6.g()) {
            f6 = (N) f6._prev;
        }
        return f6;
    }

    /* renamed from: e, reason: from getter */
    private final Object get_next() {
        return this._next;
    }

    private final N h() {
        N d6 = d();
        kotlin.jvm.internal.l0.m(d6);
        while (d6.g()) {
            d6 = (N) d6.d();
            kotlin.jvm.internal.l0.m(d6);
        }
        return d6;
    }

    public final void b() {
        f28712b.lazySet(this, null);
    }

    @d5.e
    public final N d() {
        r0 r0Var;
        Object obj = this._next;
        r0Var = g.f28708b;
        if (obj == r0Var) {
            return null;
        }
        return (N) obj;
    }

    @d5.e
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        r0 r0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28711a;
        r0Var = g.f28708b;
        return androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, null, r0Var);
    }

    @d5.e
    public final N k(@d5.d q3.a onClosedAction) {
        r0 r0Var;
        Object obj = this._next;
        r0Var = g.f28708b;
        if (obj != r0Var) {
            return (N) obj;
        }
        onClosedAction.n();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        while (true) {
            N c6 = c();
            N h5 = h();
            h5._prev = c6;
            if (c6 != null) {
                c6._next = h5;
            }
            if (!h5.g() && (c6 == null || !c6.g())) {
                return;
            }
        }
    }

    public final boolean m(@d5.d N value) {
        return androidx.concurrent.futures.d.a(f28711a, this, null, value);
    }
}
