package org.mp4parser.aspectj.runtime.reflect;

/* compiled from: CodeSignatureImpl.java */
/* loaded from: classes9.dex */
abstract class c extends j implements lg.g {

    /* renamed from: m, reason: collision with root package name */
    Class[] f87738m;

    /* renamed from: n, reason: collision with root package name */
    String[] f87739n;

    /* renamed from: o, reason: collision with root package name */
    Class[] f87740o;

    c(int i4, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i4, str, cls);
        this.f87738m = clsArr;
        this.f87739n = strArr;
        this.f87740o = clsArr2;
    }

    @Override // lg.g
    public String[] b() {
        if (this.f87739n == null) {
            this.f87739n = u(4);
        }
        return this.f87739n;
    }

    @Override // lg.g
    public Class[] c() {
        if (this.f87738m == null) {
            this.f87738m = w(3);
        }
        return this.f87738m;
    }

    @Override // lg.g
    public Class[] e() {
        if (this.f87740o == null) {
            this.f87740o = w(5);
        }
        return this.f87740o;
    }

    c(String str) {
        super(str);
    }
}
