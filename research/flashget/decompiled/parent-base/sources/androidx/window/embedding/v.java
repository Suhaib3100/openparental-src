package androidx.window.embedding;

import androidx.compose.animation.d1;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SplitPairRule.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Landroidx/window/embedding/v;", "Landroidx/window/embedding/x;", "", "Landroidx/window/embedding/u;", "filters", "", "finishPrimaryWithSecondary", "finishSecondaryWithPrimary", "clearTop", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", "<init>", "(Ljava/util/Set;ZZZIIFI)V", "filter", "j", "(Landroidx/window/embedding/u;)Landroidx/window/embedding/v;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "Z", "h", "()Z", "f", "i", "g", "Ljava/util/Set;", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v extends x {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean finishPrimaryWithSecondary;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean finishSecondaryWithPrimary;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean clearTop;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<u> filters;

    public /* synthetic */ v(Set set, boolean z4, boolean z5, boolean z6, int i4, int i5, float f4, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(set, (i7 & 2) != 0 ? false : z4, (i7 & 4) != 0 ? true : z5, (i7 & 8) != 0 ? false : z6, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) == 0 ? i5 : 0, (i7 & 64) != 0 ? 0.5f : f4, (i7 & 128) != 0 ? 3 : i6);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v) || !super.equals(other)) {
            return false;
        }
        v vVar = (v) other;
        return l0.g(this.filters, vVar.filters) && this.finishPrimaryWithSecondary == vVar.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == vVar.finishSecondaryWithPrimary && this.clearTop == vVar.clearTop;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getClearTop() {
        return this.clearTop;
    }

    @fg.l
    public final Set<u> g() {
        return this.filters;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return Boolean.hashCode(this.clearTop) + d1.a(this.finishSecondaryWithPrimary, d1.a(this.finishPrimaryWithSecondary, (this.filters.hashCode() + (super.hashCode() * 31)) * 31, 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @fg.l
    public final v j(@fg.l u filter) {
        l0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new v(kotlin.collections.w.a6(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@fg.l Set<u> filters, boolean z4, boolean z5, boolean z6, int i4, int i5, float f4, int i6) {
        super(i4, i5, f4, i6);
        l0.p(filters, "filters");
        this.finishPrimaryWithSecondary = z4;
        this.finishSecondaryWithPrimary = z5;
        this.clearTop = z6;
        this.filters = kotlin.collections.w.a6(filters);
    }
}
