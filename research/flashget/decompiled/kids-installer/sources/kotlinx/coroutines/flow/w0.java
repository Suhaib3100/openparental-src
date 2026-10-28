package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/u0;", "flow", "", "c", "(Lkotlinx/coroutines/flow/u0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "e", "(Lkotlinx/coroutines/flow/u0;)[Lkotlin/coroutines/d;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class w0 extends kotlinx.coroutines.flow.internal.c<u0<?>> {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28531a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, ProtectedSandApp.s("嶫"));

    @d5.d
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.c
    public Continuation[] b(u0<?> u0Var) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f27995a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@d5.d u0<?> flow) {
        kotlinx.coroutines.internal.r0 r0Var;
        if (this._state != null) {
            return false;
        }
        r0Var = v0.f28499a;
        this._state = r0Var;
        return true;
    }

    @d5.e
    public final Object d(@d5.d Continuation<? super m2> continuation) {
        Continuation e6;
        kotlinx.coroutines.internal.r0 r0Var;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.X();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28531a;
        r0Var = v0.f28499a;
        if (!androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, r0Var, sVar)) {
            Result.a aVar = Result.f27242p;
            sVar.s(m2.f23662a);
        }
        Object A = sVar.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : m2.f23662a;
    }

    @d5.d
    public Continuation<m2>[] e(@d5.d u0<?> flow) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f27995a;
    }

    public final void f() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        kotlinx.coroutines.internal.r0 r0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            r0Var = v0.f28500b;
            if (obj == r0Var) {
                return;
            }
            r0Var2 = v0.f28499a;
            if (obj == r0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28531a;
                r0Var3 = v0.f28500b;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj, r0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28531a;
                r0Var4 = v0.f28499a;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater2, this, obj, r0Var4)) {
                    Result.a aVar = Result.f27242p;
                    ((kotlinx.coroutines.s) obj).s(m2.f23662a);
                    return;
                }
            }
        }
    }

    public final boolean g() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28531a;
        r0Var = v0.f28499a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, r0Var);
        kotlin.jvm.internal.l0.m(andSet);
        r0Var2 = v0.f28500b;
        return andSet == r0Var2;
    }
}
