package org.mp4parser.aspectj.runtime.reflect;

import lg.f0;

/* compiled from: UnlockSignatureImpl.java */
/* loaded from: classes9.dex */
class o extends l implements f0 {

    /* renamed from: m, reason: collision with root package name */
    private Class f87792m;

    o(Class cls) {
        super(8, "unlock", cls);
        this.f87792m = cls;
    }

    public Class l() {
        if (this.f87792m == null) {
            this.f87792m = v(3);
        }
        return this.f87792m;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        if (this.f87792m == null) {
            this.f87792m = v(3);
        }
        StringBuffer stringBuffer = new StringBuffer("unlock(");
        stringBuffer.append(nVar.g(this.f87792m));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    o(String str) {
        super(str);
    }
}
