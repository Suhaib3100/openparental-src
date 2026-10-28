package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/f1;", "T", "Lkotlinx/coroutines/internal/o0;", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "", "f2", "()Z", "e2", "", "state", "Lkotlin/k2;", "y0", "(Ljava/lang/Object;)V", "W1", "b2", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
/* loaded from: classes7.dex */
public final class f1<T> extends kotlinx.coroutines.internal.o0<T> {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f79752f = AtomicIntegerFieldUpdater.newUpdater(f1.class, ProtectedSandApp.s("蛏\u0001"));

    @kd.f
    @kd.x
    private volatile int _decision;

    public f1(@fg.l kotlin.coroutines.g gVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @fg.l
    public static final AtomicIntegerFieldUpdater c2() {
        return f79752f;
    }

    private final void d2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final boolean e2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f79752f;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("蛐\u0001"));
            }
        } while (!f79752f.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean f2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f79752f;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("蛑\u0001"));
            }
        } while (!f79752f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.a
    protected void W1(@fg.m Object state) {
        if (e2()) {
            return;
        }
        kotlinx.coroutines.internal.m.e(kotlin.coroutines.intrinsics.b.e(this.uCont), i0.a(state, this.uCont), null, 2, null);
    }

    @fg.m
    public final Object b2() {
        if (f2()) {
            return kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        }
        Object h4 = s2.h(i1());
        if (h4 instanceof d0) {
            throw ((d0) h4).cause;
        }
        return h4;
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.r2
    protected void y0(@fg.m Object state) {
        W1(state);
    }
}
