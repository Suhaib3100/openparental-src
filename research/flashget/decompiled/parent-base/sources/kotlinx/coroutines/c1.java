package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/k2;", "b", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/e;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/b1;", "d", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/b1;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n314#2,11:174\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n106#1:163,11\n127#1:174,11\n*E\n"})
/* loaded from: classes7.dex */
public final class c1 {

    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {163}, m = "awaitCancellation", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f79276b;

        /* renamed from: c, reason: collision with root package name */
        int f79277c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79276b = obj;
            this.f79277c |= Integer.MIN_VALUE;
            return c1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l kotlin.coroutines.d<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.c1.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.c1$a r0 = (kotlinx.coroutines.c1.a) r0
            int r1 = r0.f79277c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79277c = r1
            goto L18
        L13:
            kotlinx.coroutines.c1$a r0 = new kotlinx.coroutines.c1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f79276b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79277c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "薪\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4.<init>(r0)
            throw r4
        L2f:
            kotlin.a1.n(r4)
            goto L50
        L33:
            kotlin.a1.n(r4)
            r0.f79277c = r3
            kotlinx.coroutines.q r4 = new kotlinx.coroutines.q
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r4.<init>(r2, r3)
            r4.e0()
            java.lang.Object r4 = r4.y()
            if (r4 != r1) goto L4d
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4d:
            if (r4 != r1) goto L50
            return r1
        L50:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c1.a(kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final Object b(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (j4 <= 0) {
            return kotlin.k2.f75408a;
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        if (j4 < Long.MAX_VALUE) {
            d(qVar.getContext()).a(j4, qVar);
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : kotlin.k2.f75408a;
    }

    @fg.m
    public static final Object c(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object b5 = b(e(j4), dVar);
        return b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b5 : kotlin.k2.f75408a;
    }

    @fg.l
    public static final b1 d(@fg.l kotlin.coroutines.g gVar) {
        g.b c5 = gVar.c(kotlin.coroutines.e.INSTANCE);
        b1 b1Var = c5 instanceof b1 ? (b1) c5 : null;
        return b1Var == null ? y0.a() : b1Var;
    }

    public static final long e(long j4) {
        kotlin.time.e.INSTANCE.getClass();
        if (kotlin.time.e.h(j4, kotlin.time.e.f79210d) > 0) {
            return kotlin.ranges.s.v(kotlin.time.e.M(j4), 1L);
        }
        return 0L;
    }
}
