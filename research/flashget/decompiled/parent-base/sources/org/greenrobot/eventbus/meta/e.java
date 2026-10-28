package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.ThreadMode;

/* compiled from: SubscriberMethodInfo.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    final String f86864a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f86865b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f86866c;

    /* renamed from: d, reason: collision with root package name */
    final int f86867d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f86868e;

    public e(String str, Class<?> cls, ThreadMode threadMode, int i4, boolean z4) {
        this.f86864a = str;
        this.f86865b = threadMode;
        this.f86866c = cls;
        this.f86867d = i4;
        this.f86868e = z4;
    }

    public e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}
