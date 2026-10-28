package com.luck.picture.lib.config;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public final class PictureMimeType {
    public static final String AMR_Q = ProtectedSandApp.s("ᘳ\u0001");
    public static final String JPG = ProtectedSandApp.s("ᘖ\u0001");
    private static final String MIME_TYPE_HEIC = ProtectedSandApp.s("ᘭ\u0001");
    private static final String MIME_TYPE_WAP_BMP = ProtectedSandApp.s("ᘱ\u0001");
    private static final String MIME_TYPE_WEBP = ProtectedSandApp.s("ᘟ\u0001");
    public static final String PNG = ProtectedSandApp.s("ᘦ\u0001");
    public static final String JPEG = ProtectedSandApp.s("ᘥ\u0001");
    public static final String MIME_TYPE_PREFIX_IMAGE = ProtectedSandApp.s("ᘞ\u0001");
    public static final String WAV = ProtectedSandApp.s("ᘴ\u0001");
    public static final String MIME_TYPE_AUDIO_AMR = ProtectedSandApp.s("ᘳ\u0001");
    public static final String PNG_Q = ProtectedSandApp.s("ᘰ\u0001");
    public static final String MIME_TYPE_AUDIO = ProtectedSandApp.s("ᘵ\u0001");
    private static final String MIME_TYPE_JPG = ProtectedSandApp.s("ᘡ\u0001");
    public static final String MIME_TYPE_PREFIX_VIDEO = ProtectedSandApp.s("ᘗ\u0001");
    public static final String MIME_TYPE_PREFIX_AUDIO = ProtectedSandApp.s("ᘘ\u0001");
    private static final String MIME_TYPE_XMS_BMP = ProtectedSandApp.s("ᘲ\u0001");
    public static final String MIME_TYPE_IMAGE = ProtectedSandApp.s("ᘠ\u0001");
    private static final String MIME_TYPE_PNG = ProtectedSandApp.s("ᘰ\u0001");
    public static final String MP3_Q = ProtectedSandApp.s("ᘵ\u0001");
    public static final String MP4_Q = ProtectedSandApp.s("ᘮ\u0001");
    private static final String MIME_TYPE_MP4 = ProtectedSandApp.s("ᘮ\u0001");
    public static final String BMP = ProtectedSandApp.s("ᘶ\u0001");
    public static final String GIF = ProtectedSandApp.s("ᘤ\u0001");
    public static final String AMR = ProtectedSandApp.s("ᘢ\u0001");
    public static final String CAMERA = ProtectedSandApp.s("ᘷ\u0001");
    private static final String MIME_TYPE_MPEG = ProtectedSandApp.s("ᘯ\u0001");
    private static final String MIME_TYPE_AVI = ProtectedSandApp.s("ᘫ\u0001");
    public static final String MP4 = ProtectedSandApp.s("ᘨ\u0001");
    public static final String MIME_TYPE_VIDEO = ProtectedSandApp.s("ᘮ\u0001");
    public static final String MP3 = ProtectedSandApp.s("ᘣ\u0001");
    public static final String MIME_TYPE_JPEG = ProtectedSandApp.s("ᘠ\u0001");
    public static final String AVI = ProtectedSandApp.s("ᘸ\u0001");
    public static final String JPEG_Q = ProtectedSandApp.s("ᘠ\u0001");
    public static final String WEBP = ProtectedSandApp.s("ᘩ\u0001");
    private static final String MIME_TYPE_3GP = ProtectedSandApp.s("ᘪ\u0001");
    public static final String WAV_Q = ProtectedSandApp.s("ᘹ\u0001");
    public static final String AVI_Q = ProtectedSandApp.s("ᘫ\u0001");
    public static final String DCIM = ProtectedSandApp.s("ᘺ\u0001");
    private static final String MIME_TYPE_BMP = ProtectedSandApp.s("ᘬ\u0001");
    private static final String MIME_TYPE_GIF = ProtectedSandApp.s("ᘚ\u0001");

    public static String getLastSourceSuffix(String str) {
        String s4 = ProtectedSandApp.s("ᘔ\u0001");
        try {
            return str.substring(str.lastIndexOf(s4)).replace(s4, ProtectedSandApp.s("ᘕ\u0001"));
        } catch (Exception e4) {
            e4.printStackTrace();
            return ProtectedSandApp.s("ᘖ\u0001");
        }
    }

    public static int getMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith(ProtectedSandApp.s("ᘗ\u0001"))) {
            return 2;
        }
        return str.startsWith(ProtectedSandApp.s("ᘘ\u0001")) ? 3 : 1;
    }

    public static String getUrlToFileName(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("ᘔ\u0001"));
            return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("ᘙ\u0001"));
    }

    public static boolean isHasAudio(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("ᘘ\u0001"));
    }

    public static boolean isHasBmp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ofBMP()) || str.startsWith(ofXmsBMP()) || str.startsWith(ofWapBMP());
    }

    public static boolean isHasGif(String str) {
        return str != null && (str.equals(ProtectedSandApp.s("ᘚ\u0001")) || str.equals(ProtectedSandApp.s("ᘛ\u0001")));
    }

    public static boolean isHasHeic(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ofHeic());
    }

    public static boolean isHasHttp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("ᘜ\u0001")) || str.startsWith(ProtectedSandApp.s("ᘝ\u0001"));
    }

    public static boolean isHasImage(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("ᘞ\u0001"));
    }

    public static boolean isHasVideo(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("ᘗ\u0001"));
    }

    public static boolean isHasWebp(String str) {
        return str != null && str.equalsIgnoreCase(ProtectedSandApp.s("ᘟ\u0001"));
    }

    public static boolean isJPEG(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("ᘠ\u0001")) || str.startsWith(ProtectedSandApp.s("ᘡ\u0001"));
    }

    public static boolean isJPG(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ProtectedSandApp.s("ᘡ\u0001"));
    }

    public static boolean isMimeTypeSame(String str, String str2) {
        return TextUtils.isEmpty(str) || getMimeType(str) == getMimeType(str2);
    }

    public static boolean isUrlHasAudio(String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("ᘢ\u0001")) || str.toLowerCase().endsWith(ProtectedSandApp.s("ᘣ\u0001"));
    }

    public static boolean isUrlHasGif(String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("ᘤ\u0001"));
    }

    public static boolean isUrlHasImage(String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("ᘖ\u0001")) || str.toLowerCase().endsWith(ProtectedSandApp.s("ᘥ\u0001")) || str.toLowerCase().endsWith(ProtectedSandApp.s("ᘦ\u0001")) || str.toLowerCase().endsWith(ProtectedSandApp.s("ᘧ\u0001"));
    }

    public static boolean isUrlHasVideo(String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("ᘨ\u0001"));
    }

    public static boolean isUrlHasWebp(String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("ᘩ\u0001"));
    }

    public static String of3GP() {
        return ProtectedSandApp.s("ᘪ\u0001");
    }

    public static String ofAVI() {
        return ProtectedSandApp.s("ᘫ\u0001");
    }

    public static String ofBMP() {
        return ProtectedSandApp.s("ᘬ\u0001");
    }

    public static String ofGIF() {
        return ProtectedSandApp.s("ᘚ\u0001");
    }

    public static String ofHeic() {
        return ProtectedSandApp.s("ᘭ\u0001");
    }

    public static String ofJPEG() {
        return ProtectedSandApp.s("ᘠ\u0001");
    }

    public static String ofMP4() {
        return ProtectedSandApp.s("ᘮ\u0001");
    }

    public static String ofMPEG() {
        return ProtectedSandApp.s("ᘯ\u0001");
    }

    public static String ofPNG() {
        return ProtectedSandApp.s("ᘰ\u0001");
    }

    public static String ofWEBP() {
        return ProtectedSandApp.s("ᘟ\u0001");
    }

    public static String ofWapBMP() {
        return ProtectedSandApp.s("ᘱ\u0001");
    }

    public static String ofXmsBMP() {
        return ProtectedSandApp.s("ᘲ\u0001");
    }
}
