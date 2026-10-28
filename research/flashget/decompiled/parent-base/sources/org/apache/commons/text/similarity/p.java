package org.apache.commons.text.similarity;

import java.util.Objects;

/* compiled from: LevenshteinResults.java */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f86662a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f86663b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f86664c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f86665d;

    public p(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f86662a = num;
        this.f86663b = num2;
        this.f86664c = num3;
        this.f86665d = num4;
    }

    public Integer a() {
        return this.f86664c;
    }

    public Integer b() {
        return this.f86662a;
    }

    public Integer c() {
        return this.f86663b;
    }

    public Integer d() {
        return this.f86665d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equals(this.f86662a, pVar.f86662a) && Objects.equals(this.f86663b, pVar.f86663b) && Objects.equals(this.f86664c, pVar.f86664c) && Objects.equals(this.f86665d, pVar.f86665d);
    }

    public int hashCode() {
        return Objects.hash(this.f86662a, this.f86663b, this.f86664c, this.f86665d);
    }

    public String toString() {
        return "Distance: " + this.f86662a + ", Insert: " + this.f86663b + ", Delete: " + this.f86664c + ", Substitute: " + this.f86665d;
    }
}
