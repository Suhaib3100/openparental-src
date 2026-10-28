package androidx.databinding;

import androidx.annotation.o0;
import androidx.databinding.u;

/* compiled from: BaseObservable.java */
/* loaded from: classes3.dex */
public class a implements u {

    /* renamed from: o, reason: collision with root package name */
    private transient c0 f6032o;

    @Override // androidx.databinding.u
    public void a(@o0 u.a aVar) {
        synchronized (this) {
            if (this.f6032o == null) {
                this.f6032o = new c0();
            }
        }
        this.f6032o.a(aVar);
    }

    @Override // androidx.databinding.u
    public void b(@o0 u.a aVar) {
        synchronized (this) {
            c0 c0Var = this.f6032o;
            if (c0Var == null) {
                return;
            }
            c0Var.o(aVar);
        }
    }

    public void c() {
        synchronized (this) {
            c0 c0Var = this.f6032o;
            if (c0Var == null) {
                return;
            }
            c0Var.j(this, 0, null);
        }
    }

    public void d(int i5) {
        synchronized (this) {
            c0 c0Var = this.f6032o;
            if (c0Var == null) {
                return;
            }
            c0Var.j(this, i5, null);
        }
    }
}
