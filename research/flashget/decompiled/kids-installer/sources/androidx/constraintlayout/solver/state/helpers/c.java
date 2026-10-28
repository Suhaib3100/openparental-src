package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.e;
import androidx.constraintlayout.solver.widgets.j;

/* compiled from: BarrierReference.java */
/* loaded from: classes2.dex */
public class c extends androidx.constraintlayout.solver.state.c {

    /* renamed from: e, reason: collision with root package name */
    private e.d f2330e;

    /* renamed from: f, reason: collision with root package name */
    private int f2331f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.constraintlayout.solver.widgets.a f2332g;

    /* compiled from: BarrierReference.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2333a;

        static {
            int[] iArr = new int[e.d.values().length];
            f2333a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2333a[e.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2333a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2333a[e.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2333a[e.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2333a[e.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(androidx.constraintlayout.solver.state.e eVar) {
        super(eVar, e.EnumC0020e.BARRIER);
    }

    @Override // androidx.constraintlayout.solver.state.c
    public void b() {
        c();
        int i5 = 0;
        switch (a.f2333a[this.f2330e.ordinal()]) {
            case 3:
            case 4:
                i5 = 1;
                break;
            case 5:
                i5 = 2;
                break;
            case 6:
                i5 = 3;
                break;
        }
        this.f2332g.X1(i5);
        this.f2332g.Y1(this.f2331f);
    }

    @Override // androidx.constraintlayout.solver.state.c
    public j c() {
        if (this.f2332g == null) {
            this.f2332g = new androidx.constraintlayout.solver.widgets.a();
        }
        return this.f2332g;
    }

    public void f(int i5) {
        this.f2331f = i5;
    }

    public void g(Object obj) {
        f(this.f2306a.f(obj));
    }

    public void h(e.d dVar) {
        this.f2330e = dVar;
    }
}
