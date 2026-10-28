package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: AppendTrack.java */
/* loaded from: classes6.dex */
public class e extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: i, reason: collision with root package name */
    private static com.googlecode.mp4parser.util.i f63510i = com.googlecode.mp4parser.util.i.a(e.class);

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h[] f63511e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63512f;

    /* renamed from: g, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63513g;

    /* renamed from: h, reason: collision with root package name */
    long[] f63514h;

    public e(com.googlecode.mp4parser.authoring.h... hVarArr) throws IOException {
        super(a(hVarArr));
        this.f63511e = hVarArr;
        for (com.googlecode.mp4parser.authoring.h hVar : hVarArr) {
            SampleDescriptionBox sampleDescriptionBox = this.f63512f;
            if (sampleDescriptionBox == null) {
                SampleDescriptionBox sampleDescriptionBox2 = new SampleDescriptionBox();
                this.f63512f = sampleDescriptionBox2;
                sampleDescriptionBox2.addBox((com.coremedia.iso.boxes.b) hVar.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } else {
                this.f63512f = e(sampleDescriptionBox, hVar.getSampleDescriptionBox());
            }
        }
        this.f63513g = new ArrayList();
        for (com.googlecode.mp4parser.authoring.h hVar2 : hVarArr) {
            this.f63513g.addAll(hVar2.A());
        }
        int i4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar3 : hVarArr) {
            i4 += hVar3.S2().length;
        }
        this.f63514h = new long[i4];
        int i5 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar4 : hVarArr) {
            long[] S2 = hVar4.S2();
            System.arraycopy(S2, 0, this.f63514h, i5, S2.length);
            i5 += S2.length;
        }
    }

    public static String a(com.googlecode.mp4parser.authoring.h... hVarArr) {
        String str = "";
        for (com.googlecode.mp4parser.authoring.h hVar : hVarArr) {
            str = String.valueOf(str) + hVar.getName() + ProtectedSandApp.s("ഢ\u0001");
        }
        return androidx.core.content.f.a(str, 3, 0);
    }

    private AudioSampleEntry b(AudioSampleEntry audioSampleEntry, AudioSampleEntry audioSampleEntry2) {
        AudioSampleEntry audioSampleEntry3 = new AudioSampleEntry(audioSampleEntry2.getType());
        if (audioSampleEntry.getBytesPerFrame() != audioSampleEntry2.getBytesPerFrame()) {
            f63510i.c(ProtectedSandApp.s("ദ\u0001"));
            return null;
        }
        audioSampleEntry3.setBytesPerFrame(audioSampleEntry.getBytesPerFrame());
        if (audioSampleEntry.getBytesPerPacket() == audioSampleEntry2.getBytesPerPacket()) {
            audioSampleEntry3.setBytesPerPacket(audioSampleEntry.getBytesPerPacket());
            if (audioSampleEntry.getBytesPerSample() == audioSampleEntry2.getBytesPerSample()) {
                audioSampleEntry3.setBytesPerSample(audioSampleEntry.getBytesPerSample());
                if (audioSampleEntry.getChannelCount() == audioSampleEntry2.getChannelCount()) {
                    audioSampleEntry3.setChannelCount(audioSampleEntry.getChannelCount());
                    if (audioSampleEntry.getPacketSize() == audioSampleEntry2.getPacketSize()) {
                        audioSampleEntry3.setPacketSize(audioSampleEntry.getPacketSize());
                        if (audioSampleEntry.getCompressionId() == audioSampleEntry2.getCompressionId()) {
                            audioSampleEntry3.setCompressionId(audioSampleEntry.getCompressionId());
                            if (audioSampleEntry.getSampleRate() == audioSampleEntry2.getSampleRate()) {
                                audioSampleEntry3.setSampleRate(audioSampleEntry.getSampleRate());
                                if (audioSampleEntry.getSampleSize() == audioSampleEntry2.getSampleSize()) {
                                    audioSampleEntry3.setSampleSize(audioSampleEntry.getSampleSize());
                                    if (audioSampleEntry.getSamplesPerPacket() == audioSampleEntry2.getSamplesPerPacket()) {
                                        audioSampleEntry3.setSamplesPerPacket(audioSampleEntry.getSamplesPerPacket());
                                        if (audioSampleEntry.getSoundVersion() == audioSampleEntry2.getSoundVersion()) {
                                            audioSampleEntry3.setSoundVersion(audioSampleEntry.getSoundVersion());
                                            if (Arrays.equals(audioSampleEntry.getSoundVersion2Data(), audioSampleEntry2.getSoundVersion2Data())) {
                                                audioSampleEntry3.setSoundVersion2Data(audioSampleEntry.getSoundVersion2Data());
                                                if (audioSampleEntry.getBoxes().size() == audioSampleEntry2.getBoxes().size()) {
                                                    Iterator<com.coremedia.iso.boxes.b> it = audioSampleEntry2.getBoxes().iterator();
                                                    for (com.coremedia.iso.boxes.b bVar : audioSampleEntry.getBoxes()) {
                                                        com.coremedia.iso.boxes.b next = it.next();
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                        try {
                                                            bVar.getBox(Channels.newChannel(byteArrayOutputStream));
                                                            next.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                            if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                                audioSampleEntry3.addBox(bVar);
                                                            } else {
                                                                String type = bVar.getType();
                                                                String s4 = ProtectedSandApp.s("ണ\u0001");
                                                                if (s4.equals(type) && s4.equals(next.getType())) {
                                                                    ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) bVar;
                                                                    eSDescriptorBox.setDescriptor(c(eSDescriptorBox.getEsDescriptor(), ((ESDescriptorBox) next).getEsDescriptor()));
                                                                    audioSampleEntry3.addBox(bVar);
                                                                }
                                                            }
                                                        } catch (IOException e4) {
                                                            f63510i.d(e4.getMessage());
                                                            return null;
                                                        }
                                                    }
                                                }
                                                return audioSampleEntry3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    f63510i.c(ProtectedSandApp.s("ത\u0001"));
                }
                return null;
            }
            f63510i.c(ProtectedSandApp.s("ഥ\u0001"));
        }
        return null;
    }

    private com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h c(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b bVar, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b bVar2) {
        if (!(bVar instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h) || !(bVar2 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h)) {
            f63510i.c(ProtectedSandApp.s("ധ\u0001"));
            return null;
        }
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h hVar = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h) bVar;
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h hVar2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h) bVar2;
        if (hVar.q() != hVar2.q()) {
            return null;
        }
        hVar.r();
        hVar2.r();
        if (hVar.j() != hVar2.j() || hVar.k() != hVar2.k() || hVar.t() != hVar2.t() || hVar.u() != hVar2.u() || hVar.m() != hVar2.m() || hVar.o() != hVar2.o()) {
            return null;
        }
        hVar.p();
        hVar2.p();
        if (hVar.s() != null) {
            hVar.s().equals(hVar2.s());
        } else {
            hVar2.s();
        }
        if (hVar.i() == null ? hVar2.i() != null : !hVar.i().equals(hVar2.i())) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e i4 = hVar.i();
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e i5 = hVar2.i();
            if (i4.i() != null && i5.i() != null && !i4.i().equals(i5.i())) {
                return null;
            }
            if (i4.j() != i5.j()) {
                i4.s((i5.j() + i4.j()) / 2);
            }
            i4.k();
            i5.k();
            if (i4.l() == null ? i5.l() != null : !i4.l().equals(i5.l())) {
                return null;
            }
            if (i4.m() != i5.m()) {
                i4.v(Math.max(i4.m(), i5.m()));
            }
            if (!i4.o().equals(i5.o()) || i4.n() != i5.n() || i4.p() != i5.p() || i4.q() != i5.q()) {
                return null;
            }
        }
        if (hVar.l() == null ? hVar2.l() != null : !hVar.l().equals(hVar2.l())) {
            return null;
        }
        if (hVar.n() == null ? hVar2.n() == null : hVar.n().equals(hVar2.n())) {
            return hVar;
        }
        return null;
    }

    private SampleEntry d(SampleEntry sampleEntry, SampleEntry sampleEntry2) {
        if (!sampleEntry.getType().equals(sampleEntry2.getType())) {
            return null;
        }
        if ((sampleEntry instanceof VisualSampleEntry) && (sampleEntry2 instanceof VisualSampleEntry)) {
            return f((VisualSampleEntry) sampleEntry, (VisualSampleEntry) sampleEntry2);
        }
        if ((sampleEntry instanceof AudioSampleEntry) && (sampleEntry2 instanceof AudioSampleEntry)) {
            return b((AudioSampleEntry) sampleEntry, (AudioSampleEntry) sampleEntry2);
        }
        return null;
    }

    private SampleDescriptionBox e(SampleDescriptionBox sampleDescriptionBox, SampleDescriptionBox sampleDescriptionBox2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sampleDescriptionBox.getBox(Channels.newChannel(byteArrayOutputStream));
            sampleDescriptionBox2.getBox(Channels.newChannel(byteArrayOutputStream2));
            if (!Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                SampleEntry d5 = d((SampleEntry) sampleDescriptionBox.getBoxes(SampleEntry.class).get(0), (SampleEntry) sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                if (d5 == null) {
                    throw new IOException(ProtectedSandApp.s("ന\u0001") + sampleDescriptionBox.getBoxes(SampleEntry.class).get(0) + ProtectedSandApp.s("ഩ\u0001") + sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                }
                sampleDescriptionBox.setBoxes(Collections.singletonList(d5));
            }
            return sampleDescriptionBox;
        } catch (IOException e4) {
            f63510i.c(e4.getMessage());
            return null;
        }
    }

    private VisualSampleEntry f(VisualSampleEntry visualSampleEntry, VisualSampleEntry visualSampleEntry2) {
        VisualSampleEntry visualSampleEntry3 = new VisualSampleEntry();
        if (visualSampleEntry.getHorizresolution() != visualSampleEntry2.getHorizresolution()) {
            f63510i.c(ProtectedSandApp.s("ര\u0001"));
            return null;
        }
        visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
        visualSampleEntry3.setCompressorname(visualSampleEntry.getCompressorname());
        if (visualSampleEntry.getDepth() != visualSampleEntry2.getDepth()) {
            f63510i.c(ProtectedSandApp.s("യ\u0001"));
            return null;
        }
        visualSampleEntry3.setDepth(visualSampleEntry.getDepth());
        if (visualSampleEntry.getFrameCount() != visualSampleEntry2.getFrameCount()) {
            f63510i.c(ProtectedSandApp.s("മ\u0001"));
            return null;
        }
        visualSampleEntry3.setFrameCount(visualSampleEntry.getFrameCount());
        if (visualSampleEntry.getHeight() != visualSampleEntry2.getHeight()) {
            f63510i.c(ProtectedSandApp.s("ഭ\u0001"));
            return null;
        }
        visualSampleEntry3.setHeight(visualSampleEntry.getHeight());
        if (visualSampleEntry.getWidth() != visualSampleEntry2.getWidth()) {
            f63510i.c(ProtectedSandApp.s("ബ\u0001"));
            return null;
        }
        visualSampleEntry3.setWidth(visualSampleEntry.getWidth());
        if (visualSampleEntry.getVertresolution() != visualSampleEntry2.getVertresolution()) {
            f63510i.c(ProtectedSandApp.s("ഫ\u0001"));
            return null;
        }
        visualSampleEntry3.setVertresolution(visualSampleEntry.getVertresolution());
        if (visualSampleEntry.getHorizresolution() != visualSampleEntry2.getHorizresolution()) {
            f63510i.c(ProtectedSandApp.s("പ\u0001"));
            return null;
        }
        visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
        if (visualSampleEntry.getBoxes().size() == visualSampleEntry2.getBoxes().size()) {
            Iterator<com.coremedia.iso.boxes.b> it = visualSampleEntry2.getBoxes().iterator();
            for (com.coremedia.iso.boxes.b bVar : visualSampleEntry.getBoxes()) {
                com.coremedia.iso.boxes.b next = it.next();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bVar.getBox(Channels.newChannel(byteArrayOutputStream));
                    next.getBox(Channels.newChannel(byteArrayOutputStream2));
                    if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                        visualSampleEntry3.addBox(bVar);
                    } else if ((bVar instanceof AbstractDescriptorBox) && (next instanceof AbstractDescriptorBox)) {
                        AbstractDescriptorBox abstractDescriptorBox = (AbstractDescriptorBox) bVar;
                        abstractDescriptorBox.setDescriptor(c(abstractDescriptorBox.getDescriptor(), ((AbstractDescriptorBox) next).getDescriptor()));
                        visualSampleEntry3.addBox(bVar);
                    }
                } catch (IOException e4) {
                    f63510i.d(e4.getMessage());
                    return null;
                }
            }
        }
        return visualSampleEntry3;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63513g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63511e[0].E0();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        if (this.f63511e[0].I3() == null || this.f63511e[0].I3().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (com.googlecode.mp4parser.authoring.h hVar : this.f63511e) {
            linkedList.addAll(hVar.I3());
        }
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] S2() {
        return this.f63514h;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        if (this.f63511e[0].W() == null || this.f63511e[0].W().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (com.googlecode.mp4parser.authoring.h hVar : this.f63511e) {
            linkedList.add(CompositionTimeToSample.blowupCompositionTimes(hVar.W()));
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i4 : iArr) {
                if (linkedList2.isEmpty() || ((CompositionTimeToSample.a) linkedList2.getLast()).b() != i4) {
                    linkedList2.add(new CompositionTimeToSample.a(1, i4));
                } else {
                    CompositionTimeToSample.a aVar = (CompositionTimeToSample.a) linkedList2.getLast();
                    aVar.c(aVar.a() + 1);
                }
            }
        }
        return linkedList2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (com.googlecode.mp4parser.authoring.h hVar : this.f63511e) {
            hVar.close();
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63511e[0].getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63512f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63511e[0].u2();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        if (this.f63511e[0].z0() == null || this.f63511e[0].z0().length <= 0) {
            return null;
        }
        int i4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar : this.f63511e) {
            i4 += hVar.z0() != null ? hVar.z0().length : 0;
        }
        long[] jArr = new long[i4];
        long j4 = 0;
        int i5 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar2 : this.f63511e) {
            if (hVar2.z0() != null) {
                long[] z02 = hVar2.z0();
                int length = z02.length;
                int i6 = 0;
                while (i6 < length) {
                    jArr[i5] = z02[i6] + j4;
                    i6++;
                    i5++;
                }
            }
            j4 += hVar2.A().size();
        }
        return jArr;
    }
}
