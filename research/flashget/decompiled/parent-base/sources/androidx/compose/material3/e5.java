package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\"\u0010$\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u000e\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material3/e5;", "Landroidx/compose/material3/ob;", "Landroidx/compose/material3/pb;", "state", "Landroidx/compose/animation/core/k;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/z;", "flingAnimationSpec", "Lkotlin/Function0;", "", "canScroll", "<init>", "(Landroidx/compose/material3/pb;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Lld/a;)V", "a", "Landroidx/compose/material3/pb;", "getState", "()Landroidx/compose/material3/pb;", "b", "Landroidx/compose/animation/core/k;", "d", "()Landroidx/compose/animation/core/k;", "c", "Landroidx/compose/animation/core/z;", "()Landroidx/compose/animation/core/z;", "Lld/a;", "e", "()Lld/a;", "Z", "()Z", "isPinned", "Landroidx/compose/ui/input/nestedscroll/a;", "f", "Landroidx/compose/ui/input/nestedscroll/a;", "()Landroidx/compose/ui/input/nestedscroll/a;", "(Landroidx/compose/ui/input/nestedscroll/a;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e5 implements ob {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final pb state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.animation.core.k<Float> snapAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.animation.core.z<Float> flingAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> canScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.input.nestedscroll.a nestedScrollConnection;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10652b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/e5$b", "Landroidx/compose/ui/input/nestedscroll/a;", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.input.nestedscroll.a {

        /* compiled from: AppBar.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {2203, 2204}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f10654b;

            /* renamed from: c, reason: collision with root package name */
            long f10655c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f10656d;

            /* renamed from: f, reason: collision with root package name */
            int f10658f;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f10656d = obj;
                this.f10658f |= Integer.MIN_VALUE;
                return b.this.w0(0L, 0L, this);
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long H2(long consumed, long available, int source) {
            if (!e5.this.e().invoke().booleanValue()) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            pb state = e5.this.getState();
            state.g(i0.f.r(consumed) + state.c());
            if (i0.f.r(available) < 0.0f || i0.f.r(consumed) < 0.0f) {
                float d5 = e5.this.getState().d();
                e5.this.getState().h(i0.f.r(consumed) + e5.this.getState().d());
                return i0.g.a(0.0f, e5.this.getState().d() - d5);
            }
            if (i0.f.r(consumed) == 0.0f && i0.f.r(available) > 0.0f) {
                e5.this.getState().g(0.0f);
            }
            if (i0.f.r(available) <= 0.0f) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            float d6 = e5.this.getState().d();
            e5.this.getState().h(i0.f.r(available) + e5.this.getState().d());
            return i0.g.a(0.0f, e5.this.getState().d() - d6);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long i5(long available, int source) {
            if (!e5.this.e().invoke().booleanValue() || i0.f.r(available) > 0.0f) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            float d5 = e5.this.getState().d();
            e5.this.getState().h(i0.f.r(available) + e5.this.getState().d());
            if (d5 != e5.this.getState().d()) {
                return i0.f.i(available, 0.0f, 0.0f, 2, null);
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object w0(long r10, long r12, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r14) {
            /*
                r9 = this;
                boolean r0 = r14 instanceof androidx.compose.material3.e5.b.a
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.material3.e5$b$a r0 = (androidx.compose.material3.e5.b.a) r0
                int r1 = r0.f10658f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10658f = r1
                goto L18
            L13:
                androidx.compose.material3.e5$b$a r0 = new androidx.compose.material3.e5$b$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f10656d
                kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r0.f10658f
                r8 = 2
                r2 = 1
                if (r1 == 0) goto L3e
                if (r1 == r2) goto L34
                if (r1 != r8) goto L2c
                long r10 = r0.f10655c
                kotlin.a1.n(r14)
                goto L7e
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                long r12 = r0.f10655c
                java.lang.Object r10 = r0.f10654b
                androidx.compose.material3.e5$b r10 = (androidx.compose.material3.e5.b) r10
                kotlin.a1.n(r14)
                goto L53
            L3e:
                kotlin.a1.n(r14)
                r0.f10654b = r9
                r0.f10655c = r12
                r0.f10658f = r2
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r0
                java.lang.Object r14 = androidx.compose.ui.input.nestedscroll.a.D0(r1, r2, r4, r6)
                if (r14 != r7) goto L52
                return r7
            L52:
                r10 = r9
            L53:
                androidx.compose.ui.unit.c0 r14 = (androidx.compose.ui.unit.c0) r14
                long r1 = r14.getPackedValue()
                androidx.compose.material3.e5 r11 = androidx.compose.material3.e5.this
                androidx.compose.material3.pb r11 = r11.getState()
                float r12 = androidx.compose.ui.unit.c0.n(r12)
                androidx.compose.material3.e5 r13 = androidx.compose.material3.e5.this
                androidx.compose.animation.core.z r13 = r13.c()
                androidx.compose.material3.e5 r10 = androidx.compose.material3.e5.this
                androidx.compose.animation.core.k r10 = r10.d()
                r14 = 0
                r0.f10654b = r14
                r0.f10655c = r1
                r0.f10658f = r8
                java.lang.Object r14 = androidx.compose.material3.p.v(r11, r12, r13, r10, r0)
                if (r14 != r7) goto L7d
                return r7
            L7d:
                r10 = r1
            L7e:
                androidx.compose.ui.unit.c0 r14 = (androidx.compose.ui.unit.c0) r14
                long r12 = r14.getPackedValue()
                long r10 = androidx.compose.ui.unit.c0.q(r10, r12)
                androidx.compose.ui.unit.c0 r10 = androidx.compose.ui.unit.c0.b(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.e5.b.w0(long, long, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public e5(@fg.l pb pbVar, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.l ld.a<Boolean> aVar) {
        this.state = pbVar;
        this.snapAnimationSpec = kVar;
        this.flingAnimationSpec = zVar;
        this.canScroll = aVar;
        this.nestedScrollConnection = new b();
    }

    @Override // androidx.compose.material3.ob
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.input.nestedscroll.a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.ob
    /* renamed from: b, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // androidx.compose.material3.ob
    @fg.m
    public androidx.compose.animation.core.z<Float> c() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.ob
    @fg.m
    public androidx.compose.animation.core.k<Float> d() {
        return this.snapAnimationSpec;
    }

    @fg.l
    public final ld.a<Boolean> e() {
        return this.canScroll;
    }

    public void f(@fg.l androidx.compose.ui.input.nestedscroll.a aVar) {
        this.nestedScrollConnection = aVar;
    }

    @Override // androidx.compose.material3.ob
    @fg.l
    public pb getState() {
        return this.state;
    }

    public /* synthetic */ e5(pb pbVar, androidx.compose.animation.core.k kVar, androidx.compose.animation.core.z zVar, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(pbVar, kVar, zVar, (i4 & 8) != 0 ? a.f10652b : aVar);
    }
}
