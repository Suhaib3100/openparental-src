package com.mp4parser.iso14496.part15;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class PriotityRangeBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᤊ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    int max_priorityId;
    int min_priorityId;
    int reserved1;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public PriotityRangeBox() {
        super(ProtectedSandApp.s("ᤊ\u0001"));
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᤋ\u0001"), PriotityRangeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤎ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), "", "", "", ProtectedSandApp.s("ᤌ\u0001"));
        String s4 = ProtectedSandApp.s("ᤐ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 45);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤒ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), ProtectedSandApp.s("ᤌ\u0001"), ProtectedSandApp.s("ᤓ\u0001"), "", ProtectedSandApp.s("ᤑ\u0001")), 49);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤔ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), "", "", "", ProtectedSandApp.s("ᤌ\u0001")), 53);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤕ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), ProtectedSandApp.s("ᤌ\u0001"), ProtectedSandApp.s("ᤖ\u0001"), "", ProtectedSandApp.s("ᤑ\u0001")), 57);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤗ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), "", "", "", ProtectedSandApp.s("ᤌ\u0001")), 61);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤘ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), ProtectedSandApp.s("ᤌ\u0001"), ProtectedSandApp.s("ᤙ\u0001"), "", ProtectedSandApp.s("ᤑ\u0001")), 65);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤚ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), "", "", "", ProtectedSandApp.s("ᤌ\u0001")), 69);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᤍ\u0001"), ProtectedSandApp.s("ᤛ\u0001"), ProtectedSandApp.s("ᤏ\u0001"), ProtectedSandApp.s("ᤌ\u0001"), ProtectedSandApp.s("ᤜ\u0001"), "", ProtectedSandApp.s("ᤑ\u0001")), 73);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        int p4 = g.p(byteBuffer);
        this.reserved1 = (p4 & 192) >> 6;
        this.min_priorityId = p4 & 63;
        int p5 = g.p(byteBuffer);
        this.reserved2 = (p5 & 192) >> 6;
        this.max_priorityId = p5 & 63;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.m(byteBuffer, (this.reserved1 << 6) + this.min_priorityId);
        i.m(byteBuffer, (this.reserved2 << 6) + this.max_priorityId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 2L;
    }

    public int getMax_priorityId() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.min_priorityId;
    }

    public int getReserved1() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.reserved2;
    }

    public void setMax_priorityId(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.max_priorityId = i4;
    }

    public void setMin_priorityId(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.min_priorityId = i4;
    }

    public void setReserved1(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.reserved1 = i4;
    }

    public void setReserved2(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.reserved2 = i4;
    }
}
