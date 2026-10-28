package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: NubiaImpl.java */
/* loaded from: classes3.dex */
class k implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12227a;

    public k(Context context) {
        this.f12227a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    @SuppressLint({"AnnotateVersionCheck"})
    public boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("ἦ");
        String s6 = ProtectedSandApp.s("ἧ");
        if (this.f12227a == null || getter == null) {
            return;
        }
        if (!a()) {
            String s7 = ProtectedSandApp.s("Ἠ");
            com.github.gzuliyujiang.oaid.g.b(s7);
            getter.b(new OAIDException(s7));
            return;
        }
        try {
            ContentProviderClient acquireContentProviderClient = this.f12227a.getContentResolver().acquireContentProviderClient(Uri.parse(ProtectedSandApp.s("Ἡ")));
            if (acquireContentProviderClient == null) {
                return;
            }
            Bundle call = acquireContentProviderClient.call(ProtectedSandApp.s("Ἢ"), null, null);
            acquireContentProviderClient.close();
            if (call == null) {
                throw new OAIDException(ProtectedSandApp.s("Ἦ"));
            }
            String string = call.getInt(ProtectedSandApp.s("Ἣ"), -1) == 0 ? call.getString(ProtectedSandApp.s("Ἤ")) : null;
            if (string == null || string.length() == 0) {
                throw new OAIDException(s6 + call.getString(ProtectedSandApp.s("Ἥ")));
            }
            com.github.gzuliyujiang.oaid.g.b(s5.concat(string));
            getter.a(string);
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            getter.b(e6);
        }
    }
}
