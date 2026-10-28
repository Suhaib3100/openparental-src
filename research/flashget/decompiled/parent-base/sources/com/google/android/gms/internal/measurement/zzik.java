package com.google.android.gms.internal.measurement;

import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(zzjv.zzb);
    private static final zzir zzb = new zziu();
    private int zzc = 0;

    static {
        new zzim();
    }

    zzik() {
    }

    static /* synthetic */ int zza(byte b5) {
        return b5 & 255;
    }

    static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    static zzit zzc(int i4) {
        return new zzit(i4);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.zzc;
        if (i4 == 0) {
            int zzb2 = zzb();
            i4 = zzb(zzb2, 0, zzb2);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzc = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzin(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("풣"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzmg.zza(this) : j.a(zzmg.zza(zza(0, 47)), ProtectedSandApp.s("풢")));
    }

    public abstract byte zza(int i4);

    public abstract zzik zza(int i4, int i5);

    abstract void zza(zzil zzilVar) throws IOException;

    abstract byte zzb(int i4);

    public abstract int zzb();

    protected abstract int zzb(int i4, int i5, int i6);

    static int zza(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a(ProtectedSandApp.s("풠"), i4, ProtectedSandApp.s("풡")));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("풜"), i4, ProtectedSandApp.s("풝"), i5));
        }
        throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("풞"), i5, ProtectedSandApp.s("풟"), i6));
    }

    protected final int zza() {
        return this.zzc;
    }

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i4, int i5) {
        zza(i4, i4 + i5, bArr.length);
        return new zziv(zzb.zza(bArr, i4, i5));
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(zzjv.zza));
    }
}
