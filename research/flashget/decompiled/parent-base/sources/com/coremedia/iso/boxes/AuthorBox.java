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
public class AuthorBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ཛྷ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String author;
    private String language;

    static {
        ajc$preClinit();
    }

    public AuthorBox() {
        super(ProtectedSandApp.s("ཛྷ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ཝ"), AuthorBox.class);
        v E = eVar.E(ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("འ"), ProtectedSandApp.s("ཡ"), "", "", "", ProtectedSandApp.s("ཞ"));
        String s4 = ProtectedSandApp.s("ར");
        ajc$tjp_0 = eVar.H(s4, E, 51);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("ལ"), ProtectedSandApp.s("ཡ"), "", "", "", ProtectedSandApp.s("ཞ")), 60);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("ཥ"), ProtectedSandApp.s("ཡ"), ProtectedSandApp.s("ཞ"), ProtectedSandApp.s("ས"), "", ProtectedSandApp.s("ཤ")), 64);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("ཧ"), ProtectedSandApp.s("ཡ"), ProtectedSandApp.s("ཞ"), ProtectedSandApp.s("ཨ"), "", ProtectedSandApp.s("ཤ")), 68);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཟ"), ProtectedSandApp.s("ཀྵ"), ProtectedSandApp.s("ཡ"), "", "", "", ProtectedSandApp.s("ཞ")), 92);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.author = g.g(byteBuffer);
    }

    public String getAuthor() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.author;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.author));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.author) + 7;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setAuthor(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.author = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("ཪ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ཫ"));
        a5.append(getAuthor());
        a5.append(ProtectedSandApp.s("ཬ"));
        return a5.toString();
    }
}
