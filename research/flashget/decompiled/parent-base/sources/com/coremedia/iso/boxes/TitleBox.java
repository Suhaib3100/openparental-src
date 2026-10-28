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
public class TitleBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ሺ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String language;
    private String title;

    static {
        ajc$preClinit();
    }

    public TitleBox() {
        super(ProtectedSandApp.s("ሺ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ሻ"), TitleBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሽ"), ProtectedSandApp.s("ሾ"), ProtectedSandApp.s("ሿ"), "", "", "", ProtectedSandApp.s("ሼ"));
        String s4 = ProtectedSandApp.s("ቀ");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሽ"), ProtectedSandApp.s("ቁ"), ProtectedSandApp.s("ሿ"), "", "", "", ProtectedSandApp.s("ሼ")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሽ"), ProtectedSandApp.s("ቃ"), ProtectedSandApp.s("ሿ"), ProtectedSandApp.s("ሼ"), ProtectedSandApp.s("ቄ"), "", ProtectedSandApp.s("ቂ")), 59);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሽ"), ProtectedSandApp.s("ቅ"), ProtectedSandApp.s("ሿ"), ProtectedSandApp.s("ሼ"), ProtectedSandApp.s("ቆ"), "", ProtectedSandApp.s("ቂ")), 63);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሽ"), ProtectedSandApp.s("ቇ"), ProtectedSandApp.s("ሿ"), "", "", "", ProtectedSandApp.s("ሼ")), 86);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.title = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.title));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.title) + 7;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public String getTitle() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.title;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setTitle(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.title = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("ቈ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("\u1249"));
        a5.append(getTitle());
        a5.append(ProtectedSandApp.s("ቊ"));
        return a5.toString();
    }
}
