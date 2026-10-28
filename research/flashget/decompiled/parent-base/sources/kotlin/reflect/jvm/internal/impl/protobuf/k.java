package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private d f77732a;

    /* renamed from: b, reason: collision with root package name */
    private f f77733b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f77734c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile o f77735d;

    protected void a(o oVar) {
        if (this.f77735d != null) {
            return;
        }
        synchronized (this) {
            if (this.f77735d != null) {
                return;
            }
            try {
                if (this.f77732a != null) {
                    this.f77735d = oVar.B().b(this.f77732a, this.f77733b);
                } else {
                    this.f77735d = oVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f77734c ? this.f77735d.t() : this.f77732a.size();
    }

    public o c(o oVar) {
        a(oVar);
        return this.f77735d;
    }

    public o d(o oVar) {
        o oVar2 = this.f77735d;
        this.f77735d = oVar;
        this.f77732a = null;
        this.f77734c = true;
        return oVar2;
    }
}
