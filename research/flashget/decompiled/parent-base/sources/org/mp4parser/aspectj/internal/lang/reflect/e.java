package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Type;
import lg.d0;

/* compiled from: DeclareParentsImpl.java */
/* loaded from: classes9.dex */
public class e implements lg.k {

    /* renamed from: a, reason: collision with root package name */
    private lg.d<?> f87633a;

    /* renamed from: b, reason: collision with root package name */
    private d0 f87634b;

    /* renamed from: c, reason: collision with root package name */
    private Type[] f87635c;

    /* renamed from: d, reason: collision with root package name */
    private String f87636d;

    /* renamed from: e, reason: collision with root package name */
    private String f87637e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87638f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87639g;

    public e(String str, String str2, boolean z4, lg.d<?> dVar) {
        this.f87639g = false;
        this.f87634b = new s(str);
        this.f87638f = z4;
        this.f87633a = dVar;
        this.f87636d = str2;
        try {
            this.f87635c = q.a(str2, dVar.h0());
        } catch (ClassNotFoundException e4) {
            this.f87639g = true;
            this.f87637e = e4.getMessage();
        }
    }

    @Override // lg.k
    public lg.d a() {
        return this.f87633a;
    }

    @Override // lg.k
    public boolean b() {
        return !this.f87638f;
    }

    @Override // lg.k
    public Type[] c() throws ClassNotFoundException {
        if (this.f87639g) {
            throw new ClassNotFoundException(this.f87637e);
        }
        return this.f87635c;
    }

    @Override // lg.k
    public d0 d() {
        return this.f87634b;
    }

    @Override // lg.k
    public boolean isExtends() {
        return this.f87638f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("declare parents : ");
        stringBuffer.append(d().a());
        stringBuffer.append(isExtends() ? " extends " : " implements ");
        stringBuffer.append(this.f87636d);
        return stringBuffer.toString();
    }
}
