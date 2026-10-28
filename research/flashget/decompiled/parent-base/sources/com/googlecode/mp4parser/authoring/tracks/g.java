package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;

/* compiled from: CencDecryptingTrackImpl.java */
/* loaded from: classes6.dex */
public class g extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.boxes.cenc.a f63524e;

    /* renamed from: f, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63525f;

    /* renamed from: g, reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, SecretKey> f63526g;

    public g(h hVar, SecretKey secretKey) {
        this(hVar, (Map<UUID, SecretKey>) Collections.singletonMap(hVar.r2(), secretKey));
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63524e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63525f.S2();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63525f.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63525f.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        OriginalFormatBox originalFormatBox = (OriginalFormatBox) com.googlecode.mp4parser.util.m.e(this.f63525f.getSampleDescriptionBox(), ProtectedSandApp.s("ാ\u0001"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f63525f.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
            SampleDescriptionBox sampleDescriptionBox = (SampleDescriptionBox) new com.coremedia.iso.f(new com.googlecode.mp4parser.e(byteArrayOutputStream.toByteArray())).getBoxes().get(0);
            if (sampleDescriptionBox.getSampleEntry() instanceof AudioSampleEntry) {
                ((AudioSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(originalFormatBox.getDataFormat());
            } else {
                if (!(sampleDescriptionBox.getSampleEntry() instanceof VisualSampleEntry)) {
                    throw new RuntimeException(ProtectedSandApp.s("ീ\u0001") + sampleDescriptionBox.getSampleEntry().getType());
                }
                ((VisualSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(originalFormatBox.getDataFormat());
            }
            LinkedList linkedList = new LinkedList();
            for (com.coremedia.iso.boxes.b bVar : sampleDescriptionBox.getSampleEntry().getBoxes()) {
                if (!bVar.getType().equals(ProtectedSandApp.s("ി\u0001"))) {
                    linkedList.add(bVar);
                }
            }
            sampleDescriptionBox.getSampleEntry().setBoxes(linkedList);
            return sampleDescriptionBox;
        } catch (IOException unused) {
            throw new RuntimeException(ProtectedSandApp.s("ു\u0001"));
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63525f.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63525f.z0();
    }

    public g(h hVar, Map<UUID, SecretKey> map) {
        super(ProtectedSandApp.s("ശ\u0001") + hVar.getName() + ProtectedSandApp.s("ഷ\u0001"));
        this.f63526g = new com.googlecode.mp4parser.util.n<>();
        this.f63525f = hVar;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) com.googlecode.mp4parser.util.m.e(hVar.getSampleDescriptionBox(), ProtectedSandApp.s("സ\u0001"));
        if (!ProtectedSandApp.s("ഹ\u0001").equals(schemeTypeBox.getSchemeType()) && !ProtectedSandApp.s("ഺ\u0001").equals(schemeTypeBox.getSchemeType())) {
            throw new RuntimeException(ProtectedSandApp.s("഻\u0001"));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : hVar.k2().entrySet()) {
            if (entry.getKey() instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) {
                arrayList.add((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) entry.getKey());
            } else {
                k2().put(entry.getKey(), entry.getValue());
            }
        }
        int i4 = -1;
        for (int i5 = 0; i5 < hVar.A().size(); i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (Arrays.binarySearch(hVar.k2().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) arrayList.get(i7)), i5) >= 0) {
                    i6 = i7 + 1;
                }
            }
            if (i4 != i6) {
                if (i6 == 0) {
                    this.f63526g.put(Integer.valueOf(i5), map.get(hVar.r2()));
                } else {
                    int i10 = i6 - 1;
                    if (((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i10)).g()) {
                        SecretKey secretKey = map.get(((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i10)).f());
                        if (secretKey == null) {
                            throw new RuntimeException(ProtectedSandApp.s("഼\u0001") + ((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i10)).f() + ProtectedSandApp.s("ഽ\u0001"));
                        }
                        this.f63526g.put(Integer.valueOf(i5), secretKey);
                    } else {
                        this.f63526g.put(Integer.valueOf(i5), null);
                    }
                }
                i4 = i6;
            }
        }
        this.f63524e = new com.googlecode.mp4parser.boxes.cenc.a(this.f63526g, hVar.A(), hVar.g3(), schemeTypeBox.getSchemeType());
    }
}
