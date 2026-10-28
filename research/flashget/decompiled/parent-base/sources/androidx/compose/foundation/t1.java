package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.t4;
import androidx.compose.ui.q;
import i0.f;
import kotlin.Metadata;

/* compiled from: Magnifier.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u009b\u0001\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0092\u0001\u0010!\u001a\u00020\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00122\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0013\u0010'\u001a\u00020\u000e*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\u000e*\u00020-H\u0016¢\u0006\u0004\b.\u0010/R3\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R5\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bN\u0010=\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR(\u0010\u0017\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010?\"\u0004\bS\u0010AR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010C\u001a\u0004\bU\u0010E\"\u0004\bV\u0010GR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR1\u0010m\u001a\u00020\t2\u0006\u0010h\u001a\u00020\t8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\u001c\u0010o\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010IR\u001e\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Landroidx/compose/foundation/t1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/node/k1;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Li0/f;", "Lkotlin/u;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/l;", "Lkotlin/k2;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/l2;", "platformMagnifierFactory", "<init>", "(Lld/l;Lld/l;Lld/l;FZJFFZLandroidx/compose/foundation/l2;Lkotlin/jvm/internal/w;)V", "R7", "()V", "e8", "f8", "d8", "(Lld/l;Lld/l;FZJFFZLld/l;Landroidx/compose/foundation/l2;)V", "i7", "j7", "d2", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "p", "Lld/l;", "O7", "()Lld/l;", "a8", "(Lld/l;)V", "q", "K7", "W7", "r", "L7", "X7", "s", "F", "Q7", "()F", "c8", "(F)V", "t", "Z", "P7", "()Z", "b8", "(Z)V", "u", "J", "N7", "()J", "Z7", "(J)V", "v", "I7", "U7", "w", "J7", "V7", "x", "H7", "T7", "y", "Landroidx/compose/foundation/l2;", "M7", "()Landroidx/compose/foundation/l2;", "Y7", "(Landroidx/compose/foundation/l2;)V", "Landroid/view/View;", "z", "Landroid/view/View;", "view", "A", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/foundation/k2;", "B", "Landroidx/compose/foundation/k2;", "magnifier", "<set-?>", "C", "Landroidx/compose/runtime/k2;", "G7", "S7", "anchorPositionInRoot", "D", "sourceCenterInRoot", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/ui/unit/u;", "previousSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n81#2:468\n107#2,2:469\n1#3:471\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n295#1:468\n295#1:469,2\n*E\n"})
/* loaded from: classes.dex */
public final class t1 extends q.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.s, androidx.compose.ui.node.q, androidx.compose.ui.node.y1, androidx.compose.ui.node.k1 {
    public static final int F = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.d density;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.m
    private k2 magnifier;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 anchorPositionInRoot;

    /* renamed from: D, reason: from kotlin metadata */
    private long sourceCenterInRoot;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.u previousSize;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.unit.d, i0.f> sourceCenter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.unit.d, i0.f> magnifierCenter;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> onSizeChanged;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean useTextDefault;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float elevation;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean clippingEnabled;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l2 platformMagnifierFactory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private View view;

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {
        a() {
            super(0);
        }

        public final long a() {
            return t1.this.sourceCenterInRoot;
        }

        @Override // ld.a
        public i0.f invoke() {
            return i0.f.d(t1.this.sourceCenterInRoot);
        }
    }

