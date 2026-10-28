package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.n;

/* compiled from: AbstractSubscriberInfo.java */
/* loaded from: classes6.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Class f32187a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<? extends c> f32188b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32189c;

    protected a(Class cls, Class<? extends c> cls2, boolean z5) {
        this.f32187a = cls;
        this.f32188b = cls2;
        this.f32189c = z5;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public c b() {
        Class<? extends c> cls = this.f32188b;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // org.greenrobot.eventbus.meta.c
    public boolean c() {
        return this.f32189c;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public Class d() {
        return this.f32187a;
    }

    protected n e(String str, Class<?> cls) {
        return g(str, cls, ThreadMode.POSTING, 0, false);
    }

    protected n f(String str, Class<?> cls, ThreadMode threadMode) {
        return g(str, cls, threadMode, 0, false);
    }

    protected n g(String str, Class<?> cls, ThreadMode threadMode, int i5, boolean z5) {
        try {
            return new n(this.f32187a.getDeclaredMethod(str, cls), cls, threadMode, i5, z5);
        } catch (NoSuchMethodException e6) {
            throw new EventBusException("Could not find subscriber method in " + this.f32187a + ". Maybe a missing ProGuard rule?", e6);
        }
    }
}
