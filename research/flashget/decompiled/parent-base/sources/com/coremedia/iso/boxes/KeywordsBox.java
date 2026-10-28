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
public class KeywordsBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("Ⴑ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String[] keywords;
    private String language;

    static {
        ajc$preClinit();
    }

    public KeywordsBox() {
        super(ProtectedSandApp.s("Ⴑ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ⴒ"), KeywordsBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ⴔ"), ProtectedSandApp.s("Ⴕ"), ProtectedSandApp.s("Ⴖ"), "", "", "", ProtectedSandApp.s("Ⴓ"));
        String s4 = ProtectedSandApp.s("Ⴗ");
        ajc$tjp_0 = eVar.H(s4, E, 40);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ⴔ"), ProtectedSandApp.s("Ⴙ"), ProtectedSandApp.s("Ⴖ"), "", "", "", ProtectedSandApp.s("Ⴘ")), 44);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ⴔ"), ProtectedSandApp.s("Ⴛ"), ProtectedSandApp.s("Ⴖ"), ProtectedSandApp.s("Ⴓ"), ProtectedSandApp.s("Ⴜ"), "", ProtectedSandApp.s("Ⴚ")), 48);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ⴔ"), ProtectedSandApp.s("Ⴝ"), ProtectedSandApp.s("Ⴖ"), ProtectedSandApp.s("Ⴘ"), ProtectedSandApp.s("Ⴞ"), "", ProtectedSandApp.s("Ⴚ")), 52);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ⴔ"), ProtectedSandApp.s("Ⴟ"), ProtectedSandApp.s("Ⴖ"), "", "", "", ProtectedSandApp.s("Ⴓ")), 87);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        int p4 = g.p(byteBuffer);
        this.keywords = new String[p4];
        for (int i4 = 0; i4 < p4; i4++) {
            g.p(byteBuffer);
            this.keywords[i4] = g.g(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        i.m(byteBuffer, this.keywords.length);
        for (String str : this.keywords) {
            i.m(byteBuffer, l.c(str) + 1);
            byteBuffer.put(l.b(str));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long j4 = 7;
        for (int i4 = 0; i4 < this.keywords.length; i4++) {
            j4 += l.c(r0[i4]) + 2;
        }
        return j4;
    }

    public String[] getKeywords() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.keywords;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setKeywords(String[] strArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, strArr));
        this.keywords = strArr;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        StringBuffer stringBuffer = new StringBuffer(ProtectedSandApp.s("Ⴠ"));
        stringBuffer.append(getLanguage());
        for (int i4 = 0; i4 < this.keywords.length; i4++) {
            stringBuffer.append(ProtectedSandApp.s("Ⴢ"));
            stringBuffer.append(i4);
            stringBuffer.append(ProtectedSandApp.s("Ⴣ"));
            stringBuffer.append(this.keywords[i4]);
        }
        stringBuffer.append(ProtectedSandApp.s("Ⴡ"));
        return stringBuffer.toString();
    }
}
