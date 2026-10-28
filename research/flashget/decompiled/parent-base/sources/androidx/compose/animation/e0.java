package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.b5;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J&\u0010\"\u001a\u00020!*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0017R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010T\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020\u001f8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010N\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R4\u0010e\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030^\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060_0]¢\u0006\u0002\b`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR4\u0010h\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030^\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0_0]¢\u0006\u0002\b`8\u0006¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010dR\u0013\u0010j\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bi\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/animation/e0;", "Landroidx/compose/animation/p0;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "transition", "Landroidx/compose/animation/core/e2$a;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/animation/core/p;", "sizeAnimation", "Landroidx/compose/ui/unit/q;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/f0;", "enter", "Landroidx/compose/animation/h0;", "exit", "Landroidx/compose/animation/o0;", "graphicsLayerBlock", "<init>", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Landroidx/compose/animation/o0;)V", "targetState", "fullSize", "S7", "(Landroidx/compose/animation/b0;J)J", "Lkotlin/k2;", "i7", "()V", "U7", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "T7", "q", "Landroidx/compose/animation/core/e2;", "I7", "()Landroidx/compose/animation/core/e2;", "R7", "(Landroidx/compose/animation/core/e2;)V", "r", "Landroidx/compose/animation/core/e2$a;", "E7", "()Landroidx/compose/animation/core/e2$a;", "P7", "(Landroidx/compose/animation/core/e2$a;)V", "s", "D7", "O7", "t", "G7", "Q7", "u", "Landroidx/compose/animation/f0;", "A7", "()Landroidx/compose/animation/f0;", "K7", "(Landroidx/compose/animation/f0;)V", "v", "Landroidx/compose/animation/h0;", "B7", "()Landroidx/compose/animation/h0;", "L7", "(Landroidx/compose/animation/h0;)V", "w", "Landroidx/compose/animation/o0;", "C7", "()Landroidx/compose/animation/o0;", "M7", "(Landroidx/compose/animation/o0;)V", "", "x", "Z", "lookaheadConstraintsAvailable", "y", "J", "lookaheadSize", "value", "z", "N7", "(J)V", "lookaheadConstraints", "Landroidx/compose/ui/c;", "A", "Landroidx/compose/ui/c;", "z7", "()Landroidx/compose/ui/c;", "J7", "(Landroidx/compose/ui/c;)V", "currentAlignment", "Lkotlin/Function1;", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Lkotlin/u;", "B", "Lld/l;", "F7", "()Lld/l;", "sizeTransitionSpec", "C", "H7", "slideSpec", "y7", "alignment", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1246:1\n79#2:1247\n86#2:1248\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1128#1:1247\n1170#1:1248\n*E\n"})
/* loaded from: classes.dex */
final class e0 extends p0 {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.c currentAlignment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e2<b0> transition;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> sizeAnimation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> offsetAnimation;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> slideAnimation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f0 enter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private h0 exit;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private o0 graphicsLayerBlock;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = u.c();

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> sizeTransitionSpec = new h();

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.q>> slideSpec = new i();

