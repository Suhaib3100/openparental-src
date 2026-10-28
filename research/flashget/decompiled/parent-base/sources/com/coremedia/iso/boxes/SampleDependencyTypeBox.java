package com.coremedia.iso.boxes;

import androidx.compose.ui.graphics.l6;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class SampleDependencyTypeBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᆖ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f47591a;

        public a(int i4) {
            this.f47591a = i4;
        }

        public int b() {
            return (this.f47591a >> 6) & 3;
        }

        public int c() {
            return (this.f47591a >> 4) & 3;
        }

        public int d() {
            return this.f47591a & 3;
        }

        public int e() {
            return (this.f47591a >> 2) & 3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f47591a == ((a) obj).f47591a;
        }

        public void f(int i4) {
            this.f47591a = ((i4 & 3) << 6) | (this.f47591a & 63);
        }

        public void g(int i4) {
            this.f47591a = ((i4 & 3) << 4) | (this.f47591a & 207);
        }

        public void h(int i4) {
            this.f47591a = (i4 & 3) | (this.f47591a & 252);
        }

        public int hashCode() {
            return this.f47591a;
        }

        public void i(int i4) {
            this.f47591a = ((i4 & 3) << 2) | (this.f47591a & 243);
        }

        public String toString() {
            return ProtectedSandApp.s("ᆒ") + b() + ProtectedSandApp.s("ᆓ") + c() + ProtectedSandApp.s("ᆔ") + e() + ProtectedSandApp.s("ᆕ") + d() + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleDependencyTypeBox() {
        super(ProtectedSandApp.s("ᆖ"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᆗ"), SampleDependencyTypeBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᆙ"), ProtectedSandApp.s("ᆚ"), ProtectedSandApp.s("ᆛ"), "", "", "", ProtectedSandApp.s("ᆘ"));
        String s4 = ProtectedSandApp.s("ᆜ");
        ajc$tjp_0 = eVar.H(s4, E, 139);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆙ"), ProtectedSandApp.s("ᆞ"), ProtectedSandApp.s("ᆛ"), ProtectedSandApp.s("ᆘ"), ProtectedSandApp.s("ᆟ"), "", ProtectedSandApp.s("ᆝ")), 143);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆙ"), ProtectedSandApp.s("ᆡ"), ProtectedSandApp.s("ᆛ"), "", "", "", ProtectedSandApp.s("ᆠ")), 148);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new a(g.p(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        Iterator<a> it = this.entries.iterator();
        while (it.hasNext()) {
            i.m(byteBuffer, it.next().f47591a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.entries.size() + 4;
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
        return l6.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ᆢ")), this.entries, '}');
    }
}
