package com.google.android.gms.internal.common;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzj {
    @q0
    public static Object zza(Class cls, String str, zzi... zziVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return zzc(cls, ProtectedSandApp.s("쿛"), null, false, zziVarArr);
    }

    @q0
    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return zzc(classLoader.loadClass(ProtectedSandApp.s("쿜")), ProtectedSandApp.s("쿝"), null, false, zziVarArr);
    }

    @q0
    private static Object zzc(Class cls, String str, @q0 Object obj, boolean z4, zzi... zziVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i4 = 0; i4 < zziVarArr.length; i4++) {
            zzi zziVar = zziVarArr[i4];
            zziVar.getClass();
            clsArr[i4] = zziVar.zzc();
            objArr[i4] = zziVarArr[i4].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
