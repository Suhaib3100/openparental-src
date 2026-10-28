package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ዧ");
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
    private static final /* synthetic */ c.b ajc$tjp_18 = null;
    private static final /* synthetic */ c.b ajc$tjp_19 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_20 = null;
    private static final /* synthetic */ c.b ajc$tjp_21 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super(ProtectedSandApp.s("ዧ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("የ"), AppleLosslessSpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ያ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ዩ"));
        String s4 = ProtectedSandApp.s("ይ");
        ajc$tjp_0 = eVar.H(s4, E, 34);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዯ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ዱ"), "", ProtectedSandApp.s("ዮ")), 38);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዲ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 74);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዳ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ዴ"), "", ProtectedSandApp.s("ዮ")), 78);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ድ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 82);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዶ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ዷ"), "", ProtectedSandApp.s("ዮ")), 86);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዸ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 90);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዹ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ዺ"), "", ProtectedSandApp.s("ዮ")), 94);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዻ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ዩ")), 98);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዼ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ዽ"), "", ProtectedSandApp.s("ዮ")), 102);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዾ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ዩ")), 106);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ዿ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጀ"), "", ProtectedSandApp.s("ዮ")), 110);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጁ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 42);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጂ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ዩ")), 114);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጃ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጄ"), "", ProtectedSandApp.s("ዮ")), 118);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጅ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጆ"), "", ProtectedSandApp.s("ዮ")), 46);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጇ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 50);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ገ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጉ"), "", ProtectedSandApp.s("ዮ")), 54);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጊ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 58);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጋ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጌ"), "", ProtectedSandApp.s("ዮ")), 62);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ግ"), ProtectedSandApp.s("ዬ"), "", "", "", ProtectedSandApp.s("ደ")), 66);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ዪ"), ProtectedSandApp.s("ጎ"), ProtectedSandApp.s("ዬ"), ProtectedSandApp.s("ደ"), ProtectedSandApp.s("ጏ"), "", ProtectedSandApp.s("ዮ")), 70);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = g.l(byteBuffer);
        this.unknown1 = g.p(byteBuffer);
        this.sampleSize = g.p(byteBuffer);
        this.historyMult = g.p(byteBuffer);
        this.initialHistory = g.p(byteBuffer);
        this.kModifier = g.p(byteBuffer);
        this.channels = g.p(byteBuffer);
        this.unknown2 = g.i(byteBuffer);
        this.maxCodedFrameSize = g.l(byteBuffer);
        this.bitRate = g.l(byteBuffer);
        this.sampleRate = g.l(byteBuffer);
    }

    public long getBitRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_18, this, this));
        return this.bitRate;
    }

    public int getChannels() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_12, this, this));
        return this.channels;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.maxSamplePerFrame);
        i.m(byteBuffer, this.unknown1);
        i.m(byteBuffer, this.sampleSize);
        i.m(byteBuffer, this.historyMult);
        i.m(byteBuffer, this.initialHistory);
        i.m(byteBuffer, this.kModifier);
        i.m(byteBuffer, this.channels);
        i.f(byteBuffer, this.unknown2);
        byteBuffer.putInt((int) this.maxCodedFrameSize);
        byteBuffer.putInt((int) this.bitRate);
        byteBuffer.putInt((int) this.sampleRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 28L;
    }

    public int getHistoryMult() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.historyMult;
    }

    public int getInitialHistory() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.initialHistory;
    }

    public int getKModifier() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.kModifier;
    }

    public long getMaxCodedFrameSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_16, this, this));
        return this.maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.maxSamplePerFrame;
    }

    public long getSampleRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_20, this, this));
        return this.sampleRate;
    }

    public int getSampleSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.sampleSize;
    }

    public int getUnknown1() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.unknown1;
    }

    public int getUnknown2() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_14, this, this));
        return this.unknown2;
    }

    public void setBitRate(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_19, this, this, new Integer(i4)));
        this.bitRate = i4;
    }

    public void setChannels(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, new Integer(i4)));
        this.channels = i4;
    }

    public void setHistoryMult(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.historyMult = i4;
    }

    public void setInitialHistory(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.initialHistory = i4;
    }

    public void setKModifier(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.kModifier = i4;
    }

    public void setMaxCodedFrameSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.maxCodedFrameSize = i4;
    }

    public void setMaxSamplePerFrame(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.maxSamplePerFrame = i4;
    }

    public void setSampleRate(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_21, this, this, new Integer(i4)));
        this.sampleRate = i4;
    }

    public void setSampleSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.sampleSize = i4;
    }

    public void setUnknown1(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.unknown1 = i4;
    }

    public void setUnknown2(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_15, this, this, new Integer(i4)));
        this.unknown2 = i4;
    }
}
