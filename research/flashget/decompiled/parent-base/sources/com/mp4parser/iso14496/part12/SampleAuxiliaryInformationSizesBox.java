package com.mp4parser.iso14496.part12;

import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.boxes.a;
import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ᢃ\u0001");
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
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(ProtectedSandApp.s("ᢃ\u0001"));
        this.sampleInfoSizes = new short[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᢄ\u0001"), SampleAuxiliaryInformationSizesBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢇ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢉ\u0001"), ProtectedSandApp.s("ᢊ\u0001"), "", ProtectedSandApp.s("ᢅ\u0001"));
        String s4 = ProtectedSandApp.s("ᢋ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 57);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢍ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢌ\u0001")), 106);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢏ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢉ\u0001"), ProtectedSandApp.s("ᢐ\u0001"), "", ProtectedSandApp.s("ᢎ\u0001")), 146);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢑ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢌ\u0001")), 151);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢒ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢌ\u0001"), ProtectedSandApp.s("ᢓ\u0001"), "", ProtectedSandApp.s("ᢎ\u0001")), 110);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢔ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢌ\u0001")), 114);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢕ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢌ\u0001"), ProtectedSandApp.s("ᢖ\u0001"), "", ProtectedSandApp.s("ᢎ\u0001")), 118);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢗ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢉ\u0001")), 122);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢘ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢉ\u0001"), ProtectedSandApp.s("ᢙ\u0001"), "", ProtectedSandApp.s("ᢎ\u0001")), 126);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢛ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢚ\u0001")), UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢜ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), ProtectedSandApp.s("ᢚ\u0001"), ProtectedSandApp.s("ᢝ\u0001"), "", ProtectedSandApp.s("ᢎ\u0001")), 137);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢆ\u0001"), ProtectedSandApp.s("ᢞ\u0001"), ProtectedSandApp.s("ᢈ\u0001"), "", "", "", ProtectedSandApp.s("ᢉ\u0001")), 142);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = g.b(byteBuffer);
            this.auxInfoTypeParameter = g.b(byteBuffer);
        }
        this.defaultSampleInfoSize = (short) g.p(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.sampleCount = a5;
        if (this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[a5];
            for (int i4 = 0; i4 < this.sampleCount; i4++) {
                this.sampleInfoSizes[i4] = (short) g.p(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(f.b(this.auxInfoType));
            byteBuffer.put(f.b(this.auxInfoTypeParameter));
        }
        i.m(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize != 0) {
            byteBuffer.putInt(this.sampleCount);
            return;
        }
        byteBuffer.putInt(this.sampleInfoSizes.length);
        for (short s4 : this.sampleInfoSizes) {
            i.m(byteBuffer, s4);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return ((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.length : 0);
    }

    public int getDefaultSampleInfoSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        short[] sArr = this.sampleInfoSizes;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public short getSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_0, this, this, new Integer(i4)));
        return getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[i4] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, new Integer(i4)));
        this.defaultSampleInfoSize = (short) i4;
    }

    public void setSampleCount(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, new Integer(i4)));
        this.sampleCount = i4;
    }

    public void setSampleInfoSizes(short[] sArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_8, this, this, sArr));
        short[] sArr2 = new short[sArr.length];
        this.sampleInfoSizes = sArr2;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_11, this, this), ProtectedSandApp.s("ᢟ\u0001"));
        a5.append((int) this.defaultSampleInfoSize);
        a5.append(ProtectedSandApp.s("ᢠ\u0001"));
        a5.append(this.sampleCount);
        a5.append(ProtectedSandApp.s("ᢡ\u0001"));
        a5.append(this.auxInfoType);
        a5.append(ProtectedSandApp.s("ᢢ\u0001"));
        return android.support.v4.media.c.a(a5, this.auxInfoTypeParameter, ProtectedSandApp.s("ᢣ\u0001"));
    }
}
