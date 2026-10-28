package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    @o0
    @KeepForSdk
    public static String[] toScopeString(@o0 Set<Scope> set) {
        String s5 = ProtectedSandApp.s("౸");
        Preconditions.checkNotNull(set, s5);
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        Preconditions.checkNotNull(scopeArr, s5);
        String[] strArr = new String[scopeArr.length];
        for (int i5 = 0; i5 < scopeArr.length; i5++) {
            strArr[i5] = scopeArr[i5].getScopeUri();
        }
        return strArr;
    }
}
