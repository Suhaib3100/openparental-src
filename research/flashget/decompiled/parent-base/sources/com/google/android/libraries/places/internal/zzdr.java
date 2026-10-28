package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzdr {
    private final String zza;
    private final String zzb;
    private Locale zzc = null;
    private Map zzd = new HashMap();

    zzdr(String str, String str2) {
        this.zza = str;
        zzha.zze(!TextUtils.isEmpty(str2), ProtectedSandApp.s("\ue878"));
        this.zzb = str2;
    }

    final zzdr zza(Locale locale) {
        this.zzc = locale;
        return this;
    }

    final zzdr zzb(Map map) {
        this.zzd = new HashMap(map);
        return this;
    }

    public final String zzc() {
        Uri.Builder buildUpon = Uri.parse(ProtectedSandApp.s("\ue879")).buildUpon();
        buildUpon.appendEncodedPath(ProtectedSandApp.s("\ue87a"));
        buildUpon.appendEncodedPath(this.zza);
        buildUpon.appendQueryParameter(ProtectedSandApp.s("\ue87b"), this.zzb);
        Locale locale = this.zzc;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter(ProtectedSandApp.s("\ue87c"), languageTag);
            }
        }
        Map map = this.zzd;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }
}
