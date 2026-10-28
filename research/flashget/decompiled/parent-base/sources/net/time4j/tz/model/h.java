package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.e0;
import net.time4j.g1;
import net.time4j.l0;

/* compiled from: LastWeekdayPattern.java */
/* loaded from: classes7.dex */
final class h extends g {
    private static final long serialVersionUID = -946839310332554772L;

    /* renamed from: g, reason: collision with root package name */
    private final transient byte f83613g;

    h(e0 e0Var, g1 g1Var, int i4, i iVar, int i5) {
        super(e0Var, i4, iVar, i5);
        this.f83613g = (byte) g1Var.getValue();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("餜\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 122);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f83613g == hVar.f83613g && m(hVar);
    }

    @Override // net.time4j.tz.model.d
    int g() {
        return 122;
    }

    public int hashCode() {
        return (l() * 37) + (this.f83613g * 17);
    }

    @Override // net.time4j.tz.model.g
    protected l0 j(int i4) {
        byte l4 = l();
        int d5 = net.time4j.base.b.d(i4, l4);
        int c5 = net.time4j.base.b.c(i4, l4, d5) - this.f83613g;
        if (c5 < 0) {
            c5 += 7;
        }
        return l0.r1(i4, l4, d5 - c5);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(64, ProtectedSandApp.s("餝\u0001"));
        a5.append((int) l());
        a5.append(ProtectedSandApp.s("餞\u0001"));
        a5.append(g1.valueOf(this.f83613g));
        a5.append(ProtectedSandApp.s("餟\u0001"));
        a5.append(c());
        a5.append(ProtectedSandApp.s("餠\u0001"));
        a5.append(f());
        a5.append(ProtectedSandApp.s("餡\u0001"));
        a5.append(d());
        a5.append(ProtectedSandApp.s("餢\u0001"));
        a5.append(e());
        a5.append(']');
        return a5.toString();
    }

    byte v() {
        return this.f83613g;
    }
}
