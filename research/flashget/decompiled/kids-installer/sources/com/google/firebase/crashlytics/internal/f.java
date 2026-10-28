package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15775c = ProtectedSandApp.s("ᒺ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f15776d = ProtectedSandApp.s("ᒻ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f15777e = ProtectedSandApp.s("ᒼ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f15778f = ProtectedSandApp.s("ᒽ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f15779a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private b f15780b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        @q0
        private final String f15781a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final String f15782b;

        private b() {
            int q5 = com.google.firebase.crashlytics.internal.common.i.q(f.this.f15779a, ProtectedSandApp.s("ᒱ"), ProtectedSandApp.s("ᒲ"));
            if (q5 != 0) {
                this.f15781a = ProtectedSandApp.s("ᒳ");
                String string = f.this.f15779a.getResources().getString(q5);
                this.f15782b = string;
                g.f().k(ProtectedSandApp.s("ᒴ") + string);
                return;
            }
            if (!f.this.c(ProtectedSandApp.s("ᒵ"))) {
                this.f15781a = null;
                this.f15782b = null;
            } else {
                this.f15781a = ProtectedSandApp.s("ᒶ");
                this.f15782b = null;
                g.f().k(ProtectedSandApp.s("ᒷ"));
            }
        }
    }

    public f(Context context) {
        this.f15779a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f15779a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f15779a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f15780b == null) {
            this.f15780b = new b();
        }
        return this.f15780b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.i.q(context, ProtectedSandApp.s("ᒸ"), ProtectedSandApp.s("ᒹ")) != 0;
    }

    @q0
    public String d() {
        return f().f15781a;
    }

    @q0
    public String e() {
        return f().f15782b;
    }
}
