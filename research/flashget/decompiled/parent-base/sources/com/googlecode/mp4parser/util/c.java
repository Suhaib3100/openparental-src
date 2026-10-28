package com.googlecode.mp4parser.util;

import androidx.compose.ui.input.pointer.s;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CastUtils.java */
/* loaded from: classes6.dex */
public class c {
    public static int a(long j4) {
        if (j4 > 2147483647L || j4 < -2147483648L) {
            throw new RuntimeException(s.a(ProtectedSandApp.s("ᑆ\u0001"), j4, ProtectedSandApp.s("ᑇ\u0001")));
        }
        return (int) j4;
    }
}
