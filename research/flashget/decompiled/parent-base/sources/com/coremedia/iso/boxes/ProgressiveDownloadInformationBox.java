package com.coremedia.iso.boxes;

import androidx.collection.y0;
import androidx.compose.ui.graphics.l6;
import androidx.content.preferences.protobuf.n;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᅠ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f47589a;

        /* renamed from: b, reason: collision with root package name */
        long f47590b;

        public a(long j4, long j5) {
            this.f47589a = j4;
            this.f47590b = j5;
        }

        public long a() {
            return this.f47590b;
        }

        public long b() {
            return this.f47589a;
        }

        public void c(long j4) {
            this.f47590b = j4;
        }

        public void d(long j4) {
            this.f47589a = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47590b == aVar.f47590b && this.f47589a == aVar.f47589a;
        }

        public int hashCode() {
            long j4 = this.f47589a;
            int i4 = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j5 = this.f47590b;
            return i4 + ((int) ((j5 >>> 32) ^ j5));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᅞ"));
            sb.append(this.f47589a);
            sb.append(ProtectedSandApp.s("ᅟ"));
            return y0.a(sb, this.f47590b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public ProgressiveDownloadInformationBox() {
        super(ProtectedSandApp.s("ᅠ"));
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᅡ"), ProgressiveDownloadInformationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᅣ"), ProtectedSandApp.s("ᅤ"), ProtectedSandApp.s("ᅥ"), "", "", "", ProtectedSandApp.s("ᅢ"));
        String s4 = ProtectedSandApp.s("ᅦ");
        ajc$tjp_0 = eVar.H(s4, E, 38);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅣ"), ProtectedSandApp.s("ᅨ"), ProtectedSandApp.s("ᅥ"), ProtectedSandApp.s("ᅢ"), ProtectedSandApp.s("ᅩ"), "", ProtectedSandApp.s("ᅧ")), 42);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᅣ"), ProtectedSandApp.s("ᅫ"), ProtectedSandApp.s("ᅥ"), "", "", "", ProtectedSandApp.s("ᅪ")), 112);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new a(g.l(byteBuffer), g.l(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (a aVar : this.entries) {
            i.i(byteBuffer, aVar.b());
            byteBuffer.putInt((int) aVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return n.a(this.entries, 8, 4);
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        return l6.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᅬ")), this.entries, '}');
    }
}
