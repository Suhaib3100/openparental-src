package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class CompositionShiftLeastGreatestAtom extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ྚ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    static {
        ajc$preClinit();
    }

    public CompositionShiftLeastGreatestAtom() {
        super(ProtectedSandApp.s("ྚ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ྛ"), CompositionShiftLeastGreatestAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྞ"), ProtectedSandApp.s("ྟ"), "", "", "", ProtectedSandApp.s("ྜ"));
        String s4 = ProtectedSandApp.s("ྠ");
        ajc$tjp_0 = eVar.H(s4, E, 66);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྡྷ"), ProtectedSandApp.s("ྟ"), ProtectedSandApp.s("ྜ"), ProtectedSandApp.s("ྣ"), "", ProtectedSandApp.s("ྡ")), 70);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྤ"), ProtectedSandApp.s("ྟ"), "", "", "", ProtectedSandApp.s("ྜ")), 74);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྥ"), ProtectedSandApp.s("ྟ"), ProtectedSandApp.s("ྜ"), ProtectedSandApp.s("ྦ"), "", ProtectedSandApp.s("ྡ")), 78);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྦྷ"), ProtectedSandApp.s("ྟ"), "", "", "", ProtectedSandApp.s("ྜ")), 82);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྨ"), ProtectedSandApp.s("ྟ"), ProtectedSandApp.s("ྜ"), ProtectedSandApp.s("ྩ"), "", ProtectedSandApp.s("ྡ")), 86);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྪ"), ProtectedSandApp.s("ྟ"), "", "", "", ProtectedSandApp.s("ྜ")), 90);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྫ"), ProtectedSandApp.s("ྟ"), ProtectedSandApp.s("ྜ"), ProtectedSandApp.s("ྫྷ"), "", ProtectedSandApp.s("ྡ")), 94);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྭ"), ProtectedSandApp.s("ྟ"), "", "", "", ProtectedSandApp.s("ྜ")), 98);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྜྷ"), ProtectedSandApp.s("ྮ"), ProtectedSandApp.s("ྟ"), ProtectedSandApp.s("ྜ"), ProtectedSandApp.s("ྯ"), "", ProtectedSandApp.s("ྡ")), 102);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer.getInt();
        this.leastDisplayOffset = byteBuffer.getInt();
        this.greatestDisplayOffset = byteBuffer.getInt();
        this.displayStartTime = byteBuffer.getInt();
        this.displayEndTime = byteBuffer.getInt();
    }

    public int getCompositionOffsetToDisplayOffsetShift() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.compositionOffsetToDisplayOffsetShift;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer.putInt(this.leastDisplayOffset);
        byteBuffer.putInt(this.greatestDisplayOffset);
        byteBuffer.putInt(this.displayStartTime);
        byteBuffer.putInt(this.displayEndTime);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public int getDisplayEndTime() {
        g.b().c(e.v(ajc$tjp_8, this, this));
        return this.displayEndTime;
    }

    public int getDisplayStartTime() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.displayStartTime;
    }

    public int getGreatestDisplayOffset() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.greatestDisplayOffset;
    }

    public int getLeastDisplayOffset() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.leastDisplayOffset;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.compositionOffsetToDisplayOffsetShift = i4;
    }

    public void setDisplayEndTime(int i4) {
        g.b().c(e.w(ajc$tjp_9, this, this, new Integer(i4)));
        this.displayEndTime = i4;
    }

    public void setDisplayStartTime(int i4) {
        g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.displayStartTime = i4;
    }

    public void setGreatestDisplayOffset(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.greatestDisplayOffset = i4;
    }

    public void setLeastDisplayOffset(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.leastDisplayOffset = i4;
    }
}
