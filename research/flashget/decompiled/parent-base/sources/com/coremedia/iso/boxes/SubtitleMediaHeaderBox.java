package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = ProtectedSandApp.s("ሔ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public SubtitleMediaHeaderBox() {
        super(ProtectedSandApp.s("ሔ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ሕ"), SubtitleMediaHeaderBox.class);
        ajc$tjp_0 = eVar.H(ProtectedSandApp.s("ሚ"), eVar.E(ProtectedSandApp.s("ሗ"), ProtectedSandApp.s("መ"), ProtectedSandApp.s("ሙ"), "", "", "", ProtectedSandApp.s("ሖ")), 30);
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

    public String toString() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return ProtectedSandApp.s("ማ");
    }
}
