package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/k2;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/layout/k2;", "node", "Lkotlin/k2;", "s", "(Landroidx/compose/foundation/layout/k2;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "r", "()F", "e", "o", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends androidx.compose.ui.node.y0<k2> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    public /* synthetic */ UnspecifiedConstraintsElement(float f4, float f5, kotlin.jvm.internal.w wVar) {
        this(f4, f5);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (!(other instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) other;
        return androidx.compose.ui.unit.h.l(this.minWidth, unspecifiedConstraintsElement.minWidth) && androidx.compose.ui.unit.h.l(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Float.hashCode(this.minHeight) + (androidx.compose.ui.unit.h.n(this.minWidth) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("defaultMinSize");
        androidx.compose.foundation.s1.a(this.minWidth, a2Var.getProperties(), "minWidth", a2Var).c("minHeight", androidx.compose.ui.unit.h.d(this.minHeight));
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public k2 i() {
        return new k2(this.minWidth, this.minHeight, null);
    }

    /* renamed from: o, reason: from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: r, reason: from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l k2 node) {
        node.B7(this.minWidth);
        node.A7(this.minHeight);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnspecifiedConstraintsElement(float r1, float r2, int r3, kotlin.jvm.internal.w r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto Ld
            androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.INSTANCE
            r1.getClass()
            float r1 = androidx.compose.ui.unit.h.c()
        Ld:
            r3 = r3 & 2
            if (r3 == 0) goto L1a
            androidx.compose.ui.unit.h$a r2 = androidx.compose.ui.unit.h.INSTANCE
            r2.getClass()
            float r2 = androidx.compose.ui.unit.h.c()
        L1a:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.UnspecifiedConstraintsElement.<init>(float, float, int, kotlin.jvm.internal.w):void");
    }

    private UnspecifiedConstraintsElement(float f4, float f5) {
        this.minWidth = f4;
        this.minHeight = f5;
    }
}
