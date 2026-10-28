package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.n1;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzoo extends zznr {
    zzoo(zznv zznvVar) {
        super(zznvVar);
    }

    static int zza(zzfy.zzk.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i4 = 0; i4 < zzaVar.zzd(); i4++) {
            if (str.equals(zzaVar.zzk(i4).zzg())) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    final List<Integer> zzu() {
        Map<String, String> zza = zzbh.zza(this.zzg.zza());
        if (zza == null || zza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbh.zzar.zza(null).intValue();
        for (Map.Entry<String, String> entry : zza.entrySet()) {
            if (entry.getKey().startsWith(ProtectedSandApp.s("\ue407"))) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().zzu().zza(ProtectedSandApp.s("\ue408"), Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e4) {
                    zzj().zzu().zza(ProtectedSandApp.s("\ue409"), e4);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    static Object zzb(zzfy.zzf zzfVar, String str) {
        zzfy.zzh zza = zza(zzfVar, str);
        if (zza == null) {
            return null;
        }
        if (zza.zzn()) {
            return zza.zzh();
        }
        if (zza.zzl()) {
            return Long.valueOf(zza.zzd());
        }
        if (zza.zzj()) {
            return Double.valueOf(zza.zza());
        }
        if (zza.zzc() > 0) {
            return zzb(zza.zzi());
        }
        return null;
    }

    final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue406"), e4);
            throw e4;
        }
    }

    final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zza(str.getBytes(Charset.forName(ProtectedSandApp.s("\ue391"))));
    }

    @n1
    final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest zzu = zzos.zzu();
        if (zzu == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue392"));
            return 0L;
        }
        return zzos.zza(zzu.digest(bArr));
    }

    static boolean zzb(String str) {
        return str != null && str.matches(ProtectedSandApp.s("\ue390")) && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static Bundle zza(List<zzfy.zzh> list) {
        Bundle bundle = new Bundle();
        for (zzfy.zzh zzhVar : list) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putDouble(zzg, zzhVar.zza());
            } else if (zzhVar.zzk()) {
                bundle.putFloat(zzg, zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putLong(zzg, zzhVar.zzd());
            }
        }
        return bundle;
    }

    final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue405"), e4);
            throw e4;
        }
    }

    static Bundle[] zzb(List<zzfy.zzh> list) {
        ArrayList arrayList = new ArrayList();
        for (zzfy.zzh zzhVar : list) {
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (zzfy.zzh zzhVar2 : zzhVar.zzi()) {
                    if (zzhVar2.zzn()) {
                        bundle.putString(zzhVar2.zzg(), zzhVar2.zzh());
                    } else if (zzhVar2.zzl()) {
                        bundle.putLong(zzhVar2.zzg(), zzhVar2.zzd());
                    } else if (zzhVar2.zzj()) {
                        bundle.putDouble(zzhVar2.zzg(), zzhVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final Bundle zza(Map<String, Object> map, boolean z4) {
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
            } else if (z4) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    arrayList2.add(zza((Map<String, Object>) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue393"));
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final zzbf zza(com.google.android.gms.internal.measurement.zzad zzadVar) {
        String s4;
        Object obj;
        Bundle zza = zza(zzadVar.zzc(), true);
        String s5 = ProtectedSandApp.s("\ue394");
        if (zza.containsKey(s5) && (obj = zza.get(s5)) != null) {
            s4 = obj.toString();
        } else {
            s4 = ProtectedSandApp.s("\ue395");
        }
        String str = s4;
        String zzb = zzji.zzb(zzadVar.zzb());
        if (zzb == null) {
            zzb = zzadVar.zzb();
        }
        return new zzbf(zzb, new zzbe(zza), str, zzadVar.zza());
    }

    @TargetApi(30)
    final zzno zza(String str, zzfy.zzk.zza zzaVar, zzfy.zzf.zza zzaVar2, String str2) {
        int indexOf;
        if (!zzpn.zza() || !zze().zze(str, zzbh.zzch)) {
            return null;
        }
        long currentTimeMillis = zzb().currentTimeMillis();
        String[] split = zze().zzd(str, zzbh.zzbg).split(ProtectedSandApp.s("\ue36f"));
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ue396") + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        zznu zzo = zzo();
        String zzf = zzo.zzm().zzf(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(zzo.zze().zzd(str, zzbh.zzaz));
        boolean isEmpty = TextUtils.isEmpty(zzf);
        String s4 = ProtectedSandApp.s("\ue397");
        if (!isEmpty) {
            builder.authority(zzf + s4 + zzo.zze().zzd(str, zzbh.zzba));
        } else {
            builder.authority(zzo.zze().zzd(str, zzbh.zzba));
        }
        builder.path(zzo.zze().zzd(str, zzbh.zzbb));
        zza(builder, ProtectedSandApp.s("\ue398"), zzaVar.zzx(), (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue399"), ProtectedSandApp.s("\ue39a"), (Set<String>) unmodifiableSet);
        String zzu = zzaVar.zzu();
        zzag zze = zze();
        zzfz<Boolean> zzfzVar = zzbh.zzck;
        if (zze.zze(str, zzfzVar) && zzm().zzo(str)) {
            zzu = "";
        }
        zza(builder, ProtectedSandApp.s("\ue39b"), zzu, (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue39c"), zzaVar.zzz(), (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue39d"), zzaVar.zzt(), (Set<String>) unmodifiableSet);
        String zze2 = zzaVar2.zze();
        String zza = zzji.zza(zze2);
        if (!TextUtils.isEmpty(zza)) {
            zze2 = zza;
        }
        zza(builder, ProtectedSandApp.s("\ue39e"), zze2, (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue39f"), String.valueOf(zzaVar.zzb()), (Set<String>) unmodifiableSet);
        String zzy = zzaVar.zzy();
        if (zze().zze(str, zzfzVar) && zzm().zzs(str) && !TextUtils.isEmpty(zzy) && (indexOf = zzy.indexOf(s4)) != -1) {
            zzy = zzy.substring(0, indexOf);
        }
        zza(builder, ProtectedSandApp.s("\ue3a0"), zzy, (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue3a1"), String.valueOf(zzaVar2.zzc()), (Set<String>) unmodifiableSet);
        boolean zzad = zzaVar.zzad();
        String s5 = ProtectedSandApp.s("\ue3a2");
        if (zzad) {
            zza(builder, ProtectedSandApp.s("\ue3a3"), s5, (Set<String>) unmodifiableSet);
        }
        zza(builder, ProtectedSandApp.s("\ue3a4"), String.valueOf(zzaVar.zza()), (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue3a5"), s5, (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue3a6"), String.valueOf(currentTimeMillis), (Set<String>) unmodifiableSet);
        zza(builder, ProtectedSandApp.s("\ue3a7"), str2, (Set<String>) unmodifiableSet);
        List<zzfy.zzh> zzf2 = zzaVar2.zzf();
        Bundle bundle = new Bundle();
        for (zzfy.zzh zzhVar : zzf2) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zza()));
            } else if (zzhVar.zzk()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzb()));
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzd()));
            }
        }
        String zzd = zze().zzd(str, zzbh.zzbf);
        String s6 = ProtectedSandApp.s("\ue3a8");
        zza(builder, zzd.split(s6), bundle, (Set<String>) unmodifiableSet);
        List<zzfy.zzo> zzab = zzaVar.zzab();
        Bundle bundle2 = new Bundle();
        for (zzfy.zzo zzoVar : zzab) {
            String zzg2 = zzoVar.zzg();
            if (zzoVar.zzi()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zza()));
            } else if (zzoVar.zzj()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzb()));
            } else if (zzoVar.zzm()) {
                bundle2.putString(zzg2, zzoVar.zzh());
            } else if (zzoVar.zzk()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzc()));
            }
        }
        zza(builder, zze().zzd(str, zzbh.zzbe).split(s6), bundle2, (Set<String>) unmodifiableSet);
        if (!zzaVar.zzac()) {
            s5 = ProtectedSandApp.s("\ue3a9");
        }
        zza(builder, ProtectedSandApp.s("\ue3aa"), s5, (Set<String>) unmodifiableSet);
        if (!zzaVar.zzw().isEmpty()) {
            zza(builder, ProtectedSandApp.s("\ue3ab"), zzaVar.zzw(), (Set<String>) unmodifiableSet);
        }
        if (zze().zza(zzbh.zzcm) && zzaVar.zzae()) {
            zzfy.zza zzg3 = zzaVar.zzg();
            if (!zzg3.zzh().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3ac"), zzg3.zzh(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3ad"), zzg3.zzg(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3ae"), zzg3.zzf(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                zza(builder, ProtectedSandApp.s("\ue3af"), String.valueOf(zzg3.zza()), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3b0"), zzg3.zzk(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3b1"), zzg3.zzj(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                zza(builder, ProtectedSandApp.s("\ue3b2"), zzg3.zzi(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                zza(builder, ProtectedSandApp.s("\ue3b3"), String.valueOf(zzg3.zzb()), (Set<String>) unmodifiableSet);
            }
        }
        return new zzno(builder.build().toString(), currentTimeMillis, 1);
    }

    final zzfy.zzf zza(zzbc zzbcVar) {
        zzfy.zzf.zza zza = zzfy.zzf.zze().zza(zzbcVar.zze);
        Iterator<String> it = zzbcVar.zzf.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfy.zzh.zza zza2 = zzfy.zzh.zze().zza(next);
            Object zzc = zzbcVar.zzf.zzc(next);
            Preconditions.checkNotNull(zzc);
            zza(zza2, zzc);
            zza.zza(zza2);
        }
        if (zze().zza(zzbh.zzdi) && !TextUtils.isEmpty(zzbcVar.zzc)) {
            zzbe zzbeVar = zzbcVar.zzf;
            String s4 = ProtectedSandApp.s("\ue394");
            if (zzbeVar.zzc(s4) == null) {
                zza.zza((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzh.zze().zza(s4).zzb(zzbcVar.zzc).zzai()));
            }
        }
        return (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zza.zzai());
    }

    static zzfy.zzh zza(zzfy.zzf zzfVar, String str) {
        for (zzfy.zzh zzhVar : zzfVar.zzh()) {
            if (zzhVar.zzg().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    static <BuilderT extends com.google.android.gms.internal.measurement.zzlb> BuilderT zza(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkb {
        com.google.android.gms.internal.measurement.zzjg zza = com.google.android.gms.internal.measurement.zzjg.zza();
        if (zza != null) {
            return (BuilderT) buildert.zza(bArr, zza);
        }
        return (BuilderT) buildert.zza(bArr);
    }

    static Object zza(zzfy.zzf zzfVar, String str, Object obj) {
        Object zzb = zzb(zzfVar, str);
        return zzb == null ? obj : zzb;
    }

    final String zza(zzfy.zzj zzjVar) {
        zzfy.zzc zzv;
        if (zzjVar == null) {
            return "";
        }
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\ue3be"));
        if (zzpu.zza() && zze().zza(zzbh.zzbx) && zzjVar.zza() > 0) {
            zzq();
            if (zzos.zzf(zzjVar.zza(0).zzz())) {
                if (zzjVar.zzh()) {
                    zza(a5, 0, ProtectedSandApp.s("\ue3bf"), zzjVar.zze());
                }
                if (zzjVar.zzg()) {
                    zza(a5, 0, ProtectedSandApp.s("\ue3c0"), zzjVar.zzd());
                }
            }
        }
        for (zzfy.zzk zzkVar : zzjVar.zzf()) {
            if (zzkVar != null) {
                zza(a5, 1);
                a5.append(ProtectedSandApp.s("\ue3c1"));
                if (zzkVar.zzbp()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3c2"), Integer.valueOf(zzkVar.zzf()));
                }
                if (zzpo.zza() && zze().zze(zzkVar.zzz(), zzbh.zzbw) && zzkVar.zzbs()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3c3"), zzkVar.zzao());
                }
                zza(a5, 1, ProtectedSandApp.s("\ue3c4"), zzkVar.zzam());
                if (zzkVar.zzbk()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue399"), Long.valueOf(zzkVar.zzn()));
                }
                if (zzkVar.zzbx()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3c5"), Long.valueOf(zzkVar.zzt()));
                }
                if (zzkVar.zzbi()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3c6"), Long.valueOf(zzkVar.zzl()));
                }
                if (zzkVar.zzbb()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3c7"), Long.valueOf(zzkVar.zzj()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue398"), zzkVar.zzaj());
                zza(a5, 1, ProtectedSandApp.s("\ue3c8"), zzkVar.zzy());
                zza(a5, 1, ProtectedSandApp.s("\ue3c9"), zzkVar.zzz());
                zza(a5, 1, ProtectedSandApp.s("\ue39f"), zzkVar.zzac());
                if (zzkVar.zzay()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3ca"), Integer.valueOf(zzkVar.zzb()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue3cb"), zzkVar.zzai());
                if (zzkVar.zzbg()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3cc"), Long.valueOf(zzkVar.zzk()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue3cd"), zzkVar.zzab());
                if (zzkVar.zzbw()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3ce"), Long.valueOf(zzkVar.zzs()));
                }
                if (zzkVar.zzbt()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3cf"), Long.valueOf(zzkVar.zzq()));
                }
                if (zzkVar.zzbj()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d0"), Long.valueOf(zzkVar.zzm()));
                }
                if (zzkVar.zzbo()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d1"), Long.valueOf(zzkVar.zzp()));
                }
                if (zzkVar.zzbn()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d2"), Long.valueOf(zzkVar.zzo()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue39b"), zzkVar.zzaa());
                zza(a5, 1, ProtectedSandApp.s("\ue3d3"), zzkVar.zzan());
                zza(a5, 1, ProtectedSandApp.s("\ue3d4"), zzkVar.zzah());
                if (zzkVar.zzbm()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d5"), Boolean.valueOf(zzkVar.zzav()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue3a0"), zzkVar.zzal());
                zza(a5, 1, ProtectedSandApp.s("\ue3d6"), zzkVar.zzag());
                zza(a5, 1, ProtectedSandApp.s("\ue3d7"), zzkVar.zzap());
                if (zzkVar.zzbv()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d8"), Integer.valueOf(zzkVar.zzh()));
                }
                if (zzkVar.zzba()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3d9"), Integer.valueOf(zzkVar.zzc()));
                }
                if (zzpu.zza()) {
                    zzq();
                    if (zzos.zzf(zzkVar.zzz()) && zze().zza(zzbh.zzbx) && zzkVar.zzbf()) {
                        zza(a5, 1, ProtectedSandApp.s("\ue3da"), Integer.valueOf(zzkVar.zzd()));
                    }
                }
                if (zzkVar.zzbr()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3db"), Boolean.valueOf(zzkVar.zzaw()));
                }
                zza(a5, 1, ProtectedSandApp.s("\ue3dc"), zzkVar.zzak());
                if (zzkVar.zzbq()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3dd"), Integer.valueOf(zzkVar.zzg()));
                }
                if (zzkVar.zzbd()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3de"), zzkVar.zzae());
                }
                if (zzkVar.zzbl()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3df"), Boolean.valueOf(zzkVar.zzau()));
                }
                if (zzkVar.zzbe()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3e0"), zzkVar.zzaf());
                }
                if (zzkVar.zzbc()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3e1"), zzkVar.zzad());
                }
                if (zzkVar.zzbu()) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3e2"), Long.valueOf(zzkVar.zzr()));
                }
                boolean zza = zzpn.zza();
                String s4 = ProtectedSandApp.s("\ue374");
                if (zza && zze().zze(zzkVar.zzz(), zzbh.zzch)) {
                    zza(a5, 1, ProtectedSandApp.s("\ue3e3"), Integer.valueOf(zzkVar.zza()));
                    if (zzkVar.zzaz() && (zzv = zzkVar.zzv()) != null) {
                        zza(a5, 2);
                        a5.append(ProtectedSandApp.s("\ue3e4"));
                        zza(a5, 2, ProtectedSandApp.s("\ue3e5"), Boolean.valueOf(zzv.zzf()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3e6"), Boolean.valueOf(zzv.zzh()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3e7"), Boolean.valueOf(zzv.zzi()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3e8"), Boolean.valueOf(zzv.zzj()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3e9"), Boolean.valueOf(zzv.zze()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3ea"), Boolean.valueOf(zzv.zzd()));
                        zza(a5, 2, ProtectedSandApp.s("\ue3eb"), Boolean.valueOf(zzv.zzg()));
                        zza(a5, 2);
                        a5.append(s4);
                    }
                }
                if (zzov.zza() && zze().zza(zzbh.zzcu) && zzkVar.zzax()) {
                    zzfy.zza zzu = zzkVar.zzu();
                    zza(a5, 2);
                    a5.append(ProtectedSandApp.s("\ue3ec"));
                    if (zzu.zzn()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3ed"), zzu.zzh());
                    }
                    if (zzu.zzm()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3ee"), zzu.zzg());
                    }
                    if (zzu.zzl()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3ef"), zzu.zzf());
                    }
                    if (zzu.zzo()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3f0"), Long.valueOf(zzu.zza()));
                    }
                    if (zzu.zzs()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3f1"), zzu.zzk());
                    }
                    if (zzu.zzr()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3f2"), zzu.zzj());
                    }
                    if (zzu.zzq()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3f3"), zzu.zzi());
                    }
                    if (zzu.zzp()) {
                        zza(a5, 2, ProtectedSandApp.s("\ue3f4"), Long.valueOf(zzu.zzb()));
                    }
                    zza(a5, 2);
                    a5.append(s4);
                }
                List<zzfy.zzo> zzas = zzkVar.zzas();
                String s5 = ProtectedSandApp.s("\ue38c");
                if (zzas != null) {
                    for (zzfy.zzo zzoVar : zzas) {
                        if (zzoVar != null) {
                            zza(a5, 2);
                            a5.append(ProtectedSandApp.s("\ue3f5"));
                            zza(a5, 2, ProtectedSandApp.s("\ue3f6"), zzoVar.zzl() ? Long.valueOf(zzoVar.zzd()) : null);
                            zza(a5, 2, s5, zzi().zzc(zzoVar.zzg()));
                            zza(a5, 2, ProtectedSandApp.s("\ue38d"), zzoVar.zzh());
                            zza(a5, 2, ProtectedSandApp.s("\ue38e"), zzoVar.zzk() ? Long.valueOf(zzoVar.zzc()) : null);
                            zza(a5, 2, ProtectedSandApp.s("\ue38f"), zzoVar.zzi() ? Double.valueOf(zzoVar.zza()) : null);
                            zza(a5, 2);
                            a5.append(s4);
                        }
                    }
                }
                List<zzfy.zzd> zzaq = zzkVar.zzaq();
                zzkVar.zzz();
                if (zzaq != null) {
                    for (zzfy.zzd zzdVar : zzaq) {
                        if (zzdVar != null) {
                            zza(a5, 2);
                            a5.append(ProtectedSandApp.s("\ue3f7"));
                            if (zzdVar.zzg()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3f8"), Integer.valueOf(zzdVar.zza()));
                            }
                            if (zzdVar.zzh()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3f9"), Boolean.valueOf(zzdVar.zzf()));
                            }
                            zza(a5, 2, ProtectedSandApp.s("\ue3fa"), zzdVar.zzd());
                            if (zzdVar.zzi()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3fb"), zzdVar.zze());
                            }
                            zza(a5, 2);
                            a5.append(s4);
                        }
                    }
                }
                List<zzfy.zzf> zzar = zzkVar.zzar();
                if (zzar != null) {
                    for (zzfy.zzf zzfVar : zzar) {
                        if (zzfVar != null) {
                            zza(a5, 2);
                            a5.append(ProtectedSandApp.s("\ue3fc"));
                            zza(a5, 2, s5, zzi().zza(zzfVar.zzg()));
                            if (zzfVar.zzk()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3fd"), Long.valueOf(zzfVar.zzd()));
                            }
                            if (zzfVar.zzj()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3fe"), Long.valueOf(zzfVar.zzc()));
                            }
                            if (zzfVar.zzi()) {
                                zza(a5, 2, ProtectedSandApp.s("\ue3ff"), Integer.valueOf(zzfVar.zza()));
                            }
                            if (zzfVar.zzb() != 0) {
                                zza(a5, 2, zzfVar.zzh());
                            }
                            zza(a5, 2);
                            a5.append(s4);
                        }
                    }
                }
                zza(a5, 1);
                a5.append(s4);
            }
        }
        a5.append(ProtectedSandApp.s("\ue400"));
        return a5.toString();
    }

    final String zza(zzfo.zzb zzbVar) {
        if (zzbVar == null) {
            return ProtectedSandApp.s("\ue3b4");
        }
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\ue3b5"));
        if (zzbVar.zzl()) {
            zza(a5, 0, ProtectedSandApp.s("\ue3b6"), Integer.valueOf(zzbVar.zzb()));
        }
        zza(a5, 0, ProtectedSandApp.s("\ue3b7"), zzi().zza(zzbVar.zzf()));
        String zza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!zza.isEmpty()) {
            zza(a5, 0, ProtectedSandApp.s("\ue3b8"), zza);
        }
        if (zzbVar.zzk()) {
            zza(a5, 1, ProtectedSandApp.s("\ue3b9"), zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            a5.append(ProtectedSandApp.s("\ue3ba"));
            Iterator<zzfo.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                zza(a5, 2, it.next());
            }
        }
        zza(a5, 1);
        a5.append(ProtectedSandApp.s("\ue3bb"));
        return a5.toString();
    }

    private static String zza(boolean z4, boolean z5, boolean z6) {
        StringBuilder sb = new StringBuilder();
        if (z4) {
            sb.append(ProtectedSandApp.s("\ue36c"));
        }
        if (z5) {
            sb.append(ProtectedSandApp.s("\ue36d"));
        }
        if (z6) {
            sb.append(ProtectedSandApp.s("\ue36e"));
        }
        return sb.toString();
    }

    final String zza(zzfo.zze zzeVar) {
        if (zzeVar == null) {
            return ProtectedSandApp.s("\ue3b4");
        }
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\ue3bc"));
        if (zzeVar.zzi()) {
            zza(a5, 0, ProtectedSandApp.s("\ue3b6"), Integer.valueOf(zzeVar.zza()));
        }
        zza(a5, 0, ProtectedSandApp.s("\ue3bd"), zzi().zzc(zzeVar.zze()));
        String zza = zza(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!zza.isEmpty()) {
            zza(a5, 0, ProtectedSandApp.s("\ue3b8"), zza);
        }
        zza(a5, 1, zzeVar.zzb());
        a5.append(ProtectedSandApp.s("\ue374"));
        return a5.toString();
    }

    final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i4;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().zzu().zza(ProtectedSandApp.s("\ue401"), num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().zzu().zza(ProtectedSandApp.s("\ue402"), num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i4 = size;
            size = i5;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j4 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = (i4 << 6) + i5;
                if (i6 < bitSet.length()) {
                    if (bitSet.get(i6)) {
                        j4 |= 1 << i5;
                    }
                }
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
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
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zza((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
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
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(zza((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(zza((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.String, java.lang.Object> zza(android.os.Bundle r11, boolean r12) {
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
            java.util.Map r8 = r10.zza(r8, r6)
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
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zza(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zza(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzoo.zza(android.os.Bundle, boolean):java.util.Map");
    }

    static void zza(zzfy.zzf.zza zzaVar, String str, Object obj) {
        List<zzfy.zzh> zzf = zzaVar.zzf();
        int i4 = 0;
        while (true) {
            if (i4 >= zzf.size()) {
                i4 = -1;
                break;
            } else if (str.equals(zzf.get(i4).zzg())) {
                break;
            } else {
                i4++;
            }
        }
        zzfy.zzh.zza zza = zzfy.zzh.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i4 >= 0) {
            zzaVar.zza(i4, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(ProtectedSandApp.s("\ue36f"));
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zza(builder, str3, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb, int i4, String str, zzfy.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(ProtectedSandApp.s("\ue376"));
        int zzb = zzmVar.zzb();
        String s4 = ProtectedSandApp.s("\ue382");
        if (zzb != 0) {
            zza(sb, 4);
            sb.append(ProtectedSandApp.s("\ue383"));
            int i5 = 0;
            for (Long l4 : zzmVar.zzi()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(s4);
                }
                sb.append(l4);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (zzmVar.zzd() != 0) {
            zza(sb, 4);
            sb.append(ProtectedSandApp.s("\ue384"));
            int i7 = 0;
            for (Long l5 : zzmVar.zzk()) {
                int i10 = i7 + 1;
                if (i7 != 0) {
                    sb.append(s4);
                }
                sb.append(l5);
                i7 = i10;
            }
            sb.append('\n');
        }
        int zza = zzmVar.zza();
        String s5 = ProtectedSandApp.s("\ue374");
        if (zza != 0) {
            zza(sb, 4);
            sb.append(ProtectedSandApp.s("\ue385"));
            int i11 = 0;
            for (zzfy.zze zzeVar : zzmVar.zzh()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(s4);
                }
                sb.append(zzeVar.zzf() ? Integer.valueOf(zzeVar.zza()) : null);
                sb.append(ProtectedSandApp.s("\ue386"));
                sb.append(zzeVar.zze() ? Long.valueOf(zzeVar.zzb()) : null);
                i11 = i12;
            }
            sb.append(s5);
        }
        if (zzmVar.zzc() != 0) {
            zza(sb, 4);
            sb.append(ProtectedSandApp.s("\ue387"));
            int i13 = 0;
            for (zzfy.zzn zznVar : zzmVar.zzj()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(s4);
                }
                sb.append(zznVar.zzf() ? Integer.valueOf(zznVar.zzb()) : null);
                sb.append(ProtectedSandApp.s("\ue388"));
                Iterator<Long> it = zznVar.zze().iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb.append(s4);
                    }
                    sb.append(longValue);
                    i15 = i16;
                }
                sb.append(ProtectedSandApp.s("\ue389"));
                i13 = i14;
            }
            sb.append(s5);
        }
        zza(sb, 3);
        sb.append(s5);
    }

    private final void zza(StringBuilder sb, int i4, List<zzfy.zzh> list) {
        if (list == null) {
            return;
        }
        int i5 = i4 + 1;
        for (zzfy.zzh zzhVar : list) {
            if (zzhVar != null) {
                zza(sb, i5);
                sb.append(ProtectedSandApp.s("\ue38b"));
                zza(sb, i5, ProtectedSandApp.s("\ue38c"), zzhVar.zzm() ? zzi().zzb(zzhVar.zzg()) : null);
                zza(sb, i5, ProtectedSandApp.s("\ue38d"), zzhVar.zzn() ? zzhVar.zzh() : null);
                zza(sb, i5, ProtectedSandApp.s("\ue38e"), zzhVar.zzl() ? Long.valueOf(zzhVar.zzd()) : null);
                zza(sb, i5, ProtectedSandApp.s("\ue38f"), zzhVar.zzj() ? Double.valueOf(zzhVar.zza()) : null);
                if (zzhVar.zzc() > 0) {
                    zza(sb, i5, zzhVar.zzi());
                }
                zza(sb, i5);
                sb.append(ProtectedSandApp.s("\ue374"));
            }
        }
    }

    private final void zza(StringBuilder sb, int i4, zzfo.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i4);
        sb.append(ProtectedSandApp.s("\ue371"));
        if (zzcVar.zzg()) {
            zza(sb, i4, ProtectedSandApp.s("\ue372"), Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            zza(sb, i4, ProtectedSandApp.s("\ue373"), zzi().zzb(zzcVar.zze()));
        }
        boolean zzj = zzcVar.zzj();
        String s4 = ProtectedSandApp.s("\ue374");
        if (zzj) {
            int i5 = i4 + 1;
            zzfo.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                zza(sb, i5);
                sb.append(ProtectedSandApp.s("\ue375"));
                sb.append(ProtectedSandApp.s("\ue376"));
                if (zzd.zzj()) {
                    zza(sb, i5, ProtectedSandApp.s("\ue377"), zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    zza(sb, i5, ProtectedSandApp.s("\ue378"), zzd.zze());
                }
                if (zzd.zzh()) {
                    zza(sb, i5, ProtectedSandApp.s("\ue379"), Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    zza(sb, i4 + 2);
                    sb.append(ProtectedSandApp.s("\ue37a"));
                    for (String str : zzd.zzf()) {
                        zza(sb, i4 + 3);
                        sb.append(str);
                        sb.append(ProtectedSandApp.s("\ue37b"));
                    }
                    sb.append(s4);
                }
                zza(sb, i5);
                sb.append(s4);
            }
        }
        if (zzcVar.zzh()) {
            zza(sb, i4 + 1, ProtectedSandApp.s("\ue37c"), zzcVar.zzc());
        }
        zza(sb, i4);
        sb.append(s4);
    }

    private static void zza(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(ProtectedSandApp.s("\ue370"));
        }
    }

    private static void zza(StringBuilder sb, int i4, String str, zzfo.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i4);
        sb.append(str);
        sb.append(ProtectedSandApp.s("\ue376"));
        if (zzdVar.zzh()) {
            zza(sb, i4, ProtectedSandApp.s("\ue37d"), zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            zza(sb, i4, ProtectedSandApp.s("\ue37e"), Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            zza(sb, i4, ProtectedSandApp.s("\ue37f"), zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            zza(sb, i4, ProtectedSandApp.s("\ue380"), zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            zza(sb, i4, ProtectedSandApp.s("\ue381"), zzdVar.zze());
        }
        zza(sb, i4);
        sb.append(ProtectedSandApp.s("\ue374"));
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void zza(StringBuilder sb, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i4 + 1);
        sb.append(str);
        sb.append(ProtectedSandApp.s("\ue38a"));
        sb.append(obj);
        sb.append('\n');
    }

    final void zza(zzfy.zzh.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfy.zzh.zza zze = zzfy.zzh.zze();
                    for (String str : bundle.keySet()) {
                        zzfy.zzh.zza zza = zzfy.zzh.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zze.zzai()));
                    }
                }
            }
            zzaVar.zza(arrayList);
            return;
        }
        zzj().zzg().zza(ProtectedSandApp.s("\ue403"), obj);
    }

    final void zza(zzfy.zzo.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza(ProtectedSandApp.s("\ue404"), obj);
        }
    }

    @n1
    static boolean zza(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    static boolean zza(List<Long> list, int i4) {
        if (i4 < (list.size() << 6)) {
            return ((1 << (i4 % 64)) & list.get(i4 / 64).longValue()) != 0;
        }
        return false;
    }

    final boolean zza(long j4, long j5) {
        return j4 == 0 || j5 <= 0 || Math.abs(zzb().currentTimeMillis() - j4) > j5;
    }
}
