package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.time.Duration;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/m2;", "b", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/e;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/e1;", "d", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/e1;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class f1 {

    /* compiled from: Delay.kt */
    @DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f27728r;

        /* renamed from: s, reason: collision with root package name */
        int f27729s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27728r = obj;
            this.f27729s |= Integer.MIN_VALUE;
            return f1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@d5.d kotlin.coroutines.Continuation<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.f1.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.f1$a r0 = (kotlinx.coroutines.f1.a) r0
            int r1 = r0.f27729s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27729s = r1
            goto L18
        L13:
            kotlinx.coroutines.f1$a r0 = new kotlinx.coroutines.f1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f27728r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27729s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "崼"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r4.<init>(r0)
            throw r4
        L2f:
            kotlin.a1.n(r4)
            goto L50
        L33:
            kotlin.a1.n(r4)
            r0.f27729s = r3
            kotlinx.coroutines.s r4 = new kotlinx.coroutines.s
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r4.<init>(r2, r3)
            r4.X()
            java.lang.Object r4 = r4.A()
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f1.a(kotlin.coroutines.d):java.lang.Object");
    }

    @d5.e
    public static final Object b(long j5, @d5.d Continuation<? super kotlin.m2> continuation) {
        Continuation e6;
        if (j5 <= 0) {
            return kotlin.m2.f23662a;
        }
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar = new s(e6, 1);
        sVar.X();
        if (j5 < Long.MAX_VALUE) {
            d(sVar.getF23291o()).g(j5, sVar);
        }
        Object A = sVar.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : kotlin.m2.f23662a;
    }

    @d5.e
    public static final Object c(long j5, @d5.d Continuation<? super kotlin.m2> continuation) {
        Object b6 = b(e(j5), continuation);
        return b6 == CoroutineSingletons.COROUTINE_SUSPENDED ? b6 : kotlin.m2.f23662a;
    }

    @d5.d
    public static final e1 d(@d5.d CoroutineContext coroutineContext) {
        CoroutineContext.b b6 = coroutineContext.b(ContinuationInterceptor.f23289d);
        e1 e1Var = b6 instanceof e1 ? (e1) b6 : null;
        return e1Var == null ? b1.a() : e1Var;
    }

    public static final long e(long j5) {
        Duration.f27196p.getClass();
        if (Duration.r(j5, Duration.f27197q) <= 0) {
            return 0L;
        }
        long S = Duration.S(j5);
        if (S < 1) {
            return 1L;
        }
        return S;
    }
}
