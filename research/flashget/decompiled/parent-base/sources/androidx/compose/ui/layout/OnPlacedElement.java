package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OnPlacedModifier.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/layout/a1;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "onPlaced", "<init>", "(Lld/l;)V", "s", "()Landroidx/compose/ui/layout/a1;", "node", "v", "(Landroidx/compose/ui/layout/a1;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/l;", "o", "(Lld/l;)Landroidx/compose/ui/layout/OnPlacedElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/l;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class OnPlacedElement extends androidx.compose.ui.node.y0<a1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<u, k2> onPlaced;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@fg.l ld.l<? super u, k2> lVar) {
        this.onPlaced = lVar;
    }

    public static OnPlacedElement r(OnPlacedElement onPlacedElement, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = onPlacedElement.onPlaced;
        }
        onPlacedElement.getClass();
        return new OnPlacedElement(lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnPlacedElement) && kotlin.jvm.internal.l0.g(this.onPlaced, ((OnPlacedElement) other).onPlaced);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("onPlaced");
        a2Var.getProperties().c("onPlaced", this.onPlaced);
    }

    @fg.l
    public final ld.l<u, k2> n() {
        return this.onPlaced;
    }

    @fg.l
    public final OnPlacedElement o(@fg.l ld.l<? super u, k2> onPlaced) {
        return new OnPlacedElement(onPlaced);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a1 i() {
        return new a1(this.onPlaced);
    }

    @fg.l
    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    @fg.l
    public final ld.l<u, k2> u() {
        return this.onPlaced;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l a1 node) {
        node.z7(this.onPlaced);
    }
}
