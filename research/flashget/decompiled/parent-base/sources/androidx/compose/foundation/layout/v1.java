package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/v1;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/x;", "crossAxisAlignment", "<init>", "(FZLandroidx/compose/foundation/layout/x;)V", "a", "()F", "b", "()Z", "c", "()Landroidx/compose/foundation/layout/x;", "d", "(FZLandroidx/compose/foundation/layout/x;)Landroidx/compose/foundation/layout/v1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "h", "k", "(F)V", "Z", "g", "j", "(Z)V", "Landroidx/compose/foundation/layout/x;", "f", "i", "(Landroidx/compose/foundation/layout/x;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5353d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float weight;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean fill;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private x crossAxisAlignment;

    public v1() {
        this(0.0f, false, null, 7, null);
    }

    public static v1 e(v1 v1Var, float f4, boolean z4, x xVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = v1Var.weight;
        }
        if ((i4 & 2) != 0) {
            z4 = v1Var.fill;
        }
        if ((i4 & 4) != 0) {
            xVar = v1Var.crossAxisAlignment;
        }
        v1Var.getClass();
        return new v1(f4, z4, xVar);
    }

    /* renamed from: a, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final x getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @fg.l
    public final v1 d(float weight, boolean fill, @fg.m x crossAxisAlignment) {
        return new v1(weight, fill, crossAxisAlignment);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) other;
        return Float.compare(this.weight, v1Var.weight) == 0 && this.fill == v1Var.fill && kotlin.jvm.internal.l0.g(this.crossAxisAlignment, v1Var.crossAxisAlignment);
    }

    @fg.m
    public final x f() {
        return this.crossAxisAlignment;
    }

    public final boolean g() {
        return this.fill;
    }

    public final float h() {
        return this.weight;
    }

    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.fill, Float.hashCode(this.weight) * 31, 31);
        x xVar = this.crossAxisAlignment;
        return a5 + (xVar == null ? 0 : xVar.hashCode());
    }

    public final void i(@fg.m x xVar) {
        this.crossAxisAlignment = xVar;
    }

    public final void j(boolean z4) {
        this.fill = z4;
    }

    public final void k(float f4) {
        this.weight = f4;
    }

    @fg.l
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public v1(float f4, boolean z4, @fg.m x xVar) {
        this.weight = f4;
        this.fill = z4;
        this.crossAxisAlignment = xVar;
    }

    public /* synthetic */ v1(float f4, boolean z4, x xVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? 0.0f : f4, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? null : xVar);
    }
}
