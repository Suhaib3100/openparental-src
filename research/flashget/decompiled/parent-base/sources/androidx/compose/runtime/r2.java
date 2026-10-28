package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: PausableMonotonicFrameClock.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J9\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/r2;", "Landroidx/compose/runtime/a2;", "frameClock", "<init>", "(Landroidx/compose/runtime/a2;)V", "Lkotlin/k2;", "j", "()V", "p", "R", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "frameTimeNanos", "onFrame", "u", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Landroidx/compose/runtime/a2;", "Landroidx/compose/runtime/v1;", "c", "Landroidx/compose/runtime/v1;", "latch", "", "a", "()Z", "isPaused", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r2 implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16922d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a2 frameClock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v1 latch = new v1();

    /* compiled from: PausableMonotonicFrameClock.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f16925b;

        /* renamed from: c, reason: collision with root package name */
        Object f16926c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16927d;

        /* renamed from: f, reason: collision with root package name */
        int f16929f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f16927d = obj;
            this.f16929f |= Integer.MIN_VALUE;
            return r2.this.u(null, this);
        }
    }

    public r2(@fg.l a2 a2Var) {
        this.frameClock = a2Var;
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final boolean a() {
        return !this.latch.e();
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    public final void j() {
        this.latch.d();
    }

    public final void p() {
        this.latch.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[PHI: r7
      0x0061: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x005e, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.runtime.a2
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object u(@fg.l ld.l<? super java.lang.Long, ? extends R> r6, @fg.l kotlin.coroutines.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.r2.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.r2$a r0 = (androidx.compose.runtime.r2.a) r0
            int r1 = r0.f16929f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16929f = r1
            goto L18
        L13:
            androidx.compose.runtime.r2$a r0 = new androidx.compose.runtime.r2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16927d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f16929f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.a1.n(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f16926c
            ld.l r6 = (ld.l) r6
            java.lang.Object r2 = r0.f16925b
            androidx.compose.runtime.r2 r2 = (androidx.compose.runtime.r2) r2
            kotlin.a1.n(r7)
            goto L51
        L3e:
            kotlin.a1.n(r7)
            androidx.compose.runtime.v1 r7 = r5.latch
            r0.f16925b = r5
            r0.f16926c = r6
            r0.f16929f = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            androidx.compose.runtime.a2 r7 = r2.frameClock
            r2 = 0
            r0.f16925b = r2
            r0.f16926c = r2
            r0.f16929f = r3
            java.lang.Object r7 = r7.u(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r2.u(ld.l, kotlin.coroutines.d):java.lang.Object");
    }
}
