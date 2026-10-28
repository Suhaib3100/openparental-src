package com.google.android.gms.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepName
/* loaded from: classes3.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i5) {
        super(i5, ProtectedSandApp.s("Ⅹ") + GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE + ProtectedSandApp.s("Ⅺ") + i5 + ProtectedSandApp.s("Ⅻ"));
    }
}
