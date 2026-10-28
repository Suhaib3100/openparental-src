package com.google.android.gms.internal.auth;

import com.google.common.base.c;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzdu {
    static int zza(byte[] bArr, int i4, zzdt zzdtVar) throws zzfb {
        int zzh = zzh(bArr, i4, zzdtVar);
        int i5 = zzdtVar.zza;
        if (i5 < 0) {
            throw zzfb.zzc();
        }
        if (i5 > bArr.length - zzh) {
            throw zzfb.zzf();
        }
        if (i5 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, zzh, i5);
        return zzh + i5;
    }

    static int zzb(byte[] bArr, int i4) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i4, int i5, int i6, zzdt zzdtVar) throws IOException {
        Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i4, i5, i6, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i4, int i5, zzdt zzdtVar) throws IOException {
        Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i4, i5, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    static int zze(zzgi zzgiVar, int i4, byte[] bArr, int i5, int i6, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int zzd = zzd(zzgiVar, bArr, i5, i6, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i6) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i4 != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i6, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i4, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i4, zzdtVar);
        int i5 = zzdtVar.zza + zzh;
        while (zzh < i5) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i5) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i4, byte[] bArr, int i5, int i6, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i4 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzk = zzk(bArr, i5, zzdtVar);
            zzhaVar.zzh(i4, Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i7 == 1) {
            zzhaVar.zzh(i4, Long.valueOf(zzn(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzh = zzh(bArr, i5, zzdtVar);
            int i10 = zzdtVar.zza;
            if (i10 < 0) {
                throw zzfb.zzc();
            }
            if (i10 > bArr.length - zzh) {
                throw zzfb.zzf();
            }
            if (i10 == 0) {
                zzhaVar.zzh(i4, zzef.zzb);
            } else {
                zzhaVar.zzh(i4, zzef.zzk(bArr, zzh, i10));
            }
            return zzh + i10;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i4, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i11 = (i4 & (-8)) | 4;
        zzha zzd = zzha.zzd();
        int i12 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzh2 = zzh(bArr, i5, zzdtVar);
            int i13 = zzdtVar.zza;
            i12 = i13;
            if (i13 == i11) {
                i5 = zzh2;
                break;
            }
            int zzg = zzg(i12, bArr, zzh2, i6, zzd, zzdtVar);
            i12 = i13;
            i5 = zzg;
        }
        if (i5 > i6 || i12 != i11) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i4, zzd);
        return i5;
    }

    static int zzh(byte[] bArr, int i4, zzdt zzdtVar) {
        int i5 = i4 + 1;
        byte b5 = bArr[i4];
        if (b5 < 0) {
            return zzi(b5, bArr, i5, zzdtVar);
        }
        zzdtVar.zza = b5;
        return i5;
    }

    static int zzi(int i4, byte[] bArr, int i5, zzdt zzdtVar) {
        byte b5 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b5 >= 0) {
            zzdtVar.zza = i7 | (b5 << 7);
            return i6;
        }
        int i10 = i7 | ((b5 & Byte.MAX_VALUE) << 7);
        int i11 = i5 + 2;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            zzdtVar.zza = i10 | (b6 << 14);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 14);
        int i13 = i5 + 3;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzdtVar.zza = i12 | (b7 << c.f54879y);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 21);
        int i15 = i5 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzdtVar.zza = i14 | (b10 << c.F);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                zzdtVar.zza = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    static int zzj(int i4, byte[] bArr, int i5, int i6, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i5, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i6) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i4 != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i4, zzdt zzdtVar) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            zzdtVar.zzb = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b5 = bArr[i5];
        long j5 = (j4 & 127) | ((b5 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b5 < 0) {
            int i10 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b5 = bArr[i6];
            i6 = i10;
        }
        zzdtVar.zzb = j5;
        return i6;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i4, int i5, int i6, zzdt zzdtVar) throws IOException {
        int zzb = ((zzga) zzgiVar).zzb(obj, bArr, i4, i5, i6, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i4, int i5, zzdt zzdtVar) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzi(i7, bArr, i6, zzdtVar);
            i7 = zzdtVar.zza;
        }
        int i10 = i6;
        if (i7 < 0 || i7 > i5 - i10) {
            throw zzfb.zzf();
        }
        int i11 = i7 + i10;
        zzgiVar.zzg(obj, bArr, i10, i11, zzdtVar);
        zzdtVar.zzc = obj;
        return i11;
    }

    static long zzn(byte[] bArr, int i4) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }
}
