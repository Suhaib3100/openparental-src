package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;

/* compiled from: AdviceSignatureImpl.java */
/* loaded from: classes9.dex */
class a extends c implements lg.c {

    /* renamed from: p, reason: collision with root package name */
    Class f87734p;

    /* renamed from: q, reason: collision with root package name */
    private Method f87735q;

    a(String str) {
        super(str);
        this.f87735q = null;
    }

    private String F(String str) {
        if (str.indexOf(36) == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "$");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.startsWith("before") || nextToken.startsWith("after") || nextToken.startsWith("around")) {
                return nextToken;
            }
        }
        return str;
    }

    @Override // lg.c
    public Class getReturnType() {
        if (this.f87734p == null) {
            this.f87734p = v(6);
        }
        return this.f87734p;
    }

    @Override // lg.c
    public Method j() {
        if (this.f87735q == null) {
            try {
                this.f87735q = a().getDeclaredMethod(getName(), c());
            } catch (Exception unused) {
            }
        }
        return this.f87735q;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (nVar.f87784b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f87784b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(".");
        stringBuffer.append(F(getName()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }

    a(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i4, str, cls, clsArr, strArr, clsArr2);
        this.f87735q = null;
        this.f87734p = cls2;
    }
}
