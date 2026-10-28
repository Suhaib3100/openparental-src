package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private d f25750a;

    /* renamed from: b, reason: collision with root package name */
    private f f25751b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f25752c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile o f25753d;

    protected void a(o oVar) {
        if (this.f25753d != null) {
            return;
        }
        synchronized (this) {
            if (this.f25753d != null) {
                return;
            }
            try {
                if (this.f25750a != null) {
                    this.f25753d = oVar.z().d(this.f25750a, this.f25751b);
                } else {
                    this.f25753d = oVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f25752c ? this.f25753d.u() : this.f25750a.size();
    }

    public o c(o oVar) {
        a(oVar);
        return this.f25753d;
    }

    public o d(o oVar) {
        o oVar2 = this.f25753d;
        this.f25753d = oVar;
        this.f25750a = null;
        this.f25752c = true;
        return oVar2;
    }
}
