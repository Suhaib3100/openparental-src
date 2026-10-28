package androidx.compose.ui.semantics;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: SemanticsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R(\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/semantics/n;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "Lkotlin/u;", "properties", "<init>", "(ZLld/l;)V", "u", "()Landroidx/compose/ui/semantics/d;", "node", "x", "(Landroidx/compose/ui/semantics/d;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Z", "o", "()Lld/l;", "r", "(ZLld/l;)Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "v", "e", "Lld/l;", "w", "Landroidx/compose/ui/semantics/l;", "v6", "()Landroidx/compose/ui/semantics/l;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends y0<d> implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20272f = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeDescendants;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<z, k2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z4, @fg.l ld.l<? super z, k2> lVar) {
        this.mergeDescendants = z4;
        this.properties = lVar;
    }

    public static AppendedSemanticsElement s(AppendedSemanticsElement appendedSemanticsElement, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i4 & 2) != 0) {
            lVar = appendedSemanticsElement.properties;
        }
        appendedSemanticsElement.getClass();
        return new AppendedSemanticsElement(z4, lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) other;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && l0.g(this.properties, appendedSemanticsElement.properties);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.properties.hashCode() + (Boolean.hashCode(this.mergeDescendants) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("semantics");
        a2Var.getProperties().c("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        o.b(a2Var, v6());
    }

    /* renamed from: n, reason: from getter */
    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @fg.l
    public final ld.l<z, k2> o() {
        return this.properties;
    }

    @fg.l
    public final AppendedSemanticsElement r(boolean mergeDescendants, @fg.l ld.l<? super z, k2> properties) {
        return new AppendedSemanticsElement(mergeDescendants, properties);
    }

    @fg.l
    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.mergeDescendants + ", properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(this.mergeDescendants, false, this.properties);
    }

    public final boolean v() {
        return this.mergeDescendants;
    }

    @Override // androidx.compose.ui.semantics.n
    @fg.l
    public l v6() {
        l lVar = new l();
        lVar.v(this.mergeDescendants);
        this.properties.invoke(lVar);
        return lVar;
    }

    @fg.l
    public final ld.l<z, k2> w() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l d node) {
        node.C7(this.mergeDescendants);
        node.D7(this.properties);
    }
}
