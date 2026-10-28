package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Lkotlin/z0;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "onCancellation", "", "c", "(Ljava/lang/Object;Lq3/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/q;", "caller", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/q;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/d;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k0 {
    @d5.d
    public static final <T> Object a(@d5.e Object obj, @d5.d Continuation<? super T> continuation) {
        if (obj instanceof f0) {
            Result.a aVar = Result.f27242p;
            return kotlin.a1.a(((f0) obj).cause);
        }
        Result.a aVar2 = Result.f27242p;
        return obj;
    }

    @d5.e
    public static final <T> Object b(@d5.d Object obj, @d5.d q<?> qVar) {
        Throwable e6 = Result.e(obj);
        if (e6 == null) {
            return obj;
        }
        return new f0(e6, false, 2, null);
    }

    @d5.e
    public static final <T> Object c(@d5.d Object obj, @d5.e q3.l<? super Throwable, kotlin.m2> lVar) {
        Throwable e6 = Result.e(obj);
        if (e6 == null) {
            return lVar != null ? new g0(obj, lVar) : obj;
        }
        return new f0(e6, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, q3.l lVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
