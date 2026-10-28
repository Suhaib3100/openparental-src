package androidx.core.graphics;

import android.graphics.PointF;

/* compiled from: PathSegment.java */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f4693a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4694b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f4695c;

    /* renamed from: d, reason: collision with root package name */
    private final float f4696d;

    public c2(@androidx.annotation.o0 PointF pointF, float f6, @androidx.annotation.o0 PointF pointF2, float f7) {
        this.f4693a = (PointF) androidx.core.util.q.m(pointF, "start == null");
        this.f4694b = f6;
        this.f4695c = (PointF) androidx.core.util.q.m(pointF2, "end == null");
        this.f4696d = f7;
    }

    @androidx.annotation.o0
    public PointF a() {
        return this.f4695c;
    }

    public float b() {
        return this.f4696d;
    }

    @androidx.annotation.o0
    public PointF c() {
        return this.f4693a;
    }

    public float d() {
        return this.f4694b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Float.compare(this.f4694b, c2Var.f4694b) == 0 && Float.compare(this.f4696d, c2Var.f4696d) == 0 && this.f4693a.equals(c2Var.f4693a) && this.f4695c.equals(c2Var.f4695c);
    }

    public int hashCode() {
        int hashCode = this.f4693a.hashCode() * 31;
        float f6 = this.f4694b;
        int hashCode2 = (this.f4695c.hashCode() + ((hashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31)) * 31;
        float f7 = this.f4696d;
        return hashCode2 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f4693a + ", startFraction=" + this.f4694b + ", end=" + this.f4695c + ", endFraction=" + this.f4696d + '}';
    }
}
