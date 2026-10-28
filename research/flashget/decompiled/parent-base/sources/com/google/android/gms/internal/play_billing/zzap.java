package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.TXLiteAVCode;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzap extends zzau implements zzar {
    zzap(IBinder iBinder) {
        super(iBinder, ProtectedSandApp.s("홹"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zza(int i4, String str, String str2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zzb(int i4, String str, String str2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zzc(int i4, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzaw.zzb(zzu, bundle);
        Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzd(int i4, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzaw.zzb(zzu, bundle);
        Parcel zzv = zzv(w.b.f22440l, zzu);
        Bundle bundle2 = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zze(int i4, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzaw.zzb(zzu, bundle);
        Parcel zzv = zzv(12, zzu);
        Bundle bundle2 = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzf(int i4, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        Parcel zzv = zzv(3, zzu);
        Bundle bundle = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzg(int i4, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        zzaw.zzb(zzu, bundle);
        Parcel zzv = zzv(8, zzu);
        Bundle bundle2 = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzh(int i4, String str, String str2, String str3) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        Parcel zzv = zzv(4, zzu);
        Bundle bundle = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzi(int i4, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzaw.zzb(zzu, bundle);
        Parcel zzv = zzv(11, zzu);
        Bundle bundle2 = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzj(int i4, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzaw.zzb(zzu, bundle);
        zzaw.zzb(zzu, bundle2);
        Parcel zzv = zzv(w.b.f22439k, zzu);
        Bundle bundle3 = (Bundle) zzaw.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzk(int i4, String str, Bundle bundle, zzx zzxVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzxVar);
        zzx(1501, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzl(int i4, String str, Bundle bundle, zzz zzzVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(22);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzzVar);
        zzx(1801, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzm(Bundle bundle, zzac zzacVar) throws RemoteException {
        Parcel zzu = zzu();
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzacVar);
        zzx(2001, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzn(int i4, String str, Bundle bundle, zzae zzaeVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzaeVar);
        zzx(1601, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzo(int i4, String str, Bundle bundle, zzag zzagVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(18);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzagVar);
        zzw(1301, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzp(int i4, String str, Bundle bundle, zzai zzaiVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(i4);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzaiVar);
        zzx(1901, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzq(int i4, String str, Bundle bundle, zzak zzakVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(25);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzakVar);
        zzx(2101, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzr(int i4, String str, Bundle bundle, zzam zzamVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(21);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzamVar);
        zzx(1401, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzs(int i4, String str, Bundle bundle, zzao zzaoVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(24);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzaoVar);
        zzx(1701, zzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzt(int i4, String str, Bundle bundle, zzat zzatVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeInt(12);
        zzu.writeString(str);
        zzaw.zzb(zzu, bundle);
        zzaw.zzc(zzu, zzatVar);
        zzw(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, zzu);
    }
}
