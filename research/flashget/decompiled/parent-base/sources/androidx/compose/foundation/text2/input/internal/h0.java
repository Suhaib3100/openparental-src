package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.q;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;

/* compiled from: TextFieldTextLayoutModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B_\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00126\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018Je\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b26\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/h0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/ui/text/v0;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/d;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/n0;", "Lkotlin/r0;", "name", "getResult", "Lkotlin/k2;", "Lkotlin/u;", "onTextLayout", "<init>", "(Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZLld/p;)V", "y7", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/foundation/text2/input/internal/j0;", "q", "Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,161:1\n154#2:162\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode\n*L\n146#1:162\n*E\n"})
/* loaded from: classes.dex */
public final class h0 extends q.d implements androidx.compose.ui.node.c0, androidx.compose.ui.node.s, androidx.compose.ui.node.h {

    /* renamed from: r, reason: collision with root package name */
    public static final int f8670r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 textLayoutState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean singleLine;

    /* compiled from: TextFieldTextLayoutModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f8673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var) {
            super(1);
            this.f8673b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f8673b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public h0(@fg.l j0 j0Var, @fg.l m0 m0Var, @fg.l v0 v0Var, boolean z4, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar) {
        this.textLayoutState = j0Var;
        this.singleLine = z4;
        j0Var.p(pVar);
        j0 j0Var2 = this.textLayoutState;
        boolean z5 = this.singleLine;
        j0Var2.r(m0Var, v0Var, z5, !z5);
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.textLayoutState.q(coordinates);
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.text.n0 l4 = this.textLayoutState.l(o0Var, o0Var.getLayoutDirection(), (y.b) androidx.compose.ui.node.i.a(this, h1.k()), j4);
        i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.INSTANCE.c(androidx.compose.ui.unit.u.m(l4.getSize()), (int) (l4.getSize() & 4294967295L)));
        this.textLayoutState.o(this.singleLine ? o0Var.R(androidx.compose.foundation.text.n0.a(l4.m(0))) : androidx.compose.ui.unit.h.g(0));
        return o0Var.U3((int) (l4.getSize() >> 32), (int) (l4.getSize() & 4294967295L), z0.W(new q0(androidx.compose.ui.layout.b.a(), Integer.valueOf(kotlin.math.b.L0(l4.getFirstBaseline()))), new q0(androidx.compose.ui.layout.b.b(), Integer.valueOf(kotlin.math.b.L0(l4.getLastBaseline())))), new a(m02));
    }

    public final void y7(@fg.l j0 textLayoutState, @fg.l m0 textFieldState, @fg.l v0 textStyle, boolean singleLine, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> onTextLayout) {
        this.textLayoutState = textLayoutState;
        textLayoutState.p(onTextLayout);
        this.singleLine = singleLine;
        this.textLayoutState.r(textFieldState, textStyle, singleLine, !singleLine);
    }
}
