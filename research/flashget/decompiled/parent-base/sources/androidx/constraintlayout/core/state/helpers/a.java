package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;
import java.util.Iterator;

/* compiled from: AlignHorizontallyReference.java */
/* loaded from: classes.dex */
public class a extends androidx.constraintlayout.core.state.c {

    /* renamed from: n0, reason: collision with root package name */
    private float f22697n0;

    public a(androidx.constraintlayout.core.state.h hVar) {
        super(hVar, h.e.ALIGN_VERTICALLY);
        this.f22697n0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
        Iterator<Object> it = this.f22682l0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a e4 = this.f22680j0.e(it.next());
            e4.u();
            Object obj = this.O;
            if (obj != null) {
                e4.A0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    e4.z0(obj2);
                } else {
                    e4.A0(androidx.constraintlayout.core.state.h.f22690j);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                e4.A(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    e4.z(obj4);
                } else {
                    e4.z(androidx.constraintlayout.core.state.h.f22690j);
                }
            }
            float f4 = this.f22697n0;
            if (f4 != 0.5f) {
                e4.X(f4);
            }
        }
    }
}
