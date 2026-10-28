package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import repeackage.com.heytap.openid.IOpenID;

/* compiled from: OppoImpl.java */
/* loaded from: classes3.dex */
class n implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12232a;

    /* renamed from: b, reason: collision with root package name */
    private String f12233b;

    /* compiled from: OppoImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            try {
                return n.this.e(service);
            } catch (RemoteException e6) {
                throw e6;
            } catch (OAIDException e7) {
                throw e7;
            } catch (Exception e8) {
                throw new OAIDException(e8);
            }
        }
    }

    public n(Context context) {
        if (context instanceof Application) {
            this.f12232a = context;
        } else {
            this.f12232a = context.getApplicationContext();
        }
    }

    private String d(IBinder service, String pkgName, String sign) throws RemoteException, OAIDException {
        IOpenID asInterface = IOpenID.Stub.asInterface(service);
        if (asInterface != null) {
            return asInterface.getSerID(pkgName, sign, ProtectedSandApp.s("Ἧ"));
        }
        throw new OAIDException(ProtectedSandApp.s("ἰ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PackageManagerGetSignatures"})
    public String e(IBinder service) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException, OAIDException {
        String packageName = this.f12232a.getPackageName();
        String str = this.f12233b;
        if (str != null) {
            return d(service, packageName, str);
        }
        byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("ἱ")).digest(this.f12232a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b6 : digest) {
            sb.append(Integer.toHexString((b6 & UByte.f27220r) | 256).substring(1, 3));
        }
        String sb2 = sb.toString();
        this.f12233b = sb2;
        return d(service, packageName, sb2);
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12232a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ἲ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (this.f12232a == null || getter == null) {
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("ἳ"));
        intent.setComponent(new ComponentName(ProtectedSandApp.s("ἴ"), ProtectedSandApp.s("ἵ")));
        m.a(this.f12232a, intent, getter, new a());
    }
}
