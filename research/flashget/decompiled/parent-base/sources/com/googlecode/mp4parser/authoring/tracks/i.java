package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.ProtectionSchemeInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeInformationBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import com.mp4parser.iso23001.part7.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.SecretKey;

/* compiled from: CencEncryptingTrackImpl.java */
/* loaded from: classes6.dex */
public class i implements h {

    /* renamed from: b, reason: collision with root package name */
    private final String f63694b;

    /* renamed from: c, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63695c;

    /* renamed from: d, reason: collision with root package name */
    Map<UUID, SecretKey> f63696d;

    /* renamed from: e, reason: collision with root package name */
    UUID f63697e;

    /* renamed from: f, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63698f;

    /* renamed from: g, reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f63699g;

    /* renamed from: h, reason: collision with root package name */
    boolean f63700h;

    /* renamed from: i, reason: collision with root package name */
    boolean f63701i;

    /* renamed from: j, reason: collision with root package name */
    SampleDescriptionBox f63702j;

    /* renamed from: k, reason: collision with root package name */
    com.googlecode.mp4parser.util.n<Integer, SecretKey> f63703k;

    /* renamed from: l, reason: collision with root package name */
    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> f63704l;

    /* renamed from: m, reason: collision with root package name */
    Object f63705m;

    /* compiled from: CencEncryptingTrackImpl.java */
    class a extends HashMap<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> {
        a(Map map) {
            super(map);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long[] put(com.googlecode.mp4parser.boxes.mp4.samplegrouping.b bVar, long[] jArr) {
            if (bVar instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) {
                throw new RuntimeException(ProtectedSandApp.s("\u0e71\u0001"));
            }
            return (long[]) super.put(bVar, jArr);
        }
    }

