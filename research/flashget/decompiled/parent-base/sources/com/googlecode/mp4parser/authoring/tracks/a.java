package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.helpers.UtilLoggingLevel;

/* compiled from: AACTrackImpl.java */
/* loaded from: classes6.dex */
public class a extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: o, reason: collision with root package name */
    static Map<Integer, String> f63454o;

    /* renamed from: p, reason: collision with root package name */
    public static Map<Integer, Integer> f63455p;

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f63456e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63457f;

    /* renamed from: g, reason: collision with root package name */
    long[] f63458g;

    /* renamed from: h, reason: collision with root package name */
    b f63459h;

    /* renamed from: i, reason: collision with root package name */
    int f63460i;

    /* renamed from: j, reason: collision with root package name */
    long f63461j;

    /* renamed from: k, reason: collision with root package name */
    long f63462k;

    /* renamed from: l, reason: collision with root package name */
    private com.googlecode.mp4parser.a f63463l;

    /* renamed from: m, reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f63464m;

    /* renamed from: n, reason: collision with root package name */
    private String f63465n;

    /* compiled from: AACTrackImpl.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.a$a, reason: collision with other inner class name */
    class C0961a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ long f63467b;

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ long f63468c;

        C0961a(long j4, long j5) {
            this.f63467b = j4;
            this.f63468c = j5;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return a.this.f63463l.e3(this.f63467b, this.f63468c);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            a.this.f63463l.T(this.f63467b, this.f63468c, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63468c;
        }
    }

    /* compiled from: AACTrackImpl.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        int f63469a;

        /* renamed from: b, reason: collision with root package name */
        int f63470b;

        /* renamed from: c, reason: collision with root package name */
        int f63471c;

        /* renamed from: d, reason: collision with root package name */
        int f63472d;

        /* renamed from: e, reason: collision with root package name */
        int f63473e;

        /* renamed from: f, reason: collision with root package name */
        int f63474f;

        /* renamed from: g, reason: collision with root package name */
        int f63475g;

        /* renamed from: h, reason: collision with root package name */
        int f63476h;

        /* renamed from: i, reason: collision with root package name */
        int f63477i;

        /* renamed from: j, reason: collision with root package name */
        int f63478j;

        /* renamed from: k, reason: collision with root package name */
        int f63479k;

        /* renamed from: l, reason: collision with root package name */
        int f63480l;

        /* renamed from: m, reason: collision with root package name */
        int f63481m;

        /* renamed from: n, reason: collision with root package name */
        int f63482n;

        b() {
        }

        int a() {
            return (this.f63472d == 0 ? 2 : 0) + 7;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f63454o = hashMap;
        hashMap.put(1, ProtectedSandApp.s("ೣ\u0001"));
        f63454o.put(2, ProtectedSandApp.s("\u0ce4\u0001"));
        f63454o.put(3, ProtectedSandApp.s("\u0ce5\u0001"));
        f63454o.put(4, ProtectedSandApp.s("೦\u0001"));
        f63454o.put(5, ProtectedSandApp.s("೧\u0001"));
        f63454o.put(6, ProtectedSandApp.s("೨\u0001"));
        f63454o.put(7, ProtectedSandApp.s("೩\u0001"));
        f63454o.put(8, ProtectedSandApp.s("೪\u0001"));
        f63454o.put(9, ProtectedSandApp.s("೫\u0001"));
        Map<Integer, String> map = f63454o;
        String s4 = ProtectedSandApp.s("೬\u0001");
        map.put(10, s4);
        f63454o.put(11, s4);
        f63454o.put(12, ProtectedSandApp.s("೭\u0001"));
        f63454o.put(13, ProtectedSandApp.s("೮\u0001"));
        f63454o.put(14, ProtectedSandApp.s("೯\u0001"));
        f63454o.put(15, ProtectedSandApp.s("\u0cf0\u0001"));
        f63454o.put(16, ProtectedSandApp.s("ೱ\u0001"));
        f63454o.put(17, ProtectedSandApp.s("ೲ\u0001"));
        f63454o.put(18, s4);
        f63454o.put(19, ProtectedSandApp.s("ೳ\u0001"));
        f63454o.put(20, ProtectedSandApp.s("\u0cf4\u0001"));
        f63454o.put(21, ProtectedSandApp.s("\u0cf5\u0001"));
        f63454o.put(22, ProtectedSandApp.s("\u0cf6\u0001"));
        f63454o.put(23, ProtectedSandApp.s("\u0cf7\u0001"));
        f63454o.put(24, ProtectedSandApp.s("\u0cf8\u0001"));
        f63454o.put(25, ProtectedSandApp.s("\u0cf9\u0001"));
        f63454o.put(26, ProtectedSandApp.s("\u0cfa\u0001"));
        f63454o.put(27, ProtectedSandApp.s("\u0cfb\u0001"));
        f63454o.put(28, ProtectedSandApp.s("\u0cfc\u0001"));
        f63454o.put(29, ProtectedSandApp.s("\u0cfd\u0001"));
        f63454o.put(30, ProtectedSandApp.s("\u0cfe\u0001"));
        f63454o.put(31, ProtectedSandApp.s("\u0cff\u0001"));
        f63454o.put(32, ProtectedSandApp.s("ഀ\u0001"));
        f63454o.put(33, ProtectedSandApp.s("ഁ\u0001"));
        f63454o.put(34, ProtectedSandApp.s("ം\u0001"));
        f63454o.put(35, ProtectedSandApp.s("ഃ\u0001"));
        f63454o.put(36, ProtectedSandApp.s("ഄ\u0001"));
        f63454o.put(37, ProtectedSandApp.s("അ\u0001"));
        f63454o.put(38, ProtectedSandApp.s("ആ\u0001"));
        f63454o.put(39, ProtectedSandApp.s("ഇ\u0001"));
        f63454o.put(40, ProtectedSandApp.s("ഈ\u0001"));
        f63454o.put(41, ProtectedSandApp.s("ഉ\u0001"));
        f63454o.put(42, ProtectedSandApp.s("ഊ\u0001"));
        f63454o.put(43, ProtectedSandApp.s("ഋ\u0001"));
        f63454o.put(44, ProtectedSandApp.s("ഌ\u0001"));
        f63454o.put(45, ProtectedSandApp.s("\u0d0d\u0001"));
        HashMap hashMap2 = new HashMap();
        f63455p = hashMap2;
        hashMap2.put(96000, 0);
        f63455p.put(88200, 1);
        f63455p.put(64000, 2);
        f63455p.put(48000, 3);
        f63455p.put(44100, 4);
        f63455p.put(32000, 5);
        f63455p.put(24000, 6);
        f63455p.put(22050, 7);
        f63455p.put(16000, 8);
        f63455p.put(Integer.valueOf(UtilLoggingLevel.FINER_INT), 9);
        f63455p.put(11025, 10);
        f63455p.put(Integer.valueOf(TXRecordCommon.AUDIO_SAMPLERATE_8000), 11);
        f63455p.put(0, 96000);
        f63455p.put(1, 88200);
        f63455p.put(2, 64000);
        f63455p.put(3, 48000);
        f63455p.put(4, 44100);
        f63455p.put(5, 32000);
        f63455p.put(6, 24000);
        f63455p.put(7, 22050);
        f63455p.put(8, 16000);
        f63455p.put(9, Integer.valueOf(UtilLoggingLevel.FINER_INT));
        f63455p.put(10, 11025);
        f63455p.put(11, Integer.valueOf(TXRecordCommon.AUDIO_SAMPLERATE_8000));
    }

    public a(com.googlecode.mp4parser.a aVar) throws IOException {
        this(aVar, ProtectedSandApp.s("എ\u0001"));
    }

    private b b(com.googlecode.mp4parser.a aVar) throws IOException {
        b bVar = new b();
        ByteBuffer allocate = ByteBuffer.allocate(7);
        while (allocate.position() < 7) {
            if (aVar.read(allocate) == -1) {
                return null;
            }
        }
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c((ByteBuffer) allocate.rewind());
        if (cVar.c(12) != 4095) {
            throw new IOException(ProtectedSandApp.s("\u0d11\u0001"));
        }
        bVar.f63470b = cVar.c(1);
        bVar.f63471c = cVar.c(2);
        bVar.f63472d = cVar.c(1);
        bVar.f63473e = cVar.c(2) + 1;
        int c5 = cVar.c(4);
        bVar.f63469a = c5;
        bVar.f63474f = f63455p.get(Integer.valueOf(c5)).intValue();
        cVar.c(1);
        bVar.f63475g = cVar.c(3);
        bVar.f63476h = cVar.c(1);
        bVar.f63477i = cVar.c(1);
        bVar.f63478j = cVar.c(1);
        bVar.f63479k = cVar.c(1);
        bVar.f63480l = cVar.c(13);
        bVar.f63481m = cVar.c(11);
        int c6 = cVar.c(2) + 1;
        bVar.f63482n = c6;
        if (c6 != 1) {
            throw new IOException(ProtectedSandApp.s("ഐ\u0001"));
        }
        if (bVar.f63472d == 0) {
            aVar.read(ByteBuffer.allocate(2));
        }
        return bVar;
    }

    private b c(com.googlecode.mp4parser.a aVar) throws IOException {
        b bVar = null;
        while (true) {
            b b5 = b(aVar);
            if (b5 == null) {
                return bVar;
            }
            if (bVar == null) {
                bVar = b5;
            }
            this.f63464m.add(new C0961a(aVar.position(), b5.f63480l - b5.a()));
            aVar.O1((aVar.position() + b5.f63480l) - b5.a());
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63464m;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63458g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63463l.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ഒ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63457f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ഓ\u0001"));
        sb.append(this.f63459h.f63474f);
        sb.append(ProtectedSandApp.s("ഔ\u0001"));
        return androidx.view.e.a(sb, this.f63459h.f63475g, '}');
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63456e;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }

    public a(com.googlecode.mp4parser.a aVar, String str) throws IOException {
        super(aVar.toString());
        this.f63456e = new com.googlecode.mp4parser.authoring.i();
        this.f63465n = str;
        this.f63463l = aVar;
        this.f63464m = new ArrayList();
        this.f63459h = c(aVar);
        double d5 = r12.f63474f / 1024.0d;
        double size = this.f63464m.size() / d5;
        LinkedList linkedList = new LinkedList();
        Iterator<com.googlecode.mp4parser.authoring.f> it = this.f63464m.iterator();
        long j4 = 0;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int size2 = (int) it.next().getSize();
            j4 += size2;
            linkedList.add(Integer.valueOf(size2));
            while (linkedList.size() > d5) {
                linkedList.pop();
            }
            if (linkedList.size() == ((int) d5)) {
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    i4 += ((Integer) it2.next()).intValue();
                }
                if (((i4 * 8.0d) / linkedList.size()) * d5 > this.f63461j) {
                    this.f63461j = (int) r7;
                }
            }
        }
        this.f63462k = (int) ((j4 * 8) / size);
        this.f63460i = 1536;
        this.f63457f = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(ProtectedSandApp.s("ഏ\u0001"));
        int i5 = this.f63459h.f63475g;
        if (i5 == 7) {
            audioSampleEntry.setChannelCount(8);
        } else {
            audioSampleEntry.setChannelCount(i5);
        }
        audioSampleEntry.setSampleRate(this.f63459h.f63474f);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h hVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h();
        hVar.x(0);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o oVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o();
        oVar.j(2);
        hVar.z(oVar);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
        eVar.w(64);
        eVar.x(5);
        eVar.t(this.f63460i);
        eVar.v(this.f63461j);
        eVar.s(this.f63462k);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a aVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a();
        aVar2.f63913g = 2;
        b bVar = this.f63459h;
        aVar2.f63914h = bVar.f63469a;
        aVar2.f63916j = bVar.f63475g;
        eVar.r(aVar2);
        hVar.v(eVar);
        eSDescriptorBox.setEsDescriptor(hVar);
        audioSampleEntry.addBox(eSDescriptorBox);
        this.f63457f.addBox(audioSampleEntry);
        this.f63456e.o(new Date());
        this.f63456e.u(new Date());
        this.f63456e.r(str);
        this.f63456e.y(1.0f);
        this.f63456e.v(this.f63459h.f63474f);
        long[] jArr = new long[this.f63464m.size()];
        this.f63458g = jArr;
        Arrays.fill(jArr, 1024L);
    }
}
