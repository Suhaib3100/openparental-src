package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.c1;
import androidx.core.content.pm.u0;
import androidx.core.content.pm.v0;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: ShortcutManagerCompat.java */
/* loaded from: classes.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4545a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4546b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4547c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4548d = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f4551g = 96;

    /* renamed from: h, reason: collision with root package name */
    private static final int f4552h = 48;

    /* renamed from: j, reason: collision with root package name */
    private static volatile v0<?> f4554j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile List<l> f4555k;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f4549e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f4550f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: i, reason: collision with root package name */
    public static final String f4553i = "android.intent.extra.shortcut.ID";

    /* renamed from: l, reason: collision with root package name */
    private static final String f4556l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m, reason: collision with root package name */
    private static final String f4557m = "androidx.core.content.pm.shortcut_listener_impl";

    /* compiled from: ShortcutManagerCompat.java */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntentSender f4558a;

        a(IntentSender intentSender) {
            this.f4558a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f4558a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* compiled from: ShortcutManagerCompat.java */
    @androidx.annotation.x0(25)
    private static class b {
        private b() {
        }

        static String a(@androidx.annotation.o0 List<ShortcutInfo> list) {
            int rank;
            String id;
            int rank2;
            int i5 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                rank = shortcutInfo.getRank();
                if (rank > i5) {
                    id = shortcutInfo.getId();
                    rank2 = shortcutInfo.getRank();
                    str = id;
                    i5 = rank2;
                }
            }
            return str;
        }
    }

    /* compiled from: ShortcutManagerCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private r1() {
    }

    @androidx.annotation.m1
    static void A(List<l> list) {
        f4555k = list;
    }

    @androidx.annotation.m1
    static void B(v0<Void> v0Var) {
        f4554j = v0Var;
    }

    public static boolean C(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<u0> list) {
        boolean updateShortcuts;
        List<u0> w5 = w(list, 1);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 29) {
            c(context, w5);
        }
        if (i5 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<u0> it = w5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            updateShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        o(context).a(w5);
        Iterator<l> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().d(list);
        }
        return true;
    }

    public static boolean a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<u0> list) {
        boolean addDynamicShortcuts;
        List<u0> w5 = w(list, 1);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 29) {
            c(context, w5);
        }
        if (i5 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<u0> it = w5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            addDynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        o(context).a(w5);
        Iterator<l> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
        return true;
    }

    @androidx.annotation.m1
    static boolean b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 u0 u0Var) {
        Bitmap decodeStream;
        IconCompat iconCompat = u0Var.f4573i;
        if (iconCompat == null) {
            return false;
        }
        int i5 = iconCompat.f4713a;
        if (i5 != 6 && i5 != 4) {
            return true;
        }
        InputStream y5 = iconCompat.y(context);
        if (y5 == null || (decodeStream = BitmapFactory.decodeStream(y5)) == null) {
            return false;
        }
        u0Var.f4573i = i5 == 6 ? IconCompat.j(decodeStream) : IconCompat.m(decodeStream);
        return true;
    }

    @androidx.annotation.m1
    static void c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<u0> list) {
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            u0 u0Var = (u0) it.next();
            if (!b(context, u0Var)) {
                list.remove(u0Var);
            }
        }
    }

    @androidx.annotation.o0
    public static Intent d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 u0 u0Var) {
        Intent createShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(u0Var.H()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return u0Var.a(createShortcutResultIntent);
    }

    public static void e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list, @androidx.annotation.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<u0> list) {
        List<u0> w5 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<u0> it = w5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f4566b);
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        o(context).a(w5);
        Iterator<l> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @androidx.annotation.o0
    public static List<u0> g(@androidx.annotation.o0 Context context) {
        List dynamicShortcuts;
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return o(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new u0.a(context, (ShortcutInfo) it.next()).c());
        }
        return arrayList;
    }

    private static int h(@androidx.annotation.o0 Context context, boolean z5) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (max * ((z5 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@androidx.annotation.o0 Context context) {
        int iconMaxHeight;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return h(context, false);
        }
        iconMaxHeight = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
        return iconMaxHeight;
    }

    public static int j(@androidx.annotation.o0 Context context) {
        int iconMaxWidth;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return h(context, true);
        }
        iconMaxWidth = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
        return iconMaxWidth;
    }

    public static int k(@androidx.annotation.o0 Context context) {
        int maxShortcutCountPerActivity;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return 5;
        }
        maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        return maxShortcutCountPerActivity;
    }

    @androidx.annotation.m1
    static List<l> l() {
        return f4555k;
    }

    private static String m(@androidx.annotation.o0 List<u0> list) {
        int i5 = -1;
        String str = null;
        for (u0 u0Var : list) {
            if (u0Var.v() > i5) {
                str = u0Var.k();
                i5 = u0Var.v();
            }
        }
        return str;
    }

    private static List<l> n(Context context) {
        Bundle bundle;
        String string;
        if (f4555k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((l) Class.forName(string, false, r1.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f4555k == null) {
                f4555k = arrayList;
            }
        }
        return f4555k;
    }

    private static v0<?> o(Context context) {
        if (f4554j == null) {
            try {
                f4554j = (v0) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, r1.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f4554j == null) {
                f4554j = new v0.a();
            }
        }
        return f4554j;
    }

    @androidx.annotation.o0
    public static List<u0> p(@androidx.annotation.o0 Context context, int i5) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i5);
            return u0.c(context, shortcuts);
        }
        if (i6 < 25) {
            if ((i5 & 2) != 0) {
                try {
                    return o(context).b();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i5 & 1) != 0) {
            manifestShortcuts = shortcutManager.getManifestShortcuts();
            arrayList.addAll(manifestShortcuts);
        }
        if ((i5 & 2) != 0) {
            dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            arrayList.addAll(dynamicShortcuts);
        }
        if ((i5 & 4) != 0) {
            pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            arrayList.addAll(pinnedShortcuts);
        }
        return u0.c(context, arrayList);
    }

    public static boolean q(@androidx.annotation.o0 Context context) {
        boolean isRateLimitingActive;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return p(context, 3).size() == k(context);
        }
        isRateLimitingActive = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
        return isRateLimitingActive;
    }

    public static boolean r(@androidx.annotation.o0 Context context) {
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            isRequestPinShortcutSupported = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (androidx.core.content.d.a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(@androidx.annotation.o0 Context context, @androidx.annotation.o0 u0 u0Var) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        context.getClass();
        u0Var.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 31 && u0Var.E(1)) {
            Iterator<l> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(u0Var));
            }
            return true;
        }
        int k5 = k(context);
        if (k5 == 0) {
            return false;
        }
        if (i5 <= 29) {
            b(context, u0Var);
        }
        if (i5 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(u0Var.H());
        } else if (i5 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            isRateLimitingActive = shortcutManager.isRateLimitingActive();
            if (isRateLimitingActive) {
                return false;
            }
            dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= k5) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(u0Var.H()));
        }
        v0<?> o5 = o(context);
        try {
            List<u0> b6 = o5.b();
            if (b6.size() >= k5) {
                o5.d(Arrays.asList(m(b6)));
            }
            o5.a(Arrays.asList(u0Var));
            Iterator<l> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(u0Var));
            }
            x(context, u0Var.k());
            return true;
        } catch (Exception unused) {
            Iterator<l> it3 = n(context).iterator();
            while (it3.hasNext()) {
                it3.next().b(Collections.singletonList(u0Var));
            }
            x(context, u0Var.k());
            return false;
        } catch (Throwable th) {
            Iterator<l> it4 = n(context).iterator();
            while (it4.hasNext()) {
                it4.next().b(Collections.singletonList(u0Var));
            }
            x(context, u0Var.k());
            throw th;
        }
    }

    public static void t(@androidx.annotation.o0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        o(context).c();
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    @androidx.annotation.o0
    private static List<u0> w(@androidx.annotation.o0 List<u0> list, int i5) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (u0 u0Var : list) {
            if (u0Var.E(i5)) {
                arrayList.remove(u0Var);
            }
        }
        return arrayList;
    }

    public static void x(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@androidx.annotation.o0 Context context, @androidx.annotation.o0 u0 u0Var, @androidx.annotation.q0 IntentSender intentSender) {
        boolean requestPinShortcut;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 31 && u0Var.E(1)) {
            return false;
        }
        if (i5 >= 26) {
            requestPinShortcut = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(u0Var.H(), intentSender);
            return requestPinShortcut;
        }
        if (!r(context)) {
            return false;
        }
        Intent a6 = u0Var.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(a6);
            return true;
        }
        context.sendOrderedBroadcast(a6, null, new a(intentSender), null, -1, null, null);
        return true;
    }

    public static boolean z(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<u0> list) {
        boolean dynamicShortcuts;
        context.getClass();
        list.getClass();
        List<u0> w5 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w5.size());
            Iterator<u0> it = w5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        o(context).c();
        o(context).a(w5);
        for (l lVar : n(context)) {
            lVar.a();
            lVar.b(list);
        }
        return true;
    }
}
