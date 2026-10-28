package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a4\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"T", "value", "Lkotlinx/coroutines/flow/e0;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e0;", "Lkotlin/Function1;", "function", "g", "(Lkotlinx/coroutines/flow/e0;Lld/l;)Ljava/lang/Object;", "e", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/flow/e0;Lld/l;)V", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlinx/coroutines/flow/t0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/internal/s0;", "Lkotlinx/coroutines/internal/s0;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80545a = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("螚\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80546b = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("螛\u0001"));

    @fg.l
    public static final <T> e0<T> a(T t4) {
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.s.f80148a;
        }
        return new u0(t4);
    }

    @fg.l
    public static final <T> i<T> d(@fg.l t0<? extends T> t0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        return (((i4 < 0 || i4 >= 2) && i4 != -2) || iVar != kotlinx.coroutines.channels.i.DROP_OLDEST) ? k0.e(t0Var, gVar, i4, iVar) : t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@fg.l e0<T> e0Var, @fg.l ld.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) e0Var.getValue();
        } while (!e0Var.h(r02, lVar.invoke(r02)));
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@fg.l e0<T> e0Var, @fg.l ld.l<? super T, ? extends T> lVar) {
        a0.c cVar;
        do {
            cVar = (Object) e0Var.getValue();
        } while (!e0Var.h(cVar, lVar.invoke(cVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@fg.l e0<T> e0Var, @fg.l ld.l<? super T, ? extends T> lVar) {
        a0.c cVar;
        T invoke;
        do {
            cVar = (Object) e0Var.getValue();
            invoke = lVar.invoke(cVar);
        } while (!e0Var.h(cVar, invoke));
        return invoke;
    }
}
