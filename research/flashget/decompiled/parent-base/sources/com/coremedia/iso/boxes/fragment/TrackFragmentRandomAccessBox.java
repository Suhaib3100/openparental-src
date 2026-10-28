package com.coremedia.iso.boxes.fragment;

import androidx.collection.y0;
import androidx.compose.ui.graphics.l6;
import com.android.internal.telephony.SmsConstants;
import com.coremedia.iso.g;
import com.coremedia.iso.h;
import com.coremedia.iso.i;
import com.coremedia.iso.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("Ꮈ");
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
    private List<a> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f47604a;

        /* renamed from: b, reason: collision with root package name */
        private long f47605b;

        /* renamed from: c, reason: collision with root package name */
        private long f47606c;

        /* renamed from: d, reason: collision with root package name */
        private long f47607d;

        /* renamed from: e, reason: collision with root package name */
        private long f47608e;

        public a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47605b == aVar.f47605b && this.f47608e == aVar.f47608e && this.f47604a == aVar.f47604a && this.f47606c == aVar.f47606c && this.f47607d == aVar.f47607d;
        }

        public int hashCode() {
            long j4 = this.f47604a;
            long j5 = this.f47605b;
            int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f47606c;
            int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.f47607d;
            int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j10 = this.f47608e;
            return i6 + ((int) ((j10 >>> 32) ^ j10));
        }

        public long k() {
            return this.f47605b;
        }

        public long l() {
            return this.f47608e;
        }

        public long m() {
            return this.f47604a;
        }

        public long n() {
            return this.f47606c;
        }

        public long o() {
            return this.f47607d;
        }

        public void p(long j4) {
            this.f47605b = j4;
        }

        public void q(long j4) {
            this.f47608e = j4;
        }

        public void r(long j4) {
            this.f47604a = j4;
        }

        public void s(long j4) {
            this.f47606c = j4;
        }

        public void t(long j4) {
            this.f47607d = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꮃ"));
            sb.append(this.f47604a);
            sb.append(ProtectedSandApp.s("Ꮄ"));
            sb.append(this.f47605b);
            sb.append(ProtectedSandApp.s("Ꮅ"));
            sb.append(this.f47606c);
            sb.append(ProtectedSandApp.s("Ꮆ"));
            sb.append(this.f47607d);
            sb.append(ProtectedSandApp.s("Ꮇ"));
            return y0.a(sb, this.f47608e, '}');
        }

        public a(long j4, long j5, long j6, long j7, long j10) {
            this.f47605b = j5;
            this.f47608e = j10;
            this.f47604a = j4;
            this.f47606c = j6;
            this.f47607d = j7;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(ProtectedSandApp.s("Ꮈ"));
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮉ"), TrackFragmentRandomAccessBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮌ"), ProtectedSandApp.s("Ꮍ"), ProtectedSandApp.s("Ꮎ"), ProtectedSandApp.s("Ꮏ"), "", ProtectedSandApp.s("Ꮊ"));
        String s4 = ProtectedSandApp.s("Ꮐ");
        ajc$tjp_0 = eVar.H(s4, E, 145);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮑ"), ProtectedSandApp.s("Ꮍ"), ProtectedSandApp.s("Ꮒ"), ProtectedSandApp.s("Ꮓ"), "", ProtectedSandApp.s("Ꮊ")), 149);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮕ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮔ")), 185);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮖ"), ProtectedSandApp.s("Ꮍ"), ProtectedSandApp.s("Ꮔ"), ProtectedSandApp.s("Ꮗ"), "", ProtectedSandApp.s("Ꮊ")), 189);
        ajc$tjp_12 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮙ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮘ")), 290);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮚ"), ProtectedSandApp.s("Ꮍ"), ProtectedSandApp.s("Ꮒ"), ProtectedSandApp.s("Ꮛ"), "", ProtectedSandApp.s("Ꮊ")), SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮜ"), ProtectedSandApp.s("Ꮍ"), ProtectedSandApp.s("Ꮒ"), ProtectedSandApp.s("Ꮝ"), "", ProtectedSandApp.s("Ꮊ")), 157);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮞ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮎ")), 161);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮟ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮒ")), 165);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮠ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮒ")), 169);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮡ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮒ")), 173);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮢ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮒ")), 177);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮋ"), ProtectedSandApp.s("Ꮣ"), ProtectedSandApp.s("Ꮍ"), "", "", "", ProtectedSandApp.s("Ꮎ")), 181);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = g.l(byteBuffer);
        long l4 = g.l(byteBuffer);
        this.reserved = (int) (l4 >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & l4)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & l4)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (l4 & 3)) + 1;
        long l5 = g.l(byteBuffer);
        this.entries = new ArrayList();
        for (int i4 = 0; i4 < l5; i4++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.f47604a = g.o(byteBuffer);
                aVar.f47605b = g.o(byteBuffer);
            } else {
                aVar.f47604a = g.l(byteBuffer);
                aVar.f47605b = g.l(byteBuffer);
            }
            aVar.f47606c = h.a(byteBuffer, this.lengthSizeOfTrafNum);
            aVar.f47607d = h.a(byteBuffer, this.lengthSizeOfTrunNum);
            aVar.f47608e = h.a(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.trackId);
        byteBuffer.putInt((int) ((this.reserved << 6) | (((this.lengthSizeOfTrafNum - 1) & 3) << 4) | (((this.lengthSizeOfTrunNum - 1) & 3) << 2) | ((this.lengthSizeOfSampleNum - 1) & 3)));
        byteBuffer.putInt(this.entries.size());
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.f47604a);
                byteBuffer.putLong(aVar.f47605b);
            } else {
                byteBuffer.putInt((int) aVar.f47604a);
                byteBuffer.putInt((int) aVar.f47605b);
            }
            j.a(aVar.f47606c, byteBuffer, this.lengthSizeOfTrafNum);
            j.a(aVar.f47607d, byteBuffer, this.lengthSizeOfTrunNum);
            j.a(aVar.f47608e, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 16 + (getVersion() == 1 ? this.entries.size() * 16 : this.entries.size() * 8) + (this.entries.size() * this.lengthSizeOfTrafNum) + (this.entries.size() * this.lengthSizeOfTrunNum) + (this.entries.size() * this.lengthSizeOfSampleNum);
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_9, this, this));
        return this.entries.size();
    }

    public int getReserved() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_5, this, this));
        return this.reserved;
    }

    public long getTrackId() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.lengthSizeOfSampleNum = i4;
    }

    public void setLengthSizeOfTrafNum(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.lengthSizeOfTrafNum = i4;
    }

    public void setLengthSizeOfTrunNum(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, new Integer(i4)));
        this.lengthSizeOfTrunNum = i4;
    }

    public void setTrackId(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_0, this, this, new Long(j4)));
        this.trackId = j4;
    }

    public String toString() {
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_12, this, this), ProtectedSandApp.s("Ꮤ"));
        a5.append(this.trackId);
        a5.append(ProtectedSandApp.s("Ꮥ"));
        return l6.a(a5, this.entries, '}');
    }
}
