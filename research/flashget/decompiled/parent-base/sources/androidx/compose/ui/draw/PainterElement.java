package androidx.compose.ui.draw;

import androidx.compose.animation.d1;
import androidx.compose.foundation.h0;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010%¨\u0006C"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/draw/q;", "Landroidx/compose/ui/graphics/painter/e;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/e;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;)V", "z", "()Landroidx/compose/ui/draw/q;", "node", "Lkotlin/k2;", "J", "(Landroidx/compose/ui/draw/q;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/ui/graphics/painter/e;", "o", "()Z", "r", "()Landroidx/compose/ui/c;", "s", "()Landroidx/compose/ui/layout/f;", "u", "()F", "v", "()Landroidx/compose/ui/graphics/e2;", "w", "(Landroidx/compose/ui/graphics/painter/e;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;)Landroidx/compose/ui/draw/PainterElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/graphics/painter/e;", "F", "e", "Z", "H", "f", "Landroidx/compose/ui/c;", "A", "g", "Landroidx/compose/ui/layout/f;", "D", "h", "B", "i", "Landroidx/compose/ui/graphics/e2;", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends y0<q> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.painter.e painter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean sizeToIntrinsics;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.c alignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.f contentScale;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e2 colorFilter;

    public PainterElement(@fg.l androidx.compose.ui.graphics.painter.e eVar, boolean z4, @fg.l androidx.compose.ui.c cVar, @fg.l androidx.compose.ui.layout.f fVar, float f4, @fg.m e2 e2Var) {
        this.painter = eVar;
        this.sizeToIntrinsics = z4;
        this.alignment = cVar;
        this.contentScale = fVar;
        this.alpha = f4;
        this.colorFilter = e2Var;
    }

    public static PainterElement x(PainterElement painterElement, androidx.compose.ui.graphics.painter.e eVar, boolean z4, androidx.compose.ui.c cVar, androidx.compose.ui.layout.f fVar, float f4, e2 e2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = painterElement.painter;
        }
        if ((i4 & 2) != 0) {
            z4 = painterElement.sizeToIntrinsics;
        }
        boolean z5 = z4;
        if ((i4 & 4) != 0) {
            cVar = painterElement.alignment;
        }
        androidx.compose.ui.c cVar2 = cVar;
        if ((i4 & 8) != 0) {
            fVar = painterElement.contentScale;
        }
        androidx.compose.ui.layout.f fVar2 = fVar;
        if ((i4 & 16) != 0) {
            f4 = painterElement.alpha;
        }
        float f5 = f4;
        if ((i4 & 32) != 0) {
            e2Var = painterElement.colorFilter;
        }
        painterElement.getClass();
        return new PainterElement(eVar, z5, cVar2, fVar2, f5, e2Var);
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* renamed from: B, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @fg.m
    /* renamed from: C, reason: from getter */
    public final e2 getColorFilter() {
        return this.colorFilter;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final androidx.compose.ui.layout.f getContentScale() {
        return this.contentScale;
    }

    @fg.l
    /* renamed from: F, reason: from getter */
    public final androidx.compose.ui.graphics.painter.e getPainter() {
        return this.painter;
    }

    /* renamed from: H, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l q node) {
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z4 = this.sizeToIntrinsics;
        boolean z5 = sizeToIntrinsics != z4 || (z4 && !i0.n.k(node.getPainter().i(), this.painter.i()));
        node.L7(this.painter);
        node.M7(this.sizeToIntrinsics);
        node.I7(this.alignment);
        node.K7(this.contentScale);
        node.k(this.alpha);
        node.J7(this.colorFilter);
        if (z5) {
            f0.b(node);
        }
        androidx.compose.ui.node.r.a(node);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return l0.g(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && l0.g(this.alignment, painterElement.alignment) && l0.g(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && l0.g(this.colorFilter, painterElement.colorFilter);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.l0.a(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + d1.a(this.sizeToIntrinsics, this.painter.hashCode() * 31, 31)) * 31)) * 31, 31);
        e2 e2Var = this.colorFilter;
        return a5 + (e2Var == null ? 0 : e2Var.hashCode());
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("paint");
        a2Var.getProperties().c("painter", this.painter);
        h0.a(this.sizeToIntrinsics, a2Var.getProperties(), "sizeToIntrinsics", a2Var).c("alignment", this.alignment);
        a2Var.getProperties().c("contentScale", this.contentScale);
        a2Var.getProperties().c("alpha", Float.valueOf(this.alpha));
        a2Var.getProperties().c("colorFilter", this.colorFilter);
    }

    @fg.l
    public final androidx.compose.ui.graphics.painter.e n() {
        return this.painter;
    }

    public final boolean o() {
        return this.sizeToIntrinsics;
    }

    @fg.l
    public final androidx.compose.ui.c r() {
        return this.alignment;
    }

    @fg.l
    public final androidx.compose.ui.layout.f s() {
        return this.contentScale;
    }

    @fg.l
    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public final float u() {
        return this.alpha;
    }

    @fg.m
    public final e2 v() {
        return this.colorFilter;
    }

    @fg.l
    public final PainterElement w(@fg.l androidx.compose.ui.graphics.painter.e painter, boolean sizeToIntrinsics, @fg.l androidx.compose.ui.c alignment, @fg.l androidx.compose.ui.layout.f contentScale, float alpha, @fg.m e2 colorFilter) {
        return new PainterElement(painter, sizeToIntrinsics, alignment, contentScale, alpha, colorFilter);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public q i() {
        return new q(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }
}
