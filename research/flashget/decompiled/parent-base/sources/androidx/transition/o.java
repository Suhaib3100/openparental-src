package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes3.dex */
class o<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f34444a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f34445b;

    /* renamed from: c, reason: collision with root package name */
    private final float f34446c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f34447d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f34448e;

    /* renamed from: f, reason: collision with root package name */
    private float f34449f;

    o(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f34447d = new float[2];
        this.f34448e = new PointF();
        this.f34444a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f34445b = pathMeasure;
        this.f34446c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t4) {
        return Float.valueOf(this.f34449f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t4, Float f4) {
        this.f34449f = f4.floatValue();
        this.f34445b.getPosTan(f4.floatValue() * this.f34446c, this.f34447d, null);
        PointF pointF = this.f34448e;
        float[] fArr = this.f34447d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f34444a.set(t4, pointF);
    }
}
