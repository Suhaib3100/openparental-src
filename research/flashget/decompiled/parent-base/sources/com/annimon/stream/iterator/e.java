package com.annimon.stream.iterator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: PrimitiveExtIterator.java */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: PrimitiveExtIterator.java */
    public static abstract class a extends g.a {

        /* renamed from: b, reason: collision with root package name */
        protected double f41519b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f41520c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f41521d;

        @Override // com.annimon.stream.iterator.g.a
        public double b() {
            if (!this.f41521d) {
                hasNext();
            }
            if (!this.f41520c) {
                throw new NoSuchElementException();
            }
            double d5 = this.f41519b;
            c();
            return d5;
        }

        protected abstract void c();

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f41521d) {
                c();
                this.f41521d = true;
            }
            return this.f41520c;
        }
    }

    /* compiled from: PrimitiveExtIterator.java */
    public static abstract class b extends g.b {

        /* renamed from: b, reason: collision with root package name */
        protected int f41522b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f41523c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f41524d;

        @Override // com.annimon.stream.iterator.g.b
        public int b() {
            if (!this.f41524d) {
                hasNext();
            }
            if (!this.f41523c) {
                throw new NoSuchElementException();
            }
            int i4 = this.f41522b;
            c();
            return i4;
        }

        protected abstract void c();

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f41524d) {
                c();
                this.f41524d = true;
            }
            return this.f41523c;
        }
    }

    /* compiled from: PrimitiveExtIterator.java */
    public static abstract class c extends g.c {

        /* renamed from: b, reason: collision with root package name */
        protected long f41525b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f41526c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f41527d;

        @Override // com.annimon.stream.iterator.g.c
        public long b() {
            if (!this.f41527d) {
                hasNext();
            }
            if (!this.f41526c) {
                throw new NoSuchElementException();
            }
            long j4 = this.f41525b;
            c();
            return j4;
        }

        protected abstract void c();

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f41527d) {
                c();
                this.f41527d = true;
            }
            return this.f41526c;
        }
    }

    private e() {
    }
}
