package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.reporting.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: MessagingAnalytics.java */
/* loaded from: classes2.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17310a = ProtectedSandApp.s("ᡜ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f17311b = ProtectedSandApp.s("ᡝ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f17312c = ProtectedSandApp.s("ᡞ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f17313d = ProtectedSandApp.s("ᡟ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f17314e = ProtectedSandApp.s("ᡠ");

    @androidx.annotation.m1
    static void A(String str, Bundle bundle) {
        try {
            com.google.firebase.g.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d6 = d(bundle);
            if (d6 != null) {
                bundle2.putString(ProtectedSandApp.s("\u181e"), d6);
            }
            String e6 = e(bundle);
            if (e6 != null) {
                bundle2.putString(ProtectedSandApp.s("\u181f"), e6);
            }
            String i5 = i(bundle);
            if (!TextUtils.isEmpty(i5)) {
                bundle2.putString(ProtectedSandApp.s("ᠠ"), i5);
            }
            String g5 = g(bundle);
            if (!TextUtils.isEmpty(g5)) {
                bundle2.putString(ProtectedSandApp.s("ᠡ"), g5);
            }
            String r5 = r(bundle);
            if (r5 != null) {
                bundle2.putString(ProtectedSandApp.s("ᠢ"), r5);
            }
            String l5 = l(bundle);
            if (l5 != null) {
                try {
                    bundle2.putInt(ProtectedSandApp.s("ᠣ"), Integer.parseInt(l5));
                } catch (NumberFormatException unused) {
                }
            }
            String t5 = t(bundle);
            if (t5 != null) {
                try {
                    bundle2.putInt(ProtectedSandApp.s("ᠤ"), Integer.parseInt(t5));
                } catch (NumberFormatException unused2) {
                }
            }
            String n5 = n(bundle);
            if (ProtectedSandApp.s("ᠥ").equals(str) || ProtectedSandApp.s("ᠦ").equals(str)) {
                bundle2.putString(ProtectedSandApp.s("ᠧ"), n5);
            }
            if (Log.isLoggable(ProtectedSandApp.s("ᠨ"), 3)) {
                bundle2.toString();
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.p().l(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                aVar.c(ProtectedSandApp.s("ᠩ"), str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    static void B(boolean z5) {
        com.google.firebase.g.p().n().getSharedPreferences(ProtectedSandApp.s("ᠪ"), 0).edit().putBoolean(ProtectedSandApp.s("ᠫ"), z5).apply();
    }

    private static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean equals = ProtectedSandApp.s("ᠭ").equals(bundle.getString(ProtectedSandApp.s("ᠬ")));
        String s5 = ProtectedSandApp.s("ᠮ");
        if (!equals) {
            Log.isLoggable(s5, 3);
            return;
        }
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.p().l(com.google.firebase.analytics.connector.a.class);
        Log.isLoggable(s5, 3);
        if (aVar != null) {
            String string = bundle.getString(ProtectedSandApp.s("ᠯ"));
            String s6 = ProtectedSandApp.s("ᠰ");
            String s7 = ProtectedSandApp.s("ᠱ");
            aVar.f(s7, s6, string);
            Bundle bundle2 = new Bundle();
            bundle2.putString(ProtectedSandApp.s("ᠲ"), ProtectedSandApp.s("ᠳ"));
            bundle2.putString(ProtectedSandApp.s("ᠴ"), ProtectedSandApp.s("ᠵ"));
            bundle2.putString(ProtectedSandApp.s("ᠶ"), string);
            aVar.c(s7, ProtectedSandApp.s("ᠷ"), bundle2);
        }
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return ProtectedSandApp.s("ᠹ").equals(bundle.getString(ProtectedSandApp.s("ᠸ")));
    }

    static boolean a() {
        Context n5;
        SharedPreferences sharedPreferences;
        String s5;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s6 = ProtectedSandApp.s("ᠺ");
        try {
            com.google.firebase.g.p();
            n5 = com.google.firebase.g.p().n();
            sharedPreferences = n5.getSharedPreferences(ProtectedSandApp.s("ᠻ"), 0);
            s5 = ProtectedSandApp.s("ᠼ");
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains(s5)) {
            return sharedPreferences.getBoolean(s5, false);
        }
        PackageManager packageManager = n5.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n5.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(s6)) {
            return applicationInfo.metaData.getBoolean(s6, false);
        }
        return false;
    }

    static com.google.firebase.messaging.reporting.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0223a j5 = com.google.firebase.messaging.reporting.a.q().p(s(extras)).g(bVar).h(f(extras)).k(o()).n(a.d.ANDROID).j(m(extras));
        String h5 = h(extras);
        if (h5 != null) {
            j5.i(h5);
        }
        String r5 = r(extras);
        if (r5 != null) {
            j5.o(r5);
        }
        String c6 = c(extras);
        if (c6 != null) {
            j5.e(c6);
        }
        String i5 = i(extras);
        if (i5 != null) {
            j5.b(i5);
        }
        String e6 = e(extras);
        if (e6 != null) {
            j5.f(e6);
        }
        long q5 = q(extras);
        if (q5 > 0) {
            j5.m(q5);
        }
        return j5.a();
    }

    @androidx.annotation.q0
    static String c(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᠽ"));
    }

    @androidx.annotation.q0
    static String d(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᠾ"));
    }

    @androidx.annotation.q0
    static String e(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᠿ"));
    }

    @androidx.annotation.o0
    static String f(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ᡀ"));
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(com.google.firebase.installations.j.v(com.google.firebase.g.p()).getId());
        } catch (InterruptedException | ExecutionException e6) {
            throw new RuntimeException(e6);
        }
    }

    @androidx.annotation.q0
    static String g(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᡁ"));
    }

    @androidx.annotation.q0
    static String h(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ᡂ"));
        return string == null ? bundle.getString(ProtectedSandApp.s("ᡃ")) : string;
    }

    @androidx.annotation.q0
    static String i(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᡄ"));
    }

    @androidx.annotation.o0
    private static int j(String str) {
        if (ProtectedSandApp.s("ᡅ").equals(str)) {
            return 1;
        }
        return ProtectedSandApp.s("ᡆ").equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int p5 = p(bundle);
        if (p5 == 2) {
            return 5;
        }
        return p5 == 1 ? 10 : 0;
    }

    @androidx.annotation.q0
    static String l(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ᡇ"));
    }

    @androidx.annotation.o0
    static a.c m(Bundle bundle) {
        return (bundle == null || !l0.v(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    @androidx.annotation.o0
    static String n(Bundle bundle) {
        return (bundle == null || !l0.v(bundle)) ? ProtectedSandApp.s("ᡉ") : ProtectedSandApp.s("ᡈ");
    }

    @androidx.annotation.o0
    static String o() {
        return com.google.firebase.g.p().n().getPackageName();
    }

    @androidx.annotation.o0
    static int p(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ᡊ"));
        if (string == null) {
            if (ProtectedSandApp.s("ᡌ").equals(bundle.getString(ProtectedSandApp.s("ᡋ")))) {
                return 2;
            }
            string = bundle.getString(ProtectedSandApp.s("ᡍ"));
        }
        return j(string);
    }

    @androidx.annotation.q0
    static long q(Bundle bundle) {
        String s5 = ProtectedSandApp.s("ᡎ");
        if (bundle.containsKey(s5)) {
            try {
                return Long.parseLong(bundle.getString(s5));
            } catch (NumberFormatException unused) {
            }
        }
        com.google.firebase.g p5 = com.google.firebase.g.p();
        String m5 = p5.s().m();
        if (m5 != null) {
            try {
                return Long.parseLong(m5);
            } catch (NumberFormatException unused2) {
            }
        }
        String j5 = p5.s().j();
        try {
            if (!j5.startsWith(ProtectedSandApp.s("ᡏ"))) {
                return Long.parseLong(j5);
            }
            String[] split = j5.split(ProtectedSandApp.s("ᡐ"));
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    @androidx.annotation.q0
    static String r(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ᡑ"));
        if (string == null || !string.startsWith(ProtectedSandApp.s("ᡒ"))) {
            return null;
        }
        return string;
    }

    @androidx.annotation.o0
    static int s(Bundle bundle) {
        Object obj = bundle.get(ProtectedSandApp.s("ᡓ"));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Objects.toString(obj);
            return 0;
        }
    }

    @androidx.annotation.q0
    static String t(Bundle bundle) {
        String s5 = ProtectedSandApp.s("ᡔ");
        if (bundle.containsKey(s5)) {
            return bundle.getString(s5);
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return ProtectedSandApp.s("ᡕ").equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(ProtectedSandApp.s("ᡖ"), intent.getExtras());
    }

    public static void w(Intent intent) {
        A(ProtectedSandApp.s("ᡗ"), intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(ProtectedSandApp.s("ᡘ"), bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(ProtectedSandApp.s("ᡙ"), intent.getExtras());
        }
        if (D(intent)) {
            z(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.A());
        }
    }

    private static void z(a.b bVar, Intent intent, @androidx.annotation.q0 com.google.android.datatransport.i iVar) {
        com.google.firebase.messaging.reporting.a b6;
        if (iVar == null || (b6 = b(bVar, intent)) == null) {
            return;
        }
        try {
            iVar.b(ProtectedSandApp.s("ᡚ"), com.google.firebase.messaging.reporting.b.class, com.google.android.datatransport.c.b(ProtectedSandApp.s("ᡛ")), new com.google.android.datatransport.g() { // from class: com.google.firebase.messaging.i0
                @Override // com.google.android.datatransport.g
                public final Object apply(Object obj) {
                    com.google.firebase.messaging.reporting.b bVar2 = (com.google.firebase.messaging.reporting.b) obj;
                    bVar2.getClass();
                    return m0.b(bVar2);
                }
            }).a(com.google.android.datatransport.d.e(com.google.firebase.messaging.reporting.b.d().b(b6).a()));
        } catch (RuntimeException unused) {
        }
    }
}
