package com.coremedia.iso.boxes;

import androidx.collection.y0;
import androidx.compose.ui.graphics.l6;
import com.android.internal.telephony.cdma.UserData;
import com.coremedia.iso.g;
import com.coremedia.iso.h;
import com.coremedia.iso.i;
import com.coremedia.iso.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("႑");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_10 = null;
    private static final /* synthetic */ c.b ajc$tjp_11 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    private static final /* synthetic */ c.b ajc$tjp_8 = null;
    private static final /* synthetic */ c.b ajc$tjp_9 = null;
    public int baseOffsetSize;
    public int indexSize;
    public List<b> items;
    public int lengthSize;
    public int offsetSize;

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(ProtectedSandApp.s("႑"));
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("႒"), ItemLocationBox.class);
        v E = eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("႕"), ProtectedSandApp.s("႖"), "", "", "", ProtectedSandApp.s("႓"));
        String s4 = ProtectedSandApp.s("႗");
        ajc$tjp_0 = eVar.H(s4, E, 119);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("႙"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("႓"), ProtectedSandApp.s("ႚ"), "", ProtectedSandApp.s("႘")), 123);
        ajc$tjp_10 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("ႜ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("ႝ"), ProtectedSandApp.s("႞"), "", ProtectedSandApp.s("ႛ")), 160);
        ajc$tjp_11 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴀ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("Ⴁ"), ProtectedSandApp.s("Ⴂ"), "", ProtectedSandApp.s("႟")), 285);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴃ"), ProtectedSandApp.s("႖"), "", "", "", ProtectedSandApp.s("႓")), 127);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴄ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("႓"), ProtectedSandApp.s("Ⴅ"), "", ProtectedSandApp.s("႘")), UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴆ"), ProtectedSandApp.s("႖"), "", "", "", ProtectedSandApp.s("႓")), 135);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴇ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("႓"), ProtectedSandApp.s("Ⴈ"), "", ProtectedSandApp.s("႘")), 139);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴉ"), ProtectedSandApp.s("႖"), "", "", "", ProtectedSandApp.s("႓")), 143);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴊ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("႓"), ProtectedSandApp.s("Ⴋ"), "", ProtectedSandApp.s("႘")), 147);
        ajc$tjp_8 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴍ"), ProtectedSandApp.s("႖"), "", "", "", ProtectedSandApp.s("Ⴌ")), 151);
        ajc$tjp_9 = eVar.H(s4, eVar.E(ProtectedSandApp.s("႔"), ProtectedSandApp.s("Ⴎ"), ProtectedSandApp.s("႖"), ProtectedSandApp.s("Ⴌ"), ProtectedSandApp.s("Ⴏ"), "", ProtectedSandApp.s("႘")), 155);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p4 = g.p(byteBuffer);
        this.offsetSize = p4 >>> 4;
        this.lengthSize = p4 & 15;
        int p5 = g.p(byteBuffer);
        this.baseOffsetSize = p5 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = p5 & 15;
        }
        int i4 = g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            this.items.add(new b(byteBuffer));
        }
    }

    public a createExtent(long j4, long j5, long j6) {
        com.googlecode.mp4parser.g.b().c(e.y(ajc$tjp_11, this, this, new Object[]{new Long(j4), new Long(j5), new Long(j6)}));
        return new a(j4, j5, j6);
    }

    public b createItem(int i4, int i5, int i6, long j4, List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.y(ajc$tjp_10, this, this, new Object[]{new Integer(i4), new Integer(i5), new Integer(i6), new Long(j4), list}));
        return new b(i4, i5, i6, j4, list);
    }

    public int getBaseOffsetSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.m(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        if (getVersion() == 1) {
            i.m(byteBuffer, (this.baseOffsetSize << 4) | this.indexSize);
        } else {
            i.m(byteBuffer, this.baseOffsetSize << 4);
        }
        i.f(byteBuffer, this.items.size());
        Iterator<b> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        long j4 = 8;
        while (this.items.iterator().hasNext()) {
            j4 += r0.next().b();
        }
        return j4;
    }

    public int getIndexSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public List<b> getItems() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_8, this, this));
        return this.items;
    }

    public int getLengthSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.baseOffsetSize = i4;
    }

    public void setIndexSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.indexSize = i4;
    }

    public void setItems(List<b> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public void setLengthSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.lengthSize = i4;
    }

    public void setOffsetSize(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.offsetSize = i4;
    }

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public long f47579a;

        /* renamed from: b, reason: collision with root package name */
        public long f47580b;

        /* renamed from: c, reason: collision with root package name */
        public long f47581c;

        public a(long j4, long j5, long j6) {
            this.f47579a = j4;
            this.f47580b = j5;
            this.f47581c = j6;
        }

        public void a(ByteBuffer byteBuffer) {
            int i4;
            if (ItemLocationBox.this.getVersion() == 1 && (i4 = ItemLocationBox.this.indexSize) > 0) {
                j.a(this.f47581c, byteBuffer, i4);
            }
            j.a(this.f47579a, byteBuffer, ItemLocationBox.this.offsetSize);
            j.a(this.f47580b, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public int b() {
            ItemLocationBox itemLocationBox = ItemLocationBox.this;
            int i4 = itemLocationBox.indexSize;
            if (i4 <= 0) {
                i4 = 0;
            }
            return i4 + itemLocationBox.offsetSize + itemLocationBox.lengthSize;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47581c == aVar.f47581c && this.f47580b == aVar.f47580b && this.f47579a == aVar.f47579a;
        }

        public int hashCode() {
            long j4 = this.f47579a;
            long j5 = this.f47580b;
            int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f47581c;
            return i4 + ((int) ((j6 >>> 32) ^ j6));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ႉ"));
            sb.append(this.f47579a);
            sb.append(ProtectedSandApp.s("ႊ"));
            sb.append(this.f47580b);
            sb.append(ProtectedSandApp.s("ႋ"));
            return y0.a(sb, this.f47581c, '}');
        }

        public a(ByteBuffer byteBuffer) {
            int i4;
            if (ItemLocationBox.this.getVersion() == 1 && (i4 = ItemLocationBox.this.indexSize) > 0) {
                this.f47581c = h.a(byteBuffer, i4);
            }
            this.f47579a = h.a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.f47580b = h.a(byteBuffer, ItemLocationBox.this.lengthSize);
        }
    }

    a createExtent(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    b createItem(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f47583a;

        /* renamed from: b, reason: collision with root package name */
        public int f47584b;

        /* renamed from: c, reason: collision with root package name */
        public int f47585c;

        /* renamed from: d, reason: collision with root package name */
        public long f47586d;

        /* renamed from: e, reason: collision with root package name */
        public List<a> f47587e;

        public b(ByteBuffer byteBuffer) {
            this.f47587e = new LinkedList();
            this.f47583a = g.i(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.f47584b = g.i(byteBuffer) & 15;
            }
            this.f47585c = g.i(byteBuffer);
            int i4 = ItemLocationBox.this.baseOffsetSize;
            if (i4 > 0) {
                this.f47586d = h.a(byteBuffer, i4);
            } else {
                this.f47586d = 0L;
            }
            int i5 = g.i(byteBuffer);
            for (int i6 = 0; i6 < i5; i6++) {
                this.f47587e.add(ItemLocationBox.this.new a(byteBuffer));
            }
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f47583a);
            if (ItemLocationBox.this.getVersion() == 1) {
                i.f(byteBuffer, this.f47584b);
            }
            i.f(byteBuffer, this.f47585c);
            int i4 = ItemLocationBox.this.baseOffsetSize;
            if (i4 > 0) {
                j.a(this.f47586d, byteBuffer, i4);
            }
            i.f(byteBuffer, this.f47587e.size());
            Iterator<a> it = this.f47587e.iterator();
            while (it.hasNext()) {
                it.next().a(byteBuffer);
            }
        }

        public int b() {
            int i4 = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            Iterator<a> it = this.f47587e.iterator();
            while (it.hasNext()) {
                i4 += it.next().b();
            }
            return i4;
        }

        public void c(long j4) {
            this.f47586d = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f47586d != bVar.f47586d || this.f47584b != bVar.f47584b || this.f47585c != bVar.f47585c || this.f47583a != bVar.f47583a) {
                return false;
            }
            List<a> list = this.f47587e;
            List<a> list2 = bVar.f47587e;
            return list == null ? list2 == null : list.equals(list2);
        }

        public int hashCode() {
            int i4 = ((((this.f47583a * 31) + this.f47584b) * 31) + this.f47585c) * 31;
            long j4 = this.f47586d;
            int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            List<a> list = this.f47587e;
            return i5 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ႌ"));
            sb.append(this.f47586d);
            sb.append(ProtectedSandApp.s("ႍ"));
            sb.append(this.f47583a);
            sb.append(ProtectedSandApp.s("ႎ"));
            sb.append(this.f47584b);
            sb.append(ProtectedSandApp.s("ႏ"));
            sb.append(this.f47585c);
            sb.append(ProtectedSandApp.s("႐"));
            return l6.a(sb, this.f47587e, '}');
        }

        public b(int i4, int i5, int i6, long j4, List<a> list) {
            new LinkedList();
            this.f47583a = i4;
            this.f47584b = i5;
            this.f47585c = i6;
            this.f47586d = j4;
            this.f47587e = list;
        }
    }
}
