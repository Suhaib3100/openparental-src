package com.google.android.libraries.places.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzbi {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzas zzc;
    private final Context zzd;

    zzbi(Context context, zzas zzasVar) {
        this.zzd = context;
        this.zzc = zzasVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r10.contains(com.flashget.parentalcontrol.ProtectedSandApp.s("\ue839")) == false) goto L23;
     */
    @androidx.annotation.b1(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzhs zza(@androidx.annotation.q0 java.lang.String r14) {
        /*
            r13 = this;
            android.content.Context r14 = r13.zzd
            java.lang.String r0 = "\ue837"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.Object r14 = r14.getSystemService(r0)
            android.net.wifi.WifiManager r14 = (android.net.wifi.WifiManager) r14
            if (r14 == 0) goto Lb5
            boolean r0 = r14.isWifiEnabled()
            if (r0 != 0) goto L18
            goto Lb5
        L18:
            java.util.List r0 = r14.getScanResults()
            if (r0 == 0) goto Lb0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L26
            goto Lb0
        L26:
            com.google.android.libraries.places.internal.zzbh r1 = new java.util.Comparator() { // from class: com.google.android.libraries.places.internal.zzbh
                static {
                    /*
                        com.google.android.libraries.places.internal.zzbh r0 = new com.google.android.libraries.places.internal.zzbh
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.libraries.places.internal.zzbh) com.google.android.libraries.places.internal.zzbh.zza com.google.android.libraries.places.internal.zzbh
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbh.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbh.<init>():void");
                }

                @Override // java.util.Comparator
                public final int compare(java.lang.Object r2, java.lang.Object r3) {
                    /*
                        r1 = this;
                        android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                        android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
                        int r0 = com.google.android.libraries.places.internal.zzbi.zza
                        int r3 = r3.level
                        int r2 = r2.level
                        int r3 = r3 - r2
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbh.compare(java.lang.Object, java.lang.Object):int");
                }
            }
            com.google.android.libraries.places.internal.zzid r1 = com.google.android.libraries.places.internal.zzid.zza(r1)
            com.google.android.libraries.places.internal.zzhs r0 = com.google.android.libraries.places.internal.zzhs.zzp(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.wifi.WifiInfo r14 = r14.getConnectionInfo()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L3f:
            if (r4 >= r2) goto Lab
            java.lang.Object r5 = r0.get(r4)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            if (r5 == 0) goto La8
            java.lang.String r6 = r5.SSID
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L52
            goto La8
        L52:
            com.google.android.libraries.places.internal.zzas r6 = r13.zzc
            long r6 = r6.zza()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r5.timestamp
            long r6 = r6 - r8
            long r8 = com.google.android.libraries.places.internal.zzbi.zzb
            java.lang.String r10 = r5.SSID
            if (r10 == 0) goto L9c
            r11 = 95
            int r11 = r10.indexOf(r11)
            if (r11 >= 0) goto L6e
        L6c:
            r12 = r3
            goto L8d
        L6e:
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "\ue838"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)
            boolean r11 = r10.contains(r11)
            r12 = 1
            if (r11 != 0) goto L8d
            java.lang.String r11 = "\ue839"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L6c
        L8d:
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto La8
            if (r12 != 0) goto La8
            com.google.android.libraries.places.internal.zzbg r6 = new com.google.android.libraries.places.internal.zzbg
            r6.<init>(r14, r5)
            r1.add(r6)
            goto La8
        L9c:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "\ue83a"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r14.<init>(r0)
            throw r14
        La8:
            int r4 = r4 + 1
            goto L3f
        Lab:
            com.google.android.libraries.places.internal.zzhs r14 = com.google.android.libraries.places.internal.zzhs.zzk(r1)
            return r14
        Lb0:
            com.google.android.libraries.places.internal.zzhs r14 = com.google.android.libraries.places.internal.zzhs.zzm()
            return r14
        Lb5:
            com.google.android.libraries.places.internal.zzhs r14 = com.google.android.libraries.places.internal.zzhs.zzm()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbi.zza(java.lang.String):com.google.android.libraries.places.internal.zzhs");
    }
}
