package androidx.compose.ui.focus;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusRequesterModifier.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/focus/g0;", "Landroidx/compose/ui/focus/a0;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/a0;)V", "s", "()Landroidx/compose/ui/focus/g0;", "node", "Lkotlin/k2;", "u", "(Landroidx/compose/ui/focus/g0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/ui/focus/a0;", "o", "(Landroidx/compose/ui/focus/a0;)Landroidx/compose/ui/focus/FocusRequesterElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/focus/a0;", "k1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n735#2,2:82\n728#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n57#1:82,2\n59#1:84,2\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends y0<g0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 focusRequester;

    public FocusRequesterElement(@fg.l a0 a0Var) {
        this.focusRequester = a0Var;
    }

    public static FocusRequesterElement r(FocusRequesterElement focusRequesterElement, a0 a0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a0Var = focusRequesterElement.focusRequester;
        }
        focusRequesterElement.getClass();
        return new FocusRequesterElement(a0Var);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusRequesterElement) && kotlin.jvm.internal.l0.g(this.focusRequester, ((FocusRequesterElement) other).focusRequester);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("focusRequester");
        a2Var.getProperties().c("focusRequester", this.focusRequester);
    }

    @fg.l
    /* renamed from: k1, reason: from getter */
    public final a0 getFocusRequester() {
        return this.focusRequester;
    }

    @fg.l
    public final a0 n() {
        return this.focusRequester;
    }

    @fg.l
    public final FocusRequesterElement o(@fg.l a0 focusRequester) {
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public g0 i() {
        return new g0(this.focusRequester);
    }

    @fg.l
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l g0 node) {
        node.getFocusRequester().g().j0(node);
        node.y7(this.focusRequester);
        node.getFocusRequester().g().b(node);
    }
}