    /* compiled from: Magnifier.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierNode$draw$1", f = "Magnifier.android.kt", i = {}, l = {447}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7086b;

        /* compiled from: Magnifier.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f7088b = new a(1);

            a() {
                super(1);
            }

            public final void a(long j4) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(Long l4) {
                l4.longValue();
                return kotlin.k2.f75408a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return t1.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7086b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = a.f7088b;
                this.f7086b = 1;
                if (androidx.compose.runtime.b2.d(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            k2 k2Var = t1.this.magnifier;
            if (k2Var != null) {
                k2Var.e();
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode$onObservedReadsChanged$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n1#2:468\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        c() {
            super(0);
        }

        public final void a() {
            View view = t1.this.view;
            View view2 = (View) androidx.compose.ui.node.i.a(t1.this, androidx.compose.ui.platform.o0.k());
            t1.this.view = view2;
            androidx.compose.ui.unit.d dVar = t1.this.density;
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) androidx.compose.ui.node.i.a(t1.this, androidx.compose.ui.platform.h1.i());
            t1.this.density = dVar2;
            if (t1.this.magnifier == null || !kotlin.jvm.internal.l0.g(view2, view) || !kotlin.jvm.internal.l0.g(dVar2, dVar)) {
                t1.this.R7();
            }
            t1.this.e8();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ t1(ld.l lVar, ld.l lVar2, ld.l lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, l2 l2Var, kotlin.jvm.internal.w wVar) {
        this(lVar, lVar2, lVar3, f4, z4, j4, f5, f6, z5, l2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long G7() {
        return ((i0.f) this.anchorPositionInRoot.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R7() {
        androidx.compose.ui.unit.d dVar;
        k2 k2Var = this.magnifier;
        if (k2Var != null) {
            k2Var.dismiss();
        }
        View view = this.view;
        if (view == null || (dVar = this.density) == null) {
            return;
        }
        this.magnifier = this.platformMagnifierFactory.a(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, dVar, this.zoom);
        f8();
    }

    private final void S7(long j4) {
        this.anchorPositionInRoot.setValue(i0.f.d(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e8() {
        androidx.compose.ui.unit.d dVar;
        long j4;
        long j5;
        k2 k2Var = this.magnifier;
        if (k2Var == null || (dVar = this.density) == null) {
            return;
        }
        long packedValue = this.sourceCenter.invoke(dVar).getPackedValue();
        if (i0.g.d(G7()) && i0.g.d(packedValue)) {
            j4 = i0.f.v(G7(), packedValue);
        } else {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74149e;
        }
        this.sourceCenterInRoot = j4;
        if (!i0.g.d(j4)) {
            k2Var.dismiss();
            return;
        }
        ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar = this.magnifierCenter;
        if (lVar != null) {
            i0.f d5 = i0.f.d(lVar.invoke(dVar).getPackedValue());
            if (!i0.g.d(d5.getPackedValue())) {
                d5 = null;
            }
            if (d5 != null) {
                j5 = i0.f.v(G7(), d5.getPackedValue());
                k2Var.d(this.sourceCenterInRoot, j5, this.zoom);
                f8();
            }
        }
        i0.f.INSTANCE.getClass();
        j5 = i0.f.f74149e;
        k2Var.d(this.sourceCenterInRoot, j5, this.zoom);
        f8();
    }

    private final void f8() {
        androidx.compose.ui.unit.d dVar;
        k2 k2Var = this.magnifier;
        if (k2Var == null || (dVar = this.density) == null || androidx.compose.ui.unit.u.g(k2Var.c(), this.previousSize)) {
            return;
        }
        ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar = this.onSizeChanged;
        if (lVar != null) {
            lVar.invoke(androidx.compose.ui.unit.l.c(dVar.n(androidx.compose.ui.unit.v.f(k2Var.c()))));
        }
        this.previousSize = androidx.compose.ui.unit.u.b(k2Var.c());
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.G6();
        kotlinx.coroutines.k.f(V6(), null, null, new b(null), 3, null);
    }

    /* renamed from: H7, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: I7, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: J7, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    @fg.m
    public final ld.l<androidx.compose.ui.unit.d, i0.f> K7() {
        return this.magnifierCenter;
    }

    @fg.m
    public final ld.l<androidx.compose.ui.unit.l, kotlin.k2> L7() {
        return this.onSizeChanged;
    }

    @fg.l
    /* renamed from: M7, reason: from getter */
    public final l2 getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    /* renamed from: N7, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.d, i0.f> O7() {
        return this.sourceCenter;
    }

    /* renamed from: P7, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    /* renamed from: Q7, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    public final void T7(boolean z4) {
        this.clippingEnabled = z4;
    }

    public final void U7(float f4) {
        this.cornerRadius = f4;
    }

    public final void V7(float f4) {
        this.elevation = f4;
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        S7(androidx.compose.ui.layout.v.f(coordinates));
    }

    public final void W7(@fg.m ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar) {
        this.magnifierCenter = lVar;
    }

    public final void X7(@fg.m ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar) {
        this.onSizeChanged = lVar;
    }

    public final void Y7(@fg.l l2 l2Var) {
        this.platformMagnifierFactory = l2Var;
    }

    public final void Z7(long j4) {
        this.size = j4;
    }

    public final void a8(@fg.l ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar) {
        this.sourceCenter = lVar;
    }

    public final void b8(boolean z4) {
        this.useTextDefault = z4;
    }

    public final void c8(float f4) {
        this.zoom = f4;
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        androidx.compose.ui.node.l1.a(this, new c());
    }

    public final void d8(@fg.l ld.l<? super androidx.compose.ui.unit.d, i0.f> sourceCenter, @fg.m ld.l<? super androidx.compose.ui.unit.d, i0.f> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @fg.m ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> onSizeChanged, @fg.l l2 platformMagnifierFactory) {
        float f4 = this.zoom;
        long j4 = this.size;
        float f5 = this.cornerRadius;
        float f6 = this.elevation;
        boolean z4 = this.clippingEnabled;
        l2 l2Var = this.platformMagnifierFactory;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        if (this.magnifier == null || ((zoom != f4 && !platformMagnifierFactory.b()) || !androidx.compose.ui.unit.l.l(size, j4) || !androidx.compose.ui.unit.h.l(cornerRadius, f5) || !androidx.compose.ui.unit.h.l(elevation, f6) || clippingEnabled != z4 || !kotlin.jvm.internal.l0.g(platformMagnifierFactory, l2Var))) {
            R7();
        }
        e8();
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        zVar.b(u1.a(), new a());
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        d2();
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        k2 k2Var = this.magnifier;
        if (k2Var != null) {
            k2Var.dismiss();
        }
        this.magnifier = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1(ld.l r11, ld.l r12, ld.l r13, float r14, boolean r15, long r16, float r18, float r19, boolean r20, androidx.compose.foundation.l2 r21, int r22, kotlin.jvm.internal.w r23) {
        /*
            r10 = this;
            r0 = r22
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 4
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            r2 = r13
        L10:
            r3 = r0 & 8
            if (r3 == 0) goto L17
            r3 = 2143289344(0x7fc00000, float:NaN)
            goto L18
        L17:
            r3 = r14
        L18:
            r4 = r0 & 16
            if (r4 == 0) goto L1e
            r4 = 0
            goto L1f
        L1e:
            r4 = r15
        L1f:
            r5 = r0 & 32
            if (r5 == 0) goto L2d
            androidx.compose.ui.unit.l$a r5 = androidx.compose.ui.unit.l.INSTANCE
            r5.getClass()
            long r5 = androidx.compose.ui.unit.l.a()
            goto L2f
        L2d:
            r5 = r16
        L2f:
            r7 = r0 & 64
            if (r7 == 0) goto L3d
            androidx.compose.ui.unit.h$a r7 = androidx.compose.ui.unit.h.INSTANCE
            r7.getClass()
            float r7 = androidx.compose.ui.unit.h.c()
            goto L3f
        L3d:
            r7 = r18
        L3f:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L4d
            androidx.compose.ui.unit.h$a r8 = androidx.compose.ui.unit.h.INSTANCE
            r8.getClass()
            float r8 = androidx.compose.ui.unit.h.c()
            goto L4f
        L4d:
            r8 = r19
        L4f:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L55
            r9 = 1
            goto L57
        L55:
            r9 = r20
        L57:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L62
            androidx.compose.foundation.l2$a r0 = androidx.compose.foundation.l2.INSTANCE
            androidx.compose.foundation.l2 r0 = r0.a()
            goto L64
        L62:
            r0 = r21
        L64:
            r12 = r10
            r13 = r11
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.t1.<init>(ld.l, ld.l, ld.l, float, boolean, long, float, float, boolean, androidx.compose.foundation.l2, int, kotlin.jvm.internal.w):void");
    }

    private t1(ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar, ld.l<? super androidx.compose.ui.unit.d, i0.f> lVar2, ld.l<? super androidx.compose.ui.unit.l, kotlin.k2> lVar3, float f4, boolean z4, long j4, float f5, float f6, boolean z5, l2 l2Var) {
        androidx.compose.runtime.k2 g4;
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f4;
        this.useTextDefault = z4;
        this.size = j4;
        this.cornerRadius = f5;
        this.elevation = f6;
        this.clippingEnabled = z5;
        this.platformMagnifierFactory = l2Var;
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        g4 = t4.g(i0.f.d(i0.f.f74149e), null, 2, null);
        this.anchorPositionInRoot = g4;
        companion.getClass();
        this.sourceCenterInRoot = i0.f.f74149e;
    }
}
