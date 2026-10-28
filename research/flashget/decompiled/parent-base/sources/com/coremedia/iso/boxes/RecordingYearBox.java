package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class RecordingYearBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ᆈ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    int recordingYear;

    static {
        ajc$preClinit();
    }

    public RecordingYearBox() {
        super(ProtectedSandApp.s("ᆈ"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᆉ"), RecordingYearBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᆋ"), ProtectedSandApp.s("ᆌ"), ProtectedSandApp.s("ᆍ"), "", "", "", ProtectedSandApp.s("ᆊ"));
        String s4 = ProtectedSandApp.s("ᆎ");
        ajc$tjp_0 = eVar.H(s4, E, 42);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᆋ"), ProtectedSandApp.s("ᆐ"), ProtectedSandApp.s("ᆍ"), ProtectedSandApp.s("ᆊ"), ProtectedSandApp.s("ᆑ"), "", ProtectedSandApp.s("ᆏ")), 46);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.recordingYear = g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.f(byteBuffer, this.recordingYear);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 6L;
    }

    public int getRecordingYear() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.recordingYear;
    }

    public void setRecordingYear(int i4) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.recordingYear = i4;
    }
}
