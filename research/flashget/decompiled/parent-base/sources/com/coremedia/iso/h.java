package com.coremedia.iso;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: IsoTypeReaderVariable.java */
/* loaded from: classes3.dex */
public final class h {
    public static long a(ByteBuffer byteBuffer, int i4) {
        int p4;
        if (i4 == 1) {
            p4 = g.p(byteBuffer);
        } else if (i4 == 2) {
            p4 = g.i(byteBuffer);
        } else {
            if (i4 != 3) {
                if (i4 == 4) {
                    return g.l(byteBuffer);
                }
                if (i4 == 8) {
                    return g.o(byteBuffer);
                }
                throw new RuntimeException(r2.a(ProtectedSandApp.s("ᒲ"), i4, ProtectedSandApp.s("ᒳ")));
            }
            p4 = g.k(byteBuffer);
        }
        return p4;
    }
}
