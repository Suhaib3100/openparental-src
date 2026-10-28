package com.google.android.gms.internal.fido;

import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzhp implements Comparable {
    private final zzhp zzc(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(y.a(ProtectedSandApp.s("탍"), cls.getName(), ProtectedSandApp.s("탎"), getClass().getName()));
    }

    static int zzd(byte b5) {
        return (b5 >> 5) & 7;
    }

    public static zzhk zzg(long j4) {
        return new zzhk(j4);
    }

    public static zzhn zzi(String str) {
        return new zzhn(str);
    }

    public static zzhp zzj(byte... bArr) throws zzhj {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return zzhq.zza(byteArrayInputStream, new zzhs(byteArrayInputStream));
    }

    public static zzhp zzk(InputStream inputStream) throws zzhj {
        return zzhq.zza(inputStream, new zzhs(inputStream));
    }

    protected abstract int zza();

    protected int zzb() {
        return 0;
    }

    public final zzhi zze() throws zzho {
        return (zzhi) zzc(zzhi.class);
    }

    public final zzhk zzf() throws zzho {
        return (zzhk) zzc(zzhk.class);
    }

    public final zzhm zzh() throws zzho {
        return (zzhm) zzc(zzhm.class);
    }
}
