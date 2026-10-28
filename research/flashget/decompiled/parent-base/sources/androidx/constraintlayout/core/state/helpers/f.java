package androidx.constraintlayout.core.state.helpers;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class f implements e, androidx.constraintlayout.core.state.e {

    /* renamed from: a, reason: collision with root package name */
    final androidx.constraintlayout.core.state.h f22705a;

    /* renamed from: b, reason: collision with root package name */
    private int f22706b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.h f22707c;

    /* renamed from: d, reason: collision with root package name */
    private int f22708d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f22709e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f22710f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f22711g;

    public f(androidx.constraintlayout.core.state.h hVar) {
        this.f22705a = hVar;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.e
    public androidx.constraintlayout.core.widgets.e a() {
        if (this.f22707c == null) {
            this.f22707c = new androidx.constraintlayout.core.widgets.h();
        }
        return this.f22707c;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.e
    public void apply() {
        this.f22707c.B2(this.f22706b);
        int i4 = this.f22708d;
        if (i4 != -1) {
            this.f22707c.w2(i4);
            return;
        }
        int i5 = this.f22709e;
        if (i5 != -1) {
            this.f22707c.x2(i5);
        } else {
            this.f22707c.y2(this.f22710f);
        }
    }

    @Override // androidx.constraintlayout.core.state.e
    public void b(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            this.f22707c = (androidx.constraintlayout.core.widgets.h) eVar;
        } else {
            this.f22707c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.e
    public void c(Object obj) {
        this.f22711g = obj;
    }

    @Override // androidx.constraintlayout.core.state.e
    public e d() {
        return null;
    }

    public f e(Object obj) {
        this.f22708d = -1;
        this.f22709e = this.f22705a.f(obj);
        this.f22710f = 0.0f;
        return this;
    }

    public int f() {
        return this.f22706b;
    }

    public f g(float f4) {
        this.f22708d = -1;
        this.f22709e = -1;
        this.f22710f = f4;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.e
    public Object getKey() {
        return this.f22711g;
    }

    public void h(int i4) {
        this.f22706b = i4;
    }

    public f i(Object obj) {
        this.f22708d = this.f22705a.f(obj);
        this.f22709e = -1;
        this.f22710f = 0.0f;
        return this;
    }
}
