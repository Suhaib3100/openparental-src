package android.view;

import android.view.C0536c;
import android.view.t;
import androidx.annotation.o0;

/* loaded from: classes3.dex */
final class SavedStateHandleController implements w {

    /* renamed from: o, reason: collision with root package name */
    private final String f8466o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8467p = false;

    /* renamed from: q, reason: collision with root package name */
    private final s0 f8468q;

    SavedStateHandleController(String str, s0 s0Var) {
        this.f8466o = str;
        this.f8468q = s0Var;
    }

    void g(C0536c c0536c, t tVar) {
        if (this.f8467p) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f8467p = true;
        tVar.a(this);
        c0536c.j(this.f8466o, this.f8468q.getSavedStateProvider());
    }

    @Override // android.view.w
    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
        if (bVar == t.b.ON_DESTROY) {
            this.f8467p = false;
            a0Var.getLifecycle().c(this);
        }
    }

    s0 i() {
        return this.f8468q;
    }

    boolean j() {
        return this.f8467p;
    }
}
