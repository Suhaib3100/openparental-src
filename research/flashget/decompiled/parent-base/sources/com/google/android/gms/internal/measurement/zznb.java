package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
interface zznb {
    int zza();

    @Deprecated
    void zza(int i4) throws IOException;

    void zza(int i4, double d5) throws IOException;

    void zza(int i4, float f4) throws IOException;

    void zza(int i4, int i5) throws IOException;

    void zza(int i4, long j4) throws IOException;

    void zza(int i4, zzik zzikVar) throws IOException;

    <K, V> void zza(int i4, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException;

    void zza(int i4, Object obj) throws IOException;

    @Deprecated
    void zza(int i4, Object obj, zzlu zzluVar) throws IOException;

    void zza(int i4, String str) throws IOException;

    void zza(int i4, List<zzik> list) throws IOException;

    @Deprecated
    void zza(int i4, List<?> list, zzlu zzluVar) throws IOException;

    void zza(int i4, List<Boolean> list, boolean z4) throws IOException;

    void zza(int i4, boolean z4) throws IOException;

    @Deprecated
    void zzb(int i4) throws IOException;

    void zzb(int i4, int i5) throws IOException;

    void zzb(int i4, long j4) throws IOException;

    void zzb(int i4, Object obj, zzlu zzluVar) throws IOException;

    void zzb(int i4, List<String> list) throws IOException;

    void zzb(int i4, List<?> list, zzlu zzluVar) throws IOException;

    void zzb(int i4, List<Double> list, boolean z4) throws IOException;

    void zzc(int i4, int i5) throws IOException;

    void zzc(int i4, long j4) throws IOException;

    void zzc(int i4, List<Integer> list, boolean z4) throws IOException;

    void zzd(int i4, int i5) throws IOException;

    void zzd(int i4, long j4) throws IOException;

    void zzd(int i4, List<Integer> list, boolean z4) throws IOException;

    void zze(int i4, int i5) throws IOException;

    void zze(int i4, long j4) throws IOException;

    void zze(int i4, List<Long> list, boolean z4) throws IOException;

    void zzf(int i4, int i5) throws IOException;

    void zzf(int i4, List<Float> list, boolean z4) throws IOException;

    void zzg(int i4, List<Integer> list, boolean z4) throws IOException;

    void zzh(int i4, List<Long> list, boolean z4) throws IOException;

    void zzi(int i4, List<Integer> list, boolean z4) throws IOException;

    void zzj(int i4, List<Long> list, boolean z4) throws IOException;

    void zzk(int i4, List<Integer> list, boolean z4) throws IOException;

    void zzl(int i4, List<Long> list, boolean z4) throws IOException;

    void zzm(int i4, List<Integer> list, boolean z4) throws IOException;

    void zzn(int i4, List<Long> list, boolean z4) throws IOException;
}
