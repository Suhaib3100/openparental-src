package com.coremedia.iso.boxes;

import androidx.collection.y0;
import androidx.compose.ui.graphics.l6;
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
public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ሆ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f47595a;

        /* renamed from: b, reason: collision with root package name */
        private List<C0769a> f47596b = new ArrayList();

        /* renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a$a, reason: collision with other inner class name */
        public static class C0769a {

            /* renamed from: a, reason: collision with root package name */
            private long f47597a;

            /* renamed from: b, reason: collision with root package name */
            private int f47598b;

            /* renamed from: c, reason: collision with root package name */
            private int f47599c;

            /* renamed from: d, reason: collision with root package name */
            private long f47600d;

            public int a() {
                return this.f47599c;
            }

            public long b() {
                return this.f47600d;
            }

            public int c() {
                return this.f47598b;
            }

            public long d() {
                return this.f47597a;
            }

            public void e(int i4) {
                this.f47599c = i4;
            }

            public void f(long j4) {
                this.f47600d = j4;
            }

            public void g(int i4) {
                this.f47598b = i4;
            }

            public void h(long j4) {
                this.f47597a = j4;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᇿ"));
                sb.append(this.f47597a);
                sb.append(ProtectedSandApp.s("ሀ"));
                sb.append(this.f47598b);
                sb.append(ProtectedSandApp.s("ሁ"));
                sb.append(this.f47599c);
                sb.append(ProtectedSandApp.s("ሂ"));
                return y0.a(sb, this.f47600d, '}');
            }
        }

        public long a() {
            return this.f47595a;
        }

        public int b() {
            return this.f47596b.size();
        }

        public List<C0769a> c() {
            return this.f47596b;
        }

        public void d(long j4) {
            this.f47595a = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ሃ"));
            sb.append(this.f47595a);
            sb.append(ProtectedSandApp.s("ሄ"));
            sb.append(this.f47596b.size());
            sb.append(ProtectedSandApp.s("ህ"));
            return l6.a(sb, this.f47596b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super(ProtectedSandApp.s("ሆ"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ሇ"), SubSampleInformationBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሉ"), ProtectedSandApp.s("ሊ"), ProtectedSandApp.s("ላ"), "", "", "", ProtectedSandApp.s("ለ"));
        String s4 = ProtectedSandApp.s("ሌ");
        ajc$tjp_0 = eVar.H(s4, E, 50);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሉ"), ProtectedSandApp.s("ሎ"), ProtectedSandApp.s("ላ"), ProtectedSandApp.s("ለ"), ProtectedSandApp.s("ሏ"), "", ProtectedSandApp.s("ል")), 54);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሉ"), ProtectedSandApp.s("ሑ"), ProtectedSandApp.s("ላ"), "", "", "", ProtectedSandApp.s("ሐ")), 124);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long l4 = g.l(byteBuffer);
        for (int i4 = 0; i4 < l4; i4++) {
            a aVar = new a();
            aVar.d(g.l(byteBuffer));
            int i5 = g.i(byteBuffer);
            for (int i6 = 0; i6 < i5; i6++) {
                a.C0769a c0769a = new a.C0769a();
                c0769a.h(getVersion() == 1 ? g.l(byteBuffer) : g.i(byteBuffer));
                c0769a.g(g.p(byteBuffer));
                c0769a.e(g.p(byteBuffer));
                c0769a.f(g.l(byteBuffer));
                aVar.c().add(c0769a);
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a());
            i.f(byteBuffer, aVar.b());
            for (a.C0769a c0769a : aVar.c()) {
                if (getVersion() == 1) {
                    byteBuffer.putInt((int) c0769a.d());
                } else {
                    i.f(byteBuffer, com.googlecode.mp4parser.util.c.a(c0769a.d()));
                }
                i.m(byteBuffer, c0769a.c());
                i.m(byteBuffer, c0769a.a());
                byteBuffer.putInt((int) c0769a.b());
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long j4 = 8;
        for (a aVar : this.entries) {
            j4 += 6;
            for (int i4 = 0; i4 < aVar.c().size(); i4++) {
                j4 = j4 + (getVersion() == 1 ? 4L : 2L) + 6;
            }
        }
        return j4;
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
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ሒ"));
        a5.append(this.entries.size());
        a5.append(ProtectedSandApp.s("ሓ"));
        return l6.a(a5, this.entries, '}');
    }
}
