package com.google.android.gms.internal.measurement;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzib<MessageType extends zzib<MessageType, BuilderType>, BuilderType extends zzid<MessageType, BuilderType>> implements zzlc {
    protected int zza = 0;

    int zza(zzlu zzluVar) {
        int zzby = zzby();
        if (zzby != -1) {
            return zzby;
        }
        int zza = zzluVar.zza(this);
        zzc(zza);
        return zza;
    }

    int zzby() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final zzik zzbz() {
        try {
            zzit zzc = zzik.zzc(zzcb());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e4) {
            throw new RuntimeException(d.a(ProtectedSandApp.s("팊"), getClass().getName(), ProtectedSandApp.s("팋")), e4);
        }
    }

    void zzc(int i4) {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzca() {
        try {
            byte[] bArr = new byte[zzcb()];
            zzjc zzb = zzjc.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(d.a(ProtectedSandApp.s("팊"), getClass().getName(), ProtectedSandApp.s("파")), e4);
        }
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzid.zza(iterable, list);
    }
}
