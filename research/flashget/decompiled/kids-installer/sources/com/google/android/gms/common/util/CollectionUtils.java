package com.google.android.gms.common.util;

import android.content.preferences.protobuf.v;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a;
import androidx.collection.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@q0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@o0 K k5, @o0 V v5, @o0 K k6, @o0 V v6, @o0 K k7, @o0 V v7) {
        Map zza = zza(3, false);
        zza.put(k5, v5);
        zza.put(k6, v6);
        zza.put(k7, v7);
        return Collections.unmodifiableMap(zza);
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@o0 K[] kArr, @o0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(v.a(ProtectedSandApp.s("఼"), length, ProtectedSandApp.s("ఽ"), length2));
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zza = zza(length, false);
        for (int i5 = 0; i5 < kArr.length; i5++) {
            zza.put(kArr[i5], vArr[i5]);
        }
        return Collections.unmodifiableMap(zza);
    }

    @o0
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i5) {
        return i5 == 0 ? new b() : zzb(i5, true);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@o0 T t5, @o0 T t6, @o0 T t7) {
        Set zzb = zzb(3, false);
        zzb.add(t5);
        zzb.add(t6);
        zzb.add(t7);
        return Collections.unmodifiableSet(zzb);
    }

    private static Map zza(int i5, boolean z5) {
        return i5 <= 256 ? new a(i5) : new HashMap(i5, 1.0f);
    }

    private static Set zzb(int i5, boolean z5) {
        return i5 <= (true != z5 ? 256 : 128) ? new b(i5) : new HashSet(i5, true != z5 ? 1.0f : 0.75f);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@o0 T t5) {
        return Collections.singletonList(t5);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@o0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return listOf();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return listOf(tArr[0]);
    }

    @o0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@o0 K k5, @o0 V v5, @o0 K k6, @o0 V v6, @o0 K k7, @o0 V v7, @o0 K k8, @o0 V v8, @o0 K k9, @o0 V v9, @o0 K k10, @o0 V v10) {
        Map zza = zza(6, false);
        zza.put(k5, v5);
        zza.put(k6, v6);
        zza.put(k7, v7);
        zza.put(k8, v8);
        zza.put(k9, v9);
        zza.put(k10, v10);
        return Collections.unmodifiableMap(zza);
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
            T t5 = tArr[0];
            T t6 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t5);
            zzb.add(t6);
            return Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zzb2 = zzb(length, false);
            Collections.addAll(zzb2, tArr);
            return Collections.unmodifiableSet(zzb2);
        }
        T t7 = tArr[0];
        T t8 = tArr[1];
        T t9 = tArr[2];
        T t10 = tArr[3];
        Set zzb3 = zzb(4, false);
        zzb3.add(t7);
        zzb3.add(t8);
        zzb3.add(t9);
        zzb3.add(t10);
        return Collections.unmodifiableSet(zzb3);
    }
}
