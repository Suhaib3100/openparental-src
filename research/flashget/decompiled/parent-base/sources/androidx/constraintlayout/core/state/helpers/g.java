package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;
import java.util.Iterator;

/* compiled from: HorizontalChainReference.java */
/* loaded from: classes.dex */
public class g extends d {

    /* compiled from: HorizontalChainReference.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22712a;

        static {
            int[] iArr = new int[h.b.values().length];
            f22712a = iArr;
            try {
                iArr[h.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22712a[h.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22712a[h.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(androidx.constraintlayout.core.state.h hVar) {
        super(hVar, h.e.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
        Iterator<Object> it = this.f22682l0.iterator();
        while (it.hasNext()) {
            this.f22680j0.e(it.next()).u();
        }
        Iterator<Object> it2 = this.f22682l0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.a e4 = this.f22680j0.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    e4.A0(obj).b0(this.f22650m).d0(this.f22656s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        e4.z0(obj2).b0(this.f22650m).d0(this.f22656s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            e4.A0(obj3).b0(this.f22648k).d0(this.f22654q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                e4.z0(obj4).b0(this.f22648k).d0(this.f22654q);
                            } else {
                                e4.A0(androidx.constraintlayout.core.state.h.f22690j);
                            }
                        }
                    }
                }
                aVar2 = e4;
            }
            if (aVar != null) {
                aVar.A(e4.getKey());
                e4.z0(aVar.getKey());
            }
            aVar = e4;
        }
        if (aVar != null) {
            Object obj5 = this.Q;
            if (obj5 != null) {
                aVar.A(obj5).b0(this.f22651n).d0(this.f22657t);
            } else {
                Object obj6 = this.R;
                if (obj6 != null) {
                    aVar.z(obj6).b0(this.f22651n).d0(this.f22657t);
                } else {
                    Object obj7 = this.M;
                    if (obj7 != null) {
                        aVar.A(obj7).b0(this.f22649l).d0(this.f22655r);
                    } else {
                        Object obj8 = this.N;
                        if (obj8 != null) {
                            aVar.z(obj8).b0(this.f22649l).d0(this.f22655r);
                        } else {
                            aVar.z(androidx.constraintlayout.core.state.h.f22690j);
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f4 = this.f22703n0;
        if (f4 != 0.5f) {
            aVar2.X(f4);
        }
        int i4 = a.f22712a[this.f22704o0.ordinal()];
        if (i4 == 1) {
            aVar2.r0(0);
        } else if (i4 == 2) {
            aVar2.r0(1);
        } else {
            if (i4 != 3) {
                return;
            }
            aVar2.r0(2);
        }
    }
}
