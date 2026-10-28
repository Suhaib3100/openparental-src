package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.d0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final int f60022h = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final String f60015a = ProtectedSandApp.s("Ƶ\u0001");

    /* renamed from: b, reason: collision with root package name */
    public static final String f60016b = ProtectedSandApp.s("ƶ\u0001");

    /* renamed from: c, reason: collision with root package name */
    public static final String f60017c = ProtectedSandApp.s("Ʒ\u0001");

    /* renamed from: d, reason: collision with root package name */
    public static final String f60018d = ProtectedSandApp.s("Ƹ\u0001");

    /* renamed from: e, reason: collision with root package name */
    public static final String f60019e = ProtectedSandApp.s("ƹ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f60020f = ProtectedSandApp.s("ƺ\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f60021g = ProtectedSandApp.s("ƻ\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f60023i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final d0.n f60024a;

        /* renamed from: b, reason: collision with root package name */
        public final String f60025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f60026c;

        a(d0.n nVar, String str, int i4) {
            this.f60024a = nVar;
            this.f60025b = str;
            this.f60026c = i4;
        }
    }

    private e() {
    }

    @androidx.annotation.q0
    private static PendingIntent a(Context context, q0 q0Var, String str, PackageManager packageManager) {
        Intent f4 = f(str, q0Var, packageManager);
        if (f4 == null) {
            return null;
        }
        f4.addFlags(androidx.core.view.accessibility.b.f26943s);
        f4.putExtras(q0Var.A());
        if (q0Var.a(ProtectedSandApp.s("Ƽ\u0001"))) {
            f4.putExtra(ProtectedSandApp.s("ƽ\u0001"), q0Var.z());
        }
        return PendingIntent.getActivity(context, f60023i.incrementAndGet(), f4, 1140850688);
    }

    @androidx.annotation.q0
    private static PendingIntent b(Context context, Context context2, q0 q0Var) {
        if (q0Var.a(ProtectedSandApp.s("Ƽ\u0001"))) {
            return c(context, context2, new Intent(ProtectedSandApp.s("ƾ\u0001")).putExtras(q0Var.z()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, f60023i.incrementAndGet(), new Intent(ProtectedSandApp.s("ƻ\u0001")).setPackage(context2.getPackageName()).putExtra(ProtectedSandApp.s("ƿ\u0001"), intent), 1140850688);
    }

    public static a d(Context context, Context context2, q0 q0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        d0.n nVar = new d0.n(context2, str);
        String n4 = q0Var.n(resources, packageName, ProtectedSandApp.s("ǀ\u0001"));
        if (!TextUtils.isEmpty(n4)) {
            nVar.O(n4);
        }
        String n5 = q0Var.n(resources, packageName, ProtectedSandApp.s("ǁ\u0001"));
        if (!TextUtils.isEmpty(n5)) {
            nVar.N(n5);
            nVar.z0(new d0.l().A(n5));
        }
        nVar.t0(m(packageManager, resources, packageName, q0Var.p(ProtectedSandApp.s("ǂ\u0001")), bundle));
        Uri n6 = n(packageName, q0Var, resources);
        if (n6 != null) {
            nVar.x0(n6);
        }
        nVar.M(a(context, q0Var, packageName, packageManager));
        PendingIntent b5 = b(context, context2, q0Var);
        if (b5 != null) {
            nVar.T(b5);
        }
        Integer h4 = h(context2, q0Var.p(ProtectedSandApp.s("ǃ\u0001")), bundle);
        if (h4 != null) {
            nVar.I(h4.intValue());
        }
        nVar.C(!q0Var.a(ProtectedSandApp.s("Ǆ\u0001")));
        nVar.e0(q0Var.a(ProtectedSandApp.s("ǅ\u0001")));
        String p4 = q0Var.p(ProtectedSandApp.s("ǆ\u0001"));
        if (p4 != null) {
            nVar.B0(p4);
        }
        Integer m4 = q0Var.m();
        if (m4 != null) {
            nVar.k0(m4.intValue());
        }
        Integer r4 = q0Var.r();
        if (r4 != null) {
            nVar.G0(r4.intValue());
        }
        Integer l4 = q0Var.l();
        if (l4 != null) {
            nVar.h0(l4.intValue());
        }
        Long j4 = q0Var.j(ProtectedSandApp.s("Ǉ\u0001"));
        if (j4 != null) {
            nVar.r0(true);
            nVar.H0(j4.longValue());
        }
        long[] q4 = q0Var.q();
        if (q4 != null) {
            nVar.F0(q4);
        }
        int[] e4 = q0Var.e();
        if (e4 != null) {
            nVar.d0(e4[0], e4[1], e4[2]);
        }
        nVar.S(i(q0Var));
        return new a(nVar, o(q0Var), 0);
    }

    static a e(Context context, q0 q0Var) {
        Bundle j4 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, q0Var, k(context, q0Var.k(), j4), j4);
    }

    private static Intent f(String str, q0 q0Var, PackageManager packageManager) {
        String p4 = q0Var.p(ProtectedSandApp.s("ǈ\u0001"));
        if (!TextUtils.isEmpty(p4)) {
            Intent intent = new Intent(p4);
            intent.setPackage(str);
            intent.setFlags(ClientDefaults.MAX_MSG_SIZE);
            return intent;
        }
        Uri f4 = q0Var.f();
        if (f4 == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("ǉ\u0001"));
        intent2.setPackage(str);
        intent2.setData(f4);
        return intent2;
    }

    private static int g() {
        return f60023i.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i4 = bundle.getInt(ProtectedSandApp.s("Ƶ\u0001"), 0);
        if (i4 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.d.getColor(context, i4));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int i(q0 q0Var) {
        boolean a5 = q0Var.a(ProtectedSandApp.s("Ǌ\u0001"));
        ?? r02 = a5;
        if (q0Var.a(ProtectedSandApp.s("ǋ\u0001"))) {
            r02 = (a5 ? 1 : 0) | 2;
        }
        return q0Var.a(ProtectedSandApp.s("ǌ\u0001")) ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e4.toString();
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @androidx.annotation.m1
    public static String k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
            }
            String string = bundle.getString(ProtectedSandApp.s("Ʒ\u0001"));
            if (!TextUtils.isEmpty(string)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string);
                if (notificationChannel2 != null) {
                    return string;
                }
            }
            String s4 = ProtectedSandApp.s("Ƹ\u0001");
            notificationChannel = notificationManager.getNotificationChannel(s4);
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier(ProtectedSandApp.s("ƹ\u0001"), ProtectedSandApp.s("Ǎ\u0001"), context.getPackageName());
                com.flashget.kid.common.ui.notification.c.a(notificationManager, com.flashget.kid.common.ui.notification.g.a(s4, identifier == 0 ? ProtectedSandApp.s("ƺ\u0001") : context.getString(identifier), 3));
            }
            return s4;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i4) {
        return i4 | androidx.core.view.accessibility.b.f26943s;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, ProtectedSandApp.s("ǎ\u0001"), str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, ProtectedSandApp.s("Ǐ\u0001"), str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
        }
        int i4 = bundle.getInt(ProtectedSandApp.s("ƶ\u0001"), 0);
        if (i4 == 0 || !p(resources, i4)) {
            try {
                i4 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                e4.toString();
            }
        }
        return (i4 == 0 || !p(resources, i4)) ? R.drawable.sym_def_app_icon : i4;
    }

    private static Uri n(String str, q0 q0Var, Resources resources) {
        String o4 = q0Var.o();
        if (TextUtils.isEmpty(o4)) {
            return null;
        }
        if (ProtectedSandApp.s("ǐ\u0001").equals(o4) || resources.getIdentifier(o4, ProtectedSandApp.s("Ǒ\u0001"), str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse(ProtectedSandApp.s("ǒ\u0001") + str + ProtectedSandApp.s("Ǔ\u0001") + o4);
    }

    private static String o(q0 q0Var) {
        String p4 = q0Var.p(ProtectedSandApp.s("ǔ\u0001"));
        if (!TextUtils.isEmpty(p4)) {
            return p4;
        }
        return ProtectedSandApp.s("Ǖ\u0001") + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i4) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !d.a(resources.getDrawable(i4, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    static boolean q(@androidx.annotation.o0 q0 q0Var) {
        return q0Var.a(ProtectedSandApp.s("Ƽ\u0001"));
    }
}
