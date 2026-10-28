package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;
import java.util.Iterator;

/* compiled from: VerticalChainReference.java */
/* loaded from: classes.dex */
public class h extends d {

    /* compiled from: VerticalChainReference.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22713a;

        static {
            int[] iArr = new int[h.b.values().length];
            f22713a = iArr;
            try {
                iArr[h.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22713a[h.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22713a[h.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(androidx.constraintlayout.core.state.h hVar) {
        super(hVar, h.e.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
        Iterator<Object> it = this.f22682l0.iterator();
        while (it.hasNext()) {
            this.f22680j0.e(it.next()).v();
        }
        Iterator<Object> it2 = this.f22682l0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.a e4 = this.f22680j0.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    e4.D0(obj).b0(this.f22652o).d0(this.f22658u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        e4.C0(obj2).b0(this.f22652o).d0(this.f22658u);
                    } else {
                        e4.D0(androidx.constraintlayout.core.state.h.f22690j);
                    }
                }
                aVar2 = e4;
            }
            if (aVar != null) {
                aVar.p(e4.getKey());
                e4.C0(aVar.getKey());
            }
            aVar = e4;
        }
        if (aVar != null) {
            Object obj3 = this.U;
            if (obj3 != null) {
                aVar.p(obj3).b0(this.f22653p).d0(this.f22659v);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    aVar.o(obj4).b0(this.f22653p).d0(this.f22659v);
                } else {
                    aVar.o(androidx.constraintlayout.core.state.h.f22690j);
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f4 = this.f22703n0;
        if (f4 != 0.5f) {
            aVar2.I0(f4);
        }
        int i4 = a.f22713a[this.f22704o0.ordinal()];
        if (i4 == 1) {
            aVar2.u0(0);
        } else if (i4 == 2) {
            aVar2.u0(1);
        } else {
            if (i4 != 3) {
                return;
            }
            aVar2.u0(2);
        }
    }
}
