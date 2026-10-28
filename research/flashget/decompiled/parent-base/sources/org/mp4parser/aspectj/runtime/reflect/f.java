package org.mp4parser.aspectj.runtime.reflect;

import java.lang.reflect.Field;

/* compiled from: FieldSignatureImpl.java */
/* loaded from: classes9.dex */
public class f extends j implements lg.n {

    /* renamed from: m, reason: collision with root package name */
    Class f87749m;

    /* renamed from: n, reason: collision with root package name */
    private Field f87750n;

    f(int i4, String str, Class cls, Class cls2) {
        super(i4, str, cls);
        this.f87749m = cls2;
    }

    @Override // lg.n
    public Class i() {
        if (this.f87749m == null) {
            this.f87749m = v(3);
        }
        return this.f87749m;
    }

    @Override // lg.n
    public Field k() {
        if (this.f87750n == null) {
            try {
                this.f87750n = a().getDeclaredField(getName());
            } catch (Exception unused) {
            }
        }
        return this.f87750n;
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.l
    protected String r(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        if (nVar.f87784b) {
            stringBuffer.append(nVar.g(i()));
        }
        if (nVar.f87784b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), n()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    f(String str) {
        super(str);
    }
}
