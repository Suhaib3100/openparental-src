package com.github.gzuliyujiang.oaid.impl;

import android.app.Application;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: OAIDFactory.java */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static com.github.gzuliyujiang.oaid.h f50154a;

    private l() {
    }

    public static com.github.gzuliyujiang.oaid.h a(Context context) {
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        com.github.gzuliyujiang.oaid.h hVar = f50154a;
        if (hVar != null) {
            return hVar;
        }
        com.github.gzuliyujiang.oaid.h b5 = b(context);
        f50154a = b5;
        if (b5 == null || !b5.a()) {
            com.github.gzuliyujiang.oaid.h c5 = c(context);
            f50154a = c5;
            return c5;
        }
        com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎪").concat(f50154a.getClass().getName()));
        return f50154a;
    }

    private static com.github.gzuliyujiang.oaid.h b(Context context) {
        if (com.github.gzuliyujiang.oaid.j.h() || com.github.gzuliyujiang.oaid.j.k()) {
            return new h(context);
        }
        if (com.github.gzuliyujiang.oaid.j.i()) {
            return new i(context);
        }
        if (com.github.gzuliyujiang.oaid.j.l()) {
            return new k(context);
        }
        if (com.github.gzuliyujiang.oaid.j.r() || com.github.gzuliyujiang.oaid.j.j() || com.github.gzuliyujiang.oaid.j.b()) {
            return new q(context);
        }
        if (com.github.gzuliyujiang.oaid.j.p()) {
            return new o(context);
        }
        if (com.github.gzuliyujiang.oaid.j.q()) {
            return new p(context);
        }
        if (com.github.gzuliyujiang.oaid.j.a()) {
            return new a(context);
        }
        if (com.github.gzuliyujiang.oaid.j.g() || com.github.gzuliyujiang.oaid.j.e()) {
            return new g(context);
        }
        if (com.github.gzuliyujiang.oaid.j.n() || com.github.gzuliyujiang.oaid.j.m()) {
            return new n(context);
        }
        if (com.github.gzuliyujiang.oaid.j.c(context)) {
            return new b(context);
        }
        if (com.github.gzuliyujiang.oaid.j.d()) {
            return new c(context);
        }
        if (com.github.gzuliyujiang.oaid.j.f()) {
            return new e(context);
        }
        return null;
    }

    private static com.github.gzuliyujiang.oaid.h c(Context context) {
        j jVar = new j(context);
        if (jVar.a()) {
            com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎫").concat(j.class.getName()));
            return jVar;
        }
        f fVar = new f(context);
        if (fVar.a()) {
            com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎬").concat(f.class.getName()));
            return fVar;
        }
        d dVar = new d();
        com.github.gzuliyujiang.oaid.i.b(ProtectedSandApp.s("쎭").concat(d.class.getName()));
        return dVar;
    }
}
