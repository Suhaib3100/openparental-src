package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.gestures.p0;
import androidx.compose.foundation.text.selection.x0;
import androidx.compose.foundation.text.selection.y0;
import androidx.compose.foundation.w2;
import androidx.compose.runtime.o4;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.text.t0;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;

/* compiled from: TextFieldCoreModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BG\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001e\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ\u001a\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J)\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0002¢\u0006\u0004\b+\u0010,J&\u00101\u001a\u00020**\u00020-2\u0006\u0010.\u001a\u00020!2\u0006\u00100\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020**\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020**\u00020-H\u0002¢\u0006\u0004\b5\u00106JM\u00107\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b7\u0010\u0017J&\u00108\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b8\u0010\u001fJ\u0013\u0010:\u001a\u00020**\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020*2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\u00020**\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020T0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010^\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010cR\u0014\u0010g\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/z;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/node/y1;", "", "isFocused", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "writeable", "Landroidx/compose/foundation/w2;", "scrollState", "Landroidx/compose/foundation/gestures/j0;", "orientation", "<init>", "(ZLandroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/ui/graphics/t1;ZLandroidx/compose/foundation/w2;Landroidx/compose/foundation/gestures/j0;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "X7", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "W7", "Landroidx/compose/ui/text/t0;", "currSelection", "", "R7", "(J)I", "Li0/i;", "cursorRect", "containerSize", "textFieldSize", "Lkotlin/k2;", "Z7", "(Li0/i;II)V", "Landroidx/compose/ui/graphics/drawscope/f;", "selection", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "T7", "(Landroidx/compose/ui/graphics/drawscope/f;JLandroidx/compose/ui/text/n0;)V", "U7", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/text/n0;)V", "S7", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "Y7", "f", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "s", "Z", "t", "Landroidx/compose/foundation/text2/input/internal/j0;", "u", "Landroidx/compose/foundation/text2/input/internal/m0;", "v", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "w", "Landroidx/compose/ui/graphics/t1;", "x", "y", "Landroidx/compose/foundation/w2;", "z", "Landroidx/compose/foundation/gestures/j0;", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "A", "Landroidx/compose/animation/core/b;", "cursorAlpha", "Lkotlinx/coroutines/k2;", "B", "Lkotlinx/coroutines/k2;", "changeObserverJob", "C", "Landroidx/compose/ui/text/t0;", "previousSelection", "D", "Li0/i;", "previousCursorRect", "Landroidx/compose/foundation/text2/input/internal/selection/g;", "Landroidx/compose/foundation/text2/input/internal/selection/g;", "textFieldMagnifierNode", "V7", "()Z", "showCursor", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,584:1\n1#2:585\n246#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode\n*L\n479#1:586\n*E\n"})
/* loaded from: classes.dex */
public final class z extends androidx.compose.ui.node.l implements androidx.compose.ui.node.c0, androidx.compose.ui.node.q, androidx.compose.ui.node.h, androidx.compose.ui.node.s, y1 {
    public static final int F = 8;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.m
    private k2 changeObserverJob;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.m
    private t0 previousSelection;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.selection.g textFieldMagnifierNode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 textLayoutState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private m0 textFieldState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private t1 cursorBrush;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean writeable;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w2 scrollState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.gestures.j0 orientation;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> cursorAlpha = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private i0.i previousCursorRect = new i0.i(-1.0f, -1.0f, -1.0f, -1.0f);

