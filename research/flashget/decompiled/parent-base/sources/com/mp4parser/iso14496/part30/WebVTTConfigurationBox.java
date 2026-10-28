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
public class WebVTTConfigurationBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᦙ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    String config;

    static {
        ajc$preClinit();
    }

    public WebVTTConfigurationBox() {
        super(ProtectedSandApp.s("ᦙ\u0001"));
        this.config = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᦚ\u0001"), WebVTTConfigurationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᦜ\u0001"), ProtectedSandApp.s("ᦝ\u0001"), ProtectedSandApp.s("ᦞ\u0001"), "", "", "", ProtectedSandApp.s("ᦛ\u0001"));
        String s4 = ProtectedSandApp.s("ᦟ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 36);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᦜ\u0001"), ProtectedSandApp.s("ᦡ\u0001"), ProtectedSandApp.s("ᦞ\u0001"), ProtectedSandApp.s("ᦛ\u0001"), ProtectedSandApp.s("ᦢ\u0001"), "", ProtectedSandApp.s("ᦠ\u0001")), 40);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.config = g.h(byteBuffer, byteBuffer.remaining());
    }

    public String getConfig() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.config;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(l.b(this.config));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.config);
    }

    public void setConfig(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.config = str;
    }
}
