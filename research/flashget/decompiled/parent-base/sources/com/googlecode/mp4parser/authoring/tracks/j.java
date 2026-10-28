package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: ChangeTimeScaleTrack.java */
/* loaded from: classes6.dex */
public class j implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f63707f = Logger.getLogger(j.class.getName());

    /* renamed from: b, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63708b;

    /* renamed from: c, reason: collision with root package name */
    List<CompositionTimeToSample.a> f63709c;

    /* renamed from: d, reason: collision with root package name */
    long[] f63710d;

    /* renamed from: e, reason: collision with root package name */
    long f63711e;

    public j(com.googlecode.mp4parser.authoring.h hVar, long j4, long[] jArr) {
        this.f63708b = hVar;
        this.f63711e = j4;
        double k4 = j4 / hVar.u2().k();
        this.f63709c = a(hVar.W(), k4);
        this.f63710d = b(hVar.S2(), k4, jArr, c(hVar, jArr, j4));
    }

    static List<CompositionTimeToSample.a> a(List<CompositionTimeToSample.a> list, double d5) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CompositionTimeToSample.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CompositionTimeToSample.a(it.next().a(), (int) Math.round(r1.b() * d5)));
        }
        return arrayList;
    }

    static long[] b(long[] jArr, double d5, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[jArr.length];
        long j4 = 0;
        int i4 = 1;
        while (i4 <= jArr.length) {
            int i5 = i4 - 1;
            long round = Math.round(jArr[i5] * d5);
            int i6 = i4 + 1;
            int binarySearch = Arrays.binarySearch(jArr2, i6);
            if (binarySearch >= 0) {
                long j5 = jArr3[binarySearch];
                if (j5 != j4) {
                    long j6 = j5 - (j4 + round);
                    f63707f.finest(String.format(ProtectedSandApp.s("\u0e7d\u0001"), Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(jArr3[binarySearch]), Long.valueOf(j6)));
                    round += j6;
                }
            }
            j4 += round;
            jArr4[i5] = round;
            i4 = i6;
        }
        return jArr4;
    }

    private static long[] c(com.googlecode.mp4parser.authoring.h hVar, long[] jArr, long j4) {
        long[] jArr2 = new long[jArr.length];
        long j5 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            long j6 = i5;
            if (j6 > jArr[jArr.length - 1]) {
                return jArr2;
            }
            if (j6 == jArr[i4]) {
                jArr2[i4] = (j5 * j4) / hVar.u2().k();
                i4++;
            }
            j5 += hVar.S2()[i5 - 1];
            i5++;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63708b.A();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63708b.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63708b.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63710d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> U1() {
        return this.f63708b.U1();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63709c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63708b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : this.f63710d) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63708b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return ProtectedSandApp.s("\u0e7e\u0001") + this.f63708b.getName() + ProtectedSandApp.s("\u0e7f\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63708b.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63708b.k2();
    }

    public String toString() {
        return ProtectedSandApp.s("\u0e80\u0001") + this.f63708b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f63708b.u2().clone();
        iVar.v(this.f63711e);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63708b.z0();
    }
}
