package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
abstract class zzm extends zzj {
    private static final WeakReference zzb = new WeakReference(null);
    private WeakReference zza;

    zzm(byte[] bArr) {
        super(bArr);
        this.zza = zzb;
    }

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.zza.get();
                if (bArr == null) {
                    bArr = zzb();
                    this.zza = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
