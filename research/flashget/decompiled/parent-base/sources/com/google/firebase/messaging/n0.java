package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.reporting.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: MessagingAnalytics.java */
/* loaded from: classes6.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60233a = ProtectedSandApp.s("ʟ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f60234b = ProtectedSandApp.s("ʡ\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final String f60235c = ProtectedSandApp.s("ʙ\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f60236d = ProtectedSandApp.s("ʚ\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f60237e = ProtectedSandApp.s("ʥ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final int f60238f = 111881503;

    @androidx.annotation.m1
    static void A(String str, Bundle bundle) {
        try {
            com.google.firebase.g.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString(ProtectedSandApp.s("ʈ\u0001"));
            if (string != null) {
                bundle2.putString(ProtectedSandApp.s("ʉ\u0001"), string);
            }
            String string2 = bundle.getString(ProtectedSandApp.s("ʊ\u0001"));
            if (string2 != null) {
                bundle2.putString(ProtectedSandApp.s("ʋ\u0001"), string2);
            }
            String string3 = bundle.getString(ProtectedSandApp.s("ʌ\u0001"));
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString(ProtectedSandApp.s("ʍ\u0001"), string3);
            }
            String string4 = bundle.getString(ProtectedSandApp.s("ʎ\u0001"));
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString(ProtectedSandApp.s("ʏ\u0001"), string4);
            }
            String r4 = r(bundle);
            if (r4 != null) {
                bundle2.putString(ProtectedSandApp.s("ʐ\u0001"), r4);
            }
            String string5 = bundle.getString(ProtectedSandApp.s("ʑ\u0001"));
            if (string5 != null) {
                try {
                    bundle2.putInt(ProtectedSandApp.s("ʒ\u0001"), Integer.parseInt(string5));
                } catch (NumberFormatException unused) {
                }
            }
            String t4 = t(bundle);
            if (t4 != null) {
                try {
                    bundle2.putInt(ProtectedSandApp.s("ʓ\u0001"), Integer.parseInt(t4));
                } catch (NumberFormatException unused2) {
                }
            }
            String n4 = n(bundle);
            if (ProtectedSandApp.s("ʔ\u0001").equals(str) || ProtectedSandApp.s("ʕ\u0001").equals(str)) {
                bundle2.putString(ProtectedSandApp.s("ʖ\u0001"), n4);
            }
            if (Log.isLoggable(ProtectedSandApp.s("ʗ\u0001"), 3)) {
                bundle2.toString();
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.p().l(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                aVar.b(ProtectedSandApp.s("ʘ\u0001"), str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    static void B(boolean z4) {
        com.google.firebase.g.p().n().getSharedPreferences(ProtectedSandApp.s("ʙ\u0001"), 0).edit().putBoolean(ProtectedSandApp.s("ʚ\u0001"), z4).apply();
    }

    private static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean equals = ProtectedSandApp.s("ʜ\u0001").equals(bundle.getString(ProtectedSandApp.s("ʛ\u0001")));
        String s4 = ProtectedSandApp.s("ʗ\u0001");
        if (!equals) {
            Log.isLoggable(s4, 3);
            return;
        }
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.p().l(com.google.firebase.analytics.connector.a.class);
        Log.isLoggable(s4, 3);
        if (aVar != null) {
            String string = bundle.getString(ProtectedSandApp.s("ʈ\u0001"));
            String s5 = ProtectedSandApp.s("ʝ\u0001");
            String s6 = ProtectedSandApp.s("ʘ\u0001");
            aVar.c(s6, s5, string);
            Bundle bundle2 = new Bundle();
            bundle2.putString(ProtectedSandApp.s("ʞ\u0001"), ProtectedSandApp.s("ʟ\u0001"));
            bundle2.putString(ProtectedSandApp.s("ʠ\u0001"), ProtectedSandApp.s("ʡ\u0001"));
            bundle2.putString(ProtectedSandApp.s("ʢ\u0001"), string);
            aVar.b(s6, ProtectedSandApp.s("ʣ\u0001"), bundle2);
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
        return ProtectedSandApp.s("ʜ\u0001").equals(bundle.getString(ProtectedSandApp.s("ʤ\u0001")));
    }

    static boolean a() {
        Context n4;
        SharedPreferences sharedPreferences;
        String s4;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s5 = ProtectedSandApp.s("ʥ\u0001");
        try {
            com.google.firebase.g.p();
            n4 = com.google.firebase.g.p().n();
            sharedPreferences = n4.getSharedPreferences(ProtectedSandApp.s("ʙ\u0001"), 0);
            s4 = ProtectedSandApp.s("ʚ\u0001");
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains(s4)) {
            return sharedPreferences.getBoolean(s4, false);
        }
        PackageManager packageManager = n4.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n4.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(s5)) {
            return applicationInfo.metaData.getBoolean(s5, false);
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
        a.C0928a l4 = com.google.firebase.messaging.reporting.a.q().p(s(extras)).g(bVar).h(f(extras)).k(o()).n(a.d.ANDROID).j(m(extras)).l(k(extras));
        String h4 = h(extras);
        if (h4 != null) {
            l4.i(h4);
        }
        String r4 = r(extras);
        if (r4 != null) {
            l4.o(r4);
        }
        String string = extras.getString(ProtectedSandApp.s("ʦ\u0001"));
        if (string != null) {
            l4.e(string);
        }
        String string2 = extras.getString(ProtectedSandApp.s("ʌ\u0001"));
        if (string2 != null) {
            l4.b(string2);
        }
        String string3 = extras.getString(ProtectedSandApp.s("ʊ\u0001"));
        if (string3 != null) {
            l4.f(string3);
        }
        long q4 = q(extras);
        if (q4 > 0) {
            l4.m(q4);
        }
        return l4.a();
    }

    @androidx.annotation.q0
    static String c(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʦ\u0001"));
    }

    @androidx.annotation.q0
    static String d(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʈ\u0001"));
    }

    @androidx.annotation.q0
    static String e(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʊ\u0001"));
    }

    @androidx.annotation.o0
    static String f(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ʧ\u0001"));
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(com.google.firebase.installations.j.w(com.google.firebase.g.p()).a());
        } catch (InterruptedException | ExecutionException e4) {
            throw new RuntimeException(e4);
        }
    }

    @androidx.annotation.q0
    static String g(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʎ\u0001"));
    }

    @androidx.annotation.q0
    static String h(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ʨ\u0001"));
        return string == null ? bundle.getString(ProtectedSandApp.s("ʩ\u0001")) : string;
    }

    @androidx.annotation.q0
    static String i(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʌ\u0001"));
    }

    @androidx.annotation.o0
    private static int j(String str) {
        if (ProtectedSandApp.s("ʪ\u0001").equals(str)) {
            return 1;
        }
        return ProtectedSandApp.s("ʫ\u0001").equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int p4 = p(bundle);
        if (p4 == 2) {
            return 5;
        }
        return p4 == 1 ? 10 : 0;
    }

    @androidx.annotation.q0
    static String l(Bundle bundle) {
        return bundle.getString(ProtectedSandApp.s("ʑ\u0001"));
    }

    @androidx.annotation.o0
    static a.c m(Bundle bundle) {
        return (bundle == null || !q0.v(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    @androidx.annotation.o0
    static String n(Bundle bundle) {
        return (bundle == null || !q0.v(bundle)) ? ProtectedSandApp.s("ʭ\u0001") : ProtectedSandApp.s("ʬ\u0001");
    }

    @androidx.annotation.o0
    static String o() {
        return com.google.firebase.g.p().n().getPackageName();
    }

    @androidx.annotation.o0
    static int p(Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("ʮ\u0001"));
        if (string == null) {
            if (ProtectedSandApp.s("ʜ\u0001").equals(bundle.getString(ProtectedSandApp.s("ʯ\u0001")))) {
                return 2;
            }
            string = bundle.getString(ProtectedSandApp.s("ʰ\u0001"));
        }
        return j(string);
    }

    @androidx.annotation.q0
    static long q(Bundle bundle) {
        String s4 = ProtectedSandApp.s("ʱ\u0001");
        if (bundle.containsKey(s4)) {
            try {
                return Long.parseLong(bundle.getString(s4));
            } catch (NumberFormatException unused) {
            }
        }
        com.google.firebase.g p4 = com.google.firebase.g.p();
        String m4 = p4.s().m();
        if (m4 != null) {
            try {
                return Long.parseLong(m4);
            } catch (NumberFormatException unused2) {
            }
        }
        String j4 = p4.s().j();
        try {
            if (!j4.startsWith(ProtectedSandApp.s("ʲ\u0001"))) {
                return Long.parseLong(j4);
            }
            String[] split = j4.split(ProtectedSandApp.s("ʳ\u0001"));
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
        String string = bundle.getString(ProtectedSandApp.s("ʴ\u0001"));
        if (string == null || !string.startsWith(ProtectedSandApp.s("ʵ\u0001"))) {
            return null;
        }
        return string;
    }

    @androidx.annotation.o0
    static int s(Bundle bundle) {
        Object obj = bundle.get(ProtectedSandApp.s("ʶ\u0001"));
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
        String s4 = ProtectedSandApp.s("ʷ\u0001");
        if (bundle.containsKey(s4)) {
            return bundle.getString(s4);
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return ProtectedSandApp.s("ʸ\u0001").equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(ProtectedSandApp.s("ʹ\u0001"), intent.getExtras());
    }

    public static void w(Intent intent) {
        A(ProtectedSandApp.s("ʕ\u0001"), intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(ProtectedSandApp.s("ʺ\u0001"), bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(ProtectedSandApp.s("ʔ\u0001"), intent.getExtras());
        }
        if (D(intent)) {
            z(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.E());
        }
    }

    private static void z(a.b bVar, Intent intent, @androidx.annotation.q0 com.google.android.datatransport.m mVar) {
        com.google.firebase.messaging.reporting.a b5;
        if (mVar == null || (b5 = b(bVar, intent)) == null) {
            return;
        }
        try {
            mVar.b(ProtectedSandApp.s("ʼ\u0001"), com.google.firebase.messaging.reporting.b.class, com.google.android.datatransport.e.b(ProtectedSandApp.s("ʽ\u0001")), new m0()).b(com.google.android.datatransport.f.l(com.google.firebase.messaging.reporting.b.d().b(b5).a(), com.google.android.datatransport.i.b(Integer.valueOf(intent.getIntExtra(ProtectedSandApp.s("ʻ\u0001"), f60238f)))));
        } catch (RuntimeException unused) {
        }
    }
}
