package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;
import androidx.constraintlayout.core.widgets.j;

/* compiled from: BarrierReference.java */
/* loaded from: classes.dex */
public class c extends androidx.constraintlayout.core.state.c {

    /* renamed from: n0, reason: collision with root package name */
    private h.d f22699n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f22700o0;

    /* renamed from: p0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f22701p0;

    /* compiled from: BarrierReference.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22702a;

        static {
            int[] iArr = new int[h.d.values().length];
            f22702a = iArr;
            try {
                iArr[h.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22702a[h.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22702a[h.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22702a[h.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22702a[h.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22702a[h.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(androidx.constraintlayout.core.state.h hVar) {
        super(hVar, h.e.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.c
    public j M0() {
        if (this.f22701p0 == null) {
            this.f22701p0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f22701p0;
    }

    public void P0(h.d dVar) {
        this.f22699n0 = dVar;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.e
    public void apply() {
        M0();
        int i4 = a.f22702a[this.f22699n0.ordinal()];
        int i5 = 3;
        if (i4 == 3 || i4 == 4) {
            i5 = 1;
        } else if (i4 == 5) {
            i5 = 2;
        } else if (i4 != 6) {
            i5 = 0;
        }
        this.f22701p0.u2(i5);
        this.f22701p0.v2(this.f22700o0);
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a b0(int i4) {
        this.f22700o0 = i4;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a c0(Object obj) {
        b0(this.f22680j0.f(obj));
        return this;
    }
}
