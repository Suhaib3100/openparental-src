package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzdm implements Runnable {
    zzdp zza;

    zzdm(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r2 = r1.zzd;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            java.lang.String r0 = "흅"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.android.gms.internal.play_billing.zzdp r1 = r11.zza
            if (r1 != 0) goto Lc
            goto L8e
        Lc:
            com.google.android.gms.internal.play_billing.zzdk r2 = com.google.android.gms.internal.play_billing.zzdp.zzr(r1)
            if (r2 == 0) goto L8e
            r3 = 0
            r11.zza = r3
            boolean r4 = r2.isDone()
            if (r4 == 0) goto L1f
            r1.zzj(r2)
            return
        L1f:
            r4 = 1
            java.util.concurrent.ScheduledFuture r5 = com.google.android.gms.internal.play_billing.zzdp.zzt(r1)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.play_billing.zzdp.zzu(r1, r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = "흆"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L57
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L55
            long r7 = r5.getDelay(r7)     // Catch: java.lang.Throwable -> L55
            long r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Throwable -> L55
            r9 = 10
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L55
            r5.append(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "흇"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L55
            r5.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L81
        L57:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            r5.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = "흈"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L55
            r5.append(r7)     // Catch: java.lang.Throwable -> L55
            r5.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.play_billing.zzdn r5 = new com.google.android.gms.internal.play_billing.zzdn     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r0, r3)     // Catch: java.lang.Throwable -> L7f
            r1.zzi(r5)     // Catch: java.lang.Throwable -> L7f
            r2.cancel(r4)
            return
        L7f:
            r0 = move-exception
            goto L8a
        L81:
            com.google.android.gms.internal.play_billing.zzdn r5 = new com.google.android.gms.internal.play_billing.zzdn     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7f
            r1.zzi(r5)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L8a:
            r2.cancel(r4)
            throw r0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdm.run():void");
    }
}
