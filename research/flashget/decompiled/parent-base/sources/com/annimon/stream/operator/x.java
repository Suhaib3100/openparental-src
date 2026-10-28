package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: IntCodePoints.java */
/* loaded from: classes3.dex */
public class x extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f41801b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41802c;

    /* renamed from: d, reason: collision with root package name */
    private int f41803d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f41804e = -1;

    public x(CharSequence charSequence) {
        this.f41801b = charSequence;
        this.f41802c = charSequence instanceof String;
    }

    private int c() {
        if (!this.f41802c) {
            return this.f41801b.length();
        }
        if (this.f41804e == -1) {
            this.f41804e = this.f41801b.length();
        }
        return this.f41804e;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int i4;
        int c5 = c();
        int i5 = this.f41803d;
        if (i5 >= c5) {
            throw new NoSuchElementException();
        }
        CharSequence charSequence = this.f41801b;
        this.f41803d = i5 + 1;
        char charAt = charSequence.charAt(i5);
        if (Character.isHighSurrogate(charAt) && (i4 = this.f41803d) < c5) {
            char charAt2 = this.f41801b.charAt(i4);
            if (Character.isLowSurrogate(charAt2)) {
                this.f41803d++;
                return Character.toCodePoint(charAt, charAt2);
            }
        }
        return charAt;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41803d < c();
    }
}
