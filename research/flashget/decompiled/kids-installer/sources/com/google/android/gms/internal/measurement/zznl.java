package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.zze = -1;
        this.zzb = i5;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z5;
    }

    public static zznl zzc() {
        return zza;
    }

    static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i5 = zznlVar.zzb + zznlVar2.zzb;
        int[] copyOf = Arrays.copyOf(zznlVar.zzc, i5);
        System.arraycopy(zznlVar2.zzc, 0, copyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zznlVar.zzd, i5);
        System.arraycopy(zznlVar2.zzd, 0, copyOf2, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i5, copyOf, copyOf2, true);
    }

    static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i5) {
        int[] iArr = this.zzc;
        if (i5 > iArr.length) {
            int i6 = this.zzb;
            int i7 = (i6 / 2) + i6;
            if (i7 >= i5) {
                i5 = i7;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i5);
            this.zzd = Arrays.copyOf(this.zzd, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i5 = this.zzb;
        if (i5 == zznlVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznlVar.zzc;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznlVar.zzd;
                    int i7 = this.zzb;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (objArr[i8].equals(objArr2[i8])) {
                        }
                    }
                    return true;
                }
                if (iArr[i6] != iArr2[i6]) {
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        int i6 = i5 + 527;
        int[] iArr = this.zzc;
        int i7 = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i5; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i6 * 31) + i8;
        Object[] objArr = this.zzd;
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            i7 = (i7 * 31) + objArr[i12].hashCode();
        }
        return (i10 * 31) + i7;
    }

    public final int zza() {
        int zzy;
        int zzx;
        int i5;
        int i6 = this.zze;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.zzd[i8]).longValue();
                    i5 = zzki.zzx(i10 << 3) + 8;
                } else if (i11 == 2) {
                    zzka zzkaVar = (zzka) this.zzd[i8];
                    int i12 = zzki.zzb;
                    int zzd = zzkaVar.zzd();
                    i5 = zzki.zzx(i10 << 3) + zzki.zzx(zzd) + zzd;
                } else if (i11 == 3) {
                    int i13 = i10 << 3;
                    int i14 = zzki.zzb;
                    zzy = ((zznl) this.zzd[i8]).zza();
                    int zzx2 = zzki.zzx(i13);
                    zzx = zzx2 + zzx2;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(zzll.zza());
                    }
                    ((Integer) this.zzd[i8]).intValue();
                    i5 = zzki.zzx(i10 << 3) + 4;
                }
                i7 += i5;
            } else {
                int i15 = i10 << 3;
                zzy = zzki.zzy(((Long) this.zzd[i8]).longValue());
                zzx = zzki.zzx(i15);
            }
            i5 = zzx + zzy;
            i7 += i5;
        }
        this.zze = i7;
        return i7;
    }

    public final int zzb() {
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7] >>> 3;
            zzka zzkaVar = (zzka) this.zzd[i7];
            int i9 = zzki.zzb;
            int zzd = zzkaVar.zzd();
            int zzx = zzki.zzx(zzd) + zzd;
            int zzx2 = zzki.zzx(16);
            int zzx3 = zzki.zzx(i8);
            int zzx4 = zzki.zzx(8);
            i6 += zzki.zzx(24) + zzx + zzx2 + zzx3 + zzx4 + zzx4;
        }
        this.zze = i6;
        return i6;
    }

    final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i5 = this.zzb + zznlVar.zzb;
        zzl(i5);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i5;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < this.zzb; i6++) {
            zzmk.zzb(sb, i5, String.valueOf(this.zzc[i6] >>> 3), this.zzd[i6]);
        }
    }

    final void zzj(int i5, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i6 = this.zzb;
        iArr[i6] = i5;
        this.zzd[i6] = obj;
        this.zzb = i6 + 1;
    }

    public final void zzk(zzoc zzocVar) throws IOException {
        if (this.zzb != 0) {
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i6 = this.zzc[i5];
                Object obj = this.zzd[i5];
                int i7 = i6 & 7;
                int i8 = i6 >>> 3;
                if (i7 == 0) {
                    zzocVar.zzt(i8, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    zzocVar.zzm(i8, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    zzocVar.zzd(i8, (zzka) obj);
                } else if (i7 == 3) {
                    zzocVar.zzE(i8);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i8);
                } else {
                    if (i7 != 5) {
                        throw new RuntimeException(zzll.zza());
                    }
                    zzocVar.zzk(i8, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }
}
