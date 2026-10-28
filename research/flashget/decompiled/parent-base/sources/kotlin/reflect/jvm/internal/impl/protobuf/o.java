package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes7.dex */
public interface o extends p {

    /* compiled from: MessageLite.java */
    public interface a extends Cloneable, p {
        o a();

        a r0(e eVar, f fVar) throws IOException;
    }

    q<? extends o> B();

    void b(CodedOutputStream codedOutputStream) throws IOException;

    a q();

    int t();

    a w();
}
