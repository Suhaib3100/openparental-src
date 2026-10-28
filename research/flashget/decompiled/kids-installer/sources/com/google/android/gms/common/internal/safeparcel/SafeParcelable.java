package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface SafeParcelable extends Parcelable {

    @o0
    public static final String NULL = ProtectedSandApp.s("ட");

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Class {
        @o0
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Constructor {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Field {
        @o0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @o0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @o0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @o0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Indicator {
        @o0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Param {
        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface RemovedParam {
        @o0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @o0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface Reserved {
        @o0
        int[] value();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public @interface VersionField {
        @o0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @o0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
