package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.modifier.i;
import androidx.compose.ui.modifier.j;
import androidx.compose.ui.modifier.k;
import androidx.compose.ui.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.q0;
import kotlinx.coroutines.r0;

/* compiled from: NestedScrollNode.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u000fJ!\u0010!\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b!\u0010\tR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/d;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/q$d;", "connection", "Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/a;Landroidx/compose/ui/input/nestedscroll/b;)V", "newDispatcher", "Lkotlin/k2;", "F7", "(Landroidx/compose/ui/input/nestedscroll/b;)V", "G7", "()V", "D7", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "i7", "j7", "H7", "p", "Landroidx/compose/ui/input/nestedscroll/a;", "z7", "()Landroidx/compose/ui/input/nestedscroll/a;", "E7", "(Landroidx/compose/ui/input/nestedscroll/a;)V", "q", "Landroidx/compose/ui/input/nestedscroll/b;", "resolvedDispatcher", "Landroidx/compose/ui/modifier/i;", "r", "Landroidx/compose/ui/modifier/i;", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "C7", "()Landroidx/compose/ui/input/nestedscroll/d;", "parentModifierLocal", "B7", "parentConnection", "Lkotlinx/coroutines/r0;", "A7", "()Lkotlinx/coroutines/r0;", "nestedCoroutineScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends q.d implements j, androidx.compose.ui.input.nestedscroll.a, androidx.compose.ui.node.j {

    /* renamed from: s, reason: collision with root package name */
    public static final int f18668s = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.compose.ui.input.nestedscroll.a connection;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.compose.ui.input.nestedscroll.b resolvedDispatcher;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    private final i providedValues;

    /* compiled from: NestedScrollNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {105, 106}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f18672b;

        /* renamed from: c, reason: collision with root package name */
        long f18673c;

        /* renamed from: d, reason: collision with root package name */
        long f18674d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f18675e;

        /* renamed from: g, reason: collision with root package name */
        int f18677g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f18675e = obj;
            this.f18677g |= Integer.MIN_VALUE;
            return d.this.w0(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {98, 99}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f18678b;

        /* renamed from: c, reason: collision with root package name */
        long f18679c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f18680d;

        /* renamed from: f, reason: collision with root package name */
        int f18682f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f18680d = obj;
            this.f18682f |= Integer.MIN_VALUE;
            return d.this.F5(0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/r0;", "a", "()Lkotlinx/coroutines/r0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<r0> {
        c() {
            super(0);
        }

        @l
        public final r0 a() {
            return d.this.A7();
        }

        @Override // ld.a
        public r0 invoke() {
            return d.this.A7();
        }
    }

    public d(@l androidx.compose.ui.input.nestedscroll.a aVar, @m androidx.compose.ui.input.nestedscroll.b bVar) {
        this.connection = aVar;
        this.resolvedDispatcher = bVar == null ? new androidx.compose.ui.input.nestedscroll.b() : bVar;
        this.providedValues = k.c(new q0(e.a(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 A7() {
        r0 scope;
        d C7 = C7();
        if ((C7 == null || (scope = C7.A7()) == null) && (scope = this.resolvedDispatcher.getScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope;
    }

    private final androidx.compose.ui.input.nestedscroll.a B7() {
        if (getIsAttached()) {
            return (androidx.compose.ui.input.nestedscroll.a) v(e.a());
        }
        return null;
    }

    private final d C7() {
        if (getIsAttached()) {
            return (d) v(e.a());
        }
        return null;
    }

    private final void D7() {
        if (this.resolvedDispatcher.getModifierLocalNode() == this) {
            this.resolvedDispatcher.k(null);
        }
    }

    private final void F7(androidx.compose.ui.input.nestedscroll.b newDispatcher) {
        D7();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new androidx.compose.ui.input.nestedscroll.b();
        } else if (!l0.g(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            G7();
        }
    }

    private final void G7() {
        this.resolvedDispatcher.k(this);
        this.resolvedDispatcher.j(new c());
        this.resolvedDispatcher.l(V6());
    }

    @Override // androidx.compose.ui.modifier.j
    @l
    /* renamed from: A1, reason: from getter */
    public i getProvidedValues() {
        return this.providedValues;
    }

    public final void E7(@l androidx.compose.ui.input.nestedscroll.a aVar) {
        this.connection = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F5(long r9, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.d.b
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.d$b r0 = (androidx.compose.ui.input.nestedscroll.d.b) r0
            int r1 = r0.f18682f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18682f = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.d$b r0 = new androidx.compose.ui.input.nestedscroll.d$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18680d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f18682f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.f18679c
            kotlin.a1.n(r11)
            goto L7e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            long r9 = r0.f18679c
            java.lang.Object r2 = r0.f18678b
            androidx.compose.ui.input.nestedscroll.d r2 = (androidx.compose.ui.input.nestedscroll.d) r2
            kotlin.a1.n(r11)
            goto L55
        L3e:
            kotlin.a1.n(r11)
            androidx.compose.ui.input.nestedscroll.a r11 = r8.B7()
            if (r11 == 0) goto L5f
            r0.f18678b = r8
            r0.f18679c = r9
            r0.f18682f = r4
            java.lang.Object r11 = r11.F5(r9, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r2 = r8
        L55:
            androidx.compose.ui.unit.c0 r11 = (androidx.compose.ui.unit.c0) r11
            long r4 = r11.getPackedValue()
        L5b:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L6a
        L5f:
            androidx.compose.ui.unit.c0$a r11 = androidx.compose.ui.unit.c0.INSTANCE
            r11.getClass()
            long r4 = androidx.compose.ui.unit.c0.a()
            r2 = r8
            goto L5b
        L6a:
            androidx.compose.ui.input.nestedscroll.a r11 = r2.connection
            long r4 = androidx.compose.ui.unit.c0.p(r4, r9)
            r2 = 0
            r0.f18678b = r2
            r0.f18679c = r9
            r0.f18682f = r3
            java.lang.Object r11 = r11.F5(r4, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            androidx.compose.ui.unit.c0 r11 = (androidx.compose.ui.unit.c0) r11
            long r0 = r11.getPackedValue()
            long r9 = androidx.compose.ui.unit.c0.q(r9, r0)
            androidx.compose.ui.unit.c0 r9 = androidx.compose.ui.unit.c0.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.d.F5(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long H2(long consumed, long available, int source) {
        long j4;
        long H2 = this.connection.H2(consumed, available, source);
        androidx.compose.ui.input.nestedscroll.a B7 = B7();
        if (B7 != null) {
            j4 = B7.H2(i0.f.v(consumed, H2), i0.f.u(available, H2), source);
        } else {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74147c;
        }
        return i0.f.v(H2, j4);
    }

    public final void H7(@l androidx.compose.ui.input.nestedscroll.a connection, @m androidx.compose.ui.input.nestedscroll.b dispatcher) {
        this.connection = connection;
        F7(dispatcher);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long i5(long available, int source) {
        long j4;
        androidx.compose.ui.input.nestedscroll.a B7 = B7();
        if (B7 != null) {
            j4 = B7.i5(available, source);
        } else {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74147c;
        }
        return i0.f.v(j4, this.connection.i5(i0.f.u(available, j4), source));
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        G7();
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        D7();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w0(long r16, long r18, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.d.a
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.d$a r2 = (androidx.compose.ui.input.nestedscroll.d.a) r2
            int r3 = r2.f18677g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f18677g = r3
            goto L1b
        L16:
            androidx.compose.ui.input.nestedscroll.d$a r2 = new androidx.compose.ui.input.nestedscroll.d$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f18675e
            kotlin.coroutines.intrinsics.a r9 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r3 = r2.f18677g
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L45
            if (r3 == r4) goto L37
            if (r3 != r10) goto L2f
            long r2 = r2.f18673c
            kotlin.a1.n(r1)
            goto L8a
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            long r3 = r2.f18674d
            long r5 = r2.f18673c
            java.lang.Object r7 = r2.f18672b
            androidx.compose.ui.input.nestedscroll.d r7 = (androidx.compose.ui.input.nestedscroll.d) r7
            kotlin.a1.n(r1)
            r13 = r3
            r11 = r5
            goto L63
        L45:
            kotlin.a1.n(r1)
            androidx.compose.ui.input.nestedscroll.a r3 = r0.connection
            r2.f18672b = r0
            r11 = r16
            r2.f18673c = r11
            r13 = r18
            r2.f18674d = r13
            r2.f18677g = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.w0(r4, r6, r8)
            if (r1 != r9) goto L62
            return r9
        L62:
            r7 = r0
        L63:
            androidx.compose.ui.unit.c0 r1 = (androidx.compose.ui.unit.c0) r1
            long r4 = r1.getPackedValue()
            androidx.compose.ui.input.nestedscroll.a r3 = r7.B7()
            if (r3 == 0) goto L92
            long r6 = androidx.compose.ui.unit.c0.q(r11, r4)
            long r11 = androidx.compose.ui.unit.c0.p(r13, r4)
            r1 = 0
            r2.f18672b = r1
            r2.f18673c = r4
            r2.f18677g = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.w0(r4, r6, r8)
            if (r1 != r9) goto L89
            return r9
        L89:
            r2 = r13
        L8a:
            androidx.compose.ui.unit.c0 r1 = (androidx.compose.ui.unit.c0) r1
            long r4 = r1.getPackedValue()
            r13 = r2
            goto L9c
        L92:
            r13 = r4
            androidx.compose.ui.unit.c0$a r1 = androidx.compose.ui.unit.c0.INSTANCE
            r1.getClass()
            long r4 = androidx.compose.ui.unit.c0.a()
        L9c:
            long r1 = androidx.compose.ui.unit.c0.q(r13, r4)
            androidx.compose.ui.unit.c0 r1 = androidx.compose.ui.unit.c0.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.d.w0(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    /* renamed from: z7, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.a getConnection() {
        return this.connection;
    }
}
