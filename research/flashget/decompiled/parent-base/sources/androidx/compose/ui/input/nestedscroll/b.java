package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.modifier.j;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.r0;

/* compiled from: NestedScrollModifier.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0016\u0010,\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/b;", "", "<init>", "()V", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "c", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "a", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/modifier/j;", "g", "()Landroidx/compose/ui/modifier/j;", "k", "(Landroidx/compose/ui/modifier/j;)V", "modifierLocalNode", "Lkotlin/Function0;", "Lkotlinx/coroutines/r0;", "Lld/a;", "e", "()Lld/a;", "j", "(Lld/a;)V", "calculateNestedScrollScope", "Lkotlinx/coroutines/r0;", "i", "()Lkotlinx/coroutines/r0;", "l", "(Lkotlinx/coroutines/r0;)V", "scope", "f", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/a;", "h", "()Landroidx/compose/ui/input/nestedscroll/a;", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18657d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private j modifierLocalNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private ld.a<? extends r0> calculateNestedScrollScope = new a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private r0 scope;

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/r0;", "a", "()Lkotlinx/coroutines/r0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<r0> {
        a() {
            super(0);
        }

        @m
        public final r0 a() {
            return b.this.getScope();
        }

        @Override // ld.a
        public r0 invoke() {
            return b.this.getScope();
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {221}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.b$b, reason: collision with other inner class name */
    static final class C0336b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18662b;

        /* renamed from: d, reason: collision with root package name */
        int f18664d;

        C0336b(kotlin.coroutines.d<? super C0336b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f18662b = obj;
            this.f18664d |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {206}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18665b;

        /* renamed from: d, reason: collision with root package name */
        int f18667d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f18665b = obj;
            this.f18667d |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.b.C0336b
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.b$b r0 = (androidx.compose.ui.input.nestedscroll.b.C0336b) r0
            int r1 = r0.f18664d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18664d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.b$b r0 = new androidx.compose.ui.input.nestedscroll.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f18662b
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f18664d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.a1.n(r12)
            goto L45
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.a1.n(r12)
            androidx.compose.ui.input.nestedscroll.a r1 = r7.h()
            if (r1 == 0) goto L4c
            r6.f18664d = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.w0(r2, r4, r6)
            if (r12 != r0) goto L45
            return r0
        L45:
            androidx.compose.ui.unit.c0 r12 = (androidx.compose.ui.unit.c0) r12
            long r8 = r12.getPackedValue()
            goto L55
        L4c:
            androidx.compose.ui.unit.c0$a r8 = androidx.compose.ui.unit.c0.INSTANCE
            r8.getClass()
            long r8 = androidx.compose.ui.unit.c0.a()
        L55:
            androidx.compose.ui.unit.c0 r8 = androidx.compose.ui.unit.c0.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.b.a(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    public final long b(long consumed, long available, int source) {
        androidx.compose.ui.input.nestedscroll.a h4 = h();
        if (h4 != null) {
            return h4.H2(consumed, available, source);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.b.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.b$c r0 = (androidx.compose.ui.input.nestedscroll.b.c) r0
            int r1 = r0.f18667d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18667d = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.b$c r0 = new androidx.compose.ui.input.nestedscroll.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18665b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f18667d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.a1.n(r7)
            androidx.compose.ui.input.nestedscroll.a r7 = r4.h()
            if (r7 == 0) goto L48
            r0.f18667d = r3
            java.lang.Object r7 = r7.F5(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.unit.c0 r7 = (androidx.compose.ui.unit.c0) r7
            long r5 = r7.getPackedValue()
            goto L51
        L48:
            androidx.compose.ui.unit.c0$a r5 = androidx.compose.ui.unit.c0.INSTANCE
            r5.getClass()
            long r5 = androidx.compose.ui.unit.c0.a()
        L51:
            androidx.compose.ui.unit.c0 r5 = androidx.compose.ui.unit.c0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.b.c(long, kotlin.coroutines.d):java.lang.Object");
    }

    public final long d(long available, int source) {
        androidx.compose.ui.input.nestedscroll.a h4 = h();
        if (h4 != null) {
            return h4.i5(available, source);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    @l
    public final ld.a<r0> e() {
        return this.calculateNestedScrollScope;
    }

    @l
    public final r0 f() {
        r0 invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @m
    /* renamed from: g, reason: from getter */
    public final j getModifierLocalNode() {
        return this.modifierLocalNode;
    }

    @m
    public final androidx.compose.ui.input.nestedscroll.a h() {
        j jVar = this.modifierLocalNode;
        if (jVar != null) {
            return (d) jVar.v(e.a());
        }
        return null;
    }

    @m
    /* renamed from: i, reason: from getter */
    public final r0 getScope() {
        return this.scope;
    }

    public final void j(@l ld.a<? extends r0> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void k(@m j jVar) {
        this.modifierLocalNode = jVar;
    }

    public final void l(@m r0 r0Var) {
        this.scope = r0Var;
    }
}
