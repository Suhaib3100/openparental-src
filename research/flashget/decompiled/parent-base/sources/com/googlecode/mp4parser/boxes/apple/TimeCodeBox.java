package com.googlecode.mp4parser.boxes.apple;

import androidx.collection.y0;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.c;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class TimeCodeBox extends AbstractBox implements SampleEntry, c {
    public static final String TYPE = ProtectedSandApp.s("ᆘ\u0001");
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
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(ProtectedSandApp.s("ᆘ\u0001"));
        this.rest = new byte[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᆙ\u0001"), TimeCodeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆜ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001"));
        String s4 = ProtectedSandApp.s("ᆞ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 88);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆠ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᆡ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 92);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆢ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᆣ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 137);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆤ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001")), 141);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆥ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᆦ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 145);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆨ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆧ\u0001")), 149);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆩ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆧ\u0001"), ProtectedSandApp.s("ᆪ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆬ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆫ\u0001")), 157);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆭ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆫ\u0001"), ProtectedSandApp.s("ᆮ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 161);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆰ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆯ\u0001")), 166);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆱ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆯ\u0001"), ProtectedSandApp.s("ᆲ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 170);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆰ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆳ\u0001"), ProtectedSandApp.s("ᆴ\u0001"), "", ProtectedSandApp.s("ᆯ\u0001")), 174);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆶ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆵ\u0001")), 98);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆰ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆷ\u0001"), ProtectedSandApp.s("ᆸ\u0001"), "", ProtectedSandApp.s("ᆯ\u0001")), 178);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆻ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆼ\u0001"), ProtectedSandApp.s("ᆽ\u0001"), ProtectedSandApp.s("ᆹ\u0001"), ProtectedSandApp.s("ᆺ\u0001")), 182);
        ajc$tjp_22 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᆾ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆿ\u0001"), ProtectedSandApp.s("ᇀ\u0001"), ProtectedSandApp.s("ᆹ\u0001"), ProtectedSandApp.s("ᆟ\u0001")), 186);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇁ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001")), 109);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇂ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᇃ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 113);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇄ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001")), 117);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇅ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᇆ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 121);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇇ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001")), 125);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇈ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), ProtectedSandApp.s("ᆚ\u0001"), ProtectedSandApp.s("ᇉ\u0001"), "", ProtectedSandApp.s("ᆟ\u0001")), 129);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆛ\u0001"), ProtectedSandApp.s("ᇊ\u0001"), ProtectedSandApp.s("ᆝ\u0001"), "", "", "", ProtectedSandApp.s("ᆚ\u0001")), UserData.IS91_MSG_TYPE_SHORT_MESSAGE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = g.i(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = g.l(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = g.p(byteBuffer);
        this.reserved2 = g.k(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.rest = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.coremedia.iso.boxes.c
    public <T extends b> List<T> getBoxes(Class<T> cls, boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.x(ajc$tjp_20, this, this, cls, new Boolean(z4)));
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.c
    public ByteBuffer getByteBuffer(long j4, long j5) throws IOException {
        com.googlecode.mp4parser.g.b().c(e.x(ajc$tjp_21, this, this, new Long(j4), new Long(j5)));
        return null;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        i.f(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        byteBuffer.putInt((int) this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        i.m(byteBuffer, this.numberOfFrames);
        i.h(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.rest.length + 28;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_13, this, this));
        return this.flags;
    }

    public int getFrameDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_11, this, this));
        return this.reserved2;
    }

    public byte[] getRest() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_15, this, this));
        return this.rest;
    }

    public int getTimeScale() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.timeScale;
    }

    @Override // com.coremedia.iso.boxes.c
    public void setBoxes(List<b> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_18, this, this, list));
        throw new RuntimeException(ProtectedSandApp.s("ᇋ\u0001"));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.dataReferenceIndex = i4;
    }

    public void setFlags(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_14, this, this, new Long(j4)));
        this.flags = j4;
    }

    public void setFrameDuration(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, new Integer(i4)));
        this.frameDuration = i4;
    }

    public void setNumberOfFrames(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_8, this, this, new Integer(i4)));
        this.numberOfFrames = i4;
    }

    public void setReserved1(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, new Integer(i4)));
        this.reserved1 = i4;
    }

    public void setReserved2(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_12, this, this, new Integer(i4)));
        this.reserved2 = i4;
    }

    public void setRest(byte[] bArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_16, this, this, bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_4, this, this, new Integer(i4)));
        this.timeScale = i4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᇌ\u0001"));
        a5.append(this.timeScale);
        a5.append(ProtectedSandApp.s("ᇍ\u0001"));
        a5.append(this.frameDuration);
        a5.append(ProtectedSandApp.s("ᇎ\u0001"));
        a5.append(this.numberOfFrames);
        a5.append(ProtectedSandApp.s("ᇏ\u0001"));
        a5.append(this.reserved1);
        a5.append(ProtectedSandApp.s("ᇐ\u0001"));
        a5.append(this.reserved2);
        a5.append(ProtectedSandApp.s("ᇑ\u0001"));
        return y0.a(a5, this.flags, '}');
    }

    @Override // com.coremedia.iso.boxes.c
    public void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_22, this, this, writableByteChannel));
    }

    @Override // com.coremedia.iso.boxes.c
    public List<b> getBoxes() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_17, this, this));
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.c
    public <T extends b> List<T> getBoxes(Class<T> cls) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_19, this, this, cls));
        return Collections.emptyList();
    }
}
