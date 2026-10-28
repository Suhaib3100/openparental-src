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
public class PerformerBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᅍ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String language;
    private String performer;

    static {
        ajc$preClinit();
    }

    public PerformerBox() {
        super(ProtectedSandApp.s("ᅍ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᅎ"), PerformerBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᅐ"), ProtectedSandApp.s("ᅑ"), ProtectedSandApp.s("ᅒ"), "", "", "", ProtectedSandApp.s("ᅏ"));
        String s4 = ProtectedSandApp.s("ᅓ");
        ajc$tjp_0 = eVar.H(s4, E, 41);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅐ"), ProtectedSandApp.s("ᅔ"), ProtectedSandApp.s("ᅒ"), "", "", "", ProtectedSandApp.s("ᅏ")), 45);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅐ"), ProtectedSandApp.s("ᅖ"), ProtectedSandApp.s("ᅒ"), ProtectedSandApp.s("ᅏ"), ProtectedSandApp.s("ᅗ"), "", ProtectedSandApp.s("ᅕ")), 49);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅐ"), ProtectedSandApp.s("ᅘ"), ProtectedSandApp.s("ᅒ"), ProtectedSandApp.s("ᅏ"), ProtectedSandApp.s("ᅙ"), "", ProtectedSandApp.s("ᅕ")), 53);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅐ"), ProtectedSandApp.s("ᅚ"), ProtectedSandApp.s("ᅒ"), "", "", "", ProtectedSandApp.s("ᅏ")), 76);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.performer = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.performer));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.performer) + 7;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public String getPerformer() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.performer;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setPerformer(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.performer = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("ᅛ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ᅜ"));
        a5.append(getPerformer());
        a5.append(ProtectedSandApp.s("ᅝ"));
        return a5.toString();
    }
}
