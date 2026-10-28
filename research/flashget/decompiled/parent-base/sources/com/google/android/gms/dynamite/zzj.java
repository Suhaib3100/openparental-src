package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    zzj() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i4 = 1;
        int zza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza;
        int i5 = selectionResult.localVersion;
        if (i5 == 0) {
            i5 = 0;
            if (zza == 0) {
                i4 = 0;
                selectionResult.selection = i4;
                return selectionResult;
            }
        }
        if (i5 >= zza) {
            i4 = -1;
        }
        selectionResult.selection = i4;
        return selectionResult;
    }
}
