package androidx.compose.foundation;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R+\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010\u0005R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001b\u00107\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001d\u00106R\u001b\u00109\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b.\u00106R$\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\u0005R\u0011\u0010A\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u00106¨\u0006D"}, d2 = {"Landroidx/compose/foundation/w2;", "Landroidx/compose/foundation/gestures/w0;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "b", "(F)F", "value", "Landroidx/compose/animation/core/k;", "animationSpec", "m", "(ILandroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "<set-?>", "a", "Landroidx/compose/runtime/i2;", "r", "()I", "v", "s", "w", "viewportSize", "Landroidx/compose/foundation/interaction/k;", "c", "Landroidx/compose/foundation/interaction/k;", "p", "()Landroidx/compose/foundation/interaction/k;", "internalInteractionSource", "Landroidx/compose/runtime/i2;", "d", "_maxValueState", "e", "F", "accumulator", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "", "g", "Landroidx/compose/runtime/b5;", "()Z", "canScrollForward", "h", "canScrollBackward", "newMax", "q", "u", "maxValue", "Landroidx/compose/foundation/interaction/i;", "o", "()Landroidx/compose/foundation/interaction/i;", "interactionSource", "isScrollInProgress", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@kotlin.jvm.internal.r1({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n75#2:460\n108#2,2:461\n75#2:473\n108#2,2:474\n495#3,4:463\n500#3:472\n129#4,5:467\n81#5:476\n81#5:477\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n99#1:460\n99#1:461,2\n120#1:473\n120#1:474,2\n109#1:463,4\n109#1:472\n109#1:467,5\n164#1:476\n166#1:477\n*E\n"})
/* loaded from: classes.dex */
public final class w2 implements androidx.compose.foundation.gestures.w0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f9218j = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<w2, ?> f9219k = androidx.compose.runtime.saveable.m.a(a.f9228b, b.f9229b);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 viewportSize = androidx.compose.runtime.b.c(0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k internalInteractionSource = androidx.compose.foundation.interaction.j.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.i2 _maxValueState = androidx.compose.runtime.b.c(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.w0 scrollableState = androidx.compose.foundation.gestures.x0.a(new f());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 canScrollForward = o4.e(new e());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 canScrollBackward = o4.e(new d());

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/w2;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/w2;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, w2, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9228b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l w2 w2Var) {
            return Integer.valueOf(w2Var.r());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/w2;", "a", "(I)Landroidx/compose/foundation/w2;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Integer, w2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f9229b = new b(1);

        b() {
            super(1);
        }

        @fg.m
        public final w2 a(int i4) {
            return new w2(i4);
        }

        @Override // ld.l
        public w2 invoke(Integer num) {
            return new w2(num.intValue());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/w2$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/w2;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.w2$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<w2, ?> a() {
            return w2.f9219k;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(w2.this.r() > 0);
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(w2.this.r() < w2.this.q());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {
        f() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            float r4 = w2.this.accumulator + w2.this.r() + f4;
            float H = kotlin.ranges.s.H(r4, 0.0f, w2.this.q());
            boolean z4 = r4 == H;
            float r5 = H - w2.this.r();
            int L0 = kotlin.math.b.L0(r5);
            w2 w2Var = w2.this;
            w2Var.v(w2Var.r() + L0);
            w2.this.accumulator = r5 - L0;
            if (!z4) {
                f4 = r5;
            }
            return Float.valueOf(f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    public w2(int i4) {
        this.value = androidx.compose.runtime.b.c(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object n(w2 w2Var, int i4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            kVar = new androidx.compose.animation.core.y1(0.0f, 0.0f, null, 7, null);
        }
        return w2Var.m(i4, kVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i4) {
        this.value.k(i4);
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean a() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public float b(float delta) {
        return this.scrollableState.b(delta);
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean d() {
        return this.scrollableState.d();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    @fg.m
    public Object f(@fg.l a2 a2Var, @fg.l ld.p<? super androidx.compose.foundation.gestures.q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object f4 = this.scrollableState.f(a2Var, pVar, dVar);
        return f4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f4 : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object m(int i4, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object a5 = androidx.compose.foundation.gestures.p0.a(this, i4 - this.value.f(), kVar, dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
    }

    @fg.l
    public final androidx.compose.foundation.interaction.i o() {
        return this.internalInteractionSource;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int q() {
        return this._maxValueState.f();
    }

    public final int r() {
        return this.value.f();
    }

    public final int s() {
        return this.viewportSize.f();
    }

    @fg.m
    public final Object t(int i4, @fg.l kotlin.coroutines.d<? super Float> dVar) {
        return androidx.compose.foundation.gestures.p0.c(this, i4 - this.value.f(), dVar);
    }

    public final void u(int i4) {
        this._maxValueState.k(i4);
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                if (this.value.f() > i4) {
                    v(i4);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                c5.y(r4);
            } catch (Throwable th) {
                c5.y(r4);
                throw th;
            }
        } finally {
            c5.d();
        }
    }

    public final void w(int i4) {
        this.viewportSize.k(i4);
    }
}
