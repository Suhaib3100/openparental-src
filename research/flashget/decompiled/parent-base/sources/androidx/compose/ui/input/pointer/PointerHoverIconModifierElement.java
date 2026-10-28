package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/input/pointer/v;", "Landroidx/compose/ui/input/pointer/w;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/w;Z)V", "u", "()Landroidx/compose/ui/input/pointer/v;", "node", "Lkotlin/k2;", "x", "(Landroidx/compose/ui/input/pointer/v;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/ui/input/pointer/w;", "o", "()Z", "r", "(Landroidx/compose/ui/input/pointer/w;Z)Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/input/pointer/w;", "v", "e", "Z", "w", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends y0<v> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18693f = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w icon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean overrideDescendants;

    public /* synthetic */ PointerHoverIconModifierElement(w wVar, boolean z4, int i4, kotlin.jvm.internal.w wVar2) {
        this(wVar, (i4 & 2) != 0 ? false : z4);
    }

    public static PointerHoverIconModifierElement s(PointerHoverIconModifierElement pointerHoverIconModifierElement, w wVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            wVar = pointerHoverIconModifierElement.icon;
        }
        if ((i4 & 2) != 0) {
            z4 = pointerHoverIconModifierElement.overrideDescendants;
        }
        pointerHoverIconModifierElement.getClass();
        return new PointerHoverIconModifierElement(wVar, z4);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) other;
        return kotlin.jvm.internal.l0.g(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.overrideDescendants) + (this.icon.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("pointerHoverIcon");
        a2Var.getProperties().c("icon", this.icon);
        a2Var.getProperties().c("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final w getIcon() {
        return this.icon;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @fg.l
    public final PointerHoverIconModifierElement r(@fg.l w icon, boolean overrideDescendants) {
        return new PointerHoverIconModifierElement(icon, overrideDescendants);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb.append(this.icon);
        sb.append(", overrideDescendants=");
        return androidx.compose.animation.l.a(sb, this.overrideDescendants, ')');
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public v i() {
        return new v(this.icon, this.overrideDescendants);
    }

    @fg.l
    public final w v() {
        return this.icon;
    }

    public final boolean w() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l v node) {
        node.K7(this.icon);
        node.L7(this.overrideDescendants);
    }

    public PointerHoverIconModifierElement(@fg.l w wVar, boolean z4) {
        this.icon = wVar;
        this.overrideDescendants = z4;
    }
}
