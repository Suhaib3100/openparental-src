package androidx.core.graphics;

import android.graphics.PointF;

/* compiled from: PathSegment.java */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f26276a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26277b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f26278c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26279d;

    public k0(@androidx.annotation.o0 PointF pointF, float f4, @androidx.annotation.o0 PointF pointF2, float f5) {
        this.f26276a = (PointF) androidx.core.util.w.m(pointF, "start == null");
        this.f26277b = f4;
        this.f26278c = (PointF) androidx.core.util.w.m(pointF2, "end == null");
        this.f26279d = f5;
    }

    @androidx.annotation.o0
    public PointF a() {
        return this.f26278c;
    }

    public float b() {
        return this.f26279d;
    }

    @androidx.annotation.o0
    public PointF c() {
        return this.f26276a;
    }

    public float d() {
        return this.f26277b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f26277b, k0Var.f26277b) == 0 && Float.compare(this.f26279d, k0Var.f26279d) == 0 && this.f26276a.equals(k0Var.f26276a) && this.f26278c.equals(k0Var.f26278c);
    }

    public int hashCode() {
        int hashCode = this.f26276a.hashCode() * 31;
        float f4 = this.f26277b;
        int hashCode2 = (this.f26278c.hashCode() + ((hashCode + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31)) * 31;
        float f5 = this.f26279d;
        return hashCode2 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PathSegment{start=");
        sb.append(this.f26276a);
        sb.append(", startFraction=");
        sb.append(this.f26277b);
        sb.append(", end=");
        sb.append(this.f26278c);
        sb.append(", endFraction=");
        return androidx.compose.animation.b.a(sb, this.f26279d, '}');
    }
}
