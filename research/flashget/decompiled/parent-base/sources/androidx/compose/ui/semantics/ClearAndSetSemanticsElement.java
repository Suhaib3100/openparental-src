package androidx.compose.ui.semantics;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: SemanticsModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0006*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u00002\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/semantics/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "Lkotlin/u;", "properties", "<init>", "(Lld/l;)V", "s", "()Landroidx/compose/ui/semantics/d;", "node", "v", "(Landroidx/compose/ui/semantics/d;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/l;", "o", "(Lld/l;)Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/l;", "u", "Landroidx/compose/ui/semantics/l;", "v6", "()Landroidx/compose/ui/semantics/l;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends y0<d> implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final int f20275e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<z, k2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@fg.l ld.l<? super z, k2> lVar) {
        this.properties = lVar;
    }

    public static ClearAndSetSemanticsElement r(ClearAndSetSemanticsElement clearAndSetSemanticsElement, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = clearAndSetSemanticsElement.properties;
        }
        clearAndSetSemanticsElement.getClass();
        return new ClearAndSetSemanticsElement(lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearAndSetSemanticsElement) && l0.g(this.properties, ((ClearAndSetSemanticsElement) other).properties);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("clearAndSetSemantics");
        o.b(a2Var, v6());
    }

    @fg.l
    public final ld.l<z, k2> n() {
        return this.properties;
    }

    @fg.l
    public final ClearAndSetSemanticsElement o(@fg.l ld.l<? super z, k2> properties) {
        return new ClearAndSetSemanticsElement(properties);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(false, true, this.properties);
    }

    @fg.l
    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @fg.l
    public final ld.l<z, k2> u() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l d node) {
        node.D7(this.properties);
    }

    @Override // androidx.compose.ui.semantics.n
    @fg.l
    public l v6() {
        l lVar = new l();
        lVar.v(false);
        lVar.s(true);
        this.properties.invoke(lVar);
        return lVar;
    }
}
