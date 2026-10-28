package com.coremedia.iso.boxes.dece;

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
public class TrickPlayBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ጕ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f47603a;

        public a() {
        }

        public int b() {
            return this.f47603a & 63;
        }

        public int c() {
            return (this.f47603a >> 6) & 3;
        }

        public void d(int i4) {
            this.f47603a = (i4 & 63) | this.f47603a;
        }

        public void e(int i4) {
            this.f47603a = ((i4 & 3) << 6) | (this.f47603a & 31);
        }

        public String toString() {
            return ProtectedSandApp.s("ጓ") + c() + ProtectedSandApp.s("ጔ") + b() + '}';
        }

        public a(int i4) {
            this.f47603a = i4;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrickPlayBox() {
        super(ProtectedSandApp.s("ጕ"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("\u1316"), TrickPlayBox.class);
        v E = eVar.E(ProtectedSandApp.s("ጘ"), ProtectedSandApp.s("ጙ"), ProtectedSandApp.s("ጚ"), ProtectedSandApp.s("ጛ"), ProtectedSandApp.s("ጜ"), "", ProtectedSandApp.s("\u1317"));
        String s4 = ProtectedSandApp.s("ጝ");
        ajc$tjp_0 = eVar.H(s4, E, 32);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጘ"), ProtectedSandApp.s("ጞ"), ProtectedSandApp.s("ጚ"), "", "", "", ProtectedSandApp.s("ጛ")), 36);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጘ"), ProtectedSandApp.s("ጠ"), ProtectedSandApp.s("ጚ"), "", "", "", ProtectedSandApp.s("ጟ")), 103);
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
            i.m(byteBuffer, it.next().f47603a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.entries.size() + 4;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_0, this, this, list));
        this.entries = list;
    }

    public String toString() {
        return l6.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ጡ")), this.entries, '}');
    }
}
