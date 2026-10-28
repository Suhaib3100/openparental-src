package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/g1;", "Landroidx/compose/ui/unit/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(FFZLld/l;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/layout/g1;", "node", "v", "(Landroidx/compose/foundation/layout/g1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "F", "s", "()F", "e", "u", "f", "Z", "r", "()Z", "g", "Lld/l;", "o", "()Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OffsetElement extends androidx.compose.ui.node.y0<g1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float y;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean rtlAware;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    public /* synthetic */ OffsetElement(float f4, float f5, boolean z4, ld.l lVar, kotlin.jvm.internal.w wVar) {
        this(f4, f5, z4, lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        OffsetElement offsetElement = other instanceof OffsetElement ? (OffsetElement) other : null;
        if (offsetElement == null) {
            return false;
        }
        return androidx.compose.ui.unit.h.l(this.x, offsetElement.x) && androidx.compose.ui.unit.h.l(this.y, offsetElement.y) && this.rtlAware == offsetElement.rtlAware;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.rtlAware) + androidx.compose.animation.l0.a(this.y, androidx.compose.ui.unit.h.n(this.x) * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g1 i() {
        return new g1(this.x, this.y, this.rtlAware, null);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> o() {
        return this.inspectorInfo;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: s, reason: from getter */
    public final float getX() {
        return this.x;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        androidx.compose.foundation.b0.a(this.x, sb, ", y=");
        androidx.compose.foundation.b0.a(this.y, sb, ", rtlAware=");
        return androidx.compose.animation.l.a(sb, this.rtlAware, ')');
    }

    /* renamed from: u, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l g1 node) {
        node.C7(this.x);
        node.D7(this.y);
        node.B7(this.rtlAware);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f4, float f5, boolean z4, ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.x = f4;
        this.y = f5;
        this.rtlAware = z4;
        this.inspectorInfo = lVar;
    }
}
