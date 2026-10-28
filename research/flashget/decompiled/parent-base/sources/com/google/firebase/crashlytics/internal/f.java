package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f58877c = ProtectedSandApp.s("ﳢ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f58878d = ProtectedSandApp.s("ﳣ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f58879e = ProtectedSandApp.s("ﳠ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f58880f = ProtectedSandApp.s("ﳤ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f58881a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private b f58882b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        @q0
        private final String f58883a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final String f58884b;

        private b() {
            int q4 = com.google.firebase.crashlytics.internal.common.i.q(f.this.f58881a, ProtectedSandApp.s("ﳙ"), ProtectedSandApp.s("ﳚ"));
            if (q4 != 0) {
                this.f58883a = ProtectedSandApp.s("ﳛ");
                String string = f.this.f58881a.getResources().getString(q4);
                this.f58884b = string;
                g.f().k(ProtectedSandApp.s("ﳜ") + string);
                return;
            }
            if (!f.this.c(ProtectedSandApp.s("ﳝ"))) {
                this.f58883a = null;
                this.f58884b = null;
            } else {
                this.f58883a = ProtectedSandApp.s("ﳞ");
                this.f58884b = null;
                g.f().k(ProtectedSandApp.s("ﳟ"));
            }
        }
    }

    public f(Context context) {
        this.f58881a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f58881a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f58881a.getAssets().open(str);
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
        if (this.f58882b == null) {
            this.f58882b = new b();
        }
        return this.f58882b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.i.q(context, ProtectedSandApp.s("ﳠ"), ProtectedSandApp.s("ﳡ")) != 0;
    }

    @q0
    public String d() {
        return f().f58883a;
    }

    @q0
    public String e() {
        return f().f58884b;
    }
}
