package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: XiaomiImpl.java */
/* loaded from: classes3.dex */
class q implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12238a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f12239b;

    /* renamed from: c, reason: collision with root package name */
    private Object f12240c;

    @SuppressLint({"PrivateApi"})
    public q(Context context) {
        this.f12238a = context;
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("ὁ"));
            this.f12239b = cls;
            this.f12240c = cls.newInstance();
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
        }
    }

    private String c() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) this.f12239b.getMethod(ProtectedSandApp.s("ὂ"), Context.class).invoke(this.f12240c, this.f12238a);
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        return this.f12240c != null;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("ὃ");
        if (this.f12238a == null || getter == null) {
            return;
        }
        if (this.f12239b == null || this.f12240c == null) {
            getter.b(new OAIDException(ProtectedSandApp.s("ὅ")));
            return;
        }
        try {
            String c6 = c();
            if (c6 == null || c6.length() == 0) {
                throw new OAIDException(ProtectedSandApp.s("ὄ"));
            }
            com.github.gzuliyujiang.oaid.g.b(s5.concat(c6));
            getter.a(c6);
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            getter.b(e6);
        }
    }
}
