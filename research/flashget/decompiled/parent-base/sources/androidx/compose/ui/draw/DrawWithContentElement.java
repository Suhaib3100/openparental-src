package androidx.compose.ui.draw;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00002\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/draw/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "Lkotlin/u;", "onDraw", "<init>", "(Lld/l;)V", "s", "()Landroidx/compose/ui/draw/n;", "node", "v", "(Landroidx/compose/ui/draw/n;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/l;", "o", "(Lld/l;)Landroidx/compose/ui/draw/DrawWithContentElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/l;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithContentElement extends y0<n> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.graphics.drawscope.c, k2> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        this.onDraw = lVar;
    }

    public static DrawWithContentElement r(DrawWithContentElement drawWithContentElement, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = drawWithContentElement.onDraw;
        }
        drawWithContentElement.getClass();
        return new DrawWithContentElement(lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawWithContentElement) && l0.g(this.onDraw, ((DrawWithContentElement) other).onDraw);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("drawWithContent");
        a2Var.getProperties().c("onDraw", this.onDraw);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.c, k2> n() {
        return this.onDraw;
    }

    @fg.l
    public final DrawWithContentElement o(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> onDraw) {
        return new DrawWithContentElement(onDraw);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public n i() {
        return new n(this.onDraw);
    }

    @fg.l
    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.c, k2> u() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l n node) {
        node.z7(this.onDraw);
    }
}
