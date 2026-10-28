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
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @q0
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb = null;

    @q0
    @GuardedBy("DynamiteModule.class")
    private static String zzc = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @q0
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;

    @q0
    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;

    @q0
    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @o0
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @o0
    public static final VersionPolicy zza = new zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @q0
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        public interface IVersions {
            int zza(@o0 Context context, @o0 String str);

            int zzb(@o0 Context context, @o0 String str, boolean z5) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
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
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@o0 Context context, @o0 String str) {
        String s5 = ProtectedSandApp.s("ಳ");
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(s5 + str + ProtectedSandApp.s("\u0cb4"));
            Field declaredField = loadClass.getDeclaredField(ProtectedSandApp.s("ವ"));
            Field declaredField2 = loadClass.getDeclaredField(ProtectedSandApp.s("ಶ"));
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e6) {
            ProtectedSandApp.s("ಷ").concat(String.valueOf(e6.getMessage()));
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
        Boolean bool;
        IObjectWrapper zzj;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        Boolean valueOf;
        String s5 = ProtectedSandApp.s("ಸ");
        String s6 = ProtectedSandApp.s("ಹ");
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
            int i5 = selectModule.localVersion;
            int i6 = selectModule.remoteVersion;
            int i7 = selectModule.selection;
            if (i7 != 0) {
                if (i7 == -1) {
                    if (i5 != 0) {
                        i7 = -1;
                    }
                }
                if (i7 != 1 || i6 != 0) {
                    if (i7 == -1) {
                        DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    }
                    try {
                        if (i7 != 1) {
                            throw new LoadingException(s5 + i7, null);
                        }
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!zzf(context)) {
                                    throw new LoadingException(ProtectedSandApp.s("ು"), null);
                                }
                                bool = zzb;
                            }
                            if (bool == null) {
                                throw new LoadingException(ProtectedSandApp.s("ೀ"), null);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    zzrVar = zzl;
                                }
                                if (zzrVar == null) {
                                    throw new LoadingException(ProtectedSandApp.s("಼"), null);
                                }
                                zzn zznVar3 = (zzn) threadLocal.get();
                                if (zznVar3 == null || zznVar3.zza == null) {
                                    throw new LoadingException(ProtectedSandApp.s("\u0cbb"), null);
                                }
                                Context applicationContext = context.getApplicationContext();
                                Cursor cursor2 = zznVar3.zza;
                                ObjectWrapper.wrap(null);
                                synchronized (DynamiteModule.class) {
                                    valueOf = Boolean.valueOf(zze >= 2);
                                }
                                Context context2 = (Context) ObjectWrapper.unwrap(valueOf.booleanValue() ? zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i6, ObjectWrapper.wrap(cursor2)) : zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i6, ObjectWrapper.wrap(cursor2)));
                                if (context2 == null) {
                                    throw new LoadingException(ProtectedSandApp.s("\u0cba"), null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                zzq zzg2 = zzg(context);
                                if (zzg2 == null) {
                                    throw new LoadingException(ProtectedSandApp.s("ಿ"), null);
                                }
                                int zze2 = zzg2.zze();
                                if (zze2 >= 3) {
                                    zzn zznVar4 = (zzn) threadLocal.get();
                                    if (zznVar4 == null) {
                                        throw new LoadingException(ProtectedSandApp.s("ಽ"), null);
                                    }
                                    zzj = zzg2.zzi(ObjectWrapper.wrap(context), str, i6, ObjectWrapper.wrap(zznVar4.zza));
                                } else {
                                    zzj = zze2 == 2 ? zzg2.zzj(ObjectWrapper.wrap(context), str, i6) : zzg2.zzh(ObjectWrapper.wrap(context), str, i6);
                                }
                                Object unwrap = ObjectWrapper.unwrap(zzj);
                                if (unwrap == null) {
                                    throw new LoadingException(ProtectedSandApp.s("ಾ"), null);
                                }
                                dynamiteModule = new DynamiteModule((Context) unwrap);
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor3 = zznVar2.zza;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(zznVar);
                            return dynamiteModule;
                        } catch (RemoteException e6) {
                            throw new LoadingException(ProtectedSandApp.s("ೃ"), e6, null);
                        } catch (LoadingException e7) {
                            throw e7;
                        } catch (Throwable th) {
                            CrashUtils.addDynamiteErrorToDropBox(context, th);
                            throw new LoadingException(ProtectedSandApp.s("ೂ"), th, null);
                        }
                    } catch (LoadingException e8) {
                        e8.getMessage();
                        int i8 = selectModule.localVersion;
                        if (i8 == 0 || versionPolicy.selectModule(context, str, new zzo(i8, 0)).selection != -1) {
                            throw new LoadingException(ProtectedSandApp.s("ೄ"), e8, null);
                        }
                        DynamiteModule zzc3 = zzc(context, str);
                        if (longValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(Long.valueOf(longValue));
                        }
                        Cursor cursor4 = zznVar2.zza;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        zzg.set(zznVar);
                        return zzc3;
                    }
                }
            }
            throw new LoadingException(s6 + str + ProtectedSandApp.s("\u0cc5") + selectModule.localVersion + ProtectedSandApp.s("ೆ") + selectModule.remoteVersion + ProtectedSandApp.s("ೇ"), null);
        } catch (Throwable th2) {
            if (longValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = zznVar2.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        if (zze(r11) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165 A[Catch: all -> 0x016c, TryCatch #5 {all -> 0x016c, blocks: (B:3:0x0002, B:9:0x00c6, B:64:0x00cc, B:11:0x00d6, B:38:0x012e, B:28:0x013b, B:51:0x0165, B:52:0x0168, B:47:0x015e, B:68:0x00d2, B:127:0x016b, B:5:0x0003, B:71:0x0009, B:72:0x0029, B:79:0x00c3, B:84:0x004a, B:102:0x009c, B:110:0x009f, B:121:0x00b8, B:8:0x00c5, B:124:0x00be), top: B:2:0x0002, inners: #4, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.o0 java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        ProtectedSandApp.s("\u0cd3").concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass(ProtectedSandApp.s("\u0cd4")).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("ೕ"));
                zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new LoadingException(ProtectedSandApp.s("ೖ"), e6, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z5 = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(ProtectedSandApp.s("\u0cd7"), 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && ProtectedSandApp.s("\u0cd8").equals(resolveContentProvider.packageName)) {
                z5 = true;
            }
            Boolean valueOf = Boolean.valueOf(z5);
            zzf = valueOf;
            z5 = valueOf.booleanValue();
            if (z5 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z5;
    }

    @q0
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext(ProtectedSandApp.s("\u0cd9"), 3).getClassLoader().loadClass(ProtectedSandApp.s("\u0cda")).newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("\u0cdb"));
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
            return null;
        }
    }

    @o0
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @o0
    @KeepForSdk
    public IBinder instantiate(@o0 String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new LoadingException(ProtectedSandApp.s("\u0cdc").concat(String.valueOf(str)), e6, null);
        }
    }
}
