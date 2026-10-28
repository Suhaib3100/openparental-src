package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class NullMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = ProtectedSandApp.s("ᄬ");

    public NullMediaHeaderBox() {
        super(ProtectedSandApp.s("ᄬ"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 4L;
    }
}
