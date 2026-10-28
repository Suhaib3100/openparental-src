package com.coremedia.iso;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: IsoTypeWriterVariable.java */
/* loaded from: classes3.dex */
public final class j {
    public static void a(long j4, ByteBuffer byteBuffer, int i4) {
        if (i4 == 1) {
            i.m(byteBuffer, (int) (j4 & 255));
            return;
        }
        if (i4 == 2) {
            i.f(byteBuffer, (int) (j4 & okhttp3.internal.ws.g.f84969s));
            return;
        }
        if (i4 == 3) {
            i.h(byteBuffer, (int) (j4 & 16777215));
        } else if (i4 == 4) {
            i.i(byteBuffer, j4);
        } else {
            if (i4 != 8) {
                throw new RuntimeException(r2.a(ProtectedSandApp.s("ᒶ"), i4, ProtectedSandApp.s("ᒷ")));
            }
            i.l(byteBuffer, j4);
        }
    }
}
