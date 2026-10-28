package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.d1;
import androidx.compose.foundation.w2;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: TextFieldCoreModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u000eHÂ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÂ\u0003¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020&*\u00020)H\u0016¢\u0006\u0004\b*\u0010+J`\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010E¨\u0006F"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text2/input/internal/z;", "", "isFocused", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "writeable", "Landroidx/compose/foundation/w2;", "scrollState", "Landroidx/compose/foundation/gestures/j0;", "orientation", "<init>", "(ZLandroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/ui/graphics/t1;ZLandroidx/compose/foundation/w2;Landroidx/compose/foundation/gestures/j0;)V", "n", "()Z", "o", "()Landroidx/compose/foundation/text2/input/internal/j0;", "r", "()Landroidx/compose/foundation/text2/input/internal/m0;", "s", "()Landroidx/compose/foundation/text2/input/internal/selection/i;", "u", "()Landroidx/compose/ui/graphics/t1;", "v", "w", "()Landroidx/compose/foundation/w2;", "x", "()Landroidx/compose/foundation/gestures/j0;", "B", "()Landroidx/compose/foundation/text2/input/internal/z;", "node", "Lkotlin/k2;", "C", "(Landroidx/compose/foundation/text2/input/internal/z;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "z", "(ZLandroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/ui/graphics/t1;ZLandroidx/compose/foundation/w2;Landroidx/compose/foundation/gestures/j0;)Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "e", "Landroidx/compose/foundation/text2/input/internal/j0;", "f", "Landroidx/compose/foundation/text2/input/internal/m0;", "g", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "h", "Landroidx/compose/ui/graphics/t1;", "i", "j", "Landroidx/compose/foundation/w2;", "Landroidx/compose/foundation/gestures/j0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends y0<z> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f8527l = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isFocused;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 textLayoutState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 textFieldState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t1 cursorBrush;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean writeable;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w2 scrollState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.j0 orientation;

    public TextFieldCoreModifier(boolean z4, @fg.l j0 j0Var, @fg.l m0 m0Var, @fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.l t1 t1Var, boolean z5, @fg.l w2 w2Var, @fg.l androidx.compose.foundation.gestures.j0 j0Var2) {
        this.isFocused = z4;
        this.textLayoutState = j0Var;
        this.textFieldState = m0Var;
        this.textFieldSelectionState = iVar;
        this.cursorBrush = t1Var;
        this.writeable = z5;
        this.scrollState = w2Var;
        this.orientation = j0Var2;
    }

    public static TextFieldCoreModifier A(TextFieldCoreModifier textFieldCoreModifier, boolean z4, j0 j0Var, m0 m0Var, androidx.compose.foundation.text2.input.internal.selection.i iVar, t1 t1Var, boolean z5, w2 w2Var, androidx.compose.foundation.gestures.j0 j0Var2, int i4, Object obj) {
        boolean z6 = (i4 & 1) != 0 ? textFieldCoreModifier.isFocused : z4;
        j0 j0Var3 = (i4 & 2) != 0 ? textFieldCoreModifier.textLayoutState : j0Var;
        m0 m0Var2 = (i4 & 4) != 0 ? textFieldCoreModifier.textFieldState : m0Var;
        androidx.compose.foundation.text2.input.internal.selection.i iVar2 = (i4 & 8) != 0 ? textFieldCoreModifier.textFieldSelectionState : iVar;
        t1 t1Var2 = (i4 & 16) != 0 ? textFieldCoreModifier.cursorBrush : t1Var;
        boolean z7 = (i4 & 32) != 0 ? textFieldCoreModifier.writeable : z5;
        w2 w2Var2 = (i4 & 64) != 0 ? textFieldCoreModifier.scrollState : w2Var;
        androidx.compose.foundation.gestures.j0 j0Var4 = (i4 & 128) != 0 ? textFieldCoreModifier.orientation : j0Var2;
        textFieldCoreModifier.getClass();
        return new TextFieldCoreModifier(z6, j0Var3, m0Var2, iVar2, t1Var2, z7, w2Var2, j0Var4);
    }

    /* renamed from: n, reason: from getter */
    private final boolean getIsFocused() {
        return this.isFocused;
    }

    /* renamed from: o, reason: from getter */
    private final j0 getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: r, reason: from getter */
    private final m0 getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: s, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.selection.i getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* renamed from: u, reason: from getter */
    private final t1 getCursorBrush() {
        return this.cursorBrush;
    }

    /* renamed from: v, reason: from getter */
    private final boolean getWriteable() {
        return this.writeable;
    }

    /* renamed from: w, reason: from getter */
    private final w2 getScrollState() {
        return this.scrollState;
    }

    /* renamed from: x, reason: from getter */
    private final androidx.compose.foundation.gestures.j0 getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public z i() {
        return new z(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l z node) {
        node.Y7(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) other;
        return this.isFocused == textFieldCoreModifier.isFocused && kotlin.jvm.internal.l0.g(this.textLayoutState, textFieldCoreModifier.textLayoutState) && kotlin.jvm.internal.l0.g(this.textFieldState, textFieldCoreModifier.textFieldState) && kotlin.jvm.internal.l0.g(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && kotlin.jvm.internal.l0.g(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && kotlin.jvm.internal.l0.g(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.orientation.hashCode() + ((this.scrollState.hashCode() + d1.a(this.writeable, (this.cursorBrush.hashCode() + ((this.textFieldSelectionState.hashCode() + ((this.textFieldState.hashCode() + ((this.textLayoutState.hashCode() + (Boolean.hashCode(this.isFocused) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @fg.l
    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    @fg.l
    public final TextFieldCoreModifier z(boolean isFocused, @fg.l j0 textLayoutState, @fg.l m0 textFieldState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.l t1 cursorBrush, boolean writeable, @fg.l w2 scrollState, @fg.l androidx.compose.foundation.gestures.j0 orientation) {
        return new TextFieldCoreModifier(isFocused, textLayoutState, textFieldState, textFieldSelectionState, cursorBrush, writeable, scrollState, orientation);
    }
}
