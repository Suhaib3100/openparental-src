package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class GenericMediaHeaderTextAtom extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᅧ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_13 = null;
    private static final /* synthetic */ c.b ajc$tjp_14 = null;
    private static final /* synthetic */ c.b ajc$tjp_15 = null;
    private static final /* synthetic */ c.b ajc$tjp_16 = null;
    private static final /* synthetic */ c.b ajc$tjp_17 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    int unknown_1;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9;

    static {
        ajc$preClinit();
    }

    public GenericMediaHeaderTextAtom() {
        super(ProtectedSandApp.s("ᅧ\u0001"));
        this.unknown_1 = 65536;
        this.unknown_5 = 65536;
        this.unknown_9 = 1073741824;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᅨ\u0001"), GenericMediaHeaderTextAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅫ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001"));
        String s4 = ProtectedSandApp.s("ᅭ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 60);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅯ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅰ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 64);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅱ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 100);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅲ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅳ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 104);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅴ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 108);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅵ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅶ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 112);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅷ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 116);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅸ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅹ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 120);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅺ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 124);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅻ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅼ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 128);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅽ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 68);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᅾ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᅿ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 72);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆀ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 76);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆁ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᆂ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 80);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆃ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 84);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆄ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᆅ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 88);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆆ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), "", "", "", ProtectedSandApp.s("ᅩ\u0001")), 92);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅪ\u0001"), ProtectedSandApp.s("ᆇ\u0001"), ProtectedSandApp.s("ᅬ\u0001"), ProtectedSandApp.s("ᅩ\u0001"), ProtectedSandApp.s("ᆈ\u0001"), "", ProtectedSandApp.s("ᅮ\u0001")), 96);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.unknown_1 = byteBuffer.getInt();
        this.unknown_2 = byteBuffer.getInt();
        this.unknown_3 = byteBuffer.getInt();
        this.unknown_4 = byteBuffer.getInt();
        this.unknown_5 = byteBuffer.getInt();
        this.unknown_6 = byteBuffer.getInt();
        this.unknown_7 = byteBuffer.getInt();
        this.unknown_8 = byteBuffer.getInt();
        this.unknown_9 = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.unknown_1);
        byteBuffer.putInt(this.unknown_2);
        byteBuffer.putInt(this.unknown_3);
        byteBuffer.putInt(this.unknown_4);
        byteBuffer.putInt(this.unknown_5);
        byteBuffer.putInt(this.unknown_6);
        byteBuffer.putInt(this.unknown_7);
        byteBuffer.putInt(this.unknown_8);
        byteBuffer.putInt(this.unknown_9);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 36L;
    }

    public int getUnknown_1() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.unknown_1;
    }

    public int getUnknown_2() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.unknown_2;
    }

    public int getUnknown_3() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.unknown_3;
    }

    public int getUnknown_4() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.unknown_4;
    }

    public int getUnknown_5() {
        g.b().c(e.v(ajc$tjp_8, this, this));
        return this.unknown_5;
    }

    public int getUnknown_6() {
        g.b().c(e.v(ajc$tjp_10, this, this));
        return this.unknown_6;
    }

    public int getUnknown_7() {
        g.b().c(e.v(ajc$tjp_12, this, this));
        return this.unknown_7;
    }

    public int getUnknown_8() {
        g.b().c(e.v(ajc$tjp_14, this, this));
        return this.unknown_8;
    }

    public int getUnknown_9() {
        g.b().c(e.v(ajc$tjp_16, this, this));
        return this.unknown_9;
    }

    public void setUnknown_1(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.unknown_1 = i4;
    }

    public void setUnknown_2(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.unknown_2 = i4;
    }

    public void setUnknown_3(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.unknown_3 = i4;
    }

    public void setUnknown_4(int i4) {
        g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.unknown_4 = i4;
    }

    public void setUnknown_5(int i4) {
        g.b().c(e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.unknown_5 = i4;
    }

    public void setUnknown_6(int i4) {
        g.b().c(e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.unknown_6 = i4;
    }

    public void setUnknown_7(int i4) {
        g.b().c(e.w(ajc$tjp_13, this, this, new Integer(i4)));
        this.unknown_7 = i4;
    }

    public void setUnknown_8(int i4) {
        g.b().c(e.w(ajc$tjp_15, this, this, new Integer(i4)));
        this.unknown_8 = i4;
    }

    public void setUnknown_9(int i4) {
        g.b().c(e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.unknown_9 = i4;
    }
}
