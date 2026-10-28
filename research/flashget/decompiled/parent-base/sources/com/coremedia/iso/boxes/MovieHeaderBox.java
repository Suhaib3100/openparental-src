package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.i;
import com.googlecode.mp4parser.util.k;
import java.nio.ByteBuffer;
import java.util.Date;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class MovieHeaderBox extends AbstractFullBox {
    private static i LOG;
    public static final String TYPE = ProtectedSandApp.s("ც");
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
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private k matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
        ajc$preClinit();
        LOG = i.a(MovieHeaderBox.class);
    }

    public MovieHeaderBox() {
        super(ProtectedSandApp.s("ც"));
        this.rate = 1.0d;
        this.volume = 1.0f;
        this.matrix = k.f64099j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ძ"), MovieHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ხ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("წ"));
        String s4 = ProtectedSandApp.s("ჰ");
        ajc$tjp_0 = eVar.H(s4, E, 66);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჱ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("წ")), 70);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჳ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("წ"), ProtectedSandApp.s("ჴ"), "", ProtectedSandApp.s("ჲ")), 212);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჵ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ჶ"), ProtectedSandApp.s("ჷ"), "", ProtectedSandApp.s("ჲ")), 220);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჸ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ჶ"), ProtectedSandApp.s("ჹ"), "", ProtectedSandApp.s("ჲ")), 224);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჺ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("჻"), ProtectedSandApp.s("ჼ"), "", ProtectedSandApp.s("ჲ")), 231);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ჽ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ჾ"), ProtectedSandApp.s("ჿ"), "", ProtectedSandApp.s("ჲ")), 235);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄀ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄁ"), ProtectedSandApp.s("ᄂ"), "", ProtectedSandApp.s("ჲ")), 239);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄃ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ჶ"), ProtectedSandApp.s("ᄄ"), "", ProtectedSandApp.s("ჲ")), 243);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄆ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 247);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄇ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄈ"), "", ProtectedSandApp.s("ჲ")), 251);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄉ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 255);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄊ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ჶ")), 74);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄋ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄌ"), "", ProtectedSandApp.s("ჲ")), 259);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄍ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 263);
        ajc$tjp_22 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄎ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄏ"), "", ProtectedSandApp.s("ჲ")), 267);
        ajc$tjp_23 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄐ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 271);
        ajc$tjp_24 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄑ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄒ"), "", ProtectedSandApp.s("ჲ")), 275);
        ajc$tjp_25 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄓ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 279);
        ajc$tjp_26 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄔ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄕ"), "", ProtectedSandApp.s("ჲ")), 283);
        ajc$tjp_27 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄖ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄅ")), 287);
        ajc$tjp_28 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄗ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("ᄅ"), ProtectedSandApp.s("ᄘ"), "", ProtectedSandApp.s("ჲ")), 291);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄙ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ჶ")), 78);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄚ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("჻")), 82);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄛ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ჾ")), 86);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄜ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄁ")), 90);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄝ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ჶ")), 94);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄟ"), ProtectedSandApp.s("ჯ"), "", "", "", ProtectedSandApp.s("ᄞ")), 148);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ჭ"), ProtectedSandApp.s("ᄠ"), ProtectedSandApp.s("ჯ"), ProtectedSandApp.s("წ"), ProtectedSandApp.s("ᄡ"), "", ProtectedSandApp.s("ჲ")), 204);
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
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d(ProtectedSandApp.s("ᄢ"));
        }
        this.rate = g.d(byteBuffer);
        this.volume = g.e(byteBuffer);
        g.i(byteBuffer);
        g.l(byteBuffer);
        g.l(byteBuffer);
        this.matrix = k.a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = g.l(byteBuffer);
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
        com.coremedia.iso.i.b(byteBuffer, this.rate);
        com.coremedia.iso.i.c(byteBuffer, this.volume);
        com.coremedia.iso.i.f(byteBuffer, 0);
        int i4 = (int) 0;
        byteBuffer.putInt(i4);
        byteBuffer.putInt(i4);
        this.matrix.c(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        byteBuffer.putInt((int) this.nextTrackId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public Date getCreationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_27, this, this));
        return this.currentTime;
    }

    public long getDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.duration;
    }

    public k getMatrix() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_21, this, this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_19, this, this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_17, this, this));
        return this.previewTime;
    }

    public double getRate() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.rate;
    }

    public int getSelectionDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_25, this, this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_23, this, this));
        return this.selectionTime;
    }

    public long getTimescale() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public float getVolume() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, date));
        this.creationTime = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_28, this, this, new Integer(i4)));
        this.currentTime = i4;
    }

    public void setDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_12, this, this, new Long(j4)));
        this.duration = j4;
        if (j4 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(k kVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_15, this, this, kVar));
        this.matrix = kVar;
    }

    public void setModificationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, date));
        this.modificationTime = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_16, this, this, new Long(j4)));
        this.nextTrackId = j4;
    }

    public void setPosterTime(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_22, this, this, new Integer(i4)));
        this.posterTime = i4;
    }

    public void setPreviewDuration(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_20, this, this, new Integer(i4)));
        this.previewDuration = i4;
    }

    public void setPreviewTime(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_18, this, this, new Integer(i4)));
        this.previewTime = i4;
    }

    public void setRate(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, new Double(d5)));
        this.rate = d5;
    }

    public void setSelectionDuration(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_26, this, this, new Integer(i4)));
        this.selectionDuration = i4;
    }

    public void setSelectionTime(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_24, this, this, new Integer(i4)));
        this.selectionTime = i4;
    }

    public void setTimescale(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Long(j4)));
        this.timescale = j4;
    }

    public void setVolume(float f4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_14, this, this, new Float(f4)));
        this.volume = f4;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_8, this, this), ProtectedSandApp.s("ᄣ"));
        a5.append(getCreationTime());
        a5.append(ProtectedSandApp.s("ᄤ"));
        a5.append(getModificationTime());
        a5.append(ProtectedSandApp.s("ᄥ"));
        a5.append(getTimescale());
        a5.append(ProtectedSandApp.s("ᄦ"));
        a5.append(getDuration());
        a5.append(ProtectedSandApp.s("ᄧ"));
        a5.append(getRate());
        a5.append(ProtectedSandApp.s("ᄨ"));
        a5.append(getVolume());
        a5.append(ProtectedSandApp.s("ᄩ"));
        a5.append(this.matrix);
        a5.append(ProtectedSandApp.s("ᄪ"));
        a5.append(getNextTrackId());
        a5.append(ProtectedSandApp.s("ᄫ"));
        return a5.toString();
    }
}