    /* compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3103a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3103a = iArr;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f3104b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1 i1Var) {
            super(1);
            this.f3104b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f3104b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f3105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3107d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<q4, k2> f3108e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i1 i1Var, long j4, long j5, ld.l<? super q4, k2> lVar) {
            super(1);
            this.f3105b = i1Var;
            this.f3106c = j4;
            this.f3107d = j5;
            this.f3108e = lVar;
        }

        public final void a(@fg.l i1.a aVar) {
            i1 i1Var = this.f3105b;
            int m4 = androidx.compose.ui.unit.q.m(this.f3106c);
            long j4 = this.f3107d;
            aVar.t(i1Var, ((int) (j4 >> 32)) + m4, ((int) (this.f3106c & 4294967295L)) + ((int) (j4 & 4294967295L)), 0.0f, this.f3108e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "Landroidx/compose/ui/unit/u;", "a", "(Landroidx/compose/animation/b0;)J"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<b0, androidx.compose.ui.unit.u> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j4) {
            super(1);
            this.f3110c = j4;
        }

        public final long a(@fg.l b0 b0Var) {
            return e0.this.S7(b0Var, this.f3110c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(b0 b0Var) {
            return androidx.compose.ui.unit.u.b(a(b0Var));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.q>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f3111b = new e(1);

        e() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> a(@fg.l e2.b<b0> bVar) {
            y1 y1Var;
            y1Var = d0.f3053c;
            return y1Var;
        }

        @Override // ld.l
        public androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> invoke(e2.b<b0> bVar) {
            y1 y1Var;
            y1Var = d0.f3053c;
            return y1Var;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/b0;)J"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<b0, androidx.compose.ui.unit.q> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j4) {
            super(1);
            this.f3113c = j4;
        }

        public final long a(@fg.l b0 b0Var) {
            return e0.this.U7(b0Var, this.f3113c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(b0 b0Var) {
            return androidx.compose.ui.unit.q.b(a(b0Var));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/b0;", "it", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/b0;)J"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<b0, androidx.compose.ui.unit.q> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j4) {
            super(1);
            this.f3115c = j4;
        }

        public final long a(@fg.l b0 b0Var) {
            return e0.this.T7(b0Var, this.f3115c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(b0 b0Var) {
            return androidx.compose.ui.unit.q.b(a(b0Var));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/u;", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> {
        h() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> invoke(@fg.l e2.b<b0> bVar) {
            y1 y1Var;
            b0 b0Var = b0.PreEnter;
            b0 b0Var2 = b0.Visible;
            androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var = null;
            if (bVar.j(b0Var, b0Var2)) {
                v i4 = e0.this.getEnter().getData().i();
                if (i4 != null) {
                    p0Var = i4.h();
                }
            } else if (bVar.j(b0Var2, b0.PostExit)) {
                v i5 = e0.this.getExit().getData().i();
                if (i5 != null) {
                    p0Var = i5.h();
                }
            } else {
                p0Var = d0.f3054d;
            }
            if (p0Var != null) {
                return p0Var;
            }
            y1Var = d0.f3054d;
            return y1Var;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/b0;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.q>> {
        i() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> invoke(@fg.l e2.b<b0> bVar) {
            y1 y1Var;
            y1 y1Var2;
            androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> e4;
            y1 y1Var3;
            androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> e5;
            b0 b0Var = b0.PreEnter;
            b0 b0Var2 = b0.Visible;
            if (bVar.j(b0Var, b0Var2)) {
                y0 n4 = e0.this.getEnter().getData().n();
                if (n4 != null && (e5 = n4.e()) != null) {
                    return e5;
                }
                y1Var3 = d0.f3053c;
                return y1Var3;
            }
            if (!bVar.j(b0Var2, b0.PostExit)) {
                y1Var = d0.f3053c;
                return y1Var;
            }
            y0 n5 = e0.this.getExit().getData().n();
            if (n5 != null && (e4 = n5.e()) != null) {
                return e4;
            }
            y1Var2 = d0.f3053c;
            return y1Var2;
        }
    }

    public e0(@fg.l e2<b0> e2Var, @fg.m e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar2, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar3, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l o0 o0Var) {
        this.transition = e2Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = f0Var;
        this.exit = h0Var;
        this.graphicsLayerBlock = o0Var;
    }

    private final void N7(long j4) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j4;
    }

    @fg.l
    /* renamed from: A7, reason: from getter */
    public final f0 getEnter() {
        return this.enter;
    }

    @fg.l
    /* renamed from: B7, reason: from getter */
    public final h0 getExit() {
        return this.exit;
    }

