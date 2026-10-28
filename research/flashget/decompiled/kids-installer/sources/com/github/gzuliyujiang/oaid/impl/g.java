package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import com.github.gzuliyujiang.oaid.impl.m;
import repeackage.com.uodis.opendevice.aidl.OpenDeviceIdentifierService;

/* compiled from: HuaweiImpl.java */
/* loaded from: classes3.dex */
class g implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12219a;

    /* renamed from: b, reason: collision with root package name */
    private String f12220b;

    /* compiled from: HuaweiImpl.java */
    class a implements m.a {
        a() {
        }

        @Override // com.github.gzuliyujiang.oaid.impl.m.a
        public String a(IBinder service) throws OAIDException, RemoteException {
            OpenDeviceIdentifierService asInterface = OpenDeviceIdentifierService.Stub.asInterface(service);
            if (asInterface.isOaidTrackLimited()) {
                throw new OAIDException(ProtectedSandApp.s("Ἀ"));
            }
            return asInterface.getOaid();
        }
    }

    public g(Context context) {
        this.f12219a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        String s5 = ProtectedSandApp.s("Ἁ");
        String s6 = ProtectedSandApp.s("Ἂ");
        Context context = this.f12219a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo(s6, 0) != null) {
                this.f12220b = s6;
            } else if (packageManager.getPackageInfo(s5, 0) != null) {
                this.f12220b = s5;
            } else {
                String s7 = ProtectedSandApp.s("Ἃ");
                this.f12220b = s7;
                if (packageManager.getPackageInfo(s7, 0) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("Ἄ");
        Context context = this.f12219a;
        if (context == null || getter == null) {
            return;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), ProtectedSandApp.s("Ἅ"));
            if (!TextUtils.isEmpty(string)) {
                com.github.gzuliyujiang.oaid.g.b(s5 + string);
                getter.a(string);
                return;
            }
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
        }
        if (TextUtils.isEmpty(this.f12220b) && !a()) {
            getter.b(new OAIDException(ProtectedSandApp.s("Ἆ")));
            return;
        }
        Intent intent = new Intent(ProtectedSandApp.s("Ἇ"));
        intent.setPackage(this.f12220b);
        m.a(this.f12219a, intent, getter, new a());
    }
}
