package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.boxes.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("༤\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_13 = null;
    private static final /* synthetic */ c.b ajc$tjp_14 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(ProtectedSandApp.s("༤\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("༥\u0001"), AC3SpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༨\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001"));
        String s4 = ProtectedSandApp.s("༪\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 55);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༬\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༭\u0001"), "", ProtectedSandApp.s("༫\u0001")), 59);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༮\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 95);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༯\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༰\u0001"), "", ProtectedSandApp.s("༫\u0001")), 99);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༱\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 103);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༲\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༳\u0001"), "", ProtectedSandApp.s("༫\u0001")), 107);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༵\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༴\u0001")), 112);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༶\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 63);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༷\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༸\u0001"), "", ProtectedSandApp.s("༫\u0001")), 67);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༹\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 71);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༺\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༻\u0001"), "", ProtectedSandApp.s("༫\u0001")), 75);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༼\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 79);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༽\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("༾\u0001"), "", ProtectedSandApp.s("༫\u0001")), 83);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("༿\u0001"), ProtectedSandApp.s("༩\u0001"), "", "", "", ProtectedSandApp.s("༦\u0001")), 87);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("༧\u0001"), ProtectedSandApp.s("ཀ\u0001"), ProtectedSandApp.s("༩\u0001"), ProtectedSandApp.s("༦\u0001"), ProtectedSandApp.s("ཁ\u0001"), "", ProtectedSandApp.s("༫\u0001")), 91);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.fscod = cVar.c(2);
        this.bsid = cVar.c(5);
        this.bsmod = cVar.c(3);
        this.acmod = cVar.c(3);
        this.lfeon = cVar.c(1);
        this.bitRateCode = cVar.c(5);
        this.reserved = cVar.c(5);
    }

    public int getAcmod() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.acmod;
    }

    public int getBitRateCode() {
        g.b().c(e.v(ajc$tjp_10, this, this));
        return this.bitRateCode;
    }

    public int getBsid() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.bsid;
    }

    public int getBsmod() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.bsmod;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        d dVar = new d(byteBuffer);
        dVar.a(this.fscod, 2);
        dVar.a(this.bsid, 5);
        dVar.a(this.bsmod, 3);
        dVar.a(this.acmod, 3);
        dVar.a(this.lfeon, 1);
        dVar.a(this.bitRateCode, 5);
        dVar.a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 3L;
    }

    public int getFscod() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.fscod;
    }

    public int getLfeon() {
        g.b().c(e.v(ajc$tjp_8, this, this));
        return this.lfeon;
    }

    public int getReserved() {
        g.b().c(e.v(ajc$tjp_12, this, this));
        return this.reserved;
    }

    public void setAcmod(int i4) {
        g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.acmod = i4;
    }

    public void setBitRateCode(int i4) {
        g.b().c(e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.bitRateCode = i4;
    }

    public void setBsid(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.bsid = i4;
    }

    public void setBsmod(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.bsmod = i4;
    }

    public void setFscod(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.fscod = i4;
    }

    public void setLfeon(int i4) {
        g.b().c(e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.lfeon = i4;
    }

    public void setReserved(int i4) {
        g.b().c(e.w(ajc$tjp_13, this, this, new Integer(i4)));
        this.reserved = i4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_14, this, this), ProtectedSandApp.s("ག\u0001"));
        a5.append(this.fscod);
        a5.append(ProtectedSandApp.s("གྷ\u0001"));
        a5.append(this.bsid);
        a5.append(ProtectedSandApp.s("ང\u0001"));
        a5.append(this.bsmod);
        a5.append(ProtectedSandApp.s("ཅ\u0001"));
        a5.append(this.acmod);
        a5.append(ProtectedSandApp.s("ཆ\u0001"));
        a5.append(this.lfeon);
        a5.append(ProtectedSandApp.s("ཇ\u0001"));
        a5.append(this.bitRateCode);
        a5.append(ProtectedSandApp.s("\u0f48\u0001"));
        return androidx.view.e.a(a5, this.reserved, '}');
    }
}
