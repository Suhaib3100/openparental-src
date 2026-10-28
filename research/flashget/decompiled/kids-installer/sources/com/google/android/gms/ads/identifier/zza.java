package com.google.android.gms.ads.identifier;

import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
final class zza extends Thread {
    final /* synthetic */ Map zza;

    zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zza = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.zza;
        Uri.Builder buildUpon = Uri.parse(ProtectedSandApp.s("য")).buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
