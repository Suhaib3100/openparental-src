package q4;

import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.c;
import kotlin.m2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.m;
import q3.l;
import q3.p;

/* compiled from: Cancellable.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0082\b\u001a\u001c\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/m2;", "d", "(Lq3/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/r0;", "name", "cause", "onCancellation", "e", "(Lq3/p;Ljava/lang/Object;Lkotlin/coroutines/d;Lq3/l;)V", "fatalCompletion", "c", "Lkotlin/Function0;", "block", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class a {
    private static final void a(Continuation<?> continuation, Throwable th) {
        Result.a aVar = Result.f27242p;
        continuation.s(a1.a(th));
        throw th;
    }

    private static final void b(Continuation<?> continuation, q3.a<m2> aVar) {
        try {
            aVar.n();
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static final void c(@d Continuation<? super m2> continuation, @d Continuation<?> continuation2) {
        Continuation e6;
        try {
            e6 = c.e(continuation);
            Result.a aVar = Result.f27242p;
            m.g(e6, m2.f23662a, null, 2, null);
        } catch (Throwable th) {
            a(continuation2, th);
        }
    }

    @i2
    public static final <T> void d(@d l<? super Continuation<? super T>, ? extends Object> lVar, @d Continuation<? super T> continuation) {
        Continuation b6;
        Continuation e6;
        try {
            b6 = c.b(lVar, continuation);
            e6 = c.e(b6);
            Result.a aVar = Result.f27242p;
            m.g(e6, m2.f23662a, null, 2, null);
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static final <R, T> void e(@d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d Continuation<? super T> continuation, @e l<? super Throwable, m2> lVar) {
        Continuation c6;
        Continuation e6;
        try {
            c6 = c.c(pVar, r5, continuation);
            e6 = c.e(c6);
            Result.a aVar = Result.f27242p;
            m.f(e6, m2.f23662a, lVar);
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, Continuation continuation, l lVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, continuation, lVar);
    }
}
