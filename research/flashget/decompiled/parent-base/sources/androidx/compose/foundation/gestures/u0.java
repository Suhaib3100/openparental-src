package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0017\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/u0;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroidx/compose/foundation/gestures/y0;", "scrollingLogic", "", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/y0;Z)V", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Landroidx/compose/foundation/gestures/y0;", "()Landroidx/compose/foundation/gestures/y0;", "c", "Z", "a", "()Z", "(Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u0 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y0 scrollingLogic;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 0}, l = {934}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4498b;

        /* renamed from: c, reason: collision with root package name */
        long f4499c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4500d;

        /* renamed from: f, reason: collision with root package name */
        int f4502f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4500d = obj;
            this.f4502f |= Integer.MIN_VALUE;
            return u0.this.w0(0L, 0L, this);
        }
    }

    public u0(@fg.l y0 y0Var, boolean z4) {
        this.scrollingLogic = y0Var;
        this.enabled = z4;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long H2(long consumed, long available, int source) {
        if (this.enabled) {
            return this.scrollingLogic.h(available);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final y0 getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final void c(boolean z4) {
        this.enabled = z4;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long i5(long available, int source) {
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18688d)) {
            this.scrollingLogic.i(true);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w0(long r3, long r5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.u0.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.u0$a r3 = (androidx.compose.foundation.gestures.u0.a) r3
            int r4 = r3.f4502f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f4502f = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.u0$a r3 = new androidx.compose.foundation.gestures.u0$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f4500d
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r0 = r3.f4502f
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            long r5 = r3.f4499c
            java.lang.Object r3 = r3.f4498b
            androidx.compose.foundation.gestures.u0 r3 = (androidx.compose.foundation.gestures.u0) r3
            kotlin.a1.n(r4)
            goto L4c
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            kotlin.a1.n(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L57
            androidx.compose.foundation.gestures.y0 r4 = r2.scrollingLogic
            r3.f4498b = r2
            r3.f4499c = r5
            r3.f4502f = r1
            java.lang.Object r4 = r4.d(r5, r3)
            if (r4 != r7) goto L4b
            return r7
        L4b:
            r3 = r2
        L4c:
            androidx.compose.ui.unit.c0 r4 = (androidx.compose.ui.unit.c0) r4
            long r0 = r4.getPackedValue()
            long r4 = androidx.compose.ui.unit.c0.p(r5, r0)
            goto L61
        L57:
            androidx.compose.ui.unit.c0$a r3 = androidx.compose.ui.unit.c0.INSTANCE
            r3.getClass()
            long r4 = androidx.compose.ui.unit.c0.a()
            r3 = r2
        L61:
            androidx.compose.ui.unit.c0 r4 = androidx.compose.ui.unit.c0.b(r4)
            r4.getPackedValue()
            androidx.compose.foundation.gestures.y0 r3 = r3.scrollingLogic
            r5 = 0
            r3.i(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u0.w0(long, long, kotlin.coroutines.d):java.lang.Object");
    }
}
