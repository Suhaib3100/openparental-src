package net.time4j;

import net.time4j.engine.r;

/* compiled from: RoundingOperator.java */
/* loaded from: classes7.dex */
final class t0<T extends net.time4j.engine.r<T>> implements net.time4j.engine.v<T> {

    /* renamed from: b, reason: collision with root package name */
    private final q0<?, T> f83541b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f83542c;

    /* renamed from: d, reason: collision with root package name */
    private final double f83543d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f83544e;

    t0(q0<?, T> q0Var, Boolean bool, int i4) {
        this.f83541b = q0Var;
        this.f83542c = bool;
        this.f83543d = i4;
        this.f83544e = q0Var.getType().equals(Long.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V extends Number, T extends net.time4j.engine.r<T>> net.time4j.engine.v<T> b(q0<V, T> q0Var, Number number) {
        return q0Var.d0((Number) q0Var.getType().cast(number));
    }

    @Override // net.time4j.engine.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T apply(T t4) {
        double floor;
        double d5;
        double d6;
        double doubleValue = ((Number) t4.r(this.f83541b)).doubleValue();
        Boolean bool = this.f83542c;
        if (bool == null) {
            double ceil = Math.ceil(doubleValue / this.f83543d);
            double d7 = this.f83543d;
            d6 = ceil * d7;
            double floor2 = Math.floor(doubleValue / d7) * this.f83543d;
            if (doubleValue - floor2 < d6 - doubleValue) {
                d6 = floor2;
            }
        } else {
            if (bool.booleanValue()) {
                floor = Math.ceil(doubleValue / this.f83543d);
                d5 = this.f83543d;
            } else {
                floor = Math.floor(doubleValue / this.f83543d);
                d5 = this.f83543d;
            }
            d6 = d5 * floor;
        }
        return (T) t4.N(b(this.f83541b, this.f83544e ? Long.valueOf((long) d6) : Integer.valueOf((int) d6)));
    }
}
