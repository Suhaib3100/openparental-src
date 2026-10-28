package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes5.dex */
public interface o extends p {

    /* compiled from: MessageLite.java */
    public interface a extends Cloneable, p {
        /* renamed from: Z */
        a c(e eVar, f fVar) throws IOException;

        o build();
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    a n();

    int u();

    a x();

    q<? extends o> z();
}
