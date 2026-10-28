package com.google.common.util.concurrent;

import com.google.common.util.concurrent.m1;
import java.util.concurrent.TimeUnit;

/* compiled from: SmoothRateLimiter.java */
@b0
@d9.c
/* loaded from: classes6.dex */
abstract class v1 extends m1 {

    /* renamed from: c, reason: collision with root package name */
    double f57970c;

    /* renamed from: d, reason: collision with root package name */
    double f57971d;

    /* renamed from: e, reason: collision with root package name */
    double f57972e;

    /* renamed from: f, reason: collision with root package name */
    private long f57973f;

    /* compiled from: SmoothRateLimiter.java */
    static final class b extends v1 {

        /* renamed from: g, reason: collision with root package name */
        final double f57974g;

        b(m1.a aVar, double d5) {
            super(aVar);
            this.f57974g = d5;
        }

        @Override // com.google.common.util.concurrent.v1
        double v() {
            return this.f57972e;
        }

        @Override // com.google.common.util.concurrent.v1
        void w(double d5, double d6) {
            double d7 = this.f57971d;
            double d10 = this.f57974g * d5;
            this.f57971d = d10;
            if (d7 == Double.POSITIVE_INFINITY) {
                this.f57970c = d10;
                return;
            }
            double d11 = com.google.firebase.remoteconfig.p.f60679p;
            if (d7 != com.google.firebase.remoteconfig.p.f60679p) {
                d11 = (this.f57970c * d10) / d7;
            }
            this.f57970c = d11;
        }

        @Override // com.google.common.util.concurrent.v1
        long y(double d5, double d6) {
            return 0L;
        }
    }

    /* compiled from: SmoothRateLimiter.java */
    static final class c extends v1 {

        /* renamed from: g, reason: collision with root package name */
        private final long f57975g;

        /* renamed from: h, reason: collision with root package name */
        private double f57976h;

        /* renamed from: i, reason: collision with root package name */
        private double f57977i;

        /* renamed from: j, reason: collision with root package name */
        private double f57978j;

        c(m1.a aVar, long j4, TimeUnit timeUnit, double d5) {
            super(aVar);
            this.f57975g = timeUnit.toMicros(j4);
            this.f57978j = d5;
        }

        private double z(double d5) {
            return (d5 * this.f57976h) + this.f57972e;
        }

        @Override // com.google.common.util.concurrent.v1
        double v() {
            return this.f57975g / this.f57971d;
        }

        @Override // com.google.common.util.concurrent.v1
        void w(double d5, double d6) {
            double d7 = this.f57971d;
            double d10 = this.f57978j * d6;
            long j4 = this.f57975g;
            double d11 = (j4 * 0.5d) / d6;
            this.f57977i = d11;
            double d12 = ((j4 * 2.0d) / (d6 + d10)) + d11;
            this.f57971d = d12;
            this.f57976h = (d10 - d6) / (d12 - d11);
            if (d7 == Double.POSITIVE_INFINITY) {
                this.f57970c = com.google.firebase.remoteconfig.p.f60679p;
                return;
            }
            if (d7 != com.google.firebase.remoteconfig.p.f60679p) {
                d12 = (this.f57970c * d12) / d7;
            }
            this.f57970c = d12;
        }

        @Override // com.google.common.util.concurrent.v1
        long y(double d5, double d6) {
            long j4;
            double d7 = d5 - this.f57977i;
            if (d7 > com.google.firebase.remoteconfig.p.f60679p) {
                double min = Math.min(d7, d6);
                j4 = (long) (((z(d7) + z(d7 - min)) * min) / 2.0d);
                d6 -= min;
            } else {
                j4 = 0;
            }
            return j4 + ((long) (this.f57972e * d6));
        }
    }

    @Override // com.google.common.util.concurrent.m1
    final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f57972e;
    }

    @Override // com.google.common.util.concurrent.m1
    final void j(double d5, long j4) {
        x(j4);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d5;
        this.f57972e = micros;
        w(d5, micros);
    }

    @Override // com.google.common.util.concurrent.m1
    final long m(long j4) {
        return this.f57973f;
    }

    @Override // com.google.common.util.concurrent.m1
    final long p(int i4, long j4) {
        x(j4);
        long j5 = this.f57973f;
        double d5 = i4;
        double min = Math.min(d5, this.f57970c);
        this.f57973f = com.google.common.math.h.x(this.f57973f, y(this.f57970c, min) + ((long) ((d5 - min) * this.f57972e)));
        this.f57970c -= min;
        return j5;
    }

    abstract double v();

    abstract void w(double d5, double d6);

    void x(long j4) {
        if (j4 > this.f57973f) {
            this.f57970c = Math.min(this.f57971d, this.f57970c + ((j4 - r0) / v()));
            this.f57973f = j4;
        }
    }

    abstract long y(double d5, double d6);

    private v1(m1.a aVar) {
        super(aVar);
        this.f57973f = 0L;
    }
}
