package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.x1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    private static final int f17147h = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final String f17140a = ProtectedSandApp.s("᜴");

    /* renamed from: b, reason: collision with root package name */
    public static final String f17141b = ProtectedSandApp.s("᜵");

    /* renamed from: c, reason: collision with root package name */
    public static final String f17142c = ProtectedSandApp.s("᜶");

    /* renamed from: d, reason: collision with root package name */
    public static final String f17143d = ProtectedSandApp.s("\u1737");

    /* renamed from: e, reason: collision with root package name */
    public static final String f17144e = ProtectedSandApp.s("\u1738");

    /* renamed from: f, reason: collision with root package name */
    private static final String f17145f = ProtectedSandApp.s("\u1739");

    /* renamed from: g, reason: collision with root package name */
    private static final String f17146g = ProtectedSandApp.s("\u173a");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f17148i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final x1.g f17149a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17150b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17151c;

        a(x1.g gVar, String str, int i5) {
            this.f17149a = gVar;
            this.f17150b = str;
            this.f17151c = i5;
        }
    }

    private d() {
    }

    @androidx.annotation.q0
    private static PendingIntent a(Context context, l0 l0Var, String str, PackageManager packageManager) {
        Intent f6 = f(str, l0Var, packageManager);
        if (f6 == null) {
            return null;
        }
        f6.addFlags(67108864);
        f6.putExtras(l0Var.A());
        if (q(l0Var)) {
            f6.putExtra(ProtectedSandApp.s("\u173b"), l0Var.z());
        }
        return PendingIntent.getActivity(context, g(), f6, 1140850688);
    }

    @androidx.annotation.q0
    private static PendingIntent b(Context context, Context context2, l0 l0Var) {
        if (q(l0Var)) {
            return c(context, context2, new Intent(ProtectedSandApp.s("\u173c")).putExtras(l0Var.z()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent(ProtectedSandApp.s("\u173d")).setComponent(new ComponentName(context2, ProtectedSandApp.s("\u173e"))).putExtra(ProtectedSandApp.s("\u173f"), intent), 1140850688);
    }

    public static a d(Context context, Context context2, l0 l0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        x1.g gVar = new x1.g(context2, str);
        String n5 = l0Var.n(resources, packageName, ProtectedSandApp.s("ᝀ"));
        if (!TextUtils.isEmpty(n5)) {
            gVar.P(n5);
        }
        String n6 = l0Var.n(resources, packageName, ProtectedSandApp.s("ᝁ"));
        if (!TextUtils.isEmpty(n6)) {
            gVar.O(n6);
            gVar.z0(new x1.e().A(n6));
        }
        gVar.t0(m(packageManager, resources, packageName, l0Var.p(ProtectedSandApp.s("ᝂ")), bundle));
        Uri n7 = n(packageName, l0Var, resources);
        if (n7 != null) {
            gVar.x0(n7);
        }
        gVar.N(a(context, l0Var, packageName, packageManager));
        PendingIntent b6 = b(context, context2, l0Var);
        if (b6 != null) {
            gVar.U(b6);
        }
        Integer h5 = h(context2, l0Var.p(ProtectedSandApp.s("ᝃ")), bundle);
        if (h5 != null) {
            gVar.J(h5.intValue());
        }
        gVar.D(!l0Var.a(ProtectedSandApp.s("ᝄ")));
        gVar.e0(l0Var.a(ProtectedSandApp.s("ᝅ")));
        String p5 = l0Var.p(ProtectedSandApp.s("ᝆ"));
        if (p5 != null) {
            gVar.B0(p5);
        }
        Integer m5 = l0Var.m();
        if (m5 != null) {
            gVar.k0(m5.intValue());
        }
        Integer r5 = l0Var.r();
        if (r5 != null) {
            gVar.G0(r5.intValue());
        }
        Integer l5 = l0Var.l();
        if (l5 != null) {
            gVar.h0(l5.intValue());
        }
        Long j5 = l0Var.j(ProtectedSandApp.s("ᝇ"));
        if (j5 != null) {
            gVar.r0(true);
            gVar.H0(j5.longValue());
        }
        long[] q5 = l0Var.q();
        if (q5 != null) {
            gVar.F0(q5);
        }
        int[] e6 = l0Var.e();
        if (e6 != null) {
            gVar.d0(e6[0], e6[1], e6[2]);
        }
        gVar.T(i(l0Var));
        return new a(gVar, o(l0Var), 0);
    }

    static a e(Context context, l0 l0Var) {
        Bundle j5 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, l0Var, k(context, l0Var.k(), j5), j5);
    }

    private static Intent f(String str, l0 l0Var, PackageManager packageManager) {
        String p5 = l0Var.p(ProtectedSandApp.s("ᝈ"));
        if (!TextUtils.isEmpty(p5)) {
            Intent intent = new Intent(p5);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f6 = l0Var.f();
        if (f6 == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("ᝉ"));
        intent2.setPackage(str);
        intent2.setData(f6);
        return intent2;
    }

    private static int g() {
        return f17148i.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i5 = bundle.getInt(ProtectedSandApp.s("ᝊ"), 0);
        if (i5 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.d.f(context, i5));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int i(l0 l0Var) {
        boolean a6 = l0Var.a(ProtectedSandApp.s("ᝋ"));
        ?? r02 = a6;
        if (l0Var.a(ProtectedSandApp.s("ᝌ"))) {
            r02 = (a6 ? 1 : 0) | 2;
        }
        return l0Var.a(ProtectedSandApp.s("ᝍ")) ? r02 | 4 : r02;
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
        } catch (PackageManager.NameNotFoundException e6) {
            e6.toString();
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @androidx.annotation.m1
    public static String k(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString(ProtectedSandApp.s("ᝎ"));
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            String s5 = ProtectedSandApp.s("ᝏ");
            if (notificationManager.getNotificationChannel(s5) == null) {
                int identifier = context.getResources().getIdentifier(ProtectedSandApp.s("ᝑ"), ProtectedSandApp.s("ᝐ"), context.getPackageName());
                notificationManager.createNotificationChannel(new NotificationChannel(s5, identifier == 0 ? ProtectedSandApp.s("ᝒ") : context.getString(identifier), 3));
            }
            return s5;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i5) {
        return i5 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, ProtectedSandApp.s("ᝓ"), str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, ProtectedSandApp.s("\u1754"), str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
        }
        int i5 = bundle.getInt(ProtectedSandApp.s("\u1755"), 0);
        if (i5 == 0 || !p(resources, i5)) {
            try {
                i5 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e6) {
                e6.toString();
            }
        }
        return (i5 == 0 || !p(resources, i5)) ? R.drawable.sym_def_app_icon : i5;
    }

    private static Uri n(String str, l0 l0Var, Resources resources) {
        String o5 = l0Var.o();
        if (TextUtils.isEmpty(o5)) {
            return null;
        }
        if (ProtectedSandApp.s("\u1756").equals(o5) || resources.getIdentifier(o5, ProtectedSandApp.s("\u1757"), str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse(ProtectedSandApp.s("\u1758") + str + ProtectedSandApp.s("\u1759") + o5);
    }

    private static String o(l0 l0Var) {
        String p5 = l0Var.p(ProtectedSandApp.s("\u175a"));
        if (!TextUtils.isEmpty(p5)) {
            return p5;
        }
        return ProtectedSandApp.s("\u175b") + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i5) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i5, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    static boolean q(@androidx.annotation.o0 l0 l0Var) {
        return l0Var.a(ProtectedSandApp.s("\u175c"));
    }
}
