package org.threeten.bp.zone;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: TzdbZoneRulesProvider.java */
/* loaded from: classes9.dex */
public final class c extends i {

    /* renamed from: c, reason: collision with root package name */
    private List<String> f88423c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentNavigableMap<String, a> f88424d = new ConcurrentSkipListMap();

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f88425e = new CopyOnWriteArraySet();

    /* compiled from: TzdbZoneRulesProvider.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f88426a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f88427b;

        /* renamed from: c, reason: collision with root package name */
        private final short[] f88428c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReferenceArray<Object> f88429d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f88429d = atomicReferenceArray;
            this.f88426a = str;
            this.f88427b = strArr;
            this.f88428c = sArr;
        }

        f b(short s4) throws Exception {
            Object obj = this.f88429d.get(s4);
            if (obj instanceof byte[]) {
                obj = org.threeten.bp.zone.a.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f88429d.set(s4, obj);
            }
            return (f) obj;
        }

        f c(String str) {
            int binarySearch = Arrays.binarySearch(this.f88427b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return b(this.f88428c[binarySearch]);
            } catch (Exception e4) {
                StringBuilder a5 = androidx.appcompat.view.g.a("Invalid binary time-zone data: TZDB:", str, ", version: ");
                a5.append(this.f88426a);
                throw new ZoneRulesException(a5.toString(), e4);
            }
        }

        public String toString() {
            return this.f88426a;
        }
    }

    public c() {
        if (!m(i.class.getClassLoader())) {
            throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    private boolean l(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z4 = false;
        for (a aVar : o(inputStream)) {
            a putIfAbsent = this.f88424d.putIfAbsent(aVar.f88426a, aVar);
            if (putIfAbsent != null && !putIfAbsent.f88426a.equals(aVar.f88426a)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + aVar.f88426a);
            }
            z4 = true;
        }
        return z4;
    }

    private boolean m(ClassLoader classLoader) {
        URL url = null;
        try {
            Enumeration<URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean z4 = false;
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    z4 |= n(nextElement);
                    url = nextElement;
                } catch (Exception e4) {
                    e = e4;
                    url = nextElement;
                    throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + url, e);
                }
            }
            return z4;
        } catch (Exception e5) {
            e = e5;
        }
    }

    private boolean n(URL url) throws ClassNotFoundException, IOException, ZoneRulesException {
        InputStream inputStream;
        if (!this.f88425e.add(url.toExternalForm())) {
            return false;
        }
        try {
            inputStream = url.openStream();
            try {
                boolean l4 = l(inputStream);
                if (inputStream == null) {
                    return l4;
                }
                inputStream.close();
                return l4;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private Iterable<a> o(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int readShort = dataInputStream.readShort();
        String[] strArr = new String[readShort];
        for (int i4 = 0; i4 < readShort; i4++) {
            strArr[i4] = dataInputStream.readUTF();
        }
        int readShort2 = dataInputStream.readShort();
        String[] strArr2 = new String[readShort2];
        for (int i5 = 0; i5 < readShort2; i5++) {
            strArr2[i5] = dataInputStream.readUTF();
        }
        this.f88423c = Arrays.asList(strArr2);
        int readShort3 = dataInputStream.readShort();
        Object[] objArr = new Object[readShort3];
        for (int i6 = 0; i6 < readShort3; i6++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i6] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(readShort);
        for (int i7 = 0; i7 < readShort; i7++) {
            int readShort4 = dataInputStream.readShort();
            String[] strArr3 = new String[readShort4];
            short[] sArr = new short[readShort4];
            for (int i10 = 0; i10 < readShort4; i10++) {
                strArr3[i10] = strArr2[dataInputStream.readShort()];
                sArr[i10] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i7], strArr3, sArr, atomicReferenceArray));
        }
        return hashSet;
    }

    @Override // org.threeten.bp.zone.i
    protected f f(String str, boolean z4) {
        ng.d.j(str, "zoneId");
        f c5 = this.f88424d.lastEntry().getValue().c(str);
        if (c5 != null) {
            return c5;
        }
        throw new ZoneRulesException(androidx.constraintlayout.core.motion.key.c.a("Unknown time-zone ID: ", str));
    }

    @Override // org.threeten.bp.zone.i
    protected NavigableMap<String, f> g(String str) {
        TreeMap treeMap = new TreeMap();
        for (a aVar : this.f88424d.values()) {
            f c5 = aVar.c(str);
            if (c5 != null) {
                treeMap.put(aVar.f88426a, c5);
            }
        }
        return treeMap;
    }

    @Override // org.threeten.bp.zone.i
    protected Set<String> h() {
        return new HashSet(this.f88423c);
    }

    public String toString() {
        return "TZDB";
    }

    public c(URL url) {
        try {
            if (n(url)) {
                return;
            }
            throw new ZoneRulesException("No time-zone rules found: " + url);
        } catch (Exception e4) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + url, e4);
        }
    }

    public c(InputStream inputStream) {
        try {
            l(inputStream);
        } catch (Exception e4) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e4);
        }
    }
}
