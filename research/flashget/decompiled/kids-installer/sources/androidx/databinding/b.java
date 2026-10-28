package androidx.databinding;

import androidx.databinding.u;

/* compiled from: BaseObservableField.java */
/* loaded from: classes3.dex */
abstract class b extends androidx.databinding.a {

    /* compiled from: BaseObservableField.java */
    class a extends u.a {
        a() {
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i5) {
            b.this.c();
        }
    }

    public b() {
    }

    public b(u... uVarArr) {
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (u uVar : uVarArr) {
            uVar.a(aVar);
        }
    }
}
