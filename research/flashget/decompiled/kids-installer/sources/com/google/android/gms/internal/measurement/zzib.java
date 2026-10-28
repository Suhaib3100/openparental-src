package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhz zze;
    private static volatile boolean zzf;
    final zzhy zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(new Object() { // from class: com.google.android.gms.internal.measurement.zzht
    });
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj, boolean z5, zzia zziaVar) {
        if (zzhyVar.zza == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ණ"));
        }
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    zzhz zzhzVar = zze;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhzVar == null || zzhzVar.zza() != context) {
                        zzhf.zze();
                        zzic.zzc();
                        zzhn.zze();
                        zze = new zzhc(context, zzir.zza(new zzim() { // from class: com.google.android.gms.internal.measurement.zzhs
                            @Override // com.google.android.gms.internal.measurement.zzim
                            public final Object zza() {
                                Context context2 = context;
                                int i5 = zzib.zzc;
                                return zzho.zza(context2);
                            }
                        }));
                        zzi.incrementAndGet();
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:18:0x0054, B:20:0x0075, B:22:0x007d, B:24:0x0085, B:26:0x008b, B:29:0x009d, B:31:0x00a3, B:32:0x009b, B:34:0x00a9, B:36:0x00ad, B:39:0x00b5, B:40:0x00b8, B:41:0x00bc, B:44:0x0069, B:45:0x00c1, B:46:0x00c6, B:49:0x00c7), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:18:0x0054, B:20:0x0075, B:22:0x007d, B:24:0x0085, B:26:0x008b, B:29:0x009d, B:31:0x00a3, B:32:0x009b, B:34:0x00a9, B:36:0x00ad, B:39:0x00b5, B:40:0x00b8, B:41:0x00bc, B:44:0x0069, B:45:0x00c1, B:46:0x00c6, B:49:0x00c7), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzib.zzi
            int r0 = r0.get()
            int r1 = r8.zzk
            if (r1 >= r0) goto Lcc
            monitor-enter(r8)
            int r1 = r8.zzk     // Catch: java.lang.Throwable -> Lc9
            if (r1 >= r0) goto Lc7
            com.google.android.gms.internal.measurement.zzhz r1 = com.google.android.gms.internal.measurement.zzib.zze     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzii r2 = com.google.android.gms.internal.measurement.zzii.zzc()     // Catch: java.lang.Throwable -> Lc9
            r3 = 0
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.measurement.zzim r2 = r1.zzb()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzii r2 = (com.google.android.gms.internal.measurement.zzii) r2     // Catch: java.lang.Throwable -> Lc9
            boolean r4 = r2.zzb()     // Catch: java.lang.Throwable -> Lc9
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.zza()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhh r4 = (com.google.android.gms.internal.measurement.zzhh) r4     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhy r5 = r8.zza     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = r8.zzb     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> Lc9
            goto L3c
        L3b:
            r4 = r3
        L3c:
            java.lang.String r5 = "ඬ"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lc1
            com.google.android.gms.internal.measurement.zzhy r5 = r8.zza     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r5 = r5.zza     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L69
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = com.google.android.gms.internal.measurement.zzhp.zza(r6, r5)     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L67
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> Lc9
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhy r6 = r8.zza     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r6 = r6.zza     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhr r7 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                static {
                    /*
                        com.google.android.gms.internal.measurement.zzhr r0 = new com.google.android.gms.internal.measurement.zzhr
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.internal.measurement.zzhr.zza com.google.android.gms.internal.measurement.zzhr
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.measurement.zzib.zzc()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.run():void");
                }
            }     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhf r5 = com.google.android.gms.internal.measurement.zzhf.zza(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc9
            goto L73
        L67:
            r5 = r3
            goto L73
        L69:
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhr r6 = com.google.android.gms.internal.measurement.zzhr.zza     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzic r5 = com.google.android.gms.internal.measurement.zzic.zza(r5, r3, r6)     // Catch: java.lang.Throwable -> Lc9
        L73:
            if (r5 == 0) goto L82
            java.lang.String r6 = r8.zzb     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r5 = r5.zzb(r6)     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L82
            java.lang.Object r5 = r8.zza(r5)     // Catch: java.lang.Throwable -> Lc9
            goto L83
        L82:
            r5 = r3
        L83:
            if (r5 != 0) goto Lad
            com.google.android.gms.internal.measurement.zzhy r5 = r8.zza     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> Lc9
            if (r5 != 0) goto La7
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhn r1 = com.google.android.gms.internal.measurement.zzhn.zza(r1)     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.zzhy r5 = r8.zza     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L9b
            r5 = r3
            goto L9d
        L9b:
            java.lang.String r5 = r8.zzb     // Catch: java.lang.Throwable -> Lc9
        L9d:
            java.lang.String r1 = r1.zzb(r5)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto La7
            java.lang.Object r3 = r8.zza(r1)     // Catch: java.lang.Throwable -> Lc9
        La7:
            if (r3 != 0) goto Lac
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> Lc9
            goto Lad
        Lac:
            r5 = r3
        Lad:
            boolean r1 = r2.zzb()     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lbc
            if (r4 != 0) goto Lb8
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> Lc9
            goto Lbc
        Lb8:
            java.lang.Object r5 = r8.zza(r4)     // Catch: java.lang.Throwable -> Lc9
        Lbc:
            r8.zzl = r5     // Catch: java.lang.Throwable -> Lc9
            r8.zzk = r0     // Catch: java.lang.Throwable -> Lc9
            goto Lc7
        Lc1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc7:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc9
            goto Lcc
        Lc9:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc9
            throw r0
        Lcc:
            java.lang.Object r0 = r8.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzib.zzb():java.lang.Object");
    }
}
