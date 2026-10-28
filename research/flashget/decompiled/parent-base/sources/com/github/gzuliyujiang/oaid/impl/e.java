package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.android.creator.IdsSupplier;

/* compiled from: FreemeImpl.java */
/* loaded from: classes5.dex */
public class e implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50141a;

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
            throw new OAIDException(ProtectedSandApp.s("쎀"));
        }
    }

    public e(Context context) {
        this.f50141a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50141a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎁"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50141a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("쎂"));
        intent.setPackage(ProtectedSandApp.s("쎁"));
        m.a(this.f50141a, intent, getter, new a());
    }
}
