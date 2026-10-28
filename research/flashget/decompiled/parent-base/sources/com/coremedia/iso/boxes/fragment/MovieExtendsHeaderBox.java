package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class MovieExtendsHeaderBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ጣ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private long fragmentDuration;

    static {
        ajc$preClinit();
    }

    public MovieExtendsHeaderBox() {
        super(ProtectedSandApp.s("ጣ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ጤ"), MovieExtendsHeaderBox.class);
        v E = eVar.E(ProtectedSandApp.s("ጦ"), ProtectedSandApp.s("ጧ"), ProtectedSandApp.s("ጨ"), "", "", "", ProtectedSandApp.s("ጥ"));
        String s4 = ProtectedSandApp.s("ጩ");
        ajc$tjp_0 = eVar.H(s4, E, 65);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ጦ"), ProtectedSandApp.s("ጫ"), ProtectedSandApp.s("ጨ"), ProtectedSandApp.s("ጥ"), ProtectedSandApp.s("ጬ"), "", ProtectedSandApp.s("ጪ")), 69);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.fragmentDuration = getVersion() == 1 ? g.o(byteBuffer) : g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            i.l(byteBuffer, this.fragmentDuration);
        } else {
            i.i(byteBuffer, this.fragmentDuration);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return getVersion() == 1 ? 12 : 8;
    }

    public long getFragmentDuration() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.fragmentDuration;
    }

    public void setFragmentDuration(long j4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Long(j4)));
        this.fragmentDuration = j4;
    }
}
