package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aL\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001aR\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\n\u001aa\u0010\u0013\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "c", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/e;", "timeout", "d", "e", "f", "U", "Lkotlinx/coroutines/t3;", "coroutine", "b", "(Lkotlinx/coroutines/t3;Lld/p;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/b1;", "delay", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "(JLkotlinx/coroutines/b1;Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class u3 {

    /* compiled from: Timeout.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {104}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        long f81170b;

        /* renamed from: c, reason: collision with root package name */
        Object f81171c;

        /* renamed from: d, reason: collision with root package name */
        Object f81172d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f81173e;

        /* renamed from: f, reason: collision with root package name */
        int f81174f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f81173e = obj;
            this.f81174f |= Integer.MIN_VALUE;
            return u3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, @fg.l kotlinx.coroutines.b1 r4, @fg.l kotlinx.coroutines.k2 r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.d1
            if (r0 == 0) goto L7
            kotlinx.coroutines.d1 r4 = (kotlinx.coroutines.d1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.e$a r0 = kotlin.time.e.INSTANCE
            kotlin.time.h r0 = kotlin.time.h.MILLISECONDS
            long r0 = kotlin.time.g.n0(r2, r0)
            java.lang.String r4 = r4.y(r0)
            if (r4 != 0) goto L28
        L18:
            java.lang.String r4 = "複\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String r0 = "褈\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r4 = androidx.compose.ui.input.pointer.s.a(r4, r2, r0)
        L28:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u3.a(long, kotlinx.coroutines.b1, kotlinx.coroutines.k2):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object b(t3<U, ? super T> t3Var, ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) {
        p2.w(t3Var, c1.d(t3Var.uCont.getF75269b()).q(t3Var.time, t3Var, t3Var.getF75269b()));
        return me.b.f(t3Var, t3Var, pVar);
    }

    @fg.m
    public static final <T> Object c(long j4, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        if (j4 <= 0) {
            throw new TimeoutCancellationException(ProtectedSandApp.s("褉\u0001"), null);
        }
        Object b5 = b(new t3(j4, dVar), pVar);
        if (b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b5;
    }

    @fg.m
    public static final <T> Object d(long j4, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return c(c1.e(j4), pVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.t3] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r9, @fg.l kotlin.coroutines.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.u3.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.u3$a r0 = (kotlinx.coroutines.u3.a) r0
            int r1 = r0.f81174f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81174f = r1
            goto L18
        L13:
            kotlinx.coroutines.u3$a r0 = new kotlinx.coroutines.u3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f81173e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81174f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f81172d
            kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
            java.lang.Object r8 = r0.f81171c
            ld.p r8 = (ld.p) r8
            kotlin.a1.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            goto L6d
        L30:
            r8 = move-exception
            goto L6e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "褊\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
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
            r0.f81171c = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            r0.f81172d = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            r0.f81170b = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            r0.f81174f = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            kotlinx.coroutines.t3 r2 = new kotlinx.coroutines.t3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            r10.f75329b = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            if (r7 != r1) goto L69
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L66
            goto L69
        L66:
            r8 = move-exception
            r7 = r10
            goto L6e
        L69:
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r10 = r7
        L6d:
            return r10
        L6e:
            kotlinx.coroutines.k2 r9 = r8.coroutine
            T r7 = r7.f75329b
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u3.e(long, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final <T> Object f(long j4, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return e(c1.e(j4), pVar, dVar);
    }
}
