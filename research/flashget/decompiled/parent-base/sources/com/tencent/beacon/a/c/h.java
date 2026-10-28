package com.tencent.beacon.a.c;

import android.text.TextUtils;

/* compiled from: Qimei.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private String f71113a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f71114b = "";

    public String a() {
        return this.f71113a;
    }

    public String b() {
        return this.f71114b;
    }

    public boolean c() {
        return TextUtils.isEmpty(this.f71113a) && TextUtils.isEmpty(this.f71114b);
    }

    public void a(String str) {
        this.f71113a = str;
    }

    public void b(String str) {
        this.f71114b = str;
    }
}
