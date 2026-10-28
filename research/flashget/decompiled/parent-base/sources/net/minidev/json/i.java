package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.minidev.json.parser.ParseException;

/* compiled from: JSONStyler.java */
/* loaded from: classes7.dex */
public class i extends h implements net.minidev.json.parser.b {

    /* renamed from: n, reason: collision with root package name */
    int f81722n;

    /* renamed from: o, reason: collision with root package name */
    Appendable f81723o;

    /* renamed from: p, reason: collision with root package name */
    String[] f81724p;

    public i(int i4) {
        super(i4);
        this.f81722n = 0;
        s(2);
    }

    @Override // net.minidev.json.parser.b
    public boolean a() throws ParseException {
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean b() throws ParseException {
        this.f81722n--;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean c() throws ParseException {
        this.f81722n++;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean d() throws ParseException {
        this.f81722n++;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean e(Object obj) throws ParseException {
        return false;
    }

    @Override // net.minidev.json.parser.b
    public void f() throws ParseException {
    }

    @Override // net.minidev.json.parser.b
    public boolean g() throws ParseException {
        this.f81722n--;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean h(String str) throws ParseException {
        return false;
    }

    @Override // net.minidev.json.parser.b
    public void i() throws ParseException {
    }

    @Override // net.minidev.json.h
    public boolean k() {
        return true;
    }

    public String q() {
        int i4 = this.f81722n;
        if (i4 <= 0) {
            return "";
        }
        String[] strArr = this.f81724p;
        return i4 < strArr.length ? strArr[i4] : strArr[i4 - 1];
    }

    public i r() {
        return this;
    }

    public void s(int i4) {
        String[] strArr = new String[i4];
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("褻\u0001"));
        for (int i5 = 0; i5 < i4; i5++) {
            strArr[i5] = sb.toString();
            sb.append(' ');
        }
        this.f81724p = strArr;
    }

    public void t(Appendable appendable) {
        this.f81723o = appendable;
    }

    public i(int i4, int i5) {
        super(i4);
        this.f81722n = 0;
        s(i5);
    }

    public i() {
        super(0);
        this.f81722n = 0;
    }
}
