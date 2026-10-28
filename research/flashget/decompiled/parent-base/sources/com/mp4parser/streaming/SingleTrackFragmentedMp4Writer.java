package com.mp4parser.streaming;

import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lb.h;

/* loaded from: classes6.dex */
public class SingleTrackFragmentedMp4Writer implements c {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f70136k = false;

    /* renamed from: b, reason: collision with root package name */
    private final OutputStream f70137b;

    /* renamed from: c, reason: collision with root package name */
    f f70138c;

    /* renamed from: d, reason: collision with root package name */
    lb.c f70139d;

    /* renamed from: e, reason: collision with root package name */
    lb.f f70140e;

    /* renamed from: h, reason: collision with root package name */
    private long f70143h;

    /* renamed from: g, reason: collision with root package name */
    List<d> f70142g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private long f70144i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f70145j = 0;

    /* renamed from: f, reason: collision with root package name */
    Date f70141f = new Date();

    public SingleTrackFragmentedMp4Writer(f fVar, OutputStream outputStream) {
        this.f70138c = fVar;
        this.f70137b = outputStream;
        this.f70139d = (lb.c) fVar.c(lb.c.class);
        this.f70140e = (lb.f) fVar.c(lb.f.class);
    }

    private void a(d dVar, WritableByteChannel writableByteChannel) throws IOException {
        lb.e eVar = null;
        for (b bVar : dVar.a()) {
            if (bVar instanceof lb.e) {
                eVar = (lb.e) bVar;
            } else {
                boolean z4 = bVar instanceof lb.b;
            }
        }
        this.f70145j = dVar.getDuration() + this.f70145j;
        this.f70142g.add(dVar);
        if (this.f70145j <= (this.f70138c.d() * 3) + this.f70144i || this.f70142g.size() <= 0) {
            return;
        }
        if (this.f70140e == null || eVar == null || eVar.i()) {
            k().getBox(writableByteChannel);
            d().getBox(writableByteChannel);
            this.f70144i = this.f70145j;
            this.f70142g.clear();
        }
    }

    private com.coremedia.iso.boxes.b d() {
        return new WriteOnlyBox(ProtectedSandApp.s("᧴\u0001")) { // from class: com.mp4parser.streaming.SingleTrackFragmentedMp4Writer.1
            @Override // com.coremedia.iso.boxes.b
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = SingleTrackFragmentedMp4Writer.this.f70142g.iterator();
                long j4 = 8;
                while (it.hasNext()) {
                    arrayList.add(it.next().getContent());
                    j4 += r4.remaining();
                }
                ByteBuffer allocate = ByteBuffer.allocate(8);
                i.i(allocate, j4);
                allocate.put(com.coremedia.iso.f.b(getType()));
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    writableByteChannel.write((ByteBuffer) it2.next());
                }
            }

