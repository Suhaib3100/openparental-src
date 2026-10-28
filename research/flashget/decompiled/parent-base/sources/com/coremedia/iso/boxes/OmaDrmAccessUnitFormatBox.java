package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᄭ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    static {
        ajc$preClinit();
    }

    public OmaDrmAccessUnitFormatBox() {
        super(ProtectedSandApp.s("ᄭ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᄮ"), OmaDrmAccessUnitFormatBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄱ"), ProtectedSandApp.s("ᄲ"), "", "", "", ProtectedSandApp.s("ᄯ"));
        String s4 = ProtectedSandApp.s("ᄳ");
        ajc$tjp_0 = eVar.H(s4, E, 46);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄵ"), ProtectedSandApp.s("ᄲ"), "", "", "", ProtectedSandApp.s("ᄴ")), 50);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄶ"), ProtectedSandApp.s("ᄲ"), "", "", "", ProtectedSandApp.s("ᄴ")), 54);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄸ"), ProtectedSandApp.s("ᄲ"), ProtectedSandApp.s("ᄴ"), ProtectedSandApp.s("ᄹ"), "", ProtectedSandApp.s("ᄷ")), 58);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄺ"), ProtectedSandApp.s("ᄲ"), ProtectedSandApp.s("ᄴ"), ProtectedSandApp.s("ᄻ"), "", ProtectedSandApp.s("ᄷ")), 62);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄰ"), ProtectedSandApp.s("ᄼ"), ProtectedSandApp.s("ᄲ"), ProtectedSandApp.s("ᄽ"), ProtectedSandApp.s("ᄾ"), "", ProtectedSandApp.s("ᄷ")), 66);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte p4 = (byte) g.p(byteBuffer);
        this.allBits = p4;
        this.selectiveEncryption = (p4 & 128) == 128;
        this.keyIndicatorLength = g.p(byteBuffer);
        this.initVectorLength = g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.m(byteBuffer, this.allBits);
        i.m(byteBuffer, this.keyIndicatorLength);
        i.m(byteBuffer, this.initVectorLength);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 7L;
    }

    public int getInitVectorLength() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.initVectorLength;
    }

    public int getKeyIndicatorLength() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.keyIndicatorLength;
    }

    public boolean isSelectiveEncryption() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.selectiveEncryption;
    }

    public void setAllBits(byte b5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Byte(b5)));
        this.allBits = b5;
        this.selectiveEncryption = (b5 & 128) == 128;
    }

    public void setInitVectorLength(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.initVectorLength = i4;
    }

    public void setKeyIndicatorLength(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, new Integer(i4)));
        this.keyIndicatorLength = i4;
    }
}
