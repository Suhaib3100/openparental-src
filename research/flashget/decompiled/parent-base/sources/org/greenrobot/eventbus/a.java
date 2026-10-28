package org.greenrobot.eventbus;

/* compiled from: AsyncPoster.java */
/* loaded from: classes6.dex */
class a implements Runnable, k {

    /* renamed from: b, reason: collision with root package name */
    private final j f86794b = new j();

    /* renamed from: c, reason: collision with root package name */
    private final c f86795c;

    a(c cVar) {
        this.f86795c = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void a(p pVar, Object obj) {
        this.f86794b.a(i.a(pVar, obj));
        this.f86795c.g().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b5 = this.f86794b.b();
        if (b5 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f86795c.l(b5);
    }
}
