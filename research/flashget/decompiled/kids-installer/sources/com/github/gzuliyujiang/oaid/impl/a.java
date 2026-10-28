package com.github.gzuliyujiang.oaid.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* compiled from: AsusImpl.java */
/* loaded from: classes3.dex */
class a implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12209a;

    /* compiled from: AsusImpl.java */
    /* renamed from: com.github.gzuliyujiang.oaid.impl.a$a, reason: collision with other inner class name */
    class C0157a implements m.a {
        C0157a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IDidAidlInterface asInterface = IDidAidlInterface.Stub.asInterface(service);
            if (asInterface == null) {
                throw new OAIDException(ProtectedSandApp.s("Ự"));
            }
            if (asInterface.isSupport()) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("ữ"));
        }
    }

    public a(Context context) {
        this.f12209a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12209a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ự"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12209a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("Ỳ"));
        intent.setComponent(new ComponentName(ProtectedSandApp.s("ỳ"), ProtectedSandApp.s("Ỵ")));
        m.a(this.f12209a, intent, getter, new C0157a());
    }
}
