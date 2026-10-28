package com.github.gzuliyujiang.oaid.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: XiaomiImpl.java */
/* loaded from: classes5.dex */
class q implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50164a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f50165b;

    /* renamed from: c, reason: collision with root package name */
    private Object f50166c;

    @SuppressLint({"PrivateApi"})
    public q(Context context) {
        this.f50164a = context;
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("쏅"));
            this.f50165b = cls;
            this.f50166c = cls.newInstance();
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
        }
    }

    private String c() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) this.f50165b.getMethod(ProtectedSandApp.s("쏆"), Context.class).invoke(this.f50166c, this.f50164a);
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        return this.f50166c != null;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("쏇");
        if (this.f50164a == null || getter == null) {
            return;
        }
        if (this.f50165b == null || this.f50166c == null) {
            getter.b(new OAIDException(ProtectedSandApp.s("쏉")));
            return;
        }
        try {
            String c5 = c();
            if (c5 == null || c5.length() == 0) {
                throw new OAIDException(ProtectedSandApp.s("쏈"));
            }
            com.github.gzuliyujiang.oaid.i.b(s4.concat(c5));
            getter.a(c5);
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            getter.b(e4);
        }
    }
}
