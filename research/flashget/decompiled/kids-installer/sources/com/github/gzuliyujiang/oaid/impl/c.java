package com.github.gzuliyujiang.oaid.impl;

import android.app.KeyguardManager;
import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: CooseaImpl.java */
/* loaded from: classes3.dex */
public class c implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12213a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyguardManager f12214b;

    public c(Context context) {
        this.f12213a = context;
        this.f12214b = (KeyguardManager) context.getSystemService(ProtectedSandApp.s("ỹ"));
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        KeyguardManager keyguardManager;
        if (this.f12213a == null || (keyguardManager = this.f12214b) == null) {
            return false;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod(ProtectedSandApp.s("Ỻ"), new Class[0]).invoke(this.f12214b, new Object[0]);
            Objects.requireNonNull(invoke);
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("ỻ");
        if (this.f12213a == null || getter == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f12214b;
        if (keyguardManager == null) {
            getter.b(new OAIDException(ProtectedSandApp.s("Ỽ")));
            return;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod(ProtectedSandApp.s("ỽ"), new Class[0]).invoke(this.f12214b, new Object[0]);
            if (invoke == null) {
                throw new OAIDException(ProtectedSandApp.s("Ỿ"));
            }
            String obj = invoke.toString();
            com.github.gzuliyujiang.oaid.g.b(s5 + obj);
            getter.a(obj);
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
        }
    }
}
