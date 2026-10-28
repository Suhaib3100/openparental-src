package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/u0;", "<init>", "()V", "flow", "", "d", "(Lkotlinx/coroutines/flow/u0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/flow/u0;)[Lkotlin/coroutines/d;", "h", "i", "()Z", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* loaded from: classes7.dex */
final class w0 extends kotlinx.coroutines.flow.internal.c<u0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80577a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, ProtectedSandApp.s("螥\u0001"));

    @fg.m
    @kd.x
    private volatile Object _state;

    private final void g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@fg.l u0<?> flow) {
        kotlinx.coroutines.internal.s0 s0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80577a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        s0Var = v0.f80545a;
        atomicReferenceFieldUpdater.set(this, s0Var);
        return true;
    }

    @fg.m
    public final Object e(@fg.l kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80577a;
        s0Var = v0.f80545a;
        if (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, s0Var, qVar)) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            qVar.resumeWith(k2.f75408a);
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @fg.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<k2>[] b(@fg.l u0<?> flow) {
        f80577a.set(this, null);
        return kotlinx.coroutines.flow.internal.b.f80026a;
    }

    public final void h() {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        kotlinx.coroutines.internal.s0 s0Var3;
        kotlinx.coroutines.internal.s0 s0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80577a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            s0Var = v0.f80546b;
            if (obj == s0Var) {
                return;
            }
            s0Var2 = v0.f80545a;
            if (obj == s0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80577a;
                s0Var3 = v0.f80546b;
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater2, this, obj, s0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f80577a;
                s0Var4 = v0.f80545a;
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater3, this, obj, s0Var4)) {
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    ((kotlinx.coroutines.q) obj).resumeWith(k2.f75408a);
                    return;
                }
            }
        }
    }

    public final boolean i() {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80577a;
        s0Var = v0.f80545a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, s0Var);
        kotlin.jvm.internal.l0.m(andSet);
        s0Var2 = v0.f80546b;
        return andSet == s0Var2;
    }
}
