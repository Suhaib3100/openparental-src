package androidx.content.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MessageLite.java */
/* loaded from: classes3.dex */
public interface i2 extends j2 {

    /* compiled from: MessageLite.java */
    public interface a extends j2, Cloneable {
        boolean A2(InputStream inputStream) throws IOException;

        /* renamed from: A3 */
        a O1(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException;

        a B1(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

        a D1(InputStream inputStream, s0 s0Var) throws IOException;

        a H1(w wVar, s0 s0Var) throws InvalidProtocolBufferException;

        a K0(InputStream inputStream) throws IOException;

        a Q(i2 i2Var);

        a X(w wVar) throws InvalidProtocolBufferException;

        i2 a();

        a clear();

        /* renamed from: clone */
        a mo6clone();

        a j0(z zVar) throws IOException;

        i2 l1();

        a n0(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException;

        a n1(z zVar, s0 s0Var) throws IOException;

        a q2(byte[] bArr) throws InvalidProtocolBufferException;

        boolean v3(InputStream inputStream, s0 s0Var) throws IOException;
    }

    c3<? extends i2> B();

    void J(OutputStream outputStream) throws IOException;

    w R();

    void c1(CodedOutputStream codedOutputStream) throws IOException;

    byte[] m();

    a q();

    int t();

    a w();

    void writeTo(OutputStream outputStream) throws IOException;
}
