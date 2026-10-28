package com.airbnb.lottie.model;

import androidx.annotation.c1;
import androidx.compose.foundation.text.modifiers.n;
import com.airbnb.lottie.model.content.p;
import java.util.List;

/* compiled from: FontCharacter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List<p> f39080a;

    /* renamed from: b, reason: collision with root package name */
    private final char f39081b;

    /* renamed from: c, reason: collision with root package name */
    private final double f39082c;

    /* renamed from: d, reason: collision with root package name */
    private final double f39083d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39084e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39085f;

    public d(List<p> list, char c5, double d5, double d6, String str, String str2) {
        this.f39080a = list;
        this.f39081b = c5;
        this.f39082c = d5;
        this.f39083d = d6;
        this.f39084e = str;
        this.f39085f = str2;
    }

    public static int c(char c5, String str, String str2) {
        return str2.hashCode() + n.a(str, c5 * 31, 31);
    }

    public List<p> a() {
        return this.f39080a;
    }

    public double b() {
        return this.f39083d;
    }

    public int hashCode() {
        return c(this.f39081b, this.f39085f, this.f39084e);
    }
}
