package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.e1;
import kotlin.Metadata;

/* compiled from: WhitePoint.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/e0;", "", "", "x", "y", "<init>", "(FF)V", "z", "(FFF)V", "sum", "(FFFF)V", "", "g", "()[F", "a", "()F", "b", "c", "(FF)Landroidx/compose/ui/graphics/colorspace/e0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "e", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float y;

    public e0(float f4, float f5) {
        this.x = f4;
        this.y = f5;
    }

    public static e0 d(e0 e0Var, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = e0Var.x;
        }
        if ((i4 & 2) != 0) {
            f5 = e0Var.y;
        }
        e0Var.getClass();
        return new e0(f4, f5);
    }

    /* renamed from: a, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: b, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @fg.l
    public final e0 c(float x4, float y4) {
        return new e0(x4, y4);
    }

    public final float e() {
        return this.x;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return Float.compare(this.x, e0Var.x) == 0 && Float.compare(this.y, e0Var.y) == 0;
    }

    public final float f() {
        return this.y;
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] g() {
        float f4 = this.x;
        float f5 = this.y;
        return new float[]{f4 / f5, 1.0f, ((1.0f - f4) - f5) / f5};
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.x);
        sb.append(", y=");
        return androidx.compose.animation.b.a(sb, this.y, ')');
    }

    public e0(float f4, float f5, float f6) {
        this(f4, f5, f6, f4 + f5 + f6);
    }

    private e0(float f4, float f5, float f6, float f7) {
        this(f4 / f7, f5 / f7);
    }
}
