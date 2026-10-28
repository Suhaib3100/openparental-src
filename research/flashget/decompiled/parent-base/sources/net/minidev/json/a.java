package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JSONArray.java */
/* loaded from: classes7.dex */
public class a extends ArrayList<Object> implements List<Object>, c, g {

    /* renamed from: b, reason: collision with root package name */
    private static final long f81697b = 9106884089231309568L;

    public static String m(List<? extends Object> list) {
        return p(list, k.f81725a);
    }

    public static String p(List<? extends Object> list, h hVar) {
        StringBuilder sb = new StringBuilder();
        try {
            r(list, sb, hVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void r(Iterable<? extends Object> iterable, Appendable appendable, h hVar) throws IOException {
        String s4 = ProtectedSandApp.s("褬\u0001");
        if (iterable == null) {
            appendable.append(s4);
            return;
        }
        appendable.append('[');
        boolean z4 = true;
        for (Object obj : iterable) {
            if (z4) {
                z4 = false;
            } else {
                appendable.append(',');
            }
            if (obj == null) {
                appendable.append(s4);
            } else {
                k.H(obj, appendable, hVar);
            }
        }
        appendable.append(']');
    }

    public static void s(List<? extends Object> list, Appendable appendable) throws IOException {
        r(list, appendable, k.f81725a);
    }

    @Override // net.minidev.json.g
    public void b(Appendable appendable, h hVar) throws IOException {
        r(this, appendable, hVar);
    }

    @Override // net.minidev.json.f
    public void c(Appendable appendable) throws IOException {
        r(this, appendable, k.f81725a);
    }

    @Override // net.minidev.json.c
    public String f(h hVar) {
        return p(this, hVar);
    }

    @Override // net.minidev.json.b
    public String i() {
        return p(this, k.f81725a);
    }

    public void l(Object obj) {
        e.e(this, obj);
    }

    public String q(h hVar) {
        return f(hVar);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return i();
    }
}
