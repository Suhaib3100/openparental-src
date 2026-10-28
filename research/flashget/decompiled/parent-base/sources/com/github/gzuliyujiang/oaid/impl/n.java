package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import repeackage.com.heytap.openid.IOpenID;

/* compiled from: OppoImpl.java */
/* loaded from: classes5.dex */
class n implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50158a;

    /* renamed from: b, reason: collision with root package name */
    private String f50159b;

    /* compiled from: OppoImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            try {
                return n.this.e(service);
            } catch (RemoteException e4) {
                throw e4;
            } catch (OAIDException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new OAIDException(e6);
            }
        }
    }

    public n(Context context) {
        if (context instanceof Application) {
            this.f50158a = context;
        } else {
            this.f50158a = context.getApplicationContext();
        }
    }

    private String d(IBinder service, String pkgName, String sign) throws RemoteException, OAIDException {
        IOpenID asInterface = IOpenID.Stub.asInterface(service);
        if (asInterface != null) {
            return asInterface.getSerID(pkgName, sign, ProtectedSandApp.s("쎵"));
        }
        throw new OAIDException(ProtectedSandApp.s("쎶"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PackageManagerGetSignatures"})
    public String e(IBinder service) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException, OAIDException {
        String packageName = this.f50158a.getPackageName();
        String str = this.f50159b;
        if (str != null) {
            return d(service, packageName, str);
        }
        byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("쎷")).digest(this.f50158a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b5 : digest) {
            sb.append(Integer.toHexString((b5 & 255) | 256).substring(1, 3));
        }
        String sb2 = sb.toString();
        this.f50159b = sb2;
        return d(service, packageName, sb2);
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50158a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쎸"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (this.f50158a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("쎹"));
        intent.setComponent(new ComponentName(ProtectedSandApp.s("쎸"), ProtectedSandApp.s("쎺")));
        m.a(this.f50158a, intent, getter, new a());
    }
}
