package androidx.compose.ui;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: ZIndexModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/x;", "", "zIndex", "<init>", "(F)V", "s", "()Landroidx/compose/ui/x;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/ui/x;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()F", "o", "(F)Landroidx/compose/ui/ZIndexElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "F", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends y0<x> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17360e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float zIndex;

    public ZIndexElement(float f4) {
        this.zIndex = f4;
    }

    public static ZIndexElement r(ZIndexElement zIndexElement, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = zIndexElement.zIndex;
        }
        zIndexElement.getClass();
        return new ZIndexElement(f4);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) other).zIndex) == 0;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("zIndex");
        a2Var.getProperties().c("zIndex", Float.valueOf(this.zIndex));
    }

    /* renamed from: n, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    @fg.l
    public final ZIndexElement o(float zIndex) {
        return new ZIndexElement(zIndex);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public x i() {
        return new x(this.zIndex);
    }

    @fg.l
    public String toString() {
        return androidx.compose.animation.b.a(new StringBuilder("ZIndexElement(zIndex="), this.zIndex, ')');
    }

    public final float u() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l x node) {
        node.z7(this.zIndex);
    }
}
