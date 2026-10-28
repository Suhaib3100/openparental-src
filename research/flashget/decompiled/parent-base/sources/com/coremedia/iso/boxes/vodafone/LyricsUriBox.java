package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class LyricsUriBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᒝ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private String lyricsUri;

    static {
        ajc$preClinit();
    }

    public LyricsUriBox() {
        super(ProtectedSandApp.s("ᒝ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᒞ"), LyricsUriBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᒠ"), ProtectedSandApp.s("ᒡ"), ProtectedSandApp.s("ᒢ"), "", "", "", ProtectedSandApp.s("ᒟ"));
        String s4 = ProtectedSandApp.s("ᒣ");
        ajc$tjp_0 = eVar.H(s4, E, 39);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒠ"), ProtectedSandApp.s("ᒥ"), ProtectedSandApp.s("ᒢ"), ProtectedSandApp.s("ᒟ"), ProtectedSandApp.s("ᒦ"), "", ProtectedSandApp.s("ᒤ")), 43);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᒠ"), ProtectedSandApp.s("ᒧ"), ProtectedSandApp.s("ᒢ"), "", "", "", ProtectedSandApp.s("ᒟ")), 64);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.lyricsUri = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(l.b(this.lyricsUri));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.lyricsUri) + 5;
    }

    public String getLyricsUri() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.lyricsUri;
    }

    public void setLyricsUri(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.lyricsUri = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᒨ"));
        a5.append(getLyricsUri());
        a5.append(ProtectedSandApp.s("ᒩ"));
        return a5.toString();
    }
}
