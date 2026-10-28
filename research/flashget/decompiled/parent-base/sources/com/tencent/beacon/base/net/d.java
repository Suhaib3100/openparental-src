package com.tencent.beacon.base.net;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: NetFailure.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f71356a;

    /* renamed from: b, reason: collision with root package name */
    public String f71357b;

    /* renamed from: c, reason: collision with root package name */
    public int f71358c;

    /* renamed from: d, reason: collision with root package name */
    public String f71359d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f71360e;

    public d(String str, String str2, int i4, String str3) {
        this.f71356a = str;
        this.f71357b = str2;
        this.f71358c = i4;
        this.f71359d = str3;
    }

    public String toString() {
        return ProtectedSandApp.s("ㆎ\u0001") + this.f71356a + ProtectedSandApp.s("\u318f\u0001") + this.f71357b + ProtectedSandApp.s("㆐\u0001") + this.f71358c + ProtectedSandApp.s("㆑\u0001") + this.f71359d + ProtectedSandApp.s("㆒\u0001") + this.f71360e + '}';
    }

    public d(String str, String str2, int i4, String str3, Throwable th) {
        this.f71356a = str;
        this.f71357b = str2;
        this.f71358c = i4;
        this.f71359d = str3;
        this.f71360e = th;
    }
}
