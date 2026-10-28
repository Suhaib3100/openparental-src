package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: NubiaImpl.java */
/* loaded from: classes5.dex */
class k implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50153a;

    public k(Context context) {
        this.f50153a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    @SuppressLint({"AnnotateVersionCheck"})
    public boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("쎡");
        String s5 = ProtectedSandApp.s("쎢");
        if (this.f50153a == null || getter == null) {
            return;
        }
        if (!a()) {
            String s6 = ProtectedSandApp.s("쎣");
            com.github.gzuliyujiang.oaid.i.b(s6);
            getter.b(new OAIDException(s6));
            return;
        }
        try {
            ContentProviderClient acquireContentProviderClient = this.f50153a.getContentResolver().acquireContentProviderClient(Uri.parse(ProtectedSandApp.s("쎤")));
            if (acquireContentProviderClient == null) {
                return;
            }
            Bundle call = acquireContentProviderClient.call(ProtectedSandApp.s("쎥"), null, null);
            acquireContentProviderClient.close();
            if (call == null) {
                throw new OAIDException(ProtectedSandApp.s("쎩"));
            }
            String string = call.getInt(ProtectedSandApp.s("쎦"), -1) == 0 ? call.getString(ProtectedSandApp.s("쎧")) : null;
            if (string == null || string.length() == 0) {
                throw new OAIDException(s4 + call.getString(ProtectedSandApp.s("쎨")));
            }
            com.github.gzuliyujiang.oaid.i.b(s5.concat(string));
            getter.a(string);
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            getter.b(e4);
        }
    }
}
