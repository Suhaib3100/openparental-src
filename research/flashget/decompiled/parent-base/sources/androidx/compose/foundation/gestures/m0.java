package androidx.compose.foundation.gestures;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlinx.coroutines.sync.a;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\n*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010 J\u001a\u0010\"\u001a\u00020\n*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020$H\u0086@¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020$H\u0096@¢\u0006\u0004\b*\u0010)J\u0010\u0010,\u001a\u00020+H\u0096@¢\u0006\u0004\b,\u0010)R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/foundation/gestures/m0;", "Landroidx/compose/foundation/gestures/l0;", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/h;", "", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "", "S", "(F)F", "R", "(I)F", "Li0/n;", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "Lkotlin/k2;", "a", "()V", "f", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "f4", "", "A2", "c", "Z", "isReleased", "d", "isCanceled", "Lkotlinx/coroutines/sync/a;", "e", "Lkotlinx/coroutines/sync/a;", "mutex", "b", "()F", "U", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m0 implements l0, androidx.compose.ui.unit.d {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.ui.unit.d f4137b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.a(false);

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {363}, m = "awaitRelease", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4141b;

        /* renamed from: d, reason: collision with root package name */
        int f4143d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4141b = obj;
            this.f4143d |= Integer.MIN_VALUE;
            return m0.this.f4(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4144b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4145c;

        /* renamed from: e, reason: collision with root package name */
        int f4147e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4145c = obj;
            this.f4147e |= Integer.MIN_VALUE;
            return m0.this.l(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {370}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4148b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4149c;

        /* renamed from: e, reason: collision with root package name */
        int f4151e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4149c = obj;
            this.f4151e |= Integer.MIN_VALUE;
            return m0.this.A2(this);
        }
    }

    public m0(@fg.l androidx.compose.ui.unit.d dVar) {
        this.f4137b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.foundation.gestures.l0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A2(@fg.l kotlin.coroutines.d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.m0.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.m0$c r0 = (androidx.compose.foundation.gestures.m0.c) r0
            int r1 = r0.f4151e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4151e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.m0$c r0 = new androidx.compose.foundation.gestures.m0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4149c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4151e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f4148b
            androidx.compose.foundation.gestures.m0 r0 = (androidx.compose.foundation.gestures.m0) r0
            kotlin.a1.n(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.a1.n(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L53
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L53
            kotlinx.coroutines.sync.a r6 = r5.mutex
            r0.f4148b = r5
            r0.f4151e = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.a.C1262a.b(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            kotlinx.coroutines.sync.a r6 = r0.mutex
            kotlinx.coroutines.sync.a.C1262a.d(r6, r3, r4, r3)
            goto L54
        L53:
            r0 = r5
        L54:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m0.A2(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float J2(long j4) {
        return this.f4137b.J2(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int J5(long j4) {
        return this.f4137b.J5(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float R(int i4) {
        return this.f4137b.R(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float S(float f4) {
        return this.f4137b.S(f4);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.f4137b.getFontScale();
    }

    public final void a() {
        this.isCanceled = true;
        a.C1262a.d(this.mutex, null, 1, null);
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.f4137b.getDensity();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    @fg.l
    public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
        return this.f4137b.c5(kVar);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long d0(long j4) {
        return this.f4137b.d0(j4);
    }

    public final void f() {
        this.isReleased = true;
        a.C1262a.d(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.l0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f4(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.m0.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.m0$a r0 = (androidx.compose.foundation.gestures.m0.a) r0
            int r1 = r0.f4143d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4143d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.m0$a r0 = new androidx.compose.foundation.gestures.m0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4141b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4143d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.a1.n(r5)
            r0.f4143d = r3
            java.lang.Object r5 = r4.A2(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L46:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m0.f4(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public long h(float f4) {
        return this.f4137b.h(f4);
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public float i(long j4) {
        return this.f4137b.i(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.m0.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.m0$b r0 = (androidx.compose.foundation.gestures.m0.b) r0
            int r1 = r0.f4147e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4147e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.m0$b r0 = new androidx.compose.foundation.gestures.m0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4145c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4147e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f4144b
            androidx.compose.foundation.gestures.m0 r0 = (androidx.compose.foundation.gestures.m0) r0
            kotlin.a1.n(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            kotlinx.coroutines.sync.a r5 = r4.mutex
            r0.f4144b = r4
            r0.f4147e = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.a.C1262a.b(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L44
            return r1
        L44:
            r0 = r4
        L45:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m0.l(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long n(long j4) {
        return this.f4137b.n(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int q2(float f4) {
        return this.f4137b.q2(f4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long u(int i4) {
        return this.f4137b.u(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float v5(float f4) {
        return this.f4137b.v5(f4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long w(float f4) {
        return this.f4137b.w(f4);
    }
}
