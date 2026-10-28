package com.android.volley;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Header.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f40892a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40893b;

    public i(String str, String str2) {
        this.f40892a = str;
        this.f40893b = str2;
    }

    public final String a() {
        return this.f40892a;
    }

    public final String b() {
        return this.f40893b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return TextUtils.equals(this.f40892a, iVar.f40892a) && TextUtils.equals(this.f40893b, iVar.f40893b);
    }

    public int hashCode() {
        return this.f40893b.hashCode() + (this.f40892a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ڊ"));
        sb.append(this.f40892a);
        sb.append(ProtectedSandApp.s("ڋ"));
        return android.support.v4.media.c.a(sb, this.f40893b, ProtectedSandApp.s("ڌ"));
    }
}
