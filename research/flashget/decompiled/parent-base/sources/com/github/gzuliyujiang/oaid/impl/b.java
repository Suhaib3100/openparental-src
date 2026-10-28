package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.coolpad.deviceidsupport.IDeviceIdManager;

/* compiled from: CoolpadImpl.java */
/* loaded from: classes5.dex */
public class b implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50137a;

    /* compiled from: CoolpadImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDeviceIdManager asInterface = IDeviceIdManager.Stub.asInterface(service);
            if (asInterface != null) {
                return asInterface.getOAID(b.this.f50137a.getPackageName());
            }
            throw new OAIDException(ProtectedSandApp.s("썶"));
        }
    }

    public b(Context context) {
        if (context instanceof Application) {
            this.f50137a = context;
        } else {
            this.f50137a = context.getApplicationContext();
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50137a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("썷"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50137a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ProtectedSandApp.s("썷"), ProtectedSandApp.s("썸")));
        m.a(this.f50137a, intent, getter, new a());
    }
}
