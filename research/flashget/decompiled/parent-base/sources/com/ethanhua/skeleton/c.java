package com.ethanhua.skeleton;

import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.n;
import androidx.recyclerview.widget.RecyclerView;
import com.ethanhua.skeleton.b;

/* compiled from: RecyclerViewSkeletonScreen.java */
/* loaded from: classes3.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView f49087a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.h f49088b;

    /* renamed from: c, reason: collision with root package name */
    private final f f49089c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f49090d;

    /* compiled from: RecyclerViewSkeletonScreen.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private RecyclerView.h f49091a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f49092b;

        /* renamed from: f, reason: collision with root package name */
        private int f49096f;

        /* renamed from: c, reason: collision with root package name */
        private boolean f49093c = true;

        /* renamed from: d, reason: collision with root package name */
        private int f49094d = 10;

        /* renamed from: e, reason: collision with root package name */
        private int f49095e = b.i.A;

        /* renamed from: g, reason: collision with root package name */
        private int f49097g = 1000;

        /* renamed from: h, reason: collision with root package name */
        private int f49098h = 20;

        /* renamed from: i, reason: collision with root package name */
        private boolean f49099i = true;

        public b(RecyclerView recyclerView) {
            this.f49092b = recyclerView;
            this.f49096f = androidx.core.content.d.getColor(recyclerView.getContext(), b.d.f48597y0);
        }

        public b j(RecyclerView.h hVar) {
            this.f49091a = hVar;
            return this;
        }

        public b k(@g0(from = 0, to = 30) int i4) {
            this.f49098h = i4;
            return this;
        }

        public b l(@n int i4) {
            this.f49096f = androidx.core.content.d.getColor(this.f49092b.getContext(), i4);
            return this;
        }

        public b m(int i4) {
            this.f49094d = i4;
            return this;
        }

        public b n(int i4) {
            this.f49097g = i4;
            return this;
        }

        public b o(boolean z4) {
            this.f49099i = z4;
            return this;
        }

        public b p(@j0 int i4) {
            this.f49095e = i4;
            return this;
        }

        public b q(boolean z4) {
            this.f49093c = z4;
            return this;
        }

        public c r() {
            c cVar = new c(this);
            cVar.b();
            return cVar;
        }
    }

    @Override // com.ethanhua.skeleton.g
    public void a() {
        this.f49087a.setAdapter(this.f49088b);
    }

    @Override // com.ethanhua.skeleton.g
    public void b() {
        this.f49087a.setAdapter(this.f49089c);
        if (this.f49087a.isComputingLayout() || !this.f49090d) {
            return;
        }
        this.f49087a.setLayoutFrozen(true);
    }

    private c(b bVar) {
        this.f49087a = bVar.f49092b;
        this.f49088b = bVar.f49091a;
        f fVar = new f();
        this.f49089c = fVar;
        fVar.d(bVar.f49094d);
        fVar.e(bVar.f49095e);
        fVar.i(bVar.f49093c);
        fVar.g(bVar.f49096f);
        fVar.f(bVar.f49098h);
        fVar.h(bVar.f49097g);
        this.f49090d = bVar.f49099i;
    }
}
