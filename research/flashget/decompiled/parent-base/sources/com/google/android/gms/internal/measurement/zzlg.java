package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.parser.b;
import androidx.core.app.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlg<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk<?, ?> zzp;
    private final zzji<?> zzq;
    private final zzkv zzr;

    private zzlg(int[] iArr, Object[] objArr, int i4, int i5, zzlc zzlcVar, boolean z4, int[] iArr2, int i6, int i7, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzi = zzlcVar instanceof zzjt;
        this.zzh = zzjiVar != null && zzjiVar.zza(zzlcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i6;
        this.zzm = i7;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static <T> double zza(T t4, long j4) {
        return ((Double) zzml.zze(t4, j4)).doubleValue();
    }

    private static <T> float zzb(T t4, long j4) {
        return ((Float) zzml.zze(t4, j4)).floatValue();
    }

    private static <T> int zzc(T t4, long j4) {
        return ((Integer) zzml.zze(t4, j4)).intValue();
    }

    private static <T> long zzd(T t4, long j4) {
        return ((Long) zzml.zze(t4, j4)).longValue();
    }

    private final zzlu zze(int i4) {
        int i5 = (i4 / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i5];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zza2 = zzlq.zza().zza((Class) this.zzd[i5 + 1]);
        this.zzd[i5] = zza2;
        return zza2;
    }

    private final Object zzf(int i4) {
        return this.zzd[(i4 / 3) << 1];
    }

    private static boolean zzg(int i4) {
        return (i4 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i4, int i5, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int zzd = zzig.zzd(bArr, i4, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return zzd;
            case 2:
                return zzig.zza(bArr, i4, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i4));
                return i4 + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i4));
                return i4 + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i4));
                return i4 + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i4));
                return i4 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzig.zzc(bArr, i4, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzig.zzd(bArr, i4, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return zzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i4, i5, zzijVar);
            case 15:
                int zzc2 = zzig.zzc(bArr, i4, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzig.zzd(bArr, i4, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return zzd3;
            case 17:
                return zzig.zzb(bArr, i4, zzijVar);
            default:
                throw new RuntimeException(ProtectedSandApp.s("픶"));
        }
    }

    private final int zzc(int i4) {
        return this.zzc[i4 + 1];
    }

    private final zzjx zzd(int i4) {
        return (zzjx) this.zzd[((i4 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("피").concat(String.valueOf(obj)));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjt) {
            return ((zzjt) obj).zzco();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t4) {
        int i4;
        int zza2;
        int i5;
        int zzc;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzc2 = zzc(i7);
            int i10 = this.zzc[i7];
            long j4 = 1048575 & zzc2;
            int i11 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(Double.doubleToLongBits(zzml.zza(t4, j4)));
                    i6 = zza2 + i4;
                    break;
                case 1:
                    i4 = i6 * 53;
                    zza2 = Float.floatToIntBits(zzml.zzb(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 2:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 3:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 4:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 5:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 6:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 7:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzh(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 8:
                    i4 = i6 * 53;
                    zza2 = ((String) zzml.zze(t4, j4)).hashCode();
                    i6 = zza2 + i4;
                    break;
                case 9:
                    Object zze = zzml.zze(t4, j4);
                    if (zze != null) {
                        i11 = zze.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
                    break;
                case 10:
                    i4 = i6 * 53;
                    zza2 = zzml.zze(t4, j4).hashCode();
                    i6 = zza2 + i4;
                    break;
                case 11:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 12:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 13:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 14:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 15:
                    i5 = i6 * 53;
                    zzc = zzml.zzc(t4, j4);
                    i6 = i5 + zzc;
                    break;
                case 16:
                    i4 = i6 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t4, j4));
                    i6 = zza2 + i4;
                    break;
                case 17:
                    Object zze2 = zzml.zze(t4, j4);
                    if (zze2 != null) {
                        i11 = zze2.hashCode();
                    }
                    i6 = (i6 * 53) + i11;
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
                    i4 = i6 * 53;
                    zza2 = zzml.zze(t4, j4).hashCode();
                    i6 = zza2 + i4;
                    break;
                case 50:
                    i4 = i6 * 53;
                    zza2 = zzml.zze(t4, j4).hashCode();
                    i6 = zza2 + i4;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(Double.doubleToLongBits(zza(t4, j4)));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = Float.floatToIntBits(zzb(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zzd(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zzd(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zzd(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zze(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = ((String) zzml.zze(t4, j4)).hashCode();
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzml.zze(t4, j4).hashCode();
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzml.zze(t4, j4).hashCode();
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zzd(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i5 = i6 * 53;
                        zzc = zzc(t4, j4);
                        i6 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzjv.zza(zzd(t4, j4));
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlg<T>) t4, i10, i7)) {
                        i4 = i6 * 53;
                        zza2 = zzml.zze(t4, j4).hashCode();
                        i6 = zza2 + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t4).hashCode() + (i6 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t4).hashCode() : hashCode;
    }

    static zzmj zzc(Object obj) {
        zzjt zzjtVar = (zzjt) obj;
        zzmj zzmjVar = zzjtVar.zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzd = zzmj.zzd();
        zzjtVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(T t4) {
        if (zzg(t4)) {
            if (t4 instanceof zzjt) {
                zzjt zzjtVar = (zzjt) t4;
                zzjtVar.zzc(Integer.MAX_VALUE);
                zzjtVar.zza = 0;
                zzjtVar.zzcm();
            }
            int length = this.zzc.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int zzc = zzc(i4);
                long j4 = 1048575 & zzc;
                int i5 = (zzc & 267386880) >>> 20;
                if (i5 != 9) {
                    if (i5 != 60 && i5 != 68) {
                        switch (i5) {
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
                                this.zzo.zzb(t4, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t4, j4);
                                if (object != null) {
                                    unsafe.putObject(t4, j4, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzlg<T>) t4, this.zzc[i4], i4)) {
                        zze(i4).zzd(zzb.getObject(t4, j4));
                    }
                }
                if (zzc((zzlg<T>) t4, i4)) {
                    zze(i4).zzd(zzb.getObject(t4, j4));
                }
            }
            this.zzp.zzf(t4);
            if (this.zzh) {
                this.zzq.zzc(t4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzlu] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(T t4) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i10 = 0;
        while (i10 < this.zzl) {
            int i11 = this.zzk[i10];
            int i12 = this.zzc[i11];
            int zzc = zzc(i11);
            int i13 = this.zzc[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i6) {
                if (i14 != 1048575) {
                    i7 = zzb.getInt(t4, i14);
                }
                i5 = i7;
                i4 = i14;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & zzc) != 0 && !zza((zzlg<T>) t4, i11, i4, i5, i15)) {
                return false;
            }
            int i16 = (267386880 & zzc) >>> 20;
            if (i16 != 9 && i16 != 17) {
                if (i16 != 27) {
                    if (i16 == 60 || i16 == 68) {
                        if (zzc((zzlg<T>) t4, i12, i11) && !zza((Object) t4, zzc, zze(i11))) {
                            return false;
                        }
                    } else if (i16 != 49) {
                        if (i16 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzml.zze(t4, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i11)).zzc.zzb() == zzmz.zzi) {
                                ?? r12 = 0;
                                for (Object obj : zzd.values()) {
                                    r12 = r12;
                                    if (r12 == 0) {
                                        r12 = zzlq.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r12.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzml.zze(t4, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i11);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zze.zze(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zza((zzlg<T>) t4, i11, i4, i5, i15) && !zza((Object) t4, zzc, zze(i11))) {
                return false;
            }
            i10++;
            i6 = i4;
            i7 = i5;
        }
        return !this.zzh || this.zzq.zza(t4).zzg();
    }

    private final boolean zzc(T t4, T t5, int i4) {
        return zzc((zzlg<T>) t4, i4) == zzc((zzlg<T>) t5, i4);
    }

    private final boolean zzc(T t4, int i4) {
        int zzb2 = zzb(i4);
        long j4 = zzb2 & 1048575;
        if (j4 != 1048575) {
            return (zzml.zzc(t4, j4) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i4);
        long j5 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t4, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t4, j5)) != 0;
            case 2:
                return zzml.zzd(t4, j5) != 0;
            case 3:
                return zzml.zzd(t4, j5) != 0;
            case 4:
                return zzml.zzc(t4, j5) != 0;
            case 5:
                return zzml.zzd(t4, j5) != 0;
            case 6:
                return zzml.zzc(t4, j5) != 0;
            case 7:
                return zzml.zzh(t4, j5);
            case 8:
                Object zze = zzml.zze(t4, j5);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzik) {
                    return !zzik.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t4, j5) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t4, j5));
            case 11:
                return zzml.zzc(t4, j5) != 0;
            case 12:
                return zzml.zzc(t4, j5) != 0;
            case 13:
                return zzml.zzc(t4, j5) != 0;
            case 14:
                return zzml.zzd(t4, j5) != 0;
            case 15:
                return zzml.zzc(t4, j5) != 0;
            case 16:
                return zzml.zzd(t4, j5) != 0;
            case 17:
                return zzml.zze(t4, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t4) {
        int i4;
        int i5;
        int i6;
        int zza2;
        int zzb2;
        int zza3;
        int zzh;
        boolean z4;
        int zzc;
        int zzd;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.zzc.length) {
            int zzc2 = zzc(i12);
            int i14 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr[i12 + 2];
            int i17 = i16 & i7;
            if (i14 <= 17) {
                if (i17 != i10) {
                    i11 = i17 == i7 ? 0 : unsafe.getInt(t4, i17);
                    i10 = i17;
                }
                i4 = i10;
                i5 = i11;
                i6 = 1 << (i16 >>> 20);
            } else {
                i4 = i10;
                i5 = i11;
                i6 = 0;
            }
            long j4 = zzc2 & i7;
            if (i14 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            switch (i14) {
                case 0:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zza(i15, p.f60679p);
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zza(i15, 0.0f);
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zzd(i15, unsafe.getLong(t4, j4));
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zzg(i15, unsafe.getLong(t4, j4));
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zzg(i15, unsafe.getInt(t4, j4));
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zzc(i15, 0L);
                        i13 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza2 = zzjc.zzf(i15, 0);
                        i13 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zzb(i15, true);
                        i13 += zzb2;
                    }
                    break;
                case 8:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        Object object = unsafe.getObject(t4, j4);
                        if (object instanceof zzik) {
                            zzb2 = zzjc.zzc(i15, (zzik) object);
                        } else {
                            zzb2 = zzjc.zzb(i15, (String) object);
                        }
                        i13 += zzb2;
                    }
                    break;
                case 9:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza3 = zzlw.zza(i15, unsafe.getObject(t4, j4), (zzlu<?>) zze(i12));
                        i13 += zza3;
                    }
                    break;
                case 10:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zzc(i15, (zzik) unsafe.getObject(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 11:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zzj(i15, unsafe.getInt(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 12:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zze(i15, unsafe.getInt(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 13:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzh = zzjc.zzh(i15, 0);
                        i13 += zzh;
                    }
                    break;
                case 14:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zze(i15, 0L);
                        i13 += zzb2;
                    }
                    break;
                case 15:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zzi(i15, unsafe.getInt(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 16:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zzb2 = zzjc.zzf(i15, unsafe.getLong(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 17:
                    if (zza((zzlg<T>) t4, i12, i4, i5, i6)) {
                        zza3 = zzjc.zzb(i15, (zzlc) unsafe.getObject(t4, j4), zze(i12));
                        i13 += zza3;
                    }
                    break;
                case 18:
                    zza3 = zzlw.zzd(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zza3;
                    break;
                case 19:
                    z4 = false;
                    zzc = zzlw.zzc(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 20:
                    z4 = false;
                    zzc = zzlw.zzf(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 21:
                    z4 = false;
                    zzc = zzlw.zzj(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 22:
                    z4 = false;
                    zzc = zzlw.zze(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 23:
                    z4 = false;
                    zzc = zzlw.zzd(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 24:
                    z4 = false;
                    zzc = zzlw.zzc(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 25:
                    z4 = false;
                    zzc = zzlw.zza(i15, (List<?>) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 26:
                    zza3 = zzlw.zzb(i15, (List) unsafe.getObject(t4, j4));
                    i13 += zza3;
                    break;
                case 27:
                    zza3 = zzlw.zzb(i15, (List<?>) unsafe.getObject(t4, j4), (zzlu<?>) zze(i12));
                    i13 += zza3;
                    break;
                case 28:
                    zza3 = zzlw.zza(i15, (List<zzik>) unsafe.getObject(t4, j4));
                    i13 += zza3;
                    break;
                case 29:
                    zza3 = zzlw.zzi(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zza3;
                    break;
                case 30:
                    z4 = false;
                    zzc = zzlw.zzb(i15, (List<Integer>) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 31:
                    z4 = false;
                    zzc = zzlw.zzc(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 32:
                    z4 = false;
                    zzc = zzlw.zzd(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 33:
                    z4 = false;
                    zzc = zzlw.zzg(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 34:
                    z4 = false;
                    zzc = zzlw.zzh(i15, (List) unsafe.getObject(t4, j4), false);
                    i13 += zzc;
                    break;
                case 35:
                    zzd = zzlw.zzd((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 36:
                    zzd = zzlw.zzc((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 37:
                    zzd = zzlw.zzf((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 38:
                    zzd = zzlw.zzj((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 39:
                    zzd = zzlw.zze((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 40:
                    zzd = zzlw.zzd((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 41:
                    zzd = zzlw.zzc((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 42:
                    zzd = zzlw.zza((List<?>) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 43:
                    zzd = zzlw.zzi((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 44:
                    zzd = zzlw.zzb((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 45:
                    zzd = zzlw.zzc((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 46:
                    zzd = zzlw.zzd((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 47:
                    zzd = zzlw.zzg((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 48:
                    zzd = zzlw.zzh((List) unsafe.getObject(t4, j4));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i15);
                        zzj = zzjc.zzj(zzd);
                        i13 += zzj + zzi + zzd;
                    }
                    break;
                case 49:
                    zza3 = zzlw.zza(i15, (List<zzlc>) unsafe.getObject(t4, j4), (zzlu<?>) zze(i12));
                    i13 += zza3;
                    break;
                case 50:
                    zza3 = this.zzr.zza(i15, unsafe.getObject(t4, j4), zzf(i12));
                    i13 += zza3;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zza(i15, p.f60679p);
                        i13 += zzb2;
                    }
                    break;
                case 52:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zza(i15, 0.0f);
                        i13 += zzb2;
                    }
                    break;
                case 53:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzd(i15, zzd(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 54:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzg(i15, zzd(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 55:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzg(i15, zzc(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 56:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzc(i15, 0L);
                        i13 += zzb2;
                    }
                    break;
                case 57:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzh = zzjc.zzf(i15, 0);
                        i13 += zzh;
                    }
                    break;
                case 58:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzb(i15, true);
                        i13 += zzb2;
                    }
                    break;
                case 59:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        Object object2 = unsafe.getObject(t4, j4);
                        if (object2 instanceof zzik) {
                            zzb2 = zzjc.zzc(i15, (zzik) object2);
                        } else {
                            zzb2 = zzjc.zzb(i15, (String) object2);
                        }
                        i13 += zzb2;
                    }
                    break;
                case 60:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zza3 = zzlw.zza(i15, unsafe.getObject(t4, j4), (zzlu<?>) zze(i12));
                        i13 += zza3;
                    }
                    break;
                case 61:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzc(i15, (zzik) unsafe.getObject(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 62:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzj(i15, zzc(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 63:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zze(i15, zzc(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 64:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzh = zzjc.zzh(i15, 0);
                        i13 += zzh;
                    }
                    break;
                case 65:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zze(i15, 0L);
                        i13 += zzb2;
                    }
                    break;
                case 66:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzi(i15, zzc(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 67:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zzb2 = zzjc.zzf(i15, zzd(t4, j4));
                        i13 += zzb2;
                    }
                    break;
                case 68:
                    if (zzc((zzlg<T>) t4, i15, i12)) {
                        zza3 = zzjc.zzb(i15, (zzlc) unsafe.getObject(t4, j4), zze(i12));
                        i13 += zza3;
                    }
                    break;
            }
            i12 += 3;
            i10 = i4;
            i11 = i5;
            i7 = 1048575;
        }
        int i18 = 0;
        zzmk<?, ?> zzmkVar = this.zzp;
        int zza4 = i13 + zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t4));
        if (!this.zzh) {
            return zza4;
        }
        zzjm<?> zza5 = this.zzq.zza(t4);
        int zza6 = zza5.zza.zza();
        for (int i19 = 0; i19 < zza6; i19++) {
            Map.Entry<?, Object> zza7 = zza5.zza.zza(i19);
            i18 += zzjm.zza((zzjo<?>) zza7.getKey(), zza7.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i18 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i18;
    }

    private static <T> boolean zze(T t4, long j4) {
        return ((Boolean) zzml.zze(t4, j4)).booleanValue();
    }

    private final boolean zzc(T t4, int i4, int i5) {
        return zzml.zzc(t4, (long) (zzb(i5) & 1048575)) == i4;
    }

    private final int zzb(int i4) {
        return this.zzc[i4 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t4, T t5, int i4) {
        int i5 = this.zzc[i4];
        if (zzc((zzlg<T>) t5, i5, i4)) {
            long zzc = zzc(i4) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, zzc);
            if (object != null) {
                zzlu zze = zze(i4);
                if (!zzc((zzlg<T>) t4, i5, i4)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t4, zzc, zza2);
                    }
                    zzb((zzlg<T>) t4, i5, i4);
                    return;
                }
                Object object2 = unsafe.getObject(t4, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t4, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException(i0.a(ProtectedSandApp.s("픺"), this.zzc[i4], ProtectedSandApp.s("픻"), String.valueOf(t5)));
        }
    }

    private final void zzb(T t4, int i4) {
        int zzb2 = zzb(i4);
        long j4 = 1048575 & zzb2;
        if (j4 == 1048575) {
            return;
        }
        zzml.zza((Object) t4, j4, (1 << (zzb2 >>> 20)) | zzml.zzc(t4, j4));
    }

    private final void zzb(T t4, int i4, int i5) {
        zzml.zza((Object) t4, zzb(i5) & 1048575, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzml.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzml.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzml.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzml.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d79, code lost:
    
        if (r13 == r8) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d7b, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d81, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d88, code lost:
    
        if (r6 >= r11.zzm) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d8a, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmj) zza((java.lang.Object) r33, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.measurement.zzmk<UT, int>) r11.zzp, (java.lang.Object) r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0da0, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0da2, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0da7, code lost:
    
        if (r9 != 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dab, code lost:
    
        if (r7 != r36) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0db9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0db5, code lost:
    
        if (r7 > r36) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0db7, code lost:
    
        if (r10 != r9) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dbe, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.measurement.zzij r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzij):int");
    }

    private final int zza(int i4) {
        if (i4 < this.zze || i4 > this.zzf) {
            return -1;
        }
        return zza(i4, 0);
    }

    private final int zza(int i4, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i10 = this.zzc[i7];
            if (i4 == i10) {
                return i7;
            }
            if (i4 < i10) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.measurement.zzlg<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.zzla r33, com.google.android.gms.internal.measurement.zzlk r34, com.google.android.gms.internal.measurement.zzkm r35, com.google.android.gms.internal.measurement.zzmk<?, ?> r36, com.google.android.gms.internal.measurement.zzji<?> r37, com.google.android.gms.internal.measurement.zzkv r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzmk, com.google.android.gms.internal.measurement.zzji, com.google.android.gms.internal.measurement.zzkv):com.google.android.gms.internal.measurement.zzlg");
    }

    private final <UT, UB> UB zza(Object obj, int i4, UB ub, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzd;
        int i5 = this.zzc[i4];
        Object zze = zzml.zze(obj, zzc(i4) & 1048575);
        return (zze == null || (zzd = zzd(i4)) == null) ? ub : (UB) zza(i4, i5, this.zzr.zze(zze), zzd, (zzjx) ub, (zzmk<UT, zzjx>) zzmkVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i4, int i5, Map<K, V> map, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zza2 = this.zzr.zza(zzf(i4));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmkVar.zzc(obj);
                }
                zzit zzc = zzik.zzc(zzku.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmkVar.zza((zzmk<UT, UB>) ub, i5, zzc.zza());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i4) {
        zzlu zze = zze(i4);
        long zzc = zzc(i4) & 1048575;
        if (!zzc((zzlg<T>) t4, i4)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t4, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i4, int i5) {
        zzlu zze = zze(i5);
        if (!zzc((zzlg<T>) t4, i4, i5)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t4, zzc(i5) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a5 = b.a(ProtectedSandApp.s("픷"), str, ProtectedSandApp.s("픸"), name, ProtectedSandApp.s("픹"));
            a5.append(arrays);
            throw new RuntimeException(a5.toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t4, T t5) {
        zzf(t4);
        t5.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzc = zzc(i4);
            long j4 = 1048575 & zzc;
            int i5 = this.zzc[i4];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza(t4, j4, zzml.zza(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzb(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzd(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzd(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzd(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zzc(t4, j4, zzml.zzh(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza(t4, j4, zzml.zze(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t4, t5, i4);
                    break;
                case 10:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza(t4, j4, zzml.zze(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzd(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzc(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlg<T>) t5, i4)) {
                        zzml.zza((Object) t4, j4, zzml.zzd(t5, j4));
                        zzb((zzlg<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t4, t5, i4);
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
                    this.zzo.zza(t4, t5, j4);
                    break;
                case 50:
                    zzlw.zza(this.zzr, t4, t5, j4);
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
                    if (zzc((zzlg<T>) t5, i5, i4)) {
                        zzml.zza(t4, j4, zzml.zze(t5, j4));
                        zzb((zzlg<T>) t4, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t4, t5, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlg<T>) t5, i5, i4)) {
                        zzml.zza(t4, j4, zzml.zze(t5, j4));
                        zzb((zzlg<T>) t4, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t4, t5, i4);
                    break;
            }
        }
        zzlw.zza(this.zzp, t4, t5);
        if (this.zzh) {
            zzlw.zza(this.zzq, t4, t5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:51:0x00c5, B:14:0x00d3, B:33:0x062b, B:35:0x0630, B:36:0x0635, B:88:0x00ff, B:91:0x0114, B:93:0x0125, B:95:0x0136, B:97:0x0147, B:99:0x0158, B:101:0x0162, B:104:0x0169, B:105:0x016e, B:107:0x017b, B:109:0x018c, B:111:0x019a, B:113:0x01ac, B:115:0x01b4, B:117:0x01c6, B:119:0x01d8, B:121:0x01ea, B:123:0x01fc, B:125:0x020e, B:127:0x0220, B:129:0x0232, B:131:0x0244, B:133:0x0254, B:134:0x0275, B:135:0x025e, B:137:0x0266, B:139:0x0286, B:141:0x0298, B:143:0x02a6, B:145:0x02b4, B:147:0x02c2), top: B:50:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x063b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0665 A[LOOP:3: B:58:0x0661->B:60:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0679  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlr] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzlr r19, com.google.android.gms.internal.measurement.zzjg r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t4, byte[] bArr, int i4, int i5, zzij zzijVar) throws IOException {
        zza((zzlg<T>) t4, bArr, i4, i5, 0, zzijVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t4, T t5, int i4) {
        if (zzc((zzlg<T>) t5, i4)) {
            long zzc = zzc(i4) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, zzc);
            if (object != null) {
                zzlu zze = zze(i4);
                if (!zzc((zzlg<T>) t4, i4)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t4, zzc, zza2);
                    }
                    zzb((zzlg<T>) t4, i4);
                    return;
                }
                Object object2 = unsafe.getObject(t4, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t4, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException(i0.a(ProtectedSandApp.s("픺"), this.zzc[i4], ProtectedSandApp.s("픻"), String.valueOf(t5)));
        }
    }

    private final void zza(Object obj, int i4, zzlr zzlrVar) throws IOException {
        if (zzg(i4)) {
            zzml.zza(obj, i4 & 1048575, zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, i4 & 1048575, zzlrVar.zzq());
        } else {
            zzml.zza(obj, i4 & 1048575, zzlrVar.zzp());
        }
    }

    private final void zza(T t4, int i4, Object obj) {
        zzb.putObject(t4, zzc(i4) & 1048575, obj);
        zzb((zzlg<T>) t4, i4);
    }

    private final void zza(T t4, int i4, int i5, Object obj) {
        zzb.putObject(t4, zzc(i5) & 1048575, obj);
        zzb((zzlg<T>) t4, i4, i5);
    }

    private final <K, V> void zza(zznb zznbVar, int i4, Object obj, int i5) throws IOException {
        if (obj != null) {
            zznbVar.zza(i4, this.zzr.zza(zzf(i5)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i4, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i4, (String) obj);
        } else {
            zznbVar.zza(i4, (zzik) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b90  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznb):void");
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t4, zznb zznbVar) throws IOException {
        zzmkVar.zzb((zzmk<UT, UB>) zzmkVar.zzd(t4), zznbVar);
    }

    private final boolean zza(T t4, int i4, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return zzc((zzlg<T>) t4, i4);
        }
        return (i6 & i7) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i4, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i4 & 1048575));
    }
}
