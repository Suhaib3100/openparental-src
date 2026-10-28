package com.google.android.gms.common;

import android.os.RemoteException;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzw {
    private final int zza;

    protected zzj(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    protected static byte[] zzf(String str) {
        try {
            return str.getBytes(ProtectedSandApp.s("찲"));
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public final boolean equals(@q0 Object obj) {
        IObjectWrapper zzd;
        if (!(obj instanceof com.google.android.gms.common.internal.zzx)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzx zzxVar = (com.google.android.gms.common.internal.zzx) obj;
            if (zzxVar.zze() == this.zza && (zzd = zzxVar.zzd()) != null) {
                return Arrays.equals(zzc(), (byte[]) ObjectWrapper.unwrap(zzd));
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzc());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.zza;
    }
}
