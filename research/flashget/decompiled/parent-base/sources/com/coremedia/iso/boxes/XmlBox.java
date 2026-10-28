package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class XmlBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ወ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    String xml;

    static {
        ajc$preClinit();
    }

    public XmlBox() {
        super(ProtectedSandApp.s("ወ"));
        this.xml = "";
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ዉ"), XmlBox.class);
        v E = eVar.E(ProtectedSandApp.s("ዋ"), ProtectedSandApp.s("ዌ"), ProtectedSandApp.s("ው"), "", "", "", ProtectedSandApp.s("ዊ"));
        String s4 = ProtectedSandApp.s("ዎ");
        ajc$tjp_0 = eVar.H(s4, E, 20);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዋ"), ProtectedSandApp.s("ዐ"), ProtectedSandApp.s("ው"), ProtectedSandApp.s("ዊ"), ProtectedSandApp.s("ዑ"), "", ProtectedSandApp.s("ዏ")), 24);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዋ"), ProtectedSandApp.s("ዒ"), ProtectedSandApp.s("ው"), "", "", "", ProtectedSandApp.s("ዊ")), 46);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.xml = g.h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(l.b(this.xml));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.xml) + 4;
    }

    public String getXml() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.xml;
    }

    public void setXml(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.xml = str;
    }

    public String toString() {
        return android.support.v4.media.c.a(a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ዓ")), this.xml, ProtectedSandApp.s("ዔ"));
    }
}
