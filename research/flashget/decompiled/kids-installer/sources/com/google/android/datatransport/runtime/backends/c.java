package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes3.dex */
final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    private final Context f12426b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12427c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12428d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12429e;

    c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException(ProtectedSandApp.s("•"));
        }
        this.f12426b = context;
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("‡"));
        }
        this.f12427c = aVar;
        if (aVar2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("†"));
        }
        this.f12428d = aVar2;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("‟"));
        }
        this.f12429e = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public Context c() {
        return this.f12426b;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    @o0
    public String d() {
        return this.f12429e;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a e() {
        return this.f12428d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f12426b.equals(iVar.c()) && this.f12427c.equals(iVar.f()) && this.f12428d.equals(iVar.e()) && this.f12429e.equals(iVar.d());
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a f() {
        return this.f12427c;
    }

    public int hashCode() {
        return ((((((this.f12426b.hashCode() ^ 1000003) * 1000003) ^ this.f12427c.hashCode()) * 1000003) ^ this.f12428d.hashCode()) * 1000003) ^ this.f12429e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("‣"));
        sb.append(this.f12426b);
        sb.append(ProtectedSandApp.s("․"));
        sb.append(this.f12427c);
        sb.append(ProtectedSandApp.s("‥"));
        sb.append(this.f12428d);
        sb.append(ProtectedSandApp.s("…"));
        return androidx.concurrent.futures.a.a(sb, this.f12429e, ProtectedSandApp.s("‧"));
    }
}
