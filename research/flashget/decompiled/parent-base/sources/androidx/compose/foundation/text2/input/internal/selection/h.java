package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.animation.core.p;
import androidx.compose.animation.core.y1;
import androidx.compose.foundation.t1;
import androidx.compose.foundation.text.selection.g0;
import androidx.compose.foundation.text2.input.internal.j0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.foundation.u1;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.v;
import com.android.internal.telephony.SmsConstants;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0013\u001a\u00020\r*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\r*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R1\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/h;", "Landroidx/compose/foundation/text2/input/internal/selection/g;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "", "isFocused", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/internal/j0;Z)V", "Lkotlin/k2;", "R7", "()V", "i7", "J7", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "t", "Landroidx/compose/foundation/text2/input/internal/m0;", "u", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "v", "Landroidx/compose/foundation/text2/input/internal/j0;", "w", "Z", "Landroidx/compose/ui/unit/u;", "<set-?>", "x", "Landroidx/compose/runtime/k2;", "Q7", "()J", "S7", "(J)V", "magnifierSize", "Landroidx/compose/animation/core/b;", "Li0/f;", "Landroidx/compose/animation/core/p;", "y", "Landroidx/compose/animation/core/b;", "animatable", "Landroidx/compose/foundation/t1;", "z", "Landroidx/compose/foundation/t1;", "magnifierNode", "Lkotlinx/coroutines/k2;", "A", "Lkotlinx/coroutines/k2;", "animationJob", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n81#2:196\n107#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:196\n52#1:197,2\n*E\n"})
/* loaded from: classes.dex */
public final class h extends g implements androidx.compose.ui.node.h {
    public static final int B = 0;

    /* renamed from: A, reason: from kotlin metadata */
    @m
    private k2 animationJob;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    private m0 textFieldState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @l
    private i textFieldSelectionState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @l
    private j0 textLayoutState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.k2 magnifierSize;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.animation.core.b<i0.f, p> animatable;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @l
    private final t1 magnifierNode;

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Li0/f;", "a", "(Landroidx/compose/ui/unit/d;)J"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<androidx.compose.ui.unit.d, i0.f> {
        a() {
            super(1);
        }

        public final long a(@l androidx.compose.ui.unit.d dVar) {
            return ((i0.f) h.this.animatable.v()).getPackedValue();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ i0.f invoke(androidx.compose.ui.unit.d dVar) {
            return i0.f.d(a(dVar));
        }
    }

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/l;", "size", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<androidx.compose.ui.unit.l, kotlin.k2> {
        b() {
            super(1);
        }

        public final void a(long j4) {
            h hVar = h.this;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) androidx.compose.ui.node.i.a(hVar, h1.i());
            hVar.S7(v.a(dVar.q2(androidx.compose.ui.unit.l.p(j4)), dVar.q2(androidx.compose.ui.unit.l.m(j4))));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.l lVar) {
            a(lVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8767b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8768c;

        /* compiled from: AndroidTextFieldMagnifier.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<i0.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f8770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(0);
                this.f8770b = hVar;
            }

            public final long a() {
                return f.a(this.f8770b.textFieldState, this.f8770b.textFieldSelectionState, this.f8770b.textLayoutState, this.f8770b.Q7());
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ i0.f invoke() {
                return i0.f.d(a());
            }
        }

        /* compiled from: AndroidTextFieldMagnifier.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "targetValue", "Lkotlin/k2;", "a", "(JLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f8771b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f8772c;

            /* compiled from: AndroidTextFieldMagnifier.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {SmsConstants.MAX_USER_DATA_BYTES}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f8773b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ h f8774c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f8775d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h hVar, long j4, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f8774c = hVar;
                    this.f8775d = j4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<kotlin.k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    return new a(this.f8774c, this.f8775d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8773b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.animation.core.b bVar = this.f8774c.animatable;
                        i0.f d5 = i0.f.d(this.f8775d);
                        y1<i0.f> e4 = g0.e();
                        this.f8773b = 1;
                        if (androidx.compose.animation.core.b.i(bVar, d5, e4, null, null, this, 12, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @m
                public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            b(h hVar, r0 r0Var) {
                this.f8771b = hVar;
                this.f8772c = r0Var;
            }

            @m
            public final Object a(long j4, @l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (i0.g.d(((i0.f) this.f8771b.animatable.v()).getPackedValue()) && i0.g.d(j4) && i0.f.r(((i0.f) this.f8771b.animatable.v()).getPackedValue()) != i0.f.r(j4)) {
                    kotlinx.coroutines.k.f(this.f8772c, null, null, new a(this.f8771b, j4, null), 3, null);
                    return kotlin.k2.f75408a;
                }
                Object C = this.f8771b.animatable.C(i0.f.d(j4), dVar);
                return C == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? C : kotlin.k2.f75408a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((i0.f) obj).getPackedValue(), dVar);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<kotlin.k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            c cVar = h.this.new c(dVar);
            cVar.f8768c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8767b;
            if (i4 == 0) {
                a1.n(obj);
                r0 r0Var = (r0) this.f8768c;
                kotlinx.coroutines.flow.i w4 = o4.w(new a(h.this));
                b bVar = new b(h.this, r0Var);
                this.f8767b = 1;
                if (w4.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public h(@l m0 m0Var, @l i iVar, @l j0 j0Var, boolean z4) {
        androidx.compose.runtime.k2 g4;
        this.textFieldState = m0Var;
        this.textFieldSelectionState = iVar;
        this.textLayoutState = j0Var;
        this.isFocused = z4;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        g4 = t4.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f21529c), null, 2, null);
        this.magnifierSize = g4;
        this.animatable = new androidx.compose.animation.core.b<>(i0.f.d(f.a(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, Q7())), g0.g(), i0.f.d(g0.f()), null, 8, null);
        this.magnifierNode = (t1) y7(new t1(new a(), null, new b(), 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long Q7() {
        return ((androidx.compose.ui.unit.u) this.magnifierSize.getValue()).getPackedValue();
    }

    private final void R7() {
        k2 f4;
        k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.animationJob = null;
        if (this.isFocused && u1.c(0, 1, null)) {
            f4 = kotlinx.coroutines.k.f(V6(), null, null, new c(null), 3, null);
            this.animationJob = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S7(long j4) {
        this.magnifierSize.setValue(androidx.compose.ui.unit.u.b(j4));
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.g, androidx.compose.ui.node.q
    public void E(@l androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.G6();
        this.magnifierNode.E(cVar);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.g
    public void J7(@l m0 textFieldState, @l i textFieldSelectionState, @l j0 textLayoutState, boolean isFocused) {
        m0 m0Var = this.textFieldState;
        i iVar = this.textFieldSelectionState;
        j0 j0Var = this.textLayoutState;
        boolean z4 = this.isFocused;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.isFocused = isFocused;
        if (l0.g(textFieldState, m0Var) && l0.g(textFieldSelectionState, iVar) && l0.g(textLayoutState, j0Var) && isFocused == z4) {
            return;
        }
        R7();
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.g, androidx.compose.ui.layout.v0
    public void W(@l androidx.compose.ui.layout.u coordinates) {
        this.magnifierNode.W(coordinates);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.g, androidx.compose.ui.node.y1
    public void f6(@l z zVar) {
        this.magnifierNode.f6(zVar);
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        R7();
    }
}
