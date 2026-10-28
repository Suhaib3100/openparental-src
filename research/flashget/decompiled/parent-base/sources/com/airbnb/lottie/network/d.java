package com.airbnb.lottie.network;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: LottieFetchResult.java */
/* loaded from: classes3.dex */
public interface d extends Closeable {
    @q0
    String P0();

    @q0
    String Q2();

    @o0
    InputStream Z0() throws IOException;

    boolean r1();
}
