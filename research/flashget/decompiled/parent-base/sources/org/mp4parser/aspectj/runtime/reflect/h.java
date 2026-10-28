package org.mp4parser.aspectj.runtime.reflect;

import lg.c0;
import org.mp4parser.aspectj.lang.c;

/* compiled from: JoinPointImpl.java */
/* loaded from: classes9.dex */
class h implements org.mp4parser.aspectj.lang.d {

    /* renamed from: n, reason: collision with root package name */
    Object f87752n;

    /* renamed from: o, reason: collision with root package name */
    Object f87753o;

    /* renamed from: p, reason: collision with root package name */
    Object[] f87754p;

    /* renamed from: q, reason: collision with root package name */
    c.b f87755q;

    /* renamed from: r, reason: collision with root package name */
    private org.mp4parser.aspectj.runtime.internal.a f87756r;

    /* compiled from: JoinPointImpl.java */
    static class a extends b implements c.a {
        public a(int i4, String str, org.mp4parser.aspectj.lang.e eVar, c0 c0Var) {
            super(i4, str, eVar, c0Var);
        }
    }

    /* compiled from: JoinPointImpl.java */
    static class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        String f87757a;

        /* renamed from: b, reason: collision with root package name */
        org.mp4parser.aspectj.lang.e f87758b;

        /* renamed from: c, reason: collision with root package name */
        c0 f87759c;

        /* renamed from: d, reason: collision with root package name */
        private int f87760d;

        public b(int i4, String str, org.mp4parser.aspectj.lang.e eVar, c0 c0Var) {
            this.f87757a = str;
            this.f87758b = eVar;
            this.f87759c = c0Var;
            this.f87760d = i4;
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public int a() {
            return this.f87760d;
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public String b() {
            return this.f87757a;
        }

        String c(n nVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nVar.d(b()));
            stringBuffer.append("(");
            stringBuffer.append(((l) h()).E(nVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public final String d() {
            return c(n.f87780j);
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public final String f() {
            return c(n.f87782l);
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public c0 g() {
            return this.f87759c;
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public org.mp4parser.aspectj.lang.e h() {
            return this.f87758b;
        }

        @Override // org.mp4parser.aspectj.lang.c.b
        public final String toString() {
            return c(n.f87781k);
        }
    }

    public h(c.b bVar, Object obj, Object obj2, Object[] objArr) {
        this.f87755q = bVar;
        this.f87752n = obj;
        this.f87753o = obj2;
        this.f87754p = objArr;
    }

    @Override // org.mp4parser.aspectj.lang.d
    public Object a() throws Throwable {
        org.mp4parser.aspectj.runtime.internal.a aVar = this.f87756r;
        if (aVar == null) {
            return null;
        }
        return aVar.f(aVar.c());
    }

    @Override // org.mp4parser.aspectj.lang.c
    public String b() {
        return this.f87755q.b();
    }

    @Override // org.mp4parser.aspectj.lang.c
    public c.b c() {
        return this.f87755q;
    }

    @Override // org.mp4parser.aspectj.lang.c
    public final String d() {
        return this.f87755q.d();
    }

    @Override // org.mp4parser.aspectj.lang.c
    public Object e() {
        return this.f87753o;
    }

    @Override // org.mp4parser.aspectj.lang.c
    public final String f() {
        return this.f87755q.f();
    }

    @Override // org.mp4parser.aspectj.lang.c
    public c0 g() {
        return this.f87755q.g();
    }

    @Override // org.mp4parser.aspectj.lang.c
    public org.mp4parser.aspectj.lang.e h() {
        return this.f87755q.h();
    }

    @Override // org.mp4parser.aspectj.lang.d
    public Object i(Object[] objArr) throws Throwable {
        org.mp4parser.aspectj.runtime.internal.a aVar = this.f87756r;
        if (aVar == null) {
            return null;
        }
        int a5 = aVar.a();
        int i4 = 1;
        boolean z4 = (65536 & a5) != 0;
        int i5 = (a5 & 4096) != 0 ? 1 : 0;
        int i6 = (a5 & 256) != 0 ? 1 : 0;
        boolean z5 = (a5 & 16) != 0;
        boolean z6 = (a5 & 1) != 0;
        Object[] c5 = this.f87756r.c();
        int i7 = ((!z5 || z4) ? 0 : 1) + i5;
        if (i5 == 0 || i6 == 0) {
            i4 = 0;
        } else {
            c5[0] = objArr[0];
        }
        if (z5 && z6) {
            if (z4) {
                i4 = i6 + 1;
                c5[0] = objArr[i6];
            } else {
                i4 = i5 + 1;
                c5[i5] = objArr[i5];
            }
        }
        for (int i10 = i4; i10 < objArr.length; i10++) {
            c5[(i10 - i4) + i7] = objArr[i10];
        }
        return this.f87756r.f(c5);
    }

    @Override // org.mp4parser.aspectj.lang.c
    public Object j() {
        return this.f87752n;
    }

    @Override // org.mp4parser.aspectj.lang.c
    public Object[] k() {
        if (this.f87754p == null) {
            this.f87754p = new Object[0];
        }
        Object[] objArr = this.f87754p;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.mp4parser.aspectj.lang.d
    public void l(org.mp4parser.aspectj.runtime.internal.a aVar) {
        this.f87756r = aVar;
    }

    @Override // org.mp4parser.aspectj.lang.c
    public final String toString() {
        return this.f87755q.toString();
    }
}
