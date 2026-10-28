package com.coremedia.iso.boxes;

import com.coremedia.iso.f;
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
public class SchemeTypeBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ᇒ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    static {
        ajc$preClinit();
    }

    public SchemeTypeBox() {
        super(ProtectedSandApp.s("ᇒ"));
        this.schemeType = ProtectedSandApp.s("ᇓ");
        this.schemeUri = null;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇔ"), SchemeTypeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇗ"), ProtectedSandApp.s("ᇘ"), "", "", "", ProtectedSandApp.s("ᇕ"));
        String s4 = ProtectedSandApp.s("ᇙ");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇛ"), ProtectedSandApp.s("ᇘ"), "", "", "", ProtectedSandApp.s("ᇚ")), 48);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇜ"), ProtectedSandApp.s("ᇘ"), "", "", "", ProtectedSandApp.s("ᇕ")), 52);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇞ"), ProtectedSandApp.s("ᇘ"), ProtectedSandApp.s("ᇕ"), ProtectedSandApp.s("ᇟ"), "", ProtectedSandApp.s("ᇝ")), 56);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇠ"), ProtectedSandApp.s("ᇘ"), ProtectedSandApp.s("ᇡ"), ProtectedSandApp.s("ᇢ"), "", ProtectedSandApp.s("ᇝ")), 61);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇣ"), ProtectedSandApp.s("ᇘ"), ProtectedSandApp.s("ᇕ"), ProtectedSandApp.s("ᇤ"), "", ProtectedSandApp.s("ᇝ")), 65);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇖ"), ProtectedSandApp.s("ᇥ"), ProtectedSandApp.s("ᇘ"), "", "", "", ProtectedSandApp.s("ᇕ")), 93);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeType = g.b(byteBuffer);
        this.schemeVersion = g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.schemeUri = g.g(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(f.b(this.schemeType));
        i.i(byteBuffer, this.schemeVersion);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(l.b(this.schemeUri));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return ((getFlags() & 1) == 1 ? l.c(this.schemeUri) + 1 : 0) + 12;
    }

    public String getSchemeType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.schemeType;
    }

    public String getSchemeUri() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.schemeVersion;
    }

    public void setSchemeType(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.schemeType = str;
    }

    public void setSchemeUri(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, str));
        this.schemeUri = str;
    }

    public void setSchemeVersion(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, new Integer(i4)));
        this.schemeVersion = i4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("ᇦ"));
        a5.append(this.schemeUri);
        a5.append(ProtectedSandApp.s("ᇧ"));
        a5.append(this.schemeType);
        a5.append(ProtectedSandApp.s("ᇨ"));
        return android.support.v4.media.session.b.a(a5, this.schemeVersion, ProtectedSandApp.s("ᇩ"));
    }
}
