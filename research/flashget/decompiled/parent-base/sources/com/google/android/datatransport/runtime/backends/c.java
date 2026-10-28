package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes5.dex */
final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    private final Context f51966b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51967c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f51968d;

    /* renamed from: e, reason: collision with root package name */
    private final String f51969e;

    c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException(ProtectedSandApp.s("얩"));
        }
        this.f51966b = context;
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("얨"));
        }
        this.f51967c = aVar;
        if (aVar2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("얧"));
        }
        this.f51968d = aVar2;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("얦"));
        }
        this.f51969e = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public Context c() {
        return this.f51966b;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    @o0
    public String d() {
        return this.f51969e;
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a e() {
        return this.f51968d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f51966b.equals(iVar.c()) && this.f51967c.equals(iVar.f()) && this.f51968d.equals(iVar.e()) && this.f51969e.equals(iVar.d());
    }

    @Override // com.google.android.datatransport.runtime.backends.i
    public com.google.android.datatransport.runtime.time.a f() {
        return this.f51967c;
    }

    public int hashCode() {
        return ((((((this.f51966b.hashCode() ^ 1000003) * 1000003) ^ this.f51967c.hashCode()) * 1000003) ^ this.f51968d.hashCode()) * 1000003) ^ this.f51969e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("얪"));
        sb.append(this.f51966b);
        sb.append(ProtectedSandApp.s("얫"));
        sb.append(this.f51967c);
        sb.append(ProtectedSandApp.s("얬"));
        sb.append(this.f51968d);
        sb.append(ProtectedSandApp.s("얭"));
        return android.support.v4.media.c.a(sb, this.f51969e, ProtectedSandApp.s("얮"));
    }
}
