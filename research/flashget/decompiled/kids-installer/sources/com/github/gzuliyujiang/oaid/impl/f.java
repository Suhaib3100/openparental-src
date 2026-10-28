package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.google.android.gms.ads.identifier.internal.a;

/* compiled from: GmsImpl.java */
/* loaded from: classes3.dex */
class f implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12217a;

    /* compiled from: GmsImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            repeackage.com.google.android.gms.ads.identifier.internal.a d6 = a.b.d(service);
            if (d6.b(true)) {
                com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ἄ"));
            }
            return d6.getId();
        }
    }

    public f(Context context) {
        this.f12217a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12217a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἅ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12217a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("ἆ"));
        intent.setPackage(ProtectedSandApp.s("ἇ"));
        m.a(this.f12217a, intent, getter, new a());
    }
}
