package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import androidx.content.preferences.protobuf.n;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᎎ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    List<a> entries;
    private String groupingType;
    private String groupingTypeParameter;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f64016a;

        /* renamed from: b, reason: collision with root package name */
        private int f64017b;

        public a(long j4, int i4) {
            this.f64016a = j4;
            this.f64017b = i4;
        }

        public int a() {
            return this.f64017b;
        }

        public long b() {
            return this.f64016a;
        }

        public void c(int i4) {
            this.f64017b = i4;
        }

        public void d(long j4) {
            this.f64016a = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64017b == aVar.f64017b && this.f64016a == aVar.f64016a;
        }

        public int hashCode() {
            long j4 = this.f64016a;
            return (((int) (j4 ^ (j4 >>> 32))) * 31) + this.f64017b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᎌ\u0001"));
            sb.append(this.f64016a);
            sb.append(ProtectedSandApp.s("ᎍ\u0001"));
            return androidx.view.e.a(sb, this.f64017b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(ProtectedSandApp.s("ᎎ\u0001"));
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ᎏ\u0001"), SampleToGroupBox.class);
        v E = eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("᎒\u0001"), ProtectedSandApp.s("᎓\u0001"), "", "", "", ProtectedSandApp.s("᎐\u0001"));
        String s4 = ProtectedSandApp.s("᎔\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 150);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("᎖\u0001"), ProtectedSandApp.s("᎓\u0001"), ProtectedSandApp.s("᎐\u0001"), ProtectedSandApp.s("᎗\u0001"), "", ProtectedSandApp.s("᎕\u0001")), 154);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("᎘\u0001"), ProtectedSandApp.s("᎓\u0001"), "", "", "", ProtectedSandApp.s("᎐\u0001")), 158);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("᎙\u0001"), ProtectedSandApp.s("᎓\u0001"), ProtectedSandApp.s("᎐\u0001"), ProtectedSandApp.s("\u139a\u0001"), "", ProtectedSandApp.s("᎕\u0001")), 162);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("\u139c\u0001"), ProtectedSandApp.s("᎓\u0001"), "", "", "", ProtectedSandApp.s("\u139b\u0001")), 166);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("᎑\u0001"), ProtectedSandApp.s("\u139d\u0001"), ProtectedSandApp.s("᎓\u0001"), ProtectedSandApp.s("\u139b\u0001"), ProtectedSandApp.s("\u139e\u0001"), "", ProtectedSandApp.s("᎕\u0001")), 170);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = com.coremedia.iso.g.b(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = com.coremedia.iso.g.b(byteBuffer);
        }
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        while (true) {
            long j4 = l4 - 1;
            if (l4 <= 0) {
                return;
            }
            this.entries.add(new a(com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer)), com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer))));
            l4 = j4;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        i.i(byteBuffer, this.entries.size());
        Iterator<a> it = this.entries.iterator();
        while (it.hasNext()) {
            byteBuffer.putInt((int) it.next().b());
            byteBuffer.putInt(r1.a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        List<a> list;
        int i4;
        if (getVersion() == 1) {
            list = this.entries;
            i4 = 16;
        } else {
            list = this.entries;
            i4 = 12;
        }
        return n.a(list, 8, i4);
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_4, this, this));
        return this.entries;
    }

    public String getGroupingType() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_5, this, this, list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, str));
        this.groupingTypeParameter = str;
    }
}
