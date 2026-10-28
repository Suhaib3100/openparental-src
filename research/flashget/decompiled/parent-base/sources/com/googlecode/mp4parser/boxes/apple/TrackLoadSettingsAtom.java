package com.googlecode.mp4parser.boxes.apple;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class TrackLoadSettingsAtom extends AbstractBox {
    public static final String TYPE = ProtectedSandApp.s("ᇠ\u0001");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static final /* synthetic */ c.b ajc$tjp_6 = null;
    private static final /* synthetic */ c.b ajc$tjp_7 = null;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;

    static {
        ajc$preClinit();
    }

    public TrackLoadSettingsAtom() {
        super(ProtectedSandApp.s("ᇠ\u0001"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᇡ\u0001"), TrackLoadSettingsAtom.class);
        v E = eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇤ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), "", "", "", ProtectedSandApp.s("ᇢ\u0001"));
        String s4 = ProtectedSandApp.s("ᇦ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 49);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇨ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), ProtectedSandApp.s("ᇢ\u0001"), ProtectedSandApp.s("ᇩ\u0001"), "", ProtectedSandApp.s("ᇧ\u0001")), 53);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇪ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), "", "", "", ProtectedSandApp.s("ᇢ\u0001")), 57);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇫ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), ProtectedSandApp.s("ᇢ\u0001"), ProtectedSandApp.s("ᇬ\u0001"), "", ProtectedSandApp.s("ᇧ\u0001")), 61);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇭ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), "", "", "", ProtectedSandApp.s("ᇢ\u0001")), 65);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇮ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), ProtectedSandApp.s("ᇢ\u0001"), ProtectedSandApp.s("ᇯ\u0001"), "", ProtectedSandApp.s("ᇧ\u0001")), 69);
        ajc$tjp_6 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇰ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), "", "", "", ProtectedSandApp.s("ᇢ\u0001")), 73);
        ajc$tjp_7 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᇣ\u0001"), ProtectedSandApp.s("ᇱ\u0001"), ProtectedSandApp.s("ᇥ\u0001"), ProtectedSandApp.s("ᇢ\u0001"), ProtectedSandApp.s("ᇲ\u0001"), "", ProtectedSandApp.s("ᇧ\u0001")), 77);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.preloadStartTime = byteBuffer.getInt();
        this.preloadDuration = byteBuffer.getInt();
        this.preloadFlags = byteBuffer.getInt();
        this.defaultHints = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.preloadStartTime);
        byteBuffer.putInt(this.preloadDuration);
        byteBuffer.putInt(this.preloadFlags);
        byteBuffer.putInt(this.defaultHints);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 16L;
    }

    public int getDefaultHints() {
        g.b().c(e.v(ajc$tjp_6, this, this));
        return this.defaultHints;
    }

    public int getPreloadDuration() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.preloadDuration;
    }

    public int getPreloadFlags() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.preloadFlags;
    }

    public int getPreloadStartTime() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.preloadStartTime;
    }

    public void setDefaultHints(int i4) {
        g.b().c(e.w(ajc$tjp_7, this, this, new Integer(i4)));
        this.defaultHints = i4;
    }

    public void setPreloadDuration(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.preloadDuration = i4;
    }

    public void setPreloadFlags(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.preloadFlags = i4;
    }

    public void setPreloadStartTime(int i4) {
        g.b().c(e.w(ajc$tjp_1, this, this, new Integer(i4)));
        this.preloadStartTime = i4;
    }
}
