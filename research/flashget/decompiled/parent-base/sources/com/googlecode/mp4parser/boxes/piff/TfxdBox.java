package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class TfxdBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        ajc$preClinit();
    }

    public TfxdBox() {
        super(ProtectedSandApp.s("Ꮣ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮤ\u0001"), TfxdBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮦ\u0001"), ProtectedSandApp.s("Ꮧ\u0001"), ProtectedSandApp.s("Ꮨ\u0001"), "", "", "", ProtectedSandApp.s("Ꮥ\u0001"));
        String s4 = ProtectedSandApp.s("Ꮩ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 79);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮦ\u0001"), ProtectedSandApp.s("Ꮪ\u0001"), ProtectedSandApp.s("Ꮨ\u0001"), "", "", "", ProtectedSandApp.s("Ꮥ\u0001")), 83);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.fragmentAbsoluteTime = g.o(byteBuffer);
            this.fragmentAbsoluteDuration = g.o(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = g.l(byteBuffer);
            this.fragmentAbsoluteDuration = g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            i.l(byteBuffer, this.fragmentAbsoluteTime);
            byteBuffer.putLong(this.fragmentAbsoluteDuration);
        } else {
            i.i(byteBuffer, this.fragmentAbsoluteTime);
            byteBuffer.putInt((int) this.fragmentAbsoluteDuration);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return getVersion() == 1 ? 20 : 12;
    }

    public long getFragmentAbsoluteDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.fragmentAbsoluteTime;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{109, com.google.common.base.c.G, -101, 5, 66, -43, 68, -26, Byte.MIN_VALUE, -30, com.google.common.base.c.f54878x, com.google.common.base.c.G, -81, -9, 87, -78};
    }
}
