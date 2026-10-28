package za;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: CAVLCWriter.java */
/* loaded from: classes6.dex */
public class b extends a {
    public b(OutputStream outputStream) {
        super(outputStream);
    }

    public void g(boolean z4, String str) throws IOException {
        b(z4 ? 1 : 0);
    }

    public void h(long j4, int i4, String str) throws IOException {
        for (int i5 = 0; i5 < i4; i5++) {
            b(((int) (j4 >> ((i4 - i5) - 1))) & 1);
        }
    }

    public void i(int i4, String str) throws IOException {
        n(((i4 << 1) * (i4 < 0 ? -1 : 1)) + (i4 <= 0 ? 0 : 1));
    }

    public void j() {
        throw new IllegalStateException(ProtectedSandApp.s("㨁\u0001"));
    }

    public void k() throws IOException {
        b(1);
        f();
        a();
    }

    public void l(int i4, int i5) throws IOException {
        e(i4, i5);
    }

    public void m(int i4, int i5, String str) throws IOException {
        e(i4, i5);
    }

    public void n(int i4) throws IOException {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= 15) {
                break;
            }
            int i10 = (1 << i6) + i7;
            if (i4 < i10) {
                i5 = i6;
                break;
            } else {
                i6++;
                i7 = i10;
            }
        }
        e(0L, i5);
        b(1);
        e(i4 - i7, i5);
    }

    public void o(int i4, String str) throws IOException {
        n(i4);
    }
}
