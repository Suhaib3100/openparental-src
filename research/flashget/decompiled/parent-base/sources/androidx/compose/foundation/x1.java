package androidx.compose.foundation;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.k2;

/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J@\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010*J#\u0010-\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010*J#\u0010.\u001a\u00020\u0005*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010*J\u0013\u00100\u001a\u00020\u0011*\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00102R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R+\u0010>\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010B\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R+\u0010J\u001a\u00020C2\u0006\u00107\u001a\u00020C8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR+\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR1\u0010\b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010E\u001a\u0004\bU\u0010;\"\u0004\bV\u0010=R \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010`\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010;R\u0014\u0010c\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/foundation/x1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/focus/i;", "", "iterations", "Landroidx/compose/foundation/v1;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/z1;", "spacing", "Landroidx/compose/ui/unit/h;", "velocity", "<init>", "(IIIILandroidx/compose/foundation/z1;FLkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "Q7", "()V", "R7", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "i7", "j7", "X7", "(IIIILandroidx/compose/foundation/z1;F)V", "Landroidx/compose/ui/focus/j0;", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "V", "width", "G", "p", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "I", "q", "r", "s", "F", "<set-?>", "t", "Landroidx/compose/runtime/i2;", "L7", "()I", "U7", "(I)V", "contentWidth", "u", "K7", "T7", "containerWidth", "", "v", "Landroidx/compose/runtime/k2;", "N7", "()Z", "V7", "(Z)V", "hasFocus", "Lkotlinx/coroutines/k2;", "w", "Lkotlinx/coroutines/k2;", "animationJob", "x", "O7", "()Landroidx/compose/foundation/z1;", "W7", "(Landroidx/compose/foundation/z1;)V", "y", "J7", "S7", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "z", "Landroidx/compose/animation/core/b;", "offset", "A", "Landroidx/compose/runtime/b5;", "P7", "spacingPx", "M7", "()F", "direction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,515:1\n75#2:516\n108#2,2:517\n75#2:519\n108#2,2:520\n81#3:522\n107#3,2:523\n81#3:525\n107#3,2:526\n81#3:528\n107#3,2:529\n81#3:531\n215#4,8:532\n262#4,8:540\n116#4,9:548\n270#4,3:557\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n210#1:516\n210#1:517,2\n211#1:519\n211#1:520,2\n212#1:522\n212#1:523,2\n214#1:525\n214#1:526,2\n215#1:528\n215#1:529,2\n223#1:531\n322#1:532,8\n322#1:540,8\n332#1:548,9\n322#1:557,3\n*E\n"})
/* loaded from: classes.dex */
final class x1 extends q.d implements androidx.compose.ui.node.c0, androidx.compose.ui.node.q, androidx.compose.ui.focus.i {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final b5 spacingPx;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int iterations;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int delayMillis;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int initialDelayMillis;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float velocity;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 contentWidth;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 containerWidth;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 hasFocus;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 animationJob;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 spacing;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 animationMode;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> offset;