            @Override // com.coremedia.iso.boxes.b
            public long getSize() {
                long j4 = 8;
                while (SingleTrackFragmentedMp4Writer.this.f70142g.iterator().hasNext()) {
                    j4 += r0.next().getContent().remaining();
                }
                return j4;
            }
        };
    }

    private void h(long j4, MovieFragmentBox movieFragmentBox) {
        MovieFragmentHeaderBox movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber(j4);
        movieFragmentBox.addBox(movieFragmentHeaderBox);
    }

    private com.coremedia.iso.boxes.b k() {
        MovieFragmentBox movieFragmentBox = new MovieFragmentBox();
        h(this.f70143h, movieFragmentBox);
        t(this.f70143h, movieFragmentBox);
        TrackRunBox trackRunBox = movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int) (movieFragmentBox.getSize() + 8));
        return movieFragmentBox;
    }

    private void t(long j4, MovieFragmentBox movieFragmentBox) {
        TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        movieFragmentBox.addBox(trackFragmentBox);
        s(trackFragmentBox);
        q(trackFragmentBox);
        y(trackFragmentBox);
        this.f70138c.c(lb.a.class);
    }

    protected DataInformationBox b() {
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }

    public com.coremedia.iso.boxes.b c() {
        LinkedList linkedList = new LinkedList();
        String s4 = ProtectedSandApp.s("᧵\u0001");
        linkedList.add(s4);
        linkedList.add(ProtectedSandApp.s("᧶\u0001"));
        linkedList.add(ProtectedSandApp.s("᧷\u0001"));
        return new FileTypeBox(s4, 0L, linkedList);
    }

    @Override // com.mp4parser.streaming.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected com.coremedia.iso.boxes.b e() {
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(this.f70141f);
        mediaHeaderBox.setModificationTime(this.f70141f);
        mediaHeaderBox.setDuration(0L);
        mediaHeaderBox.setTimescale(this.f70138c.d());
        mediaHeaderBox.setLanguage(this.f70138c.a());
        return mediaHeaderBox;
    }

    protected com.coremedia.iso.boxes.b f() {
        MediaBox mediaBox = new MediaBox();
        mediaBox.addBox(e());
        mediaBox.addBox(g());
        mediaBox.addBox(i());
        return mediaBox;
    }

    protected com.coremedia.iso.boxes.b g() {
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setHandlerType(this.f70138c.getHandler());
        return handlerBox;
    }

    protected com.coremedia.iso.boxes.b i() {
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧸\u0001"))) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧹\u0001"))) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧺\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧻\u0001"))) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧼\u0001"))) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (this.f70138c.getHandler().equals(ProtectedSandApp.s("᧽\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        mediaInformationBox.addBox(b());
        mediaInformationBox.addBox(o());
        return mediaInformationBox;
    }

    protected com.coremedia.iso.boxes.b l() {
        MovieBox movieBox = new MovieBox();
        movieBox.addBox(n());
        movieBox.addBox(u());
        movieBox.addBox(m());
        return movieBox;
    }

    protected com.coremedia.iso.boxes.b m() {
        MovieExtendsBox movieExtendsBox = new MovieExtendsBox();
        MovieExtendsHeaderBox movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        movieExtendsHeaderBox.setVersion(1);
        movieExtendsHeaderBox.setFragmentDuration(0L);
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        movieExtendsBox.addBox(x());
        return movieExtendsBox;
    }

    protected com.coremedia.iso.boxes.b n() {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(this.f70141f);
        movieHeaderBox.setModificationTime(this.f70141f);
        movieHeaderBox.setDuration(0L);
        movieHeaderBox.setTimescale(this.f70138c.d());
        movieHeaderBox.setNextTrackId(2L);
        return movieHeaderBox;
    }

    protected com.coremedia.iso.boxes.b o() {
        SampleTableBox sampleTableBox = new SampleTableBox();
        sampleTableBox.addBox(this.f70138c.getSampleDescriptionBox());
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new SampleToChunkBox());
        sampleTableBox.addBox(new SampleSizeBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }

    protected void q(TrackFragmentBox trackFragmentBox) {
        TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox = new TrackFragmentBaseMediaDecodeTimeBox();
        trackFragmentBaseMediaDecodeTimeBox.setVersion(1);
        trackFragmentBaseMediaDecodeTimeBox.setBaseMediaDecodeTime(this.f70144i);
        trackFragmentBox.addBox(trackFragmentBaseMediaDecodeTimeBox);
    }

    protected void s(TrackFragmentBox trackFragmentBox) {
        TrackFragmentHeaderBox trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new com.coremedia.iso.boxes.fragment.a());
        trackFragmentHeaderBox.setBaseDataOffset(-1L);
        h hVar = (h) this.f70138c.c(h.class);
        if (hVar != null) {
            trackFragmentHeaderBox.setTrackId(hVar.a());
        } else {
            trackFragmentHeaderBox.setTrackId(1L);
        }
        trackFragmentHeaderBox.setDefaultBaseIsMoof(true);
        trackFragmentBox.addBox(trackFragmentHeaderBox);
    }

    protected com.coremedia.iso.boxes.b u() {
        TrackBox trackBox = new TrackBox();
        trackBox.addBox(this.f70138c.f());
        trackBox.addBox(f());
        return trackBox;
    }

    @Override // com.mp4parser.streaming.c
    public void w() throws IOException {
        d poll;
        WritableByteChannel newChannel = Channels.newChannel(this.f70137b);
        c().getBox(newChannel);
        l().getBox(newChannel);
        while (true) {
            try {
                poll = this.f70138c.A().poll(100L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (poll != null) {
                a(poll, newChannel);
            } else if (!this.f70138c.g()) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (com.flashget.parentalcontrol.ProtectedSandApp.s("᧻\u0001").equals(r4.f70138c.getHandler()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.coremedia.iso.boxes.b x() {
        /*
            r4 = this;
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r0 = new com.coremedia.iso.boxes.fragment.TrackExtendsBox
            r0.<init>()
            com.mp4parser.streaming.f r1 = r4.f70138c
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r1.f()
            long r1 = r1.getTrackId()
            r0.setTrackId(r1)
            r1 = 1
            r0.setDefaultSampleDescriptionIndex(r1)
            r1 = 0
            r0.setDefaultSampleDuration(r1)
            r0.setDefaultSampleSize(r1)
            com.coremedia.iso.boxes.fragment.a r1 = new com.coremedia.iso.boxes.fragment.a
            r1.<init>()
            com.mp4parser.streaming.f r2 = r4.f70138c
            java.lang.String r2 = r2.getHandler()
            java.lang.String r3 = "᧹\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L48
            com.mp4parser.streaming.f r2 = r4.f70138c
            java.lang.String r2 = r2.getHandler()
            java.lang.String r3 = "᧻\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4f
        L48:
            r2 = 2
            r1.m(r2)
            r1.o(r2)
        L4f:
            r0.setDefaultSampleFlags(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mp4parser.streaming.SingleTrackFragmentedMp4Writer.x():com.coremedia.iso.boxes.b");
    }

    protected void y(TrackFragmentBox trackFragmentBox) {
        TrackRunBox trackRunBox = new TrackRunBox();
        trackRunBox.setVersion(1);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        ArrayList arrayList = new ArrayList(this.f70142g.size());
        trackRunBox.setSampleCompositionTimeOffsetPresent(this.f70138c.c(lb.c.class) != null);
        boolean z4 = this.f70138c.c(lb.f.class) != null;
        trackRunBox.setSampleFlagsPresent(z4);
        for (d dVar : this.f70142g) {
            TrackRunBox.a aVar = new TrackRunBox.a();
            aVar.p(dVar.getContent().remaining());
            if (z4) {
                lb.e eVar = (lb.e) e.a(dVar, lb.e.class);
                com.coremedia.iso.boxes.fragment.a aVar2 = new com.coremedia.iso.boxes.fragment.a();
                aVar2.j(eVar.b());
                aVar2.o(eVar.f());
                aVar2.m(eVar.d());
                aVar2.n(eVar.e());
                aVar2.p(eVar.h());
                aVar2.q(eVar.g());
                aVar2.l(eVar.c());
                aVar.o(aVar2);
            }
            aVar.n(dVar.getDuration());
            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                aVar.m(((lb.b) e.a(dVar, lb.b.class)).b());
            }
            arrayList.add(aVar);
        }
        trackRunBox.setEntries(arrayList);
        trackFragmentBox.addBox(trackRunBox);
    }
}
