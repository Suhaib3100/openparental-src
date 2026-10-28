package com.mp4parser.iso14496.part30;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class WebVTTSourceLabelBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᦦ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    String sourceLabel;

    static {
        ajc$preClinit();
    }

    public WebVTTSourceLabelBox() {
        super(ProtectedSandApp.s("ᦦ\u0001"));
        this.sourceLabel = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᦧ\u0001"), WebVTTSourceLabelBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᦩ\u0001"), ProtectedSandApp.s("ᦪ\u0001"), ProtectedSandApp.s("ᦫ\u0001"), "", "", "", ProtectedSandApp.s("ᦨ\u0001"));
        String s4 = ProtectedSandApp.s("\u19ac\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 37);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦩ\u0001"), ProtectedSandApp.s("\u19ae\u0001"), ProtectedSandApp.s("ᦫ\u0001"), ProtectedSandApp.s("ᦨ\u0001"), ProtectedSandApp.s("\u19af\u0001"), "", ProtectedSandApp.s("\u19ad\u0001")), 41);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.sourceLabel = g.h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(l.b(this.sourceLabel));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.sourceLabel);
    }

    public String getSourceLabel() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.sourceLabel;
    }

    public void setSourceLabel(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.sourceLabel = str;
    }
}
