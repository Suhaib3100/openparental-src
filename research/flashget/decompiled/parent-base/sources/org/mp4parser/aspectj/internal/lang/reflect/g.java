package org.mp4parser.aspectj.internal.lang.reflect;

import lg.a0;

/* compiled from: DeclareSoftImpl.java */
/* loaded from: classes9.dex */
public class g implements lg.m {

    /* renamed from: a, reason: collision with root package name */
    private lg.d<?> f87643a;

    /* renamed from: b, reason: collision with root package name */
    private a0 f87644b;

    /* renamed from: c, reason: collision with root package name */
    private lg.d<?> f87645c;

    /* renamed from: d, reason: collision with root package name */
    private String f87646d;

    public g(lg.d<?> dVar, String str, String str2) {
        this.f87643a = dVar;
        this.f87644b = new n(str);
        try {
            this.f87645c = lg.e.a(Class.forName(str2, false, dVar.h0().getClassLoader()));
        } catch (ClassNotFoundException unused) {
            this.f87646d = str2;
        }
    }

    @Override // lg.m
    public lg.d a() {
        return this.f87643a;
    }

    @Override // lg.m
    public lg.d b() throws ClassNotFoundException {
        if (this.f87646d == null) {
            return this.f87645c;
        }
        throw new ClassNotFoundException(this.f87646d);
    }

    @Override // lg.m
    public a0 d() {
        return this.f87644b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("declare soft : ");
        String str = this.f87646d;
        if (str != null) {
            stringBuffer.append(this.f87645c.getName());
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append(" : ");
        stringBuffer.append(d().a());
        return stringBuffer.toString();
    }
}
