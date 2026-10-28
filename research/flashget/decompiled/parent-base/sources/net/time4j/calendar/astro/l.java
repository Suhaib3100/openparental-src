package net.time4j.calendar.astro;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.Serializable;
import net.time4j.calendar.astro.n;
import net.time4j.d0;

/* compiled from: SunPosition.java */
/* loaded from: classes7.dex */
public class l implements c, Serializable {
    private static final long serialVersionUID = -3023032442869934354L;
    private final double azimuth;
    private final double declination;
    private final double elevation;
    private final double rightAscension;

    private l(double d5, double d6, double d7, double d10) {
        this.rightAscension = d5;
        this.declination = d6;
        this.azimuth = d7;
        this.elevation = d10;
    }

    public static l c(d0 d0Var, d dVar) {
        e k4 = e.k(d0Var);
        double b5 = k4.b();
        k kVar = k.TIME4J;
        double[] dArr = new double[2];
        k.nutations(b5, dArr);
        double d5 = dArr[0];
        double meanObliquity = k.meanObliquity(b5) + dArr[1];
        double radians = Math.toRadians(kVar.rightAscension(k4.e()));
        double radians2 = Math.toRadians(kVar.declination(k4.e()));
        double radians3 = Math.toRadians(dVar.b());
        double radians4 = Math.toRadians(dVar.c());
        double cos = Math.cos(radians3);
        double sin = Math.sin(radians3);
        int a5 = dVar.a();
        double c5 = e.n(d0Var).c();
        double cos2 = Math.cos(Math.toRadians(meanObliquity)) * d5;
        double radians5 = ((Math.toRadians(cos2) + a.b(c5)) + radians4) - radians;
        double degrees = Math.toDegrees(Math.asin((Math.cos(radians5) * Math.cos(radians2) * cos) + (Math.sin(radians2) * sin)));
        if (degrees >= (-0.5d) - kVar.getGeodeticAngle(dVar.b(), a5)) {
            degrees += (a.d(a5) * a.a(degrees)) / 60.0d;
        }
        double degrees2 = Math.toDegrees(Math.atan2(Math.sin(radians5), (Math.cos(radians5) * sin) - (Math.tan(radians2) * cos))) + 180.0d;
        return new l(Math.toDegrees(radians), Math.toDegrees(radians2), degrees2, degrees);
    }

    public static n.a g(n nVar) {
        return n.a.g('S', nVar);
    }

    public static n.a h(n nVar) {
        return n.a.h('S', nVar);
    }

    @Override // net.time4j.calendar.astro.c
    public double a() {
        return this.declination;
    }

    @Override // net.time4j.calendar.astro.c
    public double b() {
        return this.rightAscension;
    }

    public double d() {
        return this.azimuth;
    }

    public double e() {
        return this.elevation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.rightAscension == lVar.rightAscension && this.declination == lVar.declination && this.azimuth == lVar.azimuth && this.elevation == lVar.elevation;
    }

    public double f(double d5) {
        double e4 = e();
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谺\u0001"), d5));
        }
        if (d5 <= p.f60679p) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谹\u0001"), d5));
        }
        if (e4 <= p.f60679p) {
            return Double.POSITIVE_INFINITY;
        }
        if (e4 == 90.0d) {
            return p.f60679p;
        }
        double tan = d5 / Math.tan(Math.toRadians(e4));
        return tan < 0.016666666666666666d ? p.f60679p : tan;
    }

    public int hashCode() {
        return (a.c(this.declination) * 31) + a.c(this.rightAscension);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(100, ProtectedSandApp.s("谻\u0001"));
        a5.append(this.rightAscension);
        a5.append(ProtectedSandApp.s("谼\u0001"));
        a5.append(this.declination);
        a5.append(ProtectedSandApp.s("谽\u0001"));
        a5.append(this.azimuth);
        a5.append(ProtectedSandApp.s("谾\u0001"));
        a5.append(this.elevation);
        a5.append(']');
        return a5.toString();
    }
}
