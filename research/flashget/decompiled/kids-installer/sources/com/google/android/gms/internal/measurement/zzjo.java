package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjo {
    static int zza(byte[] bArr, int i5, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i5, zzjnVar);
        int i6 = zzjnVar.zza;
        if (i6 < 0) {
            throw zzll.zzd();
        }
        if (i6 > bArr.length - zzj) {
            throw zzll.zzf();
        }
        if (i6 == 0) {
            zzjnVar.zzc = zzka.zzb;
            return zzj;
        }
        zzjnVar.zzc = zzka.zzl(bArr, zzj, i6);
        return zzj + i6;
    }

    static int zzb(byte[] bArr, int i5) {
        int i6 = bArr[i5] & UByte.f27220r;
        int i7 = bArr[i5 + 1] & UByte.f27220r;
        int i8 = bArr[i5 + 2] & UByte.f27220r;
        return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (i7 << 8) | i6 | (i8 << 16);
    }

    static int zzc(zzmt zzmtVar, byte[] bArr, int i5, int i6, int i7, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i5, i6, i7, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    static int zzd(zzmt zzmtVar, byte[] bArr, int i5, int i6, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i5, i6, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    static int zze(zzmt zzmtVar, int i5, byte[] bArr, int i6, int i7, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int zzd = zzd(zzmtVar, bArr, i6, i7, zzjnVar);
        zzliVar.add(zzjnVar.zzc);
        while (zzd < i7) {
            int zzj = zzj(bArr, zzd, zzjnVar);
            if (i5 != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i7, zzjnVar);
            zzliVar.add(zzjnVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i5, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i5, zzjnVar);
        int i6 = zzjnVar.zza + zzj;
        while (zzj < i6) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i6) {
            return zzj;
        }
        throw zzll.zzf();
    }

    static int zzg(byte[] bArr, int i5, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i5, zzjnVar);
        int i6 = zzjnVar.zza;
        if (i6 < 0) {
            throw zzll.zzd();
        }
        if (i6 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        zzjnVar.zzc = new String(bArr, zzj, i6, zzlj.zzb);
        return zzj + i6;
    }

    static int zzh(byte[] bArr, int i5, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i5, zzjnVar);
        int i6 = zzjnVar.zza;
        if (i6 < 0) {
            throw zzll.zzd();
        }
        if (i6 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        int i7 = zznz.zza;
        int length = bArr.length;
        if ((((length - zzj) - i6) | zzj | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format(ProtectedSandApp.s("ළ"), Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i6)));
        }
        int i8 = zzj + i6;
        char[] cArr = new char[i6];
        int i9 = 0;
        while (zzj < i8) {
            byte b6 = bArr[zzj];
            if (!zznv.zzd(b6)) {
                break;
            }
            zzj++;
            cArr[i9] = (char) b6;
            i9++;
        }
        while (zzj < i8) {
            int i10 = zzj + 1;
            byte b7 = bArr[zzj];
            if (zznv.zzd(b7)) {
                int i11 = i9 + 1;
                cArr[i9] = (char) b7;
                zzj = i10;
                while (true) {
                    i9 = i11;
                    if (zzj < i8) {
                        byte b8 = bArr[zzj];
                        if (zznv.zzd(b8)) {
                            zzj++;
                            i11 = i9 + 1;
                            cArr[i9] = (char) b8;
                        }
                    }
                }
            } else if (b7 < -32) {
                if (i10 >= i8) {
                    throw zzll.zzc();
                }
                zznv.zzc(b7, bArr[i10], cArr, i9);
                zzj = i10 + 1;
                i9++;
            } else if (b7 < -16) {
                if (i10 >= i8 - 1) {
                    throw zzll.zzc();
                }
                int i12 = i10 + 1;
                zznv.zzb(b7, bArr[i10], bArr[i12], cArr, i9);
                zzj = i12 + 1;
                i9++;
            } else {
                if (i10 >= i8 - 2) {
                    throw zzll.zzc();
                }
                int i13 = i10 + 1;
                byte b9 = bArr[i10];
                int i14 = i13 + 1;
                zznv.zza(b7, b9, bArr[i13], bArr[i14], cArr, i9);
                i9 += 2;
                zzj = i14 + 1;
            }
        }
        zzjnVar.zzc = new String(cArr, 0, i9);
        return i8;
    }

    static int zzi(int i5, byte[] bArr, int i6, int i7, zznl zznlVar, zzjn zzjnVar) throws zzll {
        if ((i5 >>> 3) == 0) {
            throw zzll.zzb();
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int zzm = zzm(bArr, i6, zzjnVar);
            zznlVar.zzj(i5, Long.valueOf(zzjnVar.zzb));
            return zzm;
        }
        if (i8 == 1) {
            zznlVar.zzj(i5, Long.valueOf(zzp(bArr, i6)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int zzj = zzj(bArr, i6, zzjnVar);
            int i9 = zzjnVar.zza;
            if (i9 < 0) {
                throw zzll.zzd();
            }
            if (i9 > bArr.length - zzj) {
                throw zzll.zzf();
            }
            if (i9 == 0) {
                zznlVar.zzj(i5, zzka.zzb);
            } else {
                zznlVar.zzj(i5, zzka.zzl(bArr, zzj, i9));
            }
            return zzj + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw zzll.zzb();
            }
            zznlVar.zzj(i5, Integer.valueOf(zzb(bArr, i6)));
            return i6 + 4;
        }
        int i10 = (i5 & (-8)) | 4;
        zznl zzf = zznl.zzf();
        int i11 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int zzj2 = zzj(bArr, i6, zzjnVar);
            int i12 = zzjnVar.zza;
            i11 = i12;
            if (i12 == i10) {
                i6 = zzj2;
                break;
            }
            int zzi = zzi(i11, bArr, zzj2, i7, zzf, zzjnVar);
            i11 = i12;
            i6 = zzi;
        }
        if (i6 > i7 || i11 != i10) {
            throw zzll.zze();
        }
        zznlVar.zzj(i5, zzf);
        return i6;
    }

    static int zzj(byte[] bArr, int i5, zzjn zzjnVar) {
        int i6 = i5 + 1;
        byte b6 = bArr[i5];
        if (b6 < 0) {
            return zzk(b6, bArr, i6, zzjnVar);
        }
        zzjnVar.zza = b6;
        return i6;
    }

    static int zzk(int i5, byte[] bArr, int i6, zzjn zzjnVar) {
        byte b6 = bArr[i6];
        int i7 = i6 + 1;
        int i8 = i5 & 127;
        if (b6 >= 0) {
            zzjnVar.zza = i8 | (b6 << 7);
            return i7;
        }
        int i9 = i8 | ((b6 & ByteCompanionObject.f23585c) << 7);
        int i10 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            zzjnVar.zza = i9 | (b7 << 14);
            return i10;
        }
        int i11 = i9 | ((b7 & ByteCompanionObject.f23585c) << 14);
        int i12 = i10 + 1;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzjnVar.zza = i11 | (b8 << 21);
            return i12;
        }
        int i13 = i11 | ((b8 & ByteCompanionObject.f23585c) << 21);
        int i14 = i12 + 1;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzjnVar.zza = i13 | (b9 << 28);
            return i14;
        }
        int i15 = i13 | ((b9 & ByteCompanionObject.f23585c) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                zzjnVar.zza = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    static int zzl(int i5, byte[] bArr, int i6, int i7, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i6, zzjnVar);
        zzlcVar.zzh(zzjnVar.zza);
        while (zzj < i7) {
            int zzj2 = zzj(bArr, zzj, zzjnVar);
            if (i5 != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i5, zzjn zzjnVar) {
        long j5 = bArr[i5];
        int i6 = i5 + 1;
        if (j5 >= 0) {
            zzjnVar.zzb = j5;
            return i6;
        }
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        long j6 = (j5 & 127) | ((b6 & ByteCompanionObject.f23585c) << 7);
        int i8 = 7;
        while (b6 < 0) {
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            i8 += 7;
            j6 |= (b7 & ByteCompanionObject.f23585c) << i8;
            i7 = i9;
            b6 = b7;
        }
        zzjnVar.zzb = j6;
        return i7;
    }

    static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i5, int i6, int i7, zzjn zzjnVar) throws IOException {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i5, i6, i7, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i5, int i6, zzjn zzjnVar) throws IOException {
        int i7 = i5 + 1;
        int i8 = bArr[i5];
        if (i8 < 0) {
            i7 = zzk(i8, bArr, i7, zzjnVar);
            i8 = zzjnVar.zza;
        }
        int i9 = i7;
        if (i8 < 0 || i8 > i6 - i9) {
            throw zzll.zzf();
        }
        int i10 = i8 + i9;
        zzmtVar.zzh(obj, bArr, i9, i10, zzjnVar);
        zzjnVar.zzc = obj;
        return i10;
    }

    static long zzp(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }
}
