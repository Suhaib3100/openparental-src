package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.n1;
import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzlj extends zzku {
    zzlj(zzlh zzlhVar) {
        super(zzlhVar);
    }

    static final void zzA(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str, Object obj) {
        List zzp = zzfsVar.zzp();
        int i5 = 0;
        while (true) {
            if (i5 >= zzp.size()) {
                i5 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i5)).zzg())) {
                break;
            } else {
                i5++;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i5 >= 0) {
            zzfsVar.zzj(i5, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    @n1
    static final boolean zzB(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.zzfx zzC(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    static final Object zzD(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        com.google.android.gms.internal.measurement.zzfx zzC = zzC(zzftVar, str);
        if (zzC == null) {
            return null;
        }
        if (zzC.zzy()) {
            return zzC.zzh();
        }
        if (zzC.zzw()) {
            return Long.valueOf(zzC.zzd());
        }
        if (zzC.zzu()) {
            return Double.valueOf(zzC.zza());
        }
        if (zzC.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfx> zzi = zzC.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzE(StringBuilder sb, int i5, List list) {
        if (list == null) {
            return;
        }
        int i6 = i5 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it.next();
            if (zzfxVar != null) {
                zzG(sb, i6);
                sb.append(ProtectedSandApp.s("㇑"));
                zzJ(sb, i6, ProtectedSandApp.s("㇒"), zzfxVar.zzx() ? this.zzt.zzj().zze(zzfxVar.zzg()) : null);
                zzJ(sb, i6, ProtectedSandApp.s("㇓"), zzfxVar.zzy() ? zzfxVar.zzh() : null);
                zzJ(sb, i6, ProtectedSandApp.s("㇔"), zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                zzJ(sb, i6, ProtectedSandApp.s("㇕"), zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    zzE(sb, i6, zzfxVar.zzi());
                }
                zzG(sb, i6);
                sb.append(ProtectedSandApp.s("㇖"));
            }
        }
    }

    private final void zzF(StringBuilder sb, int i5, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String s5;
        if (zzemVar == null) {
            return;
        }
        zzG(sb, i5);
        sb.append(ProtectedSandApp.s("㇗"));
        if (zzemVar.zzh()) {
            zzJ(sb, i5, ProtectedSandApp.s("㇘"), Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            zzJ(sb, i5, ProtectedSandApp.s("㇙"), this.zzt.zzj().zze(zzemVar.zze()));
        }
        boolean zzk = zzemVar.zzk();
        String s6 = ProtectedSandApp.s("㇚");
        if (zzk) {
            int i6 = i5 + 1;
            com.google.android.gms.internal.measurement.zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                zzG(sb, i6);
                sb.append(ProtectedSandApp.s("㇛"));
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            s5 = ProtectedSandApp.s("㇢");
                            break;
                        case 2:
                            s5 = ProtectedSandApp.s("㇡");
                            break;
                        case 3:
                            s5 = ProtectedSandApp.s("㇠");
                            break;
                        case 4:
                            s5 = ProtectedSandApp.s("㇟");
                            break;
                        case 5:
                            s5 = ProtectedSandApp.s("㇞");
                            break;
                        case 6:
                            s5 = ProtectedSandApp.s("㇝");
                            break;
                        default:
                            s5 = ProtectedSandApp.s("㇜");
                            break;
                    }
                    zzJ(sb, i6, ProtectedSandApp.s("㇣"), s5);
                }
                if (zzd.zzh()) {
                    zzJ(sb, i6, ProtectedSandApp.s("\u31e4"), zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzJ(sb, i6, ProtectedSandApp.s("\u31e5"), Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzG(sb, i6 + 1);
                    sb.append(ProtectedSandApp.s("\u31e6"));
                    for (String str : zzd.zze()) {
                        zzG(sb, i6 + 2);
                        sb.append(str);
                        sb.append(ProtectedSandApp.s("\u31e7"));
                    }
                    sb.append(s6);
                }
                zzG(sb, i6);
                sb.append(s6);
            }
        }
        if (zzemVar.zzi()) {
            zzK(sb, i5 + 1, ProtectedSandApp.s("\u31e8"), zzemVar.zzc());
        }
        zzG(sb, i5);
        sb.append(s6);
    }

    private static final void zzG(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(ProtectedSandApp.s("\u31e9"));
        }
    }

    private static final String zzH(boolean z5, boolean z6, boolean z7) {
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append(ProtectedSandApp.s("\u31ea"));
        }
        if (z6) {
            sb.append(ProtectedSandApp.s("\u31eb"));
        }
        if (z7) {
            sb.append(ProtectedSandApp.s("\u31ec"));
        }
        return sb.toString();
    }

    private static final void zzI(StringBuilder sb, int i5, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        zzG(sb, 3);
        sb.append(str);
        sb.append(ProtectedSandApp.s("\u31ed"));
        int zzb = zzgiVar.zzb();
        String s5 = ProtectedSandApp.s("\u31ee");
        if (zzb != 0) {
            zzG(sb, 4);
            sb.append(ProtectedSandApp.s("\u31ef"));
            int i6 = 0;
            for (Long l5 : zzgiVar.zzi()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(s5);
                }
                sb.append(l5);
                i6 = i7;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            zzG(sb, 4);
            sb.append(ProtectedSandApp.s("ㇰ"));
            int i8 = 0;
            for (Long l6 : zzgiVar.zzk()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(s5);
                }
                sb.append(l6);
                i8 = i9;
            }
            sb.append('\n');
        }
        int zza = zzgiVar.zza();
        String s6 = ProtectedSandApp.s("ㇱ");
        if (zza != 0) {
            zzG(sb, 4);
            sb.append(ProtectedSandApp.s("ㇲ"));
            int i10 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(s5);
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(ProtectedSandApp.s("ㇳ"));
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i10 = i11;
            }
            sb.append(s6);
        }
        if (zzgiVar.zzc() != 0) {
            zzG(sb, 4);
            sb.append(ProtectedSandApp.s("ㇴ"));
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzj()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(s5);
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(ProtectedSandApp.s("ㇵ"));
                Iterator it = zzgkVar.zzf().iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb.append(s5);
                    }
                    sb.append(longValue);
                    i14 = i15;
                }
                sb.append(ProtectedSandApp.s("ㇶ"));
                i12 = i13;
            }
            sb.append(s6);
        }
        zzG(sb, 3);
        sb.append(s6);
    }

    private static final void zzJ(StringBuilder sb, int i5, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzG(sb, i5 + 1);
        sb.append(str);
        sb.append(ProtectedSandApp.s("ㇷ"));
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzK(StringBuilder sb, int i5, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzerVar == null) {
            return;
        }
        zzG(sb, i5);
        sb.append(str);
        sb.append(ProtectedSandApp.s("ㇸ"));
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            zzJ(sb, i5, ProtectedSandApp.s("ㇾ"), zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? ProtectedSandApp.s("ㇹ") : ProtectedSandApp.s("ㇺ") : ProtectedSandApp.s("ㇻ") : ProtectedSandApp.s("ㇼ") : ProtectedSandApp.s("ㇽ"));
        }
        if (zzerVar.zzi()) {
            zzJ(sb, i5, ProtectedSandApp.s("ㇿ"), Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            zzJ(sb, i5, ProtectedSandApp.s("㈀"), zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            zzJ(sb, i5, ProtectedSandApp.s("㈁"), zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            zzJ(sb, i5, ProtectedSandApp.s("㈂"), zzerVar.zzd());
        }
        zzG(sb, i5);
        sb.append(ProtectedSandApp.s("㈃"));
    }

    static int zza(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i5 = 0; i5 < zzgcVar.zzb(); i5++) {
            if (str.equals(zzgcVar.zzap(i5).zzf())) {
                return i5;
            }
        }
        return -1;
    }

    static zzmh zzm(zzmh zzmhVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzll {
        com.google.android.gms.internal.measurement.zzkn zza = com.google.android.gms.internal.measurement.zzkn.zza();
        return zza != null ? zzmhVar.zzaz(bArr, zza) : zzmhVar.zzay(bArr);
    }

    static List zzs(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            long j5 = 0;
            for (int i6 = 0; i6 < 64; i6++) {
                int i7 = (i5 * 64) + i6;
                if (i7 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i7)) {
                    j5 |= 1 << i6;
                }
            }
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    static boolean zzw(List list, int i5) {
        if (i5 < list.size() * 64) {
            return ((1 << (i5 % 64)) & ((Long) list.get(i5 / 64)).longValue()) != 0;
        }
        return false;
    }

    static boolean zzy(String str) {
        return str != null && str.matches(ProtectedSandApp.s("㈄")) && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }

    final long zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzf(str.getBytes(Charset.forName(ProtectedSandApp.s("㈅"))));
    }

    @n1
    final long zzf(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzt.zzv().zzg();
        MessageDigest zzF = zzlp.zzF();
        if (zzF != null) {
            return zzlp.zzp(zzF.digest(bArr));
        }
        a.a(this.zzt, ProtectedSandApp.s("㈆"));
        return 0L;
    }

    final Bundle zzh(Map map, boolean z5) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z5) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(zzh((Map) arrayList.get(i5), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    final Parcelable zzi(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("㈇"));
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final zzau zzj(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzh = zzh(zzaaVar.zze(), true);
        String s5 = ProtectedSandApp.s("㈈");
        String s6 = (!zzh.containsKey(s5) || (obj = zzh.get(s5)) == null) ? ProtectedSandApp.s("㈉") : obj.toString();
        String zzb = zzhc.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzau(zzb, new zzas(zzh), s6, zzaaVar.zza());
    }

    final com.google.android.gms.internal.measurement.zzft zzl(zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
        zze.zzl(zzapVar.zze);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
            zze2.zzj(next);
            Object zzf = zzapVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzu(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzft) zze.zzaD();
    }

    final String zzo(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder a6 = r.a(ProtectedSandApp.s("㈊"));
        Iterator it = zzgbVar.zzd().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String s5 = ProtectedSandApp.s("㈋");
            if (!hasNext) {
                a6.append(s5);
                return a6.toString();
            }
            com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) it.next();
            if (zzgdVar != null) {
                zzG(a6, 1);
                a6.append(ProtectedSandApp.s("㈌"));
                if (zzgdVar.zzbl()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈍"), Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                if (this.zzt.zzf().zzs(zzgdVar.zzy(), zzeg.zzao) && zzgdVar.zzbo()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈎"), zzgdVar.zzL());
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈏"), zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈐"), Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈑"), Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈒"), Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈓"), Long.valueOf(zzgdVar.zzh()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈔"), zzgdVar.zzG());
                zzJ(a6, 1, ProtectedSandApp.s("㈕"), zzgdVar.zzx());
                zzJ(a6, 1, ProtectedSandApp.s("㈖"), zzgdVar.zzy());
                zzJ(a6, 1, ProtectedSandApp.s("㈗"), zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈘"), Integer.valueOf(zzgdVar.zza()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈙"), zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈚"), Long.valueOf(zzgdVar.zzi()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈛"), zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈜"), Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈝"), Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈞"), Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    zzJ(a6, 1, ProtectedSandApp.s("\u321f"), Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈠"), Long.valueOf(zzgdVar.zzn()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈡"), zzgdVar.zzz());
                zzJ(a6, 1, ProtectedSandApp.s("㈢"), zzgdVar.zzK());
                zzJ(a6, 1, ProtectedSandApp.s("㈣"), zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈤"), Boolean.valueOf(zzgdVar.zzaY()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈥"), zzgdVar.zzI());
                zzJ(a6, 1, ProtectedSandApp.s("㈦"), zzgdVar.zzD());
                zzJ(a6, 1, ProtectedSandApp.s("㈧"), zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈨"), Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈩"), Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈪"), Boolean.valueOf(zzgdVar.zzaZ()));
                }
                zzJ(a6, 1, ProtectedSandApp.s("㈫"), zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈬"), Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈭"), zzgdVar.zzC());
                }
                zzpz.zzc();
                if (this.zzt.zzf().zzs(null, zzeg.zzaE) && zzgdVar.zzbq()) {
                    zzJ(a6, 1, ProtectedSandApp.s("㈮"), Long.valueOf(zzgdVar.zzq()));
                }
                List<com.google.android.gms.internal.measurement.zzgm> zzP = zzgdVar.zzP();
                String s6 = ProtectedSandApp.s("㈯");
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzP) {
                        if (zzgmVar != null) {
                            zzG(a6, 2);
                            a6.append(ProtectedSandApp.s("㈰"));
                            zzJ(a6, 2, ProtectedSandApp.s("㈱"), zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            zzJ(a6, 2, s6, this.zzt.zzj().zzf(zzgmVar.zzf()));
                            zzJ(a6, 2, ProtectedSandApp.s("㈲"), zzgmVar.zzg());
                            zzJ(a6, 2, ProtectedSandApp.s("㈳"), zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            zzJ(a6, 2, ProtectedSandApp.s("㈴"), zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            zzG(a6, 2);
                            a6.append(s5);
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : zzN) {
                        if (zzfpVar != null) {
                            zzG(a6, 2);
                            a6.append(ProtectedSandApp.s("㈵"));
                            if (zzfpVar.zzk()) {
                                zzJ(a6, 2, ProtectedSandApp.s("㈶"), Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                zzJ(a6, 2, ProtectedSandApp.s("㈷"), Boolean.valueOf(zzfpVar.zzj()));
                            }
                            zzI(a6, 2, ProtectedSandApp.s("㈸"), zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                zzI(a6, 2, ProtectedSandApp.s("㈹"), zzfpVar.zze());
                            }
                            zzG(a6, 2);
                            a6.append(s5);
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzft> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzft zzftVar : zzO) {
                        if (zzftVar != null) {
                            zzG(a6, 2);
                            a6.append(ProtectedSandApp.s("㈺"));
                            zzJ(a6, 2, s6, this.zzt.zzj().zzd(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                zzJ(a6, 2, ProtectedSandApp.s("㈻"), Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                zzJ(a6, 2, ProtectedSandApp.s("㈼"), Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                zzJ(a6, 2, ProtectedSandApp.s("㈽"), Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                zzE(a6, 2, zzftVar.zzi());
                            }
                            zzG(a6, 2);
                            a6.append(s5);
                        }
                    }
                }
                zzG(a6, 1);
                a6.append(s5);
            }
        }
    }

    final String zzp(com.google.android.gms.internal.measurement.zzek zzekVar) {
        if (zzekVar == null) {
            return ProtectedSandApp.s("㈾");
        }
        StringBuilder a6 = r.a(ProtectedSandApp.s("㈿"));
        if (zzekVar.zzp()) {
            zzJ(a6, 0, ProtectedSandApp.s("㉀"), Integer.valueOf(zzekVar.zzb()));
        }
        zzJ(a6, 0, ProtectedSandApp.s("㉁"), this.zzt.zzj().zzd(zzekVar.zzg()));
        String zzH = zzH(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!zzH.isEmpty()) {
            zzJ(a6, 0, ProtectedSandApp.s("㉂"), zzH);
        }
        if (zzekVar.zzo()) {
            zzK(a6, 1, ProtectedSandApp.s("㉃"), zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            a6.append(ProtectedSandApp.s("㉄"));
            Iterator it = zzekVar.zzh().iterator();
            while (it.hasNext()) {
                zzF(a6, 2, (com.google.android.gms.internal.measurement.zzem) it.next());
            }
        }
        zzG(a6, 1);
        a6.append(ProtectedSandApp.s("㉅"));
        return a6.toString();
    }

    final String zzq(com.google.android.gms.internal.measurement.zzet zzetVar) {
        if (zzetVar == null) {
            return ProtectedSandApp.s("㉆");
        }
        StringBuilder a6 = r.a(ProtectedSandApp.s("㉇"));
        if (zzetVar.zzj()) {
            zzJ(a6, 0, ProtectedSandApp.s("㉈"), Integer.valueOf(zzetVar.zza()));
        }
        zzJ(a6, 0, ProtectedSandApp.s("㉉"), this.zzt.zzj().zzf(zzetVar.zze()));
        String zzH = zzH(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!zzH.isEmpty()) {
            zzJ(a6, 0, ProtectedSandApp.s("㉊"), zzH);
        }
        zzF(a6, 1, zzetVar.zzb());
        a6.append(ProtectedSandApp.s("㉋"));
        return a6.toString();
    }

    final List zzr(List list, List list2) {
        int i5;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㉌"), num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzt.zzaA().zzk().zzc(ProtectedSandApp.s("㉍"), num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i6 = size2;
            i5 = size;
            size = i6;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(zzt((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map zzt(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzt(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzt(android.os.Bundle, boolean):java.util.Map");
    }

    final void zzu(com.google.android.gms.internal.measurement.zzfw zzfwVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㉎"), obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                    zze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zze2.zzh(((Double) obj2).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
                }
            }
        }
        zzfwVar.zzb(arrayList);
    }

    final void zzv(com.google.android.gms.internal.measurement.zzgl zzglVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㉏"), obj);
        }
    }

    final boolean zzx(long j5, long j6) {
        return j5 == 0 || j6 <= 0 || Math.abs(this.zzt.zzax().currentTimeMillis() - j5) > j6;
    }

    final byte[] zzz(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㉐"), e6);
            throw e6;
        }
    }
}
