package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;

/* loaded from: classes6.dex */
public class AppleRecordingYearBox extends AppleDataBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    Date date;

    /* renamed from: df, reason: collision with root package name */
    DateFormat f63877df;

    static {
        ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super(ProtectedSandApp.s("ᄋ\u0001"), 1);
        this.date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("ᄌ\u0001"));
        this.f63877df = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("ᄍ\u0001")));
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("ᄎ\u0001"), AppleRecordingYearBox.class);
        v E = eVar.E(ProtectedSandApp.s("ᄐ\u0001"), ProtectedSandApp.s("ᄑ\u0001"), ProtectedSandApp.s("ᄒ\u0001"), "", "", "", ProtectedSandApp.s("ᄏ\u0001"));
        String s4 = ProtectedSandApp.s("ᄓ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 27);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("ᄐ\u0001"), ProtectedSandApp.s("ᄕ\u0001"), ProtectedSandApp.s("ᄒ\u0001"), ProtectedSandApp.s("ᄏ\u0001"), ProtectedSandApp.s("ᄖ\u0001"), "", ProtectedSandApp.s("ᄔ\u0001")), 31);
    }

    protected static String iso8601toRfc822Date(String str) {
        return str.replaceAll(ProtectedSandApp.s("ᄗ\u0001"), ProtectedSandApp.s("ᄘ\u0001")).replaceAll(ProtectedSandApp.s("ᄙ\u0001"), ProtectedSandApp.s("ᄚ\u0001"));
    }

    protected static String rfc822toIso8601Date(String str) {
        return str.replaceAll(ProtectedSandApp.s("ᄛ\u0001"), ProtectedSandApp.s("ᄜ\u0001"));
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return l.b(rfc822toIso8601Date(this.f63877df.format(this.date))).length;
    }

    public Date getDate() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        return this.date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        try {
            this.date = this.f63877df.parse(iso8601toRfc822Date(com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining())));
        } catch (ParseException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void setDate(Date date) {
        g.b().c(e.w(ajc$tjp_1, this, this, date));
        this.date = date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return l.b(rfc822toIso8601Date(this.f63877df.format(this.date)));
    }
}
