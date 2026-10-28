package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.i;
import java.nio.ByteBuffer;
import java.util.Date;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class MediaHeaderBox extends AbstractFullBox {
    private static i LOG;
    public static final String TYPE = ProtectedSandApp.s("Ⴥ");
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
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    static {
        ajc$preClinit();
        LOG = i.a(MediaHeaderBox.class);
    }

    public MediaHeaderBox() {
        super(ProtectedSandApp.s("Ⴥ"));
        this.creationTime = new Date();
        this.modificationTime = new Date();
        this.language = ProtectedSandApp.s("\u10c6");
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ⴧ"), MediaHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("\u10ca"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("\u10c8"));
        String s4 = ProtectedSandApp.s("\u10cc");
        ajc$tjp_0 = eVar.H(s4, E, 48);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("Ⴭ"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("\u10c8")), 52);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("\u10cf"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("\u10ce")), 125);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("ბ"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("ა")), 56);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("გ"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("ა")), 60);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("დ"), ProtectedSandApp.s("\u10cb"), "", "", "", ProtectedSandApp.s("\u10ce")), 64);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("ვ"), ProtectedSandApp.s("\u10cb"), ProtectedSandApp.s("\u10c8"), ProtectedSandApp.s("ზ"), "", ProtectedSandApp.s("ე")), 81);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("თ"), ProtectedSandApp.s("\u10cb"), ProtectedSandApp.s("\u10c8"), ProtectedSandApp.s("ი"), "", ProtectedSandApp.s("ე")), 85);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("კ"), ProtectedSandApp.s("\u10cb"), ProtectedSandApp.s("ა"), ProtectedSandApp.s("ლ"), "", ProtectedSandApp.s("ე")), 89);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("მ"), ProtectedSandApp.s("\u10cb"), ProtectedSandApp.s("ა"), ProtectedSandApp.s("ნ"), "", ProtectedSandApp.s("ე")), 93);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u10c9"), ProtectedSandApp.s("ო"), ProtectedSandApp.s("\u10cb"), ProtectedSandApp.s("\u10ce"), ProtectedSandApp.s("პ"), "", ProtectedSandApp.s("ე")), 97);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = com.googlecode.mp4parser.util.e.b(g.o(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.e.b(g.o(byteBuffer));
            this.timescale = g.l(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = com.googlecode.mp4parser.util.e.b(g.l(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.e.b(g.l(byteBuffer));
            this.timescale = g.l(byteBuffer);
            this.duration = g.l(byteBuffer);
        }
        if (this.duration < -1) {
            LOG.d(ProtectedSandApp.s("ჟ"));
        }
        this.language = g.f(byteBuffer);
        g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.creationTime));
            byteBuffer.putLong(com.googlecode.mp4parser.util.e.a(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putLong(this.duration);
        } else {
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.creationTime));
            byteBuffer.putInt((int) com.googlecode.mp4parser.util.e.a(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putInt((int) this.duration);
        }
        com.coremedia.iso.i.d(byteBuffer, this.language);
        com.coremedia.iso.i.f(byteBuffer, 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 4;
    }

    public Date getCreationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.duration;
    }

    public String getLanguage() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.language;
    }

    public Date getModificationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTimescale() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, date));
        this.creationTime = date;
    }

    public void setDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_8, this, this, new Long(j4)));
        this.duration = j4;
    }

    public void setLanguage(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, str));
        this.language = str;
    }

    public void setModificationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, date));
        this.modificationTime = date;
    }

    public void setTimescale(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Long(j4)));
        this.timescale = j4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_10, this, this), ProtectedSandApp.s("რ"));
        a5.append(getCreationTime());
        a5.append(ProtectedSandApp.s("ს"));
        a5.append(getModificationTime());
        a5.append(ProtectedSandApp.s("ტ"));
        a5.append(getTimescale());
        a5.append(ProtectedSandApp.s("უ"));
        a5.append(getDuration());
        a5.append(ProtectedSandApp.s("ფ"));
        a5.append(getLanguage());
        a5.append(ProtectedSandApp.s("ქ"));
        return a5.toString();
    }
}
