package com.coremedia.iso.boxes;

import androidx.content.preferences.protobuf.n;
import androidx.view.e;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.v;
import org.mp4parser.aspectj.lang.c;

/* loaded from: classes3.dex */
public class CompositionTimeToSample extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ྲ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f47570a;

        /* renamed from: b, reason: collision with root package name */
        int f47571b;

        public a(int i4, int i5) {
            this.f47570a = i4;
            this.f47571b = i5;
        }

        public int a() {
            return this.f47570a;
        }

        public int b() {
            return this.f47571b;
        }

        public void c(int i4) {
            this.f47570a = i4;
        }

        public void d(int i4) {
            this.f47571b = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ྰ"));
            sb.append(this.f47570a);
            sb.append(ProtectedSandApp.s("ྱ"));
            return e.a(sb, this.f47571b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public CompositionTimeToSample() {
        super(ProtectedSandApp.s("ྲ"));
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        org.mp4parser.aspectj.runtime.reflect.e eVar = new org.mp4parser.aspectj.runtime.reflect.e(ProtectedSandApp.s("ླ"), CompositionTimeToSample.class);
        v E = eVar.E(ProtectedSandApp.s("ྵ"), ProtectedSandApp.s("ྶ"), ProtectedSandApp.s("ྷ"), "", "", "", ProtectedSandApp.s("ྴ"));
        String s4 = ProtectedSandApp.s("ྸ");
        ajc$tjp_0 = eVar.H(s4, E, 57);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ྵ"), ProtectedSandApp.s("ྺ"), ProtectedSandApp.s("ྷ"), ProtectedSandApp.s("ྴ"), ProtectedSandApp.s("ྻ"), "", ProtectedSandApp.s("ྐྵ")), 61);
    }

    public static int[] blowupCompositionTimes(List<a> list) {
        long j4 = 0;
        while (list.iterator().hasNext()) {
            j4 += r0.next().a();
        }
        int[] iArr = new int[(int) j4];
        int i4 = 0;
        for (a aVar : list) {
            int i5 = 0;
            while (i5 < aVar.a()) {
                iArr[i4] = aVar.b();
                i5++;
                i4++;
            }
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.entries = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.entries.add(new a(com.googlecode.mp4parser.util.c.a(g.l(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt(aVar.a());
            byteBuffer.putInt(aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return n.a(this.entries, 8, 8);
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.v(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        com.googlecode.mp4parser.g.b().c(org.mp4parser.aspectj.runtime.reflect.e.w(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
