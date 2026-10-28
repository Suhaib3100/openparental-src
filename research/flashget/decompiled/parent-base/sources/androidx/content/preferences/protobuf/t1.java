package androidx.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes3.dex */
public class t1 {

    /* renamed from: e, reason: collision with root package name */
    private static final s0 f28951e = s0.d();

    /* renamed from: a, reason: collision with root package name */
    private w f28952a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f28953b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile i2 f28954c;

    /* renamed from: d, reason: collision with root package name */
    private volatile w f28955d;

    public t1(s0 s0Var, w wVar) {
        a(s0Var, wVar);
        this.f28953b = s0Var;
        this.f28952a = wVar;
    }

    private static void a(s0 s0Var, w wVar) {
        if (s0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (wVar == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static t1 e(i2 i2Var) {
        t1 t1Var = new t1();
        t1Var.m(i2Var);
        return t1Var;
    }

    private static i2 j(i2 i2Var, w wVar, s0 s0Var) {
        try {
            return i2Var.q().H1(wVar, s0Var).a();
        } catch (InvalidProtocolBufferException unused) {
            return i2Var;
        }
    }

    public void b() {
        this.f28952a = null;
        this.f28954c = null;
        this.f28955d = null;
    }

    public boolean c() {
        w wVar;
        w wVar2 = this.f28955d;
        w wVar3 = w.f28998f;
        return wVar2 == wVar3 || (this.f28954c == null && ((wVar = this.f28952a) == null || wVar == wVar3));
    }

    protected void d(i2 i2Var) {
        if (this.f28954c != null) {
            return;
        }
        synchronized (this) {
            if (this.f28954c != null) {
                return;
            }
            try {
                if (this.f28952a != null) {
                    this.f28954c = i2Var.B().l(this.f28952a, this.f28953b);
                    this.f28955d = this.f28952a;
                } else {
                    this.f28954c = i2Var;
                    this.f28955d = w.f28998f;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f28954c = i2Var;
                this.f28955d = w.f28998f;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        i2 i2Var = this.f28954c;
        i2 i2Var2 = t1Var.f28954c;
        return (i2Var == null && i2Var2 == null) ? n().equals(t1Var.n()) : (i2Var == null || i2Var2 == null) ? i2Var != null ? i2Var.equals(t1Var.g(i2Var.z())) : g(i2Var2.z()).equals(i2Var2) : i2Var.equals(i2Var2);
    }

    public int f() {
        if (this.f28955d != null) {
            return this.f28955d.size();
        }
        w wVar = this.f28952a;
        if (wVar != null) {
            return wVar.size();
        }
        if (this.f28954c != null) {
            return this.f28954c.t();
        }
        return 0;
    }

    public i2 g(i2 i2Var) {
        d(i2Var);
        return this.f28954c;
    }

    public void h(t1 t1Var) {
        w wVar;
        if (t1Var.c()) {
            return;
        }
        if (c()) {
            k(t1Var);
            return;
        }
        if (this.f28953b == null) {
            this.f28953b = t1Var.f28953b;
        }
        w wVar2 = this.f28952a;
        if (wVar2 != null && (wVar = t1Var.f28952a) != null) {
            this.f28952a = wVar2.m(wVar);
            return;
        }
        if (this.f28954c == null && t1Var.f28954c != null) {
            m(j(t1Var.f28954c, this.f28952a, this.f28953b));
        } else if (this.f28954c == null || t1Var.f28954c != null) {
            m(this.f28954c.q().Q(t1Var.f28954c).a());
        } else {
            m(j(this.f28954c, t1Var.f28952a, t1Var.f28953b));
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
        if (this.f28953b == null) {
            this.f28953b = s0Var;
        }
        w wVar = this.f28952a;
        if (wVar != null) {
            l(wVar.m(zVar.x()), this.f28953b);
        } else {
            try {
                m(this.f28954c.q().n1(zVar, s0Var).a());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void k(t1 t1Var) {
        this.f28952a = t1Var.f28952a;
        this.f28954c = t1Var.f28954c;
        this.f28955d = t1Var.f28955d;
        s0 s0Var = t1Var.f28953b;
        if (s0Var != null) {
            this.f28953b = s0Var;
        }
    }

    public void l(w wVar, s0 s0Var) {
        a(s0Var, wVar);
        this.f28952a = wVar;
        this.f28953b = s0Var;
        this.f28954c = null;
        this.f28955d = null;
    }

    public i2 m(i2 i2Var) {
        i2 i2Var2 = this.f28954c;
        this.f28952a = null;
        this.f28955d = null;
        this.f28954c = i2Var;
        return i2Var2;
    }

    public w n() {
        if (this.f28955d != null) {
            return this.f28955d;
        }
        w wVar = this.f28952a;
        if (wVar != null) {
            return wVar;
        }
        synchronized (this) {
            try {
                if (this.f28955d != null) {
                    return this.f28955d;
                }
                if (this.f28954c == null) {
                    this.f28955d = w.f28998f;
                } else {
                    this.f28955d = this.f28954c.R();
                }
                return this.f28955d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o(v4 v4Var, int i4) throws IOException {
        if (this.f28955d != null) {
            v4Var.k(i4, this.f28955d);
            return;
        }
        w wVar = this.f28952a;
        if (wVar != null) {
            v4Var.k(i4, wVar);
        } else if (this.f28954c != null) {
            v4Var.C(i4, this.f28954c);
        } else {
            v4Var.k(i4, w.f28998f);
        }
    }

    public t1() {
    }
}
