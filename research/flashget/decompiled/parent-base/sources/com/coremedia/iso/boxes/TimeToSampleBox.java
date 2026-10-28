package com.coremedia.iso.boxes;

import androidx.collection.y0;
import androidx.content.preferences.protobuf.n;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = ProtectedSandApp.s("ሬ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    static Map<List<a>, SoftReference<long[]>> cache;
    List<a> entries;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f47601a;

        /* renamed from: b, reason: collision with root package name */
        long f47602b;

        public a(long j4, long j5) {
            this.f47601a = j4;
            this.f47602b = j5;
        }

        public long a() {
            return this.f47601a;
        }

        public long b() {
            return this.f47602b;
        }

        public void c(long j4) {
            this.f47601a = j4;
        }

        public void d(long j4) {
            this.f47602b = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ሪ"));
            sb.append(this.f47601a);
            sb.append(ProtectedSandApp.s("ራ"));
            return y0.a(sb, this.f47602b, '}');
        }
    }

    static {
        ajc$preClinit();
        cache = new WeakHashMap();
    }

    public TimeToSampleBox() {
        super(ProtectedSandApp.s("ሬ"));
        this.entries = Collections.emptyList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ር"), TimeToSampleBox.class);
        v E = eVar.E(ProtectedSandApp.s("ሯ"), ProtectedSandApp.s("ሰ"), ProtectedSandApp.s("ሱ"), "", "", "", ProtectedSandApp.s("ሮ"));
        String s4 = ProtectedSandApp.s("ሲ");
        ajc$tjp_0 = eVar.H(s4, E, 79);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሯ"), ProtectedSandApp.s("ሴ"), ProtectedSandApp.s("ሱ"), ProtectedSandApp.s("ሮ"), ProtectedSandApp.s("ስ"), "", ProtectedSandApp.s("ሳ")), 83);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ሯ"), ProtectedSandApp.s("ሷ"), ProtectedSandApp.s("ሱ"), "", "", "", ProtectedSandApp.s("ሶ")), 87);
    }

    public static synchronized long[] blowupTimeToSamples(List<a> list) {
        long[] jArr;
        synchronized (TimeToSampleBox.class) {
            SoftReference<long[]> softReference = cache.get(list);
            if (softReference != null && (jArr = softReference.get()) != null) {
                return jArr;
            }
            Iterator<a> it = list.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += it.next().a();
            }
            long[] jArr2 = new long[(int) j4];
            int i4 = 0;
            for (a aVar : list) {
                int i5 = 0;
                while (i5 < aVar.a()) {
                    jArr2[i4] = aVar.b();
                    i5++;
                    i4++;
                }
            }
            cache.put(list, new SoftReference<>(jArr2));
            return jArr2;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.entries = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.entries.add(new a(g.l(byteBuffer), g.l(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a());
            byteBuffer.putInt((int) aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return n.a(this.entries, 8, 8);
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
        StringBuilder a5 = com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("ሸ"));
        a5.append(this.entries.size());
        a5.append(ProtectedSandApp.s("ሹ"));
        return a5.toString();
    }
}
