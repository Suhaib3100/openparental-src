package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class FontTableBox extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᐝ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f64051a;

        /* renamed from: b, reason: collision with root package name */
        String f64052b;

        public a() {
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f64051a);
            i.m(byteBuffer, this.f64052b.length());
            byteBuffer.put(l.b(this.f64052b));
        }

        public int b() {
            return l.c(this.f64052b) + 3;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f64051a = g.i(byteBuffer);
            this.f64052b = g.h(byteBuffer, g.p(byteBuffer));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᐚ\u0001"));
            sb.append(this.f64051a);
            sb.append(ProtectedSandApp.s("ᐛ\u0001"));
            return android.support.v4.media.c.a(sb, this.f64052b, ProtectedSandApp.s("ᐜ\u0001"));
        }

        public a(int i4, String str) {
            this.f64051a = i4;
            this.f64052b = str;
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(ProtectedSandApp.s("ᐝ\u0001"));
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᐞ\u0001"), FontTableBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᐠ\u0001"), ProtectedSandApp.s("ᐡ\u0001"), ProtectedSandApp.s("ᐢ\u0001"), "", "", "", ProtectedSandApp.s("ᐟ\u0001"));
        String s4 = ProtectedSandApp.s("ᐣ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 52);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᐠ\u0001"), ProtectedSandApp.s("ᐥ\u0001"), ProtectedSandApp.s("ᐢ\u0001"), ProtectedSandApp.s("ᐟ\u0001"), ProtectedSandApp.s("ᐦ\u0001"), "", ProtectedSandApp.s("ᐤ\u0001")), 56);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int i4 = g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            a aVar = new a();
            aVar.c(byteBuffer);
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        i.f(byteBuffer, this.entries.size());
        Iterator<a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        Iterator<a> it = this.entries.iterator();
        int i4 = 2;
        while (it.hasNext()) {
            i4 += it.next().b();
        }
        return i4;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
