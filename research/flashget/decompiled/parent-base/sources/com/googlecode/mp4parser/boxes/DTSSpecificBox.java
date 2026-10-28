package com.googlecode.mp4parser.boxes;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import java.nio.ByteBuffer;
import lg.v;
import org.apache.http.HttpStatus;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;
import va.a;

/* loaded from: classes6.dex */
public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ཱ\u0001");
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
    private static final /* synthetic */ c.b ajc$tjp_22 = null;
    private static final /* synthetic */ c.b ajc$tjp_23 = null;
    private static final /* synthetic */ c.b ajc$tjp_24 = null;
    private static final /* synthetic */ c.b ajc$tjp_25 = null;
    private static final /* synthetic */ c.b ajc$tjp_26 = null;
    private static final /* synthetic */ c.b ajc$tjp_27 = null;
    private static final /* synthetic */ c.b ajc$tjp_28 = null;
    private static final /* synthetic */ c.b ajc$tjp_29 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_30 = null;
    private static final /* synthetic */ c.b ajc$tjp_31 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(ProtectedSandApp.s("ཱ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ི\u0001"), DTSSpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ཱུ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཱི\u0001"));
        String s4 = ProtectedSandApp.s("ཷ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 89);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ཹ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཱི\u0001"), ProtectedSandApp.s("ེ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 93);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ོ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 129);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ཽ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ཾ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), UserData.IS91_MSG_TYPE_SHORT_MESSAGE);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ཿ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 137);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྀ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ཱྀ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 141);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྂ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 145);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྃ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("྄\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 149);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("྅\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("྆\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("྇\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 157);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྈ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 161);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྉ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྊ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 165);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྋ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཱི\u0001")), 97);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྌ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 169);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྍ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྎ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 173);
        ajc$tjp_22 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྏ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 177);
        ajc$tjp_23 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྐ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྑ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 181);
        ajc$tjp_24 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྒ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 185);
        ajc$tjp_25 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྒྷ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྔ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 189);
        ajc$tjp_26 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྕ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 193);
        ajc$tjp_27 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྖ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྗ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 197);
        ajc$tjp_28 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("\u0f98\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 201);
        ajc$tjp_29 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྙ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྚ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), HttpStatus.SC_RESET_CONTENT);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྛ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཱི\u0001"), ProtectedSandApp.s("ྜ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 101);
        ajc$tjp_30 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྜྷ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 209);
        ajc$tjp_31 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྞ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྟ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 213);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྠ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཱི\u0001")), 105);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྡ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཱི\u0001"), ProtectedSandApp.s("ྡྷ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 109);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྣ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 113);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྤ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྥ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 117);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྦ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), "", "", "", ProtectedSandApp.s("ཻ\u0001")), 121);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ུ\u0001"), ProtectedSandApp.s("ྦྷ\u0001"), ProtectedSandApp.s("ྲྀ\u0001"), ProtectedSandApp.s("ཻ\u0001"), ProtectedSandApp.s("ྨ\u0001"), "", ProtectedSandApp.s("ླྀ\u0001")), 125);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = g.l(byteBuffer);
        this.maxBitRate = g.l(byteBuffer);
        this.avgBitRate = g.l(byteBuffer);
        this.pcmSampleDepth = g.p(byteBuffer);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.frameDuration = cVar.c(2);
        this.streamConstruction = cVar.c(5);
        this.coreLFEPresent = cVar.c(1);
        this.coreLayout = cVar.c(6);
        this.coreSize = cVar.c(14);
        this.stereoDownmix = cVar.c(1);
        this.representationType = cVar.c(3);
        this.channelLayout = cVar.c(16);
        this.multiAssetFlag = cVar.c(1);
        this.LBRDurationMod = cVar.c(1);
        this.reservedBoxPresent = cVar.c(1);
        this.reserved = cVar.c(5);
    }

    public long getAvgBitRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_22, this, this));
        return this.channelLayout;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.i(byteBuffer, this.DTSSamplingFrequency);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        i.m(byteBuffer, this.pcmSampleDepth);
        d dVar = new d(byteBuffer);
        dVar.a(this.frameDuration, 2);
        dVar.a(this.streamConstruction, 5);
        dVar.a(this.coreLFEPresent, 1);
        dVar.a(this.coreLayout, 6);
        dVar.a(this.coreSize, 14);
        dVar.a(this.stereoDownmix, 1);
        dVar.a(this.representationType, 3);
        dVar.a(this.channelLayout, 16);
        dVar.a(this.multiAssetFlag, 1);
        dVar.a(this.LBRDurationMod, 1);
        dVar.a(this.reservedBoxPresent, 1);
        dVar.a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public int getCoreLFEPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_14, this, this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_16, this, this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }

    @a
    public int[] getDashAudioChannelConfiguration() {
        int i4;
        int channelLayout = getChannelLayout();
        int i5 = 1;
        if ((channelLayout & 1) == 1) {
            i4 = 4;
        } else {
            i5 = 0;
            i4 = 0;
        }
        if ((channelLayout & 2) == 2) {
            i5 += 2;
            i4 |= 3;
        }
        if ((channelLayout & 4) == 4) {
            i5 += 2;
            i4 |= 48;
        }
        if ((channelLayout & 8) == 8) {
            i5++;
            i4 |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i5++;
            i4 |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i5 += 2;
            i4 |= 20480;
        }
        if ((channelLayout & 64) == 64) {
            i5 += 2;
            i4 |= 48;
        }
        if ((channelLayout & 128) == 128) {
            i5++;
            i4 |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i5++;
            i4 |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            i5 += 2;
            i4 |= 192;
        }
        if ((channelLayout & 1024) == 1024) {
            i5 += 2;
            i4 |= 1536;
        }
        if ((channelLayout & 2048) == 2048) {
            i5 += 2;
            i4 |= 48;
        }
        if ((channelLayout & 4096) == 4096) {
            i5++;
            i4 |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i5 += 2;
            i4 |= 48;
        }
        if ((channelLayout & 16384) == 16384) {
            i5++;
            i4 |= 65536;
        }
        if ((channelLayout & 32768) == 32768) {
            i5 += 2;
            i4 |= 163840;
        }
        if ((channelLayout & 65536) == 65536) {
            i5++;
        }
        if ((channelLayout & 131072) == 131072) {
            i5 += 2;
        }
        return new int[]{i5, i4};
    }

    public int getFrameDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_20, this, this));
        return this.representationType;
    }

    public int getReserved() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_28, this, this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.avgBitRate = j4;
    }

    public void setChannelLayout(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_23, this, this, new Integer(i4)));
        this.channelLayout = i4;
    }

    public void setCoreLFEPresent(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, new Integer(i4)));
        this.coreLFEPresent = i4;
    }

    public void setCoreLayout(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_15, this, this, new Integer(i4)));
        this.coreLayout = i4;
    }

    public void setCoreSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.coreSize = i4;
    }

    public void setDTSSamplingFrequency(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Long(j4)));
        this.DTSSamplingFrequency = j4;
    }

    public void setFrameDuration(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.frameDuration = i4;
    }

    public void setLBRDurationMod(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_27, this, this, new Integer(i4)));
        this.LBRDurationMod = i4;
    }

    public void setMaxBitRate(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Long(j4)));
        this.maxBitRate = j4;
    }

    public void setMultiAssetFlag(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_25, this, this, new Integer(i4)));
        this.multiAssetFlag = i4;
    }

    public void setPcmSampleDepth(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.pcmSampleDepth = i4;
    }

    public void setRepresentationType(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_21, this, this, new Integer(i4)));
        this.representationType = i4;
    }

    public void setReserved(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_29, this, this, new Integer(i4)));
        this.reserved = i4;
    }

    public void setReservedBoxPresent(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_31, this, this, new Integer(i4)));
        this.reservedBoxPresent = i4;
    }

    public void setStereoDownmix(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_19, this, this, new Integer(i4)));
        this.stereoDownmix = i4;
    }

    public void setStreamConstruction(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.streamConstruction = i4;
    }
}
