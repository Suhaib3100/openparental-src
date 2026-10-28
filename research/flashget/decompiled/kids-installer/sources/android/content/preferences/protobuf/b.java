package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.h2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: AbstractParser.java */
/* loaded from: classes3.dex */
public abstract class b<MessageType extends h2> implements z2<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final s0 f7181a = s0.d();

    private MessageType A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.l()) {
            return messagetype;
        }
        throw B(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException B(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).y0() : new UninitializedMessageException(messagetype);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType l(InputStream inputStream) throws InvalidProtocolBufferException {
        return h(inputStream, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType h(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return A(t(inputStream, s0Var));
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType o(w wVar) throws InvalidProtocolBufferException {
        return d(wVar, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType d(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return A(f(wVar, s0Var));
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType v(z zVar) throws InvalidProtocolBufferException {
        return z(zVar, f7181a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.z2
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType z(z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (MessageType) A((h2) y(zVar, s0Var));
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType i(InputStream inputStream) throws InvalidProtocolBufferException {
        return w(inputStream, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType w(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return A(g(inputStream, s0Var));
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType s(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return u(byteBuffer, f7181a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.z2
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType u(ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            z o5 = z.o(byteBuffer, false);
            h2 h2Var = (h2) y(o5, s0Var);
            try {
                o5.a(0);
                return (MessageType) A(h2Var);
            } catch (InvalidProtocolBufferException e6) {
                throw e6.j(h2Var);
            }
        } catch (InvalidProtocolBufferException e7) {
            throw e7;
        }
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws InvalidProtocolBufferException {
        return c(bArr, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType m(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
        return e(bArr, i5, i6, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType e(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
        return A(b(bArr, i5, i6, s0Var));
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType c(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return e(bArr, 0, bArr.length, s0Var);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType r(InputStream inputStream) throws InvalidProtocolBufferException {
        return t(inputStream, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType t(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return g(new a.AbstractC0082a.C0083a(inputStream, z.O(read, inputStream)), s0Var);
        } catch (IOException e6) {
            throw new InvalidProtocolBufferException(e6);
        }
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType q(w wVar) throws InvalidProtocolBufferException {
        return f(wVar, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType f(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            z O = wVar.O();
            MessageType messagetype = (MessageType) y(O, s0Var);
            try {
                O.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e6) {
                throw e6.j(messagetype);
            }
        } catch (InvalidProtocolBufferException e7) {
            throw e7;
        }
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType x(z zVar) throws InvalidProtocolBufferException {
        return (MessageType) y(zVar, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType j(InputStream inputStream) throws InvalidProtocolBufferException {
        return g(inputStream, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType g(InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        z j5 = z.j(inputStream);
        MessageType messagetype = (MessageType) y(j5, s0Var);
        try {
            j5.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e6) {
            throw e6.j(messagetype);
        }
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType p(byte[] bArr) throws InvalidProtocolBufferException {
        return b(bArr, 0, bArr.length, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType n(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
        return b(bArr, i5, i6, f7181a);
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: Z */
    public MessageType b(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            z r5 = z.r(bArr, i5, i6, false);
            MessageType messagetype = (MessageType) y(r5, s0Var);
            try {
                r5.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e6) {
                throw e6.j(messagetype);
            }
        } catch (InvalidProtocolBufferException e7) {
            throw e7;
        }
    }

    @Override // android.content.preferences.protobuf.z2
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType k(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return b(bArr, 0, bArr.length, s0Var);
    }
}
