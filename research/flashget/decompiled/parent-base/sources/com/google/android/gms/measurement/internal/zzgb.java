package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.q0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public interface zzgb extends IInterface {
    zzaj zza(zzo zzoVar) throws RemoteException;

    List<zzno> zza(zzo zzoVar, Bundle bundle) throws RemoteException;

    @q0
    List<zzon> zza(zzo zzoVar, boolean z4) throws RemoteException;

    List<zzae> zza(@q0 String str, @q0 String str2, zzo zzoVar) throws RemoteException;

    List<zzae> zza(String str, @q0 String str2, @q0 String str3) throws RemoteException;

    List<zzon> zza(String str, @q0 String str2, @q0 String str3, boolean z4) throws RemoteException;

    List<zzon> zza(@q0 String str, @q0 String str2, boolean z4, zzo zzoVar) throws RemoteException;

    void zza(long j4, @q0 String str, @q0 String str2, String str3) throws RemoteException;

    void zza(Bundle bundle, zzo zzoVar) throws RemoteException;

    void zza(zzae zzaeVar) throws RemoteException;

    void zza(zzae zzaeVar, zzo zzoVar) throws RemoteException;

    void zza(zzbf zzbfVar, zzo zzoVar) throws RemoteException;

    void zza(zzbf zzbfVar, String str, @q0 String str2) throws RemoteException;

    void zza(zzon zzonVar, zzo zzoVar) throws RemoteException;

    @q0
    byte[] zza(zzbf zzbfVar, String str) throws RemoteException;

    @q0
    String zzb(zzo zzoVar) throws RemoteException;

    void zzb(Bundle bundle, zzo zzoVar) throws RemoteException;

    void zzc(zzo zzoVar) throws RemoteException;

    void zzd(zzo zzoVar) throws RemoteException;

    void zze(zzo zzoVar) throws RemoteException;

    void zzf(zzo zzoVar) throws RemoteException;

    void zzg(zzo zzoVar) throws RemoteException;

    void zzh(zzo zzoVar) throws RemoteException;

    void zzi(zzo zzoVar) throws RemoteException;
}
