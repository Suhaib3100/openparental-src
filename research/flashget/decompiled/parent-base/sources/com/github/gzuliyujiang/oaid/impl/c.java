package com.github.gzuliyujiang.oaid.impl;

import android.app.KeyguardManager;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: CooseaImpl.java */
/* loaded from: classes5.dex */
public class c implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50139a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyguardManager f50140b;

    public c(Context context) {
        this.f50139a = context;
        this.f50140b = (KeyguardManager) context.getSystemService(ProtectedSandApp.s("썹"));
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        KeyguardManager keyguardManager;
        if (this.f50139a == null || (keyguardManager = this.f50140b) == null) {
            return false;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod(ProtectedSandApp.s("썺"), null).invoke(this.f50140b, null);
            Objects.requireNonNull(invoke);
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("썻");
        if (this.f50139a == null || getter == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f50140b;
        if (keyguardManager == null) {
            getter.b(new OAIDException(ProtectedSandApp.s("썼")));
            return;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod(ProtectedSandApp.s("썽"), null).invoke(this.f50140b, null);
            if (invoke == null) {
                throw new OAIDException(ProtectedSandApp.s("썾"));
            }
            String obj = invoke.toString();
            com.github.gzuliyujiang.oaid.i.b(s4 + obj);
            getter.a(obj);
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
        }
    }
}
