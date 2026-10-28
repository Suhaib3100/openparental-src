package org.mp4parser.aspectj.internal.lang.reflect;

/* compiled from: InterTypeDeclarationImpl.java */
/* loaded from: classes9.dex */
public class i implements lg.q {

    /* renamed from: a, reason: collision with root package name */
    private lg.d<?> f87648a;

    /* renamed from: b, reason: collision with root package name */
    protected String f87649b;

    /* renamed from: c, reason: collision with root package name */
    private lg.d<?> f87650c;

    /* renamed from: d, reason: collision with root package name */
    private int f87651d;

    public i(lg.d<?> dVar, String str, int i4) {
        this.f87648a = dVar;
        this.f87649b = str;
        this.f87651d = i4;
        try {
            this.f87650c = (lg.d) q.c(str, dVar.h0());
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // lg.q
    public lg.d<?> a() {
        return this.f87648a;
    }

    @Override // lg.q
    public lg.d<?> g() throws ClassNotFoundException {
        lg.d<?> dVar = this.f87650c;
        if (dVar != null) {
            return dVar;
        }
        throw new ClassNotFoundException(this.f87649b);
    }

    @Override // lg.q
    public int getModifiers() {
        return this.f87651d;
    }

    public i(lg.d<?> dVar, lg.d<?> dVar2, int i4) {
        this.f87648a = dVar;
        this.f87650c = dVar2;
        this.f87649b = dVar2.getName();
        this.f87651d = i4;
    }
}
