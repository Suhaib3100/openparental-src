package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: LayoutId.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/layout/x;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "n", "()Ljava/lang/Object;", "s", "()Landroidx/compose/ui/layout/x;", "node", "Lkotlin/k2;", "u", "(Landroidx/compose/ui/layout/x;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "o", "(Ljava/lang/Object;)Landroidx/compose/ui/layout/LayoutIdElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutIdElement extends androidx.compose.ui.node.y0<x> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object layoutId;

    public LayoutIdElement(@fg.l Object obj) {
        this.layoutId = obj;
    }

    /* renamed from: n, reason: from getter */
    private final Object getLayoutId() {
        return this.layoutId;
    }

    public static LayoutIdElement r(LayoutIdElement layoutIdElement, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = layoutIdElement.layoutId;
        }
        layoutIdElement.getClass();
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutIdElement) && kotlin.jvm.internal.l0.g(this.layoutId, ((LayoutIdElement) other).layoutId);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("layoutId");
        a2Var.e(this.layoutId);
    }

    @fg.l
    public final LayoutIdElement o(@fg.l Object layoutId) {
        return new LayoutIdElement(layoutId);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public x i() {
        return new x(this.layoutId);
    }

    @fg.l
    public String toString() {
        return "LayoutIdElement(layoutId=" + this.layoutId + ')';
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l x node) {
        node.y7(this.layoutId);
    }
}
