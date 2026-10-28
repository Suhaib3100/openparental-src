package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.boxes.a;
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
public class AlbumArtistBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᑳ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private String albumArtist;
    private String language;

    static {
        ajc$preClinit();
    }

    public AlbumArtistBox() {
        super(ProtectedSandApp.s("ᑳ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᑴ"), AlbumArtistBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᑶ"), ProtectedSandApp.s("ᑷ"), ProtectedSandApp.s("ᑸ"), "", "", "", ProtectedSandApp.s("ᑵ"));
        String s4 = ProtectedSandApp.s("ᑹ");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑶ"), ProtectedSandApp.s("ᑺ"), ProtectedSandApp.s("ᑸ"), "", "", "", ProtectedSandApp.s("ᑵ")), 46);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑶ"), ProtectedSandApp.s("ᑼ"), ProtectedSandApp.s("ᑸ"), ProtectedSandApp.s("ᑵ"), ProtectedSandApp.s("ᑽ"), "", ProtectedSandApp.s("ᑻ")), 50);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑶ"), ProtectedSandApp.s("ᑾ"), ProtectedSandApp.s("ᑸ"), ProtectedSandApp.s("ᑵ"), ProtectedSandApp.s("ᑿ"), "", ProtectedSandApp.s("ᑻ")), 54);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᑶ"), ProtectedSandApp.s("ᒀ"), ProtectedSandApp.s("ᑸ"), "", "", "", ProtectedSandApp.s("ᑵ")), 76);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = g.f(byteBuffer);
        this.albumArtist = g.g(byteBuffer);
    }

    public String getAlbumArtist() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.albumArtist;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.d(byteBuffer, this.language);
        byteBuffer.put(l.b(this.albumArtist));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.albumArtist) + 7;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setAlbumArtist(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.albumArtist = str;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_4, this, this), ProtectedSandApp.s("ᒁ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ᒂ"));
        a5.append(getAlbumArtist());
        a5.append(ProtectedSandApp.s("ᒃ"));
        return a5.toString();
    }
}
