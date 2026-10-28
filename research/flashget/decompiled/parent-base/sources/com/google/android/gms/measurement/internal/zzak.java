package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
enum zzak {
    zza('0'),
    zzb('1'),
    zzc('2'),
    zzd('3'),
    zze('4'),
    zzf('5'),
    zzj('6'),
    zzg('7'),
    zzh('8'),
    zzi('9');

    private final char zzl;

    zzak(char c5) {
        this.zzl = c5;
    }

    public static zzak zza(char c5) {
        for (zzak zzakVar : values()) {
            if (zzakVar.zzl == c5) {
                return zzakVar;
            }
        }
        return zza;
    }
}