    public i(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, SecretKey secretKey, boolean z4) {
        this(hVar, uuid, Collections.singletonMap(uuid, secretKey), null, ProtectedSandApp.s("\u0e75\u0001"), z4, false);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return new com.googlecode.mp4parser.boxes.cenc.b(this.f63703k, this.f63695c.A(), this.f63699g, this.f63694b);
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public boolean C1() {
        return this.f63701i;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63695c.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63695c.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63695c.S2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> U1() {
        return this.f63695c.U1();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63695c.W();
    }

    public boolean a(ByteBuffer byteBuffer) {
        Object obj = this.f63705m;
        if (!(obj instanceof HevcConfigurationBox)) {
            if (!(obj instanceof AvcConfigurationBox)) {
                throw new RuntimeException(ProtectedSandApp.s("\u0e76\u0001"));
            }
            int i4 = com.googlecode.mp4parser.authoring.tracks.h264.c.o(byteBuffer.slice()).f63528b;
            return (i4 == 19 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 20 || i4 == 5 || i4 == 1) ? false : true;
        }
        int i5 = com.googlecode.mp4parser.authoring.tracks.h265.c.f(byteBuffer.slice()).f63620b;
        if (i5 >= 0 && i5 <= 9) {
            return false;
        }
        if (i5 < 16 || i5 > 21) {
            return i5 < 16 || i5 > 21;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63695c.close();
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public List<com.mp4parser.iso23001.part7.a> g3() {
        return this.f63699g;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f63695c.getDuration();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63695c.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return ProtectedSandApp.s("\u0e77\u0001") + this.f63695c.getName() + ProtectedSandApp.s("\u0e78\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized SampleDescriptionBox getSampleDescriptionBox() {
        try {
            if (this.f63702j == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    this.f63695c.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
                    int i4 = 0;
                    this.f63702j = (SampleDescriptionBox) new com.coremedia.iso.f(new com.googlecode.mp4parser.e(byteArrayOutputStream.toByteArray())).getBoxes().get(0);
                    OriginalFormatBox originalFormatBox = new OriginalFormatBox();
                    originalFormatBox.setDataFormat(this.f63702j.getSampleEntry().getType());
                    if (this.f63702j.getSampleEntry() instanceof AudioSampleEntry) {
                        ((AudioSampleEntry) this.f63702j.getSampleEntry()).setType(ProtectedSandApp.s("\u0e79\u0001"));
                    } else {
                        if (!(this.f63702j.getSampleEntry() instanceof VisualSampleEntry)) {
                            throw new RuntimeException(ProtectedSandApp.s("\u0e7b\u0001") + this.f63702j.getSampleEntry().getType());
                        }
                        ((VisualSampleEntry) this.f63702j.getSampleEntry()).setType(ProtectedSandApp.s("\u0e7a\u0001"));
                    }
                    ProtectionSchemeInformationBox protectionSchemeInformationBox = new ProtectionSchemeInformationBox();
                    protectionSchemeInformationBox.addBox(originalFormatBox);
                    SchemeTypeBox schemeTypeBox = new SchemeTypeBox();
                    schemeTypeBox.setSchemeType(this.f63694b);
                    schemeTypeBox.setSchemeVersion(65536);
                    protectionSchemeInformationBox.addBox(schemeTypeBox);
                    SchemeInformationBox schemeInformationBox = new SchemeInformationBox();
                    TrackEncryptionBox trackEncryptionBox = new TrackEncryptionBox();
                    trackEncryptionBox.setDefaultIvSize(this.f63697e == null ? 0 : 8);
                    if (this.f63697e != null) {
                        i4 = 1;
                    }
                    trackEncryptionBox.setDefaultAlgorithmId(i4);
                    UUID uuid = this.f63697e;
                    if (uuid == null) {
                        uuid = new UUID(0L, 0L);
                    }
                    trackEncryptionBox.setDefault_KID(uuid);
                    schemeInformationBox.addBox(trackEncryptionBox);
                    protectionSchemeInformationBox.addBox(schemeInformationBox);
                    this.f63702j.getSampleEntry().addBox(protectionSchemeInformationBox);
                } catch (IOException unused) {
                    throw new RuntimeException(ProtectedSandApp.s("\u0e7c\u0001"));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f63702j;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63704l;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public UUID r2() {
        return this.f63697e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63695c.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63695c.z0();
    }

    public i(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, Map<UUID, SecretKey> map, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> map2, String str, boolean z4) {
        this(hVar, uuid, map, map2, str, z4, false);
    }

    public i(com.googlecode.mp4parser.authoring.h hVar, UUID uuid, Map<UUID, SecretKey> map, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> map2, String str, boolean z4, boolean z5) {
        new HashMap();
        int i4 = 0;
        this.f63701i = false;
        SecretKey secretKey = null;
        this.f63702j = null;
        this.f63695c = hVar;
        this.f63696d = map;
        this.f63697e = uuid;
        this.f63700h = z4;
        this.f63694b = str;
        this.f63704l = new HashMap();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : hVar.k2().entrySet()) {
            if (!(entry.getKey() instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.a)) {
                this.f63704l.put(entry.getKey(), entry.getValue());
            }
            i4 = 0;
            secretKey = null;
        }
        if (map2 != null) {
            for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.a, long[]> entry2 : map2.entrySet()) {
                this.f63704l.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f63704l = new a(this.f63704l);
        this.f63698f = hVar.A();
        this.f63699g = new ArrayList();
        BigInteger bigInteger = new BigInteger(ProtectedSandApp.s("\u0e72\u0001"));
        int i5 = 8;
        byte[] bArr = new byte[8];
        if (!z4) {
            new SecureRandom().nextBytes(bArr);
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            arrayList.addAll(map2.keySet());
        }
        this.f63703k = new com.googlecode.mp4parser.util.n<>();
        int i6 = -1;
        int i7 = i4;
        int i10 = -1;
        while (i7 < hVar.A().size()) {
            int i11 = i4;
            int i12 = i11;
            while (i11 < arrayList.size()) {
                BigInteger bigInteger3 = bigInteger2;
                if (Arrays.binarySearch(k2().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) arrayList.get(i11)), i7) >= 0) {
                    i12 = i11 + 1;
                }
                i11++;
                bigInteger2 = bigInteger3;
                secretKey = null;
                i5 = 8;
            }
            if (i10 != i12) {
                if (i12 == 0) {
                    this.f63703k.put(Integer.valueOf(i7), map.get(uuid));
                } else {
                    int i13 = i12 - 1;
                    if (((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i13)).f() != null) {
                        SecretKey secretKey2 = map.get(((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i13)).f());
                        if (secretKey2 != null) {
                            this.f63703k.put(Integer.valueOf(i7), secretKey2);
                        } else {
                            throw new RuntimeException(ProtectedSandApp.s("\u0e73\u0001") + ((com.googlecode.mp4parser.boxes.mp4.samplegrouping.a) arrayList.get(i13)).f() + ProtectedSandApp.s("\u0e74\u0001"));
                        }
                    } else {
                        this.f63703k.put(Integer.valueOf(i7), secretKey);
                    }
                }
                i10 = i12;
            }
            i7++;
            i4 = 0;
        }
        for (com.coremedia.iso.boxes.b bVar : hVar.getSampleDescriptionBox().getSampleEntry().getBoxes()) {
            if (bVar instanceof AvcConfigurationBox) {
                this.f63705m = bVar;
                this.f63701i = true;
                i6 = ((AvcConfigurationBox) bVar).getLengthSizeMinusOne() + 1;
            }
            if (bVar instanceof HevcConfigurationBox) {
                this.f63705m = bVar;
                this.f63701i = true;
                i6 = ((HevcConfigurationBox) bVar).getLengthSizeMinusOne() + 1;
            }
        }
        for (int i14 = i4; i14 < this.f63698f.size(); i14++) {
            com.googlecode.mp4parser.authoring.f fVar = this.f63698f.get(i14);
            com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
            this.f63699g.add(aVar);
            if (this.f63703k.get(Integer.valueOf(i14)) != null) {
                byte[] byteArray = bigInteger2.toByteArray();
                byte[] bArr2 = new byte[i5];
                System.arraycopy(byteArray, byteArray.length - i5 > 0 ? byteArray.length - i5 : i4, bArr2, 8 - byteArray.length < 0 ? i4 : 8 - byteArray.length, byteArray.length > i5 ? i5 : byteArray.length);
                aVar.f70084a = bArr2;
                ByteBuffer byteBuffer = (ByteBuffer) fVar.a().rewind();
                if (this.f63701i) {
                    if (z5) {
                        a.k[] kVarArr = new a.k[1];
                        kVarArr[i4] = aVar.a(byteBuffer.remaining(), 0L);
                        aVar.f70085b = kVarArr;
                    } else {
                        ArrayList arrayList2 = new ArrayList(5);
                        while (byteBuffer.remaining() > 0) {
                            int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.h.a(byteBuffer, i6));
                            int i15 = a5 + i6;
                            arrayList2.add(aVar.a((i15 < 112 || a(byteBuffer.duplicate())) ? i15 : (i15 % 16) + 96, i15 - r12));
                            byteBuffer.position(byteBuffer.position() + a5);
                        }
                        aVar.f70085b = (a.k[]) arrayList2.toArray(new a.k[arrayList2.size()]);
                    }
                }
                bigInteger2 = bigInteger2.add(bigInteger);
            }
        }
    }
}
