package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.e0;
import net.time4j.l0;

/* compiled from: FixedDayPattern.java */
/* loaded from: classes7.dex */
final class f extends g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* renamed from: g, reason: collision with root package name */
    private final transient byte f83611g;

    f(e0 e0Var, int i4, int i5, i iVar, int i6) {
        super(e0Var, i5, iVar, i6);
        net.time4j.base.b.a(2000, e0Var.getValue(), i4);
        this.f83611g = (byte) i4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("餕\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 120);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f83611g == fVar.f83611g && m(fVar);
    }

    @Override // net.time4j.tz.model.d
    int g() {
        return 120;
    }

    public int hashCode() {
        return (l() * 37) + this.f83611g;
    }

    @Override // net.time4j.tz.model.g
    protected l0 j(int i4) {
        return l0.r1(i4, l(), this.f83611g);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(64, ProtectedSandApp.s("餖\u0001"));
        a5.append((int) l());
        a5.append(ProtectedSandApp.s("餗\u0001"));
        a5.append((int) this.f83611g);
        a5.append(ProtectedSandApp.s("餘\u0001"));
        a5.append(c());
        a5.append(ProtectedSandApp.s("餙\u0001"));
        a5.append(f());
        a5.append(ProtectedSandApp.s("餚\u0001"));
        a5.append(d());
        a5.append(ProtectedSandApp.s("餛\u0001"));
        a5.append(e());
        a5.append(']');
        return a5.toString();
    }

    int v() {
        return this.f83611g;
    }
}
