package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractParser.java */
/* loaded from: classes7.dex */
public abstract class b<MessageType extends o> implements q<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final f f77668a = f.c();

    private MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.p()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).c() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType d(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType b(d dVar, f fVar) throws InvalidProtocolBufferException {
        return e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return k(new a.AbstractC1167a.C1168a(inputStream, e.B(read, inputStream)), fVar);
        } catch (IOException e4) {
            throw new InvalidProtocolBufferException(e4.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e g4 = e.g(inputStream);
        MessageType messagetype = (MessageType) c(g4, fVar);
        try {
            g4.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.i(messagetype);
        }
    }

    public MessageType l(d dVar, f fVar) throws InvalidProtocolBufferException {
        e v4 = dVar.v();
        MessageType messagetype = (MessageType) c(v4, fVar);
        try {
            v4.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.i(messagetype);
        }
    }
}
