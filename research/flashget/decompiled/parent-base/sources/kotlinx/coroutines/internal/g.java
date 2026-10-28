package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.g;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010#\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0013\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020$8\u0002X\u0082\u0004R\u0013\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/g;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/g;)V", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lld/a;)Lkotlinx/coroutines/internal/g;", "value", "", "m", "(Lkotlinx/coroutines/internal/g;)Z", "Lkotlin/k2;", "b", "()V", "j", "()Z", "l", "f", "()Ljava/lang/Object;", "nextOrClosed", "c", "()Lkotlinx/coroutines/internal/g;", "aliveSegmentLeft", "d", "aliveSegmentRight", "e", "next", "i", "isTail", "g", "h", "isRemoved", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class g<N extends g<N>> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80772b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, ProtectedSandApp.s("虞\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80773c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, ProtectedSandApp.s("號\u0001"));

    @fg.m
    @kd.x
    private volatile Object _next;

    @fg.m
    @kd.x
    private volatile Object _prev;

    public g(@fg.m N n4) {
        this._prev = n4;
    }

    public static final Object a(g gVar) {
        gVar.getClass();
        return f80772b.get(gVar);
    }

    private final N c() {
        N g4 = g();
        while (g4 != null && g4.h()) {
            g4 = (N) f80773c.get(g4);
        }
        return g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.g] */
    private final N d() {
        N e4 = e();
        kotlin.jvm.internal.l0.m(e4);
        while (e4.h()) {
            ?? e5 = e4.e();
            if (e5 == 0) {
                return e4;
            }
            e4 = e5;
        }
        return e4;
    }

    private final Object f() {
        return f80772b.get(this);
    }

    private final void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void b() {
        f80773c.lazySet(this, null);
    }

    @fg.m
    public final N e() {
        s0 s0Var;
        Object a5 = a(this);
        s0Var = f.f80766b;
        if (a5 == s0Var) {
            return null;
        }
        return (N) a5;
    }

    @fg.m
    public final N g() {
        return (N) f80773c.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        s0 s0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80772b;
        s0Var = f.f80766b;
        return androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, null, s0Var);
    }

    @fg.m
    public final N k(@fg.l ld.a onClosedAction) {
        s0 s0Var;
        Object a5 = a(this);
        s0Var = f.f80766b;
        if (a5 != s0Var) {
            return (N) a5;
        }
        onClosedAction.invoke();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            N c5 = c();
            N d5 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80773c;
            do {
                obj = atomicReferenceFieldUpdater.get(d5);
            } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, d5, obj, ((g) obj) == null ? null : c5));
            if (c5 != null) {
                f80772b.set(c5, d5);
            }
            if (!d5.h() || d5.i()) {
                if (c5 == null || !c5.h()) {
                    return;
                }
            }
        }
    }

    public final boolean m(@fg.l N value) {
        return androidx.concurrent.futures.c.a(f80772b, this, null, value);
    }
}
