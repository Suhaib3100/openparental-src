package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class BaseMediaInfoAtom extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᄷ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;

    static {
        ajc$preClinit();
    }

    public BaseMediaInfoAtom() {
        super(ProtectedSandApp.s("ᄷ\u0001"));
        this.graphicsMode = (short) 64;
        this.opColorR = 32768;
        this.opColorG = 32768;
        this.opColorB = 32768;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᄸ\u0001"), BaseMediaInfoAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᄻ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᄹ\u0001"));
        String s4 = ProtectedSandApp.s("ᄽ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 54);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᄿ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᄹ\u0001"), ProtectedSandApp.s("ᅀ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 58);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅁ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᄹ\u0001")), 94);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅂ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᄹ\u0001"), ProtectedSandApp.s("ᅃ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 98);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅅ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᅄ\u0001")), 103);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅇ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᅆ\u0001")), 62);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅈ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᅆ\u0001"), ProtectedSandApp.s("ᅉ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 66);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅊ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᅆ\u0001")), 70);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅋ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᅆ\u0001"), ProtectedSandApp.s("ᅌ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 74);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅍ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᅆ\u0001")), 78);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅎ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᅆ\u0001"), ProtectedSandApp.s("ᅏ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 82);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅐ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), "", "", "", ProtectedSandApp.s("ᄹ\u0001")), 86);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄺ\u0001"), ProtectedSandApp.s("ᅑ\u0001"), ProtectedSandApp.s("ᄼ\u0001"), ProtectedSandApp.s("ᄹ\u0001"), ProtectedSandApp.s("ᅒ\u0001"), "", ProtectedSandApp.s("ᄾ\u0001")), 90);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.opColorR = g.i(byteBuffer);
        this.opColorG = g.i(byteBuffer);
        this.opColorB = g.i(byteBuffer);
        this.balance = byteBuffer.getShort();
        this.reserved = byteBuffer.getShort();
    }

    public short getBalance() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.balance;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putShort(this.graphicsMode);
        i.f(byteBuffer, this.opColorR);
        i.f(byteBuffer, this.opColorG);
        i.f(byteBuffer, this.opColorB);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(this.reserved);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 16L;
    }

    public short getGraphicsMode() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.graphicsMode;
    }

    public int getOpColorB() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.opColorB;
    }

    public int getOpColorG() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.opColorG;
    }

    public int getOpColorR() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.opColorR;
    }

    public short getReserved() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public void setBalance(short s4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Short(s4)));
        this.balance = s4;
    }

    public void setGraphicsMode(short s4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Short(s4)));
        this.graphicsMode = s4;
    }

    public void setOpColorB(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.opColorB = i4;
    }

    public void setOpColorG(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.opColorG = i4;
    }

    public void setOpColorR(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.opColorR = i4;
    }

    public void setReserved(short s4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Short(s4)));
        this.reserved = s4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_12, this, this), ProtectedSandApp.s("ᅓ\u0001"));
        a5.append((int) this.graphicsMode);
        a5.append(ProtectedSandApp.s("ᅔ\u0001"));
        a5.append(this.opColorR);
        a5.append(ProtectedSandApp.s("ᅕ\u0001"));
        a5.append(this.opColorG);
        a5.append(ProtectedSandApp.s("ᅖ\u0001"));
        a5.append(this.opColorB);
        a5.append(ProtectedSandApp.s("ᅗ\u0001"));
        a5.append((int) this.balance);
        a5.append(ProtectedSandApp.s("ᅘ\u0001"));
        return androidx.view.e.a(a5, this.reserved, '}');
    }
}
