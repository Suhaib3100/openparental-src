package android.content.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MessageLite.java */
/* loaded from: classes3.dex */
public interface h2 extends i2 {

    /* compiled from: MessageLite.java */
    public interface a extends i2, Cloneable {
        a H(h2 h2Var);

        h2 N0();

        a O(w wVar) throws InvalidProtocolBufferException;

        a P(z zVar) throws IOException;

        a T0(z zVar, s0 s0Var) throws IOException;

        a U(byte[] bArr) throws InvalidProtocolBufferException;

        a X(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException;

        h2 build();

        a clear();

        /* renamed from: clone */
        a mo0clone();

        boolean f0(InputStream inputStream) throws IOException;

        boolean g1(InputStream inputStream, s0 s0Var) throws IOException;

        a n1(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException;

        a p0(InputStream inputStream) throws IOException;

        a q1(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

        a s1(InputStream inputStream, s0 s0Var) throws IOException;

        a w1(w wVar, s0 s0Var) throws InvalidProtocolBufferException;
    }

    void L(OutputStream outputStream) throws IOException;

    void M0(CodedOutputStream codedOutputStream) throws IOException;

    void V(OutputStream outputStream) throws IOException;

    byte[] b1();

    w j0();

    a n();

    int u();

    a x();

    z2<? extends h2> z();
}