    /* compiled from: TextFieldCoreModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f9017c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f9018d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0 o0Var, i1 i1Var, int i4) {
            super(1);
            this.f9017c = o0Var;
            this.f9018d = i1Var;
            this.f9019e = i4;
        }

        public final void a(@fg.l i1.a aVar) {
            i0.i iVar;
            long selectionInChars = z.this.textFieldState.k().getSelectionInChars();
            int R7 = z.this.R7(selectionInChars);
            if (R7 >= 0) {
                iVar = y.e(this.f9017c, R7, z.this.textLayoutState.e(), this.f9017c.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl, this.f9018d.getWidth());
            } else {
                iVar = null;
            }
            z.this.Z7(iVar, this.f9019e, this.f9018d.getWidth());
            if (z.this.isFocused) {
                z.this.previousSelection = t0.b(selectionInChars);
            }
            i1.a.m(aVar, this.f9018d, -z.this.scrollState.r(), 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldCoreModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f9021c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1 f9022d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9023e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, i1 i1Var, int i4) {
            super(1);
            this.f9021c = o0Var;
            this.f9022d = i1Var;
            this.f9023e = i4;
        }

        public final void a(@fg.l i1.a aVar) {
            i0.i iVar;
            long selectionInChars = z.this.textFieldState.k().getSelectionInChars();
            int R7 = z.this.R7(selectionInChars);
            if (R7 >= 0) {
                iVar = y.e(this.f9021c, R7, z.this.textLayoutState.e(), this.f9021c.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl, this.f9022d.getWidth());
            } else {
                iVar = null;
            }
            z.this.Z7(iVar, this.f9023e, this.f9022d.getHeight());
            if (z.this.isFocused) {
                z.this.previousSelection = t0.b(selectionInChars);
            }
            i1.a.m(aVar, this.f9022d, 0, -z.this.scrollState.r(), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldCoreModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$1", f = "TextFieldCoreModifier.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9024b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return z.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9024b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = z.this.cursorAlpha;
                Float f4 = new Float(0.0f);
                this.f9024b = 1;
                if (bVar.C(f4, this) == aVar) {
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
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldCoreModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2", f = "TextFieldCoreModifier.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f9027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f9028d;

        /* compiled from: TextFieldCoreModifier.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1", f = "TextFieldCoreModifier.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9029b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m0 f9030c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z f9031d;

            /* compiled from: TextFieldCoreModifier.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "a", "()Landroidx/compose/foundation/text2/input/q;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text2.input.internal.z$d$a$a, reason: collision with other inner class name */
            static final class C0189a extends n0 implements ld.a<androidx.compose.foundation.text2.input.q> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ m0 f9032b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0189a(m0 m0Var) {
                    super(0);
                    this.f9032b = m0Var;
                }

                @fg.l
                public final androidx.compose.foundation.text2.input.q a() {
                    return this.f9032b.k();
                }

