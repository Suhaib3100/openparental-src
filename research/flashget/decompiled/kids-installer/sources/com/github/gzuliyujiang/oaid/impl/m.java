package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: OAIDService.java */
/* loaded from: classes2.dex */
class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12229a;

    /* renamed from: b, reason: collision with root package name */
    private final com.github.gzuliyujiang.oaid.e f12230b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12231c;

    /* compiled from: OAIDService.java */
    @FunctionalInterface
    public interface a {
        String a(IBinder binder) throws OAIDException, RemoteException;
    }

    private m(Context context, com.github.gzuliyujiang.oaid.e getter, a caller) {
        if (context instanceof Application) {
            this.f12229a = context;
        } else {
            this.f12229a = context.getApplicationContext();
        }
        this.f12230b = getter;
        this.f12231c = caller;
    }

    public static void a(Context context, Intent intent, com.github.gzuliyujiang.oaid.e getter, a caller) {
        new m(context, getter, caller).b(intent);
    }

    private void b(Intent intent) {
        String s5 = ProtectedSandApp.s("ࣙ");
        try {
            if (!this.f12229a.bindService(intent, this, 1)) {
                throw new OAIDException(ProtectedSandApp.s("ࣚ"));
            }
            com.github.gzuliyujiang.oaid.g.b(s5 + intent);
        } catch (Exception e6) {
            this.f12230b.b(e6);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        String a6;
        String s5 = ProtectedSandApp.s("ࣛ");
        String s6 = ProtectedSandApp.s("ࣜ");
        com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣝ") + name.getClassName());
        try {
            try {
                try {
                    a6 = this.f12231c.a(service);
                } catch (Throwable th) {
                    try {
                        this.f12229a.unbindService(this);
                        com.github.gzuliyujiang.oaid.g.b(s5 + name.getClassName());
                    } catch (Exception e6) {
                        com.github.gzuliyujiang.oaid.g.b(e6);
                    }
                    throw th;
                }
            } catch (Exception e7) {
                com.github.gzuliyujiang.oaid.g.b(e7);
                this.f12230b.b(e7);
                this.f12229a.unbindService(this);
                com.github.gzuliyujiang.oaid.g.b(s5 + name.getClassName());
            }
            if (a6 == null || a6.length() == 0) {
                throw new OAIDException(ProtectedSandApp.s("ࣞ"));
            }
            com.github.gzuliyujiang.oaid.g.b(s6.concat(a6));
            this.f12230b.a(a6);
            this.f12229a.unbindService(this);
            com.github.gzuliyujiang.oaid.g.b(s5 + name.getClassName());
        } catch (Exception e8) {
            com.github.gzuliyujiang.oaid.g.b(e8);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣟ") + name.getClassName());
    }
}
