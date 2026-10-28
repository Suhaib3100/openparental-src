package androidx.compose.ui.unit;

import kotlin.Metadata;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/unit/x;", "Lw0/a;", "", "fontScale", "<init>", "(F)V", "c", "()F", "sp", "b", "(F)F", "dp", "a", "d", "(F)Landroidx/compose/ui/unit/x;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class x implements w0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float fontScale;

    public x(float f4) {
        this.fontScale = f4;
    }

    /* renamed from: c, reason: from getter */
    private final float getFontScale() {
        return this.fontScale;
    }

    public static x e(x xVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = xVar.fontScale;
        }
        xVar.getClass();
        return new x(f4);
    }

    @Override // w0.a
    public float a(float dp) {
        return dp / this.fontScale;
    }

    @Override // w0.a
    public float b(float sp) {
        return sp * this.fontScale;
    }

    @fg.l
    public final x d(float fontScale) {
        return new x(fontScale);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof x) && Float.compare(this.fontScale, ((x) other).fontScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    @fg.l
    public String toString() {
        return androidx.compose.animation.b.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.fontScale, ')');
    }
}