                @Override // ld.a
                public androidx.compose.foundation.text2.input.q invoke() {
                    return this.f9032b.k();
                }
            }

            /* compiled from: TextFieldCoreModifier.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {230, 232}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/text2/input/q;)V"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.foundation.text2.input.q, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f9033b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z f9034c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(z zVar, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f9034c = zVar;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.foundation.text2.input.q qVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((b) create(qVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new b(this.f9034c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    androidx.compose.animation.core.k kVar;
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f9033b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.animation.core.b bVar = this.f9034c.cursorAlpha;
                        Float f4 = new Float(1.0f);
                        this.f9033b = 1;
                        if (bVar.C(f4, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a1.n(obj);
                            return kotlin.k2.f75408a;
                        }
                        a1.n(obj);
                    }
                    androidx.compose.animation.core.b bVar2 = this.f9034c.cursorAlpha;
                    Float f5 = new Float(0.0f);
                    kVar = y.f9005a;
                    this.f9033b = 2;
                    if (androidx.compose.animation.core.b.i(bVar2, f5, kVar, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, z zVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9030c = m0Var;
                this.f9031d = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9030c, this.f9031d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9029b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.i w4 = o4.w(new C0189a(this.f9030c));
                    b bVar = new b(this.f9031d, null);
                    this.f9029b = 1;
                    if (kotlinx.coroutines.flow.k.A(w4, bVar, this) == aVar) {
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
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0 m0Var, z zVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f9027c = m0Var;
            this.f9028d = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f9027c, this.f9028d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9026b;
            if (i4 == 0) {
                a1.n(obj);
                o oVar = o.f8712b;
                a aVar2 = new a(this.f9027c, this.f9028d, null);
                this.f9026b = 1;
                if (kotlinx.coroutines.i.h(oVar, aVar2, this) == aVar) {
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
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TextFieldCoreModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9035b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9037d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f4, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f9037d = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return z.this.new e(this.f9037d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            float g4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9035b;
            if (i4 == 0) {
                a1.n(obj);
                w2 w2Var = z.this.scrollState;
                g4 = y.g(this.f9037d);
                this.f9035b = 1;
                if (p0.c(w2Var, g4, this) == aVar) {
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
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public z(boolean z4, @fg.l j0 j0Var, @fg.l m0 m0Var, @fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.l t1 t1Var, boolean z5, @fg.l w2 w2Var, @fg.l androidx.compose.foundation.gestures.j0 j0Var2) {
        this.isFocused = z4;
        this.textLayoutState = j0Var;
        this.textFieldState = m0Var;
        this.textFieldSelectionState = iVar;
        this.cursorBrush = t1Var;
        this.writeable = z5;
        this.scrollState = w2Var;
        this.orientation = j0Var2;
        this.textFieldMagnifierNode = (androidx.compose.foundation.text2.input.internal.selection.g) y7(androidx.compose.foundation.text2.input.internal.selection.a.a(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R7(long currSelection) {
        t0 t0Var = this.previousSelection;
        if (t0Var == null || t0.i(currSelection) != ((int) (t0Var.getPackedValue() & 4294967295L))) {
            return t0.i(currSelection);
        }
        t0 t0Var2 = this.previousSelection;
        if (t0Var2 == null || t0.n(currSelection) != ((int) (t0Var2.getPackedValue() >> 32))) {
            return t0.n(currSelection);
        }
        return -1;
    }

    private final void S7(androidx.compose.ui.graphics.drawscope.f fVar) {
        if (this.cursorAlpha.v().floatValue() <= 0.0f || !V7()) {
            return;
        }
        float H = kotlin.ranges.s.H(this.cursorAlpha.v().floatValue(), 0.0f, 1.0f);
        if (H == 0.0f) {
            return;
        }
        i0.i Z = this.textFieldSelectionState.Z();
        androidx.compose.ui.graphics.drawscope.f.F6(fVar, this.cursorBrush, Z.D(), Z.l(), Z.G(), 0, null, H, null, 0, 432, null);
    }

    private final void T7(androidx.compose.ui.graphics.drawscope.f fVar, long j4, androidx.compose.ui.text.n0 n0Var) {
        int l4 = t0.l(j4);
        int k4 = t0.k(j4);
        if (l4 != k4) {
            androidx.compose.ui.graphics.drawscope.f.N1(fVar, n0Var.z(l4, k4), ((x0) androidx.compose.ui.node.i.a(this, y0.c())).getBackgroundColor(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void U7(androidx.compose.ui.graphics.drawscope.f fVar, androidx.compose.ui.text.n0 n0Var) {
        androidx.compose.ui.text.r0.f21295a.a(fVar.getDrawContext().i(), n0Var);
    }

    private final boolean V7() {
        boolean f4;
        if (this.writeable && this.isFocused) {
            f4 = y.f(this.cursorBrush);
            if (f4) {
                return true;
            }
        }
        return false;
    }

    private final androidx.compose.ui.layout.n0 W7(o0 o0Var, androidx.compose.ui.layout.l0 l0Var, long j4) {
        i1 m02 = l0Var.m0(l0Var.l0(androidx.compose.ui.unit.b.o(j4)) < androidx.compose.ui.unit.b.p(j4) ? j4 : androidx.compose.ui.unit.b.e(j4, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = Math.min(m02.getWidth(), androidx.compose.ui.unit.b.p(j4));
        return o0.x2(o0Var, min, m02.getHeight(), null, new a(o0Var, m02, min), 4, null);
    }

    private final androidx.compose.ui.layout.n0 X7(o0 o0Var, androidx.compose.ui.layout.l0 l0Var, long j4) {
        i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(m02.getHeight(), androidx.compose.ui.unit.b.o(j4));
        return o0.x2(o0Var, m02.getWidth(), min, null, new b(o0Var, m02, min), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z7(i0.i cursorRect, int containerSize, int textFieldSize) {
        float f4;
        this.scrollState.u(textFieldSize - containerSize);
        if (!V7() || cursorRect == null) {
            return;
        }
        if (cursorRect.t() == this.previousCursorRect.t() && cursorRect.getTop() == this.previousCursorRect.getTop()) {
            return;
        }
        boolean z4 = this.orientation == androidx.compose.foundation.gestures.j0.Vertical;
        float top2 = z4 ? cursorRect.getTop() : cursorRect.t();
        float j4 = z4 ? cursorRect.j() : cursorRect.x();
        int r4 = this.scrollState.r();
        float f5 = r4 + containerSize;
        if (j4 <= f5) {
            float f6 = r4;
            if (top2 >= f6 || j4 - top2 <= containerSize) {
                f4 = (top2 >= f6 || j4 - top2 > ((float) containerSize)) ? 0.0f : top2 - f6;
                this.previousCursorRect = cursorRect;
                kotlinx.coroutines.k.f(V6(), null, kotlinx.coroutines.t0.UNDISPATCHED, new e(f4, null), 1, null);
            }
        }
        f4 = j4 - f5;
        this.previousCursorRect = cursorRect;
        kotlinx.coroutines.k.f(V6(), null, kotlinx.coroutines.t0.UNDISPATCHED, new e(f4, null), 1, null);
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.G6();
        androidx.compose.foundation.text2.input.q k4 = this.textFieldState.k();
        androidx.compose.ui.text.n0 e4 = this.textLayoutState.e();
        if (e4 == null) {
            return;
        }
        if (t0.h(k4.getSelectionInChars())) {
            U7(cVar, e4);
            S7(cVar);
        } else {
            T7(cVar, k4.getSelectionInChars(), e4);
            U7(cVar, e4);
        }
        this.textFieldMagnifierNode.E(cVar);
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.textLayoutState.m(coordinates);
        this.textFieldMagnifierNode.W(coordinates);
    }

    public final void Y7(boolean isFocused, @fg.l j0 textLayoutState, @fg.l m0 textFieldState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.l t1 cursorBrush, boolean writeable, @fg.l w2 scrollState, @fg.l androidx.compose.foundation.gestures.j0 orientation) {
        k2 f4;
        boolean V7 = V7();
        boolean z4 = this.isFocused;
        m0 m0Var = this.textFieldState;
        j0 j0Var = this.textLayoutState;
        androidx.compose.foundation.text2.input.internal.selection.i iVar = this.textFieldSelectionState;
        w2 w2Var = this.scrollState;
        this.isFocused = isFocused;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.J7(textFieldState, textFieldSelectionState, textLayoutState, isFocused);
        if (!V7()) {
            k2 k2Var = this.changeObserverJob;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            this.changeObserverJob = null;
            kotlinx.coroutines.k.f(V6(), null, null, new c(null), 3, null);
        } else if (!z4 || !kotlin.jvm.internal.l0.g(m0Var, textFieldState) || !V7) {
            f4 = kotlinx.coroutines.k.f(V6(), null, null, new d(textFieldState, this, null), 3, null);
            this.changeObserverJob = f4;
        }
        if (kotlin.jvm.internal.l0.g(m0Var, textFieldState) && kotlin.jvm.internal.l0.g(j0Var, textLayoutState) && kotlin.jvm.internal.l0.g(iVar, textFieldSelectionState) && kotlin.jvm.internal.l0.g(w2Var, scrollState)) {
            return;
        }
        androidx.compose.ui.node.f0.b(this);
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        return this.orientation == androidx.compose.foundation.gestures.j0.Vertical ? X7(o0Var, l0Var, j4) : W7(o0Var, l0Var, j4);
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        this.textFieldMagnifierNode.f6(zVar);
    }
}
