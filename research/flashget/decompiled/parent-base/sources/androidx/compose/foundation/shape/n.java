package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.x1;
import kotlin.Metadata;

/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/shape/n;", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/x1;", "", "size", "<init>", "(F)V", "f", "()F", "Li0/n;", "shapeSize", "Landroidx/compose/ui/unit/d;", "density", "a", "(JLandroidx/compose/ui/unit/d;)F", "", "toString", "()Ljava/lang/String;", "i", "(F)Landroidx/compose/foundation/shape/n;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "k", "valueOverride", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class n implements f, x1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float size;

    public n(float f4) {
        this.size = f4;
    }

    /* renamed from: f, reason: from getter */
    private final float getSize() {
        return this.size;
    }

    public static n j(n nVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = nVar.size;
        }
        nVar.getClass();
        return new n(f4);
    }

    @Override // androidx.compose.foundation.shape.f
    public float a(long shapeSize, @fg.l androidx.compose.ui.unit.d density) {
        return this.size;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof n) && Float.compare(this.size, ((n) other).size) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    @fg.l
    public final n i(float size) {
        return new n(size);
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String b() {
        return j.a(new StringBuilder(), this.size, "px");
    }

    @fg.l
    public String toString() {
        return j.a(new StringBuilder("CornerSize(size = "), this.size, ".px)");
    }
}
