package com.mp4parser.iso14496.part15;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class TierInfoBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᤶ\u0001");
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
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(ProtectedSandApp.s("ᤶ\u0001"));
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᤷ\u0001"), TierInfoBox.class);
        v E = eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᤺\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001"));
        String s4 = ProtectedSandApp.s("\u193c\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 69);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("\u193e\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("\u193f\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 73);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥀\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 109);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("\u1941\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("\u1942\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 113);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("\u1943\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 117);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥄\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("᥅\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 121);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥆\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 125);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥇\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("᥈\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 129);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥉\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), UserData.IS91_MSG_TYPE_SHORT_MESSAGE);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥊\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("᥋\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 137);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥌\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 141);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥍\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("᥎\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 145);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("᥏\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 77);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥐ\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 149);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥑ\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("ᥒ\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥓ\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("ᥔ\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 81);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥕ\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 85);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥖ\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("ᥗ\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 89);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥘ\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 93);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥙ\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("ᥚ\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 97);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥛ\u0001"), ProtectedSandApp.s("᤻\u0001"), "", "", "", ProtectedSandApp.s("ᤸ\u0001")), 101);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᤹\u0001"), ProtectedSandApp.s("ᥜ\u0001"), ProtectedSandApp.s("᤻\u0001"), ProtectedSandApp.s("ᤸ\u0001"), ProtectedSandApp.s("ᥝ\u0001"), "", ProtectedSandApp.s("\u193d\u0001")), 105);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = g.i(byteBuffer);
        this.profileIndication = g.p(byteBuffer);
        this.profile_compatibility = g.p(byteBuffer);
        this.levelIndication = g.p(byteBuffer);
        this.reserved1 = g.p(byteBuffer);
        this.visualWidth = g.i(byteBuffer);
        this.visualHeight = g.i(byteBuffer);
        int p4 = g.p(byteBuffer);
        this.discardable = (p4 & 192) >> 6;
        this.constantFrameRate = (p4 & 48) >> 4;
        this.reserved2 = p4 & 15;
        this.frameRate = g.i(byteBuffer);
    }

    public int getConstantFrameRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.f(byteBuffer, this.tierID);
        i.m(byteBuffer, this.profileIndication);
        i.m(byteBuffer, this.profile_compatibility);
        i.m(byteBuffer, this.levelIndication);
        i.m(byteBuffer, this.reserved1);
        i.f(byteBuffer, this.visualWidth);
        i.f(byteBuffer, this.visualHeight);
        i.m(byteBuffer, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        i.f(byteBuffer, this.frameRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public int getFrameRate() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public int getTierID() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public int getVisualHeight() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.constantFrameRate = i4;
    }

    public void setDiscardable(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_15, this, this, new Integer(i4)));
        this.discardable = i4;
    }

    public void setFrameRate(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_21, this, this, new Integer(i4)));
        this.frameRate = i4;
    }

    public void setLevelIndication(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.levelIndication = i4;
    }

    public void setProfileIndication(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.profileIndication = i4;
    }

    public void setProfile_compatibility(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.profile_compatibility = i4;
    }

    public void setReserved1(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.reserved1 = i4;
    }

    public void setReserved2(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_19, this, this, new Integer(i4)));
        this.reserved2 = i4;
    }

    public void setTierID(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.tierID = i4;
    }

    public void setVisualHeight(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_13, this, this, new Integer(i4)));
        this.visualHeight = i4;
    }

    public void setVisualWidth(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.visualWidth = i4;
    }
}
