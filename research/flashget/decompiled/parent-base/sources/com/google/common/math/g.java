package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;

/* compiled from: LinearTransformation.java */
@com.google.common.math.e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public abstract class g {

    /* compiled from: LinearTransformation.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final double f57208a;

        /* renamed from: b, reason: collision with root package name */
        private final double f57209b;

        public g a(double d5, double d6) {
            l0.d(com.google.common.math.d.d(d5) && com.google.common.math.d.d(d6));
            double d7 = this.f57208a;
            if (d5 != d7) {
                return b((d6 - this.f57209b) / (d5 - d7));
            }
            l0.d(d6 != this.f57209b);
            return new e(this.f57208a);
        }

        public g b(double d5) {
            l0.d(!Double.isNaN(d5));
            return com.google.common.math.d.d(d5) ? new d(d5, this.f57209b - (this.f57208a * d5)) : new e(this.f57208a);
        }

        private b(double d5, double d6) {
            this.f57208a = d5;
            this.f57209b = d6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinearTransformation.java */
    static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        static final c f57210a = new c();

        private c() {
        }

        @Override // com.google.common.math.g
        public g c() {
            return this;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return Double.NaN;
        }

        @Override // com.google.common.math.g
        public double h(double d5) {
            return Double.NaN;
        }

        public String toString() {
            return ProtectedSandApp.s("\uf6fa");
        }
    }

    public static g a() {
        return c.f57210a;
    }

    public static g b(double d5) {
        l0.d(com.google.common.math.d.d(d5));
        return new d(com.google.firebase.remoteconfig.p.f60679p, d5);
    }

    public static b f(double d5, double d6) {
        l0.d(com.google.common.math.d.d(d5) && com.google.common.math.d.d(d6));
        return new b(d5, d6);
    }

    public static g i(double d5) {
        l0.d(com.google.common.math.d.d(d5));
        return new e(d5);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double d5);

    /* compiled from: LinearTransformation.java */
    private static final class e extends g {

        /* renamed from: a, reason: collision with root package name */
        final double f57214a;

        /* renamed from: b, reason: collision with root package name */
        @g9.b
        @zc.a
        g f57215b;

        e(double d5) {
            this.f57214a = d5;
            this.f57215b = null;
        }

        private g j() {
            return new d(com.google.firebase.remoteconfig.p.f60679p, this.f57214a, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f57215b;
            if (gVar != null) {
                return gVar;
            }
            g j4 = j();
            this.f57215b = j4;
            return j4;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return true;
        }

        @Override // com.google.common.math.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.g
        public double h(double d5) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format(ProtectedSandApp.s("\uf6fc"), Double.valueOf(this.f57214a));
        }

        e(double d5, g gVar) {
            this.f57214a = d5;
            this.f57215b = gVar;
        }
    }

    /* compiled from: LinearTransformation.java */
    private static final class d extends g {

        /* renamed from: a, reason: collision with root package name */
        final double f57211a;

        /* renamed from: b, reason: collision with root package name */
        final double f57212b;

        /* renamed from: c, reason: collision with root package name */
        @g9.b
        @zc.a
        g f57213c;

        d(double d5, double d6) {
            this.f57211a = d5;
            this.f57212b = d6;
            this.f57213c = null;
        }

        private g j() {
            double d5 = this.f57211a;
            return d5 != com.google.firebase.remoteconfig.p.f60679p ? new d(1.0d / d5, (this.f57212b * (-1.0d)) / d5, this) : new e(this.f57212b, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f57213c;
            if (gVar != null) {
                return gVar;
            }
            g j4 = j();
            this.f57213c = j4;
            return j4;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return this.f57211a == com.google.firebase.remoteconfig.p.f60679p;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return this.f57211a;
        }

        @Override // com.google.common.math.g
        public double h(double d5) {
            return (d5 * this.f57211a) + this.f57212b;
        }

        public String toString() {
            return String.format(ProtectedSandApp.s("\uf6fb"), Double.valueOf(this.f57211a), Double.valueOf(this.f57212b));
        }

        d(double d5, double d6, g gVar) {
            this.f57211a = d5;
            this.f57212b = d6;
            this.f57213c = gVar;
        }
    }
}
