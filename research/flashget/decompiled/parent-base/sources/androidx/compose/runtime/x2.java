package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.z0;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/x2;", "", "<init>", "()V", "lock", "Lkotlin/k2;", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "Lkotlin/coroutines/d;", "d", "()Lkotlin/coroutines/d;", "a", "Ljava/lang/Object;", "pendingFrameContinuation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1575\n314#3,9:1566\n323#3,2:1576\n1#4:1578\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1510#1:1565\n1517#1:1575\n1516#1:1566,9\n1516#1:1576,2\n*E\n"})
/* loaded from: classes.dex */
final class x2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object pendingFrameContinuation;

    @fg.m
    public final Object c(@fg.l Object obj, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object obj2;
        Object obj3;
        kotlinx.coroutines.q qVar;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = m3.f16847b;
            if (obj6 == obj2) {
                obj5 = m3.f16848c;
                this.pendingFrameContinuation = obj5;
                return kotlin.k2.f75408a;
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            kotlinx.coroutines.q qVar2 = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar2.e0();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = m3.f16847b;
                    if (obj7 == obj3) {
                        obj4 = m3.f16848c;
                        this.pendingFrameContinuation = obj4;
                        qVar = qVar2;
                    } else {
                        this.pendingFrameContinuation = qVar2;
                        qVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (qVar != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                qVar.resumeWith(k2Var);
            }
            Object y4 = qVar2.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4 == aVar ? y4 : k2Var;
        }
    }

    @fg.m
    public final kotlin.coroutines.d<kotlin.k2> d() {
        Object obj;
        Object obj2;
        boolean g4;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof kotlin.coroutines.d) {
            obj4 = m3.f16848c;
            this.pendingFrameContinuation = obj4;
            return (kotlin.coroutines.d) obj5;
        }
        obj = m3.f16847b;
        if (kotlin.jvm.internal.l0.g(obj5, obj)) {
            g4 = true;
        } else {
            obj2 = m3.f16848c;
            g4 = kotlin.jvm.internal.l0.g(obj5, obj2);
        }
        if (!g4) {
            if (obj5 != null) {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
            }
            obj3 = m3.f16847b;
            this.pendingFrameContinuation = obj3;
        }
        return null;
    }

    public final void e() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = m3.f16848c;
        if (obj2 != obj) {
            throw new IllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
