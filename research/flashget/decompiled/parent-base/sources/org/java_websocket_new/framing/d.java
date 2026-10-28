package org.java_websocket_new.framing;

import java.nio.ByteBuffer;
import org.java_websocket_new.exceptions.InvalidFrameException;

/* compiled from: Framedata.java */
/* loaded from: classes6.dex */
public interface d {

    /* compiled from: Framedata.java */
    public enum a {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            int length = valuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(valuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    boolean a();

    a b();

    boolean f();

    ByteBuffer h();

    void j(d dVar) throws InvalidFrameException;
}
