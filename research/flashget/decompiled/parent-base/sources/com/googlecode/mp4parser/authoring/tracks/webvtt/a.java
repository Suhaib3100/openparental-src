package com.googlecode.mp4parser.authoring.tracks.webvtt;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.i;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTCueBox;
import com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTEmptyCueBox;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.l;
import com.mp4parser.iso14496.part30.WebVTTConfigurationBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.WebVTTSourceLabelBox;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebVttTrack.java */
/* loaded from: classes6.dex */
public class a extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    i f63856e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63857f;

    /* renamed from: g, reason: collision with root package name */
    List<f> f63858g;

    /* renamed from: h, reason: collision with root package name */
    long[] f63859h;

    /* renamed from: i, reason: collision with root package name */
    WebVTTSampleEntry f63860i;

    /* renamed from: p, reason: collision with root package name */
    private static final String f63851p = ProtectedSandApp.s("༊\u0001");

    /* renamed from: r, reason: collision with root package name */
    private static final String f63853r = ProtectedSandApp.s("་\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f63845j = ProtectedSandApp.s("༌\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f63847l = ProtectedSandApp.s("།\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f63849n = ProtectedSandApp.s("༎\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f63846k = Pattern.compile(ProtectedSandApp.s("༌\u0001"));

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f63848m = Pattern.compile(ProtectedSandApp.s("།\u0001"));

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f63850o = Pattern.compile(ProtectedSandApp.s("༎\u0001"));

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f63852q = Pattern.compile(ProtectedSandApp.s("༊\u0001"));

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f63854s = Pattern.compile(ProtectedSandApp.s("་\u0001"));

    /* renamed from: t, reason: collision with root package name */
    private static final f f63855t = new C0967a();

    /* compiled from: WebVttTrack.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.webvtt.a$a, reason: collision with other inner class name */
    class C0967a implements f {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f63861a;

        C0967a() {
            VTTEmptyCueBox vTTEmptyCueBox = new VTTEmptyCueBox();
            ByteBuffer allocate = ByteBuffer.allocate(c.a(vTTEmptyCueBox.getSize()));
            this.f63861a = allocate;
            try {
                vTTEmptyCueBox.getBox(new com.googlecode.mp4parser.util.b(allocate));
                this.f63861a.rewind();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return this.f63861a.duplicate();
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(this.f63861a.duplicate());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63861a.remaining();
        }
    }

    /* compiled from: WebVttTrack.java */
    private static class b implements f {

        /* renamed from: a, reason: collision with root package name */
        List<com.coremedia.iso.boxes.b> f63862a;

        public b(List<com.coremedia.iso.boxes.b> list) {
            this.f63862a = list;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                b(Channels.newChannel(byteArrayOutputStream));
                return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            Iterator<com.coremedia.iso.boxes.b> it = this.f63862a.iterator();
            while (it.hasNext()) {
                it.next().getBox(writableByteChannel);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            Iterator<com.coremedia.iso.boxes.b> it = this.f63862a.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += it.next().getSize();
            }
            return j4;
        }
    }

    public a(InputStream inputStream, String str, Locale locale) throws IOException {
        super(str);
        this.f63856e = new i();
        this.f63858g = new ArrayList();
        this.f63859h = new long[0];
        this.f63856e.v(1000L);
        this.f63856e.r(locale.getISO3Language());
        this.f63857f = new SampleDescriptionBox();
        WebVTTSampleEntry webVTTSampleEntry = new WebVTTSampleEntry();
        this.f63860i = webVTTSampleEntry;
        this.f63857f.addBox(webVTTSampleEntry);
        WebVTTConfigurationBox webVTTConfigurationBox = new WebVTTConfigurationBox();
        this.f63860i.addBox(webVTTConfigurationBox);
        this.f63860i.addBox(new WebVTTSourceLabelBox());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ProtectedSandApp.s("༏\u0001")));
        String readLine = bufferedReader.readLine();
        if (readLine == null || !f63846k.matcher(readLine).matches()) {
            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("༕\u0001"), readLine));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(webVTTConfigurationBox.getConfig()));
        String s4 = ProtectedSandApp.s("༐\u0001");
        sb.append(s4);
        sb.append(readLine);
        webVTTConfigurationBox.setConfig(sb.toString());
        while (true) {
            String readLine2 = bufferedReader.readLine();
            if (readLine2 == null) {
                throw new IOException(ProtectedSandApp.s("༔\u0001"));
            }
            if (readLine2.isEmpty()) {
                long j4 = 0;
                while (true) {
                    String readLine3 = bufferedReader.readLine();
                    if (readLine3 == null) {
                        return;
                    }
                    if (!"".equals(readLine3.trim())) {
                        readLine3 = f63850o.matcher(readLine3).find() ? bufferedReader.readLine() : readLine3;
                        Matcher matcher = f63852q.matcher(readLine3);
                        if (!matcher.find()) {
                            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("༒\u0001"), readLine3));
                        }
                        long a5 = a(matcher.group());
                        if (!matcher.find()) {
                            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("༑\u0001"), readLine3));
                        }
                        String group = matcher.group();
                        long a6 = a(group);
                        Matcher matcher2 = f63854s.matcher(readLine3.substring(group.length() + readLine3.indexOf(group)));
                        String str2 = null;
                        while (matcher2.find()) {
                            str2 = matcher2.group();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String readLine4 = bufferedReader.readLine();
                            if (readLine4 == null || readLine4.isEmpty()) {
                                break;
                            }
                            if (sb2.length() > 0) {
                                sb2.append(s4);
                            }
                            sb2.append(readLine4.trim());
                        }
                        if (a5 != j4) {
                            this.f63859h = l.c(this.f63859h, a5 - j4);
                            this.f63858g.add(f63855t);
                        }
                        this.f63859h = l.c(this.f63859h, a6 - a5);
                        VTTCueBox vTTCueBox = new VTTCueBox();
                        if (str2 != null) {
                            CueSettingsBox cueSettingsBox = new CueSettingsBox();
                            cueSettingsBox.setContent(str2);
                            vTTCueBox.setCueSettingsBox(cueSettingsBox);
                        }
                        CuePayloadBox cuePayloadBox = new CuePayloadBox();
                        cuePayloadBox.setContent(sb2.toString());
                        vTTCueBox.setCuePayloadBox(cuePayloadBox);
                        this.f63858g.add(new b(Collections.singletonList(vTTCueBox)));
                        j4 = a6;
                    }
                }
            } else {
                if (!f63848m.matcher(readLine2).find()) {
                    throw new IOException(ProtectedSandApp.s("༓\u0001").concat(readLine2));
                }
                webVTTConfigurationBox.setConfig(String.valueOf(webVTTConfigurationBox.getConfig()) + s4 + readLine2);
            }
        }
    }

    private static long a(String str) throws NumberFormatException {
        if (!str.matches(ProtectedSandApp.s("༊\u0001"))) {
            throw new NumberFormatException(ProtectedSandApp.s("༘\u0001"));
        }
        String[] split = str.split(ProtectedSandApp.s("༖\u0001"), 2);
        long j4 = 0;
        for (String str2 : split[0].split(ProtectedSandApp.s("༗\u0001"))) {
            j4 = (j4 * 60) + Long.parseLong(str2);
        }
        return Long.parseLong(split[1]) + (j4 * 1000);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return this.f63858g;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        int length = this.f63859h.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = (this.f63856e.k() * this.f63859h[i4]) / 1000;
        }
        return jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("༙\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63857f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i u2() {
        return this.f63856e;
    }
}
