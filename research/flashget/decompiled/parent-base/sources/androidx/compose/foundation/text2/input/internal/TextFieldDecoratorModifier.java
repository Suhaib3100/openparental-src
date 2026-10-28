package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.d1;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: TextFieldDecoratorModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000eHÂ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÂ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020(*\u00020+H\u0016¢\u0006\u0004\b,\u0010-Jl\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010GR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010C¨\u0006I"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text2/input/internal/b0;", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/h;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "singleLine", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/h;ZZLandroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Z)V", "n", "()Landroidx/compose/foundation/text2/input/internal/m0;", "o", "()Landroidx/compose/foundation/text2/input/internal/j0;", "r", "()Landroidx/compose/foundation/text2/input/internal/selection/i;", "s", "()Landroidx/compose/foundation/text2/input/h;", "u", "()Z", "v", "w", "()Landroidx/compose/foundation/text/f0;", "x", "()Landroidx/compose/foundation/text/d0;", "z", "C", "()Landroidx/compose/foundation/text2/input/internal/b0;", "node", "Lkotlin/k2;", "D", "(Landroidx/compose/foundation/text2/input/internal/b0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "A", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/j0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/h;ZZLandroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Z)Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/foundation/text2/input/internal/m0;", "e", "Landroidx/compose/foundation/text2/input/internal/j0;", "f", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "g", "Landroidx/compose/foundation/text2/input/h;", "h", "Z", "i", "j", "Landroidx/compose/foundation/text/f0;", "Landroidx/compose/foundation/text/d0;", "l", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends y0<b0> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f8536m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 textFieldState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 textLayoutState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.text2.input.h filter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean readOnly;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.f0 keyboardOptions;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.d0 keyboardActions;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    public TextFieldDecoratorModifier(@fg.l m0 m0Var, @fg.l j0 j0Var, @fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.m androidx.compose.foundation.text2.input.h hVar, boolean z4, boolean z5, @fg.l androidx.compose.foundation.text.f0 f0Var, @fg.l androidx.compose.foundation.text.d0 d0Var, boolean z6) {
        this.textFieldState = m0Var;
        this.textLayoutState = j0Var;
        this.textFieldSelectionState = iVar;
        this.filter = hVar;
        this.enabled = z4;
        this.readOnly = z5;
        this.keyboardOptions = f0Var;
        this.keyboardActions = d0Var;
        this.singleLine = z6;
    }

    public static TextFieldDecoratorModifier B(TextFieldDecoratorModifier textFieldDecoratorModifier, m0 m0Var, j0 j0Var, androidx.compose.foundation.text2.input.internal.selection.i iVar, androidx.compose.foundation.text2.input.h hVar, boolean z4, boolean z5, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z6, int i4, Object obj) {
        m0 m0Var2 = (i4 & 1) != 0 ? textFieldDecoratorModifier.textFieldState : m0Var;
        j0 j0Var2 = (i4 & 2) != 0 ? textFieldDecoratorModifier.textLayoutState : j0Var;
        androidx.compose.foundation.text2.input.internal.selection.i iVar2 = (i4 & 4) != 0 ? textFieldDecoratorModifier.textFieldSelectionState : iVar;
        androidx.compose.foundation.text2.input.h hVar2 = (i4 & 8) != 0 ? textFieldDecoratorModifier.filter : hVar;
        boolean z7 = (i4 & 16) != 0 ? textFieldDecoratorModifier.enabled : z4;
        boolean z10 = (i4 & 32) != 0 ? textFieldDecoratorModifier.readOnly : z5;
        androidx.compose.foundation.text.f0 f0Var2 = (i4 & 64) != 0 ? textFieldDecoratorModifier.keyboardOptions : f0Var;
        androidx.compose.foundation.text.d0 d0Var2 = (i4 & 128) != 0 ? textFieldDecoratorModifier.keyboardActions : d0Var;
        boolean z11 = (i4 & 256) != 0 ? textFieldDecoratorModifier.singleLine : z6;
        textFieldDecoratorModifier.getClass();
        return new TextFieldDecoratorModifier(m0Var2, j0Var2, iVar2, hVar2, z7, z10, f0Var2, d0Var2, z11);
    }

    /* renamed from: n, reason: from getter */
    private final m0 getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: o, reason: from getter */
    private final j0 getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: r, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.selection.i getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* renamed from: s, reason: from getter */
    private final androidx.compose.foundation.text2.input.h getFilter() {
        return this.filter;
    }

    /* renamed from: u, reason: from getter */
    private final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: v, reason: from getter */
    private final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: w, reason: from getter */
    private final androidx.compose.foundation.text.f0 getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: x, reason: from getter */
    private final androidx.compose.foundation.text.d0 getKeyboardActions() {
        return this.keyboardActions;
    }

    /* renamed from: z, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    @fg.l
    public final TextFieldDecoratorModifier A(@fg.l m0 textFieldState, @fg.l j0 textLayoutState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.m androidx.compose.foundation.text2.input.h filter, boolean enabled, boolean readOnly, @fg.l androidx.compose.foundation.text.f0 keyboardOptions, @fg.l androidx.compose.foundation.text.d0 keyboardActions, boolean singleLine) {
        return new TextFieldDecoratorModifier(textFieldState, textLayoutState, textFieldSelectionState, filter, enabled, readOnly, keyboardOptions, keyboardActions, singleLine);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b0 i() {
        return new b0(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l b0 node) {
        node.l8(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) other;
        return kotlin.jvm.internal.l0.g(this.textFieldState, textFieldDecoratorModifier.textFieldState) && kotlin.jvm.internal.l0.g(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && kotlin.jvm.internal.l0.g(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && kotlin.jvm.internal.l0.g(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && kotlin.jvm.internal.l0.g(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && kotlin.jvm.internal.l0.g(this.keyboardActions, textFieldDecoratorModifier.keyboardActions) && this.singleLine == textFieldDecoratorModifier.singleLine;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = (this.textFieldSelectionState.hashCode() + ((this.textLayoutState.hashCode() + (this.textFieldState.hashCode() * 31)) * 31)) * 31;
        androidx.compose.foundation.text2.input.h hVar = this.filter;
        return Boolean.hashCode(this.singleLine) + ((this.keyboardActions.hashCode() + ((this.keyboardOptions.hashCode() + d1.a(this.readOnly, d1.a(this.enabled, (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31), 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TextFieldDecoratorModifier(textFieldState=");
        sb.append(this.textFieldState);
        sb.append(", textLayoutState=");
        sb.append(this.textLayoutState);
        sb.append(", textFieldSelectionState=");
        sb.append(this.textFieldSelectionState);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", readOnly=");
        sb.append(this.readOnly);
        sb.append(", keyboardOptions=");
        sb.append(this.keyboardOptions);
        sb.append(", keyboardActions=");
        sb.append(this.keyboardActions);
        sb.append(", singleLine=");
        return androidx.compose.animation.l.a(sb, this.singleLine, ')');
    }
}
