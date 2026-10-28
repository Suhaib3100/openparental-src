package com.mp4parser.iso14496.part15;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import lg.v;
import org.apache.log4j.net.SyslogAppender;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("\u18ad\u0001");
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
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    public a avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(ProtectedSandApp.s("\u18ad\u0001"));
        this.avcDecoderConfigurationRecord = new a();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("\u18ae\u0001"), AvcConfigurationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢱ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001"));
        String s4 = ProtectedSandApp.s("ᢳ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢴ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 48);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢶ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᢷ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 84);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢸ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᢹ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 88);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢺ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("ᢻ\u0001"), ProtectedSandApp.s("ᢼ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 92);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢽ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("ᢻ\u0001"), ProtectedSandApp.s("ᢾ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 96);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᢿ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 100);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣀ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣁ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 104);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣂ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 108);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣃ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣄ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 112);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣅ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 116);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣆ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣇ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 120);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣈ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 52);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣉ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᢻ\u0001")), 124);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣊ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("ᢻ\u0001"), ProtectedSandApp.s("ᣋ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 128);
        ajc$tjp_22 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣍ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣌ\u0001")), UserData.IS91_MSG_TYPE_CLI);
        ajc$tjp_23 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣎ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("ᣌ\u0001"), ProtectedSandApp.s("ᣍ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), SyslogAppender.LOG_LOCAL1);
        ajc$tjp_24 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣐ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣏ\u0001")), 147);
        ajc$tjp_25 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣑ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("ᣒ\u0001"), ProtectedSandApp.s("ᣓ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_26 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣕ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣔ\u0001")), 158);
        ajc$tjp_27 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣖ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣔ\u0001")), 162);
        ajc$tjp_28 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣘ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣗ\u0001")), 167);
        ajc$tjp_29 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣚ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᣙ\u0001")), 172);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣛ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 56);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣜ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("\u18af\u0001")), 60);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣝ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᢻ\u0001")), 64);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣞ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), "", "", "", ProtectedSandApp.s("ᢻ\u0001")), 68);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣟ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣠ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 72);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣡ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣢ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 76);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᢰ\u0001"), ProtectedSandApp.s("ᣣ\u0001"), ProtectedSandApp.s("ᢲ\u0001"), ProtectedSandApp.s("\u18af\u0001"), ProtectedSandApp.s("ᣤ\u0001"), "", ProtectedSandApp.s("ᢵ\u0001")), 80);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new a(byteBuffer);
    }

    public int getAvcLevelIndication() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.f70022d;
    }

    public int getAvcProfileIndication() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.f70020b;
    }

    public int getBitDepthChromaMinus8() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.f70029k;
    }

    public int getBitDepthLumaMinus8() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.f70028j;
    }

    public int getChromaFormat() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.f70027i;
    }

    public int getConfigurationVersion() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.f70019a;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.b();
    }

    public int getLengthSizeMinusOne() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.f70023e;
    }

    public String[] getPPS() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<byte[]> getPictureParameterSets() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f70025g);
    }

    public int getProfileCompatibility() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.f70021c;
    }

    public String[] getSPS() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.e();
    }

    public List<byte[]> getSequenceParameterSetExts() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.f70030l;
    }

    public List<byte[]> getSequenceParameterSets() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_5, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f70024f);
    }

    public a getavcDecoderConfigurationRecord() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.f70026h;
    }

    public void setAvcLevelIndication(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_10, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70022d = i4;
    }

    public void setAvcProfileIndication(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_8, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70020b = i4;
    }

    public void setBitDepthChromaMinus8(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_19, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70029k = i4;
    }

    public void setBitDepthLumaMinus8(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70028j = i4;
    }

    public void setChromaFormat(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_15, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70027i = i4;
    }

    public void setConfigurationVersion(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70019a = i4;
    }

    public void setHasExts(boolean z4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_23, this, this, new Boolean(z4)));
        this.avcDecoderConfigurationRecord.f70026h = z4;
    }

    public void setLengthSizeMinusOne(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70023e = i4;
    }

    public void setPictureParameterSets(List<byte[]> list) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_13, this, this, list));
        this.avcDecoderConfigurationRecord.f70025g = list;
    }

    public void setProfileCompatibility(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.avcDecoderConfigurationRecord.f70021c = i4;
    }

    public void setSequenceParameterSetExts(List<byte[]> list) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_21, this, this, list));
        this.avcDecoderConfigurationRecord.f70030l = list;
    }

    public void setSequenceParameterSets(List<byte[]> list) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_12, this, this, list));
        this.avcDecoderConfigurationRecord.f70024f = list;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_29, this, this), ProtectedSandApp.s("ᣥ\u0001"));
        a5.append(this.avcDecoderConfigurationRecord);
        a5.append('}');
        return a5.toString();
    }
}
