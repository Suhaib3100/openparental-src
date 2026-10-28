package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.time4j.engine.b0;
import net.time4j.l0;

/* compiled from: EraPreference.java */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    private static final int f83193g = 127;

    /* renamed from: a, reason: collision with root package name */
    private final j f83195a;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f83196b;

    /* renamed from: c, reason: collision with root package name */
    private final l0 f83197c;

    /* renamed from: d, reason: collision with root package name */
    static final g f83190d = new g();

    /* renamed from: e, reason: collision with root package name */
    private static final h f83191e = h.g(j.AD, 1, 1, 1);

    /* renamed from: f, reason: collision with root package name */
    private static final h f83192f = h.g(j.BC, 38, 1, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final l0 f83194h = l0.q1(2000, 1);

    private g() {
        this.f83195a = null;
        this.f83196b = l0.T0().x0();
        this.f83197c = l0.T0().w0();
    }

    public static g a() {
        return c(l0.T0().w0());
    }

    public static g b(l0 l0Var, l0 l0Var2) {
        return new g(j.AB_URBE_CONDITA, l0Var, l0Var2);
    }

    public static g c(l0 l0Var) {
        return b(l0.T0().x0(), l0Var);
    }

    public static g d(l0 l0Var, l0 l0Var2) {
        return new g(j.BYZANTINE, l0Var, l0Var2);
    }

    public static g e(l0 l0Var) {
        return d(l0.T0().x0(), l0Var);
    }

    public static g g(l0 l0Var, l0 l0Var2) {
        return new g(j.HISPANIC, l0Var, l0Var2);
    }

    public static g h(l0 l0Var) {
        return g(l0.T0().x0(), l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static g i(DataInput dataInput) throws IOException {
        if (dataInput.readByte() != Byte.MAX_VALUE) {
            return f83190d;
        }
        j valueOf = j.valueOf(dataInput.readUTF());
        long readLong = dataInput.readLong();
        long readLong2 = dataInput.readLong();
        l0 l0Var = f83194h;
        b0 b0Var = b0.MODIFIED_JULIAN_DATE;
        return new g(valueOf, (l0) l0Var.L(b0Var, readLong), (l0) l0Var.L(b0Var, readLong2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        g gVar2 = f83190d;
        return this == gVar2 ? gVar == gVar2 : this.f83195a == gVar.f83195a && this.f83196b.equals(gVar.f83196b) && this.f83197c.equals(gVar.f83197c);
    }

    j f(h hVar, l0 l0Var) {
        return (this.f83195a == null || l0Var.f(this.f83196b) || l0Var.s(this.f83197c)) ? hVar.compareTo(f83191e) < 0 ? j.BC : j.AD : (this.f83195a != j.HISPANIC || hVar.compareTo(f83192f) >= 0) ? this.f83195a : j.BC;
    }

    public int hashCode() {
        return (this.f83197c.hashCode() * 37) + (this.f83196b.hashCode() * 31) + (this.f83195a.hashCode() * 17);
    }

    void j(DataOutput dataOutput) throws IOException {
        if (this == f83190d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f83195a.name());
        l0 l0Var = this.f83196b;
        b0 b0Var = b0.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) l0Var.r(b0Var)).longValue());
        dataOutput.writeLong(((Long) this.f83197c.r(b0Var)).longValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("陳\u0001"));
        if (this == f83190d) {
            sb.append(ProtectedSandApp.s("陴\u0001"));
        } else {
            sb.append(ProtectedSandApp.s("陵\u0001"));
            sb.append(this.f83195a);
            sb.append(ProtectedSandApp.s("陶\u0001"));
            sb.append(this.f83196b);
            sb.append(ProtectedSandApp.s("陷\u0001"));
            sb.append(this.f83197c);
        }
        sb.append(']');
        return sb.toString();
    }

    private g(j jVar, l0 l0Var, l0 l0Var2) {
        if (jVar.compareTo(j.AD) > 0) {
            if (!l0Var2.f(l0Var)) {
                this.f83195a = jVar;
                this.f83196b = l0Var;
                this.f83197c = l0Var2;
                return;
            } else {
                throw new IllegalArgumentException(ProtectedSandApp.s("陱\u0001") + l0Var + ProtectedSandApp.s("陲\u0001") + l0Var2);
            }
        }
        throw new UnsupportedOperationException(jVar.name());
    }
}