    @fg.l
    /* renamed from: C7, reason: from getter */
    public final o0 getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> D7() {
        return this.offsetAnimation;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> E7() {
        return this.sizeAnimation;
    }

    @fg.l
    public final ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> F7() {
        return this.sizeTransitionSpec;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> G7() {
        return this.slideAnimation;
    }

    @fg.l
    public final ld.l<e2.b<b0>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.q>> H7() {
        return this.slideSpec;
    }

    @fg.l
    public final e2<b0> I7() {
        return this.transition;
    }

    public final void J7(@fg.m androidx.compose.ui.c cVar) {
        this.currentAlignment = cVar;
    }

    public final void K7(@fg.l f0 f0Var) {
        this.enter = f0Var;
    }

    public final void L7(@fg.l h0 h0Var) {
        this.exit = h0Var;
    }

    public final void M7(@fg.l o0 o0Var) {
        this.graphicsLayerBlock = o0Var;
    }

    public final void O7(@fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void P7(@fg.m e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void Q7(@fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar) {
        this.slideAnimation = aVar;
    }

    public final void R7(@fg.l e2<b0> e2Var) {
        this.transition = e2Var;
    }

    public final long S7(@fg.l b0 targetState, long fullSize) {
        ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> j4;
        ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> j5;
        int i4 = a.f3103a[targetState.ordinal()];
        if (i4 == 1) {
            return fullSize;
        }
        if (i4 == 2) {
            v i5 = this.enter.getData().i();
            return (i5 == null || (j4 = i5.j()) == null) ? fullSize : j4.invoke(androidx.compose.ui.unit.u.b(fullSize)).getPackedValue();
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        v i6 = this.exit.getData().i();
        return (i6 == null || (j5 = i6.j()) == null) ? fullSize : j5.invoke(androidx.compose.ui.unit.u.b(fullSize)).getPackedValue();
    }

    public final long T7(@fg.l b0 targetState, long fullSize) {
        long j4;
        long j5;
        ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> f4;
        ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> f5;
        y0 n4 = this.enter.getData().n();
        if (n4 == null || (f5 = n4.f()) == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j4 = f5.invoke(androidx.compose.ui.unit.u.b(fullSize)).getPackedValue();
        }
        y0 n5 = this.exit.getData().n();
        if (n5 == null || (f4 = n5.f()) == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j5 = f4.invoke(androidx.compose.ui.unit.u.b(fullSize)).getPackedValue();
        }
        int i4 = a.f3103a[targetState.ordinal()];
        if (i4 == 1) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        if (i4 == 2) {
            return j4;
        }
        if (i4 == 3) {
            return j5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long U7(@fg.l b0 targetState, long fullSize) {
        if (this.currentAlignment == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        if (y7() == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        if (kotlin.jvm.internal.l0.g(this.currentAlignment, y7())) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        int i4 = a.f3103a[targetState.ordinal()];
        if (i4 == 1) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        if (i4 == 2) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        v i5 = this.exit.getData().i();
        if (i5 == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            return androidx.compose.ui.unit.q.f21519c;
        }
        long packedValue = i5.j().invoke(androidx.compose.ui.unit.u.b(fullSize)).getPackedValue();
        androidx.compose.ui.c y7 = y7();
        kotlin.jvm.internal.l0.m(y7);
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        long a5 = y7.a(fullSize, packedValue, wVar);
        androidx.compose.ui.c cVar = this.currentAlignment;
        kotlin.jvm.internal.l0.m(cVar);
        long a6 = cVar.a(fullSize, packedValue, wVar);
        return androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(a5) - ((int) (a6 >> 32)), ((int) (a5 & 4294967295L)) - ((int) (a6 & 4294967295L)));
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        long j5;
        long j6;
        long j7;
        b5<androidx.compose.ui.unit.q> a5;
        b5<androidx.compose.ui.unit.q> a6;
        if (this.transition.h() == this.transition.o()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            androidx.compose.ui.c y7 = y7();
            if (y7 == null) {
                y7 = androidx.compose.ui.c.INSTANCE.C();
            }
            this.currentAlignment = y7;
        }
        if (o0Var.E1()) {
            i1 m02 = l0Var.m0(j4);
            long a7 = androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight());
            this.lookaheadSize = a7;
            N7(j4);
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.u.m(a7), (int) (a7 & 4294967295L), null, new b(m02), 4, null);
        }
        ld.l<q4, k2> a8 = this.graphicsLayerBlock.a();
        i1 m03 = l0Var.m0(j4);
        long a10 = androidx.compose.ui.unit.v.a(m03.getWidth(), m03.getHeight());
        long j10 = u.d(this.lookaheadSize) ? this.lookaheadSize : a10;
        e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar = this.sizeAnimation;
        b5<androidx.compose.ui.unit.u> a11 = aVar != null ? aVar.a(this.sizeTransitionSpec, new d(j10)) : null;
        if (a11 != null) {
            a10 = a11.getValue().getPackedValue();
        }
        long d5 = androidx.compose.ui.unit.c.d(j4, a10);
        e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar2 = this.offsetAnimation;
        if (aVar2 == null || (a6 = aVar2.a(e.f3111b, new f(j10))) == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j5 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j5 = a6.getValue().getPackedValue();
        }
        long j11 = j5;
        e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar3 = this.slideAnimation;
        if (aVar3 == null || (a5 = aVar3.a(this.slideSpec, new g(j10))) == null) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j6 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j6 = a5.getValue().getPackedValue();
        }
        androidx.compose.ui.c cVar = this.currentAlignment;
        if (cVar != null) {
            j7 = cVar.a(j10, d5, androidx.compose.ui.unit.w.Ltr);
        } else {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j7 = androidx.compose.ui.unit.q.f21519c;
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.u.m(d5), (int) (d5 & 4294967295L), null, new c(m03, androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j7) + ((int) (j6 >> 32)), ((int) (j7 & 4294967295L)) + ((int) (j6 & 4294967295L))), j11, a8), 4, null);
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = u.c();
    }

    @fg.m
    public final androidx.compose.ui.c y7() {
        androidx.compose.ui.c g4;
        if (this.transition.m().j(b0.PreEnter, b0.Visible)) {
            v i4 = this.enter.getData().i();
            if (i4 == null || (g4 = i4.g()) == null) {
                v i5 = this.exit.getData().i();
                if (i5 != null) {
                    return i5.g();
                }
                return null;
            }
        } else {
            v i6 = this.exit.getData().i();
            if (i6 == null || (g4 = i6.g()) == null) {
                v i7 = this.enter.getData().i();
                if (i7 != null) {
                    return i7.g();
                }
                return null;
            }
        }
        return g4;
    }

    @fg.m
    /* renamed from: z7, reason: from getter */
    public final androidx.compose.ui.c getCurrentAlignment() {
        return this.currentAlignment;
    }
}
