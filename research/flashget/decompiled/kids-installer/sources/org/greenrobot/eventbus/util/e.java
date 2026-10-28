package org.greenrobot.eventbus.util;

/* compiled from: ThrowableFailureEvent.java */
/* loaded from: classes6.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    protected final Throwable f32232a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f32233b;

    /* renamed from: c, reason: collision with root package name */
    private Object f32234c;

    public e(Throwable th) {
        this.f32232a = th;
        this.f32233b = false;
    }

    @Override // org.greenrobot.eventbus.util.d
    public void a(Object obj) {
        this.f32234c = obj;
    }

    @Override // org.greenrobot.eventbus.util.d
    public Object b() {
        return this.f32234c;
    }

    public Throwable c() {
        return this.f32232a;
    }

    public boolean d() {
        return this.f32233b;
    }

    public e(Throwable th, boolean z5) {
        this.f32232a = th;
        this.f32233b = z5;
    }
}
