package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService;

/* compiled from: HuaweiImpl.java */
/* loaded from: classes5.dex */
class g implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50145a;

    /* renamed from: b, reason: collision with root package name */
    private String f50146b;

    /* compiled from: HuaweiImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            OpenDeviceIdentifierService asInterface = OpenDeviceIdentifierService.Stub.asInterface(service);
            if (asInterface.isOaidTrackLimited()) {
                throw new OAIDException(ProtectedSandApp.s("쎇"));
            }
            return asInterface.getOaid();
        }
    }

    public g(Context context) {
        this.f50145a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        String s4 = ProtectedSandApp.s("쎈");
        String s5 = ProtectedSandApp.s("쎉");
        Context context = this.f50145a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo(s5, 0) != null) {
                this.f50146b = s5;
            } else if (packageManager.getPackageInfo(s4, 0) != null) {
                this.f50146b = s4;
            } else {
                String s6 = ProtectedSandApp.s("쎊");
                this.f50146b = s6;
                if (packageManager.getPackageInfo(s6, 0) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("쎋");
        Context context = this.f50145a;
        if (context == null || getter == null) {
            return;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), ProtectedSandApp.s("쎌"));
            if (!TextUtils.isEmpty(string)) {
                com.github.gzuliyujiang.oaid.i.b(s4 + string);
                getter.a(string);
                return;
            }
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
        }
        if (TextUtils.isEmpty(this.f50146b) && !a()) {
            getter.b(new OAIDException(ProtectedSandApp.s("쎍")));
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("쎎"));
        intent.setPackage(this.f50146b);
        m.a(this.f50145a, intent, getter, new a());
    }
}
