package com.google.android.gms.common.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@q0 Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@o0 K k4, @o0 V v4, @o0 K k5, @o0 V v5, @o0 K k6, @o0 V v6) {
        Map zzb = zzb(3, false);
        zzb.put(k4, v4);
        zzb.put(k5, v5);
        zzb.put(k6, v6);
        return Collections.unmodifiableMap(zzb);
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@o0 K[] kArr, @o0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb.append(ProtectedSandApp.s("쯒"));
            sb.append(length);
            sb.append(ProtectedSandApp.s("쯓"));
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zzb = zzb(length, false);
        for (int i4 = 0; i4 < kArr.length; i4++) {
            zzb.put(kArr[i4], vArr[i4]);
        }
        return Collections.unmodifiableMap(zzb);
    }

    @o0
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i4) {
        return i4 == 0 ? new d() : zza(i4, true);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@o0 T t4, @o0 T t5, @o0 T t6) {
        Set zza = zza(3, false);
        zza.add(t4);
        zza.add(t5);
        zza.add(t6);
        return Collections.unmodifiableSet(zza);
    }

    private static Set zza(int i4, boolean z4) {
        if (i4 <= (true != z4 ? 256 : 128)) {
            return new d(i4);
        }
        return new HashSet(i4, true != z4 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i4, boolean z4) {
        return i4 <= 256 ? new androidx.collection.a(i4) : new HashMap(i4, 1.0f);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@o0 T t4) {
        return Collections.singletonList(t4);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@o0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@o0 K k4, @o0 V v4, @o0 K k5, @o0 V v5, @o0 K k6, @o0 V v6, @o0 K k7, @o0 V v7, @o0 K k10, @o0 V v10, @o0 K k11, @o0 V v11) {
        Map zzb = zzb(6, false);
        zzb.put(k4, v4);
        zzb.put(k5, v5);
        zzb.put(k6, v6);
        zzb.put(k7, v7);
        zzb.put(k10, v10);
        zzb.put(k11, v11);
        return Collections.unmodifiableMap(zzb);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@o0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t4 = tArr[0];
            T t5 = tArr[1];
            Set zza = zza(2, false);
            zza.add(t4);
            zza.add(t5);
            return Collections.unmodifiableSet(zza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zza2 = zza(length, false);
            Collections.addAll(zza2, tArr);
            return Collections.unmodifiableSet(zza2);
        }
        T t6 = tArr[0];
        T t7 = tArr[1];
        T t10 = tArr[2];
        T t11 = tArr[3];
        Set zza3 = zza(4, false);
        zza3.add(t6);
        zza3.add(t7);
        zza3.add(t10);
        zza3.add(t11);
        return Collections.unmodifiableSet(zza3);
    }
}
