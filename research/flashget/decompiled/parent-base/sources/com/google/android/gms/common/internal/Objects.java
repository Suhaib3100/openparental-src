package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        /* synthetic */ ToStringHelper(Object obj, byte[] bArr) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @o0
        @KeepForSdk
        public ToStringHelper add(@o0 String str, @q0 Object obj) {
            Preconditions.checkNotNull(str);
            int length = str.length();
            String valueOf = String.valueOf(obj);
            this.zza.add(k0.a(new StringBuilder(length + 1 + valueOf.length()), str, ProtectedSandApp.s("쫦"), valueOf));
            return this;
        }

        @o0
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            List list = this.zza;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append((String) list.get(i4));
                if (i4 < size - 1) {
                    sb.append(ProtectedSandApp.s("쫧"));
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError(ProtectedSandApp.s("쫨"));
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@o0 Bundle bundle, @o0 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(@q0 Object obj, @q0 Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(@o0 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @o0
    @KeepForSdk
    public static ToStringHelper toStringHelper(@o0 Object obj) {
        return new ToStringHelper(obj, null);
    }
}
