package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class AppleDataRateBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ዕ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private long dataRate;

    static {
        ajc$preClinit();
    }

    public AppleDataRateBox() {
        super(ProtectedSandApp.s("ዕ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ዖ"), AppleDataRateBox.class);
        ajc$tjp_0 = eVar.H(ProtectedSandApp.s("ዛ"), eVar.E(ProtectedSandApp.s("ዘ"), ProtectedSandApp.s("ዙ"), ProtectedSandApp.s("ዚ"), "", "", "", ProtectedSandApp.s("\u12d7")), 53);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataRate = g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.dataRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getDataRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.dataRate;
    }
}
