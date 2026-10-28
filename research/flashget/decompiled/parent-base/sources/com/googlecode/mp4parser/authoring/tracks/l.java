package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: CroppedTrack.java */
/* loaded from: classes6.dex */
public class l extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f63714h = false;

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63715e;

    /* renamed from: f, reason: collision with root package name */
    private int f63716f;

    /* renamed from: g, reason: collision with root package name */
    private int f63717g;

    public l(com.googlecode.mp4parser.authoring.h hVar, long j4, long j5) {
        super(ProtectedSandApp.s("ກ\u0001") + hVar.getName() + ProtectedSandApp.s("ຂ\u0001"));
        this.f63715e = hVar;
        this.f63716f = (int) j4;
        this.f63717g = (int) j5;
    }

    static List<CompositionTimeToSample.a> a(List<CompositionTimeToSample.a> list, long j4, long j5) {
        CompositionTimeToSample.a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListIterator<CompositionTimeToSample.a> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        long j6 = 0;
        while (true) {
            next = listIterator.next();
            if (next.a() + j6 > j4) {
                break;
            }
            j6 += next.a();
        }
        if (next.a() + j6 >= j5) {
            arrayList.add(new CompositionTimeToSample.a((int) (j5 - j4), next.b()));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.a((int) ((next.a() + j6) - j4), next.b()));
        int a5 = next.a();
        while (true) {
            j6 += a5;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.a() + j6 >= j5) {
                break;
            }
            arrayList.add(next);
            a5 = next.a();
        }
        arrayList.add(new CompositionTimeToSample.a((int) (j5 - j6), next.b()));
        return arrayList;
    }

    static List<TimeToSampleBox.a> b(List<TimeToSampleBox.a> list, long j4, long j5) {
        TimeToSampleBox.a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListIterator<TimeToSampleBox.a> listIterator = list.listIterator();
        LinkedList linkedList = new LinkedList();
        long j6 = 0;
        while (true) {
            next = listIterator.next();
            if (next.a() + j6 > j4) {
                break;
            }
            j6 += next.a();
        }
        if (next.a() + j6 >= j5) {
            linkedList.add(new TimeToSampleBox.a(j5 - j4, next.b()));
            return linkedList;
        }
        linkedList.add(new TimeToSampleBox.a((next.a() + j6) - j4, next.b()));
        long a5 = next.a();
        while (true) {
            a5 += j6;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.a() + a5 >= j5) {
                break;
            }
            linkedList.add(next);
            j6 = next.a();
        }
        linkedList.add(new TimeToSampleBox.a(j5 - a5, next.b()));
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63715e.A().subList(this.f63716f, this.f63717g);
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63715e.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        if (this.f63715e.I3() == null || this.f63715e.I3().isEmpty()) {
            return null;
        }
        return this.f63715e.I3().subList(this.f63716f, this.f63717g);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] S2() {
        long[] jArr;
        int i4 = this.f63717g - this.f63716f;
        jArr = new long[i4];
        System.arraycopy(this.f63715e.S2(), this.f63716f, jArr, 0, i4);
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return a(this.f63715e.W(), this.f63716f, this.f63717g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63715e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63715e.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63715e.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63715e.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public synchronized long[] z0() {
        try {
            if (this.f63715e.z0() == null) {
                return null;
            }
            long[] z02 = this.f63715e.z0();
            int length = z02.length;
            int i4 = 0;
            while (i4 < z02.length && z02[i4] < this.f63716f) {
                i4++;
            }
            while (length > 0 && this.f63717g < z02[length - 1]) {
                length--;
            }
            int i5 = length - i4;
            long[] jArr = new long[i5];
            System.arraycopy(this.f63715e.z0(), i4, jArr, 0, i5);
            for (int i6 = 0; i6 < i5; i6++) {
                jArr[i6] = jArr[i6] - this.f63716f;
            }
            return jArr;
        } catch (Throwable th) {
            throw th;
        }
    }
}
