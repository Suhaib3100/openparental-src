package com.google.firebase.encoders;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;

/* compiled from: ValueEncoderContext.java */
/* loaded from: classes2.dex */
public interface g {
    @o0
    g add(double d6) throws IOException;

    @o0
    g add(int i5) throws IOException;

    @o0
    g add(long j5) throws IOException;

    @o0
    g d(@o0 byte[] bArr) throws IOException;

    @o0
    g m(@q0 String str) throws IOException;

    @o0
    g n(boolean z5) throws IOException;

    @o0
    g p(float f6) throws IOException;
}
