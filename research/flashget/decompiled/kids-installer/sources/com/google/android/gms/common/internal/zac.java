package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.i;
import androidx.core.os.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zac {

    @GuardedBy("sCache")
    private static final i<String, String> zaa = new i<>();

    @q0
    @GuardedBy("sCache")
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

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    @o0
    public static String zac(Context context, int i5) {
        Resources resources = context.getResources();
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
    }

    @o0
    public static String zad(Context context, int i5) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i5 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, zaa2);
        }
        if (i5 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, zaa2);
        }
        if (i5 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, zaa2);
        }
        if (i5 == 5) {
            return zah(context, ProtectedSandApp.s("\u0ba7"), zaa2);
        }
        if (i5 == 7) {
            return zah(context, ProtectedSandApp.s("\u0ba6"), zaa2);
        }
        if (i5 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, zaa2);
        }
        if (i5 == 20) {
            return zah(context, ProtectedSandApp.s("\u0ba5"), zaa2);
        }
        switch (i5) {
            case 16:
                return zah(context, ProtectedSandApp.s("த"), zaa2);
            case 17:
                return zah(context, ProtectedSandApp.s("ண"), zaa2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, zaa2);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
        }
    }

    @o0
    public static String zae(Context context, int i5) {
        return (i5 == 6 || i5 == 19) ? zah(context, ProtectedSandApp.s("ந"), zaa(context)) : zad(context, i5);
    }

    @o0
    public static String zaf(Context context, int i5) {
        String zai = i5 == 6 ? zai(context, ProtectedSandApp.s("ன")) : zag(context, i5);
        return zai == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : zai;
    }

    @q0
    public static String zag(Context context, int i5) {
        Resources resources = context.getResources();
        if (i5 == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i5 == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i5 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i5 == 5) {
            return zai(context, ProtectedSandApp.s("\u0bad"));
        }
        if (i5 == 7) {
            return zai(context, ProtectedSandApp.s("\u0bac"));
        }
        if (i5 == 17) {
            return zai(context, ProtectedSandApp.s("\u0bab"));
        }
        if (i5 != 20) {
            return null;
        }
        return zai(context, ProtectedSandApp.s("ப"));
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, str2);
    }

    @q0
    private static String zai(Context context, String str) {
        i<String, String> iVar = zaa;
        synchronized (iVar) {
            Locale d6 = d.a(context.getResources().getConfiguration()).d(0);
            if (!d6.equals(zab)) {
                iVar.clear();
                zab = d6;
            }
            String str2 = iVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, ProtectedSandApp.s("ம"), ProtectedSandApp.s("ய"));
            if (identifier == 0) {
                String s5 = ProtectedSandApp.s("ர");
                if (str.length() != 0) {
                    s5.concat(str);
                }
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                iVar.put(str, string);
                return string;
            }
            String s6 = ProtectedSandApp.s("ற");
            if (str.length() != 0) {
                s6.concat(str);
            }
            return null;
        }
    }
}
