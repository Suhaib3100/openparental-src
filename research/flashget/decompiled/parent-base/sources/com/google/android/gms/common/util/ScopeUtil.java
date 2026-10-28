package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    @o0
    @KeepForSdk
    public static String[] toScopeString(@o0 Set<Scope> set) {
        String s4 = ProtectedSandApp.s("찔");
        Preconditions.checkNotNull(set, s4);
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        Preconditions.checkNotNull(scopeArr, s4);
        String[] strArr = new String[scopeArr.length];
        for (int i4 = 0; i4 < scopeArr.length; i4++) {
            strArr[i4] = scopeArr[i4].getScopeUri();
        }
        return strArr;
    }
}
