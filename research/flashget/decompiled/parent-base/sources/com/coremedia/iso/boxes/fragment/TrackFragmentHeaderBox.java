package com.coremedia.iso.boxes.fragment;

import androidx.compose.animation.l;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.apache.log4j.net.SyslogAppender;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᎃ");
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
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private a defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(ProtectedSandApp.s("ᎃ"));
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᎄ"), TrackFragmentHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("ᎇ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ"));
        String s4 = ProtectedSandApp.s("ᎉ");
        ajc$tjp_0 = eVar.H(s4, E, 126);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("ᎊ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("ᎌ"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎍ"), ProtectedSandApp.s("ᎎ"), "", ProtectedSandApp.s("ᎋ")), 171);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("ᎏ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎍ")), 180);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎐"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎍ"), ProtectedSandApp.s("᎑"), "", ProtectedSandApp.s("ᎋ")), SyslogAppender.LOG_LOCAL7);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎒"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎍ")), 191);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎓"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎍ"), ProtectedSandApp.s("᎔"), "", ProtectedSandApp.s("ᎋ")), 195);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎖"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("᎕")), 204);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎗"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("᎕"), ProtectedSandApp.s("᎘"), "", ProtectedSandApp.s("ᎋ")), 208);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("᎙"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), 217);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("\u139a"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎅ"), ProtectedSandApp.s("\u139b"), "", ProtectedSandApp.s("ᎋ")), 221);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("\u139c"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), 230);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("\u139d"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER);
        ajc$tjp_20 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("\u139e"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎅ"), ProtectedSandApp.s("\u139f"), "", ProtectedSandApp.s("ᎋ")), 234);
        ajc$tjp_21 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭱ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("Ꭰ")), 244);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭲ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), 138);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭳ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎅ")), 142);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭴ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎍ")), 146);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭵ"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎍ"), ProtectedSandApp.s("Ꭶ"), "", ProtectedSandApp.s("ᎋ")), 150);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭷ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎍ")), 154);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭸ"), ProtectedSandApp.s("ᎈ"), ProtectedSandApp.s("ᎍ"), ProtectedSandApp.s("Ꭹ"), "", ProtectedSandApp.s("ᎋ")), 158);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᎆ"), ProtectedSandApp.s("Ꭺ"), ProtectedSandApp.s("ᎈ"), "", "", "", ProtectedSandApp.s("ᎍ")), 167);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = g.o(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = g.l(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = g.l(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = g.l(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new a(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.baseDataOffset;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.trackId);
        if ((getFlags() & 1) == 1) {
            byteBuffer.putLong(getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            byteBuffer.putInt((int) getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            byteBuffer.putInt((int) getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            byteBuffer.putInt((int) getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        int flags = getFlags();
        long j4 = (flags & 1) == 1 ? 16L : 8L;
        if ((flags & 2) == 2) {
            j4 += 4;
        }
        if ((flags & 8) == 8) {
            j4 += 4;
        }
        if ((flags & 16) == 16) {
            j4 += 4;
        }
        return (flags & 32) == 32 ? j4 + 4 : j4;
    }

    public long getDefaultSampleDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_11, this, this));
        return this.defaultSampleDuration;
    }

    public a getDefaultSampleFlags() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_15, this, this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_13, this, this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_19, this, this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_17, this, this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_8, this, this, new Long(j4)));
        if (j4 == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.baseDataOffset = j4;
    }

    public void setDefaultBaseIsMoof(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_20, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 131072);
        } else {
            setFlags(getFlags() & 16646143);
        }
        this.defaultBaseIsMoof = z4;
    }

    public void setDefaultSampleDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_12, this, this, new Long(j4)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j4;
    }

    public void setDefaultSampleFlags(a aVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_16, this, this, aVar));
        if (aVar != null) {
            setFlags(getFlags() | 32);
        } else {
            setFlags(getFlags() & 16777183);
        }
        this.defaultSampleFlags = aVar;
    }

    public void setDefaultSampleSize(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_14, this, this, new Long(j4)));
        if (j4 != -1) {
            setFlags(getFlags() | 16);
        } else {
            setFlags(getFlags() & 16777199);
        }
        this.defaultSampleSize = j4;
    }

    public void setDurationIsEmpty(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_18, this, this, new Boolean(z4)));
        if (this.defaultBaseIsMoof) {
            setFlags(getFlags() | 65536);
        } else {
            setFlags(getFlags() & 16711679);
        }
        this.durationIsEmpty = z4;
    }

    public void setSampleDescriptionIndex(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, new Long(j4)));
        if (j4 == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.sampleDescriptionIndex = j4;
    }

    public void setTrackId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_6, this, this, new Long(j4)));
        this.trackId = j4;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_21, this, this), ProtectedSandApp.s("Ꭻ"));
        a5.append(this.trackId);
        a5.append(ProtectedSandApp.s("Ꭼ"));
        a5.append(this.baseDataOffset);
        a5.append(ProtectedSandApp.s("Ꭽ"));
        a5.append(this.sampleDescriptionIndex);
        a5.append(ProtectedSandApp.s("Ꭾ"));
        a5.append(this.defaultSampleDuration);
        a5.append(ProtectedSandApp.s("Ꭿ"));
        a5.append(this.defaultSampleSize);
        a5.append(ProtectedSandApp.s("Ꮀ"));
        a5.append(this.defaultSampleFlags);
        a5.append(ProtectedSandApp.s("Ꮁ"));
        a5.append(this.durationIsEmpty);
        a5.append(ProtectedSandApp.s("Ꮂ"));
        return l.a(a5, this.defaultBaseIsMoof, '}');
    }
}
