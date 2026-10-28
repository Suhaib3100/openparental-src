package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.samsung.android.deviceidservice.IDeviceIdService;

/* compiled from: SamsungImpl.java */
/* loaded from: classes5.dex */
class o implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50161a;

    /* compiled from: SamsungImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDeviceIdService asInterface = IDeviceIdService.Stub.asInterface(service);
            if (asInterface != null) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("쎻"));
        }
    }

    public o(Context context) {
        this.f50161a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50161a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎼"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50161a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(ProtectedSandApp.s("쎼"), ProtectedSandApp.s("쎽"));
        m.a(this.f50161a, intent, getter, new a());
    }
}
