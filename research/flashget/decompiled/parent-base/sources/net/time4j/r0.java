package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: ProportionalFunction.java */
/* loaded from: classes7.dex */
final class r0 implements net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> {

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.q<? extends Number> f83516a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f83517b;

    r0(net.time4j.engine.q<? extends Number> qVar, boolean z4) {
        this.f83516a = qVar;
        this.f83517b = z4;
    }

    @Override // net.time4j.engine.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BigDecimal apply(net.time4j.engine.r<?> rVar) {
        long longValue = ((Number) rVar.r(this.f83516a)).longValue();
        long longValue2 = ((Number) rVar.i(this.f83516a)).longValue();
        long longValue3 = ((Number) rVar.g(this.f83516a)).longValue();
        if (longValue > longValue3) {
            longValue = longValue3;
        }
        if (longValue == longValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f83517b && (rVar instanceof m0) && !((m0) m0.class.cast(rVar)).P0(this.f83516a)) {
            if (longValue == longValue3) {
                return BigDecimal.ONE;
            }
            longValue3--;
        }
        return com.google.android.gms.internal.measurement.a.a(new BigDecimal(longValue - longValue2).setScale(15).divide(new BigDecimal((longValue3 - longValue2) + 1), RoundingMode.HALF_UP));
    }
}
