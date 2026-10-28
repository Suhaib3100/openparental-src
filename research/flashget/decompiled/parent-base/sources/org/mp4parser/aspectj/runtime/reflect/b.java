package org.mp4parser.aspectj.runtime.reflect;

/* compiled from: CatchClauseSignatureImpl.java */
/* loaded from: classes9.dex */
class b extends l implements lg.f {

    /* renamed from: m, reason: collision with root package name */
    Class f87736m;

    /* renamed from: n, reason: collision with root package name */
    String f87737n;

    b(Class cls, Class cls2, String str) {
        super(0, "catch", cls);
        this.f87736m = cls2;
        this.f87737n = str;
    }

    @Override // lg.f
    public String h() {
        if (this.f87737n == null) {
            this.f87737n = t(4);
        }
        return this.f87737n;
    }

    @Override // lg.f
    public Class l() {
        if (this.f87736m == null) {
            this.f87736m = v(3);
        }
        return this.f87736m;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer("catch(");
        stringBuffer.append(nVar.g(l()));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    b(String str) {
        super(str);
    }
}
