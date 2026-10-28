package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.util.j;
import com.googlecode.mp4parser.util.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: SyncSampleIntersectFinderImpl.java */
/* loaded from: classes6.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    private static Logger f63391d = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final int f63392a;

    /* renamed from: b, reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.d f63393b;

    /* renamed from: c, reason: collision with root package name */
    private h f63394c;

    public g(com.googlecode.mp4parser.authoring.d dVar, h hVar, int i4) {
        this.f63393b = dVar;
        this.f63394c = hVar;
        this.f63392a = i4;
    }

    private static long b(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        long j4 = 1;
        for (h hVar2 : dVar.g()) {
            if (hVar2.getHandler().equals(hVar.getHandler()) && hVar2.u2().k() != hVar.u2().k()) {
                j4 = j.d(j4, hVar2.u2().k());
            }
        }
        return j4;
    }

    static String d(h hVar) {
        SampleDescriptionBox sampleDescriptionBox = hVar.getSampleDescriptionBox();
        OriginalFormatBox originalFormatBox = (OriginalFormatBox) m.e(sampleDescriptionBox, ProtectedSandApp.s("ು\u0001"));
        return originalFormatBox != null ? originalFormatBox.getDataFormat() : sampleDescriptionBox.getSampleEntry().getType();
    }

    public static List<long[]> e(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        long[] z02;
        LinkedList linkedList = new LinkedList();
        for (h hVar2 : dVar.g()) {
            if (hVar2.getHandler().equals(hVar.getHandler()) && (z02 = hVar2.z0()) != null && z02.length > 0) {
                linkedList.add(f(hVar2, dVar));
            }
        }
        return linkedList;
    }

    private static long[] f(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        long[] z02 = hVar.z0();
        long[] jArr = new long[z02.length];
        long b5 = b(dVar, hVar);
        long j4 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            long j5 = i5;
            if (j5 > z02[z02.length - 1]) {
                return jArr;
            }
            if (j5 == z02[i4]) {
                jArr[i4] = j4 * b5;
                i4++;
            }
            j4 += hVar.S2()[i5 - 1];
            i5++;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.builder.d
    public long[] a(h hVar) {
        long j4;
        String handler = hVar.getHandler();
        String s4 = ProtectedSandApp.s("ೂ\u0001");
        if (s4.equals(handler)) {
            if (hVar.z0() == null || hVar.z0().length <= 0) {
                throw new RuntimeException(ProtectedSandApp.s("ೃ\u0001"));
            }
            List<long[]> e4 = e(this.f63393b, hVar);
            return c(hVar.z0(), f(hVar, this.f63393b), hVar.u2().k(), (long[][]) e4.toArray(new long[e4.size()][]));
        }
        boolean equals = ProtectedSandApp.s("ೄ\u0001").equals(hVar.getHandler());
        String s5 = ProtectedSandApp.s("\u0cc5\u0001");
        int i4 = 0;
        if (!equals) {
            for (h hVar2 : this.f63393b.g()) {
                if (hVar2.z0() != null && hVar2.z0().length > 0) {
                    long[] a5 = a(hVar2);
                    int size = hVar2.A().size();
                    int length = a5.length;
                    long[] jArr = new long[length];
                    double size2 = hVar.A().size() / size;
                    for (int i5 = 0; i5 < length; i5++) {
                        jArr[i5] = ((long) Math.ceil((a5[i5] - 1) * size2)) + 1;
                    }
                    return jArr;
                }
            }
            throw new RuntimeException(s5);
        }
        if (this.f63394c == null) {
            for (h hVar3 : this.f63393b.g()) {
                if (hVar3.z0() != null && s4.equals(hVar3.getHandler()) && hVar3.z0().length > 0) {
                    this.f63394c = hVar3;
                }
            }
        }
        h hVar4 = this.f63394c;
        if (hVar4 == null) {
            throw new RuntimeException(s5);
        }
        long[] a6 = a(hVar4);
        int size3 = this.f63394c.A().size();
        int length2 = a6.length;
        long[] jArr2 = new long[length2];
        Iterator<h> it = this.f63393b.g().iterator();
        while (true) {
            j4 = 192000;
            if (!it.hasNext()) {
                break;
            }
            h next = it.next();
            if (d(hVar).equals(d(next))) {
                AudioSampleEntry audioSampleEntry = (AudioSampleEntry) next.getSampleDescriptionBox().getSampleEntry();
                if (audioSampleEntry.getSampleRate() < 192000) {
                    j4 = audioSampleEntry.getSampleRate();
                    double size4 = next.A().size() / size3;
                    long j5 = next.S2()[0];
                    int i6 = 0;
                    while (i6 < length2) {
                        jArr2[i6] = (long) Math.ceil((a6[i6] - 1) * size4 * j5);
                        i6++;
                        length2 = length2;
                        i4 = 0;
                    }
                }
            }
        }
        AudioSampleEntry audioSampleEntry2 = (AudioSampleEntry) hVar.getSampleDescriptionBox().getSampleEntry();
        long j6 = hVar.S2()[i4];
        double sampleRate = audioSampleEntry2.getSampleRate() / j4;
        if (sampleRate != Math.rint(sampleRate)) {
            throw new RuntimeException(ProtectedSandApp.s("ೆ\u0001"));
        }
        while (i4 < length2) {
            jArr2[i4] = (long) (((jArr2[i4] * sampleRate) / j6) + 1.0d);
            i4++;
        }
        return jArr2;
    }

    public long[] c(long[] jArr, long[] jArr2, long j4, long[]... jArr3) {
        LinkedList linkedList;
        String s4;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        int i4 = 0;
        for (int i5 = 0; i5 < jArr2.length; i5++) {
            boolean z4 = true;
            for (long[] jArr4 : jArr3) {
                z4 &= Arrays.binarySearch(jArr4, jArr2[i5]) >= 0;
            }
            if (z4) {
                linkedList2.add(Long.valueOf(jArr[i5]));
                linkedList3.add(Long.valueOf(jArr2[i5]));
            }
        }
        if (linkedList2.size() < jArr.length * 0.25d) {
            String format = String.format(ProtectedSandApp.s("ೇ\u0001"), Integer.valueOf(linkedList2.size()));
            Iterator it = linkedList2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                s4 = ProtectedSandApp.s("ೈ\u0001");
                if (!hasNext) {
                    break;
                }
                Long l4 = (Long) it.next();
                l4.longValue();
                format = String.valueOf(format).concat(String.format(s4, l4));
            }
            String valueOf = String.valueOf(format);
            String s5 = ProtectedSandApp.s("\u0cc9\u0001");
            f63391d.warning(valueOf.concat(s5));
            String format2 = String.format(ProtectedSandApp.s("ೊ\u0001"), Integer.valueOf(jArr.length));
            int length = jArr.length;
            while (i4 < length) {
                format2 = String.valueOf(format2).concat(String.format(s4, Long.valueOf(jArr[i4])));
                i4++;
            }
            f63391d.warning(String.valueOf(format2).concat(s5));
            Logger logger = f63391d;
            String s6 = ProtectedSandApp.s("ೋ\u0001");
            logger.warning(s6);
            throw new RuntimeException(s6);
        }
        if (linkedList2.size() < jArr.length * 0.5d) {
            f63391d.fine(ProtectedSandApp.s("ೌ\u0001"));
        } else if (linkedList2.size() < jArr.length) {
            f63391d.finest(ProtectedSandApp.s("್\u0001") + linkedList2.size() + ProtectedSandApp.s("\u0cce\u0001") + jArr.length);
        }
        LinkedList linkedList4 = new LinkedList();
        if (this.f63392a > 0) {
            Iterator it2 = linkedList2.iterator();
            Iterator it3 = linkedList3.iterator();
            long j5 = -1;
            while (it2.hasNext() && it3.hasNext()) {
                Long l5 = (Long) it2.next();
                l5.longValue();
                long longValue = ((Long) it3.next()).longValue();
                if (j5 == -1 || (longValue - j5) / j4 >= this.f63392a) {
                    linkedList4.add(l5);
                    j5 = longValue;
                }
            }
            linkedList = linkedList4;
        } else {
            linkedList = linkedList2;
        }
        int size = linkedList.size();
        long[] jArr5 = new long[size];
        while (i4 < size) {
            jArr5[i4] = ((Long) linkedList.get(i4)).longValue();
            i4++;
        }
        return jArr5;
    }
}
