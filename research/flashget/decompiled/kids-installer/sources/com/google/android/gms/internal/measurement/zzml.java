package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i5, int i6, zzmi zzmiVar, boolean z5, boolean z6, int[] iArr2, int i7, int i8, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i6;
        this.zzi = z5;
        boolean z7 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z7 = true;
        }
        this.zzh = z7;
        this.zzj = iArr2;
        this.zzk = i7;
        this.zzl = i8;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i5) {
        int i6 = i5 / 3;
        return (zzlf) this.zzd[i6 + i6 + 1];
    }

    private final zzmt zzB(int i5) {
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        zzmt zzmtVar = (zzmt) this.zzd[i7];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i7 + 1]);
        this.zzd[i7] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i5) {
        int i6 = i5 / 3;
        return this.zzd[i6 + i6];
    }

    private final Object zzD(Object obj, int i5) {
        zzmt zzB = zzB(i5);
        int zzy = zzy(i5) & 1048575;
        if (!zzP(obj, i5)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i5, int i6) {
        zzmt zzB = zzB(i6);
        if (!zzT(obj, i5, i6)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i6) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException(ProtectedSandApp.s("⎧") + str + ProtectedSandApp.s("⎨") + cls.getName() + ProtectedSandApp.s("⎩") + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (zzS(obj)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("⎪").concat(String.valueOf(obj)));
    }

    private final void zzH(Object obj, Object obj2, int i5) {
        if (zzP(obj2, i5)) {
            int zzy = zzy(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j5 = zzy;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException(ProtectedSandApp.s("⎫") + this.zzc[i5] + ProtectedSandApp.s("⎬") + obj2.toString());
            }
            zzmt zzB = zzB(i5);
            if (!zzP(obj, i5)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j5, zze);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                zzJ(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j5, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i5) {
        int i6 = this.zzc[i5];
        if (zzT(obj2, i6, i5)) {
            int zzy = zzy(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j5 = zzy;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException(ProtectedSandApp.s("⎭") + this.zzc[i5] + ProtectedSandApp.s("⎮") + obj2.toString());
            }
            zzmt zzB = zzB(i5);
            if (!zzT(obj, i6, i5)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j5, zze);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                zzK(obj, i6, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j5, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i5) {
        int zzv = zzv(i5);
        long j5 = 1048575 & zzv;
        if (j5 == 1048575) {
            return;
        }
        zznu.zzq(obj, j5, (1 << (zzv >>> 20)) | zznu.zzc(obj, j5));
    }

    private final void zzK(Object obj, int i5, int i6) {
        zznu.zzq(obj, zzv(i6) & 1048575, i5);
    }

    private final void zzL(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzy(i5) & 1048575, obj2);
        zzJ(obj, i5);
    }

    private final void zzM(Object obj, int i5, int i6, Object obj2) {
        zzb.putObject(obj, zzy(i6) & 1048575, obj2);
        zzK(obj, i5, i6);
    }

    private final void zzN(zzoc zzocVar, int i5, Object obj, int i6) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i5) {
        return zzP(obj, i5) == zzP(obj2, i5);
    }

    private final boolean zzP(Object obj, int i5) {
        int zzv = zzv(i5);
        long j5 = zzv & 1048575;
        if (j5 != 1048575) {
            return (zznu.zzc(obj, j5) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i5);
        long j6 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j6)) != 0;
            case 2:
                return zznu.zzd(obj, j6) != 0;
            case 3:
                return zznu.zzd(obj, j6) != 0;
            case 4:
                return zznu.zzc(obj, j6) != 0;
            case 5:
                return zznu.zzd(obj, j6) != 0;
            case 6:
                return zznu.zzc(obj, j6) != 0;
            case 7:
                return zznu.zzw(obj, j6);
            case 8:
                Object zzf = zznu.zzf(obj, j6);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j6) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j6));
            case 11:
                return zznu.zzc(obj, j6) != 0;
            case 12:
                return zznu.zzc(obj, j6) != 0;
            case 13:
                return zznu.zzc(obj, j6) != 0;
            case 14:
                return zznu.zzd(obj, j6) != 0;
            case 15:
                return zznu.zzc(obj, j6) != 0;
            case 16:
                return zznu.zzd(obj, j6) != 0;
            case 17:
                return zznu.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i5, int i6, int i7, int i8) {
        return i6 == 1048575 ? zzP(obj, i5) : (i7 & i8) != 0;
    }

    private static boolean zzR(Object obj, int i5, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i5 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i5, int i6) {
        return zznu.zzc(obj, (long) (zzv(i6) & 1048575)) == i5;
    }

    private static boolean zzU(Object obj, long j5) {
        return ((Boolean) zznu.zzf(obj, j5)).booleanValue();
    }

    private static final void zzV(int i5, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i5, (String) obj);
        } else {
            zzocVar.zzd(i5, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zzf = zznl.zzf();
        zzlbVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r31, com.google.android.gms.internal.measurement.zzmf r32, com.google.android.gms.internal.measurement.zzmn r33, com.google.android.gms.internal.measurement.zzlw r34, com.google.android.gms.internal.measurement.zznk r35, com.google.android.gms.internal.measurement.zzko r36, com.google.android.gms.internal.measurement.zzmd r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j5) {
        return ((Double) zznu.zzf(obj, j5)).doubleValue();
    }

    private static float zzn(Object obj, long j5) {
        return ((Float) zznu.zzf(obj, j5)).floatValue();
    }

    private final int zzo(Object obj) {
        int i5;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int i6;
        int i7;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzh;
        int zzx9;
        int zzx10;
        int i8;
        int zzy2;
        int zzx11;
        Unsafe unsafe = zzb;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzc.length) {
            int zzy3 = zzy(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int zzx12 = zzx(zzy3);
            if (zzx12 <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i9;
                int i17 = i15 >>> 20;
                if (i16 != i13) {
                    i10 = unsafe.getInt(obj, i16);
                    i13 = i16;
                }
                i5 = 1 << i17;
            } else {
                i5 = 0;
            }
            long j5 = i9 & zzy3;
            switch (zzx12) {
                case 0:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 1:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 2:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j5));
                        zzx3 = zzki.zzx(i14 << 3);
                        int i18 = zzy;
                        i6 = zzx3;
                        i7 = i18;
                        i11 = i6 + i7 + i11;
                        break;
                    }
                case 3:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j5));
                        zzx3 = zzki.zzx(i14 << 3);
                        int i182 = zzy;
                        i6 = zzx3;
                        i7 = i182;
                        i11 = i6 + i7 + i11;
                        break;
                    }
                case 4:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        i7 = zzki.zzu(unsafe.getInt(obj, j5));
                        i6 = zzki.zzx(i14 << 3);
                        i11 = i6 + i7 + i11;
                        break;
                    }
                case 5:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 6:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 7:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i14 << 3);
                        zzn = zzx4 + 1;
                        i11 += zzn;
                        break;
                    }
                case 8:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j5);
                        if (!(object instanceof zzka)) {
                            i7 = zzki.zzw((String) object);
                            i6 = zzki.zzx(i14 << 3);
                            i11 = i6 + i7 + i11;
                            break;
                        } else {
                            int i19 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzd + zzki.zzx(zzd);
                            zzx6 = zzki.zzx(i14 << 3);
                            zzn = zzx5 + zzx6;
                            i11 += zzn;
                            break;
                        }
                    }
                case 9:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i14, unsafe.getObject(obj, j5), zzB(i12));
                        i11 += zzn;
                        break;
                    }
                case 10:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j5);
                        int i20 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzd2 + zzki.zzx(zzd2);
                        zzx6 = zzki.zzx(i14 << 3);
                        zzn = zzx5 + zzx6;
                        i11 += zzn;
                        break;
                    }
                case 11:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        i7 = zzki.zzx(unsafe.getInt(obj, j5));
                        i6 = zzki.zzx(i14 << 3);
                        i11 = i6 + i7 + i11;
                        break;
                    }
                case 12:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        i7 = zzki.zzu(unsafe.getInt(obj, j5));
                        i6 = zzki.zzx(i14 << 3);
                        i11 = i6 + i7 + i11;
                        break;
                    }
                case 13:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 14:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 15:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j5);
                        zzx7 = zzki.zzx(i14 << 3);
                        zzx8 = zzki.zzx((i21 >> 31) ^ (i21 + i21));
                        zzn = zzx8 + zzx7;
                        i11 += zzn;
                        break;
                    }
                case 16:
                    if ((i5 & i10) == 0) {
                        break;
                    } else {
                        long j6 = unsafe.getLong(obj, j5);
                        zzx5 = zzki.zzx(i14 << 3);
                        zzx6 = zzki.zzy((j6 >> 63) ^ (j6 + j6));
                        zzn = zzx5 + zzx6;
                        i11 += zzn;
                        break;
                    }
                case 17:
                    if ((i10 & i5) == 0) {
                        break;
                    } else {
                        zzn = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j5), zzB(i12));
                        i11 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i14, (List) unsafe.getObject(obj, j5));
                    i11 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i14, (List) unsafe.getObject(obj, j5), zzB(i12));
                    i11 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i14, (List) unsafe.getObject(obj, j5));
                    i11 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i14, (List) unsafe.getObject(obj, j5), false);
                    i11 += zzn;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j5);
                    int i22 = zzmv.zza;
                    zzh = list.size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j5));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i14 << 3);
                        i8 = zzx10 + zzx9;
                        i11 += i8 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i14, (List) unsafe.getObject(obj, j5), zzB(i12));
                    i11 += zzn;
                    break;
                case 50:
                    zzmd.zza(i14, unsafe.getObject(obj, j5), zzC(i12));
                    break;
                case 51:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzy2 = zzki.zzy(zzz(obj, j5));
                        zzx11 = zzki.zzx(i14 << 3);
                        int i23 = zzy2;
                        i8 = zzx11;
                        zzh = i23;
                        i11 += i8 + zzh;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzy2 = zzki.zzy(zzz(obj, j5));
                        zzx11 = zzki.zzx(i14 << 3);
                        int i232 = zzy2;
                        i8 = zzx11;
                        zzh = i232;
                        i11 += i8 + zzh;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzh = zzki.zzu(zzp(obj, j5));
                        i8 = zzki.zzx(i14 << 3);
                        i11 += i8 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i14 << 3);
                        zzn = zzx4 + 1;
                        i11 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j5);
                        if (!(object2 instanceof zzka)) {
                            zzh = zzki.zzw((String) object2);
                            i8 = zzki.zzx(i14 << 3);
                            i11 += i8 + zzh;
                            break;
                        } else {
                            int i24 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx5 = zzd3 + zzki.zzx(zzd3);
                            zzx6 = zzki.zzx(i14 << 3);
                            zzn = zzx5 + zzx6;
                            i11 += zzn;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i14, unsafe.getObject(obj, j5), zzB(i12));
                        i11 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j5);
                        int i25 = zzki.zzb;
                        int zzd4 = zzkaVar2.zzd();
                        zzx5 = zzd4 + zzki.zzx(zzd4);
                        zzx6 = zzki.zzx(i14 << 3);
                        zzn = zzx5 + zzx6;
                        i11 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzh = zzki.zzx(zzp(obj, j5));
                        i8 = zzki.zzx(i14 << 3);
                        i11 += i8 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzh = zzki.zzu(zzp(obj, j5));
                        i8 = zzki.zzx(i14 << 3);
                        i11 += i8 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i14 << 3);
                        zzn = zzx2 + 4;
                        i11 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i14 << 3);
                        zzn = zzx + 8;
                        i11 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j5);
                        zzx7 = zzki.zzx(i14 << 3);
                        zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i11 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j5);
                        zzx5 = zzki.zzx(i14 << 3);
                        zzx6 = zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzn = zzx5 + zzx6;
                        i11 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i14, i12)) {
                        break;
                    } else {
                        zzn = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j5), zzB(i12));
                        i11 += zzn;
                        break;
                    }
            }
            i12 += 3;
            i9 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i11 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j5) {
        return ((Integer) zznu.zzf(obj, j5)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i5, int i6, int i7, long j5, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i7);
        Object object = unsafe.getObject(obj, j5);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j5, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j5, int i12, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j6 = this.zzc[i12 + 2] & 1048575;
        switch (i11) {
            case 51:
                if (i9 == 1) {
                    unsafe.putObject(obj, j5, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i5))));
                    int i13 = i5 + 8;
                    unsafe.putInt(obj, j6, i8);
                    return i13;
                }
                break;
            case 52:
                if (i9 == 5) {
                    unsafe.putObject(obj, j5, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i5))));
                    int i14 = i5 + 4;
                    unsafe.putInt(obj, j6, i8);
                    return i14;
                }
                break;
            case 53:
            case 54:
                if (i9 == 0) {
                    int zzm = zzjo.zzm(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j6, i8);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i9 == 0) {
                    int zzj = zzjo.zzj(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j6, i8);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i9 == 1) {
                    unsafe.putObject(obj, j5, Long.valueOf(zzjo.zzp(bArr, i5)));
                    int i15 = i5 + 8;
                    unsafe.putInt(obj, j6, i8);
                    return i15;
                }
                break;
            case 57:
            case 64:
                if (i9 == 5) {
                    unsafe.putObject(obj, j5, Integer.valueOf(zzjo.zzb(bArr, i5)));
                    int i16 = i5 + 4;
                    unsafe.putInt(obj, j6, i8);
                    return i16;
                }
                break;
            case 58:
                if (i9 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j6, i8);
                    return zzm2;
                }
                break;
            case 59:
                if (i9 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i5, zzjnVar);
                    int i17 = zzjnVar.zza;
                    if (i17 == 0) {
                        unsafe.putObject(obj, j5, "");
                    } else {
                        if ((i10 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i17)) {
                            throw zzll.zzc();
                        }
                        unsafe.putObject(obj, j5, new String(bArr, zzj2, i17, zzlj.zzb));
                        zzj2 += i17;
                    }
                    unsafe.putInt(obj, j6, i8);
                    return zzj2;
                }
                break;
            case 60:
                if (i9 == 2) {
                    Object zzE = zzE(obj, i8, i12);
                    int zzo = zzjo.zzo(zzE, zzB(i12), bArr, i5, i6, zzjnVar);
                    zzM(obj, i8, i12, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i9 == 2) {
                    int zza2 = zzjo.zza(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, zzjnVar.zzc);
                    unsafe.putInt(obj, j6, i8);
                    return zza2;
                }
                break;
            case 63:
                if (i9 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i5, zzjnVar);
                    int i18 = zzjnVar.zza;
                    zzlf zzA = zzA(i12);
                    if (zzA == null || zzA.zza(i18)) {
                        unsafe.putObject(obj, j5, Integer.valueOf(i18));
                        unsafe.putInt(obj, j6, i8);
                    } else {
                        zzd(obj).zzj(i7, Long.valueOf(i18));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i9 == 0) {
                    int zzj4 = zzjo.zzj(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j6, i8);
                    return zzj4;
                }
                break;
            case 67:
                if (i9 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i5, zzjnVar);
                    unsafe.putObject(obj, j5, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j6, i8);
                    return zzm3;
                }
                break;
            case 68:
                if (i9 == 3) {
                    Object zzE2 = zzE(obj, i8, i12);
                    int zzn = zzjo.zzn(zzE2, zzB(i12), bArr, i5, i6, (i7 & (-8)) | 4, zzjnVar);
                    zzM(obj, i8, i12, zzE2);
                    return zzn;
                }
                break;
        }
        return i5;
    }

    private final int zzs(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, long j6, zzjn zzjnVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int zzl;
        int i16 = i5;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j6);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j6, zzliVar);
        }
        switch (i11) {
            case 18:
            case 35:
                if (i9 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int zzj = zzjo.zzj(bArr, i16, zzjnVar);
                    int i17 = zzjnVar.zza + zzj;
                    while (zzj < i17) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i17) {
                        return zzj;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i5)));
                    while (true) {
                        i12 = i16 + 8;
                        if (i12 < i6) {
                            i16 = zzjo.zzj(bArr, i12, zzjnVar);
                            if (i7 == zzjnVar.zza) {
                                zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i16)));
                            }
                        }
                    }
                    return i12;
                }
                break;
            case 19:
            case 36:
                if (i9 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int zzj2 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i18 = zzjnVar.zza + zzj2;
                    while (zzj2 < i18) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i18) {
                        return zzj2;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i5)));
                    while (true) {
                        i13 = i16 + 4;
                        if (i13 < i6) {
                            i16 = zzjo.zzj(bArr, i13, zzjnVar);
                            if (i7 == zzjnVar.zza) {
                                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i16)));
                            }
                        }
                    }
                    return i13;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i9 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int zzj3 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i19 = zzjnVar.zza + zzj3;
                    while (zzj3 < i19) {
                        zzj3 = zzjo.zzm(bArr, zzj3, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj3 == i19) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar;
                    int zzm = zzjo.zzm(bArr, i16, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i6) {
                        int zzj4 = zzjo.zzj(bArr, zzm, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr, zzj4, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i9 == 2) {
                    return zzjo.zzf(bArr, i16, zzliVar, zzjnVar);
                }
                if (i9 == 0) {
                    return zzjo.zzl(i7, bArr, i5, i6, zzliVar, zzjnVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i9 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int zzj5 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i20 = zzjnVar.zza + zzj5;
                    while (zzj5 < i20) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i20) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i5));
                    while (true) {
                        i14 = i16 + 8;
                        if (i14 < i6) {
                            i16 = zzjo.zzj(bArr, i14, zzjnVar);
                            if (i7 == zzjnVar.zza) {
                                zzlxVar4.zzg(zzjo.zzp(bArr, i16));
                            }
                        }
                    }
                    return i14;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i9 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int zzj6 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i21 = zzjnVar.zza + zzj6;
                    while (zzj6 < i21) {
                        zzlcVar.zzh(zzjo.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i21) {
                        return zzj6;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i5));
                    while (true) {
                        i15 = i16 + 4;
                        if (i15 < i6) {
                            i16 = zzjo.zzj(bArr, i15, zzjnVar);
                            if (i7 == zzjnVar.zza) {
                                zzlcVar2.zzh(zzjo.zzb(bArr, i16));
                            }
                        }
                    }
                    return i15;
                }
                break;
            case 25:
            case 42:
                if (i9 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int zzj7 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i22 = zzjnVar.zza + zzj7;
                    while (zzj7 < i22) {
                        zzj7 = zzjo.zzm(bArr, zzj7, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj7 == i22) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar;
                    int zzm2 = zzjo.zzm(bArr, i16, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i6) {
                        int zzj8 = zzjo.zzj(bArr, zzm2, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr, zzj8, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i9 == 2) {
                    if ((j5 & 536870912) == 0) {
                        int zzj9 = zzjo.zzj(bArr, i16, zzjnVar);
                        int i23 = zzjnVar.zza;
                        if (i23 < 0) {
                            throw zzll.zzd();
                        }
                        if (i23 == 0) {
                            zzliVar.add("");
                        } else {
                            zzliVar.add(new String(bArr, zzj9, i23, zzlj.zzb));
                            zzj9 += i23;
                        }
                        while (zzj9 < i6) {
                            int zzj10 = zzjo.zzj(bArr, zzj9, zzjnVar);
                            if (i7 != zzjnVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzjo.zzj(bArr, zzj10, zzjnVar);
                            int i24 = zzjnVar.zza;
                            if (i24 < 0) {
                                throw zzll.zzd();
                            }
                            if (i24 == 0) {
                                zzliVar.add("");
                            } else {
                                zzliVar.add(new String(bArr, zzj9, i24, zzlj.zzb));
                                zzj9 += i24;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i25 = zzjnVar.zza;
                    if (i25 < 0) {
                        throw zzll.zzd();
                    }
                    if (i25 == 0) {
                        zzliVar.add("");
                    } else {
                        int i26 = zzj11 + i25;
                        if (!zznz.zze(bArr, zzj11, i26)) {
                            throw zzll.zzc();
                        }
                        zzliVar.add(new String(bArr, zzj11, i25, zzlj.zzb));
                        zzj11 = i26;
                    }
                    while (zzj11 < i6) {
                        int zzj12 = zzjo.zzj(bArr, zzj11, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzjo.zzj(bArr, zzj12, zzjnVar);
                        int i27 = zzjnVar.zza;
                        if (i27 < 0) {
                            throw zzll.zzd();
                        }
                        if (i27 == 0) {
                            zzliVar.add("");
                        } else {
                            int i28 = zzj11 + i27;
                            if (!zznz.zze(bArr, zzj11, i28)) {
                                throw zzll.zzc();
                            }
                            zzliVar.add(new String(bArr, zzj11, i27, zzlj.zzb));
                            zzj11 = i28;
                        }
                    }
                    return zzj11;
                }
                break;
            case 27:
                if (i9 == 2) {
                    return zzjo.zze(zzB(i10), i7, bArr, i5, i6, zzliVar, zzjnVar);
                }
                break;
            case 28:
                if (i9 == 2) {
                    int zzj13 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i29 = zzjnVar.zza;
                    if (i29 < 0) {
                        throw zzll.zzd();
                    }
                    if (i29 > bArr.length - zzj13) {
                        throw zzll.zzf();
                    }
                    if (i29 == 0) {
                        zzliVar.add(zzka.zzb);
                    } else {
                        zzliVar.add(zzka.zzl(bArr, zzj13, i29));
                        zzj13 += i29;
                    }
                    while (zzj13 < i6) {
                        int zzj14 = zzjo.zzj(bArr, zzj13, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzjo.zzj(bArr, zzj14, zzjnVar);
                        int i30 = zzjnVar.zza;
                        if (i30 < 0) {
                            throw zzll.zzd();
                        }
                        if (i30 > bArr.length - zzj13) {
                            throw zzll.zzf();
                        }
                        if (i30 == 0) {
                            zzliVar.add(zzka.zzb);
                        } else {
                            zzliVar.add(zzka.zzl(bArr, zzj13, i30));
                            zzj13 += i30;
                        }
                    }
                    return zzj13;
                }
                break;
            case 30:
            case 44:
                if (i9 == 2) {
                    zzl = zzjo.zzf(bArr, i16, zzliVar, zzjnVar);
                } else if (i9 == 0) {
                    zzl = zzjo.zzl(i7, bArr, i5, i6, zzliVar, zzjnVar);
                }
                zzlf zzA = zzA(i10);
                zznk zznkVar = this.zzn;
                int i31 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar instanceof RandomAccess) {
                        int size2 = zzliVar.size();
                        int i32 = 0;
                        for (int i33 = 0; i33 < size2; i33++) {
                            int intValue = ((Integer) zzliVar.get(i33)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i33 != i32) {
                                    zzliVar.set(i32, Integer.valueOf(intValue));
                                }
                                i32++;
                            } else {
                                obj2 = zzmv.zzA(obj, i8, intValue, obj2, zznkVar);
                            }
                        }
                        if (i32 != size2) {
                            zzliVar.subList(i32, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzA(obj, i8, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i9 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int zzj15 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i34 = zzjnVar.zza + zzj15;
                    while (zzj15 < i34) {
                        zzj15 = zzjo.zzj(bArr, zzj15, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj15 == i34) {
                        return zzj15;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int zzj16 = zzjo.zzj(bArr, i16, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj16 < i6) {
                        int zzj17 = zzjo.zzj(bArr, zzj16, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzjo.zzj(bArr, zzj17, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj16;
                }
                break;
            case 34:
            case 48:
                if (i9 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int zzj18 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i35 = zzjnVar.zza + zzj18;
                    while (zzj18 < i35) {
                        zzj18 = zzjo.zzm(bArr, zzj18, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj18 == i35) {
                        return zzj18;
                    }
                    throw zzll.zzf();
                }
                if (i9 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int zzm3 = zzjo.zzm(bArr, i16, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i6) {
                        int zzj19 = zzjo.zzj(bArr, zzm3, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr, zzj19, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i9 == 3) {
                    zzmt zzB = zzB(i10);
                    int i36 = (i7 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr, i5, i6, i36, zzjnVar);
                    zzliVar.add(zzjnVar.zzc);
                    while (zzc < i6) {
                        int zzj20 = zzjo.zzj(bArr, zzc, zzjnVar);
                        if (i7 != zzjnVar.zza) {
                            return zzc;
                        }
                        zzc = zzjo.zzc(zzB, bArr, zzj20, i6, i36, zzjnVar);
                        zzliVar.add(zzjnVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i16;
    }

    private final int zzt(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzw(i5, 0);
    }

    private final int zzu(int i5, int i6) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzw(i5, i6);
    }

    private final int zzv(int i5) {
        return this.zzc[i5 + 2];
    }

    private final int zzw(int i5, int i6) {
        int length = (this.zzc.length / 3) - 1;
        while (i6 <= length) {
            int i7 = (length + i6) >>> 1;
            int i8 = i7 * 3;
            int i9 = this.zzc[i8];
            if (i5 == i9) {
                return i8;
            }
            if (i5 < i9) {
                length = i7 - 1;
            } else {
                i6 = i7 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzy(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzz(Object obj, long j5) {
        return ((Long) zznu.zzf(obj, j5)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzx9;
        int zzx10;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzy2 = zzy(i6);
            int zzx11 = zzx(zzy2);
            int i7 = this.zzc[i6];
            int i8 = zzy2 & 1048575;
            if (zzx11 >= zzkt.zzJ.zza() && zzx11 <= zzkt.zzW.zza()) {
                int i9 = this.zzc[i6 + 2];
            }
            long j5 = i8;
            switch (zzx11) {
                case 0:
                    if (zzP(obj, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj, i6)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj, i6)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj, i6)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj, i6)) {
                        zzx4 = zzki.zzx(i7 << 3);
                        zzn = zzx4 + 1;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj, i6)) {
                        Object zzf = zznu.zzf(obj, j5);
                        if (zzf instanceof zzka) {
                            int i10 = i7 << 3;
                            int i11 = zzki.zzb;
                            int zzd = ((zzka) zzf).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i10);
                            zzn = zzx6 + zzx5;
                            i5 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf);
                            zzx3 = zzki.zzx(i7 << 3);
                            i5 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzP(obj, i6)) {
                        zzn = zzmv.zzn(i7, zznu.zzf(obj, j5), zzB(i6));
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzP(obj, i6)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j5);
                        int i12 = i7 << 3;
                        int i13 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i12);
                        zzn = zzx6 + zzx5;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj, i6)) {
                        zzy = zzki.zzx(zznu.zzc(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj, i6)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj, i6)) {
                        int zzc = zznu.zzc(obj, j5);
                        zzx7 = zzki.zzx(i7 << 3);
                        zzx8 = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                        zzn = zzx8 + zzx7;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj, i6)) {
                        long zzd3 = zznu.zzd(obj, j5);
                        zzy = zzki.zzx(i7 << 3);
                        zzx3 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzP(obj, i6)) {
                        zzn = zzki.zzt(i7, (zzmi) zznu.zzf(obj, j5), zzB(i6));
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i7, (List) zznu.zzf(obj, j5));
                    i5 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i7, (List) zznu.zzf(obj, j5), zzB(i6));
                    i5 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i7, (List) zznu.zzf(obj, j5));
                    i5 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i7, (List) zznu.zzf(obj, j5), false);
                    i5 += zzn;
                    break;
                case 35:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i14 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i14);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i15 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i15);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzmv.zzm((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i16 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i16);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzmv.zzx((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i17 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i17);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzmv.zzk((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i18 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i18);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i19 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i19);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i20 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i20);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j5);
                    int i21 = zzmv.zza;
                    zzy = list.size();
                    if (zzy > 0) {
                        int i22 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i22);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzmv.zzv((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i23 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i23);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzmv.zzd((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i24 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i24);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i25 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i25);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i26 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i26);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzmv.zzq((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i27 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i27);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzmv.zzs((List) unsafe.getObject(obj, j5));
                    if (zzy > 0) {
                        int i28 = i7 << 3;
                        zzx9 = zzki.zzx(zzy);
                        zzx10 = zzki.zzx(i28);
                        zzx3 = zzx10 + zzx9;
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i7, (List) zznu.zzf(obj, j5), zzB(i6));
                    i5 += zzn;
                    break;
                case 50:
                    zzmd.zza(i7, zznu.zzf(obj, j5), zzC(i6));
                    break;
                case 51:
                    if (zzT(obj, i7, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i7, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i7, i6)) {
                        zzy = zzki.zzy(zzz(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i7, i6)) {
                        zzy = zzki.zzy(zzz(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i7, i6)) {
                        zzy = zzki.zzu(zzp(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i7, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i7, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i7, i6)) {
                        zzx4 = zzki.zzx(i7 << 3);
                        zzn = zzx4 + 1;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i7, i6)) {
                        Object zzf2 = zznu.zzf(obj, j5);
                        if (zzf2 instanceof zzka) {
                            int i29 = i7 << 3;
                            int i30 = zzki.zzb;
                            int zzd4 = ((zzka) zzf2).zzd();
                            zzx5 = zzki.zzx(zzd4) + zzd4;
                            zzx6 = zzki.zzx(i29);
                            zzn = zzx6 + zzx5;
                            i5 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf2);
                            zzx3 = zzki.zzx(i7 << 3);
                            i5 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i7, i6)) {
                        zzn = zzmv.zzn(i7, zznu.zzf(obj, j5), zzB(i6));
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i7, i6)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j5);
                        int i31 = i7 << 3;
                        int i32 = zzki.zzb;
                        int zzd5 = zzkaVar2.zzd();
                        zzx5 = zzki.zzx(zzd5) + zzd5;
                        zzx6 = zzki.zzx(i31);
                        zzn = zzx6 + zzx5;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i7, i6)) {
                        zzy = zzki.zzx(zzp(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i7, i6)) {
                        zzy = zzki.zzu(zzp(obj, j5));
                        zzx3 = zzki.zzx(i7 << 3);
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i7, i6)) {
                        zzx2 = zzki.zzx(i7 << 3);
                        zzn = zzx2 + 4;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i7, i6)) {
                        zzx = zzki.zzx(i7 << 3);
                        zzn = zzx + 8;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i7, i6)) {
                        int zzp = zzp(obj, j5);
                        zzx7 = zzki.zzx(i7 << 3);
                        zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i7, i6)) {
                        long zzz = zzz(obj, j5);
                        zzy = zzki.zzx(i7 << 3);
                        zzx3 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                        i5 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i7, i6)) {
                        zzn = zzki.zzt(i7, (zzmi) zznu.zzf(obj, j5), zzB(i6));
                        i5 += zzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zznk zznkVar = this.zzn;
        return i5 + zznkVar.zza(zznkVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i5;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int zzy = zzy(i8);
            int i9 = this.zzc[i8];
            long j5 = 1048575 & zzy;
            int i10 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i5 = i7 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j5));
                    byte[] bArr = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 1:
                    i6 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j5));
                    i7 = floatToIntBits + i6;
                    break;
                case 2:
                    i5 = i7 * 53;
                    doubleToLongBits = zznu.zzd(obj, j5);
                    byte[] bArr2 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 3:
                    i5 = i7 * 53;
                    doubleToLongBits = zznu.zzd(obj, j5);
                    byte[] bArr3 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 4:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 5:
                    i5 = i7 * 53;
                    doubleToLongBits = zznu.zzd(obj, j5);
                    byte[] bArr4 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 6:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 7:
                    i6 = i7 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j5));
                    i7 = floatToIntBits + i6;
                    break;
                case 8:
                    i6 = i7 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j5)).hashCode();
                    i7 = floatToIntBits + i6;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j5);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
                    break;
                case 10:
                    i6 = i7 * 53;
                    floatToIntBits = zznu.zzf(obj, j5).hashCode();
                    i7 = floatToIntBits + i6;
                    break;
                case 11:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 12:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 13:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 14:
                    i5 = i7 * 53;
                    doubleToLongBits = zznu.zzd(obj, j5);
                    byte[] bArr5 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 15:
                    i5 = i7 * 53;
                    zzc = zznu.zzc(obj, j5);
                    i7 = i5 + zzc;
                    break;
                case 16:
                    i5 = i7 * 53;
                    doubleToLongBits = zznu.zzd(obj, j5);
                    byte[] bArr6 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i5 + zzc;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j5);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i6 = i7 * 53;
                    floatToIntBits = zznu.zzf(obj, j5).hashCode();
                    i7 = floatToIntBits + i6;
                    break;
                case 50:
                    i6 = i7 * 53;
                    floatToIntBits = zznu.zzf(obj, j5).hashCode();
                    i7 = floatToIntBits + i6;
                    break;
                case 51:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j5));
                        byte[] bArr7 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j5));
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = zzz(obj, j5);
                        byte[] bArr8 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = zzz(obj, j5);
                        byte[] bArr9 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = zzz(obj, j5);
                        byte[] bArr10 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j5));
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j5)).hashCode();
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = zznu.zzf(obj, j5).hashCode();
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = zznu.zzf(obj, j5).hashCode();
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = zzz(obj, j5);
                        byte[] bArr11 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzp(obj, j5);
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i9, i8)) {
                        i5 = i7 * 53;
                        doubleToLongBits = zzz(obj, j5);
                        byte[] bArr12 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i9, i8)) {
                        i6 = i7 * 53;
                        floatToIntBits = zznu.zzf(obj, j5).hashCode();
                        i7 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i7 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0403, code lost:
    
        if (r6 == 1048575) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0405, code lost:
    
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x040b, code lost:
    
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x040f, code lost:
    
        if (r2 >= r8.zzl) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0411, code lost:
    
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0423, code lost:
    
        if (r5 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x042a, code lost:
    
        if (r8.zzA(r4) != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x042f, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0437, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x042c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0438, code lost:
    
        if (r9 != 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x043c, code lost:
    
        if (r0 != r32) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0443, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x044a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0446, code lost:
    
        if (r0 > r32) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0448, code lost:
    
        if (r3 != r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x044f, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x030e, code lost:
    
        if (r0 != r22) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0310, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x032c, code lost:
    
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0360, code lost:
    
        if (r0 != r15) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0388, code lost:
    
        if (r0 != r15) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i5 = 0; i5 < length; i5 += 3) {
                int zzy = zzy(i5);
                int i6 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j5 = i6;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zza(obj, j5);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j5);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j5, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzT(obj, this.zzc[i5], i5)) {
                        zzB(i5).zzf(zzb.getObject(obj, j5));
                    }
                }
                if (zzP(obj, i5)) {
                    zzB(i5).zzf(zzb.getObject(obj, j5));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzy = zzy(i5);
            int i6 = this.zzc[i5];
            long j5 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i5)) {
                        zznu.zzo(obj, j5, zznu.zza(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i5)) {
                        zznu.zzp(obj, j5, zznu.zzb(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i5)) {
                        zznu.zzr(obj, j5, zznu.zzd(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i5)) {
                        zznu.zzr(obj, j5, zznu.zzd(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i5)) {
                        zznu.zzr(obj, j5, zznu.zzd(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i5)) {
                        zznu.zzm(obj, j5, zznu.zzw(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i5)) {
                        zznu.zzs(obj, j5, zznu.zzf(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i5);
                    break;
                case 10:
                    if (zzP(obj2, i5)) {
                        zznu.zzs(obj, j5, zznu.zzf(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i5)) {
                        zznu.zzr(obj, j5, zznu.zzd(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i5)) {
                        zznu.zzq(obj, j5, zznu.zzc(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i5)) {
                        zznu.zzr(obj, j5, zznu.zzd(obj2, j5));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i5);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j5);
                    break;
                case 50:
                    int i7 = zzmv.zza;
                    zznu.zzs(obj, j5, zzmd.zzb(zznu.zzf(obj, j5), zznu.zzf(obj2, j5)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i6, i5)) {
                        zznu.zzs(obj, j5, zznu.zzf(obj2, j5));
                        zzK(obj, i6, i5);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i6, i5)) {
                        zznu.zzs(obj, j5, zznu.zzf(obj2, j5));
                        zzK(obj, i6, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i5);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e8, code lost:
    
        if (r0 != r24) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ea, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02fd, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0329, code lost:
    
        if (r0 != r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x034c, code lost:
    
        if (r0 != r14) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzy = zzy(i10);
                int i11 = this.zzc[i10];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i10)) {
                            zzocVar.zzf(i11, zznu.zza(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i10)) {
                            zzocVar.zzo(i11, zznu.zzb(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i10)) {
                            zzocVar.zzt(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i10)) {
                            zzocVar.zzJ(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i10)) {
                            zzocVar.zzr(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i10)) {
                            zzocVar.zzm(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i10)) {
                            zzocVar.zzk(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i10)) {
                            zzocVar.zzb(i11, zznu.zzw(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i10)) {
                            zzV(i11, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i10)) {
                            zzocVar.zzv(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i10)) {
                            zzocVar.zzd(i11, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i10)) {
                            zzocVar.zzH(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i10)) {
                            zzocVar.zzi(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i10)) {
                            zzocVar.zzw(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i10)) {
                            zzocVar.zzy(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i10)) {
                            zzocVar.zzA(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i10)) {
                            zzocVar.zzC(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i10)) {
                            zzocVar.zzq(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzmv.zzF(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzU(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i10));
                        break;
                    case 28:
                        zzmv.zzE(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzP(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzR(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzK(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i10));
                        break;
                    case 50:
                        zzN(zzocVar, i11, zznu.zzf(obj, zzy & 1048575), i10);
                        break;
                    case 51:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzf(i11, zzm(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzo(i11, zzn(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzt(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzJ(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzr(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzm(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzk(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzb(i11, zzU(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i11, i10)) {
                            zzV(i11, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzv(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzd(i11, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzH(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzi(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzw(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzy(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzA(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzC(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzq(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < length2) {
            int zzy2 = zzy(i12);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int zzx = zzx(zzy2);
            if (zzx <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i9;
                if (i17 != i14) {
                    i13 = unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i5 = 1 << (i16 >>> 20);
            } else {
                i5 = i8;
            }
            long j5 = zzy2 & i9;
            switch (zzx) {
                case 0:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzf(i15, zznu.zza(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzo(i15, zznu.zzb(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzt(i15, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzJ(i15, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzr(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzm(i15, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzk(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzb(i15, zznu.zzw(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzV(i15, unsafe.getObject(obj, j5), zzocVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzv(i15, unsafe.getObject(obj, j5), zzB(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzd(i15, (zzka) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzH(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzi(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzw(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzy(i15, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzA(i15, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzC(i15, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i6 = 0;
                    if ((i13 & i5) != 0) {
                        zzocVar.zzq(i15, unsafe.getObject(obj, j5), zzB(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i6 = 0;
                    zzmv.zzF(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 19:
                    i6 = 0;
                    zzmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 20:
                    i6 = 0;
                    zzmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 21:
                    i6 = 0;
                    zzmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 22:
                    i6 = 0;
                    zzmv.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 23:
                    i6 = 0;
                    zzmv.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 24:
                    i6 = 0;
                    zzmv.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 25:
                    i6 = 0;
                    zzmv.zzD(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    break;
                case 26:
                    zzmv.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar);
                    i6 = 0;
                    break;
                case 27:
                    zzmv.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, zzB(i12));
                    i6 = 0;
                    break;
                case 28:
                    zzmv.zzE(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar);
                    i6 = 0;
                    break;
                case 29:
                    i7 = 0;
                    zzmv.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 30:
                    i7 = 0;
                    zzmv.zzG(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 31:
                    i7 = 0;
                    zzmv.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 32:
                    i7 = 0;
                    zzmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 33:
                    i7 = 0;
                    zzmv.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 34:
                    i7 = 0;
                    zzmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, false);
                    i6 = i7;
                    break;
                case 35:
                    zzmv.zzF(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 36:
                    zzmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 37:
                    zzmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 38:
                    zzmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 39:
                    zzmv.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 40:
                    zzmv.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 41:
                    zzmv.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 42:
                    zzmv.zzD(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 43:
                    zzmv.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 44:
                    zzmv.zzG(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 45:
                    zzmv.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 46:
                    zzmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 47:
                    zzmv.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 48:
                    zzmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, true);
                    i6 = 0;
                    break;
                case 49:
                    zzmv.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j5), zzocVar, zzB(i12));
                    i6 = 0;
                    break;
                case 50:
                    zzN(zzocVar, i15, unsafe.getObject(obj, j5), i12);
                    i6 = 0;
                    break;
                case 51:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzf(i15, zzm(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 52:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzo(i15, zzn(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 53:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzt(i15, zzz(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 54:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzJ(i15, zzz(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 55:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzr(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 56:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzm(i15, zzz(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 57:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzk(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 58:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzb(i15, zzU(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 59:
                    if (zzT(obj, i15, i12)) {
                        zzV(i15, unsafe.getObject(obj, j5), zzocVar);
                    }
                    i6 = 0;
                    break;
                case 60:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzv(i15, unsafe.getObject(obj, j5), zzB(i12));
                    }
                    i6 = 0;
                    break;
                case 61:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzd(i15, (zzka) unsafe.getObject(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 62:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzH(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 63:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzi(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 64:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzw(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 65:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzy(i15, zzz(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 66:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzA(i15, zzp(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 67:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzC(i15, zzz(obj, j5));
                    }
                    i6 = 0;
                    break;
                case 68:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzq(i15, unsafe.getObject(obj, j5), zzB(i12));
                    }
                    i6 = 0;
                    break;
                default:
                    i6 = 0;
                    break;
            }
            i12 += 3;
            i8 = i6;
            i9 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzy = zzy(i5);
            long j5 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i5) && Double.doubleToLongBits(zznu.zza(obj, j5)) == Double.doubleToLongBits(zznu.zza(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i5) && Float.floatToIntBits(zznu.zzb(obj, j5)) == Float.floatToIntBits(zznu.zzb(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i5) && zznu.zzd(obj, j5) == zznu.zzd(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i5) && zznu.zzd(obj, j5) == zznu.zzd(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i5) && zznu.zzd(obj, j5) == zznu.zzd(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i5) && zznu.zzw(obj, j5) == zznu.zzw(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i5) && zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i5) && zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i5) && zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i5) && zznu.zzd(obj, j5) == zznu.zzd(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i5) && zznu.zzc(obj, j5) == zznu.zzc(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i5) && zznu.zzd(obj, j5) == zznu.zzd(obj2, j5)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i5) && zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzV = zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5));
                    break;
                case 50:
                    zzV = zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzv = zzv(i5) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzV(zznu.zzf(obj, j5), zznu.zzf(obj2, j5))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.zzk) {
            int i10 = this.zzj[i8];
            int i11 = this.zzc[i10];
            int zzy = zzy(i10);
            int i12 = this.zzc[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = zzb.getInt(obj, i13);
                }
                i6 = i7;
                i5 = i13;
            } else {
                i5 = i9;
                i6 = i7;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i10, i5, i6, i14)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i11, i10) && !zzR(obj, zzy, zzB(i10))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i10);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!zzB.zzk(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i10, i5, i6, i14) && !zzR(obj, zzy, zzB(i10))) {
                return false;
            }
            i8++;
            i9 = i5;
            i7 = i6;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
