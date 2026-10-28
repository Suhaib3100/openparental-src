package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.android.creator.IdsSupplier;

/* compiled from: FreemeImpl.java */
/* loaded from: classes3.dex */
public class e implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12215a;

    /* compiled from: FreemeImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            IdsSupplier asInterface = IdsSupplier.Stub.asInterface(service);
            if (asInterface != null) {
                return asInterface.getOAID();
            }
            throw new OAIDException(ProtectedSandApp.s("ἀ"));
        }
    }

    public e(Context context) {
        this.f12215a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12215a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἁ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12215a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("ἂ"));
        intent.setPackage(ProtectedSandApp.s("ἃ"));
        m.a(this.f12215a, intent, getter, new a());
    }
}
