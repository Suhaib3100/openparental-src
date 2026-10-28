package org.greenrobot.eventbus.util;

/* compiled from: ThrowableFailureEvent.java */
/* loaded from: classes6.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    protected final Throwable f86905a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f86906b;

    /* renamed from: c, reason: collision with root package name */
    private Object f86907c;

    public e(Throwable th) {
        this.f86905a = th;
        this.f86906b = false;
    }

    @Override // org.greenrobot.eventbus.util.d
    public Object a() {
        return this.f86907c;
    }

    @Override // org.greenrobot.eventbus.util.d
    public void b(Object obj) {
        this.f86907c = obj;
    }

    public Throwable c() {
        return this.f86905a;
    }

    public boolean d() {
        return this.f86906b;
    }

    public e(Throwable th, boolean z4) {
        this.f86905a = th;
        this.f86906b = z4;
    }
}
