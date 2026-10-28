package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.q0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public interface zzej extends IInterface {
    @q0
    String zzd(zzq zzqVar) throws RemoteException;

    @q0
    List zze(zzq zzqVar, boolean z5) throws RemoteException;

    List zzf(@q0 String str, @q0 String str2, zzq zzqVar) throws RemoteException;

    List zzg(String str, @q0 String str2, @q0 String str3) throws RemoteException;

    List zzh(@q0 String str, @q0 String str2, boolean z5, zzq zzqVar) throws RemoteException;

    List zzi(String str, @q0 String str2, @q0 String str3, boolean z5) throws RemoteException;

    void zzj(zzq zzqVar) throws RemoteException;

    void zzk(zzau zzauVar, zzq zzqVar) throws RemoteException;

    void zzl(zzau zzauVar, String str, @q0 String str2) throws RemoteException;

    void zzm(zzq zzqVar) throws RemoteException;

    void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException;

    void zzo(zzac zzacVar) throws RemoteException;

    void zzp(zzq zzqVar) throws RemoteException;

    void zzq(long j5, @q0 String str, @q0 String str2, String str3) throws RemoteException;

    void zzr(Bundle bundle, zzq zzqVar) throws RemoteException;

    void zzs(zzq zzqVar) throws RemoteException;

    void zzt(zzlk zzlkVar, zzq zzqVar) throws RemoteException;

    @q0
    byte[] zzu(zzau zzauVar, String str) throws RemoteException;
}
