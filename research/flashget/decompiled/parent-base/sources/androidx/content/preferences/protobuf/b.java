package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.i2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: AbstractParser.java */
/* loaded from: classes3.dex */
public abstract class b<MessageType extends i2> implements c3<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final s0 f28631a = s0.d();

    private MessageType A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.p()) {
            return messagetype;
        }
        throw B(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException B(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).x1() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType e(InputStream inputStream) throws InvalidProtocolBufferException {
        return c(inputStream, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return A(w(inputStream, s0Var));
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType t(w wVar) throws InvalidProtocolBufferException {
        return l(wVar, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType l(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return A(n(wVar, s0Var));
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType y(z zVar) throws InvalidProtocolBufferException {
        return j(zVar, f28631a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType j(z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (MessageType) A((i2) z(zVar, s0Var));
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType p(InputStream inputStream) throws InvalidProtocolBufferException {
        return h(inputStream, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType h(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return A(o(inputStream, s0Var));
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType v(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return x(byteBuffer, f28631a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType x(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        z o4 = z.o(byteBuffer, false);
        i2 i2Var = (i2) z(o4, s0Var);
        try {
            o4.a(0);
            return (MessageType) A(i2Var);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.j(i2Var);
        }
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws InvalidProtocolBufferException {
        return b(bArr, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType r(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
        return m(bArr, i4, i5, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType m(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
        return A(k(bArr, i4, i5, s0Var));
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType b(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return m(bArr, 0, bArr.length, s0Var);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType g(InputStream inputStream) throws InvalidProtocolBufferException {
        return w(inputStream, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType w(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return o(new a.AbstractC0471a.C0472a(inputStream, z.O(read, inputStream)), s0Var);
        } catch (IOException e4) {
            throw new InvalidProtocolBufferException(e4);
        }
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType u(w wVar) throws InvalidProtocolBufferException {
        return n(wVar, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType n(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        z S = wVar.S();
        MessageType messagetype = (MessageType) z(S, s0Var);
        try {
            S.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.j(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType i(z zVar) throws InvalidProtocolBufferException {
        return (MessageType) z(zVar, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType q(InputStream inputStream) throws InvalidProtocolBufferException {
        return o(inputStream, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType o(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        z k4 = z.k(inputStream, 4096);
        MessageType messagetype = (MessageType) z(k4, s0Var);
        try {
            k4.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.j(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType f(byte[] bArr) throws InvalidProtocolBufferException {
        return k(bArr, 0, bArr.length, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType s(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
        return k(bArr, i4, i5, f28631a);
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: Z */
    public MessageType k(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
        z r4 = z.r(bArr, i4, i5, false);
        MessageType messagetype = (MessageType) z(r4, s0Var);
        try {
            r4.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.j(messagetype);
        }
    }

    @Override // androidx.content.preferences.protobuf.c3
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType d(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return k(bArr, 0, bArr.length, s0Var);
    }
}
