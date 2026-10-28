package com.mp4parser.streaming;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class WriteOnlyBox implements com.coremedia.iso.boxes.b {
    private com.coremedia.iso.boxes.c parent;
    private final String type;

    public WriteOnlyBox(String str) {
        this.type = str;
    }

    @Override // com.coremedia.iso.boxes.b
    public long getOffset() {
        throw new RuntimeException(ProtectedSandApp.s("༚\u0001"));
    }

    @Override // com.coremedia.iso.boxes.b
    public com.coremedia.iso.boxes.c getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.b
    public String getType() {
        return this.type;
    }

    @Override // com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        throw new RuntimeException(ProtectedSandApp.s("༚\u0001"));
    }

    @Override // com.coremedia.iso.boxes.b
    public void setParent(com.coremedia.iso.boxes.c cVar) {
        this.parent = cVar;
    }
}
