package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: OAIDFactory.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static com.github.gzuliyujiang.oaid.f f12228a;

    private l() {
    }

    public static com.github.gzuliyujiang.oaid.f a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        com.github.gzuliyujiang.oaid.f fVar = f12228a;
        if (fVar != null) {
            return fVar;
        }
        com.github.gzuliyujiang.oaid.f b6 = b(context);
        f12228a = b6;
        if (b6 == null || !b6.a()) {
            com.github.gzuliyujiang.oaid.f c6 = c(context);
            f12228a = c6;
            return c6;
        }
        com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣕ").concat(f12228a.getClass().getName()));
        return f12228a;
    }

    private static com.github.gzuliyujiang.oaid.f b(Context context) {
        if (com.github.gzuliyujiang.oaid.h.h() || com.github.gzuliyujiang.oaid.h.k()) {
            return new h(context);
        }
        if (com.github.gzuliyujiang.oaid.h.i()) {
            return new i(context);
        }
        if (com.github.gzuliyujiang.oaid.h.l()) {
            return new k(context);
        }
        if (com.github.gzuliyujiang.oaid.h.r() || com.github.gzuliyujiang.oaid.h.j() || com.github.gzuliyujiang.oaid.h.b()) {
            return new q(context);
        }
        if (com.github.gzuliyujiang.oaid.h.p()) {
            return new o(context);
        }
        if (com.github.gzuliyujiang.oaid.h.q()) {
            return new p(context);
        }
        if (com.github.gzuliyujiang.oaid.h.a()) {
            return new a(context);
        }
        if (com.github.gzuliyujiang.oaid.h.g() || com.github.gzuliyujiang.oaid.h.e()) {
            return new g(context);
        }
        if (com.github.gzuliyujiang.oaid.h.n() || com.github.gzuliyujiang.oaid.h.m()) {
            return new n(context);
        }
        if (com.github.gzuliyujiang.oaid.h.c(context)) {
            return new b(context);
        }
        if (com.github.gzuliyujiang.oaid.h.d()) {
            return new c(context);
        }
        if (com.github.gzuliyujiang.oaid.h.f()) {
            return new e(context);
        }
        return null;
    }

    private static com.github.gzuliyujiang.oaid.f c(Context context) {
        j jVar = new j(context);
        if (jVar.a()) {
            com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣖ").concat(j.class.getName()));
            return jVar;
        }
        f fVar = new f(context);
        if (fVar.a()) {
            com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣗ").concat(f.class.getName()));
            return fVar;
        }
        d dVar = new d();
        com.github.gzuliyujiang.oaid.g.b(ProtectedSandApp.s("ࣘ").concat(d.class.getName()));
        return dVar;
    }
}
