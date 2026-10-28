package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.n;

/* compiled from: AbstractSubscriberInfo.java */
/* loaded from: classes6.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Class f86860a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<? extends c> f86861b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86862c;

    protected a(Class cls, Class<? extends c> cls2, boolean z4) {
        this.f86860a = cls;
        this.f86861b = cls2;
        this.f86862c = z4;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public Class b() {
        return this.f86860a;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public c c() {
        Class<? extends c> cls = this.f86861b;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // org.greenrobot.eventbus.meta.c
    public boolean d() {
        return this.f86862c;
    }

    protected n e(String str, Class<?> cls) {
        return g(str, cls, ThreadMode.POSTING, 0, false);
    }

    protected n f(String str, Class<?> cls, ThreadMode threadMode) {
        return g(str, cls, threadMode, 0, false);
    }

    protected n g(String str, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        try {
            return new n(this.f86860a.getDeclaredMethod(str, cls), cls, threadMode, i4, z4);
        } catch (NoSuchMethodException e4) {
            throw new EventBusException("Could not find subscriber method in " + this.f86860a + ". Maybe a missing ProGuard rule?", e4);
        }
    }
}
