package com.coremedia.iso.boxes;

import androidx.compose.ui.graphics.l6;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
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
public class EditListBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("\u0ff8");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private List<a> entries;

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(ProtectedSandApp.s("\u0ff8"));
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u0ff9"), EditListBox.class);
        v E = eVar.E(ProtectedSandApp.s("\u0ffb"), ProtectedSandApp.s("\u0ffc"), ProtectedSandApp.s("\u0ffd"), "", "", "", ProtectedSandApp.s("\u0ffa"));
        String s4 = ProtectedSandApp.s("\u0ffe");
        ajc$tjp_0 = eVar.H(s4, E, 68);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0ffb"), ProtectedSandApp.s("က"), ProtectedSandApp.s("\u0ffd"), ProtectedSandApp.s("\u0ffa"), ProtectedSandApp.s("ခ"), "", ProtectedSandApp.s("\u0fff")), 72);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("\u0ffb"), ProtectedSandApp.s("ဃ"), ProtectedSandApp.s("\u0ffd"), "", "", "", ProtectedSandApp.s("ဂ")), 108);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.entries = new LinkedList();
        for (int i4 = 0; i4 < a5; i4++) {
            this.entries.add(new a(this, byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        Iterator<a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (getVersion() == 1 ? this.entries.size() * 20 : this.entries.size() * 12) + 8;
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
        return l6.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("င")), this.entries, '}');
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        EditListBox f47572a;

        /* renamed from: b, reason: collision with root package name */
        private long f47573b;

        /* renamed from: c, reason: collision with root package name */
        private long f47574c;

        /* renamed from: d, reason: collision with root package name */
        private double f47575d;

        public a(EditListBox editListBox, long j4, long j5, double d5) {
            this.f47573b = j4;
            this.f47574c = j5;
            this.f47575d = d5;
            this.f47572a = editListBox;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f47572a.getVersion() == 1) {
                i.l(byteBuffer, this.f47573b);
                byteBuffer.putLong(this.f47574c);
            } else {
                i.i(byteBuffer, com.googlecode.mp4parser.util.c.a(this.f47573b));
                byteBuffer.putInt(com.googlecode.mp4parser.util.c.a(this.f47574c));
            }
            i.b(byteBuffer, this.f47575d);
        }

        public double b() {
            return this.f47575d;
        }

        public long c() {
            return this.f47574c;
        }

        public long d() {
            return this.f47573b;
        }

        public void e(double d5) {
            this.f47575d = d5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47574c == aVar.f47574c && this.f47573b == aVar.f47573b;
        }

        public void f(long j4) {
            this.f47574c = j4;
        }

        public void g(long j4) {
            this.f47573b = j4;
        }

        public int hashCode() {
            long j4 = this.f47573b;
            int i4 = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j5 = this.f47574c;
            return i4 + ((int) ((j5 >>> 32) ^ j5));
        }

        public String toString() {
            return ProtectedSandApp.s("\u0ff5") + this.f47573b + ProtectedSandApp.s("\u0ff6") + this.f47574c + ProtectedSandApp.s("\u0ff7") + this.f47575d + '}';
        }

        public a(EditListBox editListBox, ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.f47573b = g.o(byteBuffer);
                this.f47574c = byteBuffer.getLong();
                this.f47575d = g.d(byteBuffer);
            } else {
                this.f47573b = g.l(byteBuffer);
                this.f47574c = byteBuffer.getInt();
                this.f47575d = g.d(byteBuffer);
            }
            this.f47572a = editListBox;
        }
    }
}
