package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import zc.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;

    @h
    private static volatile zzda zze;
    private static volatile boolean zzf;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(new Object() { // from class: com.google.android.gms.internal.auth.zzcu
    });
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z4, zzdb zzdbVar) {
        if (zzczVar.zza == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("켊"));
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzd(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.auth.zzda r0 = com.google.android.gms.internal.auth.zzdc.zze
            if (r0 != 0) goto L4b
            if (r3 != 0) goto L7
            goto L4b
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzdc.zza
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r1 == r3) goto L41
            goto L23
        L21:
            r3 = move-exception
            goto L43
        L23:
            com.google.android.gms.internal.auth.zzcg.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdd.zzc()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzco.zze()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzct r1 = new com.google.android.gms.internal.auth.zzct     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdj r1 = com.google.android.gms.internal.auth.zzdo.zza(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzcd r2 = new com.google.android.gms.internal.auth.zzcd     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdc.zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.auth.zzdc.zzi     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzd(android.content.Context):void");
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:12:0x003f, B:14:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x0078, B:22:0x0080, B:24:0x0088, B:26:0x008e, B:29:0x00a0, B:31:0x00a6, B:32:0x009e, B:34:0x00ac, B:36:0x00b0, B:39:0x00b8, B:40:0x00bb, B:41:0x00bf, B:44:0x006c, B:45:0x00c4, B:46:0x00c9, B:49:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:12:0x003f, B:14:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x0078, B:22:0x0080, B:24:0x0088, B:26:0x008e, B:29:0x00a0, B:31:0x00a6, B:32:0x009e, B:34:0x00ac, B:36:0x00b0, B:39:0x00b8, B:40:0x00bb, B:41:0x00bf, B:44:0x006c, B:45:0x00c4, B:46:0x00c9, B:49:0x00ca), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.auth.zzdc.zzi
            int r0 = r0.get()
            int r1 = r8.zzk
            if (r1 >= r0) goto Lce
            monitor-enter(r8)
            int r1 = r8.zzk     // Catch: java.lang.Throwable -> L3b
            if (r1 >= r0) goto Lca
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdh r2 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            if (r1 == 0) goto L3e
            com.google.android.gms.internal.auth.zzdj r2 = r1.zzb()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdh r2 = (com.google.android.gms.internal.auth.zzdh) r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r2.zzb()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r2.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzci r4 = (com.google.android.gms.internal.auth.zzci) r4     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r8.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            goto Lcc
        L3e:
            r4 = r3
        L3f:
            java.lang.String r5 = "켋"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lc4
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r5 = r5.zza     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L6c
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = com.google.android.gms.internal.auth.zzcq.zza(r6, r5)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L6a
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r6 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r6.zza     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcs r7 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                static {
                    /*
                        com.google.android.gms.internal.auth.zzcs r0 = new com.google.android.gms.internal.auth.zzcs
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.auth.zzcs) com.google.android.gms.internal.auth.zzcs.zza com.google.android.gms.internal.auth.zzcs
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.auth.zzdc.zzc()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.run():void");
                }
            }     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcg r5 = com.google.android.gms.internal.auth.zzcg.zza(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            goto L76
        L6a:
            r5 = r3
            goto L76
        L6c:
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcs r6 = com.google.android.gms.internal.auth.zzcs.zza     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdd r5 = com.google.android.gms.internal.auth.zzdd.zza(r5, r3, r6)     // Catch: java.lang.Throwable -> L3b
        L76:
            if (r5 == 0) goto L85
            java.lang.String r6 = r8.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L85
            java.lang.Object r5 = r8.zza(r5)     // Catch: java.lang.Throwable -> L3b
            goto L86
        L85:
            r5 = r3
        L86:
            if (r5 != 0) goto Lb0
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto Laa
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzco r1 = com.google.android.gms.internal.auth.zzco.zza(r1)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L9e
            r5 = r3
            goto La0
        L9e:
            java.lang.String r5 = r8.zzc     // Catch: java.lang.Throwable -> L3b
        La0:
            java.lang.String r1 = r1.zzb(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Laa
            java.lang.Object r3 = r8.zza(r1)     // Catch: java.lang.Throwable -> L3b
        Laa:
            if (r3 != 0) goto Laf
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> L3b
            goto Lb0
        Laf:
            r5 = r3
        Lb0:
            boolean r1 = r2.zzb()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lbf
            if (r4 != 0) goto Lbb
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> L3b
            goto Lbf
        Lbb:
            java.lang.Object r5 = r8.zza(r4)     // Catch: java.lang.Throwable -> L3b
        Lbf:
            r8.zzl = r5     // Catch: java.lang.Throwable -> L3b
            r8.zzk = r0     // Catch: java.lang.Throwable -> L3b
            goto Lca
        Lc4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        Lca:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            goto Lce
        Lcc:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            throw r0
        Lce:
            java.lang.Object r0 = r8.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzb():java.lang.Object");
    }
}
