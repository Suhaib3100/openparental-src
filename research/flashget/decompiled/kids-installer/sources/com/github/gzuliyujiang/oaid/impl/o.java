package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.samsung.android.deviceidservice.IDeviceIdService;

/* compiled from: SamsungImpl.java */
/* loaded from: classes3.dex */
class o implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12235a;

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
            throw new OAIDException(ProtectedSandApp.s("ἶ"));
        }
    }

    public o(Context context) {
        this.f12235a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12235a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἷ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12235a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(ProtectedSandApp.s("Ἰ"), ProtectedSandApp.s("Ἱ"));
        m.a(this.f12235a, intent, getter, new a());
    }
}
