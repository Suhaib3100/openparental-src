package com.github.mikephil.charting.data;

import java.util.Arrays;
import java.util.List;

/* compiled from: RadarData.java */
/* loaded from: classes5.dex */
public class t extends k<f8.j> {

    /* renamed from: j, reason: collision with root package name */
    private List<String> f50411j;

    public t() {
    }

    public List<String> Q() {
        return this.f50411j;
    }

    public void R(List<String> list) {
        this.f50411j = list;
    }

    public void S(String... strArr) {
        this.f50411j = Arrays.asList(strArr);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.data.k
    public Entry s(com.github.mikephil.charting.highlight.d dVar) {
        return k(dVar.d()).w((int) dVar.h());
    }

    public t(List<f8.j> list) {
        super(list);
    }

    public t(f8.j... jVarArr) {
        super(jVarArr);
    }
}
