package com.googlecode.mp4parser.authoring.tracks.h265;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: SEIMessage.java */
/* loaded from: classes6.dex */
public class g {
    public g(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar) throws IOException {
        int i4 = 0;
        while (cVar.c(8) == 255) {
            i4 += 255;
        }
        int c5 = cVar.c(8) + i4;
        while (cVar.c(8) == 255) {
        }
        cVar.c(8);
        System.err.println(ProtectedSandApp.s("\u0df1\u0001") + c5);
    }
}
