package org.mp4parser.aspectj.runtime.reflect;

import lg.t;

/* compiled from: LockSignatureImpl.java */
/* loaded from: classes9.dex */
class i extends l implements t {

    /* renamed from: m, reason: collision with root package name */
    private Class f87761m;

    i(Class cls) {
        super(8, "lock", cls);
        this.f87761m = cls;
    }

    public Class l() {
        if (this.f87761m == null) {
            this.f87761m = v(3);
        }
        return this.f87761m;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        if (this.f87761m == null) {
            this.f87761m = v(3);
        }
        StringBuffer stringBuffer = new StringBuffer("lock(");
        stringBuffer.append(nVar.g(this.f87761m));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    i(String str) {
        super(str);
    }
}