    /* compiled from: BasicMarquee.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9244a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9244a = iArr;
        }
    }

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f9245b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x1 f9246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.i1 i1Var, x1 x1Var) {
            super(1);
            this.f9245b = i1Var;
            this.f9246c = x1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.u(aVar, this.f9245b, kotlin.math.b.L0((-((Number) this.f9246c.offset.v()).floatValue()) * this.f9246c.M7()), 0, 0.0f, null, 12, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicMarquee.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {345, 346}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.k2 f9248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x1 f9249d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlinx.coroutines.k2 k2Var, x1 x1Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f9248c = k2Var;
            this.f9249d = x1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f9248c, this.f9249d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9247b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.k2 k2Var = this.f9248c;
                if (k2Var != null) {
                    this.f9247b = 1;
                    if (k2Var.j0(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                kotlin.a1.n(obj);
            }
            x1 x1Var = this.f9249d;
            this.f9247b = 2;
            if (x1Var.R7(this) == aVar) {
                return aVar;
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: BasicMarquee.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9250b;

        /* compiled from: BasicMarquee.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x1 f9252b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var) {
                super(0);
                this.f9252b = x1Var;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                if (x1.z7(this.f9252b) <= x1.y7(this.f9252b)) {
                    return null;
                }
                int J7 = this.f9252b.J7();
                v1.INSTANCE.getClass();
                if (!v1.f(J7, v1.f9120d) || this.f9252b.N7()) {
                    return Float.valueOf(x1.z7(this.f9252b) + this.f9252b.P7());
                }
                return null;
            }
        }

        /* compiled from: BasicMarquee.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {380, 382, 386, 386}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "contentWithSpacingWidth", "Lkotlin/k2;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f9253b;

            /* renamed from: c, reason: collision with root package name */
            int f9254c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f9255d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x1 f9256e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x1 x1Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f9256e = x1Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m Float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(f4, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f9256e, dVar);
                bVar.f9255d = obj;
                return bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r22) {
                /*
                    r21 = this;
                    r9 = r21
                    kotlin.coroutines.intrinsics.a r10 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r0 = r9.f9254c
                    r11 = 4
                    r12 = 3
                    r1 = 2
                    r2 = 1
                    r13 = 0
                    r14 = 0
                    if (r0 == 0) goto L41
                    if (r0 == r2) goto L34
                    if (r0 == r1) goto L2c
                    if (r0 == r12) goto L27
                    if (r0 == r11) goto L1e
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1e:
                    java.lang.Object r0 = r9.f9255d
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.a1.n(r22)
                    goto Ld6
                L27:
                    kotlin.a1.n(r22)
                    goto Lbb
                L2c:
                    kotlin.a1.n(r22)     // Catch: java.lang.Throwable -> L31
                    goto La7
                L31:
                    r0 = move-exception
                    goto Lbe
                L34:
                    java.lang.Object r0 = r9.f9253b
                    androidx.compose.animation.core.k r0 = (androidx.compose.animation.core.k) r0
                    java.lang.Object r2 = r9.f9255d
                    java.lang.Float r2 = (java.lang.Float) r2
                    kotlin.a1.n(r22)
                    r3 = r0
                    goto L8c
                L41:
                    kotlin.a1.n(r22)
                    java.lang.Object r0 = r9.f9255d
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 != 0) goto L4d
                    kotlin.k2 r0 = kotlin.k2.f75408a
                    return r0
                L4d:
                    androidx.compose.foundation.x1 r3 = r9.f9256e
                    int r15 = androidx.compose.foundation.x1.E7(r3)
                    float r16 = r0.floatValue()
                    androidx.compose.foundation.x1 r3 = r9.f9256e
                    int r17 = androidx.compose.foundation.x1.D7(r3)
                    androidx.compose.foundation.x1 r3 = r9.f9256e
                    int r18 = androidx.compose.foundation.x1.A7(r3)
                    androidx.compose.foundation.x1 r3 = r9.f9256e
                    float r19 = androidx.compose.foundation.x1.H7(r3)
                    androidx.compose.foundation.x1 r3 = r9.f9256e
                    androidx.compose.ui.unit.d r20 = androidx.compose.ui.node.k.n(r3)
                    androidx.compose.animation.core.k r3 = androidx.compose.foundation.r.d(r15, r16, r17, r18, r19, r20)
                    androidx.compose.foundation.x1 r4 = r9.f9256e
                    androidx.compose.animation.core.b r4 = androidx.compose.foundation.x1.F7(r4)
                    java.lang.Float r5 = new java.lang.Float
                    r5.<init>(r14)
                    r9.f9255d = r0
                    r9.f9253b = r3
                    r9.f9254c = r2
                    java.lang.Object r2 = r4.C(r5, r9)
                    if (r2 != r10) goto L8b
                    return r10
                L8b:
                    r2 = r0
                L8c:
                    androidx.compose.foundation.x1 r0 = r9.f9256e     // Catch: java.lang.Throwable -> L31
                    androidx.compose.animation.core.b r0 = androidx.compose.foundation.x1.F7(r0)     // Catch: java.lang.Throwable -> L31
                    r9.f9255d = r13     // Catch: java.lang.Throwable -> L31
                    r9.f9253b = r13     // Catch: java.lang.Throwable -> L31
                    r9.f9254c = r1     // Catch: java.lang.Throwable -> L31
                    r4 = 0
                    r5 = 0
                    r7 = 12
                    r8 = 0
                    r1 = r0
                    r6 = r21
                    java.lang.Object r0 = androidx.compose.animation.core.b.i(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31
                    if (r0 != r10) goto La7
                    return r10
                La7:
                    androidx.compose.foundation.x1 r0 = r9.f9256e
                    androidx.compose.animation.core.b r0 = androidx.compose.foundation.x1.F7(r0)
                    java.lang.Float r1 = new java.lang.Float
                    r1.<init>(r14)
                    r9.f9254c = r12
                    java.lang.Object r0 = r0.C(r1, r9)
                    if (r0 != r10) goto Lbb
                    return r10
                Lbb:
                    kotlin.k2 r0 = kotlin.k2.f75408a
                    return r0
                Lbe:
                    androidx.compose.foundation.x1 r1 = r9.f9256e
                    androidx.compose.animation.core.b r1 = androidx.compose.foundation.x1.F7(r1)
                    java.lang.Float r2 = new java.lang.Float
                    r2.<init>(r14)
                    r9.f9255d = r0
                    r9.f9253b = r13
                    r9.f9254c = r11
                    java.lang.Object r1 = r1.C(r2, r9)
                    if (r1 != r10) goto Ld6
                    return r10
                Ld6:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.x1.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return x1.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9250b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i w4 = o4.w(new a(x1.this));
                b bVar = new b(x1.this, null);
                this.f9250b = 1;
                if (kotlinx.coroutines.flow.k.A(w4, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f9257b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x1 f9258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z1 z1Var, x1 x1Var) {
            super(0);
            this.f9257b = z1Var;
            this.f9258c = x1Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            z1 z1Var = this.f9257b;
            x1 x1Var = this.f9258c;
            return Integer.valueOf(z1Var.a(androidx.compose.ui.node.k.n(x1Var), x1.z7(x1Var), x1.y7(x1Var)));
        }
    }

    public /* synthetic */ x1(int i4, int i5, int i6, int i7, z1 z1Var, float f4, kotlin.jvm.internal.w wVar) {
        this(i4, i5, i6, i7, z1Var, f4);
    }

    private final int K7() {
        return this.containerWidth.f();
    }

    private final int L7() {
        return this.contentWidth.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float M7() {
        float signum = Math.signum(this.velocity);
        int i4 = a.f9244a[androidx.compose.ui.node.k.o(this).ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = -1;
        }
        return signum * i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean N7() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P7() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void Q7() {
        kotlinx.coroutines.k2 f4;
        kotlinx.coroutines.k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        if (getIsAttached()) {
            f4 = kotlinx.coroutines.k.f(V6(), null, null, new c(k2Var, this, null), 3, null);
            this.animationJob = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R7(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (this.iterations <= 0) {
            return kotlin.k2.f75408a;
        }
        Object h4 = kotlinx.coroutines.i.h(a1.f3527b, new d(null), dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    private final void T7(int i4) {
        this.containerWidth.k(i4);
    }

    private final void U7(int i4) {
        this.contentWidth.k(i4);
    }

    private final void V7(boolean z4) {
        this.hasFocus.setValue(Boolean.valueOf(z4));
    }

    public static final int y7(x1 x1Var) {
        return x1Var.containerWidth.f();
    }

    public static final int z7(x1 x1Var) {
        return x1Var.contentWidth.f();
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        float floatValue = this.offset.v().floatValue() * M7();
        boolean z4 = M7() != 1.0f ? this.offset.v().floatValue() < ((float) this.containerWidth.f()) : this.offset.v().floatValue() < ((float) this.contentWidth.f());
        boolean z5 = M7() != 1.0f ? this.offset.v().floatValue() > ((float) P7()) : this.offset.v().floatValue() > ((float) ((this.contentWidth.f() + P7()) - this.containerWidth.f()));
        float f4 = M7() == 1.0f ? this.contentWidth.f() + P7() : (-this.contentWidth.f()) - P7();
        float m4 = i0.n.m(cVar.e());
        androidx.compose.ui.graphics.c2.INSTANCE.getClass();
        int i4 = androidx.compose.ui.graphics.c2.f17637d;
        androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().b(floatValue, 0.0f, floatValue + this.containerWidth.f(), m4, i4);
        if (z4) {
            cVar.G6();
        }
        if (z5) {
            cVar.getDrawContext().getTransform().translate(f4, 0.0f);
            cVar.G6();
            cVar.getDrawContext().getTransform().translate(-f4, -0.0f);
        }
        drawContext.i().o();
        drawContext.j(e4);
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.Z(Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int J7() {
        return ((v1) this.animationMode.getValue()).getValue();
    }

    @fg.l
    public final z1 O7() {
        return (z1) this.spacing.getValue();
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return 0;
    }

    public final void S7(int i4) {
        this.animationMode.setValue(v1.c(i4));
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.l0(i4);
    }

    public final void W7(@fg.l z1 z1Var) {
        this.spacing.setValue(z1Var);
    }

    public final void X7(int iterations, int animationMode, int delayMillis, int initialDelayMillis, @fg.l z1 spacing, float velocity) {
        W7(spacing);
        S7(animationMode);
        if (this.iterations == iterations && this.delayMillis == delayMillis && this.initialDelayMillis == initialDelayMillis && androidx.compose.ui.unit.h.l(this.velocity, velocity)) {
            return;
        }
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        Q7();
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l androidx.compose.ui.focus.j0 focusState) {
        V7(focusState.getHasFocus());
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        T7(androidx.compose.ui.unit.c.g(j4, m02.getWidth()));
        U7(m02.getWidth());
        return androidx.compose.ui.layout.o0.x2(o0Var, this.containerWidth.f(), m02.getHeight(), null, new b(m02, this), 4, null);
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        Q7();
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        kotlinx.coroutines.k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.animationJob = null;
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return pVar.t(Integer.MAX_VALUE);
    }

    private x1(int i4, int i5, int i6, int i7, z1 z1Var, float f4) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        this.iterations = i4;
        this.delayMillis = i6;
        this.initialDelayMillis = i7;
        this.velocity = f4;
        this.contentWidth = androidx.compose.runtime.b.c(0);
        this.containerWidth = androidx.compose.runtime.b.c(0);
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.hasFocus = g4;
        g5 = t4.g(z1Var, null, 2, null);
        this.spacing = g5;
        g6 = t4.g(v1.c(i5), null, 2, null);
        this.animationMode = g6;
        this.offset = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);
        this.spacingPx = o4.e(new e(z1Var, this));
    }
}
