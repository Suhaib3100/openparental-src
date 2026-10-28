package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aL\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001aR\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aa\u0010\u0013\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0016H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "c", "(JLq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/e;", "timeout", "d", "e", "f", "U", "Lkotlinx/coroutines/x3;", "coroutine", "b", "(Lkotlinx/coroutines/x3;Lq3/p;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class y3 {

    /* compiled from: Timeout.kt */
    @DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {100}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        long f29081r;

        /* renamed from: s, reason: collision with root package name */
        Object f29082s;

        /* renamed from: t, reason: collision with root package name */
        Object f29083t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f29084u;

        /* renamed from: v, reason: collision with root package name */
        int f29085v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f29084u = obj;
            this.f29085v |= Integer.MIN_VALUE;
            return y3.e(0L, null, this);
        }
    }

    @d5.d
    public static final TimeoutCancellationException a(long j5, @d5.d n2 n2Var) {
        return new TimeoutCancellationException(ProtectedSandApp.s("庨") + j5 + ProtectedSandApp.s("庩"), n2Var);
    }

    private static final <U, T extends U> Object b(x3<U, ? super T> x3Var, q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar) {
        s2.w(x3Var, f1.d(x3Var.uCont.getContext()).b0(x3Var.time, x3Var, x3Var.getContext()));
        return q4.b.g(x3Var, x3Var, pVar);
    }

    @d5.e
    public static final <T> Object c(long j5, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        if (j5 <= 0) {
            throw new TimeoutCancellationException(ProtectedSandApp.s("庪"), null);
        }
        Object b6 = b(new x3(j5, continuation), pVar);
        if (b6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return b6;
    }

    @d5.e
    public static final <T> Object d(long j5, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return c(f1.e(j5), pVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.x3] */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @d5.d q3.p<? super kotlinx.coroutines.u0, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, @d5.d kotlin.coroutines.Continuation<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.y3.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.y3$a r0 = (kotlinx.coroutines.y3.a) r0
            int r1 = r0.f29085v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29085v = r1
            goto L18
        L13:
            kotlinx.coroutines.y3$a r0 = new kotlinx.coroutines.y3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f29084u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f29085v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f29083t
            kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
            java.lang.Object r8 = r0.f29082s
            q3.p r8 = (q3.p) r8
            kotlin.a1.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            goto L69
        L30:
            r8 = move-exception
            goto L6c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "庫"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.a1.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L48
            return r3
        L48:
            kotlin.jvm.internal.k1$h r10 = new kotlin.jvm.internal.k1$h
            r10.<init>()
            r0.f29082s = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            r0.f29083t = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            r0.f29081r = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            r0.f29085v = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            kotlinx.coroutines.x3 r2 = new kotlinx.coroutines.x3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            r10.f23572o = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
            if (r7 != r1) goto L65
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6a
        L65:
            if (r7 != r1) goto L68
            return r1
        L68:
            r10 = r7
        L69:
            return r10
        L6a:
            r8 = move-exception
            r7 = r10
        L6c:
            kotlinx.coroutines.n2 r9 = r8.coroutine
            T r7 = r7.f23572o
            if (r9 != r7) goto L73
            return r3
        L73:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.y3.e(long, q3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.e
    public static final <T> Object f(long j5, @d5.d q3.p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d5.d Continuation<? super T> continuation) {
        return e(f1.e(j5), pVar, continuation);
    }
}
