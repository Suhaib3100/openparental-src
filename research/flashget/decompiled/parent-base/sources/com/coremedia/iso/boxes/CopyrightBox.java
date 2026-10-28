package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class CopyrightBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ྼ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String copyright;
    private String language;

    static {
        ajc$preClinit();
    }

    public CopyrightBox() {
        super(ProtectedSandApp.s("ྼ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u0fbd"), CopyrightBox.class);
        v E = eVar.E(ProtectedSandApp.s("྿"), ProtectedSandApp.s("࿀"), ProtectedSandApp.s("࿁"), "", "", "", ProtectedSandApp.s("྾"));
        String s4 = ProtectedSandApp.s("࿂");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("྿"), ProtectedSandApp.s("࿃"), ProtectedSandApp.s("࿁"), "", "", "", ProtectedSandApp.s("྾")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("྿"), ProtectedSandApp.s("࿅"), ProtectedSandApp.s("࿁"), ProtectedSandApp.s("྾"), ProtectedSandApp.s("࿆"), "", ProtectedSandApp.s("࿄")), 54);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("྿"), ProtectedSandApp.s("࿇"), ProtectedSandApp.s("࿁"), ProtectedSandApp.s("྾"), ProtectedSandApp.s("࿈"), "", ProtectedSandApp.s("࿄")), 58);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("྿"), ProtectedSandApp.s("࿉"), ProtectedSandApp.s("࿁"), "", "", "", ProtectedSandApp.s("྾")), 81);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.copyright = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.copyright));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.copyright) + 7;
    }

    public String getCopyright() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.copyright;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setCopyright(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.copyright = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("࿊"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("࿋"));
        a5.append(getCopyright());
        a5.append(ProtectedSandApp.s("࿌"));
        return a5.toString();
    }
}
