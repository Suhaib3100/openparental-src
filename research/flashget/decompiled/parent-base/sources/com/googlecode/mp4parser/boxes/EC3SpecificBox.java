package com.googlecode.mp4parser.boxes;

import androidx.view.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes6.dex */
public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ྩ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    int dataRate;
    List<a> entries;
    int numIndSub;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f63866a;

        /* renamed from: b, reason: collision with root package name */
        public int f63867b;

        /* renamed from: c, reason: collision with root package name */
        public int f63868c;

        /* renamed from: d, reason: collision with root package name */
        public int f63869d;

        /* renamed from: e, reason: collision with root package name */
        public int f63870e;

        /* renamed from: f, reason: collision with root package name */
        public int f63871f;

        /* renamed from: g, reason: collision with root package name */
        public int f63872g;

        /* renamed from: h, reason: collision with root package name */
        public int f63873h;

        /* renamed from: i, reason: collision with root package name */
        public int f63874i;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ຝ\u0001"));
            sb.append(this.f63866a);
            sb.append(ProtectedSandApp.s("ພ\u0001"));
            sb.append(this.f63867b);
            sb.append(ProtectedSandApp.s("ຟ\u0001"));
            sb.append(this.f63868c);
            sb.append(ProtectedSandApp.s("ຠ\u0001"));
            sb.append(this.f63869d);
            sb.append(ProtectedSandApp.s("ມ\u0001"));
            sb.append(this.f63870e);
            sb.append(ProtectedSandApp.s("ຢ\u0001"));
            sb.append(this.f63871f);
            sb.append(ProtectedSandApp.s("ຣ\u0001"));
            sb.append(this.f63872g);
            sb.append(ProtectedSandApp.s("\u0ea4\u0001"));
            sb.append(this.f63873h);
            sb.append(ProtectedSandApp.s("ລ\u0001"));
            return e.a(sb, this.f63874i, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(ProtectedSandApp.s("ྩ\u0001"));
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ྪ\u0001"), EC3SpecificBox.class);
        v E = eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྭ\u0001"), ProtectedSandApp.s("ྮ\u0001"), "", "", "", ProtectedSandApp.s("ྫ\u0001"));
        String s4 = ProtectedSandApp.s("ྯ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 25);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྱ\u0001"), ProtectedSandApp.s("ྮ\u0001"), ProtectedSandApp.s("ྲ\u0001"), ProtectedSandApp.s("ླ\u0001"), "", ProtectedSandApp.s("ྰ\u0001")), 65);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྵ\u0001"), ProtectedSandApp.s("ྮ\u0001"), "", "", "", ProtectedSandApp.s("ྴ\u0001")), 86);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྶ\u0001"), ProtectedSandApp.s("ྮ\u0001"), ProtectedSandApp.s("ྴ\u0001"), ProtectedSandApp.s("ྷ\u0001"), "", ProtectedSandApp.s("ྰ\u0001")), 90);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྸ\u0001"), ProtectedSandApp.s("ྮ\u0001"), ProtectedSandApp.s("ྐྵ\u0001"), ProtectedSandApp.s("ྺ\u0001"), "", ProtectedSandApp.s("ྰ\u0001")), 94);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("ྼ\u0001"), ProtectedSandApp.s("ྮ\u0001"), "", "", "", ProtectedSandApp.s("ྻ\u0001")), 98);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("\u0fbd\u0001"), ProtectedSandApp.s("ྮ\u0001"), ProtectedSandApp.s("ྻ\u0001"), ProtectedSandApp.s("྾\u0001"), "", ProtectedSandApp.s("ྰ\u0001")), 102);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("྿\u0001"), ProtectedSandApp.s("ྮ\u0001"), "", "", "", ProtectedSandApp.s("ྻ\u0001")), 106);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྫྷ\u0001"), ProtectedSandApp.s("࿀\u0001"), ProtectedSandApp.s("ྮ\u0001"), ProtectedSandApp.s("ྻ\u0001"), ProtectedSandApp.s("࿁\u0001"), "", ProtectedSandApp.s("ྰ\u0001")), 110);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.dataRate = cVar.c(13);
        this.numIndSub = cVar.c(3) + 1;
        for (int i4 = 0; i4 < this.numIndSub; i4++) {
            a aVar = new a();
            aVar.f63866a = cVar.c(2);
            aVar.f63867b = cVar.c(5);
            aVar.f63868c = cVar.c(5);
            aVar.f63869d = cVar.c(3);
            aVar.f63870e = cVar.c(1);
            aVar.f63871f = cVar.c(3);
            int c5 = cVar.c(4);
            aVar.f63872g = c5;
            if (c5 > 0) {
                aVar.f63873h = cVar.c(9);
            } else {
                aVar.f63874i = cVar.c(1);
            }
            this.entries.add(aVar);
        }
    }

    public void addEntry(a aVar) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_4, this, this, aVar));
        this.entries.add(aVar);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, byteBuffer));
        d dVar = new d(byteBuffer);
        dVar.a(this.dataRate, 13);
        dVar.a(this.entries.size() - 1, 3);
        for (a aVar : this.entries) {
            dVar.a(aVar.f63866a, 2);
            dVar.a(aVar.f63867b, 5);
            dVar.a(aVar.f63868c, 5);
            dVar.a(aVar.f63869d, 3);
            dVar.a(aVar.f63870e, 1);
            dVar.a(aVar.f63871f, 3);
            dVar.a(aVar.f63872g, 4);
            if (aVar.f63872g > 0) {
                dVar.a(aVar.f63873h, 9);
            } else {
                dVar.a(aVar.f63874i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        Iterator<a> it = this.entries.iterator();
        long j4 = 2;
        while (it.hasNext()) {
            j4 += it.next().f63872g > 0 ? 4L : 3L;
        }
        return j4;
    }

    public int getDataRate() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_5, this, this));
        return this.dataRate;
    }

    public List<a> getEntries() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_2, this, this));
        return this.entries;
    }

    public int getNumIndSub() {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_7, this, this));
        return this.numIndSub;
    }

    public void setDataRate(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_6, this, this, new Integer(i4)));
        this.dataRate = i4;
    }

    public void setEntries(List<a> list) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_3, this, this, list));
        this.entries = list;
    }

    public void setNumIndSub(int i4) {
        g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_8, this, this, new Integer(i4)));
        this.numIndSub = i4;
    }
}
