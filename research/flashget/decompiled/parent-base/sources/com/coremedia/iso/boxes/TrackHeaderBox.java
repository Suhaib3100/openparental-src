package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.i;
import com.googlecode.mp4parser.util.k;
import com.tencent.beacon.event.open.EventResult;
import java.nio.ByteBuffer;
import java.util.Date;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackHeaderBox extends AbstractFullBox {
    private static i LOG;
    public static final String TYPE = ProtectedSandApp.s("ቌ");
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
    private static final /* synthetic */ c.b ajc$tjp_29 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private k matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
        LOG = i.a(TrackHeaderBox.class);
    }

    public TrackHeaderBox() {
        super(ProtectedSandApp.s("ቌ"));
        this.creationTime = new Date(0L);
        this.modificationTime = new Date(0L);
        this.matrix = k.f64099j;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ቍ"), TrackHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቐ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("\u124e"));
        String s4 = ProtectedSandApp.s("ቒ");
        ajc$tjp_0 = eVar.H(s4, E, 62);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቓ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("\u124e")), 66);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቕ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቖ"), ProtectedSandApp.s("\u1257"), "", ProtectedSandApp.s("ቔ")), 145);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("\u1259"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቘ")), 173);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቚ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("\u124e"), ProtectedSandApp.s("ቛ"), "", ProtectedSandApp.s("ቔ")), EventResult.ERROR_CODE_OTHER);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቜ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("\u124e"), ProtectedSandApp.s("ቝ"), "", ProtectedSandApp.s("ቔ")), 206);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("\u125e"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("\u125f"), ProtectedSandApp.s("በ"), "", ProtectedSandApp.s("ቔ")), 214);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቡ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("\u125f"), ProtectedSandApp.s("ቢ"), "", ProtectedSandApp.s("ቔ")), 218);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ባ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቤ"), ProtectedSandApp.s("ብ"), "", ProtectedSandApp.s("ቔ")), 225);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቦ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቤ"), ProtectedSandApp.s("ቧ"), "", ProtectedSandApp.s("ቔ")), 229);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቨ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቩ"), ProtectedSandApp.s("ቪ"), "", ProtectedSandApp.s("ቔ")), 233);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቫ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቬ"), ProtectedSandApp.s("ቭ"), "", ProtectedSandApp.s("ቔ")), 237);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቮ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("\u125f")), 70);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቯ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ተ"), ProtectedSandApp.s("ቱ"), "", ProtectedSandApp.s("ቔ")), 241);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቲ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ተ"), ProtectedSandApp.s("ታ"), "", ProtectedSandApp.s("ቔ")), 245);
        ajc$tjp_22 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ት"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቴ")), 250);
        ajc$tjp_23 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቶ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቴ")), 254);
        ajc$tjp_24 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቷ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቴ")), 258);
        ajc$tjp_25 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቸ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቴ")), 262);
        ajc$tjp_26 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቹ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቴ"), ProtectedSandApp.s("ቺ"), "", ProtectedSandApp.s("ቔ")), 266);
        ajc$tjp_27 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቻ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቴ"), ProtectedSandApp.s("ቼ"), "", ProtectedSandApp.s("ቔ")), 274);
        ajc$tjp_28 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ች"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቴ"), ProtectedSandApp.s("ቾ"), "", ProtectedSandApp.s("ቔ")), 282);
        ajc$tjp_29 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ቿ"), ProtectedSandApp.s("ቑ"), ProtectedSandApp.s("ቴ"), ProtectedSandApp.s("ኀ"), "", ProtectedSandApp.s("ቔ")), 290);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኁ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("\u125f")), 74);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኂ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቤ")), 78);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኃ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቤ")), 82);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኄ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቩ")), 86);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኅ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ቬ")), 90);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኆ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ተ")), 94);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u124f"), ProtectedSandApp.s("ኇ"), ProtectedSandApp.s("ቑ"), "", "", "", ProtectedSandApp.s("ተ")), 98);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = com.googlecode.mp4parser.util.e.b(g.o(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.e.b(g.o(byteBuffer));
            this.trackId = g.l(byteBuffer);
            g.l(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = com.googlecode.mp4parser.util.e.b(g.l(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.e.b(g.l(byteBuffer));
            this.trackId = g.l(byteBuffer);
            g.l(byteBuffer);
            this.duration = byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d(ProtectedSandApp.s("ኈ"));
        }
        g.l(byteBuffer);
        g.l(byteBuffer);
        this.layer = g.i(byteBuffer);
        this.alternateGroup = g.i(byteBuffer);
        this.volume = g.e(byteBuffer);
        g.i(byteBuffer);
        this.matrix = k.a(byteBuffer);
        this.width = g.d(byteBuffer);
        this.height = g.d(byteBuffer);
    }

    public int getAlternateGroup() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.alternateGroup;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, byteBuffer));
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.creationTime));
            byteBuffer.putLong(com.googlecode.mp4parser.util.e.a(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.duration);
        } else {
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.creationTime));
            byteBuffer.putInt((int) com.googlecode.mp4parser.util.e.a(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.duration);
        }
        com.coremedia.iso.i.i(byteBuffer, 0L);
        byteBuffer.putInt((int) 0);
        com.coremedia.iso.i.f(byteBuffer, this.layer);
        com.coremedia.iso.i.f(byteBuffer, this.alternateGroup);
        com.coremedia.iso.i.c(byteBuffer, this.volume);
        com.coremedia.iso.i.f(byteBuffer, 0);
        this.matrix.c(byteBuffer);
        com.coremedia.iso.i.b(byteBuffer, this.width);
        com.coremedia.iso.i.b(byteBuffer, this.height);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    public Date getCreationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.duration;
    }

    public double getHeight() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return this.height;
    }

    public int getLayer() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.layer;
    }

    public k getMatrix() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTrackId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.trackId;
    }

    public float getVolume() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.volume;
    }

    public double getWidth() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.width;
    }

    public boolean isEnabled() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_22, this, this));
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_23, this, this));
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_25, this, this));
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_24, this, this));
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_17, this, this, new Integer(i4)));
        this.alternateGroup = i4;
    }

    public void setCreationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_12, this, this, date));
        this.creationTime = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_15, this, this, new Long(j4)));
        this.duration = j4;
        if (j4 >= 4294967296L) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_26, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & (-2));
        }
    }

    public void setHeight(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_21, this, this, new Double(d5)));
        this.height = d5;
    }

    public void setInMovie(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_27, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & (-3));
        }
    }

    public void setInPoster(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_29, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & (-9));
        }
    }

    public void setInPreview(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_28, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & (-5));
        }
    }

    public void setLayer(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_16, this, this, new Integer(i4)));
        this.layer = i4;
    }

    public void setMatrix(k kVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_19, this, this, kVar));
        this.matrix = kVar;
    }

    public void setModificationTime(Date date) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, date));
        this.modificationTime = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setTrackId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_14, this, this, new Long(j4)));
        this.trackId = j4;
    }

    public void setVolume(float f4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_18, this, this, new Float(f4)));
        this.volume = f4;
    }

    public void setWidth(double d5) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_20, this, this, new Double(d5)));
        this.width = d5;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_11, this, this), ProtectedSandApp.s("\u1289"));
        a5.append(getCreationTime());
        a5.append(ProtectedSandApp.s("ኊ"));
        a5.append(getModificationTime());
        a5.append(ProtectedSandApp.s("ኋ"));
        a5.append(getTrackId());
        a5.append(ProtectedSandApp.s("ኌ"));
        a5.append(getDuration());
        a5.append(ProtectedSandApp.s("ኍ"));
        a5.append(getLayer());
        a5.append(ProtectedSandApp.s("\u128e"));
        a5.append(getAlternateGroup());
        a5.append(ProtectedSandApp.s("\u128f"));
        a5.append(getVolume());
        a5.append(ProtectedSandApp.s("ነ"));
        a5.append(this.matrix);
        a5.append(ProtectedSandApp.s("ኑ"));
        a5.append(getWidth());
        a5.append(ProtectedSandApp.s("ኒ"));
        a5.append(getHeight());
        a5.append(ProtectedSandApp.s("ና"));
        return a5.toString();
    }
}
