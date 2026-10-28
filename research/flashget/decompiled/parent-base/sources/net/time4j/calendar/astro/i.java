package net.time4j.calendar.astro;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SkyPosition.java */
/* loaded from: classes7.dex */
final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    private final double f82314b;

    /* renamed from: c, reason: collision with root package name */
    private final double f82315c;

    i(double d5, double d6) {
        if (Double.isNaN(d5) || Double.isInfinite(d5) || Double.isNaN(d6) || Double.isInfinite(d6)) {
            StringBuilder a5 = com.airbnb.lottie.parser.moshi.e.a(ProtectedSandApp.s("请\u0001"), d5, ProtectedSandApp.s("诸\u0001"));
            a5.append(d6);
            throw new IllegalArgumentException(a5.toString());
        }
        this.f82314b = d5;
        this.f82315c = d6;
    }

    @Override // net.time4j.calendar.astro.c
    public double a() {
        return this.f82315c;
    }

    @Override // net.time4j.calendar.astro.c
    public double b() {
        return this.f82314b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f82314b == iVar.f82314b && this.f82315c == iVar.f82315c;
    }

    public int hashCode() {
        return (a.c(this.f82315c) * 37) + a.c(this.f82314b);
    }

    public String toString() {
        return ProtectedSandApp.s("诹\u0001") + this.f82314b + ',' + this.f82315c + ']';
    }
}
