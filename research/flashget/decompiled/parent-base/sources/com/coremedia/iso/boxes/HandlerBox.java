package com.coremedia.iso.boxes;

import androidx.core.content.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes3.dex */
public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = ProtectedSandApp.s("ြ");
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    public static final Map<String, String> readableTypes;

    /* renamed from: a, reason: collision with root package name */
    private long f47576a;

    /* renamed from: b, reason: collision with root package name */
    private long f47577b;

    /* renamed from: c, reason: collision with root package name */
    private long f47578c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    static {
        ajc$preClinit();
        HashMap a5 = d.a(ProtectedSandApp.s("ွ"), ProtectedSandApp.s("ှ"), ProtectedSandApp.s("ဿ"), ProtectedSandApp.s("၀"));
        a5.put(ProtectedSandApp.s("၁"), ProtectedSandApp.s("၂"));
        a5.put(ProtectedSandApp.s("၃"), ProtectedSandApp.s("၄"));
        a5.put(ProtectedSandApp.s("၅"), ProtectedSandApp.s("၆"));
        a5.put(ProtectedSandApp.s("၇"), ProtectedSandApp.s("၈"));
        a5.put(ProtectedSandApp.s("၉"), ProtectedSandApp.s("၊"));
        a5.put(ProtectedSandApp.s("။"), ProtectedSandApp.s("၌"));
        a5.put(ProtectedSandApp.s("၍"), ProtectedSandApp.s("၎"));
        a5.put(ProtectedSandApp.s("၏"), ProtectedSandApp.s("ၐ"));
        a5.put(ProtectedSandApp.s("ၑ"), ProtectedSandApp.s("ၒ"));
        a5.put(ProtectedSandApp.s("ၓ"), ProtectedSandApp.s("ၔ"));
        a5.put(ProtectedSandApp.s("ၕ"), ProtectedSandApp.s("ၖ"));
        a5.put(ProtectedSandApp.s("ၗ"), ProtectedSandApp.s("ၘ"));
        a5.put(ProtectedSandApp.s("ၙ"), ProtectedSandApp.s("ၚ"));
        readableTypes = Collections.unmodifiableMap(a5);
    }

    public HandlerBox() {
        super(ProtectedSandApp.s("ြ"));
        this.name = null;
        this.zeroTerm = true;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ၛ"), HandlerBox.class);
        v E = eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၞ"), ProtectedSandApp.s("ၟ"), "", "", "", ProtectedSandApp.s("ၜ"));
        String s4 = ProtectedSandApp.s("ၠ");
        ajc$tjp_0 = eVar.H(s4, E, 78);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၢ"), ProtectedSandApp.s("ၟ"), ProtectedSandApp.s("ၜ"), ProtectedSandApp.s("ၣ"), "", ProtectedSandApp.s("ၡ")), 87);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၤ"), ProtectedSandApp.s("ၟ"), ProtectedSandApp.s("ၜ"), ProtectedSandApp.s("ၥ"), "", ProtectedSandApp.s("ၡ")), 91);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၦ"), ProtectedSandApp.s("ၟ"), "", "", "", ProtectedSandApp.s("ၜ")), 95);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၧ"), ProtectedSandApp.s("ၟ"), "", "", "", ProtectedSandApp.s("ၜ")), 99);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ၝ"), ProtectedSandApp.s("ၨ"), ProtectedSandApp.s("ၟ"), "", "", "", ProtectedSandApp.s("ၜ")), 149);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = g.l(byteBuffer);
        this.handlerType = g.b(byteBuffer);
        this.f47576a = g.l(byteBuffer);
        this.f47577b = g.l(byteBuffer);
        this.f47578c = g.l(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.zeroTerm = false;
            return;
        }
        String h4 = g.h(byteBuffer, byteBuffer.remaining());
        this.name = h4;
        if (!h4.endsWith(ProtectedSandApp.s("ၩ"))) {
            this.zeroTerm = false;
        } else {
            this.name = f.a(this.name, 1, 0);
            this.zeroTerm = true;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        i.i(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(com.coremedia.iso.f.b(this.handlerType));
        byteBuffer.putInt((int) this.f47576a);
        byteBuffer.putInt((int) this.f47577b);
        byteBuffer.putInt((int) this.f47578c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(l.b(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.zeroTerm ? l.c(this.name) + 25 : l.c(this.name) + 24;
    }

    public String getHandlerType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_0, this, this));
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_4, this, this));
        Map<String, String> map = readableTypes;
        return map.get(this.handlerType) != null ? map.get(this.handlerType) : ProtectedSandApp.s("ၪ");
    }

    public String getName() {
        com.googlecode.mp4parser.g.b().c(e.v(ajc$tjp_3, this, this));
        return this.name;
    }

    public void setHandlerType(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_2, this, this, str));
        this.handlerType = str;
    }

    public void setName(String str) {
        com.googlecode.mp4parser.g.b().c(e.w(ajc$tjp_1, this, this, str));
        this.name = str;
    }

    public String toString() {
        StringBuilder a5 = a.a(e.v(ajc$tjp_5, this, this), ProtectedSandApp.s("ၫ"));
        a5.append(getHandlerType());
        a5.append(ProtectedSandApp.s("ၬ"));
        a5.append(getName());
        a5.append(ProtectedSandApp.s("ၭ"));
        return a5.toString();
    }
}
