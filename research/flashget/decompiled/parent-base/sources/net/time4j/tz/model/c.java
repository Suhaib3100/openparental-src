package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.e0;
import net.time4j.g1;
import net.time4j.l0;

/* compiled from: DayOfWeekInMonthPattern.java */
/* loaded from: classes7.dex */
final class c extends g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* renamed from: g, reason: collision with root package name */
    private final transient byte f83604g;

    /* renamed from: h, reason: collision with root package name */
    private final transient byte f83605h;

    /* renamed from: i, reason: collision with root package name */
    private final transient boolean f83606i;

    c(e0 e0Var, int i4, g1 g1Var, int i5, i iVar, int i6, boolean z4) {
        super(e0Var, i5, iVar, i6);
        net.time4j.base.b.a(2000, e0Var.getValue(), i4);
        this.f83604g = (byte) i4;
        this.f83605h = (byte) g1Var.getValue();
        this.f83606i = z4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("餉\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 121);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f83604g == cVar.f83604g && this.f83605h == cVar.f83605h && this.f83606i == cVar.f83606i && m(cVar);
    }

    @Override // net.time4j.tz.model.d
    int g() {
        return 121;
    }

    public int hashCode() {
        return (((l() * 37) + this.f83605h) * 17) + this.f83604g + (this.f83606i ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.tz.model.g
    protected l0 j(int i4) {
        int i5;
        byte l4 = l();
        int c5 = net.time4j.base.b.c(i4, l4, this.f83604g);
        l0 r12 = l0.r1(i4, l4, this.f83604g);
        byte b5 = this.f83605h;
        if (c5 == b5) {
            return r12;
        }
        int i6 = c5 - b5;
        if (this.f83606i) {
            i6 = -i6;
            i5 = 1;
        } else {
            i5 = -1;
        }
        if (i6 < 0) {
            i6 += 7;
        }
        return (l0) r12.W(i6 * i5, net.time4j.h.DAYS);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(64, ProtectedSandApp.s("養\u0001"));
        a5.append((int) l());
        a5.append(ProtectedSandApp.s("餋\u0001"));
        a5.append((int) this.f83604g);
        a5.append(ProtectedSandApp.s("餌\u0001"));
        a5.append(g1.valueOf(this.f83605h));
        a5.append(ProtectedSandApp.s("餍\u0001"));
        a5.append(c());
        a5.append(ProtectedSandApp.s("餎\u0001"));
        a5.append(f());
        a5.append(ProtectedSandApp.s("餏\u0001"));
        a5.append(d());
        a5.append(ProtectedSandApp.s("餐\u0001"));
        a5.append(e());
        a5.append(ProtectedSandApp.s("餑\u0001"));
        return androidx.compose.animation.l.a(a5, this.f83606i, ']');
    }

    int v() {
        return this.f83604g;
    }

    byte w() {
        return this.f83605h;
    }

    boolean x() {
        return this.f83606i;
    }
}
