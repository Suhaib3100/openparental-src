package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzbg {

    @q0
    private final String zza;
    private final int zzb;
    private final zzbf zzc;
    private final boolean zzd;
    private final int zze;

    public zzbg(@q0 WifiInfo wifiInfo, ScanResult scanResult) {
        zzbf zzbfVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i4 = scanResult.level;
        int i5 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzbfVar = zzbf.zzd;
        } else {
            String upperCase = str2.toUpperCase();
            zzbfVar = (upperCase.equals(ProtectedSandApp.s("\ue833")) || upperCase.equals(ProtectedSandApp.s("\ue834"))) ? zzbf.zza : upperCase.matches(ProtectedSandApp.s("\ue835")) ? zzbf.zzb : upperCase.matches(ProtectedSandApp.s("\ue836")) ? zzbf.zzc : zzbf.zzd;
        }
        boolean z4 = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z4 = true;
        }
        this.zza = str;
        this.zzb = i4;
        this.zzc = zzbfVar;
        this.zzd = z4;
        this.zze = i5;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzbf zzc() {
        return this.zzc;
    }

    @q0
    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
