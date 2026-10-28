package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.ThreadMode;

/* compiled from: SubscriberMethodInfo.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    final String f32191a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f32192b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f32193c;

    /* renamed from: d, reason: collision with root package name */
    final int f32194d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f32195e;

    public e(String str, Class<?> cls, ThreadMode threadMode, int i5, boolean z5) {
        this.f32191a = str;
        this.f32192b = threadMode;
        this.f32193c = cls;
        this.f32194d = i5;
        this.f32195e = z5;
    }

    public e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}
