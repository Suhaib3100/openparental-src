package com.googlecode.mp4parser.boxes.basemediaformat;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.a;
import java.nio.ByteBuffer;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ሀ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    a avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcNalUnitStorageBox() {
        super(ProtectedSandApp.s("ሀ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ሁ\u0001"), AvcNalUnitStorageBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ሄ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሂ\u0001"));
        String s4 = ProtectedSandApp.s("ሆ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 44);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ለ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሇ\u0001")), 49);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ሊ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሉ\u0001")), 53);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ላ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሉ\u0001")), 57);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ል\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሌ\u0001")), 61);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ሎ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሌ\u0001")), 65);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ሏ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሌ\u0001")), 69);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሃ\u0001"), ProtectedSandApp.s("ሑ\u0001"), ProtectedSandApp.s("ህ\u0001"), "", "", "", ProtectedSandApp.s("ሐ\u0001")), 89);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new a(byteBuffer);
    }

    public a getAvcDecoderConfigurationRecord() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.avcDecoderConfigurationRecord.b();
    }

    public int getLengthSizeMinusOne() {
        g.b().c(e.v(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.f70023e;
    }

    public String[] getPPS() {
        g.b().c(e.v(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<String> getPictureParameterSetsAsStrings() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.avcDecoderConfigurationRecord.d();
    }

    public String[] getSPS() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.e();
    }

    public List<String> getSequenceParameterSetExtsAsStrings() {
        g.b().c(e.v(ajc$tjp_5, this, this));
        return this.avcDecoderConfigurationRecord.f();
    }

    public List<String> getSequenceParameterSetsAsStrings() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.g();
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_7, this, this), ProtectedSandApp.s("ሒ\u0001"));
        a5.append(this.avcDecoderConfigurationRecord.g());
        a5.append(ProtectedSandApp.s("ሓ\u0001"));
        a5.append(this.avcDecoderConfigurationRecord.d());
        a5.append(ProtectedSandApp.s("ሔ\u0001"));
        a5.append(this.avcDecoderConfigurationRecord.f70023e + 1);
        a5.append('}');
        return a5.toString();
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox) {
        super(ProtectedSandApp.s("ሀ\u0001"));
        this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }
}
