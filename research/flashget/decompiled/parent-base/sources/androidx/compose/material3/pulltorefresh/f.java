package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.c2;
import androidx.compose.material3.f5;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.saveable.n;
import androidx.compose.runtime.t4;
import fg.l;
import fg.m;
import i0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import ld.p;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0001\u0018\u0000 62\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\"\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f\"\u0004\b \u0010!R+\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R+\u0010,\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010'R+\u00103\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u0014\u00107\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0018R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/material3/pulltorefresh/f;", "Landroidx/compose/material3/pulltorefresh/e;", "", "initialRefreshing", "", "positionalThreshold", "Lkotlin/Function0;", "enabled", "<init>", "(ZFLld/a;)V", "Lkotlin/k2;", "h", "()V", "g", "Li0/f;", "available", "l", "(J)J", "velocity", "q", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "offset", "c", "k", "()F", "a", "F", "i", "Landroidx/compose/ui/input/nestedscroll/a;", "b", "Landroidx/compose/ui/input/nestedscroll/a;", "()Landroidx/compose/ui/input/nestedscroll/a;", "j", "(Landroidx/compose/ui/input/nestedscroll/a;)V", "nestedScrollConnection", "<set-?>", "Landroidx/compose/runtime/h2;", "n", "r", "(F)V", "distancePulled", "d", "p", "t", "_verticalOffset", "e", "Landroidx/compose/runtime/k2;", "o", "()Z", "s", "(Z)V", "_refreshing", "m", "adjustedDistancePulled", "f", "progress", "verticalOffset", "isRefreshing", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 1)
@f5
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,558:1\n76#2:559\n109#2,2:560\n76#2:562\n109#2,2:563\n81#3:565\n107#3,2:566\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n*L\n417#1:559\n417#1:560,2\n419#1:562\n419#1:563,2\n420#1:565\n420#1:566,2\n*E\n"})
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    public static final int f13555g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float positionalThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.compose.ui.input.nestedscroll.a nestedScrollConnection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final h2 distancePulled = androidx.compose.runtime.b.b(0.0f);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final h2 _verticalOffset = androidx.compose.runtime.b.b(0.0f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final k2 _refreshing;

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/pulltorefresh/f$a;", "", "<init>", "()V", "", "positionalThreshold", "Lkotlin/Function0;", "", "enabled", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/pulltorefresh/e;", "a", "(FLld/a;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.pulltorefresh.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: PullToRefresh.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/pulltorefresh/e;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/pulltorefresh/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.pulltorefresh.f$a$a, reason: collision with other inner class name */
        static final class C0288a extends n0 implements p<n, e, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0288a f13561b = new C0288a(2);

            C0288a() {
                super(2);
            }

            @Override // ld.p
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@l n nVar, @l e eVar) {
                return Boolean.valueOf(eVar.e());
            }
        }

        /* compiled from: PullToRefresh.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isRefreshing", "Landroidx/compose/material3/pulltorefresh/e;", "a", "(Z)Landroidx/compose/material3/pulltorefresh/e;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.pulltorefresh.f$a$b */
        static final class b extends n0 implements ld.l<Boolean, e> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f13562b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<Boolean> f13563c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f4, ld.a<Boolean> aVar) {
                super(1);
                this.f13562b = f4;
                this.f13563c = aVar;
            }

            @m
            public final e a(boolean z4) {
                return new f(z4, this.f13562b, this.f13563c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ e invoke(Boolean bool) {
                return a(bool.booleanValue());
            }
        }

        private Companion() {
        }

        @l
        public final androidx.compose.runtime.saveable.l<e, Boolean> a(float positionalThreshold, @l ld.a<Boolean> enabled) {
            return androidx.compose.runtime.saveable.m.a(C0288a.f13561b, new b(positionalThreshold, enabled));
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements p<Float, Float, kotlin.k2> {
        b() {
            super(2);
        }

        public final void a(float f4, float f5) {
            f.this.t(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4, Float f5) {
            a(f4.floatValue(), f5.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/pulltorefresh/f$c", "Landroidx/compose/ui/input/nestedscroll/a;", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements androidx.compose.ui.input.nestedscroll.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f13565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f13566c;

        /* compiled from: PullToRefresh.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$nestedScrollConnection$1", f = "PullToRefresh.kt", i = {}, l = {341}, m = "onPreFling-QWom1Mo", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            float f13567b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f13568c;

            /* renamed from: e, reason: collision with root package name */
            int f13570e;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                this.f13568c = obj;
                this.f13570e |= Integer.MIN_VALUE;
                return c.this.F5(0L, this);
            }
        }

        c(ld.a<Boolean> aVar, f fVar) {
            this.f13565b = aVar;
            this.f13566c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object F5(long r5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.f.c.a
                if (r0 == 0) goto L13
                r0 = r7
                androidx.compose.material3.pulltorefresh.f$c$a r0 = (androidx.compose.material3.pulltorefresh.f.c.a) r0
                int r1 = r0.f13570e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13570e = r1
                goto L18
            L13:
                androidx.compose.material3.pulltorefresh.f$c$a r0 = new androidx.compose.material3.pulltorefresh.f$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f13568c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f13570e
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                float r5 = r0.f13567b
                kotlin.a1.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.a1.n(r7)
                androidx.compose.material3.pulltorefresh.f r7 = r4.f13566c
                float r5 = androidx.compose.ui.unit.c0.n(r5)
                r6 = 0
                r0.f13567b = r6
                r0.f13570e = r3
                java.lang.Object r7 = r7.q(r5, r0)
                if (r7 != r1) goto L46
                return r1
            L46:
                r5 = r6
            L47:
                java.lang.Number r7 = (java.lang.Number) r7
                float r6 = r7.floatValue()
                long r5 = androidx.compose.ui.unit.d0.a(r5, r6)
                androidx.compose.ui.unit.c0 r5 = androidx.compose.ui.unit.c0.b(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.f.c.F5(long, kotlin.coroutines.d):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long H2(long consumed, long available, int source) {
            if (!this.f13565b.invoke().booleanValue()) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
            if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18687c) && i0.f.r(available) > 0.0f) {
                return this.f13566c.l(available);
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long i5(long available, int source) {
            if (!this.f13565b.invoke().booleanValue()) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
            if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18687c) && i0.f.r(available) < 0.0f) {
                return this.f13566c.l(available);
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
    }

    /* compiled from: PullToRefresh.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl", f = "PullToRefresh.kt", i = {0, 0}, l = {364}, m = "onRelease", n = {"this", "velocity"}, s = {"L$0", "F$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f13571b;

        /* renamed from: c, reason: collision with root package name */
        float f13572c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f13573d;

        /* renamed from: f, reason: collision with root package name */
        int f13575f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f13573d = obj;
            this.f13575f |= Integer.MIN_VALUE;
            return f.this.q(0.0f, this);
        }
    }

    public f(boolean z4, float f4, @l ld.a<Boolean> aVar) {
        k2 g4;
        this.positionalThreshold = f4;
        this.nestedScrollConnection = new c(aVar, this);
        g4 = t4.g(Boolean.valueOf(z4), null, 2, null);
        this._refreshing = g4;
    }

    private final float m() {
        return this.distancePulled.b() * 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean o() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final float p() {
        return this._verticalOffset.b();
    }

    private final void s(boolean z4) {
        this._refreshing.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(float f4) {
        this._verticalOffset.E(f4);
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    @l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.input.nestedscroll.a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @m
    public final Object c(float f4, @l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object f5 = c2.f(this._verticalOffset.b(), f4, 0.0f, null, new b(), dVar, 12, null);
        return f5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f5 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public float d() {
        return this._verticalOffset.b();
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public boolean e() {
        return o();
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public float f() {
        return m() / this.positionalThreshold;
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public void g() {
        t(0.0f);
        s(false);
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public void h() {
        s(true);
        t(this.positionalThreshold);
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    /* renamed from: i, reason: from getter */
    public float getPositionalThreshold() {
        return this.positionalThreshold;
    }

    @Override // androidx.compose.material3.pulltorefresh.e
    public void j(@l androidx.compose.ui.input.nestedscroll.a aVar) {
        this.nestedScrollConnection = aVar;
    }

    public final float k() {
        if (m() <= this.positionalThreshold) {
            return m();
        }
        float H = s.H(Math.abs(f()) - 1.0f, 0.0f, 2.0f);
        float pow = H - (((float) Math.pow(H, 2)) / 4);
        float f4 = this.positionalThreshold;
        return (pow * f4) + f4;
    }

    public final long l(long available) {
        float b5;
        if (o()) {
            b5 = 0.0f;
        } else {
            float t4 = s.t(i0.f.r(available) + this.distancePulled.b(), 0.0f);
            b5 = t4 - this.distancePulled.b();
            r(t4);
            t(k());
        }
        return g.a(0.0f, b5);
    }

    public final float n() {
        return this.distancePulled.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(float r6, @fg.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.f.d
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.f$d r0 = (androidx.compose.material3.pulltorefresh.f.d) r0
            int r1 = r0.f13575f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13575f = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.f$d r0 = new androidx.compose.material3.pulltorefresh.f$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13573d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f13575f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            float r6 = r0.f13572c
            java.lang.Object r0 = r0.f13571b
            androidx.compose.material3.pulltorefresh.f r0 = (androidx.compose.material3.pulltorefresh.f) r0
            kotlin.a1.n(r7)
            goto L61
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.a1.n(r7)
            boolean r7 = r5.o()
            if (r7 == 0) goto L45
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            return r6
        L45:
            float r7 = r5.m()
            float r2 = r5.positionalThreshold
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L54
            r5.h()
        L52:
            r0 = r5
            goto L61
        L54:
            r0.f13571b = r5
            r0.f13572c = r6
            r0.f13575f = r3
            java.lang.Object r7 = r5.c(r4, r0)
            if (r7 != r1) goto L52
            return r1
        L61:
            androidx.compose.runtime.h2 r7 = r0.distancePulled
            float r7 = r7.b()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L6d
        L6b:
            r6 = r4
            goto L72
        L6d:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L72
            goto L6b
        L72:
            r0.r(r4)
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.f.q(float, kotlin.coroutines.d):java.lang.Object");
    }

    public final void r(float f4) {
        this.distancePulled.E(f4);
    }
}
