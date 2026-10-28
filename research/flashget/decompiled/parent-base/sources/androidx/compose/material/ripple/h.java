package androidx.compose.material.ripple;

import androidx.compose.animation.l0;
import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: RippleTheme.kt */
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/ripple/h;", "", "", "draggedAlpha", "focusedAlpha", "hoveredAlpha", "pressedAlpha", "<init>", "(FFFF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "()F", "b", "c", "d", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final int f9314e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float draggedAlpha;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float focusedAlpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float hoveredAlpha;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float pressedAlpha;

    public h(float f4, float f5, float f6, float f7) {
        this.draggedAlpha = f4;
        this.focusedAlpha = f5;
        this.hoveredAlpha = f6;
        this.pressedAlpha = f7;
    }

    /* renamed from: a, reason: from getter */
    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    /* renamed from: b, reason: from getter */
    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    /* renamed from: c, reason: from getter */
    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    /* renamed from: d, reason: from getter */
    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return this.draggedAlpha == hVar.draggedAlpha && this.focusedAlpha == hVar.focusedAlpha && this.hoveredAlpha == hVar.hoveredAlpha && this.pressedAlpha == hVar.pressedAlpha;
    }

    public int hashCode() {
        return Float.hashCode(this.pressedAlpha) + l0.a(this.hoveredAlpha, l0.a(this.focusedAlpha, Float.hashCode(this.draggedAlpha) * 31, 31), 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.draggedAlpha);
        sb.append(", focusedAlpha=");
        sb.append(this.focusedAlpha);
        sb.append(", hoveredAlpha=");
        sb.append(this.hoveredAlpha);
        sb.append(", pressedAlpha=");
        return androidx.compose.animation.b.a(sb, this.pressedAlpha, ')');
    }
}
