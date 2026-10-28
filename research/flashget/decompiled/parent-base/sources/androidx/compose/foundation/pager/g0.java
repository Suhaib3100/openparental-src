package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: Pager.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/pager/g0;", "Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/foundation/gestures/snapping/h;", "originalFlingBehavior", "Landroidx/compose/foundation/pager/c0;", "pagerState", "<init>", "(Landroidx/compose/foundation/gestures/snapping/h;Landroidx/compose/foundation/pager/c0;)V", "Landroidx/compose/foundation/gestures/q0;", "", "initialVelocity", "a", "(Landroidx/compose/foundation/gestures/q0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/snapping/h;", "b", "()Landroidx/compose/foundation/gestures/snapping/h;", "Landroidx/compose/foundation/pager/c0;", "c", "()Landroidx/compose/foundation/pager/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 implements androidx.compose.foundation.gestures.e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6791c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.snapping.h originalFlingBehavior;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 pagerState;

    /* compiled from: Pager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "Pager.kt", i = {}, l = {829}, m = "performFling", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6794b;

        /* renamed from: d, reason: collision with root package name */
        int f6796d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f6794b = obj;
            this.f6796d |= Integer.MIN_VALUE;
            return g0.this.a(null, 0.0f, this);
        }
    }

    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remainingScrollOffset", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Float, k2> {
        b() {
            super(1);
        }

        public final void a(float f4) {
            g0.this.getPagerState().w0(f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Float f4) {
            a(f4.floatValue());
            return k2.f75408a;
        }
    }

    public g0(@fg.l androidx.compose.foundation.gestures.snapping.h hVar, @fg.l c0 c0Var) {
        this.originalFlingBehavior = hVar;
        this.pagerState = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.e0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l androidx.compose.foundation.gestures.q0 r5, float r6, @fg.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.g0.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.pager.g0$a r0 = (androidx.compose.foundation.pager.g0.a) r0
            int r1 = r0.f6796d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6796d = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.g0$a r0 = new androidx.compose.foundation.pager.g0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6794b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f6796d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.a1.n(r7)
            androidx.compose.foundation.gestures.snapping.h r7 = r4.originalFlingBehavior
            androidx.compose.foundation.pager.g0$b r2 = new androidx.compose.foundation.pager.g0$b
            r2.<init>()
            r0.f6796d = r3
            java.lang.Object r7 = r7.j(r5, r6, r2, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.g0.a(androidx.compose.foundation.gestures.q0, float, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.foundation.gestures.snapping.h getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final c0 getPagerState() {
        return this.pagerState;
    }
}
