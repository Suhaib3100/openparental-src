package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzc = null;
    private static String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static Boolean zzg;
    private static zzp zzl;
    private static zzq zzm;
    private final Context zzk;
    private static final ThreadLocal zzh = new ThreadLocal();
    private static final ThreadLocal zzi = new zze();
    private static final VersionPolicy.IVersions zzj = new zzf();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzg();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzh();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzi();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzj();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzk();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzl();

    @o0
    public static final VersionPolicy zza = new zzm();

    @o0
    public static final VersionPolicy zzb = new zzc();

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @o0
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        @KeepForSdk
        public interface IVersions {
            int zza(@o0 Context context, @o0 String str, boolean z4) throws LoadingException;

            int zzb(@o0 Context context, @o0 String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @o0
        @KeepForSdk
        SelectionResult selectModule(@o0 Context context, @o0 String str, @o0 IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzk = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@o0 Context context, @o0 String str) {
        String s4 = ProtectedSandApp.s("챚");
        String s5 = ProtectedSandApp.s("챛");
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append(s5);
            sb.append(str);
            sb.append(s4);
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField(ProtectedSandApp.s("챜"));
            Field declaredField2 = loadClass.getDeclaredField(ProtectedSandApp.s("챝"));
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + String.valueOf(str).length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e4) {
            ProtectedSandApp.s("챞").concat(String.valueOf(e4.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@o0 Context context, @o0 String str) {
        return zza(context, str, false);
    }

    @o0
    @KeepForSdk
    public static DynamiteModule load(@o0 Context context, @o0 VersionPolicy versionPolicy, @o0 String str) throws LoadingException {
        DynamiteModule zze2;
        int i4;
        Boolean bool;
        IObjectWrapper zzg2;
        zzq zzqVar;
        boolean z4;
        String s4 = ProtectedSandApp.s("챟");
        String s5 = ProtectedSandApp.s("챠");
        String s6 = ProtectedSandApp.s("챡");
        String s7 = ProtectedSandApp.s("챢");
        String s10 = ProtectedSandApp.s("챣");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException(ProtectedSandApp.s("챭"), null);
        }
        ThreadLocal threadLocal = zzh;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzi;
        Long l4 = (Long) threadLocal2.get();
        long longValue = l4.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzj);
            new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(selectModule.localVersion).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(selectModule.remoteVersion).length());
            int i5 = selectModule.selection;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (selectModule.localVersion != 0) {
                        i5 = -1;
                    }
                }
                if (i5 != 1 || selectModule.remoteVersion != 0) {
                    if (i5 == -1) {
                        DynamiteModule zze3 = zze(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l4);
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zze3;
                    }
                    if (i5 != 1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 36);
                        sb.append(s4);
                        sb.append(i5);
                        throw new LoadingException(sb.toString(), null);
                    }
                    try {
                        i4 = selectModule.remoteVersion;
                    } catch (LoadingException e4) {
                        new StringBuilder(String.valueOf(e4.getMessage()).length() + 30);
                        int i6 = selectModule.localVersion;
                        if (i6 == 0 || versionPolicy.selectModule(context, str, new zzo(i6, 0)).selection != -1) {
                            throw new LoadingException(ProtectedSandApp.s("챬"), e4, null);
                        }
                        zze2 = zze(applicationContext, str);
                    }
                    try {
                        synchronized (DynamiteModule.class) {
                            if (!zzb(context)) {
                                throw new LoadingException(ProtectedSandApp.s("챫"), null);
                            }
                            bool = zzc;
                        }
                        if (bool == null) {
                            throw new LoadingException(ProtectedSandApp.s("챪"), null);
                        }
                        if (bool.booleanValue()) {
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i4).length());
                            synchronized (DynamiteModule.class) {
                                zzqVar = zzm;
                            }
                            if (zzqVar == null) {
                                throw new LoadingException(ProtectedSandApp.s("챦"), null);
                            }
                            zzn zznVar3 = (zzn) threadLocal.get();
                            if (zznVar3 == null || zznVar3.zza == null) {
                                throw new LoadingException(ProtectedSandApp.s("챥"), null);
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = zznVar3.zza;
                            ObjectWrapper.wrap(null);
                            synchronized (DynamiteModule.class) {
                                z4 = zzf >= 2;
                            }
                            Context context2 = (Context) ObjectWrapper.unwrap(z4 ? zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor2)) : zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor2)));
                            if (context2 == null) {
                                throw new LoadingException(ProtectedSandApp.s("챤"), null);
                            }
                            zze2 = new DynamiteModule(context2);
                        } else {
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i4).length());
                            zzp zzg3 = zzg(context);
                            if (zzg3 == null) {
                                throw new LoadingException(ProtectedSandApp.s("챩"), null);
                            }
                            int zzi2 = zzg3.zzi();
                            if (zzi2 >= 3) {
                                zzn zznVar4 = (zzn) threadLocal.get();
                                if (zznVar4 == null) {
                                    throw new LoadingException(ProtectedSandApp.s("챧"), null);
                                }
                                zzg2 = zzg3.zzk(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zznVar4.zza));
                            } else {
                                zzg2 = zzi2 == 2 ? zzg3.zzg(ObjectWrapper.wrap(context), str, i4) : zzg3.zze(ObjectWrapper.wrap(context), str, i4);
                            }
                            Object unwrap = ObjectWrapper.unwrap(zzg2);
                            if (unwrap == null) {
                                throw new LoadingException(ProtectedSandApp.s("챨"), null);
                            }
                            zze2 = new DynamiteModule((Context) unwrap);
                        }
                        return zze2;
                    } catch (RemoteException e5) {
                        throw new LoadingException(ProtectedSandApp.s("챨"), e5, null);
                    } catch (LoadingException e6) {
                        throw e6;
                    } catch (Throwable th) {
                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                        throw new LoadingException(ProtectedSandApp.s("챨"), th, null);
                    }
                }
            }
            int i7 = selectModule.localVersion;
            int i10 = selectModule.remoteVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i10).length() + 1);
            sb2.append(s10);
            sb2.append(str);
            sb2.append(s7);
            sb2.append(i7);
            sb2.append(s6);
            sb2.append(i10);
            sb2.append(s5);
            throw new LoadingException(sb2.toString(), null);
        } finally {
            if (longValue == 0) {
                zzi.remove();
            } else {
                zzi.set(l4);
            }
            Cursor cursor3 = zznVar2.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzh.set(zznVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0151, code lost:
    
        if (zzd(r11) != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.o0 java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzg)) {
            return true;
        }
        boolean z4 = false;
        if (zzg == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(ProtectedSandApp.s("챯"), true != PlatformVersion.isAtLeastQ() ? 0 : ClientDefaults.MAX_MSG_SIZE);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && ProtectedSandApp.s("챰").equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            zzg = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zze = true;
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0171: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:326), block:B:112:0x0171 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzc(android.content.Context r15, java.lang.String r16, boolean r17, boolean r18) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static boolean zzd(Cursor cursor) {
        zzn zznVar = (zzn) zzh.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static DynamiteModule zze(Context context, String str) {
        ProtectedSandApp.s("챼").concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzf(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass(ProtectedSandApp.s("챽")).getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("챾"));
                zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new LoadingException(ProtectedSandApp.s("챿"), e, bArr);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new LoadingException(ProtectedSandApp.s("챿"), e, bArr);
        } catch (InstantiationException e6) {
            e = e6;
            throw new LoadingException(ProtectedSandApp.s("챿"), e, bArr);
        } catch (NoSuchMethodException e7) {
            e = e7;
            throw new LoadingException(ProtectedSandApp.s("챿"), e, bArr);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new LoadingException(ProtectedSandApp.s("챿"), e, bArr);
        }
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext(ProtectedSandApp.s("챰"), 3).getClassLoader().loadClass(ProtectedSandApp.s("첀")).newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("첁"));
                    zzpVar = queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e4) {
                new StringBuilder(String.valueOf(e4.getMessage()).length() + 45);
            }
            return null;
        }
    }

    @o0
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzk;
    }

    @o0
    @KeepForSdk
    public IBinder instantiate(@o0 String str) throws LoadingException {
        try {
            return (IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException(ProtectedSandApp.s("첂").concat(String.valueOf(str)), e4, null);
        }
    }
}
