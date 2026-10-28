package com.google.common.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: BigDecimalMath.java */
@e
@d9.c
/* loaded from: classes6.dex */
public class a {

    /* compiled from: BigDecimalMath.java */
    /* renamed from: com.google.common.math.a$a, reason: collision with other inner class name */
    private static class C0874a extends p<BigDecimal> {

        /* renamed from: a, reason: collision with root package name */
        static final C0874a f57177a = new C0874a();

        private C0874a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(double d5, RoundingMode roundingMode) {
            return new BigDecimal(d5);
        }
    }

    private a() {
    }

    public static double a(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return C0874a.f57177a.b(bigDecimal, roundingMode);
    }
}
