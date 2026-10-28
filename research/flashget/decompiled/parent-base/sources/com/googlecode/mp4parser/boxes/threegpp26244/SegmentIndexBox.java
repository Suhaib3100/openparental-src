package com.googlecode.mp4parser.boxes.threegpp26244;

import androidx.view.e;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lg.v;
import org.apache.log4j.net.SyslogAppender;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("\u13f7\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_12 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<a> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        byte f64045a;

        /* renamed from: b, reason: collision with root package name */
        int f64046b;

        /* renamed from: c, reason: collision with root package name */
        long f64047c;

        /* renamed from: d, reason: collision with root package name */
        byte f64048d;

        /* renamed from: e, reason: collision with root package name */
        byte f64049e;

        /* renamed from: f, reason: collision with root package name */
        int f64050f;

        public a() {
        }

        public byte a() {
            return this.f64045a;
        }

        public int b() {
            return this.f64046b;
        }

        public int c() {
            return this.f64050f;
        }

        public byte d() {
            return this.f64049e;
        }

        public byte e() {
            return this.f64048d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64045a == aVar.f64045a && this.f64046b == aVar.f64046b && this.f64050f == aVar.f64050f && this.f64049e == aVar.f64049e && this.f64048d == aVar.f64048d && this.f64047c == aVar.f64047c;
        }

        public long f() {
            return this.f64047c;
        }

        public void g(byte b5) {
            this.f64045a = b5;
        }

        public void h(int i4) {
            this.f64046b = i4;
        }

        public int hashCode() {
            int i4 = ((this.f64045a * com.google.common.base.c.I) + this.f64046b) * 31;
            long j4 = this.f64047c;
            return ((((((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f64048d) * 31) + this.f64049e) * 31) + this.f64050f;
        }

        public void i(int i4) {
            this.f64050f = i4;
        }

        public void j(byte b5) {
            this.f64049e = b5;
        }

        public void k(byte b5) {
            this.f64048d = b5;
        }

        public void l(long j4) {
            this.f64047c = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ᏹ\u0001"));
            sb.append((int) this.f64045a);
            sb.append(ProtectedSandApp.s("Ᏺ\u0001"));
            sb.append(this.f64046b);
            sb.append(ProtectedSandApp.s("Ᏻ\u0001"));
            sb.append(this.f64047c);
            sb.append(ProtectedSandApp.s("Ᏼ\u0001"));
            sb.append((int) this.f64048d);
            sb.append(ProtectedSandApp.s("Ᏽ\u0001"));
            sb.append((int) this.f64049e);
            sb.append(ProtectedSandApp.s("\u13f6\u0001"));
            return e.a(sb, this.f64050f, '}');
        }

        public a(int i4, int i5, long j4, boolean z4, int i6, int i7) {
            this.f64045a = (byte) i4;
            this.f64046b = i5;
            this.f64047c = j4;
            this.f64048d = z4 ? (byte) 1 : (byte) 0;
            this.f64049e = (byte) i6;
            this.f64050f = i7;
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(ProtectedSandApp.s("\u13f7\u0001"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᏸ\u0001"), SegmentIndexBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᏻ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᏹ\u0001"));
        String s4 = ProtectedSandApp.s("ᏽ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 128);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("\u13ff\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᏹ\u0001"), ProtectedSandApp.s("᐀\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), UserData.IS91_MSG_TYPE_CLI);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐂ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐁ\u0001")), SyslogAppender.LOG_LOCAL5);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐃ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᐁ\u0001"), ProtectedSandApp.s("ᐄ\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), 172);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐆ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐅ\u0001")), 298);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐈ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐇ\u0001")), SyslogAppender.LOG_LOCAL1);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐉ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᐇ\u0001"), ProtectedSandApp.s("ᐊ\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), SmsConstants.MAX_USER_DATA_BYTES);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐋ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐇ\u0001")), 144);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐌ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᐇ\u0001"), ProtectedSandApp.s("ᐍ\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), 148);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐎ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐇ\u0001")), SyslogAppender.LOG_LOCAL3);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐏ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᐇ\u0001"), ProtectedSandApp.s("ᐐ\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), 156);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐑ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), "", "", "", ProtectedSandApp.s("ᐇ\u0001")), 160);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᏺ\u0001"), ProtectedSandApp.s("ᐒ\u0001"), ProtectedSandApp.s("ᏼ\u0001"), ProtectedSandApp.s("ᐇ\u0001"), ProtectedSandApp.s("ᐓ\u0001"), "", ProtectedSandApp.s("\u13fe\u0001")), 164);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.referenceId = g.l(byteBuffer);
        this.timeScale = g.l(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = g.l(byteBuffer);
            this.firstOffset = g.l(byteBuffer);
        } else {
            this.earliestPresentationTime = g.o(byteBuffer);
            this.firstOffset = g.o(byteBuffer);
        }
        this.reserved = g.i(byteBuffer);
        int i4 = g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            a aVar = new a();
            aVar.f64045a = (byte) cVar.c(1);
            aVar.f64046b = cVar.c(31);
            aVar.f64047c = g.l(byteBuffer);
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            aVar.f64048d = (byte) cVar2.c(1);
            aVar.f64049e = (byte) cVar2.c(3);
            aVar.f64050f = cVar2.c(28);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.referenceId);
        byteBuffer.putInt((int) this.timeScale);
        if (getVersion() == 0) {
            byteBuffer.putInt((int) this.earliestPresentationTime);
            byteBuffer.putInt((int) this.firstOffset);
        } else {
            byteBuffer.putLong(this.earliestPresentationTime);
            byteBuffer.putLong(this.firstOffset);
        }
        i.f(byteBuffer, this.reserved);
        i.f(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            d dVar = new d(byteBuffer);
            dVar.a(aVar.a(), 1);
            dVar.a(aVar.b(), 31);
            byteBuffer.putInt((int) aVar.f());
            d dVar2 = new d(byteBuffer);
            dVar2.a(aVar.e(), 1);
            dVar2.a(aVar.d(), 3);
            dVar2.a(aVar.c(), 28);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 0 ? 8 : 16) + 16 + (this.entries.size() * 12);
    }

    public long getEarliestPresentationTime() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.entries;
    }

    public long getFirstOffset() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_8, this, this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.referenceId;
    }

    public int getReserved() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public long getTimeScale() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_7, this, this, new Long(j4)));
        this.earliestPresentationTime = j4;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public void setFirstOffset(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_9, this, this, new Long(j4)));
        this.firstOffset = j4;
    }

    public void setReferenceId(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, new Long(j4)));
        this.referenceId = j4;
    }

    public void setReserved(int i4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_11, this, this, new Integer(i4)));
        this.reserved = i4;
    }

    public void setTimeScale(long j4) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, new Long(j4)));
        this.timeScale = j4;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_12, this, this), ProtectedSandApp.s("ᐔ\u0001"));
        a5.append(this.entries);
        a5.append(ProtectedSandApp.s("ᐕ\u0001"));
        a5.append(this.referenceId);
        a5.append(ProtectedSandApp.s("ᐖ\u0001"));
        a5.append(this.timeScale);
        a5.append(ProtectedSandApp.s("ᐗ\u0001"));
        a5.append(this.earliestPresentationTime);
        a5.append(ProtectedSandApp.s("ᐘ\u0001"));
        a5.append(this.firstOffset);
        a5.append(ProtectedSandApp.s("ᐙ\u0001"));
        return e.a(a5, this.reserved, '}');
    }
}
