package i8;

import android.text.TextUtils;

/* compiled from: AVIFWriter.java */
/* loaded from: classes5.dex */
public class b extends com.github.penfeizhou.animation.io.b {
    public void c(int i4) {
        h(i4 - 1);
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            b(4);
            return;
        }
        d((byte) (str.charAt(0) & 255));
        d((byte) (str.charAt(1) & 255));
        d((byte) (str.charAt(2) & 255));
        d((byte) (str.charAt(3) & 255));
    }

    public void g(int i4) {
        d((byte) (i4 & 255));
        d((byte) ((i4 >> 8) & 255));
    }

    public void h(int i4) {
        d((byte) (i4 & 255));
        d((byte) ((i4 >> 8) & 255));
        d((byte) ((i4 >> 16) & 255));
    }

    public void i(int i4) {
        d((byte) (i4 & 255));
        d((byte) ((i4 >> 8) & 255));
        d((byte) ((i4 >> 16) & 255));
        d((byte) ((i4 >> 24) & 255));
    }
}
