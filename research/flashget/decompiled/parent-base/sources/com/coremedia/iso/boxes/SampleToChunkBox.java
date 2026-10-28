package com.coremedia.iso.boxes;

import androidx.collection.y0;
import androidx.content.preferences.protobuf.n;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᆿ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f47592a;

        /* renamed from: b, reason: collision with root package name */
        long f47593b;

        /* renamed from: c, reason: collision with root package name */
        long f47594c;

        public a(long j4, long j5, long j6) {
            this.f47592a = j4;
            this.f47593b = j5;
            this.f47594c = j6;
        }

        public long a() {
            return this.f47592a;
        }

        public long b() {
            return this.f47594c;
        }

        public long c() {
            return this.f47593b;
        }

        public void d(long j4) {
            this.f47592a = j4;
        }

        public void e(long j4) {
            this.f47594c = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47592a == aVar.f47592a && this.f47594c == aVar.f47594c && this.f47593b == aVar.f47593b;
        }

        public void f(long j4) {
            this.f47593b = j4;
        }

        public int hashCode() {
            long j4 = this.f47592a;
            long j5 = this.f47593b;
            int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f47594c;
            return i4 + ((int) ((j6 >>> 32) ^ j6));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᆼ"));
            sb.append(this.f47592a);
            sb.append(ProtectedSandApp.s("ᆽ"));
            sb.append(this.f47593b);
            sb.append(ProtectedSandApp.s("ᆾ"));
            return y0.a(sb, this.f47594c, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToChunkBox() {
        super(ProtectedSandApp.s("ᆿ"));
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇀ"), SampleToChunkBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᇂ"), ProtectedSandApp.s("ᇃ"), ProtectedSandApp.s("ᇄ"), "", "", "", ProtectedSandApp.s("ᇁ"));
        String s4 = ProtectedSandApp.s("ᇅ");
        ajc$tjp_0 = eVar.H(s4, E, 47);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇂ"), ProtectedSandApp.s("ᇇ"), ProtectedSandApp.s("ᇄ"), ProtectedSandApp.s("ᇁ"), ProtectedSandApp.s("ᇈ"), "", ProtectedSandApp.s("ᇆ")), 51);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇂ"), ProtectedSandApp.s("ᇊ"), ProtectedSandApp.s("ᇄ"), "", "", "", ProtectedSandApp.s("ᇉ")), 84);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇂ"), ProtectedSandApp.s("ᇌ"), ProtectedSandApp.s("ᇄ"), ProtectedSandApp.s("ᇍ"), ProtectedSandApp.s("ᇎ"), "", ProtectedSandApp.s("ᇋ")), 95);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.entries = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.entries.add(new a(g.l(byteBuffer), g.l(byteBuffer), g.l(byteBuffer)));
        }
    }

    public long[] blowup(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        long[] jArr = new long[i4];
        LinkedList linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        a aVar = (a) it.next();
        while (i4 > 1) {
            jArr[i4 - 1] = aVar.c();
            if (i4 == aVar.a()) {
                aVar = (a) it.next();
            }
            i4--;
        }
        jArr[0] = aVar.c();
        return jArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a());
            byteBuffer.putInt((int) aVar.c());
            byteBuffer.putInt((int) aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return n.a(this.entries, 12, 8);
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
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᇏ"));
        a5.append(this.entries.size());
        a5.append(ProtectedSandApp.s("ᇐ"));
        return a5.toString();
    }
}
