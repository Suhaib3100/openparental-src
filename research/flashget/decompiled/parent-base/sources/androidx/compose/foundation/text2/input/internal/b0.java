package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.u0;
import androidx.compose.ui.input.pointer.v0;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.platform.d6;
import androidx.compose.ui.platform.g5;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.m2;
import androidx.compose.ui.platform.n2;
import androidx.compose.ui.platform.q2;
import androidx.compose.ui.text.input.y;
import androidx.compose.ui.text.t0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;

/* compiled from: TextFieldDecoratorModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u007f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nBQ\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$JW\u0010%\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b%\u0010\u001cJ\u0013\u0010'\u001a\u00020\u001d*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001dH\u0016¢\u0006\u0004\b-\u0010\u001fJ\u000f\u0010.\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010\u001fJ\u0017\u00101\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J*\u00109\u001a\u00020\u001d2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001dH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u001a\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001a\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u001dH\u0016¢\u0006\u0004\bA\u0010\u001fR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010[\u001a\u0004\bj\u0010]\"\u0004\bk\u0010_R\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010\u0017\u001a\u00020\u00162\u0006\u0010p\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010[R\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010\u0087\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u001d0\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010]R\u0016\u0010\u008f\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/b0;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/platform/m2;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/focus/e0;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/k1;", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/h;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "singleLine", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/h;ZZLandroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Z)V", "Lkotlin/k2;", "j8", "()V", "P7", "k8", "Landroidx/compose/ui/platform/g5;", "a8", "()Landroidx/compose/ui/platform/g5;", "l8", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "Landroidx/compose/ui/focus/j0;", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "i7", "j7", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "Landroidx/compose/ui/input/key/c;", "event", "n3", "(Landroid/view/KeyEvent;)Z", "k4", "d2", "s", "Landroidx/compose/foundation/text2/input/internal/m0;", "X7", "()Landroidx/compose/foundation/text2/input/internal/m0;", "h8", "(Landroidx/compose/foundation/text2/input/internal/m0;)V", "t", "Landroidx/compose/foundation/text2/input/internal/j0;", "Y7", "()Landroidx/compose/foundation/text2/input/internal/j0;", "i8", "(Landroidx/compose/foundation/text2/input/internal/j0;)V", "u", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "W7", "()Landroidx/compose/foundation/text2/input/internal/selection/i;", "g8", "(Landroidx/compose/foundation/text2/input/internal/selection/i;)V", "v", "Landroidx/compose/foundation/text2/input/h;", "R7", "()Landroidx/compose/foundation/text2/input/h;", "c8", "(Landroidx/compose/foundation/text2/input/h;)V", "w", "Z", "Q7", "()Z", "b8", "(Z)V", "x", "U7", "e8", "y", "Landroidx/compose/foundation/text/d0;", "S7", "()Landroidx/compose/foundation/text/d0;", "d8", "(Landroidx/compose/foundation/text/d0;)V", "z", "V7", "f8", "Landroidx/compose/ui/input/pointer/v0;", "A", "Landroidx/compose/ui/input/pointer/v0;", "pointerInputNode", "<set-?>", "B", "Landroidx/compose/foundation/text/f0;", "T7", "()Landroidx/compose/foundation/text/f0;", "C", "isElementFocused", "Landroidx/compose/ui/platform/d6;", "D", "Landroidx/compose/ui/platform/d6;", "windowInfo", "Landroidx/compose/foundation/text2/input/internal/c0;", "E", "Landroidx/compose/foundation/text2/input/internal/c0;", "textFieldKeyEventHandler", "androidx/compose/foundation/text2/input/internal/b0$k", "F", "Landroidx/compose/foundation/text2/input/internal/b0$k;", "keyboardActionScope", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/y;", "G", "Lld/l;", "onImeActionPerformed", "Lkotlinx/coroutines/k2;", "H", "Lkotlinx/coroutines/k2;", "inputSessionJob", "Z7", "isFocused", "s6", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 extends androidx.compose.ui.node.l implements m2, y1, androidx.compose.ui.focus.e0, androidx.compose.ui.focus.i, androidx.compose.ui.node.s, u1, androidx.compose.ui.input.key.g, androidx.compose.ui.node.h, k1 {
    public static final int I = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final v0 pointerInputNode = (v0) y7(u0.a(new o(null)));

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.text.f0 keyboardOptions;

    /* renamed from: C, reason: from kotlin metadata */
    private boolean isElementFocused;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private d6 windowInfo;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final c0 textFieldKeyEventHandler;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private final k keyboardActionScope;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.text.input.y, k2> onImeActionPerformed;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 inputSessionJob;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private m0 textFieldState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 textLayoutState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.text2.input.h filter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean readOnly;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.text.d0 keyboardActions;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean singleLine;

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b0.this.getTextFieldSelectionState().u0();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/n0;", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$applySemantics$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
    static final class b extends n0 implements ld.l<List<androidx.compose.ui.text.n0>, Boolean> {
        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l List<androidx.compose.ui.text.n0> list) {
            androidx.compose.ui.text.n0 e4 = b0.this.getTextLayoutState().e();
            return Boolean.valueOf(e4 != null ? list.add(e4) : false);
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "newText", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
            if (b0.this.getReadOnly() || !b0.this.getEnabled()) {
                return Boolean.FALSE;
            }
            b0.this.getTextFieldState().u(eVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "start", "end", "", "relativeToOriginal", "a", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.q<Integer, Integer, Boolean, Boolean> {
        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Boolean R(Integer num, Integer num2, Boolean bool) {
            return a(num.intValue(), num2.intValue(), bool.booleanValue());
        }

        @fg.l
        public final Boolean a(int i4, int i5, boolean z4) {
            androidx.compose.foundation.text2.input.q l4 = z4 ? b0.this.getTextFieldState().l() : b0.this.getTextFieldState().k();
            long selectionInChars = l4.getSelectionInChars();
            if (!b0.this.getEnabled() || Math.min(i4, i5) < 0 || Math.max(i4, i5) > l4.length()) {
                return Boolean.FALSE;
            }
            if (i4 == t0.n(selectionInChars) && i5 == ((int) (selectionInChars & 4294967295L))) {
                return Boolean.TRUE;
            }
            long b5 = androidx.compose.ui.text.u0.b(i4, i5);
            if (z4 || i4 == i5) {
                b0.this.getTextFieldSelectionState().J0(androidx.compose.foundation.text2.input.internal.selection.k.None);
            } else {
                b0.this.getTextFieldSelectionState().J0(androidx.compose.foundation.text2.input.internal.selection.k.Selection);
            }
            if (z4) {
                b0.this.getTextFieldState().B(b5);
            } else {
                b0.this.getTextFieldState().A(b5);
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "newText", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {
        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
            if (b0.this.getReadOnly() || !b0.this.getEnabled()) {
                return Boolean.FALSE;
            }
            m0.w(b0.this.getTextFieldState(), eVar, true, null, 4, null);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<Boolean> {
        f() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b0.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.y.i(b0.this.getKeyboardOptions().getImeAction()));
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<Boolean> {
        g() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (!b0.this.Z7()) {
                androidx.compose.ui.focus.f0.c(b0.this);
            } else if (!b0.this.getReadOnly()) {
                b0.this.a8().b();
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<Boolean> {
        h() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (!b0.this.Z7()) {
                androidx.compose.ui.focus.f0.c(b0.this);
            }
            b0.this.getTextFieldSelectionState().J0(androidx.compose.foundation.text2.input.internal.selection.k.Selection);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.a<Boolean> {
        i() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            androidx.compose.foundation.text2.input.internal.selection.i.I(b0.this.getTextFieldSelectionState(), false, 1, null);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.a<Boolean> {
        j() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b0.this.getTextFieldSelectionState().K();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/text2/input/internal/b0$k", "Landroidx/compose/foundation/text/c0;", "Landroidx/compose/ui/text/input/y;", "imeAction", "Lkotlin/k2;", "a", "(I)V", "Landroidx/compose/ui/focus/m;", "b", "()Landroidx/compose/ui/focus/m;", "focusManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements androidx.compose.foundation.text.c0 {
        k() {
        }

        private final androidx.compose.ui.focus.m b() {
            return (androidx.compose.ui.focus.m) androidx.compose.ui.node.i.a(b0.this, h1.j());
        }

        @Override // androidx.compose.foundation.text.c0
        public void a(int imeAction) {
            boolean l4;
            boolean l5;
            y.Companion companion = androidx.compose.ui.text.input.y.INSTANCE;
            companion.getClass();
            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21137i)) {
                androidx.compose.ui.focus.m b5 = b();
                androidx.compose.ui.focus.f.INSTANCE.getClass();
                b5.g(androidx.compose.ui.focus.f.f17526c);
                return;
            }
            companion.getClass();
            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21136h)) {
                androidx.compose.ui.focus.m b6 = b();
                androidx.compose.ui.focus.f.INSTANCE.getClass();
                b6.g(androidx.compose.ui.focus.f.f17527d);
                return;
            }
            companion.getClass();
            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21138j)) {
                b0.this.a8().a();
                return;
            }
            companion.getClass();
            boolean z4 = true;
            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21133e)) {
                l4 = true;
            } else {
                companion.getClass();
                l4 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21134f);
            }
            if (l4) {
                l5 = true;
            } else {
                companion.getClass();
                l5 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21135g);
            }
            if (!l5) {
                companion.getClass();
                z4 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21131c);
            }
            if (z4) {
                return;
            }
            companion.getClass();
            androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21132d);
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/y;", "imeAction", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends n0 implements ld.l<androidx.compose.ui.text.input.y, k2> {
        l() {
            super(1);
        }

        public final void a(int i4) {
            boolean l4;
            ld.l<androidx.compose.foundation.text.c0, k2> lVar;
            y.Companion companion = androidx.compose.ui.text.input.y.INSTANCE;
            companion.getClass();
            k2 k2Var = null;
            if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21138j)) {
                lVar = b0.this.getKeyboardActions().b();
            } else {
                companion.getClass();
                if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21133e)) {
                    lVar = b0.this.getKeyboardActions().c();
                } else {
                    companion.getClass();
                    if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21137i)) {
                        lVar = b0.this.getKeyboardActions().d();
                    } else {
                        companion.getClass();
                        if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21136h)) {
                            lVar = b0.this.getKeyboardActions().e();
                        } else {
                            companion.getClass();
                            if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21134f)) {
                                lVar = b0.this.getKeyboardActions().f();
                            } else {
                                companion.getClass();
                                if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21135g)) {
                                    lVar = b0.this.getKeyboardActions().g();
                                } else {
                                    companion.getClass();
                                    if (androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21131c)) {
                                        l4 = true;
                                    } else {
                                        companion.getClass();
                                        l4 = androidx.compose.ui.text.input.y.l(i4, androidx.compose.ui.text.input.y.f21132d);
                                    }
                                    if (!l4) {
                                        throw new IllegalStateException("invalid ImeAction");
                                    }
                                    lVar = null;
                                }
                            }
                        }
                    }
                }
            }
            if (lVar != null) {
                lVar.invoke(b0.this.keyboardActionScope);
                k2Var = k2.f75408a;
            }
            if (k2Var == null) {
                b0.this.keyboardActionScope.a(i4);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.text.input.y yVar) {
            a(yVar.getValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.a<k2> {
        m() {
            super(0);
        }

        public final void a() {
            b0.this.onImeActionPerformed.invoke(androidx.compose.ui.text.input.y.i(b0.this.getKeyboardOptions().getImeAction()));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.a<k2> {
        n() {
            super(0);
        }

        public final void a() {
            b0 b0Var = b0.this;
            b0Var.windowInfo = (d6) androidx.compose.ui.node.i.a(b0Var, h1.w());
            b0.this.k8();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8594b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8595c;

        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8597b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f8598c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.text2.input.internal.selection.i iVar, b0 b0Var) {
                super(0);
                this.f8597b = iVar;
                this.f8598c = b0Var;
            }

            public final void a() {
                if (this.f8597b.getIsFocused()) {
                    return;
                }
                androidx.compose.ui.focus.f0.c(this.f8598c);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f8599b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b0 b0Var) {
                super(0);
                this.f8599b = b0Var;
            }

            public final void a() {
                this.f8599b.a8().b();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        o(kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((o) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            o oVar = b0.this.new o(dVar);
            oVar.f8595c = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8594b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8595c;
                androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState = b0.this.getTextFieldSelectionState();
                b0 b0Var = b0.this;
                a aVar2 = new a(textFieldSelectionState, b0Var);
                b bVar = new b(b0Var);
                this.f8594b = 1;
                if (textFieldSelectionState.E0(k0Var, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8600b;

        /* compiled from: TextFieldDecoratorModifier.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {485}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q2;", "", "<anonymous>", "(Landroidx/compose/ui/platform/q2;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<q2, kotlin.coroutines.d<?>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8602b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f8603c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0 f8604d;

            /* compiled from: TextFieldDecoratorModifier.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {482}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text2.input.internal.b0$p$a$a, reason: collision with other inner class name */
            static final class C0180a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f8605b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b0 f8606c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0180a(b0 b0Var, kotlin.coroutines.d<? super C0180a> dVar) {
                    super(2, dVar);
                    this.f8606c = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0180a(this.f8606c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8605b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState = this.f8606c.getTextFieldSelectionState();
                        this.f8605b = 1;
                        if (textFieldSelectionState.r0(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0180a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8604d = b0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l q2 q2Var, @fg.m kotlin.coroutines.d<?> dVar) {
                return ((a) create(q2Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f8604d, dVar);
                aVar.f8603c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8602b;
                if (i4 == 0) {
                    a1.n(obj);
                    q2 q2Var = (q2) this.f8603c;
                    kotlinx.coroutines.k.f(q2Var, null, kotlinx.coroutines.t0.UNDISPATCHED, new C0180a(this.f8604d, null), 1, null);
                    m0 textFieldState = this.f8604d.getTextFieldState();
                    androidx.compose.ui.text.input.z k4 = this.f8604d.getKeyboardOptions().k(this.f8604d.getSingleLine());
                    ld.l lVar = this.f8604d.onImeActionPerformed;
                    this.f8602b = 1;
                    if (androidx.compose.foundation.text2.input.internal.b.e(q2Var, textFieldState, k4, lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        p(kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return b0.this.new p(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8600b;
            if (i4 == 0) {
                a1.n(obj);
                b0 b0Var = b0.this;
                a aVar2 = new a(b0Var, null);
                this.f8600b = 1;
                if (n2.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((p) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public b0(@fg.l m0 m0Var, @fg.l j0 j0Var, @fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.m androidx.compose.foundation.text2.input.h hVar, boolean z4, boolean z5, @fg.l androidx.compose.foundation.text.f0 f0Var, @fg.l androidx.compose.foundation.text.d0 d0Var, boolean z6) {
        this.textFieldState = m0Var;
        this.textLayoutState = j0Var;
        this.textFieldSelectionState = iVar;
        this.filter = hVar;
        this.enabled = z4;
        this.readOnly = z5;
        this.keyboardActions = d0Var;
        this.singleLine = z6;
        androidx.compose.foundation.text2.input.h hVar2 = this.filter;
        this.keyboardOptions = a0.a(f0Var, hVar2 != null ? hVar2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = new androidx.compose.foundation.text2.input.internal.a();
        this.keyboardActionScope = new k();
        this.onImeActionPerformed = new l();
    }

    private final void P7() {
        kotlinx.coroutines.k2 k2Var = this.inputSessionJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.inputSessionJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z7() {
        d6 d6Var;
        return this.isElementFocused && (d6Var = this.windowInfo) != null && d6Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g5 a8() {
        g5 g5Var = (g5) androidx.compose.ui.node.i.a(this, h1.r());
        if (g5Var != null) {
            return g5Var;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    private final void j8() {
        kotlinx.coroutines.k2 f4;
        f4 = kotlinx.coroutines.k.f(V6(), null, null, new p(null), 3, null);
        this.inputSessionJob = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k8() {
        d6 d6Var = this.windowInfo;
        if (d6Var == null) {
            return;
        }
        if (d6Var != null && d6Var.b() && this.isElementFocused) {
            j8();
        } else {
            P7();
        }
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        this.pointerInputNode.E4();
    }

    /* renamed from: Q7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @fg.m
    /* renamed from: R7, reason: from getter */
    public final androidx.compose.foundation.text2.input.h getFilter() {
        return this.filter;
    }

    @fg.l
    /* renamed from: S7, reason: from getter */
    public final androidx.compose.foundation.text.d0 getKeyboardActions() {
        return this.keyboardActions;
    }

    @fg.l
    /* renamed from: T7, reason: from getter */
    public final androidx.compose.foundation.text.f0 getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: U7, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: V7, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.textLayoutState.n(coordinates);
    }

    @fg.l
    /* renamed from: W7, reason: from getter */
    public final androidx.compose.foundation.text2.input.internal.selection.i getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    @fg.l
    /* renamed from: X7, reason: from getter */
    public final m0 getTextFieldState() {
        return this.textFieldState;
    }

    @fg.l
    /* renamed from: Y7, reason: from getter */
    public final j0 getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void b8(boolean z4) {
        this.enabled = z4;
    }

    public final void c8(@fg.m androidx.compose.foundation.text2.input.h hVar) {
        this.filter = hVar;
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        l1.a(this, new n());
    }

    public final void d8(@fg.l androidx.compose.foundation.text.d0 d0Var) {
        this.keyboardActions = d0Var;
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l androidx.compose.ui.focus.j0 focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        this.textFieldSelectionState.x0(Z7());
        if (!focusState.isFocused()) {
            P7();
            this.textFieldState.f();
        } else {
            if (!this.enabled || this.readOnly) {
                return;
            }
            j8();
        }
    }

    public final void e8(boolean z4) {
        this.readOnly = z4;
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        androidx.compose.foundation.text2.input.q l4 = this.textFieldState.l();
        long selectionInChars = l4.getSelectionInChars();
        androidx.compose.ui.semantics.w.c1(zVar, new androidx.compose.ui.text.e(l4.toString(), null, null, 6, null));
        androidx.compose.ui.semantics.w.v1(zVar, selectionInChars);
        androidx.compose.ui.semantics.w.Z(zVar, null, new b(), 1, null);
        if (!this.enabled) {
            androidx.compose.ui.semantics.w.n(zVar);
        }
        androidx.compose.ui.semantics.w.u1(zVar, null, new c(), 1, null);
        androidx.compose.ui.semantics.w.o1(zVar, null, new d(), 1, null);
        androidx.compose.ui.semantics.w.n0(zVar, null, new e(), 1, null);
        androidx.compose.ui.semantics.w.z0(zVar, this.keyboardOptions.getImeAction(), null, new f(), 2, null);
        androidx.compose.ui.semantics.w.x0(zVar, null, new g(), 1, null);
        androidx.compose.ui.semantics.w.B0(zVar, null, new h(), 1, null);
        if (!t0.h(selectionInChars)) {
            androidx.compose.ui.semantics.w.j(zVar, null, new i(), 1, null);
            if (this.enabled && !this.readOnly) {
                androidx.compose.ui.semantics.w.l(zVar, null, new j(), 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        androidx.compose.ui.semantics.w.M0(zVar, null, new a(), 1, null);
    }

    public final void f8(boolean z4) {
        this.singleLine = z4;
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        this.pointerInputNode.g1(pointerEvent, pass, bounds);
    }

    public final void g8(@fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar) {
        this.textFieldSelectionState = iVar;
    }

    public final void h8(@fg.l m0 m0Var) {
        this.textFieldState = m0Var;
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        d2();
    }

    public final void i8(@fg.l j0 j0Var) {
        this.textLayoutState = j0Var;
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        P7();
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean k4(@fg.l KeyEvent event) {
        return this.textFieldKeyEventHandler.b(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new m());
    }

    public final void l8(@fg.l m0 textFieldState, @fg.l j0 textLayoutState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.m androidx.compose.foundation.text2.input.h filter, boolean enabled, boolean readOnly, @fg.l androidx.compose.foundation.text.f0 keyboardOptions, @fg.l androidx.compose.foundation.text.d0 keyboardActions, boolean singleLine) {
        boolean z4 = this.enabled;
        boolean z5 = false;
        boolean z6 = z4 && !this.readOnly;
        if (enabled && !readOnly) {
            z5 = true;
        }
        m0 m0Var = this.textFieldState;
        androidx.compose.foundation.text.f0 f0Var = this.keyboardOptions;
        androidx.compose.foundation.text2.input.internal.selection.i iVar = this.textFieldSelectionState;
        androidx.compose.foundation.text2.input.h hVar = this.filter;
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = a0.a(keyboardOptions, filter != null ? filter.getKeyboardOptions() : null);
        this.keyboardActions = keyboardActions;
        this.singleLine = singleLine;
        if (z5 != z6 || !kotlin.jvm.internal.l0.g(textFieldState, m0Var) || !kotlin.jvm.internal.l0.g(keyboardOptions, f0Var) || !kotlin.jvm.internal.l0.g(filter, hVar)) {
            if (z5 && Z7()) {
                j8();
            } else if (!z5) {
                P7();
            }
        }
        if (z4 != enabled) {
            z1.b(this);
        }
        if (kotlin.jvm.internal.l0.g(textFieldSelectionState, iVar)) {
            return;
        }
        this.pointerInputNode.g3();
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean n3(@fg.l KeyEvent event) {
        return this.textFieldKeyEventHandler.c(event, this.textFieldState, this.textFieldSelectionState, (androidx.compose.ui.focus.m) androidx.compose.ui.node.i.a(this, h1.j()), a8());
    }

    @Override // androidx.compose.ui.node.y1
    /* renamed from: s6 */
    public boolean getMergeDescendants() {
        return true;
    }
}
