package com.tencent.liteav.videobase.utils;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f72317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72318b;

    public e(String str, String str2) {
        this.f72317a = str;
        this.f72318b = str2;
    }

    public static int a(String str, int i4) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i4);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        OpenGlUtils.checkGlError(ProtectedSandApp.s("啮\u0001"));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
