package com.googlecode.mp4parser.boxes.piff;

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

/* loaded from: classes6.dex */
public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    public List<a> entries;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        long f64041a;

        /* renamed from: b, reason: collision with root package name */
        long f64042b;

        public a() {
        }

        public long a() {
            return this.f64042b;
        }

        public long b() {
            return this.f64041a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꮕ\u0001"));
            sb.append(this.f64041a);
            sb.append(ProtectedSandApp.s("Ꮖ\u0001"));
            return y0.a(sb, this.f64042b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super(ProtectedSandApp.s("Ꮗ\u0001"));
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ꮘ\u0001"), TfrfBox.class);
        v E = eVar.E(ProtectedSandApp.s("Ꮚ\u0001"), ProtectedSandApp.s("Ꮛ\u0001"), ProtectedSandApp.s("Ꮜ\u0001"), "", "", "", ProtectedSandApp.s("Ꮙ\u0001"));
        String s4 = ProtectedSandApp.s("Ꮝ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 91);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮚ\u0001"), ProtectedSandApp.s("Ꮟ\u0001"), ProtectedSandApp.s("Ꮜ\u0001"), "", "", "", ProtectedSandApp.s("Ꮞ\u0001")), 95);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("Ꮚ\u0001"), ProtectedSandApp.s("Ꮡ\u0001"), ProtectedSandApp.s("Ꮜ\u0001"), "", "", "", ProtectedSandApp.s("Ꮠ\u0001")), 100);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p4 = g.p(byteBuffer);
        for (int i4 = 0; i4 < p4; i4++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.f64041a = g.o(byteBuffer);
                aVar.f64042b = g.o(byteBuffer);
            } else {
                aVar.f64041a = g.l(byteBuffer);
                aVar.f64042b = g.l(byteBuffer);
            }
            this.entries.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.m(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.f64041a);
                byteBuffer.putLong(aVar.f64042b);
            } else {
                byteBuffer.putInt((int) aVar.f64041a);
                byteBuffer.putInt((int) aVar.f64042b);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return (this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    public List<a> getEntries() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_1, this, this));
        return this.entries;
    }

    public long getFragmentCount() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.entries.size();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, Byte.MIN_VALUE, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        return l6.a(com.coremedia.iso.boxes.a.a(e.v(ajc$tjp_2, this, this), ProtectedSandApp.s("Ꮢ\u0001")), this.entries, '}');
    }
}
