package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00030\u0001H\u0080Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "block", "c", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q;", "e", "Lkotlin/coroutines/d;", "delegate", "b", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/m1;", "handle", "a", "(Lkotlinx/coroutines/p;Lkotlinx/coroutines/m1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* loaded from: classes7.dex */
public final class s {
    @f2
    public static final void a(@fg.l p<?> pVar, @fg.l m1 m1Var) {
        pVar.k0(new n1(m1Var));
    }

    @fg.l
    public static final <T> q<T> b(@fg.l kotlin.coroutines.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.l)) {
            return new q<>(dVar, 1);
        }
        q<T> k4 = ((kotlinx.coroutines.internal.l) dVar).k();
        if (k4 != null) {
            if (!k4.O()) {
                k4 = null;
            }
            if (k4 != null) {
                return k4;
            }
        }
        return new q<>(dVar, 2);
    }

    @fg.m
    public static final <T> Object c(@fg.l ld.l<? super p<? super T>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        lVar.invoke(qVar);
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    private static final <T> Object d(ld.l<? super p<? super T>, kotlin.k2> lVar, kotlin.coroutines.d<? super T> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        lVar.invoke(qVar);
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @fg.m
    public static final <T> Object e(@fg.l ld.l<? super q<? super T>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        q b5 = b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            lVar.invoke(b5);
            Object y4 = b5.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        } catch (Throwable th) {
            b5.N();
            throw th;
        }
    }

    private static final <T> Object f(ld.l<? super q<? super T>, kotlin.k2> lVar, kotlin.coroutines.d<? super T> dVar) {
        q b5 = b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            lVar.invoke(b5);
            Object y4 = b5.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        } catch (Throwable th) {
            b5.N();
            throw th;
        }
    }
}
