package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.zui.deviceidservice.IDeviceidInterface;

/* compiled from: LenovoImpl.java */
/* loaded from: classes5.dex */
class h implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50148a;

    /* compiled from: LenovoImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDeviceidInterface asInterface = IDeviceidInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("쎐"));
            }
            if (asInterface.isSupport()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("쎏"));
        }
    }

    public h(Context context) {
        this.f50148a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50148a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎑"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50148a == null || getter == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(ProtectedSandApp.s("쎑"), ProtectedSandApp.s("쎒"));
        m.a(this.f50148a, intent, getter, new a());
    }
}
