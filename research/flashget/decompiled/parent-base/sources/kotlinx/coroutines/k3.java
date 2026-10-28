package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Supervisor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aO\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/k2;", "parent", "Lkotlinx/coroutines/b0;", "a", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/b0;", "b", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "e", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k3 {
    @fg.l
    public static final b0 a(@fg.m k2 k2Var) {
        return new j3(k2Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kd.i(name = "SupervisorJob")
    public static final k2 b(k2 k2Var) {
        return new j3(k2Var);
    }

    public static b0 c(k2 k2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k2Var = null;
        }
        return new j3(k2Var);
    }

    public static k2 d(k2 k2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k2Var = null;
        }
        return new j3(k2Var);
    }

    @fg.m
    public static final <R> Object e(@fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        i3 i3Var = new i3(dVar.getContext(), dVar);
        Object e4 = me.b.e(i3Var, i3Var, pVar);
        if (e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e4;
    }
}
