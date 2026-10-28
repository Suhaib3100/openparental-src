package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import net.time4j.h;

/* compiled from: OverflowUnit.java */
/* loaded from: classes7.dex */
final class k0 extends net.time4j.engine.f implements x, Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final int f83304b = 0;

    /* renamed from: c, reason: collision with root package name */
    static final int f83305c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f83306d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f83307e = 3;

    /* renamed from: f, reason: collision with root package name */
    static final int f83308f = 4;

    /* renamed from: g, reason: collision with root package name */
    static final int f83309g = 5;

    /* renamed from: h, reason: collision with root package name */
    static final int f83310h = 6;
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final h unit;

    k0(h hVar, int i4) {
        this.unit = hVar;
        this.policy = i4;
    }

    @Override // net.time4j.engine.f
    protected <T extends net.time4j.engine.r<T>> net.time4j.engine.o0<T> b(net.time4j.engine.x<T> xVar) {
        if (xVar.K(l0.f83325p)) {
            return new h.j(this.unit, this.policy);
        }
        return null;
    }

    h c() {
        return this.unit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.unit == k0Var.unit && this.policy == k0Var.policy;
    }

    @Override // net.time4j.engine.w
    public double getLength() {
        return this.unit.getLength();
    }

    @Override // net.time4j.z
    public char getSymbol() {
        return (char) 0;
    }

    public int hashCode() {
        return (this.policy * 37) + (this.unit.hashCode() * 23);
    }

    @Override // net.time4j.engine.f, net.time4j.engine.w
    public boolean isCalendrical() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.unit.getSymbol());
        sb.append('-');
        switch (this.policy) {
            case 1:
                sb.append(ProtectedSandApp.s("鞊\u0001"));
                break;
            case 2:
                sb.append(ProtectedSandApp.s("鞉\u0001"));
                break;
            case 3:
                sb.append(ProtectedSandApp.s("鞈\u0001"));
                break;
            case 4:
                sb.append(ProtectedSandApp.s("鞇\u0001"));
                break;
            case 5:
                sb.append(ProtectedSandApp.s("鞆\u0001"));
                break;
            case 6:
                sb.append(ProtectedSandApp.s("鞅\u0001"));
                break;
            default:
                sb.append(ProtectedSandApp.s("鞄\u0001"));
                break;
        }
        return sb.toString();
    }
}
