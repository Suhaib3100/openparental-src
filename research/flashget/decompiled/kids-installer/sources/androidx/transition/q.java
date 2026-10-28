package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes.dex */
class q<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f9943a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f9944b;

    /* renamed from: c, reason: collision with root package name */
    private final float f9945c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f9946d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f9947e;

    /* renamed from: f, reason: collision with root package name */
    private float f9948f;

    q(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f9946d = new float[2];
        this.f9947e = new PointF();
        this.f9943a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f9944b = pathMeasure;
        this.f9945c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t5) {
        return Float.valueOf(this.f9948f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t5, Float f6) {
        this.f9948f = f6.floatValue();
        this.f9944b.getPosTan(f6.floatValue() * this.f9945c, this.f9946d, null);
        PointF pointF = this.f9947e;
        float[] fArr = this.f9946d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f9943a.set(t5, pointF);
    }
}
