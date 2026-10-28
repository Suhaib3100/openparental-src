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
public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ཆ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        ajc$preClinit();
    }

    public AlbumBox() {
        super(ProtectedSandApp.s("ཆ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ཇ"), AlbumBox.class);
        v E = eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ཊ"), ProtectedSandApp.s("ཋ"), "", "", "", ProtectedSandApp.s("\u0f48"));
        String s4 = ProtectedSandApp.s("ཌ");
        ajc$tjp_0 = eVar.H(s4, E, 51);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ཌྷ"), ProtectedSandApp.s("ཋ"), "", "", "", ProtectedSandApp.s("\u0f48")), 55);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ཏ"), ProtectedSandApp.s("ཋ"), "", "", "", ProtectedSandApp.s("ཎ")), 59);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ད"), ProtectedSandApp.s("ཋ"), ProtectedSandApp.s("\u0f48"), ProtectedSandApp.s("དྷ"), "", ProtectedSandApp.s("ཐ")), 63);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ན"), ProtectedSandApp.s("ཋ"), ProtectedSandApp.s("\u0f48"), ProtectedSandApp.s("པ"), "", ProtectedSandApp.s("ཐ")), 67);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("ཕ"), ProtectedSandApp.s("ཋ"), ProtectedSandApp.s("ཎ"), ProtectedSandApp.s("བ"), "", ProtectedSandApp.s("ཐ")), 71);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ཉ"), ProtectedSandApp.s("བྷ"), ProtectedSandApp.s("ཋ"), "", "", "", ProtectedSandApp.s("\u0f48")), 103);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.albumTitle = g.g(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.trackNumber = g.p(byteBuffer);
        } else {
            this.trackNumber = -1;
        }
    }

    public String getAlbumTitle() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.albumTitle;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.albumTitle));
        byteBuffer.put((byte) 0);
        int i4 = this.trackNumber;
        if (i4 != -1) {
            i.m(byteBuffer, i4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.albumTitle) + 7 + (this.trackNumber == -1 ? 0 : 1);
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public int getTrackNumber() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.trackNumber;
    }

    public void setAlbumTitle(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, str));
        this.albumTitle = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.language = str;
    }

    public void setTrackNumber(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.trackNumber = i4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_6, this, this), ProtectedSandApp.s("མ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ཙ"));
        a5.append(getAlbumTitle());
        if (this.trackNumber >= 0) {
            a5.append(ProtectedSandApp.s("ཚ"));
            a5.append(getTrackNumber());
        }
        a5.append(ProtectedSandApp.s("ཛ"));
        return a5.toString();
    }
}
