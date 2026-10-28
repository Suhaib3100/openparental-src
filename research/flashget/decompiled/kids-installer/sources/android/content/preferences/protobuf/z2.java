package android.content.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Parser.java */
/* loaded from: classes.dex */
public interface z2<MessageType> {
    MessageType a(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType b(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType c(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType d(w wVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType e(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType f(w wVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType g(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType h(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType i(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType j(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType k(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType l(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType m(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException;

    MessageType n(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException;

    MessageType o(w wVar) throws InvalidProtocolBufferException;

    MessageType p(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType q(w wVar) throws InvalidProtocolBufferException;

    MessageType r(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType s(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType t(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType u(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType v(z zVar) throws InvalidProtocolBufferException;

    MessageType w(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType x(z zVar) throws InvalidProtocolBufferException;

    MessageType y(z zVar, s0 s0Var) throws InvalidProtocolBufferException;

    MessageType z(z zVar, s0 s0Var) throws InvalidProtocolBufferException;
}
