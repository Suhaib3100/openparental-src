package androidx.content.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Parser.java */
/* loaded from: classes3.dex */
public interface c3<MessageType> {
    MessageType a(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType b(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType c(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType d(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType e(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType f(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType g(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType h(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType i(z zVar) throws InvalidProtocolBufferException;

    MessageType j(z zVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType k(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType l(w wVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType m(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType n(w wVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType o(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType p(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType q(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType r(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException;

    MessageType s(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException;

    MessageType t(w wVar) throws InvalidProtocolBufferException;

    MessageType u(w wVar) throws InvalidProtocolBufferException;

    MessageType v(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType w(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType x(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType y(z zVar) throws InvalidProtocolBufferException;

    MessageType z(z zVar, s0 s0Var) throws InvalidProtocolBufferException;
}
