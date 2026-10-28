package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.bun.lib.MsaIdInterface;

/* compiled from: MsaImpl.java */
/* loaded from: classes5.dex */
class j implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50151a;

    /* compiled from: MsaImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            MsaIdInterface asInterface = MsaIdInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("쎚"));
            }
            if (asInterface.isSupported()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("쎙"));
        }
    }

    public j(Context context) {
        this.f50151a = context;
    }

    private void c() {
        try {
            Intent intent = new Intent(ProtectedSandApp.s("쎛"));
            intent.setClassName(ProtectedSandApp.s("쎜"), ProtectedSandApp.s("쎝"));
            intent.putExtra(ProtectedSandApp.s("쎞"), this.f50151a.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f50151a.startService(intent);
            } else {
                this.f50151a.startForegroundService(intent);
            }
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50151a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎜"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50151a == null || getter == null) {
            return;
        }
        c();
        Intent intent = new Intent(ProtectedSandApp.s("쎟"));
        intent.setClassName(ProtectedSandApp.s("쎜"), ProtectedSandApp.s("쎠"));
        intent.putExtra(ProtectedSandApp.s("쎞"), this.f50151a.getPackageName());
        m.a(this.f50151a, intent, getter, new a());
    }
}
