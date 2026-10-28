package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.collection.r2;
import androidx.compose.runtime.changelist.j;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpu;
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import mf.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzos extends zzjd {
    private static final String[] zza = {ProtectedSandApp.s("\ue40c"), ProtectedSandApp.s("\ue40a"), ProtectedSandApp.s("\ue40b")};
    private static final String[] zzb = {ProtectedSandApp.s("\ue40d")};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private androidx.privacysandbox.ads.adservices.java.measurement.a zzf;
    private Boolean zzg;
    private Integer zzh;

    zzos(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List<java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzos.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static int zzc() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    private final int zzk(String str) {
        String s4 = ProtectedSandApp.s("\ue43a");
        if (!zzb(s4, str)) {
            return 3;
        }
        if (zza(s4, (String[]) null, str)) {
            return !zza(s4, 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int zzl(String str) {
        String s4 = ProtectedSandApp.s("\ue43a");
        if (!zzc(s4, str)) {
            return 3;
        }
        if (zza(s4, (String[]) null, str)) {
            return !zza(s4, 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int zzm(String str) {
        if (ProtectedSandApp.s("\ue43b").equals(str)) {
            return 2048;
        }
        if (ProtectedSandApp.s("\ue43c").equals(str)) {
            return 256;
        }
        return ProtectedSandApp.s("\ue43d").equals(str) ? 100 : 36;
    }

    static MessageDigest zzu() {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("\ue43f"));
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @n1
    @TargetApi(30)
    private final boolean zzy() {
        Integer num;
        if (this.zzg == null) {
            androidx.privacysandbox.ads.adservices.java.measurement.a zzo = zzo();
            boolean z4 = false;
            if (zzo == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = zzo.c().get(i0.f35991f, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z4 = true;
                        }
                    } catch (InterruptedException e4) {
                        e = e4;
                        num2 = num;
                        zzj().zzu().zza(ProtectedSandApp.s("\ue440"), e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza(ProtectedSandApp.s("\ue441"), num);
                        return this.zzg.booleanValue();
                    } catch (CancellationException e5) {
                        e = e5;
                        num2 = num;
                        zzj().zzu().zza(ProtectedSandApp.s("\ue440"), e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza(ProtectedSandApp.s("\ue441"), num);
                        return this.zzg.booleanValue();
                    } catch (ExecutionException e6) {
                        e = e6;
                        num2 = num;
                        zzj().zzu().zza(ProtectedSandApp.s("\ue440"), e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza(ProtectedSandApp.s("\ue441"), num);
                        return this.zzg.booleanValue();
                    } catch (TimeoutException e7) {
                        e = e7;
                        num2 = num;
                        zzj().zzu().zza(ProtectedSandApp.s("\ue440"), e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza(ProtectedSandApp.s("\ue441"), num);
                        return this.zzg.booleanValue();
                    }
                }
                this.zzg = Boolean.valueOf(z4);
            } catch (InterruptedException e10) {
                e = e10;
            } catch (CancellationException e11) {
                e = e11;
            } catch (ExecutionException e12) {
                e = e12;
            } catch (TimeoutException e13) {
                e = e13;
            }
            zzj().zzp().zza(ProtectedSandApp.s("\ue441"), num);
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    @n1
    protected final void zzaa() {
        zzt();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().zzu().zza(ProtectedSandApp.s("\ue486"));
            }
        }
        this.zzd.set(nextLong);
    }

    final int zzb(String str) {
        String s4 = ProtectedSandApp.s("\ue444");
        if (!zzb(s4, str)) {
            return 6;
        }
        if (zza(s4, zzjj.zza, str)) {
            return !zza(s4, 24, str) ? 6 : 0;
        }
        return 15;
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

    @d({"this.apkVersion"})
    public final int zzg() {
        if (this.zzh == null) {
            this.zzh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.zzh.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
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

    public final long zzn() {
        long andIncrement;
        long j4;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long nextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
            int i4 = this.zze + 1;
            this.zze = i4;
            j4 = nextLong + i4;
        }
        return j4;
    }

    final androidx.privacysandbox.ads.adservices.java.measurement.a zzo() {
        if (this.zzf == null) {
            this.zzf = androidx.privacysandbox.ads.adservices.java.measurement.a.b(zza());
        }
        return this.zzf;
    }

    final String zzp() {
        byte[] bArr = new byte[16];
        zzv().nextBytes(bArr);
        return String.format(Locale.US, ProtectedSandApp.s("\ue48f"), new BigInteger(1, bArr));
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

    @n1
    @d({"this.secureRandom"})
    final SecureRandom zzv() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @n1
    final boolean zzw() {
        zzt();
        return zzm() == 1;
    }

    public final boolean zzx() {
        try {
            zza().getClassLoader().loadClass(ProtectedSandApp.s("\ue490"));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static boolean zzd(String str) {
        return zze(zzbh.zzbd.zza(null), str);
    }

    static boolean zzf(String str) {
        return zze(zzbh.zzca.zza(null), str);
    }

    static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals(ProtectedSandApp.s("\ue439"));
    }

    public static boolean zzj(String str) {
        for (String str2 : zzb) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    @n1
    final boolean zze(String str) {
        zzt();
        if (Wrappers.packageManager(zza()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().zzc().zza(ProtectedSandApp.s("\ue48c"), str);
        return false;
    }

    public final boolean zzi(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent(ProtectedSandApp.s("\ue48d"), Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    static boolean zzg(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(ProtectedSandApp.s("\ue438"));
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @n1
    final long zzc(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i4 = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i4 = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().zzo().zza(ProtectedSandApp.s("\ue48a"), str);
        }
        return i4;
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

    @n1
    final long zzm() {
        int extensionVersion;
        long j4;
        zzt();
        if (!zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j4 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j4 = 8;
            } else {
                j4 = zzc() < zzbh.zzax.zza(null).intValue() ? 16L : 0L;
            }
        }
        if (!zze(ProtectedSandApp.s("\ue48e"))) {
            j4 |= 2;
        }
        if (j4 == 0 && !zzy()) {
            j4 |= 64;
        }
        if (j4 == 0) {
            return 1L;
        }
        return j4;
    }

    private static boolean zze(String str, String str2) {
        return str.equals(ProtectedSandApp.s("\ue436")) || Arrays.asList(str.split(ProtectedSandApp.s("\ue437"))).contains(str2);
    }

    final Object zzb(String str, Object obj) {
        int zza2;
        if (ProtectedSandApp.s("\ue414").equals(str)) {
            return zza(zze().zzb((String) null, false), obj, true, true, (String) null);
        }
        if (zzg(str)) {
            zza2 = zze().zzb((String) null, false);
        } else {
            zza2 = zze().zza((String) null, false);
        }
        return zza(zza2, obj, false, true, (String) null);
    }

    final boolean zzd(String str, String str2) {
        if (zzpu.zza() && zze().zza(zzbh.zzby) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zze().zzo().equals(str);
    }

    final Object zzc(String str, Object obj) {
        if (ProtectedSandApp.s("\ue43b").equals(str)) {
            return zza(zzm(str), obj, true, false, (String) null);
        }
        return zza(zzm(str), obj, false, false, (String) null);
    }

    @m1
    private static boolean zzn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches(ProtectedSandApp.s("\ue43e"));
    }

    final boolean zzc(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue47e"), str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue487"), str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue48b"), str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue489"), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static ArrayList<Bundle> zzb(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\ue423"), zzaeVar.zza);
            bundle.putString(ProtectedSandApp.s("\ue424"), zzaeVar.zzb);
            bundle.putLong(ProtectedSandApp.s("\ue425"), zzaeVar.zzd);
            bundle.putString(ProtectedSandApp.s("\ue426"), zzaeVar.zzc.zza);
            zzjf.zza(bundle, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
            bundle.putBoolean(ProtectedSandApp.s("\ue427"), zzaeVar.zze);
            String str = zzaeVar.zzf;
            if (str != null) {
                bundle.putString(ProtectedSandApp.s("\ue428"), str);
            }
            zzbf zzbfVar = zzaeVar.zzg;
            if (zzbfVar != null) {
                bundle.putString(ProtectedSandApp.s("\ue429"), zzbfVar.zza);
                zzbe zzbeVar = zzbfVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle(ProtectedSandApp.s("\ue42a"), zzbeVar.zzb());
                }
            }
            bundle.putLong(ProtectedSandApp.s("\ue42b"), zzaeVar.zzh);
            zzbf zzbfVar2 = zzaeVar.zzi;
            if (zzbfVar2 != null) {
                bundle.putString(ProtectedSandApp.s("\ue42c"), zzbfVar2.zza);
                zzbe zzbeVar2 = zzbfVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle(ProtectedSandApp.s("\ue42d"), zzbeVar2.zzb());
                }
            }
            bundle.putLong(ProtectedSandApp.s("\ue42e"), zzaeVar.zzc.zzb);
            bundle.putLong(ProtectedSandApp.s("\ue42f"), zzaeVar.zzj);
            zzbf zzbfVar3 = zzaeVar.zzk;
            if (zzbfVar3 != null) {
                bundle.putString(ProtectedSandApp.s("\ue430"), zzbfVar3.zza);
                zzbe zzbeVar3 = zzbfVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(ProtectedSandApp.s("\ue431"), zzbeVar3.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean zzc(Context context, String str) {
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

    final int zza(String str, Object obj) {
        boolean zza2;
        if (ProtectedSandApp.s("\ue43b").equals(str)) {
            zza2 = zza(ProtectedSandApp.s("\ue443"), str, zzm(str), obj);
        } else {
            zza2 = zza(ProtectedSandApp.s("\ue444"), str, zzm(str), obj);
        }
        return zza2 ? 0 : 7;
    }

    private static boolean zzb(Bundle bundle, int i4) {
        if (bundle == null) {
            return false;
        }
        String s4 = ProtectedSandApp.s("\ue40d");
        if (bundle.getLong(s4) != 0) {
            return false;
        }
        bundle.putLong(s4, i4);
        return true;
    }

    final boolean zzb(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue47e"), str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue487"), str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue488"), str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue489"), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final int zza(String str) {
        String s4 = ProtectedSandApp.s("\ue442");
        if (!zzb(s4, str)) {
            return 2;
        }
        if (zza(s4, zzji.zza, zzji.zzb, str)) {
            return !zza(s4, 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int zza(int i4) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006e -> B:8:0x007f). Please report as a decompilation issue!!! */
    @n1
    final long zza(Context context, String str) {
        zzt();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest zzu = zzu();
        long j4 = -1;
        if (zzu == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue445"));
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e4) {
                    zzj().zzg().zza(ProtectedSandApp.s("\ue434"), e4);
                }
                if (!zzb(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j4 = zza(zzu.digest(signatureArr[0].toByteArray()));
                    } else {
                        zzj().zzu().zza(ProtectedSandApp.s("\ue446"));
                    }
                }
            }
            j4 = 0;
        }
        return j4;
    }

    @m1
    private final boolean zzb(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal(ProtectedSandApp.s("\ue432"));
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(ProtectedSandApp.s("\ue433")).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue434"), e4);
            return true;
        } catch (CertificateException e5) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue435"), e5);
            return true;
        }
    }

    @m1
    static long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i4 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j4 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j4 += (bArr[length] & 255) << i4;
            i4 += 8;
        }
        return j4;
    }

    public static long zza(zzbe zzbeVar) {
        long j4 = 0;
        if (zzbeVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbeVar.iterator();
        while (it.hasNext()) {
            if (zzbeVar.zzc(it.next()) instanceof Parcelable[]) {
                j4 += ((Parcelable[]) r3).length;
            }
        }
        return j4;
    }

    static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long zza(long j4, long j5) {
        return ((j5 * 60000) + j4) / 86400000;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Bundle zza(List<zzon> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzon zzonVar : list) {
            String str = zzonVar.zzd;
            if (str != null) {
                bundle.putString(zzonVar.zza, str);
            } else {
                Long l4 = zzonVar.zzc;
                if (l4 != null) {
                    bundle.putLong(zzonVar.zza, l4.longValue());
                } else {
                    Double d5 = zzonVar.zzf;
                    if (d5 != null) {
                        bundle.putDouble(zzonVar.zza, d5.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    final Bundle zza(Uri uri, boolean z4) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            boolean isHierarchical = uri.isHierarchical();
            String s4 = ProtectedSandApp.s("\ue447");
            String s5 = ProtectedSandApp.s("\ue448");
            String s6 = ProtectedSandApp.s("\ue449");
            String s7 = ProtectedSandApp.s("\ue44a");
            String s10 = ProtectedSandApp.s("\ue44b");
            if (isHierarchical) {
                str = uri.getQueryParameter(ProtectedSandApp.s("\ue44c"));
                str2 = uri.getQueryParameter(ProtectedSandApp.s("\ue44d"));
                str3 = uri.getQueryParameter(ProtectedSandApp.s("\ue44e"));
                str4 = uri.getQueryParameter(s10);
                str5 = z4 ? uri.getQueryParameter(s7) : null;
                str6 = uri.getQueryParameter(ProtectedSandApp.s("\ue44f"));
                str7 = uri.getQueryParameter(s6);
                str8 = uri.getQueryParameter(s5);
                str9 = uri.getQueryParameter(s4);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z4 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = s4;
            } else {
                str10 = s4;
                bundle.putString(ProtectedSandApp.s("\ue450"), str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(ProtectedSandApp.s("\ue451"), str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(ProtectedSandApp.s("\ue452"), str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(s10, str4);
            }
            if (z4 && !TextUtils.isEmpty(str5)) {
                bundle.putString(s7, str5);
            }
            String s11 = ProtectedSandApp.s("\ue453");
            String queryParameter = uri.getQueryParameter(s11);
            if (z4 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString(s11, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter(ProtectedSandApp.s("\ue454"));
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(ProtectedSandApp.s("\ue455"), queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(ProtectedSandApp.s("\ue456"));
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(ProtectedSandApp.s("\ue457"), queryParameter3);
            }
            String s12 = ProtectedSandApp.s("\ue458");
            String queryParameter4 = uri.getQueryParameter(s12);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(s12, queryParameter4);
            }
            String s13 = ProtectedSandApp.s("\ue459");
            String queryParameter5 = uri.getQueryParameter(s13);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(s13, queryParameter5);
            }
            String s14 = ProtectedSandApp.s("\ue45a");
            String queryParameter6 = uri.getQueryParameter(s14);
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(s14, queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString(ProtectedSandApp.s("\ue45b"), str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString(s6, str7);
            }
            String queryParameter7 = uri.getQueryParameter(ProtectedSandApp.s("\ue45c"));
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(ProtectedSandApp.s("\ue45d"), queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter(ProtectedSandApp.s("\ue45e"));
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(ProtectedSandApp.s("\ue45f"), queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter(ProtectedSandApp.s("\ue460"));
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(ProtectedSandApp.s("\ue461"), queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString(s5, str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e4) {
            zzj().zzu().zza(ProtectedSandApp.s("\ue462"), e4);
            return null;
        }
    }

    public static Bundle zza(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i4 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i4 < parcelableArr.length) {
                        if (parcelableArr[i4] instanceof Bundle) {
                            parcelableArr[i4] = new Bundle((Bundle) parcelableArr[i4]);
                        }
                        i4++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i4 < list.size()) {
                        Object obj2 = list.get(i4);
                        if (obj2 instanceof Bundle) {
                            list.set(i4, new Bundle((Bundle) obj2));
                        }
                        i4++;
                    }
                }
            }
        }
        return bundle2;
    }

    final Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object zzb2 = zzb(str2, bundle.get(str2));
                if (zzb2 == null) {
                    zzj().zzv().zza(ProtectedSandApp.s("\ue463"), zzi().zzb(str2));
                } else {
                    zza(bundle2, str2, zzb2);
                }
            }
        }
        return bundle2;
    }

    final Bundle zza(String str, String str2, Bundle bundle, List<String> list, boolean z4) {
        int zzl;
        int i4;
        zzos zzosVar = this;
        boolean zza2 = zza(str2, zzji.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int zzc = zze().zzc();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list == null || !list.contains(str3)) {
                zzl = !z4 ? zzosVar.zzl(str3) : 0;
                if (zzl == 0) {
                    zzl = zzosVar.zzk(str3);
                }
            } else {
                zzl = 0;
            }
            if (zzl != 0) {
                zza(bundle2, zzl, str3, zzl == 3 ? str3 : null);
                bundle2.remove(str3);
                i4 = zzc;
            } else {
                i4 = zzc;
                int zza3 = zza(str, str2, str3, bundle.get(str3), bundle2, list, z4, zza2);
                if (zza3 == 17) {
                    zza(bundle2, zza3, str3, Boolean.FALSE);
                } else if (zza3 != 0 && !ProtectedSandApp.s("\ue414").equals(str3)) {
                    zza(bundle2, zza3, zza3 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3)) {
                    int i6 = i5 + 1;
                    if (i6 > i4) {
                        zzj().zzm().zza(r2.a(ProtectedSandApp.s("\ue464"), i4, ProtectedSandApp.s("\ue465")), zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i5 = i6;
                }
            }
            zzc = i4;
            zzosVar = this;
        }
        return bundle2;
    }

    final zzbf zza(String str, String str2, Bundle bundle, String str3, long j4, boolean z4, boolean z5) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zza(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            String s4 = ProtectedSandApp.s("\ue466");
            bundle2.putString(s4, str3);
            Bundle zza2 = zza(str, str2, bundle2, CollectionUtils.listOf(s4), true);
            if (z4) {
                zza2 = zza(zza2, str);
            }
            Preconditions.checkNotNull(zza2);
            return new zzbf(str2, new zzbe(zza2), str3, j4);
        }
        zzj().zzg().zza(ProtectedSandApp.s("\ue467"), zzi().zzc(str2));
        throw new IllegalArgumentException();
    }

    private final Object zza(int i4, Object obj, boolean z4, boolean z5, String str) {
        Bundle zza2;
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
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            if (!z5 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (zza2 = zza((Bundle) parcelable, (String) null)) != null && !zza2.isEmpty()) {
                    arrayList.add(zza2);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return zza(String.valueOf(obj), i4, z4);
    }

    public static String zza(String str, int i4, boolean z4) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i4) {
            return str;
        }
        if (z4) {
            return j.a(str.substring(0, str.offsetByCodePoints(0, i4)), ProtectedSandApp.s("\ue413"));
        }
        return null;
    }

    public final URL zza(long j4, String str, String str2, long j5, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format(ProtectedSandApp.s("\ue468"), String.format(ProtectedSandApp.s("\ue469"), Long.valueOf(j4), Integer.valueOf(zzg())), str2, str, Long.valueOf(j5));
            if (str.equals(zze().zzp())) {
                format = format.concat(ProtectedSandApp.s("\ue46a"));
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat(ProtectedSandApp.s("\ue46b"));
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e4) {
            e = e4;
            zzj().zzg().zza(ProtectedSandApp.s("\ue46c"), e.getMessage());
            return null;
        } catch (MalformedURLException e5) {
            e = e5;
            zzj().zzg().zza(ProtectedSandApp.s("\ue46c"), e.getMessage());
            return null;
        }
    }

    @n1
    final void zza(Bundle bundle, long j4) {
        String s4 = ProtectedSandApp.s("\ue46d");
        long j5 = bundle.getLong(s4);
        if (j5 != 0) {
            zzj().zzu().zza(ProtectedSandApp.s("\ue46e"), Long.valueOf(j5));
        }
        bundle.putLong(s4, j4 + j5);
    }

    private static void zza(Bundle bundle, int i4, String str, Object obj) {
        if (zzb(bundle, i4)) {
            bundle.putString(ProtectedSandApp.s("\ue414"), zza(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong(ProtectedSandApp.s("\ue415"), String.valueOf(obj).length());
                }
            }
        }
    }

    @n1
    public static void zza(zzlk zzlkVar, Bundle bundle, boolean z4) {
        String s4 = ProtectedSandApp.s("\ue416");
        String s5 = ProtectedSandApp.s("\ue417");
        String s6 = ProtectedSandApp.s("\ue418");
        if (bundle == null || zzlkVar == null || (bundle.containsKey(s6) && !z4)) {
            if (bundle != null && zzlkVar == null && z4) {
                bundle.remove(s5);
                bundle.remove(s6);
                bundle.remove(s4);
                return;
            }
            return;
        }
        String str = zzlkVar.zza;
        if (str != null) {
            bundle.putString(s5, str);
        } else {
            bundle.remove(s5);
        }
        String str2 = zzlkVar.zzb;
        if (str2 != null) {
            bundle.putString(s6, str2);
        } else {
            bundle.remove(s6);
        }
        bundle.putLong(s4, zzlkVar.zzc);
    }

    final void zza(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzq().zza(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zza(Parcelable[] parcelableArr, int i4) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i5 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzh(str) && !zza(str, zzjk.zzd) && (i5 = i5 + 1) > i4) {
                    zzj().zzm().zza(r2.a(ProtectedSandApp.s("\ue478"), i4, ProtectedSandApp.s("\ue479")), zzi().zzb(str), zzi().zza(bundle));
                    zzb(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    final void zza(zzgs zzgsVar, int i4) {
        Iterator it = new TreeSet(zzgsVar.zzc.keySet()).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzh(str) && (i5 = i5 + 1) > i4) {
                zzj().zzm().zza(r2.a(ProtectedSandApp.s("\ue464"), i4, ProtectedSandApp.s("\ue465")), zzi().zza(zzgsVar.zza), zzi().zza(zzgsVar.zzc));
                zzb(zzgsVar.zzc, 5);
                zzgsVar.zzc.remove(str);
            }
        }
    }

    public static void zza(zzor zzorVar, int i4, String str, String str2, int i5) {
        zza(zzorVar, (String) null, i4, str, str2, i5);
    }

    static void zza(zzor zzorVar, String str, int i4, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        zzb(bundle, i4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong(ProtectedSandApp.s("\ue415"), i5);
        }
        zzorVar.zza(str, ProtectedSandApp.s("\ue40d"), bundle);
    }

    final void zza(Bundle bundle, String str, Object obj) {
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
            zzj().zzv().zza(ProtectedSandApp.s("\ue46f"), zzi().zzb(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ProtectedSandApp.s("\ue470"), z4);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue476"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ProtectedSandApp.s("\ue470"), arrayList);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue475"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, Bundle bundle) {
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue473"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(ProtectedSandApp.s("\ue470"), bArr);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue477"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("\ue470"), i4);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue471"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong(ProtectedSandApp.s("\ue470"), j4);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue472"), e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("\ue470"), str);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue474"), e4);
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z4) {
        int zzl;
        int i4;
        String str4;
        int zza2;
        int i5;
        if (bundle == null) {
            return;
        }
        int i6 = zze().zzq().zza(231100000, true) ? 35 : 0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                zzl = !z4 ? zzl(str5) : 0;
                if (zzl == 0) {
                    zzl = zzk(str5);
                }
            } else {
                zzl = 0;
            }
            if (zzl != 0) {
                zza(bundle, zzl, str5, zzl == 3 ? str5 : null);
                bundle.remove(str5);
                i4 = i6;
            } else {
                if (zza(bundle.get(str5))) {
                    zzj().zzv().zza(ProtectedSandApp.s("\ue419"), str2, str3, str5);
                    zza2 = 22;
                    str4 = str5;
                    i4 = i6;
                } else {
                    str4 = str5;
                    i4 = i6;
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z4, false);
                }
                if (zza2 != 0 && !ProtectedSandApp.s("\ue414").equals(str4)) {
                    zza(bundle, zza2, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else {
                    if (!zzh(str4) || zza(str4, zzjk.zzd)) {
                        i5 = i4;
                    } else {
                        int i10 = i7 + 1;
                        if (zza(231100000, true)) {
                            i5 = i4;
                            if (i10 > i5) {
                                zzj().zzm().zza(r2.a(ProtectedSandApp.s("\ue41b"), i5, ProtectedSandApp.s("\ue41c")), zzi().zza(str2), zzi().zza(bundle));
                                zzb(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            zzj().zzm().zza(ProtectedSandApp.s("\ue41a"), zzi().zza(str2), zzi().zza(bundle));
                            zzb(bundle, 23);
                            bundle.remove(str4);
                            i5 = i4;
                        }
                        i7 = i10;
                    }
                    i6 = i5;
                }
            }
            i6 = i4;
        }
    }

    private static boolean zza(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    final boolean zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzn(str)) {
                return true;
            }
            if (this.zzu.zzae()) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue480"), zzgo.zza(str));
            }
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (zzn(str2)) {
                return true;
            }
            zzj().zzm().zza(ProtectedSandApp.s("\ue481"), zzgo.zza(str2));
            return false;
        }
        if (this.zzu.zzae()) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue482"));
        }
        return false;
    }

    final boolean zza(String str, int i4, String str2) {
        if (str2 == null) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue47e"), str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i4) {
            return true;
        }
        zzj().zzm().zza(ProtectedSandApp.s("\ue47f"), str, Integer.valueOf(i4), str2);
        return false;
    }

    final boolean zza(String str, String[] strArr, String str2) {
        return zza(str, strArr, (String[]) null, str2);
    }

    final boolean zza(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().zzm().zza(ProtectedSandApp.s("\ue47e"), str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        for (String str3 : zza) {
            if (str2.startsWith(str3)) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue484"), str, str2);
                return false;
            }
        }
        if (strArr == null || !zza(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zza(str2, strArr2)) {
            return true;
        }
        zzj().zzm().zza(ProtectedSandApp.s("\ue485"), str, str2);
        return false;
    }

    final boolean zza(String str, String str2, int i4, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i4) {
                zzj().zzv().zza(ProtectedSandApp.s("\ue483"), str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    static boolean zza(Bundle bundle, int i4) {
        int i5 = 0;
        if (bundle.size() <= i4) {
            return false;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i5++;
            if (i5 > i4) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean zza(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zza(int i4, boolean z4) {
        Boolean zzab = this.zzu.zzr().zzab();
        if (zzg() < i4 / 1000) {
            return (zzab == null || zzab.booleanValue()) ? false : true;
        }
        return true;
    }

    static boolean zza(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, ProtectedSandApp.s("\ue41d")), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zza(Context context, boolean z4) {
        Preconditions.checkNotNull(context);
        return zzc(context, ProtectedSandApp.s("\ue41e"));
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean zza(String str, double d5) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences(ProtectedSandApp.s("\ue47a"), 0).edit();
            edit.putString(ProtectedSandApp.s("\ue47b"), str);
            edit.putLong(ProtectedSandApp.s("\ue47c"), Double.doubleToRawLongBits(d5));
            return edit.commit();
        } catch (RuntimeException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue47d"), e4);
            return false;
        }
    }

    static boolean zza(Intent intent) {
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("\ue41f"));
        return ProtectedSandApp.s("\ue420").equals(stringExtra) || ProtectedSandApp.s("\ue421").equals(stringExtra) || ProtectedSandApp.s("\ue422").equals(stringExtra);
    }

    static boolean zza(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    static byte[] zza(Parcelable parcelable) {
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
}
