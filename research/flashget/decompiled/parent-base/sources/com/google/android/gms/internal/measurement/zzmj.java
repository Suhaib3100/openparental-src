package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmj zzc() {
        return zza;
    }

    static zzmj zzd() {
        return new zzmj();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        int i4 = this.zzb;
        if (i4 == zzmjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmjVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmjVar.zzd;
                    int i6 = this.zzb;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i10 = 0; i10 < i4; i10++) {
            i7 = (i7 * 31) + iArr[i10];
        }
        int i11 = (i5 + i7) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            i6 = (i6 * 31) + objArr[i13].hashCode();
        }
        return i11 + i6;
    }

    public final int zza() {
        int zzg;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i10 = i7 >>> 3;
            int i11 = i7 & 7;
            if (i11 == 0) {
                zzg = zzjc.zzg(i10, ((Long) this.zzd[i6]).longValue());
            } else if (i11 == 1) {
                zzg = zzjc.zzc(i10, ((Long) this.zzd[i6]).longValue());
            } else if (i11 == 2) {
                zzg = zzjc.zzc(i10, (zzik) this.zzd[i6]);
            } else if (i11 == 3) {
                i5 = ((zzmj) this.zzd[i6]).zza() + (zzjc.zzi(i10) << 1) + i5;
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException(zzkb.zza());
                }
                zzg = zzjc.zzf(i10, ((Integer) this.zzd[i6]).intValue());
            }
            i5 = zzg + i5;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            i5 += zzjc.zzd(this.zzc[i6] >>> 3, (zzik) this.zzd[i6]);
        }
        this.zze = i5;
        return i5;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzmj(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i4;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public final void zzb(zznb zznbVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznbVar.zza() == 1) {
            for (int i4 = 0; i4 < this.zzb; i4++) {
                zza(this.zzc[i4], this.zzd[i4], zznbVar);
            }
            return;
        }
        for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
            zza(this.zzc[i5], this.zzd[i5], zznbVar);
        }
    }

    final zzmj zza(zzmj zzmjVar) {
        if (zzmjVar.equals(zza)) {
            return this;
        }
        zzf();
        int i4 = this.zzb + zzmjVar.zzb;
        zza(i4);
        System.arraycopy(zzmjVar.zzc, 0, this.zzc, this.zzb, zzmjVar.zzb);
        System.arraycopy(zzmjVar.zzd, 0, this.zzd, this.zzb, zzmjVar.zzb);
        this.zzb = i4;
        return this;
    }

    static zzmj zza(zzmj zzmjVar, zzmj zzmjVar2) {
        int i4 = zzmjVar.zzb + zzmjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmjVar.zzc, i4);
        System.arraycopy(zzmjVar2.zzc, 0, copyOf, zzmjVar.zzb, zzmjVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmjVar.zzd, i4);
        System.arraycopy(zzmjVar2.zzd, 0, copyOf2, zzmjVar.zzb, zzmjVar2.zzb);
        return new zzmj(i4, copyOf, copyOf2, true);
    }

    private final void zza(int i4) {
        int[] iArr = this.zzc;
        if (i4 > iArr.length) {
            int i5 = this.zzb;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i4);
            this.zzd = Arrays.copyOf(this.zzd, i4);
        }
    }

    final void zza(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzld.zza(sb, i4, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    final void zza(int i4, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i4;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    final void zza(zznb zznbVar) throws IOException {
        if (zznbVar.zza() == 2) {
            for (int i4 = this.zzb - 1; i4 >= 0; i4--) {
                zznbVar.zza(this.zzc[i4] >>> 3, this.zzd[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zznbVar.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    private static void zza(int i4, Object obj, zznb zznbVar) throws IOException {
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            zznbVar.zzb(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            zznbVar.zza(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            zznbVar.zza(i5, (zzik) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                zznbVar.zzb(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkb.zza());
        }
        if (zznbVar.zza() == 1) {
            zznbVar.zzb(i5);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zza(i5);
        } else {
            zznbVar.zza(i5);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zzb(i5);
        }
    }
}
