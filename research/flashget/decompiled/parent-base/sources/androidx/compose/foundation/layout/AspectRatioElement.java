package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/k;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(FZLld/l;)V", "n", "()Landroidx/compose/foundation/layout/k;", "node", "u", "(Landroidx/compose/foundation/layout/k;)V", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "o", "()F", "e", "Z", "s", "()Z", "f", "Lld/l;", "r", "()Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioElement extends androidx.compose.ui.node.y0<k> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float aspectRatio;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean matchHeightConstraintsFirst;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f4, boolean z4, @fg.l ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.aspectRatio = f4;
        this.matchHeightConstraintsFirst = z4;
        this.inspectorInfo = lVar;
        if (f4 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f4 + " must be > 0").toString());
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioElement aspectRatioElement = other instanceof AspectRatioElement ? (AspectRatioElement) other : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return this.aspectRatio == aspectRatioElement.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioElement) other).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.matchHeightConstraintsFirst) + (Float.hashCode(this.aspectRatio) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public k i() {
        return new k(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    /* renamed from: o, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> r() {
        return this.inspectorInfo;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l k node) {
        node.B7(this.aspectRatio);
        node.C7(this.matchHeightConstraintsFirst);
    }
}
