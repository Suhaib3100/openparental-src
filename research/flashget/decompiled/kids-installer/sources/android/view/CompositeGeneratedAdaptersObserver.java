package android.view;

import android.view.t;
import androidx.annotation.o0;

/* loaded from: classes3.dex */
class CompositeGeneratedAdaptersObserver implements w {

    /* renamed from: o, reason: collision with root package name */
    private final q[] f8391o;

    CompositeGeneratedAdaptersObserver(q[] qVarArr) {
        this.f8391o = qVarArr;
    }

    @Override // android.view.w
    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
        i0 i0Var = new i0();
        for (q qVar : this.f8391o) {
            qVar.a(a0Var, bVar, false, i0Var);
        }
        for (q qVar2 : this.f8391o) {
            qVar2.a(a0Var, bVar, true, i0Var);
        }
    }
}
