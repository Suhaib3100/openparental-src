package com.luck.picture.lib.permissions;

import android.content.Context;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.utils.SdkVersionUtils;

/* loaded from: classes6.dex */
public class PermissionConfig {
    public static final String WRITE_EXTERNAL_STORAGE = ProtectedSandApp.s("ᚳ\u0001");
    public static final String READ_EXTERNAL_STORAGE = ProtectedSandApp.s("ᚴ\u0001");

    @x0(api = 33)
    public static final String READ_MEDIA_IMAGES = ProtectedSandApp.s("ᚵ\u0001");

    @x0(api = 33)
    public static final String READ_MEDIA_VIDEO = ProtectedSandApp.s("ᚶ\u0001");

    @x0(api = 34)
    public static final String READ_MEDIA_VISUAL_USER_SELECTED = ProtectedSandApp.s("ᚷ\u0001");

    @x0(api = 33)
    public static final String READ_MEDIA_AUDIO = ProtectedSandApp.s("ᚸ\u0001");
    public static String[] CURRENT_REQUEST_PERMISSION = new String[0];
    public static final String[] CAMERA = {ProtectedSandApp.s("ᚹ\u0001")};

    public static String[] getReadPermissionArray(Context context, int i4) {
        boolean isUPSIDE_DOWN_CAKE = SdkVersionUtils.isUPSIDE_DOWN_CAKE();
        String s4 = ProtectedSandApp.s("ᚸ\u0001");
        String s5 = ProtectedSandApp.s("ᚶ\u0001");
        String s6 = ProtectedSandApp.s("ᚵ\u0001");
        String s7 = ProtectedSandApp.s("ᚴ\u0001");
        if (isUPSIDE_DOWN_CAKE) {
            int i5 = context.getApplicationInfo().targetSdkVersion;
            int ofImage = SelectMimeType.ofImage();
            String s10 = ProtectedSandApp.s("ᚷ\u0001");
            return i4 == ofImage ? i5 >= 34 ? new String[]{s10, s6} : i5 == 33 ? new String[]{s6} : new String[]{s7} : i4 == SelectMimeType.ofVideo() ? i5 >= 34 ? new String[]{s10, s5} : i5 == 33 ? new String[]{s5} : new String[]{s7} : i4 == SelectMimeType.ofAudio() ? i5 >= 33 ? new String[]{s4} : new String[]{s7} : i5 >= 34 ? new String[]{s10, s6, s5} : i5 == 33 ? new String[]{s6, s5} : new String[]{s7};
        }
        if (!SdkVersionUtils.isTIRAMISU()) {
            return new String[]{s7, ProtectedSandApp.s("ᚳ\u0001")};
        }
        int i6 = context.getApplicationInfo().targetSdkVersion;
        return i4 == SelectMimeType.ofImage() ? i6 >= 33 ? new String[]{s6} : new String[]{s7} : i4 == SelectMimeType.ofVideo() ? i6 >= 33 ? new String[]{s5} : new String[]{s7} : i4 == SelectMimeType.ofAudio() ? i6 >= 33 ? new String[]{s4} : new String[]{s7} : i6 >= 33 ? new String[]{s6, s5} : new String[]{s7};
    }
}
