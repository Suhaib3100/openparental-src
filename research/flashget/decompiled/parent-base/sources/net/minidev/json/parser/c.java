package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.text.m0;

/* compiled from: ContentHandlerCompressor.java */
/* loaded from: classes7.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    Appendable f81745a;

    /* renamed from: b, reason: collision with root package name */
    net.minidev.json.h f81746b;

    /* renamed from: c, reason: collision with root package name */
    int[] f81747c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    int f81748d;

    public c(Appendable appendable, net.minidev.json.h hVar) {
        this.f81745a = appendable;
        this.f81746b = hVar;
    }

    private boolean j() {
        return this.f81747c[this.f81748d] == 1;
    }

    private boolean k() {
        return this.f81747c[this.f81748d] == 0;
    }

    private void l(int i4) {
        int i5 = this.f81748d + 2;
        this.f81748d = i5;
        int[] iArr = this.f81747c;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f81747c = iArr2;
        }
        int[] iArr3 = this.f81747c;
        int i6 = this.f81748d;
        iArr3[i6] = i4;
        iArr3[i6 + 1] = 0;
    }

    @Override // net.minidev.json.parser.b
    public boolean a() throws ParseException, IOException {
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean b() throws ParseException, IOException {
        this.f81745a.append(']');
        this.f81748d -= 2;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean c() throws ParseException, IOException {
        if (j()) {
            int[] iArr = this.f81747c;
            int i4 = this.f81748d + 1;
            int i5 = iArr[i4];
            iArr[i4] = i5 + 1;
            if (i5 > 0) {
                this.f81745a.append(',');
            }
        }
        this.f81745a.append('{');
        l(0);
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean d() throws ParseException, IOException {
        if (j()) {
            int[] iArr = this.f81747c;
            int i4 = this.f81748d + 1;
            int i5 = iArr[i4];
            iArr[i4] = i5 + 1;
            if (i5 > 0) {
                this.f81745a.append(',');
            }
        }
        this.f81745a.append('[');
        l(1);
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean e(Object obj) throws ParseException, IOException {
        if (!k()) {
            int[] iArr = this.f81747c;
            int i4 = this.f81748d + 1;
            int i5 = iArr[i4];
            iArr[i4] = i5 + 1;
            if (i5 > 0) {
                this.f81745a.append(',');
            }
        }
        if (!(obj instanceof String)) {
            net.minidev.json.k.H(obj, this.f81745a, this.f81746b);
            return false;
        }
        String str = (String) obj;
        if (!this.f81746b.m(str)) {
            this.f81745a.append(str);
            return false;
        }
        this.f81745a.append(m0.quote);
        net.minidev.json.k.i(str, this.f81745a, this.f81746b);
        this.f81745a.append(m0.quote);
        return false;
    }

    @Override // net.minidev.json.parser.b
    public void f() throws ParseException, IOException {
    }

    @Override // net.minidev.json.parser.b
    public boolean g() throws ParseException, IOException {
        this.f81745a.append('}');
        this.f81748d -= 2;
        return false;
    }

    @Override // net.minidev.json.parser.b
    public boolean h(String str) throws ParseException, IOException {
        int[] iArr = this.f81747c;
        int i4 = this.f81748d + 1;
        int i5 = iArr[i4];
        iArr[i4] = i5 + 1;
        if (i5 > 0) {
            this.f81745a.append(',');
        }
        if (str == null) {
            this.f81745a.append(ProtectedSandApp.s("襥\u0001"));
        } else if (this.f81746b.l(str)) {
            this.f81745a.append(m0.quote);
            net.minidev.json.k.i(str, this.f81745a, this.f81746b);
            this.f81745a.append(m0.quote);
        } else {
            this.f81745a.append(str);
        }
        this.f81745a.append(':');
        return false;
    }

    @Override // net.minidev.json.parser.b
    public void i() throws ParseException, IOException {
    }
}
