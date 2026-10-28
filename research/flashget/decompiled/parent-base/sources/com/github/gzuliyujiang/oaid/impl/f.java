package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.google.android.gms.ads.identifier.internal.a;

/* compiled from: GmsImpl.java */
/* loaded from: classes5.dex */
class f implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50143a;

    /* compiled from: GmsImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            repeackage.com.google.android.gms.ads.identifier.internal.a E = a.b.E(service);
            if (E.b(true)) {
                com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎃"));
            }
            return E.a();
        }
    }

    public f(Context context) {
        this.f50143a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50143a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎄"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50143a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("쎅"));
        intent.setPackage(ProtectedSandApp.s("쎆"));
        m.a(this.f50143a, intent, getter, new a());
    }
}
