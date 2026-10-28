package com.mp4parser.iso23009.part1;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("\u19cb\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_13 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    long eventDuration;

    /* renamed from: id, reason: collision with root package name */
    long f70123id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        ajc$preClinit();
    }

    public EventMessageBox() {
        super(ProtectedSandApp.s("\u19cb\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u19cc\u0001"), EventMessageBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("\u19cf\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("\u19cd\u0001"));
        String s4 = ProtectedSandApp.s("᧑\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 59);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧓\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("\u19cd\u0001"), ProtectedSandApp.s("᧔\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 63);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧖\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("᧕\u0001")), 99);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧗\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("᧕\u0001"), ProtectedSandApp.s("᧘\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 103);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧚\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("᧙\u0001")), 107);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("\u19db\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("᧙\u0001"), ProtectedSandApp.s("\u19dc\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 111);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("\u19dd\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("\u19cd\u0001")), 67);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧞\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("\u19cd\u0001"), ProtectedSandApp.s("᧟\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 71);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧠\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("᧕\u0001")), 75);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧡\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("᧕\u0001"), ProtectedSandApp.s("᧢\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 79);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧣\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("᧕\u0001")), 83);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧤\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("᧕\u0001"), ProtectedSandApp.s("᧥\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 87);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧦\u0001"), ProtectedSandApp.s("᧐\u0001"), "", "", "", ProtectedSandApp.s("᧕\u0001")), 91);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u19ce\u0001"), ProtectedSandApp.s("᧧\u0001"), ProtectedSandApp.s("᧐\u0001"), ProtectedSandApp.s("᧕\u0001"), ProtectedSandApp.s("᧨\u0001"), "", ProtectedSandApp.s("᧒\u0001")), 95);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = g.g(byteBuffer);
        this.value = g.g(byteBuffer);
        this.timescale = g.l(byteBuffer);
        this.presentationTimeDelta = g.l(byteBuffer);
        this.eventDuration = g.l(byteBuffer);
        this.f70123id = g.l(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.messageData = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.n(byteBuffer, this.schemeIdUri);
        i.n(byteBuffer, this.value);
        byteBuffer.putInt((int) this.timescale);
        byteBuffer.putInt((int) this.presentationTimeDelta);
        byteBuffer.putInt((int) this.eventDuration);
        byteBuffer.putInt((int) this.f70123id);
        byteBuffer.put(this.messageData);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return l.c(this.value) + l.c(this.schemeIdUri) + 22 + this.messageData.length;
    }

    public long getEventDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.eventDuration;
    }

    public long getId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return this.f70123id;
    }

    public byte[] getMessageData() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_12, this, this));
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.schemeIdUri;
    }

    public long getTimescale() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.timescale;
    }

    public String getValue() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.value;
    }

    public void setEventDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Long(j4)));
        this.eventDuration = j4;
    }

    public void setId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Long(j4)));
        this.f70123id = j4;
    }

    public void setMessageData(byte[] bArr) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, bArr));
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Long(j4)));
        this.presentationTimeDelta = j4;
    }

    public void setSchemeIdUri(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.schemeIdUri = str;
    }

    public void setTimescale(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Long(j4)));
        this.timescale = j4;
    }

    public void setValue(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, str));
        this.value = str;
    }
}
