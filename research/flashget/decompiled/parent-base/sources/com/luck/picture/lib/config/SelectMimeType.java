package com.luck.picture.lib.config;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class SelectMimeType {
    public static final int TYPE_ALL = 0;
    public static final int TYPE_AUDIO = 3;
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_VIDEO = 2;
    public static final String SYSTEM_AUDIO = ProtectedSandApp.s("ᘻ\u0001");
    public static final String SYSTEM_VIDEO = ProtectedSandApp.s("ᘼ\u0001");
    public static final String SYSTEM_ALL = ProtectedSandApp.s("ᘽ\u0001");
    public static final String SYSTEM_IMAGE = ProtectedSandApp.s("ᘾ\u0001");

    public static int ofAll() {
        return 0;
    }

    public static int ofAudio() {
        return 3;
    }

    public static int ofImage() {
        return 1;
    }

    public static int ofVideo() {
        return 2;
    }
}
