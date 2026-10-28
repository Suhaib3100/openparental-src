package com.annimon.stream.iterator;

import com.annimon.stream.iterator.g;

/* compiled from: PrimitiveIndexedIterator.java */
/* loaded from: classes3.dex */
public final class f {
    private f() {
    }

    /* compiled from: PrimitiveIndexedIterator.java */
    public static class a extends g.a {

        /* renamed from: b, reason: collision with root package name */
        private final g.a f41528b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41529c;

        /* renamed from: d, reason: collision with root package name */
        private int f41530d;

        public a(int i4, int i5, g.a aVar) {
            this.f41528b = aVar;
            this.f41529c = i5;
            this.f41530d = i4;
        }

        @Override // com.annimon.stream.iterator.g.a
        public double b() {
            double doubleValue = this.f41528b.next().doubleValue();
            this.f41530d += this.f41529c;
            return doubleValue;
        }

        public int c() {
            return this.f41530d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41528b.hasNext();
        }

        public a(g.a aVar) {
            this(0, 1, aVar);
        }
    }

    /* compiled from: PrimitiveIndexedIterator.java */
    public static class b extends g.b {

        /* renamed from: b, reason: collision with root package name */
        private final g.b f41531b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41532c;

        /* renamed from: d, reason: collision with root package name */
        private int f41533d;

        public b(int i4, int i5, g.b bVar) {
            this.f41531b = bVar;
            this.f41532c = i5;
            this.f41533d = i4;
        }

        @Override // com.annimon.stream.iterator.g.b
        public int b() {
            int intValue = this.f41531b.next().intValue();
            this.f41533d += this.f41532c;
            return intValue;
        }

        public int c() {
            return this.f41533d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41531b.hasNext();
        }

        public b(g.b bVar) {
            this(0, 1, bVar);
        }
    }

    /* compiled from: PrimitiveIndexedIterator.java */
    public static class c extends g.c {

        /* renamed from: b, reason: collision with root package name */
        private final g.c f41534b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41535c;

        /* renamed from: d, reason: collision with root package name */
        private int f41536d;

        public c(int i4, int i5, g.c cVar) {
            this.f41534b = cVar;
            this.f41535c = i5;
            this.f41536d = i4;
        }

        @Override // com.annimon.stream.iterator.g.c
        public long b() {
            long longValue = this.f41534b.next().longValue();
            this.f41536d += this.f41535c;
            return longValue;
        }

        public int c() {
            return this.f41536d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41534b.hasNext();
        }

        public c(g.c cVar) {
            this(0, 1, cVar);
        }
    }
}
