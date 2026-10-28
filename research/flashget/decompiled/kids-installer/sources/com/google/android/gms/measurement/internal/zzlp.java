package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.n1;
import androidx.constraintlayout.solver.f;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.apache.log4j.helpers.FileWatchdog;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzlp extends zzgx {
    private static final String[] zza = {ProtectedSandApp.s("㉓"), ProtectedSandApp.s("㉑"), ProtectedSandApp.s("㉒")};
    private static final String[] zzb = {ProtectedSandApp.s("㉔")};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    static MessageDigest zzF() {
        MessageDigest messageDigest;
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㉕"));
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("㉖"), zzacVar.zza);
            bundle.putString(ProtectedSandApp.s("㉗"), zzacVar.zzb);
            bundle.putLong(ProtectedSandApp.s("㉘"), zzacVar.zzd);
            bundle.putString(ProtectedSandApp.s("㉙"), zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(ProtectedSandApp.s("㉚"), zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(ProtectedSandApp.s("㉛"), str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(ProtectedSandApp.s("㉜"), zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(ProtectedSandApp.s("㉝"), zzasVar.zzc());
                }
            }
            bundle.putLong(ProtectedSandApp.s("㉞"), zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(ProtectedSandApp.s("㉟"), zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(ProtectedSandApp.s("㉠"), zzasVar2.zzc());
                }
            }
            bundle.putLong(ProtectedSandApp.s("㉡"), zzacVar.zzc.zzc);
            bundle.putLong(ProtectedSandApp.s("㉢"), zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(ProtectedSandApp.s("㉣"), zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(ProtectedSandApp.s("㉤"), zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @n1
    public static void zzK(zzir zzirVar, Bundle bundle, boolean z5) {
        String s5 = ProtectedSandApp.s("㉥");
        String s6 = ProtectedSandApp.s("㉦");
        String s7 = ProtectedSandApp.s("㉧");
        if (bundle != null && zzirVar != null) {
            if (!bundle.containsKey(s7) || z5) {
                String str = zzirVar.zza;
                if (str != null) {
                    bundle.putString(s6, str);
                } else {
                    bundle.remove(s6);
                }
                String str2 = zzirVar.zzb;
                if (str2 != null) {
                    bundle.putString(s7, str2);
                } else {
                    bundle.remove(s7);
                }
                bundle.putLong(s5, zzirVar.zzc);
                return;
            }
            z5 = false;
        }
        if (bundle != null && zzirVar == null && z5) {
            bundle.remove(s6);
            bundle.remove(s7);
            bundle.remove(s5);
        }
    }

    static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(ProtectedSandApp.s("㉨"));
    }

    static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals(ProtectedSandApp.s("㉩"));
    }

    static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, ProtectedSandApp.s("㉪")), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zzam(Context context, boolean z5) {
        Preconditions.checkNotNull(context);
        return zzav(context, ProtectedSandApp.s("㉫"));
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    static final boolean zzaq(Bundle bundle, int i5) {
        if (bundle == null) {
            return false;
        }
        String s5 = ProtectedSandApp.s("㉬");
        if (bundle.getLong(s5) != 0) {
            return false;
        }
        bundle.putLong(s5, i5);
        return true;
    }

    @VisibleForTesting
    static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches(ProtectedSandApp.s("㉭"));
    }

    private final int zzas(String str) {
        if (ProtectedSandApp.s("㉮").equals(str)) {
            this.zzt.zzf();
            return 2048;
        }
        if (ProtectedSandApp.s("㉯").equals(str)) {
            this.zzt.zzf();
            return 256;
        }
        if (ProtectedSandApp.s("㉰").equals(str)) {
            this.zzt.zzf();
            return 100;
        }
        this.zzt.zzf();
        return 36;
    }

    private final Object zzat(int i5, Object obj, boolean z5, boolean z6) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzD(obj.toString(), i5, z5);
        }
        if (!z6 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle zzt = zzt((Bundle) parcelable);
                if (!zzt.isEmpty()) {
                    arrayList.add(zzt);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @VisibleForTesting
    static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i5 = 0;
        Preconditions.checkState(length > 0);
        long j5 = 0;
        for (int i6 = length - 1; i6 >= 0 && i6 >= bArr.length - 8; i6--) {
            j5 += (bArr[i6] & 255) << i5;
            i5 += 8;
        }
        return j5;
    }

    final Object zzA(String str, Object obj) {
        int i5 = 256;
        if (ProtectedSandApp.s("㉱").equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (zzaj(str)) {
            this.zzt.zzf();
        } else {
            this.zzt.zzf();
            i5 = 100;
        }
        return zzat(i5, obj, false, true);
    }

    final Object zzB(String str, Object obj) {
        return ProtectedSandApp.s("㉲").equals(str) ? zzat(zzas(str), obj, true, false) : zzat(zzas(str), obj, false, false);
    }

    final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, ProtectedSandApp.s("㉳"), new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i5, boolean z5) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i5) {
            return str;
        }
        if (z5) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i5))).concat(ProtectedSandApp.s("㉴"));
        }
        return null;
    }

    public final URL zzE(long j5, String str, String str2, long j6) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format(ProtectedSandApp.s("㉵"), String.format(ProtectedSandApp.s("㉶"), 79000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j6));
            if (str.equals(this.zzt.zzf().zzm())) {
                format = format.concat(ProtectedSandApp.s("㉷"));
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㉸"), e6.getMessage());
            return null;
        }
    }

    @n1
    @EnsuresNonNull({"this.secureRandom"})
    final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @n1
    final void zzI(Bundle bundle, long j5) {
        String s5 = ProtectedSandApp.s("㉹");
        long j6 = bundle.getLong(s5);
        if (j6 != 0) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㉺"), Long.valueOf(j6));
        } else {
            j6 = 0;
        }
        bundle.putLong(s5, j5 + j6);
    }

    final void zzJ(Bundle bundle, int i5, String str, String str2, Object obj) {
        if (zzaq(bundle, i5)) {
            this.zzt.zzf();
            bundle.putString(ProtectedSandApp.s("㉻"), zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong(ProtectedSandApp.s("㉼"), obj.toString().length());
                }
            }
        }
    }

    final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zzM(Parcelable[] parcelableArr, int i5, boolean z5) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzak(str) && !zzau(str, zzhd.zzd) && (i6 = i6 + 1) > i5) {
                    if (z5) {
                        this.zzt.zzaA().zze().zzc(f.a(ProtectedSandApp.s("㉽"), i5, ProtectedSandApp.s("㉾")), this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 28);
                    } else {
                        this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㉿"), this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    final void zzN(zzeu zzeuVar, int i5) {
        Iterator it = new TreeSet(zzeuVar.zzd.keySet()).iterator();
        int i6 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzak(str) && (i6 = i6 + 1) > i5) {
                this.zzt.zzaA().zze().zzc(f.a(ProtectedSandApp.s("㊀"), i5, ProtectedSandApp.s("㊁")), this.zzt.zzj().zzd(zzeuVar.zza), this.zzt.zzj().zzb(zzeuVar.zzd));
                zzaq(zzeuVar.zzd, 5);
                zzeuVar.zzd.remove(str);
            }
        }
    }

    final void zzO(zzlo zzloVar, String str, int i5, String str2, String str3, int i6) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i5);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i5 == 6 || i5 == 7 || i5 == 2) {
            bundle.putLong(ProtectedSandApp.s("㊂"), i6);
        }
        zzloVar.zza(str, ProtectedSandApp.s("㊃"), bundle);
    }

    final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc(ProtectedSandApp.s("㊄"), this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ProtectedSandApp.s("㊅"), z5);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊆"), e6);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ProtectedSandApp.s("㊇"), arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊈"), e6);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊉"), e6);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(ProtectedSandApp.s("㊊"), bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊋"), e6);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("㊌"), i5);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊍"), e6);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j5) {
        Bundle bundle = new Bundle();
        bundle.putLong(ProtectedSandApp.s("㊎"), j5);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊏"), e6);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("㊐"), str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㊑"), e6);
        }
    }

    final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z5) {
        int i5;
        String str4;
        int i6;
        int zza2;
        int i7;
        String str5;
        if (bundle == null) {
            return;
        }
        zzag zzf = this.zzt.zzf();
        zzpq.zzc();
        int i8 = (zzf.zzt.zzf().zzs(null, zzeg.zzaz) && zzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        String str6 = null;
        int i9 = 0;
        while (it.hasNext()) {
            String str7 = (String) it.next();
            if (list == null || !list.contains(str7)) {
                int zzj = !z5 ? zzj(str7) : 0;
                if (zzj == 0) {
                    zzj = zzi(str7);
                }
                i5 = zzj;
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                zzJ(bundle, i5, str7, str7, i5 == 3 ? str7 : str6);
                bundle.remove(str7);
                i7 = i8;
            } else {
                if (zzag(bundle.get(str7))) {
                    this.zzt.zzaA().zzl().zzd(ProtectedSandApp.s("㊒"), str2, str3, str7);
                    zza2 = 22;
                    str4 = str7;
                    i6 = i8;
                } else {
                    str4 = str7;
                    i6 = i8;
                    zza2 = zza(str, str2, str7, bundle.get(str7), bundle, list, z5, false);
                }
                if (zza2 != 0 && !ProtectedSandApp.s("㊓").equals(str4)) {
                    zzJ(bundle, zza2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzak(str4) && !zzau(str4, zzhd.zzd)) {
                    int i10 = i9 + 1;
                    if (zzai(231100000, true)) {
                        i7 = i6;
                        if (i10 > i7) {
                            zzpq.zzc();
                            str5 = null;
                            if (this.zzt.zzf().zzs(null, zzeg.zzaz)) {
                                this.zzt.zzaA().zze().zzc(f.a(ProtectedSandApp.s("㊕"), i7, ProtectedSandApp.s("㊖")), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊗"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 23);
                                bundle.remove(str4);
                            }
                            i9 = i10;
                            str6 = str5;
                        }
                    } else {
                        this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊔"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                        bundle.remove(str4);
                        i7 = i6;
                    }
                    str5 = null;
                    i9 = i10;
                    str6 = str5;
                }
                i7 = i6;
                str6 = null;
            }
            i8 = i7;
        }
    }

    final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊘"), zzet.zzn(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza(ProtectedSandApp.s("㊚"));
            }
            return false;
        }
        if (zzar(str2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊙"), zzet.zzn(str2));
        return false;
    }

    final boolean zzZ(String str, int i5, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊛"), str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i5) {
            return true;
        }
        this.zzt.zzaA().zze().zzd(ProtectedSandApp.s("㊜"), str, Integer.valueOf(i5), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlp.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    @n1
    protected final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                b.a(this.zzt, ProtectedSandApp.s("㊢"));
            }
        }
        this.zzd.set(nextLong);
    }

    final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊣"), str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i5 = 0; i5 < 3; i5++) {
            if (str2.startsWith(strArr3[i5])) {
                this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊤"), str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzau(str2, strArr2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊥"), str, str2);
        return false;
    }

    final boolean zzab(String str, String str2, int i5, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i5) {
                this.zzt.zzaA().zzl().zzd(ProtectedSandApp.s("㊦"), str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊧"), str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊨"), str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊩"), str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊪"), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊫"), str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("㊬"), str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊭"), str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc(ProtectedSandApp.s("㊮"), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @n1
    final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb(ProtectedSandApp.s("㊯"), str);
        return false;
    }

    final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return zzl.equals(str);
    }

    final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    final boolean zzah(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal(ProtectedSandApp.s("㊰"));
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(ProtectedSandApp.s("㊱")).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㊲"), e6);
            return true;
        } catch (CertificateException e7) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㊳"), e7);
            return true;
        }
    }

    public final boolean zzai(int i5, boolean z5) {
        Boolean zzj = this.zzt.zzt().zzj();
        if (zzm() < i5 / 1000) {
            return (zzj == null || zzj.booleanValue()) ? false : true;
        }
        return true;
    }

    final boolean zzao(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    final int zzd(String str, Object obj) {
        return ProtectedSandApp.s("㊴").equals(str) ? zzab(ProtectedSandApp.s("㊵"), str, zzas(str), obj) : zzab(ProtectedSandApp.s("㊶"), str, zzas(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        return true;
    }

    final int zzh(String str) {
        String s5 = ProtectedSandApp.s("㊷");
        if (!zzac(s5, str)) {
            return 2;
        }
        if (!zzaa(s5, zzhc.zza, zzhc.zzb, str)) {
            return 13;
        }
        this.zzt.zzf();
        return !zzZ(s5, 40, str) ? 2 : 0;
    }

    final int zzi(String str) {
        String s5 = ProtectedSandApp.s("㊸");
        if (!zzac(s5, str)) {
            return 3;
        }
        if (!zzaa(s5, null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ(s5, 40, str) ? 3 : 0;
    }

    final int zzj(String str) {
        String s5 = ProtectedSandApp.s("㊹");
        if (!zzad(s5, str)) {
            return 3;
        }
        if (!zzaa(s5, null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ(s5, 40, str) ? 3 : 0;
    }

    final int zzl(String str) {
        String s5 = ProtectedSandApp.s("㊺");
        if (!zzac(s5, str)) {
            return 6;
        }
        if (!zzaa(s5, zzhe.zza, null, str)) {
            return 15;
        }
        this.zzt.zzf();
        return !zzZ(s5, 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i5) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long j5;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long nextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
            int i5 = this.zze + 1;
            this.zze = i5;
            j5 = nextLong + i5;
        }
        return j5;
    }

    public final long zzr(long j5, long j6) {
        return ((j6 * FileWatchdog.DEFAULT_DELAY) + j5) / 86400000;
    }

    final Bundle zzs(Uri uri, boolean z5) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            boolean isHierarchical = uri.isHierarchical();
            String s5 = ProtectedSandApp.s("㊻");
            String s6 = ProtectedSandApp.s("㊼");
            String s7 = ProtectedSandApp.s("㊽");
            String s8 = ProtectedSandApp.s("㊾");
            if (isHierarchical) {
                str = uri.getQueryParameter(ProtectedSandApp.s("㊿"));
                str2 = uri.getQueryParameter(ProtectedSandApp.s("㋀"));
                str3 = uri.getQueryParameter(ProtectedSandApp.s("㋁"));
                str4 = uri.getQueryParameter(s8);
                str5 = uri.getQueryParameter(ProtectedSandApp.s("㋂"));
                str6 = uri.getQueryParameter(s7);
                str7 = uri.getQueryParameter(s6);
                str8 = z5 ? uri.getQueryParameter(s5) : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z5 || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(ProtectedSandApp.s("㋃"), str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(ProtectedSandApp.s("㋄"), str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(ProtectedSandApp.s("㋅"), str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(s8, str4);
            }
            String queryParameter = uri.getQueryParameter(ProtectedSandApp.s("㋆"));
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(ProtectedSandApp.s("㋇"), queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter(ProtectedSandApp.s("㋈"));
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(ProtectedSandApp.s("㋉"), queryParameter2);
            }
            String s9 = ProtectedSandApp.s("㋊");
            String queryParameter3 = uri.getQueryParameter(s9);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(s9, queryParameter3);
            }
            String s10 = ProtectedSandApp.s("㋋");
            String queryParameter4 = uri.getQueryParameter(s10);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(s10, queryParameter4);
            }
            String s11 = ProtectedSandApp.s("㋌");
            String queryParameter5 = uri.getQueryParameter(s11);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(s11, queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString(ProtectedSandApp.s("㋍"), str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString(s7, str6);
            }
            String queryParameter6 = uri.getQueryParameter(ProtectedSandApp.s("㋎"));
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(ProtectedSandApp.s("㋏"), queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter(ProtectedSandApp.s("㋐"));
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(ProtectedSandApp.s("㋑"), queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter(ProtectedSandApp.s("㋒"));
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(ProtectedSandApp.s("㋓"), queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString(s6, str7);
            }
            if (z5 && !TextUtils.isEmpty(str8)) {
                bundle.putString(s5, str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e6) {
            this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("㋔"), e6);
            return null;
        }
    }

    final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzt.zzaA().zzl().zzb(ProtectedSandApp.s("㋕"), this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.os.Bundle zzu(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlp.zzu(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    final zzau zzz(String str, String str2, Bundle bundle, String str3, long j5, boolean z5, boolean z6) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㋚"), this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        String s5 = ProtectedSandApp.s("㋙");
        bundle2.putString(s5, str3);
        Bundle zzu = zzu(str, str2, bundle2, CollectionUtils.listOf(s5), true);
        if (z5) {
            zzu = zzt(zzu);
        }
        Preconditions.checkNotNull(zzu);
        return new zzau(str2, new zzas(zzu), str3, j5);
    }
}
