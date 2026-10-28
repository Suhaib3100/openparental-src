package org.greenrobot.eventbus;

/* compiled from: AsyncPoster.java */
/* loaded from: classes6.dex */
class a implements Runnable, k {

    /* renamed from: o, reason: collision with root package name */
    private final j f32121o = new j();

    /* renamed from: p, reason: collision with root package name */
    private final c f32122p;

    a(c cVar) {
        this.f32122p = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        this.f32121o.a(i.a(pVar, obj));
        this.f32122p.g().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b6 = this.f32121o.b();
        if (b6 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f32122p.l(b6);
    }
}
