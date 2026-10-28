package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
@NotThreadSafe
/* loaded from: classes3.dex */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i4, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        i4 = i4 < 0 ? socket.getSendBufferSize() : i4;
        init(socket.getOutputStream(), i4 < 1024 ? 1024 : i4, httpParams);
    }
}
