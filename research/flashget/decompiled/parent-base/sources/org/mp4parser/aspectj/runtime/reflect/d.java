package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;

/* compiled from: ConstructorSignatureImpl.java */
/* loaded from: classes9.dex */
class d extends c implements lg.h {

    /* renamed from: p, reason: collision with root package name */
    private Constructor f87741p;

    d(String str) {
        super(str);
    }

    @Override // lg.h
    public Constructor g() {
        if (this.f87741p == null) {
            try {
                this.f87741p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f87741p;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l, org.mp4parser.aspectj.lang.e
    public String getName() {
        return "<init>";
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        stringBuffer.append(nVar.f(a(), n()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }

    d(int i4, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i4, "<init>", cls, clsArr, strArr, clsArr2);
    }
}
