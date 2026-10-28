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
import androidx.core.content.pm.r0;
import androidx.core.content.pm.x;
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
/* loaded from: classes3.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26037a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f26038b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f26039c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26040d = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f26043g = 96;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26044h = 48;

    /* renamed from: j, reason: collision with root package name */
    private static volatile r0<?> f26046j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile List<e> f26047k;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f26041e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f26042f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: i, reason: collision with root package name */
    public static final String f26045i = "android.intent.extra.shortcut.ID";

    /* renamed from: l, reason: collision with root package name */
    private static final String f26048l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m, reason: collision with root package name */
    private static final String f26049m = "androidx.core.content.pm.shortcut_listener_impl";

    /* compiled from: ShortcutManagerCompat.java */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntentSender f26050a;

        a(IntentSender intentSender) {
            this.f26050a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f26050a.sendIntent(context, 0, null, null, null);
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
            int i4 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i4) {
                    str = shortcutInfo.getId();
                    i4 = shortcutInfo.getRank();
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

    private p1() {
    }

    @androidx.annotation.m1
    static void A(List<e> list) {
        f26047k = list;
    }

    @androidx.annotation.m1
    static void B(r0<Void> r0Var) {
        f26046j = r0Var;
    }

    public static boolean C(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<x> list) {
        boolean updateShortcuts;
        List<x> w4 = w(list, 1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 29) {
            c(context, w4);
        }
        if (i4 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<x> it = w4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            updateShortcuts = d1.a(context.getSystemService(s0.a())).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        o(context).a(w4);
        Iterator<e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().d(list);
        }
        return true;
    }

    public static boolean a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<x> list) {
        boolean addDynamicShortcuts;
        List<x> w4 = w(list, 1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 29) {
            c(context, w4);
        }
        if (i4 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<x> it = w4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            addDynamicShortcuts = d1.a(context.getSystemService(s0.a())).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        o(context).a(w4);
        Iterator<e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
        return true;
    }

    @androidx.annotation.m1
    static boolean b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 x xVar) {
        Bitmap decodeStream;
        IconCompat iconCompat = xVar.f26065i;
        if (iconCompat == null) {
            return false;
        }
        int i4 = iconCompat.f26201a;
        if (i4 != 6 && i4 != 4) {
            return true;
        }
        InputStream D = iconCompat.D(context);
        if (D == null || (decodeStream = BitmapFactory.decodeStream(D)) == null) {
            return false;
        }
        xVar.f26065i = i4 == 6 ? IconCompat.o(decodeStream) : IconCompat.r(decodeStream);
        return true;
    }

    @androidx.annotation.m1
    static void c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<x> list) {
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (!b(context, xVar)) {
                list.remove(xVar);
            }
        }
    }

    @androidx.annotation.o0
    public static Intent d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 x xVar) {
        Intent createShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? d1.a(context.getSystemService(s0.a())).createShortcutResultIntent(xVar.H()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return xVar.a(createShortcutResultIntent);
    }

    public static void e(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list, @androidx.annotation.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            d1.a(context.getSystemService(s0.a())).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        Iterator<e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<x> list) {
        List<x> w4 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<x> it = w4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f26058b);
            }
            d1.a(context.getSystemService(s0.a())).enableShortcuts(arrayList);
        }
        o(context).a(w4);
        Iterator<e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @androidx.annotation.o0
    public static List<x> g(@androidx.annotation.o0 Context context) {
        List dynamicShortcuts;
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return o(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        dynamicShortcuts = d1.a(context.getSystemService(s0.a())).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new x.b(context, j.a(it.next())).c());
        }
        return arrayList;
    }

    private static int h(@androidx.annotation.o0 Context context, boolean z4) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (max * ((z4 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@androidx.annotation.o0 Context context) {
        int iconMaxHeight;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return h(context, false);
        }
        iconMaxHeight = d1.a(context.getSystemService(s0.a())).getIconMaxHeight();
        return iconMaxHeight;
    }

    public static int j(@androidx.annotation.o0 Context context) {
        int iconMaxWidth;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return h(context, true);
        }
        iconMaxWidth = d1.a(context.getSystemService(s0.a())).getIconMaxWidth();
        return iconMaxWidth;
    }

    public static int k(@androidx.annotation.o0 Context context) {
        int maxShortcutCountPerActivity;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return 5;
        }
        maxShortcutCountPerActivity = d1.a(context.getSystemService(s0.a())).getMaxShortcutCountPerActivity();
        return maxShortcutCountPerActivity;
    }

    @androidx.annotation.m1
    static List<e> l() {
        return f26047k;
    }

    private static String m(@androidx.annotation.o0 List<x> list) {
        int i4 = -1;
        String str = null;
        for (x xVar : list) {
            if (xVar.v() > i4) {
                str = xVar.k();
                i4 = xVar.v();
            }
        }
        return str;
    }

    private static List<e> n(Context context) {
        Bundle bundle;
        String string;
        if (f26047k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((e) Class.forName(string, false, p1.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f26047k == null) {
                f26047k = arrayList;
            }
        }
        return f26047k;
    }

    private static r0<?> o(Context context) {
        if (f26046j == null) {
            try {
                f26046j = (r0) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, p1.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f26046j == null) {
                f26046j = new r0.a();
            }
        }
        return f26046j;
    }

    @androidx.annotation.o0
    public static List<x> p(@androidx.annotation.o0 Context context, int i4) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            shortcuts = d1.a(context.getSystemService(s0.a())).getShortcuts(i4);
            return x.c(context, shortcuts);
        }
        if (i5 < 25) {
            if ((i4 & 2) != 0) {
                try {
                    return o(context).b();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
        ShortcutManager a5 = d1.a(context.getSystemService(s0.a()));
        ArrayList arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            manifestShortcuts = a5.getManifestShortcuts();
            arrayList.addAll(manifestShortcuts);
        }
        if ((i4 & 2) != 0) {
            dynamicShortcuts = a5.getDynamicShortcuts();
            arrayList.addAll(dynamicShortcuts);
        }
        if ((i4 & 4) != 0) {
            pinnedShortcuts = a5.getPinnedShortcuts();
            arrayList.addAll(pinnedShortcuts);
        }
        return x.c(context, arrayList);
    }

    public static boolean q(@androidx.annotation.o0 Context context) {
        boolean isRateLimitingActive;
        context.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            return p(context, 3).size() == k(context);
        }
        isRateLimitingActive = d1.a(context.getSystemService(s0.a())).isRateLimitingActive();
        return isRateLimitingActive;
    }

    public static boolean r(@androidx.annotation.o0 Context context) {
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            isRequestPinShortcutSupported = d1.a(context.getSystemService(s0.a())).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (androidx.core.content.d.checkSelfPermission(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
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

    public static boolean s(@androidx.annotation.o0 Context context, @androidx.annotation.o0 x xVar) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        context.getClass();
        xVar.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 32 && xVar.E(1)) {
            Iterator<e> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(xVar));
            }
            return true;
        }
        int k4 = k(context);
        if (k4 == 0) {
            return false;
        }
        if (i4 <= 29) {
            b(context, xVar);
        }
        if (i4 >= 30) {
            d1.a(context.getSystemService(s0.a())).pushDynamicShortcut(xVar.H());
        } else if (i4 >= 25) {
            ShortcutManager a5 = d1.a(context.getSystemService(s0.a()));
            isRateLimitingActive = a5.isRateLimitingActive();
            if (isRateLimitingActive) {
                return false;
            }
            dynamicShortcuts = a5.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= k4) {
                a5.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
            }
            a5.addDynamicShortcuts(Arrays.asList(xVar.H()));
        }
        r0<?> o4 = o(context);
        try {
            List<x> b5 = o4.b();
            if (b5.size() >= k4) {
                o4.d(Arrays.asList(m(b5)));
            }
            o4.a(Arrays.asList(xVar));
            Iterator<e> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(xVar));
            }
            x(context, xVar.k());
            return true;
        } catch (Exception unused) {
            Iterator<e> it3 = n(context).iterator();
            while (it3.hasNext()) {
                it3.next().b(Collections.singletonList(xVar));
            }
            x(context, xVar.k());
            return false;
        } catch (Throwable th) {
            Iterator<e> it4 = n(context).iterator();
            while (it4.hasNext()) {
                it4.next().b(Collections.singletonList(xVar));
            }
            x(context, xVar.k());
            throw th;
        }
    }

    public static void t(@androidx.annotation.o0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            d1.a(context.getSystemService(s0.a())).removeAllDynamicShortcuts();
        }
        o(context).c();
        Iterator<e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            d1.a(context.getSystemService(s0.a())).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        Iterator<e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        d1.a(context.getSystemService(s0.a())).removeLongLivedShortcuts(list);
        o(context).d(list);
        Iterator<e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    @androidx.annotation.o0
    private static List<x> w(@androidx.annotation.o0 List<x> list, int i4) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (x xVar : list) {
            if (xVar.E(i4)) {
                arrayList.remove(xVar);
            }
        }
        return arrayList;
    }

    public static void x(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            d1.a(context.getSystemService(s0.a())).reportShortcutUsed(str);
        }
        Iterator<e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@androidx.annotation.o0 Context context, @androidx.annotation.o0 x xVar, @androidx.annotation.q0 IntentSender intentSender) {
        boolean requestPinShortcut;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 32 && xVar.E(1)) {
            return false;
        }
        if (i4 >= 26) {
            requestPinShortcut = d1.a(context.getSystemService(s0.a())).requestPinShortcut(xVar.H(), intentSender);
            return requestPinShortcut;
        }
        if (!r(context)) {
            return false;
        }
        Intent a5 = xVar.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(a5);
            return true;
        }
        context.sendOrderedBroadcast(a5, null, new a(intentSender), null, -1, null, null);
        return true;
    }

    public static boolean z(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<x> list) {
        boolean dynamicShortcuts;
        context.getClass();
        list.getClass();
        List<x> w4 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w4.size());
            Iterator<x> it = w4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            dynamicShortcuts = d1.a(context.getSystemService(s0.a())).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        o(context).c();
        o(context).a(w4);
        for (e eVar : n(context)) {
            eVar.a();
            eVar.b(list);
        }
        return true;
    }
}
