package com.google.android.gms.common.internal;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class ServiceSpecificExtraArgs {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface CastExtraArgs {

        @o0
        @KeepForSdk
        public static final String LISTENER = ProtectedSandApp.s("쬂");
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface GamesExtraArgs {

        @o0
        @KeepForSdk
        public static final String SIGNIN_OPTIONS = ProtectedSandApp.s("쬃");

        @o0
        @KeepForSdk
        public static final String DESIRED_LOCALE = ProtectedSandApp.s("쬄");

        @o0
        @KeepForSdk
        public static final String WINDOW_TOKEN = ProtectedSandApp.s("쬅");

        @o0
        @KeepForSdk
        public static final String GAME_PACKAGE_NAME = ProtectedSandApp.s("쬆");
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface PlusExtraArgs {

        @o0
        @KeepForSdk
        public static final String PLUS_AUTH_PACKAGE = ProtectedSandApp.s("쬇");
    }

    private ServiceSpecificExtraArgs() {
    }
}
