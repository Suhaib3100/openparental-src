package com.mp4parser.streaming;

import androidx.compose.runtime.z4;
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
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.j;
import com.googlecode.mp4parser.util.l;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lb.h;

/* loaded from: classes6.dex */
public class MultiTrackFragmentedMp4Writer implements c {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f70124k = false;

    /* renamed from: b, reason: collision with root package name */
    private final OutputStream f70125b;

    /* renamed from: c, reason: collision with root package name */
    f[] f70126c;

    /* renamed from: d, reason: collision with root package name */
    lb.c f70127d;

    /* renamed from: e, reason: collision with root package name */
    lb.f f70128e;

    /* renamed from: g, reason: collision with root package name */
    Map<f, List<d>> f70130g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private long f70131h = 1;

    /* renamed from: i, reason: collision with root package name */
    private long f70132i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f70133j = 0;

    /* renamed from: f, reason: collision with root package name */
    Date f70129f = new Date();

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        private f f70134a;

        public a(f fVar) {
            this.f70134a = fVar;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            d poll;
            while (true) {
                try {
                    poll = this.f70134a.A().poll(100L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
                if (poll != null) {
                    MultiTrackFragmentedMp4Writer.this.b(this.f70134a, poll);
                } else if (!this.f70134a.g()) {
                    return null;
                }
            }
        }
    }

    public MultiTrackFragmentedMp4Writer(f[] fVarArr, OutputStream outputStream) {
        this.f70126c = fVarArr;
        this.f70125b = outputStream;
        HashSet hashSet = new HashSet();
        for (f fVar : fVarArr) {
            if (fVar.c(h.class) != null && hashSet.contains(Long.valueOf(((h) fVar.c(h.class)).a()))) {
                throw new RuntimeException(ProtectedSandApp.s("᧩\u0001"));
            }
        }
        for (f fVar2 : fVarArr) {
            if (fVar2.c(h.class) != null) {
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList);
                fVar2.e(new h(arrayList.size() > 0 ? ((Long) z4.a(arrayList, 1)).longValue() + 1 : 1L));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(f fVar, d dVar) throws IOException {
        try {
            lb.e eVar = null;
            for (b bVar : dVar.a()) {
                if (bVar instanceof lb.e) {
                    eVar = (lb.e) bVar;
                } else {
                    boolean z4 = bVar instanceof lb.b;
                }
            }
            this.f70133j += dVar.getDuration();
            this.f70130g.get(fVar).add(dVar);
            if (this.f70133j > (fVar.d() * 3) + this.f70132i) {
                if (this.f70130g.size() > 0) {
                    if (this.f70128e != null) {
                        if (eVar != null) {
                            if (eVar.i()) {
                            }
                        }
                    }
                    WritableByteChannel newChannel = Channels.newChannel(this.f70125b);
                    l(fVar).getBox(newChannel);
                    e(fVar).getBox(newChannel);
                    this.f70132i = this.f70133j;
                    this.f70130g.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private com.coremedia.iso.boxes.b e(final f fVar) {
        return new WriteOnlyBox(ProtectedSandApp.s("᧪\u0001")) { // from class: com.mp4parser.streaming.MultiTrackFragmentedMp4Writer.1
            @Override // com.coremedia.iso.boxes.b
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = MultiTrackFragmentedMp4Writer.this.f70130g.get(fVar).iterator();
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
                while (MultiTrackFragmentedMp4Writer.this.f70130g.get(fVar).iterator().hasNext()) {
                    j4 += r0.next().getContent().remaining();
                }
                return j4;
            }
        };
    }

    private void i(long j4, MovieFragmentBox movieFragmentBox) {
        MovieFragmentHeaderBox movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber(j4);
        movieFragmentBox.addBox(movieFragmentHeaderBox);
    }

    private com.coremedia.iso.boxes.b l(f fVar) {
        MovieFragmentBox movieFragmentBox = new MovieFragmentBox();
        i(this.f70131h, movieFragmentBox);
        u(fVar, movieFragmentBox);
        TrackRunBox trackRunBox = movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int) (movieFragmentBox.getSize() + 8));
        this.f70131h++;
        return movieFragmentBox;
    }

    private void u(f fVar, MovieFragmentBox movieFragmentBox) {
        TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        movieFragmentBox.addBox(trackFragmentBox);
        t(fVar, trackFragmentBox);
        s(trackFragmentBox);
        z(fVar, trackFragmentBox);
        fVar.c(lb.a.class);
    }

    protected DataInformationBox c() {
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }

    @Override // com.mp4parser.streaming.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public com.coremedia.iso.boxes.b d() {
        LinkedList linkedList = new LinkedList();
        String s4 = ProtectedSandApp.s("᧫\u0001");
        linkedList.add(s4);
        linkedList.add(ProtectedSandApp.s("᧬\u0001"));
        linkedList.add(ProtectedSandApp.s("᧭\u0001"));
        return new FileTypeBox(s4, 0L, linkedList);
    }

    protected com.coremedia.iso.boxes.b f(f fVar) {
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(this.f70129f);
        mediaHeaderBox.setModificationTime(this.f70129f);
        mediaHeaderBox.setDuration(0L);
        mediaHeaderBox.setTimescale(fVar.d());
        mediaHeaderBox.setLanguage(fVar.a());
        return mediaHeaderBox;
    }

    protected com.coremedia.iso.boxes.b g(f fVar) {
        MediaBox mediaBox = new MediaBox();
        mediaBox.addBox(f(fVar));
        mediaBox.addBox(h(fVar));
        mediaBox.addBox(k(fVar));
        return mediaBox;
    }

    protected com.coremedia.iso.boxes.b h(f fVar) {
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setHandlerType(fVar.getHandler());
        return handlerBox;
    }

    protected com.coremedia.iso.boxes.b k(f fVar) {
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (fVar.getHandler().equals(ProtectedSandApp.s("᧮\u0001"))) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (fVar.getHandler().equals(ProtectedSandApp.s("᧯\u0001"))) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (fVar.getHandler().equals(ProtectedSandApp.s("᧰\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (fVar.getHandler().equals(ProtectedSandApp.s("᧱\u0001"))) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (fVar.getHandler().equals(ProtectedSandApp.s("᧲\u0001"))) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (fVar.getHandler().equals(ProtectedSandApp.s("᧳\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        mediaInformationBox.addBox(c());
        mediaInformationBox.addBox(q(fVar));
        return mediaInformationBox;
    }

    protected com.coremedia.iso.boxes.b m() {
        MovieBox movieBox = new MovieBox();
        movieBox.addBox(o());
        for (f fVar : this.f70126c) {
            movieBox.addBox(x(fVar));
        }
        movieBox.addBox(n());
        return movieBox;
    }

    protected com.coremedia.iso.boxes.b n() {
        MovieExtendsBox movieExtendsBox = new MovieExtendsBox();
        MovieExtendsHeaderBox movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        movieExtendsHeaderBox.setVersion(1);
        movieExtendsHeaderBox.setFragmentDuration(0L);
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        for (f fVar : this.f70126c) {
            movieExtendsBox.addBox(y(fVar));
        }
        return movieExtendsBox;
    }

    protected com.coremedia.iso.boxes.b o() {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(this.f70129f);
        movieHeaderBox.setModificationTime(this.f70129f);
        movieHeaderBox.setDuration(0L);
        long[] jArr = new long[0];
        for (f fVar : this.f70126c) {
            l.c(jArr, fVar.d());
        }
        movieHeaderBox.setTimescale(j.e(jArr));
        movieHeaderBox.setNextTrackId(2L);
        return movieHeaderBox;
    }

    protected com.coremedia.iso.boxes.b q(f fVar) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        sampleTableBox.addBox(fVar.getSampleDescriptionBox());
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new SampleToChunkBox());
        sampleTableBox.addBox(new SampleSizeBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }

    protected void s(TrackFragmentBox trackFragmentBox) {
        TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox = new TrackFragmentBaseMediaDecodeTimeBox();
        trackFragmentBaseMediaDecodeTimeBox.setVersion(1);
        trackFragmentBaseMediaDecodeTimeBox.setBaseMediaDecodeTime(this.f70132i);
        trackFragmentBox.addBox(trackFragmentBaseMediaDecodeTimeBox);
    }

    protected void t(f fVar, TrackFragmentBox trackFragmentBox) {
        TrackFragmentHeaderBox trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new com.coremedia.iso.boxes.fragment.a());
        trackFragmentHeaderBox.setBaseDataOffset(-1L);
        trackFragmentHeaderBox.setTrackId(((h) fVar.c(h.class)).a());
        trackFragmentHeaderBox.setDefaultBaseIsMoof(true);
        trackFragmentBox.addBox(trackFragmentHeaderBox);
    }

    @Override // com.mp4parser.streaming.c
    public void w() throws IOException {
        WritableByteChannel newChannel = Channels.newChannel(this.f70125b);
        d().getBox(newChannel);
        m().getBox(newChannel);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f70126c.length);
        for (f fVar : this.f70126c) {
            newFixedThreadPool.submit(new a(fVar));
        }
    }

    protected com.coremedia.iso.boxes.b x(f fVar) {
        TrackBox trackBox = new TrackBox();
        trackBox.addBox(fVar.f());
        trackBox.addBox(fVar.f());
        trackBox.addBox(g(fVar));
        return trackBox;
    }

    protected com.coremedia.iso.boxes.b y(f fVar) {
        TrackExtendsBox trackExtendsBox = new TrackExtendsBox();
        trackExtendsBox.setTrackId(fVar.f().getTrackId());
        trackExtendsBox.setDefaultSampleDescriptionIndex(1L);
        trackExtendsBox.setDefaultSampleDuration(0L);
        trackExtendsBox.setDefaultSampleSize(0L);
        com.coremedia.iso.boxes.fragment.a aVar = new com.coremedia.iso.boxes.fragment.a();
        if (ProtectedSandApp.s("᧯\u0001").equals(fVar.getHandler()) || ProtectedSandApp.s("᧱\u0001").equals(fVar.getHandler())) {
            aVar.m(2);
            aVar.o(2);
        }
        trackExtendsBox.setDefaultSampleFlags(aVar);
        return trackExtendsBox;
    }

    protected void z(f fVar, TrackFragmentBox trackFragmentBox) {
        TrackRunBox trackRunBox = new TrackRunBox();
        trackRunBox.setVersion(1);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        ArrayList arrayList = new ArrayList(this.f70130g.size());
        trackRunBox.setSampleCompositionTimeOffsetPresent(fVar.c(lb.c.class) != null);
        boolean z4 = fVar.c(lb.f.class) != null;
        trackRunBox.setSampleFlagsPresent(z4);
        for (d dVar : this.f70130g.get(fVar)) {
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
