package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: Avc1ToAvc3TrackImpl.java */
/* loaded from: classes6.dex */
public class f extends com.googlecode.mp4parser.authoring.j {

    /* renamed from: c, reason: collision with root package name */
    SampleDescriptionBox f63515c;

    /* renamed from: d, reason: collision with root package name */
    AvcConfigurationBox f63516d;

    /* renamed from: e, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63517e;

    /* compiled from: Avc1ToAvc3TrackImpl.java */
    private class a extends AbstractList<com.googlecode.mp4parser.authoring.f> {

        /* renamed from: b, reason: collision with root package name */
        List<com.googlecode.mp4parser.authoring.f> f63518b;

        /* compiled from: Avc1ToAvc3TrackImpl.java */
        /* renamed from: com.googlecode.mp4parser.authoring.tracks.f$a$a, reason: collision with other inner class name */
        class C0962a implements com.googlecode.mp4parser.authoring.f {

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ ByteBuffer f63521b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ int f63522c;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ com.googlecode.mp4parser.authoring.f f63523d;

            C0962a(ByteBuffer byteBuffer, int i4, com.googlecode.mp4parser.authoring.f fVar) {
                this.f63521b = byteBuffer;
                this.f63522c = i4;
                this.f63523d = fVar;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public ByteBuffer a() {
                Iterator<byte[]> it = f.this.f63516d.getSequenceParameterSets().iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    i4 += this.f63522c + it.next().length;
                }
                Iterator<byte[]> it2 = f.this.f63516d.getSequenceParameterSetExts().iterator();
                while (it2.hasNext()) {
                    i4 += this.f63522c + it2.next().length;
                }
                Iterator<byte[]> it3 = f.this.f63516d.getPictureParameterSets().iterator();
                while (it3.hasNext()) {
                    i4 += this.f63522c + it3.next().length;
                }
                ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(this.f63523d.getSize()) + i4);
                for (byte[] bArr : f.this.f63516d.getSequenceParameterSets()) {
                    com.coremedia.iso.j.a(bArr.length, allocate, this.f63522c);
                    allocate.put(bArr);
                }
                for (byte[] bArr2 : f.this.f63516d.getSequenceParameterSetExts()) {
                    com.coremedia.iso.j.a(bArr2.length, allocate, this.f63522c);
                    allocate.put(bArr2);
                }
                for (byte[] bArr3 : f.this.f63516d.getPictureParameterSets()) {
                    com.coremedia.iso.j.a(bArr3.length, allocate, this.f63522c);
                    allocate.put(bArr3);
                }
                allocate.put(this.f63523d.a());
                return (ByteBuffer) allocate.rewind();
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public void b(WritableByteChannel writableByteChannel) throws IOException {
                for (byte[] bArr : f.this.f63516d.getSequenceParameterSets()) {
                    com.coremedia.iso.j.a(bArr.length, (ByteBuffer) this.f63521b.rewind(), this.f63522c);
                    writableByteChannel.write((ByteBuffer) this.f63521b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                }
                for (byte[] bArr2 : f.this.f63516d.getSequenceParameterSetExts()) {
                    com.coremedia.iso.j.a(bArr2.length, (ByteBuffer) this.f63521b.rewind(), this.f63522c);
                    writableByteChannel.write((ByteBuffer) this.f63521b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr2));
                }
                for (byte[] bArr3 : f.this.f63516d.getPictureParameterSets()) {
                    com.coremedia.iso.j.a(bArr3.length, (ByteBuffer) this.f63521b.rewind(), this.f63522c);
                    writableByteChannel.write((ByteBuffer) this.f63521b.rewind());
                    writableByteChannel.write(ByteBuffer.wrap(bArr3));
                }
                this.f63523d.b(writableByteChannel);
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public long getSize() {
                Iterator<byte[]> it = f.this.f63516d.getSequenceParameterSets().iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    i4 += this.f63522c + it.next().length;
                }
                Iterator<byte[]> it2 = f.this.f63516d.getSequenceParameterSetExts().iterator();
                while (it2.hasNext()) {
                    i4 += this.f63522c + it2.next().length;
                }
                Iterator<byte[]> it3 = f.this.f63516d.getPictureParameterSets().iterator();
                while (it3.hasNext()) {
                    i4 += this.f63522c + it3.next().length;
                }
                return this.f63523d.getSize() + i4;
            }
        }

        public a(List<com.googlecode.mp4parser.authoring.f> list) {
            this.f63518b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.googlecode.mp4parser.authoring.f get(int i4) {
            if (Arrays.binarySearch(f.this.z0(), i4 + 1) < 0) {
                return this.f63518b.get(i4);
            }
            int lengthSizeMinusOne = f.this.f63516d.getLengthSizeMinusOne() + 1;
            return new C0962a(ByteBuffer.allocate(lengthSizeMinusOne), lengthSizeMinusOne, this.f63518b.get(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f63518b.size();
        }
    }

    public f(com.googlecode.mp4parser.authoring.h hVar) throws IOException {
        super(hVar);
        if (!ProtectedSandApp.s("റ\u0001").equals(hVar.getSampleDescriptionBox().getSampleEntry().getType())) {
            throw new RuntimeException(ProtectedSandApp.s("വ\u0001"));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        hVar.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
        SampleDescriptionBox sampleDescriptionBox = (SampleDescriptionBox) com.googlecode.mp4parser.util.m.d(new com.coremedia.iso.f(new com.googlecode.mp4parser.e(byteArrayOutputStream.toByteArray())), ProtectedSandApp.s("ല\u0001"));
        this.f63515c = sampleDescriptionBox;
        ((VisualSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(ProtectedSandApp.s("ള\u0001"));
        this.f63516d = (AvcConfigurationBox) com.googlecode.mp4parser.util.m.e(this.f63515c, ProtectedSandApp.s("ഴ\u0001"));
        this.f63517e = new a(hVar.A());
    }

    @Override // com.googlecode.mp4parser.authoring.j, com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63517e;
    }

    @Override // com.googlecode.mp4parser.authoring.j, com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63515c;
    }
}
