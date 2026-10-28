package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/i1;", "T", "Lkotlinx/coroutines/internal/n0;", "", "N1", "()Z", "M1", "", "state", "Lkotlin/m2;", "s0", "(Ljava/lang/Object;)V", "F1", "L1", "()Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class i1<T> extends kotlinx.coroutines.internal.n0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28656r = AtomicIntegerFieldUpdater.newUpdater(i1.class, ProtectedSandApp.s("鄯"));

    @d5.d
    private volatile /* synthetic */ int _decision;

    public i1(@d5.d CoroutineContext coroutineContext, @d5.d Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    private final boolean M1() {
        do {
            int i5 = this._decision;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("鄰").toString());
            }
        } while (!f28656r.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean N1() {
        do {
            int i5 = this._decision;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("鄱").toString());
            }
        } while (!f28656r.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.a
    protected void F1(@d5.e Object state) {
        Continuation e6;
        if (M1()) {
            return;
        }
        e6 = kotlin.coroutines.intrinsics.c.e(this.uCont);
        kotlinx.coroutines.internal.m.g(e6, k0.a(state, this.uCont), null, 2, null);
    }

    @d5.e
    public final Object L1() {
        if (N1()) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object o5 = v2.o(T0());
        if (o5 instanceof f0) {
            throw ((f0) o5).cause;
        }
        return o5;
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.u2
    protected void s0(@d5.e Object state) {
        F1(state);
    }
}
