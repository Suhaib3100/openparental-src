package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.zui.deviceidservice.IDeviceidInterface;

/* compiled from: LenovoImpl.java */
/* loaded from: classes3.dex */
class h implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12222a;

    /* compiled from: LenovoImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDeviceidInterface asInterface = IDeviceidInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("ἑ"));
            }
            if (asInterface.isSupport()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("ἐ"));
        }
    }

    public h(Context context) {
        this.f12222a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12222a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἒ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12222a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(ProtectedSandApp.s("ἓ"), ProtectedSandApp.s("ἔ"));
        m.a(this.f12222a, intent, getter, new a());
    }
}
