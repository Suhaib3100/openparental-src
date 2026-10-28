package com.github.penfeizhou.animation.apng.io;

import java.nio.ByteOrder;

/* compiled from: APNGWriter.java */
/* loaded from: classes5.dex */
public class b extends com.github.penfeizhou.animation.io.b {
    public void c(int i4) {
        d((byte) (i4 & 255));
        d((byte) ((i4 >> 8) & 255));
        d((byte) ((i4 >> 16) & 255));
        d((byte) ((i4 >> 24) & 255));
    }

    @Override // com.github.penfeizhou.animation.io.b, com.github.penfeizhou.animation.io.f
    public void e(int i4) {
        super.e(i4);
        this.f50849a.order(ByteOrder.BIG_ENDIAN);
    }

    public void f(int i4) {
        d((byte) ((i4 >> 24) & 255));
        d((byte) ((i4 >> 16) & 255));
        d((byte) ((i4 >> 8) & 255));
        d((byte) (i4 & 255));
    }
}
