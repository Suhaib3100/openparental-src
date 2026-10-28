package android.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: e, reason: collision with root package name */
    private static final s0 f7509e = s0.d();

    /* renamed from: a, reason: collision with root package name */
    private w f7510a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f7511b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile h2 f7512c;

    /* renamed from: d, reason: collision with root package name */
    private volatile w f7513d;

    public s1(s0 s0Var, w wVar) {
        a(s0Var, wVar);
        this.f7511b = s0Var;
        this.f7510a = wVar;
    }

    private static void a(s0 s0Var, w wVar) {
        if (s0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (wVar == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static s1 e(h2 h2Var) {
        s1 s1Var = new s1();
        s1Var.m(h2Var);
        return s1Var;
    }

    private static h2 j(h2 h2Var, w wVar, s0 s0Var) {
        try {
            return h2Var.n().w1(wVar, s0Var).build();
        } catch (InvalidProtocolBufferException unused) {
            return h2Var;
        }
    }

    public void b() {
        this.f7510a = null;
        this.f7512c = null;
        this.f7513d = null;
    }

    public boolean c() {
        w wVar;
        w wVar2 = this.f7513d;
        w wVar3 = w.f7553s;
        return wVar2 == wVar3 || (this.f7512c == null && ((wVar = this.f7510a) == null || wVar == wVar3));
    }

    protected void d(h2 h2Var) {
        if (this.f7512c != null) {
            return;
        }
        synchronized (this) {
            if (this.f7512c != null) {
                return;
            }
            try {
                if (this.f7510a != null) {
                    this.f7512c = h2Var.z().d(this.f7510a, this.f7511b);
                    this.f7513d = this.f7510a;
                } else {
                    this.f7512c = h2Var;
                    this.f7513d = w.f7553s;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f7512c = h2Var;
                this.f7513d = w.f7553s;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        h2 h2Var = this.f7512c;
        h2 h2Var2 = s1Var.f7512c;
        return (h2Var == null && h2Var2 == null) ? n().equals(s1Var.n()) : (h2Var == null || h2Var2 == null) ? h2Var != null ? h2Var.equals(s1Var.g(h2Var.m())) : g(h2Var2.m()).equals(h2Var2) : h2Var.equals(h2Var2);
    }

    public int f() {
        if (this.f7513d != null) {
            return this.f7513d.size();
        }
        w wVar = this.f7510a;
        if (wVar != null) {
            return wVar.size();
        }
        if (this.f7512c != null) {
            return this.f7512c.u();
        }
        return 0;
    }

    public h2 g(h2 h2Var) {
        d(h2Var);
        return this.f7512c;
    }

    public void h(s1 s1Var) {
        w wVar;
        if (s1Var.c()) {
            return;
        }
        if (c()) {
            k(s1Var);
            return;
        }
        if (this.f7511b == null) {
            this.f7511b = s1Var.f7511b;
        }
        w wVar2 = this.f7510a;
        if (wVar2 != null && (wVar = s1Var.f7510a) != null) {
            this.f7510a = wVar2.q(wVar);
            return;
        }
        if (this.f7512c == null && s1Var.f7512c != null) {
            m(j(s1Var.f7512c, this.f7510a, this.f7511b));
        } else if (this.f7512c == null || s1Var.f7512c != null) {
            m(this.f7512c.n().H(s1Var.f7512c).build());
        } else {
            m(j(this.f7512c, s1Var.f7510a, s1Var.f7511b));
        }
    }

    public int hashCode() {
        return 1;
    }

    public void i(z zVar, s0 s0Var) throws IOException {
        if (c()) {
            l(zVar.x(), s0Var);
            return;
        }
        if (this.f7511b == null) {
            this.f7511b = s0Var;
        }
        w wVar = this.f7510a;
        if (wVar != null) {
            l(wVar.q(zVar.x()), this.f7511b);
        } else {
            try {
                m(this.f7512c.n().T0(zVar, s0Var).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void k(s1 s1Var) {
        this.f7510a = s1Var.f7510a;
        this.f7512c = s1Var.f7512c;
        this.f7513d = s1Var.f7513d;
        s0 s0Var = s1Var.f7511b;
        if (s0Var != null) {
            this.f7511b = s0Var;
        }
    }

    public void l(w wVar, s0 s0Var) {
        a(s0Var, wVar);
        this.f7510a = wVar;
        this.f7511b = s0Var;
        this.f7512c = null;
        this.f7513d = null;
    }

    public h2 m(h2 h2Var) {
        h2 h2Var2 = this.f7512c;
        this.f7510a = null;
        this.f7513d = null;
        this.f7512c = h2Var;
        return h2Var2;
    }

    public w n() {
        if (this.f7513d != null) {
            return this.f7513d;
        }
        w wVar = this.f7510a;
        if (wVar != null) {
            return wVar;
        }
        synchronized (this) {
            if (this.f7513d != null) {
                return this.f7513d;
            }
            if (this.f7512c == null) {
                this.f7513d = w.f7553s;
            } else {
                this.f7513d = this.f7512c.j0();
            }
            return this.f7513d;
        }
    }

    void o(s4 s4Var, int i5) throws IOException {
        if (this.f7513d != null) {
            s4Var.z(i5, this.f7513d);
            return;
        }
        w wVar = this.f7510a;
        if (wVar != null) {
            s4Var.z(i5, wVar);
        } else if (this.f7512c != null) {
            s4Var.q(i5, this.f7512c);
        } else {
            s4Var.z(i5, w.f7553s);
        }
    }

    public s1() {
    }
}
