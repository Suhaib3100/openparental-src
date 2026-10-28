package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.d1;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextFieldTextLayoutModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00126\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013HÂ\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0012*\u00020&H\u0016¢\u0006\u0004\b'\u0010(Jr\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t28\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<RD\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text2/input/internal/h0;", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/ui/text/v0;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/d;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/n0;", "Lkotlin/r0;", "name", "getResult", "Lkotlin/k2;", "Lkotlin/u;", "onTextLayout", "<init>", "(Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZLld/p;)V", "n", "()Landroidx/compose/foundation/text2/input/internal/j0;", "o", "()Landroidx/compose/foundation/text2/input/internal/m0;", "r", "()Landroidx/compose/ui/text/v0;", "s", "()Z", "u", "()Lld/p;", "x", "()Landroidx/compose/foundation/text2/input/internal/h0;", "node", "z", "(Landroidx/compose/foundation/text2/input/internal/h0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "v", "(Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZLld/p;)Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/foundation/text2/input/internal/j0;", "e", "Landroidx/compose/foundation/text2/input/internal/m0;", "f", "Landroidx/compose/ui/text/v0;", "g", "Z", "h", "Lld/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldTextLayoutModifier extends y0<h0> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f8546i = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 textLayoutState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 textFieldState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 textStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<androidx.compose.ui.unit.d, ld.a<n0>, k2> onTextLayout;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(@fg.l j0 j0Var, @fg.l m0 m0Var, @fg.l v0 v0Var, boolean z4, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<n0>, k2> pVar) {
        this.textLayoutState = j0Var;
        this.textFieldState = m0Var;
        this.textStyle = v0Var;
        this.singleLine = z4;
        this.onTextLayout = pVar;
    }

    /* renamed from: n, reason: from getter */
    private final j0 getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: o, reason: from getter */
    private final m0 getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: r, reason: from getter */
    private final v0 getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: s, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    private final ld.p<androidx.compose.ui.unit.d, ld.a<n0>, k2> u() {
        return this.onTextLayout;
    }

    public static TextFieldTextLayoutModifier w(TextFieldTextLayoutModifier textFieldTextLayoutModifier, j0 j0Var, m0 m0Var, v0 v0Var, boolean z4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j0Var = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i4 & 2) != 0) {
            m0Var = textFieldTextLayoutModifier.textFieldState;
        }
        m0 m0Var2 = m0Var;
        if ((i4 & 4) != 0) {
            v0Var = textFieldTextLayoutModifier.textStyle;
        }
        v0 v0Var2 = v0Var;
        if ((i4 & 8) != 0) {
            z4 = textFieldTextLayoutModifier.singleLine;
        }
        boolean z5 = z4;
        if ((i4 & 16) != 0) {
            pVar = textFieldTextLayoutModifier.onTextLayout;
        }
        textFieldTextLayoutModifier.getClass();
        return new TextFieldTextLayoutModifier(j0Var, m0Var2, v0Var2, z5, pVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) other;
        return kotlin.jvm.internal.l0.g(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && kotlin.jvm.internal.l0.g(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && kotlin.jvm.internal.l0.g(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && kotlin.jvm.internal.l0.g(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = d1.a(this.singleLine, androidx.compose.foundation.text.modifiers.h.a(this.textStyle, (this.textFieldState.hashCode() + (this.textLayoutState.hashCode() * 31)) * 31, 31), 31);
        ld.p<androidx.compose.ui.unit.d, ld.a<n0>, k2> pVar = this.onTextLayout;
        return a5 + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @fg.l
    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ')';
    }

    @fg.l
    public final TextFieldTextLayoutModifier v(@fg.l j0 textLayoutState, @fg.l m0 textFieldState, @fg.l v0 textStyle, boolean singleLine, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<n0>, k2> onTextLayout) {
        return new TextFieldTextLayoutModifier(textLayoutState, textFieldState, textStyle, singleLine, onTextLayout);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public h0 i() {
        return new h0(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l h0 node) {
        node.y7(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }
}
