package net.time4j.format.expert;

import androidx.collection.n1;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ElementPosition.java */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.q<?> f82928a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82929b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82930c;

    public h(net.time4j.engine.q<?> qVar, int i4, int i5) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("钭\u0001"));
        }
        String s4 = ProtectedSandApp.s("钨\u0001");
        String s5 = ProtectedSandApp.s("钩\u0001");
        if (i4 < 0) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("钬\u0001"), i4, s5);
            a5.append(qVar.name());
            a5.append(s4);
            throw new IllegalArgumentException(a5.toString());
        }
        if (i5 > i4) {
            this.f82928a = qVar;
            this.f82929b = i4;
            this.f82930c = i5;
        } else {
            StringBuilder a6 = n1.a(ProtectedSandApp.s("钪\u0001"), i5, ProtectedSandApp.s("钫\u0001"), i4, s5);
            a6.append(qVar.name());
            a6.append(s4);
            throw new IllegalArgumentException(a6.toString());
        }
    }

    public net.time4j.engine.q<?> a() {
        return this.f82928a;
    }

    public int b() {
        return this.f82930c;
    }

    public int c() {
        return this.f82929b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f82928a.equals(hVar.f82928a) && this.f82929b == hVar.f82929b && this.f82930c == hVar.f82930c;
    }

    public int hashCode() {
        return ((this.f82929b | (this.f82930c << 16)) * 37) + this.f82928a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        m2.a(h.class, sb, ProtectedSandApp.s("钮\u0001"));
        sb.append(this.f82928a.name());
        sb.append(ProtectedSandApp.s("钯\u0001"));
        sb.append(this.f82929b);
        sb.append(ProtectedSandApp.s("钰\u0001"));
        return androidx.view.e.a(sb, this.f82930c, ']');
    }
}
