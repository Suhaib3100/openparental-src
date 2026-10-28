package com.mp4parser.iso14496.part15;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᤝ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        ajc$preClinit();
    }

    public TierBitRateBox() {
        super(ProtectedSandApp.s("ᤝ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᤞ\u0001"), TierBitRateBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤡ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001"));
        String s4 = ProtectedSandApp.s("ᤣ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 52);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤥ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("ᤦ\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 56);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤧ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001")), 92);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤨ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("ᤩ\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 96);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤪ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001")), 60);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤫ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("\u192c\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 64);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("\u192d\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001")), 68);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("\u192e\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("\u192f\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 72);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤰ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001")), 76);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤱ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("ᤲ\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 80);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤳ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), "", "", "", ProtectedSandApp.s("\u191f\u0001")), 84);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤠ\u0001"), ProtectedSandApp.s("ᤴ\u0001"), ProtectedSandApp.s("ᤢ\u0001"), ProtectedSandApp.s("\u191f\u0001"), ProtectedSandApp.s("ᤵ\u0001"), "", ProtectedSandApp.s("ᤤ\u0001")), 88);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = g.l(byteBuffer);
        this.maxBitRate = g.l(byteBuffer);
        this.avgBitRate = g.l(byteBuffer);
        this.tierBaseBitRate = g.l(byteBuffer);
        this.tierMaxBitRate = g.l(byteBuffer);
        this.tierAvgBitRate = g.l(byteBuffer);
    }

    public long getAvgBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.baseBitRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.i(byteBuffer, this.baseBitRate);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        byteBuffer.putInt((int) this.tierBaseBitRate);
        byteBuffer.putInt((int) this.tierMaxBitRate);
        byteBuffer.putInt((int) this.tierAvgBitRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public long getMaxBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_10, this, this));
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_8, this, this));
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, new Long(j4)));
        this.avgBitRate = j4;
    }

    public void setBaseBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.baseBitRate = j4;
    }

    public void setMaxBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, new Long(j4)));
        this.maxBitRate = j4;
    }

    public void setTierAvgBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_11, this, this, new Long(j4)));
        this.tierAvgBitRate = j4;
    }

    public void setTierBaseBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_7, this, this, new Long(j4)));
        this.tierBaseBitRate = j4;
    }

    public void setTierMaxBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_9, this, this, new Long(j4)));
        this.tierMaxBitRate = j4;
    }
}
