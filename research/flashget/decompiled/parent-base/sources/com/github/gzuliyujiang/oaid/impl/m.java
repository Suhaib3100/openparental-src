package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: OAIDService.java */
/* loaded from: classes5.dex */
class m implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    private final Context f50155b;

    /* renamed from: c, reason: collision with root package name */
    private final com.github.gzuliyujiang.oaid.g f50156c;

    /* renamed from: d, reason: collision with root package name */
    private final a f50157d;

    /* compiled from: OAIDService.java */
    @FunctionalInterface
    public interface a {
        String a(IBinder binder) throws OAIDException, RemoteException;
    }

    private m(Context context, com.github.gzuliyujiang.oaid.g getter, a caller) {
        if (context instanceof Application) {
            this.f50155b = context;
        } else {
            this.f50155b = context.getApplicationContext();
        }
        this.f50156c = getter;
        this.f50157d = caller;
    }

    public static void a(Context context, Intent intent, com.github.gzuliyujiang.oaid.g getter, a caller) {
        new m(context, getter, caller).b(intent);
    }

    private void b(Intent intent) {
        String s4 = ProtectedSandApp.s("쎮");
        try {
            if (!this.f50155b.bindService(intent, this, 1)) {
                throw new OAIDException(ProtectedSandApp.s("쎯"));
            }
            com.github.gzuliyujiang.oaid.i.b(s4 + intent);
        } catch (Exception e4) {
            this.f50156c.b(e4);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        String s4 = ProtectedSandApp.s("쎰");
        String s5 = ProtectedSandApp.s("쎱");
        com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎲") + name.getClassName());
        try {
            try {
                try {
                    String a5 = this.f50157d.a(service);
                    if (a5 == null || a5.length() == 0) {
                        throw new OAIDException(ProtectedSandApp.s("쎳"));
                    }
                    com.github.gzuliyujiang.oaid.i.b(s5.concat(a5));
                    this.f50156c.a(a5);
                    this.f50155b.unbindService(this);
                    com.github.gzuliyujiang.oaid.i.b(s4 + name.getClassName());
                } catch (Exception e4) {
                    com.github.gzuliyujiang.oaid.i.b(e4);
                    this.f50156c.b(e4);
                    this.f50155b.unbindService(this);
                    com.github.gzuliyujiang.oaid.i.b(s4 + name.getClassName());
                }
            } catch (Throwable th) {
                try {
                    this.f50155b.unbindService(this);
                    com.github.gzuliyujiang.oaid.i.b(s4 + name.getClassName());
                } catch (Exception e5) {
                    com.github.gzuliyujiang.oaid.i.b(e5);
                }
                throw th;
            }
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.i.b(e6);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎴") + name.getClassName());
    }
}
