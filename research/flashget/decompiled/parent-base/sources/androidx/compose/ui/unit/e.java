package androidx.compose.ui.unit;

import kotlin.Metadata;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/unit/e;", "Landroidx/compose/ui/unit/d;", "", "density", "fontScale", "<init>", "(FF)V", "a", "()F", "f", "l", "(FF)Landroidx/compose/ui/unit/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "c", "U", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class e implements d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float fontScale;

    public e(float f4, float f5) {
        this.density = f4;
        this.fontScale = f5;
    }

    public static e p(e eVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = eVar.density;
        }
        if ((i4 & 2) != 0) {
            f5 = eVar.fontScale;
        }
        eVar.getClass();
        return new e(f4, f5);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    /* renamed from: a, reason: from getter */
    public final float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.d
    public float b() {
        return this.density;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return Float.compare(this.density, eVar.density) == 0 && Float.compare(this.fontScale, eVar.fontScale) == 0;
    }

    public final float f() {
        return this.fontScale;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale) + (Float.hashCode(this.density) * 31);
    }

    @fg.l
    public final e l(float density, float fontScale) {
        return new e(density, fontScale);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.density);
        sb.append(", fontScale=");
        return androidx.compose.animation.b.a(sb, this.fontScale, ')');
    }
}
