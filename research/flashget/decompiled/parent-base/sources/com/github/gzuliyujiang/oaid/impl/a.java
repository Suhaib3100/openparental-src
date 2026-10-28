package com.github.gzuliyujiang.oaid.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* compiled from: AsusImpl.java */
/* loaded from: classes5.dex */
class a implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50135a;

    /* compiled from: AsusImpl.java */
    /* renamed from: com.github.gzuliyujiang.oaid.impl.a$a, reason: collision with other inner class name */
    class C0773a implements m.a {
        C0773a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDidAidlInterface asInterface = IDidAidlInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("썲"));
            }
            if (asInterface.isSupport()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("썱"));
        }
    }

    public a(Context context) {
        this.f50135a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50135a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("썳"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50135a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("썴"));
        intent.setComponent(new ComponentName(ProtectedSandApp.s("썳"), ProtectedSandApp.s("썵")));
        m.a(this.f50135a, intent, getter, new C0773a());
    }
}
