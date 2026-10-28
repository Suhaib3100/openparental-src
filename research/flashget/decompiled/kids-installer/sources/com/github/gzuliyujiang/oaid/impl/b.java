package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.coolpad.deviceidsupport.IDeviceIdManager;

/* compiled from: CoolpadImpl.java */
/* loaded from: classes3.dex */
public class b implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12211a;

    /* compiled from: CoolpadImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDeviceIdManager asInterface = IDeviceIdManager.Stub.asInterface(service);
            if (asInterface != null) {
                return asInterface.getOAID(b.this.f12211a.getPackageName());
            }
            throw new OAIDException(ProtectedSandApp.s("ỵ"));
        }
    }

    public b(Context context) {
        if (context instanceof Application) {
            this.f12211a = context;
        } else {
            this.f12211a = context.getApplicationContext();
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12211a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("Ỷ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12211a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ProtectedSandApp.s("ỷ"), ProtectedSandApp.s("Ỹ")));
        m.a(this.f12211a, intent, getter, new a());
    }
}
