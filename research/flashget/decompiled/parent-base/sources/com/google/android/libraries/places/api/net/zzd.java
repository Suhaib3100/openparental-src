package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzd extends FetchPhotoResponse {
    private final Bitmap zza;

    zzd(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue67e"));
        }
        this.zza = bitmap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoResponse) {
            return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 27), ProtectedSandApp.s("\ue67f"), obj, ProtectedSandApp.s("\ue680"));
    }
}
