package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import androidx.core.os.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zac {

    @g9.a("cache")
    private static final a3 zaa = new a3();

    @q0
    @g9.a("cache")
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @o0
    public static String zab(Context context, int i4) {
        Resources resources = context.getResources();
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    @o0
    public static String zac(Context context, int i4) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i4 == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa2);
        }
        if (i4 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa2);
        }
        if (i4 == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa2);
        }
        if (i4 == 5) {
            return zag(context, ProtectedSandApp.s("쬧"), zaa2);
        }
        if (i4 == 7) {
            return zag(context, ProtectedSandApp.s("쬦"), zaa2);
        }
        if (i4 == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa2);
        }
        if (i4 == 20) {
            return zag(context, ProtectedSandApp.s("쬥"), zaa2);
        }
        switch (i4) {
            case 16:
                return zag(context, ProtectedSandApp.s("쬤"), zaa2);
            case 17:
                return zag(context, ProtectedSandApp.s("쬣"), zaa2);
            case 18:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa2);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
        }
    }

    @o0
    public static String zad(Context context, int i4) {
        if (i4 != 6 && i4 != 19) {
            return zac(context, i4);
        }
        return zag(context, ProtectedSandApp.s("쬨"), zaa(context));
    }

    @o0
    public static String zae(Context context, int i4) {
        String zah = i4 == 6 ? zah(context, ProtectedSandApp.s("쬩")) : zaf(context, i4);
        return zah == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : zah;
    }

    @q0
    public static String zaf(Context context, int i4) {
        Resources resources = context.getResources();
        if (i4 == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
        }
        if (i4 == 2) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
        }
        if (i4 == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
        }
        if (i4 == 5) {
            return zah(context, ProtectedSandApp.s("쬭"));
        }
        if (i4 == 7) {
            return zah(context, ProtectedSandApp.s("쬬"));
        }
        if (i4 == 17) {
            return zah(context, ProtectedSandApp.s("쬫"));
        }
        if (i4 != 20) {
            return null;
        }
        return zah(context, ProtectedSandApp.s("쬪"));
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zah = zah(context, str);
        if (zah == null) {
            zah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zah, str2);
    }

    @q0
    private static String zah(Context context, String str) {
        a3 a3Var = zaa;
        synchronized (a3Var) {
            try {
                Locale d5 = g.a(context.getResources().getConfiguration()).d(0);
                if (!d5.equals(zab)) {
                    a3Var.clear();
                    zab = d5;
                }
                String str2 = (String) a3Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, ProtectedSandApp.s("쬮"), ProtectedSandApp.s("쬯"));
                if (identifier == 0) {
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                a3Var.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
