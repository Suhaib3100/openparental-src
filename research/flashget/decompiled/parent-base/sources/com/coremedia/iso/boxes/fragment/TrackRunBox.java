package com.coremedia.iso.boxes.fragment;

import androidx.collection.y0;
import androidx.constraintlayout.core.motion.utils.w;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("Ꮪ");
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
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    private int dataOffset;
    private List<a> entries;
    private com.coremedia.iso.boxes.fragment.a firstSampleFlags;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f47609a;

        /* renamed from: b, reason: collision with root package name */
        private long f47610b;

        /* renamed from: c, reason: collision with root package name */
        private com.coremedia.iso.boxes.fragment.a f47611c;

        /* renamed from: d, reason: collision with root package name */
        private long f47612d;

        public a() {
        }

        public long i() {
            return this.f47612d;
        }

        public long j() {
            return this.f47609a;
        }

        public com.coremedia.iso.boxes.fragment.a k() {
            return this.f47611c;
        }

        public long l() {
            return this.f47610b;
        }

        public void m(int i4) {
            this.f47612d = i4;
        }

        public void n(long j4) {
            this.f47609a = j4;
        }

        public void o(com.coremedia.iso.boxes.fragment.a aVar) {
            this.f47611c = aVar;
        }

        public void p(long j4) {
            this.f47610b = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꮦ"));
            sb.append(this.f47609a);
            sb.append(ProtectedSandApp.s("Ꮧ"));
            sb.append(this.f47610b);
            sb.append(ProtectedSandApp.s("Ꮨ"));
            sb.append(this.f47611c);
            sb.append(ProtectedSandApp.s("Ꮩ"));
            return y0.a(sb, this.f47612d, '}');
        }

        public a(long j4, long j5, com.coremedia.iso.boxes.fragment.a aVar, int i4) {
            this.f47609a = j4;
            this.f47610b = j5;
            this.f47611c = aVar;
            this.f47612d = i4;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(ProtectedSandApp.s("Ꮪ"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮫ"), TrackRunBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮮ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮬ"));
        String s4 = ProtectedSandApp.s("Ꮰ");
        ajc$tjp_0 = eVar.H(s4, E, 57);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮲ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮳ"), ProtectedSandApp.s("Ꮴ"), "", ProtectedSandApp.s("Ꮱ")), 120);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮵ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮶ"), ProtectedSandApp.s("Ꮷ"), "", ProtectedSandApp.s("Ꮱ")), 267);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮸ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮶ"), ProtectedSandApp.s("Ꮷ"), "", ProtectedSandApp.s("Ꮱ")), 275);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮹ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮶ"), ProtectedSandApp.s("Ꮷ"), "", ProtectedSandApp.s("Ꮱ")), 283);
        ajc$tjp_13 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮺ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮶ"), ProtectedSandApp.s("Ꮷ"), "", ProtectedSandApp.s("Ꮱ")), 292);
        ajc$tjp_14 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮻ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮶ"), ProtectedSandApp.s("Ꮷ"), "", ProtectedSandApp.s("Ꮱ")), 300);
        ajc$tjp_15 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮼ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮳ")), 309);
        ajc$tjp_16 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮾ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮽ")), 313);
        ajc$tjp_17 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ꮿ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮽ"), ProtectedSandApp.s("Ᏸ"), "", ProtectedSandApp.s("Ꮱ")), w.a.f22420r);
        ajc$tjp_18 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ᏺ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ᏹ")), 327);
        ajc$tjp_19 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("Ᏻ"), ProtectedSandApp.s("Ꮯ"), ProtectedSandApp.s("Ꮬ"), ProtectedSandApp.s("Ᏼ"), "", ProtectedSandApp.s("Ꮱ")), 342);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("\u13f6"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ᏽ")), 129);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏸ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("\u13f7")), 238);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏹ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 242);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏺ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 246);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏻ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 251);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏼ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 255);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("ᏽ"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 259);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮭ"), ProtectedSandApp.s("\u13fe"), ProtectedSandApp.s("Ꮯ"), "", "", "", ProtectedSandApp.s("Ꮶ")), 263);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long l4 = g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new com.coremedia.iso.boxes.fragment.a(byteBuffer);
        }
        for (int i4 = 0; i4 < l4; i4++) {
            a aVar = new a();
            if ((getFlags() & 256) == 256) {
                aVar.f47609a = g.l(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                aVar.f47610b = g.l(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                aVar.f47611c = new com.coremedia.iso.boxes.fragment.a(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                aVar.f47612d = byteBuffer.getInt();
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            byteBuffer.putInt(this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.a(byteBuffer);
        }
        for (a aVar : this.entries) {
            if ((flags & 256) == 256) {
                byteBuffer.putInt((int) aVar.f47609a);
            }
            if ((flags & 512) == 512) {
                byteBuffer.putInt((int) aVar.f47610b);
            }
            if ((flags & 1024) == 1024) {
                aVar.f47611c.a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    byteBuffer.putInt((int) aVar.f47612d);
                } else {
                    byteBuffer.putInt((int) aVar.f47612d);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        int flags = getFlags();
        long j4 = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j4 += 4;
        }
        long j5 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j5 += 4;
        }
        if ((flags & 1024) == 1024) {
            j5 += 4;
        }
        if ((flags & 2048) == 2048) {
            j5 += 4;
        }
        return (j5 * this.entries.size()) + j4;
    }

    public int getDataOffset() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.entries;
    }

    public com.coremedia.iso.boxes.fragment.a getFirstSampleFlags() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i4 = 0; i4 < size; i4++) {
            jArr[i4] = this.entries.get(i4).i();
        }
        return jArr;
    }

    public long getSampleCount() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public boolean isSampleSizePresent() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        if (i4 == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i4;
    }

    public void setDataOffsetPresent(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_10, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_19, this, this, list));
        this.entries = list;
    }

    public void setFirstSampleFlags(com.coremedia.iso.boxes.fragment.a aVar) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_17, this, this, aVar));
        if (aVar == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = aVar;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_14, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_12, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_13, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, new Boolean(z4)));
        if (z4) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_18, this, this), ProtectedSandApp.s("\u13ff"));
        a5.append(this.entries.size());
        a5.append(ProtectedSandApp.s("᐀"));
        a5.append(this.dataOffset);
        a5.append(ProtectedSandApp.s("ᐁ"));
        a5.append(isDataOffsetPresent());
        a5.append(ProtectedSandApp.s("ᐂ"));
        a5.append(isSampleSizePresent());
        a5.append(ProtectedSandApp.s("ᐃ"));
        a5.append(isSampleDurationPresent());
        a5.append(ProtectedSandApp.s("ᐄ"));
        a5.append(isSampleFlagsPresent());
        a5.append(ProtectedSandApp.s("ᐅ"));
        a5.append(isSampleCompositionTimeOffsetPresent());
        a5.append(ProtectedSandApp.s("ᐆ"));
        a5.append(this.firstSampleFlags);
        a5.append('}');
        return a5.toString();
    }
}
