package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("\u135c");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private a defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackExtendsBox() {
        super(ProtectedSandApp.s("\u135c"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("፝"), TrackExtendsBox.class);
        v E = eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፠"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፞"));
        String s4 = ProtectedSandApp.s("።");
        ajc$tjp_0 = eVar.H(s4, E, 72);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፣"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፞")), 76);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፥"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("፦"), ProtectedSandApp.s("፧"), "", ProtectedSandApp.s("፤")), 112);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፨"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፞")), 80);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፩"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፞")), 84);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፪"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፦")), 88);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፬"), ProtectedSandApp.s("፡"), "", "", "", ProtectedSandApp.s("፫")), 92);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፭"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("፞"), ProtectedSandApp.s("፮"), "", ProtectedSandApp.s("፤")), 96);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፯"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("፞"), ProtectedSandApp.s("፰"), "", ProtectedSandApp.s("፤")), 100);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፱"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("፞"), ProtectedSandApp.s("፲"), "", ProtectedSandApp.s("፤")), 104);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("፟"), ProtectedSandApp.s("፳"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("፞"), ProtectedSandApp.s("፴"), "", ProtectedSandApp.s("፤")), 108);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = g.l(byteBuffer);
        this.defaultSampleDescriptionIndex = g.l(byteBuffer);
        this.defaultSampleDuration = g.l(byteBuffer);
        this.defaultSampleSize = g.l(byteBuffer);
        this.defaultSampleFlags = new a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.trackId);
        byteBuffer.putInt((int) this.defaultSampleDescriptionIndex);
        byteBuffer.putInt((int) this.defaultSampleDuration);
        byteBuffer.putInt((int) this.defaultSampleSize);
        this.defaultSampleFlags.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public long getDefaultSampleDescriptionIndex() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.defaultSampleDuration;
    }

    public a getDefaultSampleFlags() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Long(j4)));
        this.defaultSampleDescriptionIndex = j4;
    }

    public void setDefaultSampleDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_8, this, this, new Long(j4)));
        this.defaultSampleDuration = j4;
    }

    public void setDefaultSampleFlags(a aVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, aVar));
        this.defaultSampleFlags = aVar;
    }

    public void setDefaultSampleSize(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, new Long(j4)));
        this.defaultSampleSize = j4;
    }

    public void setTrackId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, new Long(j4)));
        this.trackId = j4;
    }
}
