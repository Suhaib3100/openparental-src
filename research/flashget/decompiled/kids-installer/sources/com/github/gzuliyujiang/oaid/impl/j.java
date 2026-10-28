package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.bun.lib.MsaIdInterface;

/* compiled from: MsaImpl.java */
/* loaded from: classes3.dex */
class j implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12225a;

    /* compiled from: MsaImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            MsaIdInterface asInterface = MsaIdInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("Ἔ"));
            }
            if (asInterface.isSupported()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("Ἓ"));
        }
    }

    public j(Context context) {
        this.f12225a = context;
    }

    private void c() {
        try {
            Intent intent = new Intent(ProtectedSandApp.s("Ἕ"));
            intent.setClassName(ProtectedSandApp.s("\u1f1e"), ProtectedSandApp.s("\u1f1f"));
            intent.putExtra(ProtectedSandApp.s("ἠ"), this.f12225a.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f12225a.startService(intent);
            } else {
                this.f12225a.startForegroundService(intent);
            }
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12225a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἡ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12225a == null || getter == null) {
            return;
        }
        c();
        Intent intent = new Intent(ProtectedSandApp.s("ἢ"));
        intent.setClassName(ProtectedSandApp.s("ἣ"), ProtectedSandApp.s("ἤ"));
        intent.putExtra(ProtectedSandApp.s("ἥ"), this.f12225a.getPackageName());
        m.a(this.f12225a, intent, getter, new a());
    }
}
