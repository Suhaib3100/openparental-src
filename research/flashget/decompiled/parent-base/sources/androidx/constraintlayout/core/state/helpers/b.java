package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;
import java.util.Iterator;

/* compiled from: AlignVerticallyReference.java */
/* loaded from: classes.dex */
public class b extends androidx.constraintlayout.core.state.c {

    /* renamed from: n0, reason: collision with root package name */
    private float f22698n0;

    public b(androidx.constraintlayout.core.state.h hVar) {
        super(hVar, h.e.ALIGN_VERTICALLY);
        this.f22698n0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
        Iterator<Object> it = this.f22682l0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a e4 = this.f22680j0.e(it.next());
            e4.v();
            Object obj = this.S;
            if (obj != null) {
                e4.D0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    e4.C0(obj2);
                } else {
                    e4.D0(androidx.constraintlayout.core.state.h.f22690j);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                e4.p(obj3);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    e4.o(obj4);
                } else {
                    e4.o(androidx.constraintlayout.core.state.h.f22690j);
                }
            }
            float f4 = this.f22698n0;
            if (f4 != 0.5f) {
                e4.I0(f4);
            }
        }
    }
}
