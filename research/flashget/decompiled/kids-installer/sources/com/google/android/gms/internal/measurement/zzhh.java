package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.i;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhh {
    private final i zza;

    zzhh(i iVar) {
        this.zza = iVar;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        i iVar;
        if (uri != null) {
            iVar = (i) this.zza.get(uri.toString());
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        return (String) iVar.get("".concat(str3));
    }
}
