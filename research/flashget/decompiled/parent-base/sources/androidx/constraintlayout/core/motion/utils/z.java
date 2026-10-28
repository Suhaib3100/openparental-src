package androidx.constraintlayout.core.motion.utils;

/* compiled from: ViewState.java */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public float f22597a;

    /* renamed from: b, reason: collision with root package name */
    public int f22598b;

    /* renamed from: c, reason: collision with root package name */
    public int f22599c;

    /* renamed from: d, reason: collision with root package name */
    public int f22600d;

    /* renamed from: e, reason: collision with root package name */
    public int f22601e;

    public void a(androidx.constraintlayout.core.motion.f fVar) {
        this.f22598b = fVar.l();
        this.f22599c = fVar.w();
        this.f22600d = fVar.q();
        this.f22601e = fVar.h();
        this.f22597a = (int) fVar.t();
    }

    public int b() {
        return this.f22601e - this.f22599c;
    }

    public int c() {
        return this.f22600d - this.f22598b;
    }
}
