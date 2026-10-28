package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.a1;
import kotlin.k2;
import kotlin.w0;
import kotlin.z0;
import kotlinx.coroutines.m0;

/* compiled from: SelectOld.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a:\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "e", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "T", "Lkotlinx/coroutines/p;", "result", "c", "(Lkotlinx/coroutines/p;Ljava/lang/Object;)V", "", "exception", "d", "(Lkotlinx/coroutines/p;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(kotlinx.coroutines.p<? super T> pVar, T t4) {
        m0 m0Var = (m0) pVar.getF75054b().c(m0.INSTANCE);
        if (m0Var != null) {
            pVar.Z(m0Var, t4);
        } else {
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(kotlinx.coroutines.p<?> pVar, Throwable th) {
        m0 m0Var = (m0) pVar.getF75054b().c(m0.INSTANCE);
        if (m0Var != null) {
            pVar.A(m0Var, th);
        } else {
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(a1.a(th));
        }
    }

    @fg.m
    @w0
    public static final <R> Object e(@fg.l ld.l<? super c<? super R>, k2> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        d dVar2 = new d(dVar);
        try {
            lVar.invoke(dVar2);
        } catch (Throwable th) {
            dVar2.u0(th);
        }
        Object t02 = dVar2.t0();
        if (t02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return t02;
    }

    @w0
    private static final <R> Object f(ld.l<? super c<? super R>, k2> lVar, kotlin.coroutines.d<? super R> dVar) {
        d dVar2 = new d(dVar);
        try {
            lVar.invoke(dVar2);
        } catch (Throwable th) {
            dVar2.u0(th);
        }
        Object t02 = dVar2.t0();
        if (t02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return t02;
    }

    @fg.m
    @w0
    public static final <R> Object g(@fg.l ld.l<? super c<? super R>, k2> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        s sVar = new s(dVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th) {
            sVar.v0(th);
        }
        Object w02 = sVar.w0();
        if (w02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return w02;
    }

    @w0
    private static final <R> Object h(ld.l<? super c<? super R>, k2> lVar, kotlin.coroutines.d<? super R> dVar) {
        s sVar = new s(dVar);
        try {
            lVar.invoke(sVar);
        } catch (Throwable th) {
            sVar.v0(th);
        }
        Object w02 = sVar.w0();
        if (w02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return w02;
    }
}
