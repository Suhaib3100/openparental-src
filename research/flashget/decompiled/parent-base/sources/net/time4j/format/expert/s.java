package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import net.time4j.engine.r;

/* compiled from: MultiFormatParser.java */
/* loaded from: classes7.dex */
public final class s<T extends net.time4j.engine.r<T>> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c<T>[] f83034a;

    private s(c<T>[] cVarArr) {
        this.f83034a = cVarArr;
        for (c<T> cVar : cVarArr) {
            if (cVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("锨\u0001"));
            }
        }
    }

    public static <T extends net.time4j.engine.r<T>> s<T> a(List<c<T>> list) {
        return new s<>((c[]) list.toArray((c[]) Array.newInstance((Class<?>) c.class, list.size())));
    }

    @SafeVarargs
    public static <T extends net.time4j.engine.r<T>> s<T> c(c<T>... cVarArr) {
        return new s<>((c[]) Arrays.copyOf(cVarArr, cVarArr.length));
    }

    public T d(CharSequence charSequence) throws ParseException {
        w wVar = new w(0);
        for (int i4 = 0; i4 < this.f83034a.length; i4++) {
            wVar.k();
            wVar.m(0);
            T X = this.f83034a[i4].X(charSequence, wVar);
            if (X != null && !wVar.i() && (this.f83034a[i4].K() || wVar.f() == charSequence.length())) {
                return X;
            }
        }
        throw new ParseException(ProtectedSandApp.s("锩\u0001") + ((Object) charSequence), charSequence.length());
    }

    public T e(CharSequence charSequence, w wVar) {
        int f4 = wVar.f();
        for (int i4 = 0; i4 < this.f83034a.length; i4++) {
            wVar.k();
            wVar.m(f4);
            T X = this.f83034a[i4].X(charSequence, wVar);
            if (X != null && !wVar.i()) {
                return X;
            }
        }
        wVar.l(wVar.c(), ProtectedSandApp.s("锩\u0001") + ((Object) charSequence));
        return null;
    }

    @Override // net.time4j.format.expert.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T b(CharSequence charSequence, w wVar, net.time4j.engine.d dVar) {
        int f4 = wVar.f();
        for (int i4 = 0; i4 < this.f83034a.length; i4++) {
            wVar.k();
            wVar.m(f4);
            T b5 = this.f83034a[i4].b(charSequence, wVar, dVar);
            if (b5 != null && !wVar.i()) {
                return b5;
            }
        }
        wVar.l(wVar.c(), ProtectedSandApp.s("锩\u0001") + ((Object) charSequence));
        return null;
    }
}
