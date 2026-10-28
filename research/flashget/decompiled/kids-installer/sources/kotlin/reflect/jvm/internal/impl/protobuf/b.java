package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractParser.java */
/* loaded from: classes5.dex */
public abstract class b<MessageType extends o> implements q<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final f f25686a = f.c();

    private MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.l()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).b() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType d(d dVar, f fVar) throws InvalidProtocolBufferException {
        return e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return k(new a.AbstractC0362a.C0363a(inputStream, e.B(read, inputStream)), fVar);
        } catch (IOException e6) {
            throw new InvalidProtocolBufferException(e6.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e g5 = e.g(inputStream);
        MessageType messagetype = (MessageType) b(g5, fVar);
        try {
            g5.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e6) {
            throw e6.i(messagetype);
        }
    }

    public MessageType l(d dVar, f fVar) throws InvalidProtocolBufferException {
        try {
            e v5 = dVar.v();
            MessageType messagetype = (MessageType) b(v5, fVar);
            try {
                v5.a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e6) {
                throw e6.i(messagetype);
            }
        } catch (InvalidProtocolBufferException e7) {
            throw e7;
        }
    }
}
