package com.mp4parser.iso14496.part15;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import com.mp4parser.iso14496.part15.b;
import java.nio.ByteBuffer;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class HevcConfigurationBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᣦ\u0001");
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
    private b hevcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public HevcConfigurationBox() {
        super(ProtectedSandApp.s("ᣦ\u0001"));
        this.hevcDecoderConfigurationRecord = new b();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᣧ\u0001"), HevcConfigurationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣪ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣨ\u0001"));
        String s4 = ProtectedSandApp.s("ᣬ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 38);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣮ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), ProtectedSandApp.s("ᣨ\u0001"), ProtectedSandApp.s("ᣯ\u0001"), "", ProtectedSandApp.s("ᣭ\u0001")), 42);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣱ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 90);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣲ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 94);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣳ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 98);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣴ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 102);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᣵ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 106);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18f6\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 110);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18f7\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 114);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18f8\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 118);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18f9\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 122);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18fb\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("\u18fa\u0001")), 126);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18fc\u0001"), ProtectedSandApp.s("ᣫ\u0001"), ProtectedSandApp.s("\u18fd\u0001"), ProtectedSandApp.s("\u18fe\u0001"), "", ProtectedSandApp.s("\u18fa\u0001")), 47);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("\u18ff\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤁ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᤀ\u0001")), SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤂ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 60);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤃ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 65);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤄ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 69);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤅ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("\u18fa\u0001")), 73);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤆ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᣰ\u0001")), 78);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤈ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᤇ\u0001")), 82);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᣩ\u0001"), ProtectedSandApp.s("ᤉ\u0001"), ProtectedSandApp.s("ᣫ\u0001"), "", "", "", ProtectedSandApp.s("ᤇ\u0001")), 86);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.hevcDecoderConfigurationRecord.x(byteBuffer);
    }

    public boolean equals(Object obj) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_2, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = this.hevcDecoderConfigurationRecord;
        b bVar2 = ((HevcConfigurationBox) obj).hevcDecoderConfigurationRecord;
        return bVar == null ? bVar2 == null : bVar.equals(bVar2);
    }

    public List<b.a> getArrays() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_21, this, this));
        return this.hevcDecoderConfigurationRecord.f70058w;
    }

    public int getAvgFrameRate() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_16, this, this));
        return this.hevcDecoderConfigurationRecord.f70053r;
    }

    public int getBitDepthChromaMinus8() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_15, this, this));
        return this.hevcDecoderConfigurationRecord.f70052q;
    }

    public int getBitDepthLumaMinus8() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_14, this, this));
        return this.hevcDecoderConfigurationRecord.f70050o;
    }

    public int getChromaFormat() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_13, this, this));
        return this.hevcDecoderConfigurationRecord.f70048m;
    }

    public int getConfigurationVersion() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.hevcDecoderConfigurationRecord.f70036a;
    }

    public int getConstantFrameRate() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_20, this, this));
        return this.hevcDecoderConfigurationRecord.f70054s;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        this.hevcDecoderConfigurationRecord.U(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.hevcDecoderConfigurationRecord.q();
    }

    public long getGeneral_constraint_indicator_flags() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_9, this, this));
        return this.hevcDecoderConfigurationRecord.f70041f;
    }

    public int getGeneral_level_idc() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_10, this, this));
        return this.hevcDecoderConfigurationRecord.f70042g;
    }

    public long getGeneral_profile_compatibility_flags() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_8, this, this));
        return this.hevcDecoderConfigurationRecord.f70040e;
    }

    public int getGeneral_profile_idc() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_7, this, this));
        return this.hevcDecoderConfigurationRecord.f70039d;
    }

    public int getGeneral_profile_space() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_5, this, this));
        return this.hevcDecoderConfigurationRecord.f70037b;
    }

    public b getHevcDecoderConfigurationRecord() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_18, this, this));
        return this.hevcDecoderConfigurationRecord.f70057v;
    }

    public int getMin_spatial_segmentation_idc() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_11, this, this));
        return this.hevcDecoderConfigurationRecord.f70044i;
    }

    public int getNumTemporalLayers() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_17, this, this));
        return this.hevcDecoderConfigurationRecord.f70055t;
    }

    public int getParallelismType() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_12, this, this));
        return this.hevcDecoderConfigurationRecord.f70046k;
    }

    public int hashCode() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_3, this, this));
        b bVar = this.hevcDecoderConfigurationRecord;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public boolean isGeneral_tier_flag() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return this.hevcDecoderConfigurationRecord.f70038c;
    }

    public boolean isTemporalIdNested() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_19, this, this));
        return this.hevcDecoderConfigurationRecord.f70056u;
    }

    public void setHevcDecoderConfigurationRecord(b bVar) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, bVar));
        this.hevcDecoderConfigurationRecord = bVar;
    }
}
